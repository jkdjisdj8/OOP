public class linkedListMusicPlaylist {

    static class Node {
        String songTitle;
        Node next;

        public Node(String songTitle) {
            this.songTitle = songTitle;
            this.next = null;
        }
    }

    public static Node head;

    public static void show(){
        System.out.println("Playlist: ");
        Node current = head; 

        if (current == null) {
            System.out.println("The playlist is empty.");
            return;
        }

        while(current != null){
            System.out.println(current.songTitle);
        if (current.next != null){
            System.out.print(" -> ");
        }
        current = current.next;
        }
        System.out.println(" -> null");

    }

    public static void addSongAtEnd(String songTitle){
        Node newNode = new Node(songTitle);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void deleteSongByTitle (String songTitle) {
        if (head == null) {
            System.out.println("The playlist is empty. Cannot delete " + songTitle);
            return;
        }

        if(head.songTitle.equals(songTitle)){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next.songTitle.equals(songTitle)){
            if (current.next.songTitle.equals(songTitle)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

        System.out.println("Song " + songTitle + " not found in the playlist.");

    }

    public static void main(String[] args) {
        System.out.println("Music Playlist Linked List Demo");

        System.out.println("Creating playlist with Song A, Song B, Song C");    
        head = new Node("Song A");
        head.next = new Node("Song B");
        head.next.next = new Node("Song C");

        System.out.println("Initial Playlist:");
        show();
        System.out.println();

        System.out.println("Adding Song D at the end:");
        addSongAtEnd("Song D");
        show();
        System.out.println();

        System.out.println("Deleting Song B:");
        deleteSongByTitle("Song B");
        show();
        System.out.println();



    }
}

