package mybatis.model;

public class Car {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CAR.ID
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CAR.MANUACTURER
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    private String manuacturer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CAR.MODEL
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    private String model;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.CAR.DEALERSHIP_ID
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    private Integer dealershipId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CAR.ID
     *
     * @return the value of PUBLIC.CAR.ID
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CAR.ID
     *
     * @param id the value for PUBLIC.CAR.ID
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CAR.MANUACTURER
     *
     * @return the value of PUBLIC.CAR.MANUACTURER
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    public String getManuacturer() {
        return manuacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CAR.MANUACTURER
     *
     * @param manuacturer the value for PUBLIC.CAR.MANUACTURER
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    public void setManuacturer(String manuacturer) {
        this.manuacturer = manuacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CAR.MODEL
     *
     * @return the value of PUBLIC.CAR.MODEL
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CAR.MODEL
     *
     * @param model the value for PUBLIC.CAR.MODEL
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.CAR.DEALERSHIP_ID
     *
     * @return the value of PUBLIC.CAR.DEALERSHIP_ID
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    public Integer getDealershipId() {
        return dealershipId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.CAR.DEALERSHIP_ID
     *
     * @param dealershipId the value for PUBLIC.CAR.DEALERSHIP_ID
     *
     * @mbg.generated Tue Apr 07 17:43:57 EEST 2020
     */
    public void setDealershipId(Integer dealershipId) {
        this.dealershipId = dealershipId;
    }
}