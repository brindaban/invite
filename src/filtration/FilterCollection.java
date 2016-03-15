package filtration;

import personEntities.Guest;

import java.util.List;

public class FilterCollection {
    private List<Filter> allFilters;

    public FilterCollection(List<Filter> allFilters) {
        this.allFilters = allFilters;
    }
    public boolean isAllowed(Guest guest){
        for (Filter eachFilter:allFilters)
            if(!guest.isValid(eachFilter))
                return false;
        return true;
    }

}
