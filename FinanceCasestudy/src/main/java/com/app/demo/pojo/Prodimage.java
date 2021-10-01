package com.app.demo.pojo;

import java.awt.Image;
import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class Prodimage {
	private MultipartFile  prod_img;
	public Prodimage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MultipartFile getProd_img() {
		return prod_img;
	}
	public void setProd_img(MultipartFile prod_img) {
		this.prod_img = prod_img;
	}
	
}
