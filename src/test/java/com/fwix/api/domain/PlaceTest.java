package com.fwix.api.domain;

import org.junit.Test;

import java.util.Collection;
import java.util.Collections;

/**
 * @author npeeters
 */
public class PlaceTest {

    @Test
    public void test() {
        Place p = new Place();
        p.setCategories(Collections.singletonList(new Category("id","name")));
    }

}
