package DataProvider;

import org.testng.annotations.DataProvider;
public class DPlogin {
    @DataProvider(name = "Login") // To Check User is Able to Login Using Valid Username and Password
    public static Object[][] dataproviderlogin() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994"}
        };
    }

    @DataProvider(name = "Search") //To check the Search Option is Working
    public static Object[][] dataprovidersrch() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }

    //To check whether the user is able to choose a prodcut and Add it to the cart//
    //Check the Used Product is Still Available in Ajio//
    @DataProvider(name = "Choose")
    public static Object[][] dataproviderchoose() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }

    //To check whether the user is able to add multiple items to the cart//
    //Check the Used Products are Still Available in Ajio//
    @DataProvider(name = "Multiproduct")
    public static Object[][] dataproviderMultiproduct() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }

    @DataProvider(name = "Cartnumber") //To check whether the item number shown in Cart is Equal to the number of items added by the User
    public static Object[][] dataproviderCartnumber() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }

    //Change the item Count by deleting one item from the cart and Compare the Order Summery Before and After Deletion//
    @DataProvider(name = "Cartdelete")
    public static Object[][] dataproviderCartdelete() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }

    @DataProvider(name = "ValidCoupen") // To check Whether the user is able to add a valid coupen Succesfully
    public static Object[][] dataproviderValidCoupen() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }

    @DataProvider(name = "InvalidCoupen") //to check whether the Inavalid coupen is not Applicable
    public static Object[][] dataproviderInvalidCoupen() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses", "LUCKY1000"}

        };
    }

    @DataProvider(name = "GetAllCoupen") //Get All the Coupen Available
    public static Object[][] dataproviderGetAllCoupen() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }

    @DataProvider(name = "CoupenComparison") //Compare the Order Summery Before and After Applying Coupen
    public static Object[][] dataproviderCoupenComparison() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }

    @DataProvider(name = "Deletecartitem") //Deleting a Product from cart When there is Multiple Products in the Cart
    public static Object[][] dataproviderDeletecartitem() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses"}

        };
    }
    @DataProvider(name = "AddAddress")// To check whether the User is able to add a new Address
    public static Object[][] dataproviderAddAddress() {
        return new Object[][]{
                {"8848727919", "kadeesa@1994", "Sunglasses","690502","eruva","Bhavanam","BusStand","Alappuzha","Kerala"}

        };
    }

}