package Animais;

public class Animal {
 public double peso;
 public String especie;
 private int idade;
public Animal(double peso, String especie, int idade) {
	setPeso(peso);setEspecie(especie); setIdade(idade);
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public String getEspecie() {
	return especie;
}
public void setEspecie(String epecie) {
	this.especie = epecie;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Animal [peso=");
	builder.append(peso);
	builder.append(", especie=");
	builder.append(especie);
	builder.append(", idade=");
	builder.append(idade);
	builder.append("]");
	return builder.toString();
}


 
}
