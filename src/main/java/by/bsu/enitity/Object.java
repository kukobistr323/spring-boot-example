package by.bsu.enitity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
