package com.directi.training.ocp.exercise_answer;

public class ResourceAllocator
{
    int resourceId;

    public int allocate(Resource resource)
    {
        int resourceId;
        try {
            resourceId = resource.findFreeSlot(); 
            resource.markSlotBusy(resourceId);
            return resourceId;
        }
        finally  {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
            break;
        }
    }
    

    public void free(int resourceId, Resource resource)
    {
        try{         
            resource.markSlotFree(resourceId);
            break;
        }
        finally  {
            System.out.println("ERROR: attempted to free invalid resource");
            break;
        }
    }

}
