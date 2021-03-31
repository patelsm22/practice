package implementation;

public class hashtable_implementation {



        String[] hashArray;
        int arraySize;
        int size =0; //counter for #of elements in the hash table

        public hashtable_implementation(int noOfSlots){


            if(isPrime(noOfSlots)){
                hashArray= new String[noOfSlots];
                arraySize=noOfSlots;
            }
            else{
                int primeCount = getNextPrime(noOfSlots);
                hashArray=new String[primeCount];
                arraySize=primeCount;

                System.out.println("This is not a prime number");
                System.out.println("It is now changed to " + primeCount);
            }

        }

        private boolean isPrime(int num){
            if (num%2==0){
                return false;
            }
            else{
                return true;
            }
        }

        private int getNextPrime(int minNumber){
            for(int i=minNumber;true;i++){
                if(isPrime(i)){
                    return i;
                }
            }
        }
        //prefered index position
        private int hashFunc1(String word){
            int hashVal = word.hashCode();
            hashVal = hashVal % arraySize;
            if(hashVal < 0) {
                hashVal += arraySize;
            }

            return hashVal;
        }

        //return step size greater than zero
        private int hashFunc2(String word){
            int hashVal = word.hashCode();
            hashVal = hashVal % arraySize;
            if(hashVal < 0) {
                hashVal += arraySize;
            }
            return 3 - hashVal % 3;
        }

        public void insert(String word) {

            int hashVal = hashFunc1(word);
            int stepSize = hashFunc2(word);

            while (hashArray[hashVal] != null){

                hashVal=hashVal + stepSize;
                hashVal=hashVal%arraySize;

            }

            hashArray[hashVal]=word;
            System.out.println("inserted word:" + word);
            size++;

        }


        public String find(String word) {

            int hashVal = hashFunc1(word);
            int stepSize = hashFunc2(word);

            while (hashArray[hashVal] != null){
                if(hashArray[hashVal].equals(word)){
                    return hashArray[hashVal];
                }

                hashVal=hashVal + stepSize;
                hashVal=hashVal%arraySize;

            }

            return hashArray[hashVal];



        }



    }


