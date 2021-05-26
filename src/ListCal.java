public class ListCal {
    private Node first;
    public static int counter;

    public ListCal() {
    }

    private boolean isEmpty() {
        return this.first == null;
    }

    public int getNbElements() {
        int nombreElements = 0;
        for ( Node noeud = first; noeud != null; noeud = noeud.getNext() ) {
            nombreElements = nombreElements + 1;
        }
        return nombreElements;
    }

    private Node getNodeAt(int position) throws IllegalArgumentException {
        Node courant = first;
        if (first != null) {
            for( int i = 0; i < getNbElements(); i++ ) {
                if (i == position) {
                    break;
                }
                courant = courant.getNext();
            }
        }
        return courant;
    }

    private Node getLastElements() {
        return  getNodeAt(getNbElements() - 1);
    }

    public void insertLastElement(Object o) throws IllegalArgumentException {
        if (o == null) {
            throw new IllegalArgumentException("Impossible de faire cet ajout");
        } else {
            if (isEmpty()) {
                first = new Node (o, null);
            } else {
                Node last = getLastElements();
                last.setNext(new Node(o, null));
            }
        }
    }

    public void insertFirstElement(Object o) throws IllegalArgumentException {
        if (o == null) {
            throw new IllegalArgumentException("Impossible");
        } else {
            if (isEmpty()) {
                first = new Node(o, null);
            } else {
                first = new Node(0, first);
            }
            return;
        }
    }

    public void insertElementAt(Object o, int position) throws IllegalArgumentException {
        if (o == null) {
            throw  new IllegalArgumentException();
        } else {
            if (position >= 0 && position <= getNbElements()) {
                if ( position == 0 ) {
                    first = new Node(o, first);
                } else {
                    Node courant = getNodeAt(position);
                    Node precedent = getNodeAt(position - 1);
                    precedent.setNext(new Node(o, courant));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public Object getElementAt(int position) throws IllegalArgumentException {
        if (position >= 0 && position < getNbElements()) {
            counter = 0;
            Node courant = first;
            while (first != null && counter < position) {
                courant = courant.getNext();
                counter++;
            }
            return courant.getNext();
        } else {
            throw new IllegalArgumentException("Position invalide");
        }
    }



}
