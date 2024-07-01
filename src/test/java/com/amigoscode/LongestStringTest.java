package com.amigoscode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestStringTest {

    @Test
    public void find_longestString_whenAllStringsAreUniqueAndNotEmpty() {
        // Arrange
        String[] arr = new String[] {"Hello", "Morning", "Hibernate"};
        
        // Act
        String result = LongestString.find(arr);
        
        // Assert
        assertEquals("Hibernate", result);
    }
    
    @Test
    public void find_longestString_whenThereAreSomeEmptyStrings() {
        // Arrange
        String[] arr = new String[] {"", "Morning", ""};
        
        // Act
        String result = LongestString.find(arr);
        
        // Assert
        assertEquals("Morning", result);
    }
    
    @Test
    @Disabled
    public void find_longestString_whenAllStringsAreEmpty() {
        // Arrange
        String[] arr = new String[] {"", "", ""};
        
        // Act
        String result = LongestString.find(arr);
        
        // Assert
        assertEquals("", result);
    }
    
    @Test
    public void find_longestString_whenAllStringsHaveSameLength() {
        // Arrange
        String[] arr = new String[] {"One", "Two", "Six"};
        
        // Act
        String result = LongestString.find(arr);
        
        // Assert
        assertEquals("One", result);
    }
    
    @Test
    public void find_longestString_whenArrayIsEmpty() {
        // Arrange
        String[] arr = new String[] {};
        
        // Act
        String result = LongestString.find(arr);
        
        // Assert
        assertEquals(null, result);
    }
}