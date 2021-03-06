package com.github.caarlos0.tests.model;

import com.github.caarlos0.model.Bean;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author: Carlos A Becker
 */
@Entity
public class MyBean extends Bean {

	private static final long serialVersionUID = 1L;

	public String foo, bar;

    @Temporal(value = TemporalType.TIMESTAMP)
    public Date d;

    public MyBean() {
    }

    public MyBean(String bar, Date d, String foo) {
        this.bar = bar;
        this.d = d;
        this.foo = foo;
    }
}
