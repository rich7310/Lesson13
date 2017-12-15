
public class Task {
    
    private String name;
    private String description;
    
    Task(String nm, String d)
    {
        name = nm;
        description = d;
    }
    
    public boolean validate()
    {
        if(name == null || description == null || name.equals("") || description.equals(""))
            return false;
        else 
            return true;
    }
    
    public String toString()
    {
        return "\nName: "+name+"\nDescription: "+description+"\n~~~~~~~~~~~~\n";
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setName(String nm)
    {
        name = nm;
    }
    
    public void setDescription(String d)
    {
        description = d;
    }
    

}
