package com.cg.repository;



import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.cg.model.FlightModel;



@SpringBootTest
@ExtendWith(SpringExtension.class)
public class AdminRepositoryTest {



@Autowired
private AdminRepository isRepo;



@Test
public void givenFlightAdminShouldReturnFlightAdminObject()
{
FlightModel l1 = new FlightModel (7, "vasu","phy", null, null); //// Input Given By User.
isRepo.save(l1); // Given Data is Saved in DataBase.
FlightModel l2=isRepo.findById(l1.getFlightId()).get();
assertNotNull(l2); // check for returning Library object.
assertEquals(l1.getFlightDate(), l2.getFlightDate());
}





@Test
public void getAllmustReturnAllLibraryAdmin()
{
FlightModel l3 = new FlightModel(3, "sam","bio", null, null);
FlightModel l4 = new FlightModel(5, "sanju","chme", null, null);
isRepo.save(l3);
isRepo.save(l4);
List<FlightModel>stdList = (List<FlightModel>) isRepo.findAll();
assertEquals(10,stdList.get(1).getFlightId());
//assertEquals(2, stdList.size()); // CHECKING SIZE
}
}