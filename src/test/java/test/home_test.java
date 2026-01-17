package test;

import org.testng.annotations.Test;

import base.home_base;

public class home_test extends home_base {

    @Test(priority = 1)
    public void location() {
        rnt.clickloc();
    }

    @Test(priority = 2)
    public void location_select() {
        rnt.select_loc();
    }
    
    @Test(priority = 3)
    public void currentlocation()
    {
    	rnt.currentloc();
    }
    
    @Test(priority = 4 )
    public void clicknext()
    {
    	rnt.next();
    }
    
    @Test(priority = 5)
    public void startdate() throws InterruptedException
    {
    	Thread.sleep(2000);
    	rnt.startingdate();
    }
    
    @Test(priority = 6)
    public void finaldate()
    {
    	rnt.endingdate();
    }
    
    @Test(priority = 7)
    public void done()
    {
    	rnt.clickdone();
    }
    
   
}
