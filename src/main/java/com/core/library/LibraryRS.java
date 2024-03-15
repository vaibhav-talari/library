package com.core.library;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/library")
public class LibraryRS {
    @GET
    public String helloWorld(){
      return "hello world";
      }
  }
