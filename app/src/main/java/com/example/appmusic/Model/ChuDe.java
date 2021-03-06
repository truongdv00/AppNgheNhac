package com.example.appmusic.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ChuDe implements Serializable {

@SerializedName("IdChude")
@Expose
private String idChude;
@SerializedName("TenChude")
@Expose
private String tenChude;
@SerializedName("HinhChude")
@Expose
private String hinhChude;

public String getIdChude() {
return idChude;
}

public void setIdChude(String idChude) {
this.idChude = idChude;
}

public String getTenChude() {
return tenChude;
}

public void setTenChude(String tenChude) {
this.tenChude = tenChude;
}

public String getHinhChude() {
return hinhChude;
}

public void setHinhChude(String hinhChude) {
this.hinhChude = hinhChude;
}

}