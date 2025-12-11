---
title: TtfNameTable
second_title: Aspose.Font for Java API Reference
description: Represents name table of the TTF Font file.
type: docs
weight: 104
url: /java/com.aspose.font/ttfnametable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfNameTable extends TtfTableBase
```

Represents "name" table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)](#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Extracts all multilingual strings from passed  mlNames  object and creates correspondent NameRecord structure for every string extracted using passed parameters  platformId ,  platformSpecificId  and  nameId . |
| [addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)](#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-) | Adds entry into the table. |
| [deleteRecords(PlatformId platformId, int platformSpecificId)](#deleteRecords-com.aspose.font.PlatformId-int-) | Deletes all the records related to platform specified |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | Deletes all the records related to passed parameters |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-) | Deletes record(s) related to parameters specified |
| [deleteRecordsByNameId(NameId nameId)](#deleteRecordsByNameId-com.aspose.font.NameId-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllNameRecords()](#getAllNameRecords--) | Returns all  NameRecord  structures from table. |
| [getClass()](#getClass--) |  |
| [getMultiLanguageNameById(NameId nameId)](#getMultiLanguageNameById-com.aspose.font.NameId-) | returns a name by nameId |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-) | Returns a name by nameId using platform identifier passed. |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-) | Returns a name as object of type  MultiLanguageString . |
| [getNameById(NameId nameId)](#getNameById-com.aspose.font.NameId-) | Returns a name by nameId if found, null otherwise. |
| [getNameRecordsByNameId(NameId nameId)](#getNameRecordsByNameId-com.aspose.font.NameId-) | Returns all  NameRecord  structures which NameId field is equal to passed  nameId  value. |
| [getOffset()](#getOffset--) | Gets offset from beginning of sfnt. |
| [getTag()](#getTag--) | Gets table tag. |
| [getTtfTables()](#getTtfTables--) | Reference to TTF table repository. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)](#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-) | Updates name in record(s) which related to specified platform (combination of platformId and platformSpecificId), category (nameId) and language (languageId). |
| [updateNamesByNameId(NameId nameId, String newName)](#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-) | Selects all records which related to logical string category, specified by parameter nameId and updates name field (string data) in these records. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId) {#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)
```


Extracts all multilingual strings from passed  mlNames  object and creates correspondent NameRecord structure for every string extracted using passed parameters  platformId ,  platformSpecificId  and  nameId . Value for field languageID is extracted from  mlNames  object. New just created record is added into table. If record which coincides with just created by fields platformID, platformSpecificID, nameID and, langugeId will be found, then new created record will not be added and only string data will be updated for existing record.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mlNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Multilingual string |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Platform identifier |
| platformSpecificId | int | Platform-specific encoding identifier |
| nameId | [NameId](../../com.aspose.font/nameid) | Name identifier, logical string category, specified by  NameId  enumeration |

### addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name) {#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-}
```
public void addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)
```


Adds entry into the table. String data category to add is specified by  name  parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name identifier, logical string category, specified by [NameId](../../com.aspose.font/nameid) enumeration. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Platform identifier. |
| platformSpecificId | int | Platform-specific encoding identifier. Please, use value from one of such enumerations -  UnicodePlatformSpecificId ,  MacPlatformSpecificId ,  MSPlatformSpecificId . What enumeration to use is defined by context ( platformId  parameter). |
| languageId | int | Language identifier. Please, use value from  MSLanguageId  or  MacLanguageId  enumerations depend from context, defined by  platformId  parameter. |
| name | java.lang.String | Actual string data. |

### deleteRecords(PlatformId platformId, int platformSpecificId) {#deleteRecords-com.aspose.font.PlatformId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId)
```


Deletes all the records related to platform specified

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Platform identifier |
| platformSpecificId | int | Platform-specific encoding identifier |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)
```


Deletes all the records related to passed parameters

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Platform identifier |
| platformSpecificId | int | Platform-specific encoding identifier |
| nameId | [NameId](../../com.aspose.font/nameid) | Name identifier, logical string category, specified by  NameId  enumeration |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)
```


Deletes record(s) related to parameters specified

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Platform identifier |
| platformSpecificId | int | Platform-specific encoding identifier |
| nameId | [NameId](../../com.aspose.font/nameid) | Name identifier, logical string category, specified by  NameId  enumeration |
| languageId | int | Language identifier |

### deleteRecordsByNameId(NameId nameId) {#deleteRecordsByNameId-com.aspose.font.NameId-}
```
public void deleteRecordsByNameId(NameId nameId)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) |  |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAllNameRecords() {#getAllNameRecords--}
```
public NameRecord[] getAllNameRecords()
```


Returns all  NameRecord  structures from table.

**Returns:**
com.aspose.font.NameRecord[] - All  NameRecord  structures from table.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMultiLanguageNameById(NameId nameId) {#getMultiLanguageNameById-com.aspose.font.NameId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId)
```


returns a name by nameId

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name Id. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - name
### getMultiLanguageNameById(NameId nameId, PlatformId platformId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId)
```


Returns a name by nameId using platform identifier passed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name Id. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Platform Id. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)
```


Returns a name as object of type  MultiLanguageString . Method collects all NameRecord structures which coincide with passed parameters nameId, platformId and platformSpecificId and then builds resultant object based on this structures list.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name Id. |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Platform Id. |
| platformSpecificId | int | Platform specific Id. |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getNameById(NameId nameId) {#getNameById-com.aspose.font.NameId-}
```
public String getNameById(NameId nameId)
```


Returns a name by nameId if found, null otherwise.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name identifier |

**Returns:**
java.lang.String - name
### getNameRecordsByNameId(NameId nameId) {#getNameRecordsByNameId-com.aspose.font.NameId-}
```
public NameRecord[] getNameRecordsByNameId(NameId nameId)
```


Returns all  NameRecord  structures which NameId field is equal to passed  nameId  value. If no records found, empty array will be returned.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name identifier |

**Returns:**
com.aspose.font.NameRecord[] - Array of  NameRecord  structures
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset from beginning of sfnt.

**Returns:**
long - Offset from beginning of sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Reference to TTF table repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName) {#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-}
```
public void updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)
```


Updates name in record(s) which related to specified platform (combination of platformId and platformSpecificId), category (nameId) and language (languageId).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | Platform identifier |
| platformSpecificId | int | Platform-specific encoding identifier |
| nameId | [NameId](../../com.aspose.font/nameid) | Name identifier, logical string category, specified by  NameId  enumeration |
| languageId | int | Language identifier |
| newName | java.lang.String | New name or new string data |

### updateNamesByNameId(NameId nameId, String newName) {#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-}
```
public void updateNamesByNameId(NameId nameId, String newName)
```


Selects all records which related to logical string category, specified by parameter nameId and updates name field (string data) in these records. Fields related to platform (platformID, Platform-specific encoding ID) and language (Language ID) are not affected by this method. Only name string data is replaced with a new name. Use this method with caution, cause it will replace original names for all platforms and languages, related to nameId. It can make a conflicts for cases when original names had different values, cause replace operation changes all these values with new single one.And this new value may have a logical inconsistency with some platforms and languages. This method is useful for cases when original name has single representation for all platforms and languages, for example, when name string data is in English language.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name identifier, logical string category, specified by  NameId  enumeration |
| newName | java.lang.String | New name or new string data |

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

