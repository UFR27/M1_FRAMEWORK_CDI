package fr.pantheonsorbonne.ufr27.miage.persistance;




public interface Repository<T> {

	public void save(T t);

	public T find(Long id);

}
