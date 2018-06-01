// This is the FacebookPerson_Graphics class
// Dr. Xiaolin Hu
// 03/05/2015
package Facebook;

public class FacebookPerson{

  private String myName;
  protected String myMood;
  protected Facebook myfacebook;

  public FacebookPerson(String name, DrawingPanel box, int column, int row){
      myName = name;
      myfacebook = new Facebook(myName, box, column, row);
      //System.out.println("FacebookPerson_Graphics's constructor");
  }
  
  public String getName(){
      return myName;
  }

  public void setMood(String newMood){
     myMood = newMood;
     myfacebook.setContent(myMood);
  }
  
  public void removeFacebookPerson() {
     myfacebook.removeContent();
	}
  
  }

