/** @author Zahid Hussain Khan
 *  @version 2.0
 *  @since 2015
 **/
package com.sudo;

/**
 *
 * @author zahidkhan
 *
 * Class for Library Book
 */


public class Book
{

    /**
     * @value 10 default value
     */
    static int val=10;


    /**
     * Parametrized Constructor
     * @param s Book Name
     */

    public Book(String s){
    }

    /**
     * Issue a book
     * @param roll Roll number of a student
     * @throws Exception throws exception if book is not available
     */
    public void issue(int roll) throws Exception{
    }

    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get Book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){
        return "";
    }
}
