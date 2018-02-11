package exploretale.android.exploretale.com.exploretale.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by IanBlanco on 08/02/2018.
 */
@Data
public class Events implements Serializable {

    public Events(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("date")
    @Expose
    private String date;

}
