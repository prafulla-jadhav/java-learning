package com.example.customer_care.services;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.customer_care.entity.CustomerComplaint;
import com.example.customer_care.exceptions.NewResourceNotAllowedInPutException;
import com.example.customer_care.repo.CustomerCareRepository;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit4.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class CustomerCareServiceTest {
    @Mock
    private CustomerCareRepository repository;


    private CustomerCareService subject;

    @Before
    public void setup() {
        initMocks(this);
        subject = new CustomerCareServiceImpl(repository);
    }

    @Test
    public void testShouldCreateComplete() {
        //Arrange
        CustomerComplaint complaint = new CustomerComplaint();
        complaint.setFirstName("Pramod");
        complaint.setLastName("Nikam");
        complaint.setAgentId(1);
        complaint.setComplaintMessage("TDD is Top down or Bottom Up?");

        when(repository.save(any(CustomerComplaint.class))).thenReturn(complaint);


        //Act
        CustomerComplaint returnedComplaint = subject.create(complaint);

        //Assert
        verify(repository).save(complaint);
        Assert.assertEquals("Pramod", returnedComplaint.getFirstName());
        Assert.assertNotNull(returnedComplaint.getId());

    }


    @Test
    public void testShouldListAllCompaints() {
        //Arrange
        List<CustomerComplaint> complaints = new ArrayList<>();

        when(repository.findAll()).thenReturn(complaints);

        //Act
        List<CustomerComplaint> returnedComplaints = subject.getAll();

        //Assert
        verify(repository).findAll();
        Assert.assertNotNull(returnedComplaints);
        Assert.assertTrue(returnedComplaints.size() >= 0);

    }


    @Test
    public void testShouldGetSpecificComplaint() {
        //Arrange
        String complaintId = UUID.randomUUID().toString();
        CustomerComplaint complaint = new CustomerComplaint();
        complaint.setId(complaintId);

        when(repository.findOne(any(String.class))).thenReturn(complaint);

        //Act
        CustomerComplaint returnedComplaint = subject.getById(complaintId);

        //Assert
        verify(repository).findOne(complaintId);
        Assert.assertNotNull(returnedComplaint);
        Assert.assertEquals(complaintId,returnedComplaint.getId());

    }


    @Test
    public void testShouldGetNoResultOnInvalidComplaintId() {
        //Arrange
        String complaintId = "-1";
        CustomerComplaint complaint = new CustomerComplaint();
        complaint.setId(complaintId);

        when(repository.findOne(any(String.class))).thenReturn(null);

        //Act
        CustomerComplaint returnedComplaint = subject.getById(complaintId);

        //Assert
        verify(repository).findOne(complaintId);
        Assert.assertNull(returnedComplaint);


    }

    //@Test
    public void testShouldRemoveSpecificComplaint() {
        //Arrange
        String complaintId = UUID.randomUUID().toString();
        CustomerComplaint complaint = new CustomerComplaint();
        complaint.setId(complaintId);

        when(repository.findOne(any(String.class))).thenReturn(complaint);
        doNothing().when(repository).delete(any(String.class));
        when(repository.findOne(any(String.class))).thenReturn(null);

        //Act
        Boolean status = subject.delete(complaintId);

        //Assert
       verify(repository,Mockito.atLeast(1)).findOne(complaintId);
        verify(repository).delete(complaintId);


        Assert.assertNotNull(status);
        Assert.assertTrue(status);

    }

    @Test
    public void testShouldNotRemoveInvalidComplaint() {
        //Arrange
        String complaintId = UUID.randomUUID().toString();
        CustomerComplaint complaint = new CustomerComplaint();
        complaint.setId(complaintId);

        when(repository.findOne(any(String.class))).thenReturn(null);


        //Act
        Boolean status = subject.delete(complaintId);

        //Assert
        verify(repository).findOne(complaintId);


        Assert.assertNotNull(status);
        Assert.assertFalse(status);

    }

    @Test
    public void testShouldUpdateEntireComplaint() throws  NewResourceNotAllowedInPutException{
        String complaintId =  UUID.randomUUID().toString();
        //Arrange
        CustomerComplaint complaint = new CustomerComplaint();
        complaint.setId(complaintId);
        complaint.setFirstName("Pramod");
        complaint.setLastName("Nikam");
        complaint.setAgentId(1);
        complaint.setComplaintMessage("TDD is Top down or Bottom Up?");

        when(repository.findOne(any(String.class))).thenReturn(complaint);
        when(repository.save(any(CustomerComplaint.class))).thenReturn(complaint);


        //Act
        CustomerComplaint returnedComplaint = subject.updateWhole(complaint);

        //Assert
        verify(repository).findOne(complaintId);
        verify(repository).save(complaint);
        Assert.assertEquals("Pramod", returnedComplaint.getFirstName());
        Assert.assertNotNull(returnedComplaint.getId());

    }


    @Test(expected = NewResourceNotAllowedInPutException.class)
    public void testShouldCheckExistingResourceInPut() throws NewResourceNotAllowedInPutException{
        String complaintId =  UUID.randomUUID().toString();
        //Arrange
        CustomerComplaint complaint = new CustomerComplaint();
        complaint.setId(complaintId);
        complaint.setFirstName("Pramod");
        complaint.setLastName("Nikam");
        complaint.setAgentId(1);
        complaint.setComplaintMessage("TDD is Top down or Bottom Up?");

        when(repository.findOne(any(String.class))).thenReturn(null);

        //when(repository.save(any(CustomerComplaint.class))).thenReturn(complaint);


        //Act
        CustomerComplaint returnedComplaint = subject.updateWhole(complaint);

        //Assert
        //verify(repository).save(complaint);


    }



}
