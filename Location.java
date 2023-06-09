public class Location
{
    
    //Implement the Location class here
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    private int status;
    private boolean ship;
    // Location constructor. 
    public Location()
    {
        setStatus(0);
        setShip(false);
    }
    
    // Was this Location a hit?
    public boolean checkHit()
    {
        if(getStatus() == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // Was this location a miss?
    public boolean checkMiss()
    {
        if(getStatus() == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // Was this location unguessed?
    public boolean isUnguessed()
    {
        if(getStatus() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // Mark this location a hit.
    public void markHit()
    {
        setStatus(1);
    }
    
    // Mark this location a miss.
    public void markMiss()
    {
        setStatus(2);
    }
 
    // Return whether or not this location has a ship.
    public boolean hasShip()
    {
        if(ship)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // Set the value of whether this location has a ship.
    public void setShip(boolean val)
    {
        if(val)
        {
            ship = true;
        }
        else
        {
            ship = false;
        }
    }
    
    // Set the status of this Location.
    public void setStatus(int status)
    {
        this.status = status;
    }
    // Get the status of this Location.
    public int getStatus()
    {
        return status;
    }
}
