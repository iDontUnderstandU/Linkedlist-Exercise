public class Linkedlist {
   private Website head;
   
   private Website newWebsite(String domain, String link){
      return new Website(domain, link);
   }

   public void addLast(String domain, String link){
      Website web1 = newWebsite(domain, link);
      
      if(head == null){
         head = web1;
      }
      else{
         Website temp = head;
         while(temp.next != null){
            temp = temp.next;
         }
         temp.next = web1;
      }
      
   }
   
   public void prevWebsite(){
      Website temp = head; 
      
      if(temp == null ){
         System.out.println("You were at your first and last visited website");
      }   
      else{
         if(temp.next == null){
         System.out.println();}
         else{
            while(temp.next.next != null){
               temp = temp.next;}
         }
         System.out.print("Previous site visited: " + temp.domain + " --> " + temp.link);
      }
      
   }
   
   public void displayList(){
      Website temp = head;
      int len = 0;
      if(temp == null ){
         System.out.println("There was no visited website");
      }   

      while(temp != null){
         len++;
         System.out.println(len + " " + temp.domain + " --> " + temp.link);
         temp = temp.next;
      }

   }
   
   public int getLength(){
      int len = 0;
      Website temp = head;
      
      while(temp != null){
         len++;
         temp = temp.next;
      }
      
      return len;
   }
   
   public void displayCurrent(){
      Website temp = head;
      if(temp == null){
         System.out.println("There is no current website visited");
      }
      else{
         while(temp.next != null){
         temp = temp.next;}
         
         System.out.println("Current Site visited: " + temp.domain + " --> " + temp.link);
      }
      
   }
}