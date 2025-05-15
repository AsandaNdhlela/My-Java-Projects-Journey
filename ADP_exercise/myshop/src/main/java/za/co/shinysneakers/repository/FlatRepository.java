package za.co.shinysneakers.repository;
import za.co.shinysneakers.domain.Flat;
import java.util.List;

public interface FlatRepository {

    public Flat create(Flat flat);

    public Flat read(Long id);

    public Flat update(Flat flat);

    public boolean delete(Long id);

    public List<Flat> getAll();


}
