package ar.edu.unju.edm.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.CanchaDeFutbol;
import ar.edu.unju.edm.repository.CanchaDeFutbolRepository;
import ar.edu.unju.edm.service.ICanchaDeFutbolService;

@Service
public class ImpCanchaDeFutbolService implements ICanchaDeFutbolService {
	@Autowired
	CanchaDeFutbolRepository canchaDeFutbolRepository;
	
	
	@Override
	public CanchaDeFutbol guardarCancha(CanchaDeFutbol cancha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarCancha(String codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CanchaDeFutbol encontrarCancha(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public CanchaDeFutbol modificarCancha(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
