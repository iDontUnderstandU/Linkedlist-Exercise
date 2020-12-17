public class Website{
   String domain;
   String link;
   Website next;
   
   public Website(String domain, String link){
      this.domain = domain;
      this.link = link;
      this.next = null;
   }
}