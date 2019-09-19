package com.productcateg.Security;

public interface SecurityParms {
	public static final String JWT_HEADER_Name="Authorization";
	  public static final String SECRET="yamen";
	  public static final long EXPIRATION=10*24*3600*1000;
	  public static final String HEADER_PREFIX="Bearer ";

}
