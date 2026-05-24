//package br.edu.ifpb.ads.padroes.atv1.service.discos;
//
//import br.edu.ifpb.ads.padroes.atv1.domain.Disco;
//import br.edu.ifpb.ads.padroes.atv1.domain.Interessado;
//import br.edu.ifpb.ads.padroes.atv1.repository.RepositorioDiscos;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GerenciadorDiscos {
//    private RepositorioDiscos repositorio;
//    private List<Interessado> interessados = new ArrayList<>();
//
//    public GerenciadorDiscos(RepositorioDiscos repositorio) {
//        this.repositorio = repositorio;
//    }
//
//    public void addInteressado(Interessado interessado) {
//        interessados.add(interessado);
//    }
//
//    public void removeInteressado(Interessado interessado) {
//        interessados.remove(interessado);
//    }
//
//    public void addDisco(Disco disco) {
//
//        repositorio.addDisco(disco);
//
//        notificarInteressados(disco);
//    }
//
//    private void notificarInteressados(Disco disco) {
//
//        interessados.stream()
//                .filter(i -> i.possuiInteresse(disco))
//                .forEach(i -> i.notificar(disco));
//    }
//}
