//632115006 Kantaporn Sriwichai
//LAB 7.1

public class NerfGun {
  private int shoot;
  private int re_load;
  private int num_bullet;
  private int gunID = 1;

  private int count;

  public NerfGun() {
  }

  public NerfGun(int i_reload) {
    gunID++;

    if(i_reload == 15) {
      re_load =15;
    }
  }

  public int setfire() {
    return shoot;
  }

  public int set_re_load() {
    return re_load;
  }

  public int set_num_bullet() {
    return num_bullet;
  }

  public int gunID() {
    return gunID;
  }

  //assign 
  public void fire() {
    if (re_load == 0) {
      System.out.println("There is no ammuition");
    } if (re_load > 0 ) {
      System.out.println("Bang !!!");
      count = count +1;
    }
  }

  public void displayGunID() {
    System.out.println("The ID of this gun is "+ gunID);
  }

  public void reload(int num_reload) {
    re_load = 15;
    
    if (num_reload == 2) {
      if (count <2) {
        re_load = re_load-count;
      } 
      if(re_load ==14) {
        System.out.println("Error!! the amnuition is overload");
      }
      re_load = re_load+count;
    }
  }

  public void displayNumOfAmmunition() {
    
    //System.out.println( set_re_load() - count + " bullet left");
    if (count <2) {
      System.out.println( set_re_load() - count +" bullet left");
    } else {
      System.out.println( set_re_load() - count + " bullet left");
    }
  }
}
