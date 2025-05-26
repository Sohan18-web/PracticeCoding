package SingleThread; // Package declaration

// Class name should follow naming conventions (start with uppercase letter)
public class ThreadSingle {

    public static void main(String[] args) {
        // Get a reference to the current thread (main thread)
        Thread t = Thread.currentThread();

        // Set a custom name for the thread
        t.setName("My Main Thread");

        // Set a custom priority for the thread (valid range: 1 to 10)
        t.setPriority(7);

        // Print full thread information: name, priority, and thread group
        System.out.println(t); // Output: Thread[My Main Thread,7,main]

        // Print the thread's name
        System.out.println(t.getName()); // Output: My Main Thread

        // Print the thread's priority
        System.out.println(t.getPriority()); // Output: 7
    }
}
