package com.cg.service;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.model.FlightModel;
import com.cg.repository.AdminRepository;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class FlightServiceTest {




@Mock
private AdminRepository pr;



@InjectMocks //used in implementation layer
private FlightServiceImp asl;



@Test
public void TestAddFlight() 
{
FlightModel p1=new FlightModel(10,"indigo","magical", null, null); // user input
when(pr.save(any())).thenReturn(p1); //save any object to repository
asl.addFlightDetails(p1); //data saved in database
verify(pr,times(1)).save(any()); //calling any method once
}




@Test
public void testGetAllFlight()
{
FlightModel p1=new FlightModel(10,"Sanjeev","magical", null, null); // user input
FlightModel p2=new FlightModel(18,"Virat","networking", null, null); //user input
FlightModel p3=new FlightModel(45,"Rohit","Art", null, null); //user input
pr.save(p1); //data saved to database
pr.save(p2); //data saved to database
pr.save(p3); //data saved to database




List<FlightModel> plist=new ArrayList<>(); // crating list object
plist.add(p1);
plist.add(p2);
plist.add(p3);




when(pr.findAll()).thenReturn(plist); // return student list
List<FlightModel> plist1 = asl.getallFlightDetails();
assertEquals(plist, plist1); //checking both objects are equal
verify(pr,times(1)).save(p1);
verify(pr,times(1)).findAll();




}
}