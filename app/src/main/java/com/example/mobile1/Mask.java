package com.example.mobile1;

import android.os.Parcel;
import android.os.Parcelable;

public class Mask implements Parcelable {

    private int ID;
    private String Name_of_MI;
    private String Manufacturers;
    private String Manufacturer_country;
    private int Price_MI;
    private String Image;

    protected Mask(Parcel in) {
        ID=in.readInt();
        Name_of_MI=in.readString();
        Manufacturers=in.readString();
        Manufacturer_country=in.readString();
        Price_MI=in.readInt();
        Image=in.readString();
    }

    public Mask(int ID, String name_of_MI, String manufacturers, String manufacturer_country, int price_MI, String image )
    {
        this.ID=ID;
        this.Name_of_MI=name_of_MI;
        this.Manufacturers=manufacturers;
        this.Manufacturer_country=manufacturer_country;
        this.Price_MI=price_MI;
        this.Image=image;
    }

    public static final Creator<Mask> CREATOR = new Creator<Mask>() {
        @Override
        public Mask createFromParcel(Parcel in) {
            return new Mask(in);
        }

        @Override
        public Mask[] newArray(int size) {
            return new Mask[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ID);
        dest.writeString(Name_of_MI);
        dest.writeString(Manufacturers);
        dest.writeString(Manufacturer_country);
        dest.writeInt(Price_MI);
        dest.writeString(Image);
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName_of_MI(String name_of_MI) {
        Name_of_MI = name_of_MI;
    }

    public void setManufacturers(String manufacturers) {
        Manufacturers = manufacturers;
    }

    public void setManufacturer_country(String manufacturer_country) {
        Manufacturer_country = manufacturer_country;
    }

    public void setPrice_MI(int price_MI) {
        Price_MI = price_MI;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getName_of_MI() {
        return Name_of_MI;
    }

    public String getManufacturers() {
        return Manufacturers;
    }

    public String getManufacturer_country() {
        return Manufacturer_country;
    }

    public int getPrice_MI() {
        return Price_MI;
    }

    public String getImage() {
        return Image;
    }
}
