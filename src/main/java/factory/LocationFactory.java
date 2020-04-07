package factory;

import company.ac.za.studentbookstore.domain.Location;

public class LocationFactory
{
    public static Location getLocation(String id,String title,String longitude,String latitude,String description)
    {
        return new Location.Builder()
                .Id(id)
                .Title(title)
                .Longitude(longitude)
                .Latitude(latitude)
                .Description(description)
                .build();
    }
}
