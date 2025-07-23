---
title: MultiLanguageString
second_title: Aspose.Font for Java API Reference
description: Represents multi language string.
type: docs
weight: 65
url: /java/com.aspose.font/multilanguagestring/
---
**Inheritance:**
java.lang.Object
```
public class MultiLanguageString
```

Represents multi language string.
## Constructors

| Constructor | Description |
| --- | --- |
| [MultiLanguageString()](#MultiLanguageString--) | Creates empty multi language string. |
## Methods

| Method | Description |
| --- | --- |
| [addLanguageString(String str, int languageId)](#addLanguageString-java.lang.String-int-) | Adds string of specific language |
| [containsString(String str)](#containsString-java.lang.String-) | Returns true if the string is present inside all the language strings. |
| [equals(Object objToCompare)](#equals-java.lang.Object-) | Returns true if objects are considered equal. |
| [getAllLanguageIds()](#getAllLanguageIds--) | Gets language identifiers for all strings or empty array if no strings are presents. |
| [getAllStrings()](#getAllStrings--) | Returns all strings of all languages. |
| [getClass()](#getClass--) |  |
| [getEnglishString()](#getEnglishString--) | Returns english string if found. |
| [getStringForLanguageId(int languageId)](#getStringForLanguageId-int-) | Returns string related to language identifier passed, if found. |
| [hashCode()](#hashCode--) | GetHashCode implementation. |
| [isEmpty()](#isEmpty--) | True, if MultiLanguageString don't have strings of languages. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(MultiLanguageString obj1, String obj2)](#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-) | Equality operator implementation. |
| [op_Equality(String obj1, MultiLanguageString obj2)](#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-) | Equality operator implementation. |
| [op_Inequality(MultiLanguageString obj1, String obj2)](#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-) | Inequality operator implementation. |
| [op_Inequality(String obj1, MultiLanguageString obj2)](#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-) | Inequality operator implementation. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MultiLanguageString() {#MultiLanguageString--}
```
public MultiLanguageString()
```


Creates empty multi language string.

### addLanguageString(String str, int languageId) {#addLanguageString-java.lang.String-int-}
```
public void addLanguageString(String str, int languageId)
```


Adds string of specific language

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| str | java.lang.String | String to add |
| languageId | int | Language identifier |

### containsString(String str) {#containsString-java.lang.String-}
```
public boolean containsString(String str)
```


Returns true if the string is present inside all the language strings.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| str | java.lang.String | String to check. |

**Returns:**
boolean - True if the string is present inside all the language strings.
### equals(Object objToCompare) {#equals-java.lang.Object-}
```
public boolean equals(Object objToCompare)
```


Returns true if objects are considered equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| objToCompare | java.lang.Object | object to compare with |

**Returns:**
boolean - comparison result
### getAllLanguageIds() {#getAllLanguageIds--}
```
public int[] getAllLanguageIds()
```


Gets language identifiers for all strings or empty array if no strings are presents.

**Returns:**
int[] - Array with language identifiers or empty array if no strings are present.
### getAllStrings() {#getAllStrings--}
```
public String[] getAllStrings()
```


Returns all strings of all languages.

**Returns:**
java.lang.String[] - Array of all strings of all languages.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEnglishString() {#getEnglishString--}
```
public String getEnglishString()
```


Returns english string if found. Otherwise returns first non-english string.

**Returns:**
java.lang.String - English string if found, otherwise first non-english string.
### getStringForLanguageId(int languageId) {#getStringForLanguageId-int-}
```
public String getStringForLanguageId(int languageId)
```


Returns string related to language identifier passed, if found. Empty string otherwise.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| languageId | int | Language identifier. |

**Returns:**
java.lang.String - String related to language identifier passed, if found. Empty string otherwise.
### hashCode() {#hashCode--}
```
public int hashCode()
```


GetHashCode implementation.

**Returns:**
int - hash code of object
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


True, if MultiLanguageString don't have strings of languages.

**Returns:**
boolean - True, if MultiLanguageString don't have strings of languages.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(MultiLanguageString obj1, String obj2) {#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Equality(MultiLanguageString obj1, String obj2)
```


Equality operator implementation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | first object to compare |
| obj2 | java.lang.String | second object to compare |

**Returns:**
boolean - comparison result
### op_Equality(String obj1, MultiLanguageString obj2) {#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Equality(String obj1, MultiLanguageString obj2)
```


Equality operator implementation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | java.lang.String | string to compare |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | multilanguage string to compare |

**Returns:**
boolean - comparison result
### op_Inequality(MultiLanguageString obj1, String obj2) {#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Inequality(MultiLanguageString obj1, String obj2)
```


Inequality operator implementation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | string to compare |
| obj2 | java.lang.String | multilanguage string to compare |

**Returns:**
boolean - comparison result
### op_Inequality(String obj1, MultiLanguageString obj2) {#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Inequality(String obj1, MultiLanguageString obj2)
```


Inequality operator implementation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | java.lang.String | string to compare |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | multilanguage string to compare |

**Returns:**
boolean - comparison result
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

