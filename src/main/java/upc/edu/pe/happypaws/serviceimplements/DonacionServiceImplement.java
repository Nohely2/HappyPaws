package upc.edu.pe.happypaws.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.happypaws.entities.Donacion;
import upc.edu.pe.happypaws.repositories.IDonacionRepository;
import upc.edu.pe.happypaws.serviceinterfaces.IDonacionService;

import java.util.List;

@Service
public class DonacionServiceImplement implements IDonacionService {
    @Autowired
    private IDonacionRepository donacionRepository;


    @Override
    public List<Donacion> list() {
        return donacionRepository.findAll();
    }

    @Override
    public void insert(Donacion donacion) {
        donacionRepository.save(donacion);
    }

    @Override
    public void update(Donacion donacion) {
        donacionRepository.save(donacion);
    }

    @Override
    public void delete(int donacionId) {
        donacionRepository.deleteById(donacionId);
    }

    @Override
    public List<Donacion> findusuario(int id) {
        return donacionRepository.findusuario(id);
    }

    @Override
    public List<Donacion> findmontos() {
        return donacionRepository.findmontos();
    }

    @Override
    public List<String[]> donacionesxnombre() {
        return donacionRepository.donacionesxnombre();
    }
}
