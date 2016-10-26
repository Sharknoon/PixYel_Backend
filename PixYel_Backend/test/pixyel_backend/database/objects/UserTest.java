/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pixyel_backend.database.objects;

import java.sql.Timestamp;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import pixyel_backend.connection.encryption.Encryption;
import pixyel_backend.database.exceptions.UserCreationException;
import pixyel_backend.database.exceptions.UserNotFoundException;

/**
 *
 * @author i01frajos445
 */
public class UserTest {

    public User testuser;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    public UserTest() {
        try {
            this.testuser = User.addNewUser(System.currentTimeMillis()+"");
        } catch (UserCreationException ex) {
            System.err.println("Could not create testuser");
        }
    }

    /**
     * Test of addNewUser method, of class User.
     */
    @Test
    public void testAddNewUser() throws UserCreationException {
        thrown.expect(UserCreationException.class);
        User.addNewUser(testuser.getStoreID());
    }

    /**
     * Test of getUser method, of class User.
     */
    @Test
    public void testGetUser_int() throws Exception {
        int id = testuser.getID();
        String storeid = testuser.getStoreID();
        assertEquals(storeid, User.getUser(id).getStoreID());
    }

    /**
     * Test of getUser method, of class User.
     */
    @Test
    public void testGetUser_String() throws Exception {
        String storeid = testuser.getStoreID();
        assertEquals(storeid, User.getUser(storeid).getStoreID());
    }

    /**
     * Test of getID method, of class User.
     */
    @Test
    public void testGetID() {
        int id = testuser.getID();
        assertEquals(id, testuser.getID());
    }

    /**
     * Test of isBanned method, of class User.
     */
    @Test
    public void testIsBanned() {
        assertFalse(testuser.isBanned());
        testuser.setBanned(true);
        assertTrue(testuser.isBanned());
        assertFalse(testuser.isBanned());
        testuser.setBanned(true);
    }

    /**
     * Test of setBanned method, of class User.
     */
    @Test
    public void testSetBanned() {
        assertFalse(testuser.isBanned());
        testuser.setBanned(true);
        assertTrue(testuser.isBanned());
        assertFalse(testuser.isBanned());
        testuser.setBanned(true);
    }

    /**
     * Test of getPublicKey method, of class User.
     */
    @Test
    public void testGetPublicKey() {
        String[] keys = Encryption.generateKeyPair();
        testuser.setPublicKey(keys[0]);
        assertEquals(keys[0], testuser.getPublicKey());
    }

    /**
     * Test of setPublicKey method, of class User.
     */
    @Test
    public void testSetPublicKey() {
        String[] keys = Encryption.generateKeyPair();
        testuser.setPublicKey(keys[0]);
        assertEquals(keys[0], testuser.getPublicKey());    }

    /**
     * Test of getStoreID method, of class User.
     */
    @Test
    public void testGetStoreID() throws UserNotFoundException, UserCreationException {
        String storeid = testuser.getStoreID();
        assertEquals(storeid, User.getUser(storeid).getStoreID());
    }


    /**
     * Test of getRegistrationDate method, of class User.
     */
    @Test
    public void testGetRegistrationDate() {
        Timestamp date = testuser.getRegistrationDate();
        assertEquals(date, testuser.getRegistrationDate());
    }

    /**
     * Test of delete method, of class User.
     */
    @Test
    public void testDelete() throws UserNotFoundException, UserCreationException {
        int id = testuser.getID();
        testuser.delete();
        thrown.expect(UserNotFoundException.class);
        User.getUser(id);
    }

}
