package lista;

public class NodeString {

        private String element;
        private NodeString next;

        public NodeString(String element) {
            this.element = element;
            this.next = null;
        }

        public String getElement() {
            return element;
        }

        public void setElement(String element) {
            this.element = element;
        }

        public NodeString getNext() {
            return next;
        }

        public void setNext(NodeString next) {
            this.next = next;
        }



}

