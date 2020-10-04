package practica0;

public class ClaseCoche {
	
		private double Velocidad; // Velocidad en pixels/segundo
		 protected double DireccionActual; // Dirección en la que estoy mirando en grados (de 0 a 360)
		 protected double posX; // Posición en X (horizontal)
		 protected double posY; // Posición en Y (vertical)
		 private String piloto; // Nombre de piloto
		 
		 public ClaseCoche() {
			 this.Velocidad = 0;
			 this.DireccionActual = 0;
			 this.posX = 0;
			 this.posY = 0;
			 this.piloto = null;
		 }
		 
		 
		 public double getVelocidad() {
			 return Velocidad;
		 }
		 
		 public void setVelocidad(double nVelocidad) {
			this.Velocidad = nVelocidad;
		 }
		 public double getDireccionActual() {
			return DireccionActual;
		 }
		 public void setDireccionActual(double nDireccionActual) {
		 	this.DireccionActual = nDireccionActual;
		 }
		 public double getPosX() {
			return posX;
	 	 }
		 public void setPosX(double nPosX) {
			this.posX = nPosX;
		 }
		 public double getPosY() {
			return posY;
		 }
		 public void setPosY(double nPosY) {
		 	this.posY = nPosY;
		 }
		 public String getPiloto() {
			return piloto;
		 }
		 public void setPiloto(String nPiloto) {
			this.piloto = nPiloto;
		 }
		
		 @Override
		 public String toString() {
			
		 	return "Piloto: " + piloto + ", Posicion:" + posX +", "+ posY + ",  Direccion:" +DireccionActual+ ",  Velocidad:" + Velocidad ;
		 }
		
		 /** Metodo para alterar la velocidad del coche
		 * @param aceleracion Incremento de la velocidad en pixels/segundo
		 */
		 public void acelera( double aceleracion ) {
			 Velocidad = Velocidad + aceleracion;
		 }
		 /** Metodo para girar el coche
		  * @param giro Angulo que se desea girar el coche
		  */
		  public void gira( double giro ) {
			   	 DireccionActual = DireccionActual + giro;

		  }
		  /** Metodo para mover el coche
		   * @param tiempoDeMovimiento Tiempo transcurrido, en segundos
		   */
		   public void mueve() {
		 	   posX = posX + (Velocidad * Math.cos(DireccionActual));
			   posY = posY + (Velocidad * Math.sin(DireccionActual));		  
			  
		  }

}
