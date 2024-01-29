package com.chaitanya.guestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
//@Api(value="guests", description = "Data service operations on guests", tags=("guests"))
public class GuestController {
	//@Autowired
	private final GuestRepository repository;
	
	public GuestController(GuestRepository repository) {
		super();
		this.repository = repository;
	}
	

	@RequestMapping(method= RequestMethod.GET)
    //@ApiOperation(value="Get All Guests", notes="Gets all guests in the system", nickname="getGuests")
	public Iterable<Guest> getAllGuests(){
		return this.repository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Guest getGuest(@PathVariable("id")long id) {
		return this.repository.findById(id).get();
	}	
}
