package org.example.Books;

import java.util.Objects;

public class Publisher {
    private int id;
    private String publisherName;

    public Publisher(){

    }

    public Publisher(int id, String publisherName){
        super();
        this.id = id;
        this.publisherName = publisherName;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, publisherName);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
            Publisher other = (Publisher) other;
            return Objects.equals(id,other.id) && Objects.equals(publisherName, other.publisherName);

        }
    }



    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}
