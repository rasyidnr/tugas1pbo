public class Pegawai { 
     private String name; 
     private String address; 
     private int number; 
  
     public Pegawai(String name, String address, int number) { 
         System.out.println("Menyusun Pegawai "); 
         this.name = name; 
         this.address = address; 
         this.number = number; 

     } 
 
     public void mailCheck() { 
         System.out.println("Memeriksa surat untuk " + this.name + "" + this.address); 
     } 

     public String toString() { 
         return name + "" + address + "" + number; 

     } 

     public String getName() { 
         return name; 
     } 

     public String getAddress() { 
         return address; 
     } 

     public void setAddress(String newAddress) { 
         address = newAddress; 
     } 

     public int getNumber() { 
         return number; 
     } 
 }
//Downcasting terjadi karena constructor superclass(parent) memiliki string yang menjadi referensi bagi subclass(child) gaji

