package com.example.android.hipstapragueguide;

public class Places {

    // String resource ID for the title of the place
    private int mTitleId;

    // String resource ID for the description of the place
    private int mDescriptionId;

    // String resource ID for the address of the place
    private int mAddressId = NO_ADDRESS;

    /**
     * Constant value that represents no address was provided for this place
     */
    private static final int NO_ADDRESS = -1;

    /**
     * Image resource ID for the photo of the place
     */
    private int mImageResourceId;

    /**
     * Create a new Places object for Coffee, Eating, Night - address included.
     *
     * @param titleId         is the string resource ID for the title of the place
     * @param descriptionId   is the string resource Id for the description of the place
     * @param addressId       is the string resource Id for the description of the place
     * @param imageResourceId is the image resource Id for the photo of the place
     */
    public Places(int titleId, int descriptionId, int addressId, int imageResourceId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
        mAddressId = addressId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Places object for Activities - withouth address.
     *
     * @param titleId         is the string resource ID for the title of the place
     * @param descriptionId   is the string resource Id for the description of the place
     * @param imageResourceId is the image resource Id for the photo of the place
     */
    public Places(int titleId, int descriptionId, int imageResourceId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the the title of the place.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for description of the place.
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Get the string resource ID for address of the place.
     */
    public int getAddressId() {
        return mAddressId;
    }

    /**
     * Returns whether or not there is an address for this word.
     */
    public boolean hasAddress() {
        return mAddressId != NO_ADDRESS;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
