package HashMap;

public class HashMap04 {
    // HashMap can not do synchronization
    /*
    1) HashMap is not "Thread Safe" and is not "Synchronized", cannot multi-task it will not work.
    2) Learn and explain HashMap mechanism.
        i. when you use HashMap Java gives you 16 "Buckets" (starting index = 0, last idx = 15)
        ii. Java uses linkedList Structure inside "Buckets" when multiple data are put inside "Bucket".
        iii. Java creates HashCode (number) for the key and divides it by 16 (16 buckets) and the remainder is the index of the "Bucket"
        **See HashMapBuckets.png in notes for clear picture**
        iv. Java puts the entry into the bucket who's index is found in "iii" - remainder.
        v. If Java needs to put multiple entries into a Bucket, Java uses linked lists structure inside of the Bucket.
        vi. If 75% of the existing Bucket is full Java creates 16 new Buckets
        vii. To find an entry inside a bucket the following steps occur:
        - Bucket => HashCode => Key => then return value.
     */
}
