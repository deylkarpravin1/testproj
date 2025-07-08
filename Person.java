package com.test.java8.test;

public class Person {
    private String name;
    private String addr;
    private int mobile;

    private Person(PersonBuilder p)
    {
        this.name = p.name;
        this.addr = p.addr;
        this.mobile = p.mobile;
    }

    public static class PersonBuilder
    {
        private String name;
        private String addr;
        private int mobile;

        public PersonBuilder setName(String name)
        {
            this.name = name;
            return this;
        }
        public PersonBuilder setAddr(String addr)
        {
            this.addr = addr;
            return this;
        }
        public PersonBuilder setMobile(int mobile)
        {
            this.mobile = mobile;
            return this;
        }

        public Person build()
        {
            return new Person(this);
        }
    }
}
