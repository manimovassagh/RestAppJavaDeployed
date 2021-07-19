package io.mani.restfullapp.home;

/**
 * This class shows different Departments on our website
 * Our website consist of 4 different categories
 * i defined these 4 categories in enum to prevent any mistakes in future.
 *
 * @author Mani Movassagh
 * @version 1.0
 * @see DepartmentCategories
 * @since 2021-07-18
 */
public class Departments {
    /**
     * this is the id of each department
     * the id must normally be UUID type but i used it for simplicity
     */
    private String id;

    private String departmentName;

    private DepartmentCategories departmentCategories;

    private String departmentDescription;

    /**
     * this is our constructor to use in Departments
     *
     * @param id                    it is the id of each department.
     * @param departmentName        this is the name of each department
     * @param departmentCategories  this is a category of each department.
     * @param departmentDescription this is the department description.
     */
    public Departments(String id, String departmentName, DepartmentCategories departmentCategories, String departmentDescription) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentCategories = departmentCategories;
        this.departmentDescription = departmentDescription;
    }

    /**
     * return id with get id method
     *  @return id
     */
    public String getId() {
        return id;
    }

    /**
     * set id with set id method
     * @param id set id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * return department name with getDepartmentName method
     * @return department name
     */

    public String getDepartmentName() {
        return departmentName;
    }


    /**
     * set department Name with setDepartmentName method
     * @param departmentName set department Name
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * return department Categories with getDepartmentCategories method
     * @return department Categories
     */

    public DepartmentCategories getDepartmentCategories() {
        return departmentCategories;
    }

    /**
     * set department Categories with setDepartmentCategories method
     * @param departmentCategories set department Categories
     */
    public void setDepartmentCategories(DepartmentCategories departmentCategories) {
        this.departmentCategories = departmentCategories;
    }

    /**
     * return department Description with getDepartmentDescription method
     * @return department Description
     */

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    /**
     * set department Description with setDepartmentDescription method
     * @param departmentDescription set department Description
     */
    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }
}
