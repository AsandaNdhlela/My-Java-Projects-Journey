package za.co.shinysneakers.repository;
import za.co.shinysneakers.domain.House;
import java.util.List;

public interface HouseRepository {

    public House create(House house);

    public House read(Long id);

    public House update(House house);

    public boolean delete(Long id);

    public List<House> getAll();
}
