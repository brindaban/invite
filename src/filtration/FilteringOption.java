package filtration;

import filtration.age.FilteredByAge;
import filtration.age.OldarThanAge;
import filtration.country.FromCountry;
import filtration.country.FilteredByCountry;

public enum FilteringOption {
    COUNTRY(){
        public Filter getFilter(String givenCountry){
            return new FilteredByCountry(new FromCountry(givenCountry));
        }
    },
    AGEABOVE(){
        public Filter getFilter(String givenAge){
            return new FilteredByAge(new OldarThanAge(Integer.parseInt(givenAge)));
        }
    };


    public abstract Filter getFilter(String filtrationData);


}
