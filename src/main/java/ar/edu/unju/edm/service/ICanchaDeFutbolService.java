package ar.edu.unju.edm.service;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.CanchaDeFutbol;

@Service
public interface ICanchaDeFutbolService {
	public CanchaDeFutbol modificarCancha(String codigo);
	public CanchaDeFutbol guardarCancha(CanchaDeFutbol cancha);
	public void eliminarCancha(String codigo);
	public CanchaDeFutbol encontrarCancha(String codigo);
}
