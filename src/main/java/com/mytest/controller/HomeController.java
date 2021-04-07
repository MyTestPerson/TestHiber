package com.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//    @Autowired
//    ServiceJpa userEntityRepository;

    @GetMapping(value = "/")
    public String home () {


//        List<Address> userActivationsEntities = new ArrayList<>();
//
//        userEntityRepository.findAllActive().forEach(userActivationsEntities::add);
//
//        Iterable<Address> entities = userActivationsEntities.stream().filter(userActivationsEntity ->
//                Instant.now().isAfter(userActivationsEntity.getUserDeletionDate())).collect(Collectors.toList());



////        List<Address> userActivationsEntities = new ArrayList<>();
//
//        userEntityRepository.findAllActive().forEach(userActivationsEntity -> {
//
//            Instant date1 = Instant.now();
//            Instant date2 = userActivationsEntity.getUserDeletionDate();
//
//            System.out.println(Instant.now());
//
//            if(date1.isAfter(date2)) {
//                System.out.println("TRUE date1 больше date2");
//            } else {
//                System.out.println("FALSE date1 меньше date2");
//            }

//            List<Address> userActivationsEntities = new ArrayList<>();
//
//
//            userActivationsEntities.add(userActivationsEntity);
//
//            Stream<Address> stream = userActivationsEntities.stream();
//            stream.filter(Address::isActive);
//
//        });

        return "/home";

    }

}