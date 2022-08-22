package Chapter6;

class Basket<E> {
	  private E elem;

	  public Basket(E e) {
	    elem = e;
	  }

	  public void replace(E e) {
	    elem = e;
	  }

	  public E get() {
	    return elem;
	  }
	}

class Apple {
	  private String name;

	  public Apple(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return name;
	  }
	}
