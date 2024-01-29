//package basic_part_one;
//
//import java.util.Scanner;
//
//public class Compute_Dist_Between_Two_Point_On_The_Surface_Of_Earth {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 Scanner sc = new Scanner(System.in);
//		  System.out.println("input the latitude of co-ordinate 1");
//		  double lat1 = sc.nextDouble();
//		  System.out.println("input the longitude of co-ordinate 1");
//		  double lon1 = sc.nextDouble();
//		  System.out.println("input the latitude of co-ordinate 2");
//		  double lat2 = sc.nextDouble();
//		  System.out.println("input the logitude of co-ordinate 2");
//		  double lon2 = sc.nextDouble();
//		  
//		    lat1 = Math.toRadians(lat1);
//	        lon1 = Math.toRadians(lon1);
//	        lat2 = Math.toRadians(lat2);
//	        lon2 = Math.toRadians(lon2);
//
//System.out.println(""+lat1+""+lon1+""+lat2+""+lon2);
//double earthradius = 6371.01;
//return earthradius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
//		
//
//	}
//
//}
