---
title: RvmSaveOptions
second_title: Aspose.3D for Java API Reference
description: Save options for Aveva PDMS RVM file.
type: docs
weight: 143
url: /java/com.aspose.threed/rvmsaveoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.SaveOptions](../../com.aspose.threed/saveoptions)
```
public class RvmSaveOptions extends SaveOptions
```

Save options for Aveva PDMS RVM file.
## Constructors

| Constructor | Description |
| --- | --- |
| [RvmSaveOptions()](#RvmSaveOptions--) | Constructor of com.aspose.threed.RvmSaveOptions |
| [RvmSaveOptions(FileContentType contentType)](#RvmSaveOptions-com.aspose.threed.FileContentType-) | Constructor of com.aspose.threed.RvmSaveOptions |
## Methods

| Method | Description |
| --- | --- |
| [getFileNote()](#getFileNote--) | File note in the file header. |
| [setFileNote(String value)](#setFileNote-java.lang.String-) | File note in the file header. |
| [getAuthor()](#getAuthor--) | Author information, default value is '3d@aspose' |
| [setAuthor(String value)](#setAuthor-java.lang.String-) | Author information, default value is '3d@aspose' |
| [getCreationTime()](#getCreationTime--) | The timestamp that exported this file, default value is current time |
| [setCreationTime(String value)](#setCreationTime-java.lang.String-) | The timestamp that exported this file, default value is current time |
| [getAttributePrefix()](#getAttributePrefix--) | Gets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'. |
| [setAttributePrefix(String value)](#setAttributePrefix-java.lang.String-) | Sets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'. |
| [getAttributeListFile()](#getAttributeListFile--) | Gets the file name of attribute list file, exporter will generate a name based on the .rvm file name when this property is undefined, default value is null. |
| [setAttributeListFile(String value)](#setAttributeListFile-java.lang.String-) | Sets the file name of attribute list file, exporter will generate a name based on the .rvm file name when this property is undefined, default value is null. |
| [getExportAttributes()](#getExportAttributes--) | Gets whether to export the attribute list to an external .att file, default value is false. |
| [setExportAttributes(boolean value)](#setExportAttributes-boolean-) | Sets whether to export the attribute list to an external .att file, default value is false. |
### RvmSaveOptions() {#RvmSaveOptions--}
```
public RvmSaveOptions()
```


Constructor of com.aspose.threed.RvmSaveOptions

### RvmSaveOptions(FileContentType contentType) {#RvmSaveOptions-com.aspose.threed.FileContentType-}
```
public RvmSaveOptions(FileContentType contentType)
```


Constructor of com.aspose.threed.RvmSaveOptions

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) | Text or binary RVM file? |

### getFileNote() {#getFileNote--}
```
public String getFileNote()
```


File note in the file header.

**Returns:**
java.lang.String
### setFileNote(String value) {#setFileNote-java.lang.String-}
```
public void setFileNote(String value)
```


File note in the file header.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getAuthor() {#getAuthor--}
```
public String getAuthor()
```


Author information, default value is '3d@aspose'

**Returns:**
java.lang.String
### setAuthor(String value) {#setAuthor-java.lang.String-}
```
public void setAuthor(String value)
```


Author information, default value is '3d@aspose'

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getCreationTime() {#getCreationTime--}
```
public String getCreationTime()
```


The timestamp that exported this file, default value is current time

**Returns:**
java.lang.String
### setCreationTime(String value) {#setCreationTime-java.lang.String-}
```
public void setCreationTime(String value)
```


The timestamp that exported this file, default value is current time

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getAttributePrefix() {#getAttributePrefix--}
```
public String getAttributePrefix()
```


Gets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'. For example if a property is rvm:Refno=345, the exported attribute will be Refno = 345, the prefix is stripped.

**Returns:**
java.lang.String
### setAttributePrefix(String value) {#setAttributePrefix-java.lang.String-}
```
public void setAttributePrefix(String value)
```


Sets the prefix of which attributes that will be exported, the exported property will contains no prefix, custom properties with different prefix will not be exported, default value is 'rvm:'. For example if a property is rvm:Refno=345, the exported attribute will be Refno = 345, the prefix is stripped.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getAttributeListFile() {#getAttributeListFile--}
```
public String getAttributeListFile()
```


Gets the file name of attribute list file, exporter will generate a name based on the .rvm file name when this property is undefined, default value is null.

**Returns:**
java.lang.String
### setAttributeListFile(String value) {#setAttributeListFile-java.lang.String-}
```
public void setAttributeListFile(String value)
```


Sets the file name of attribute list file, exporter will generate a name based on the .rvm file name when this property is undefined, default value is null.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getExportAttributes() {#getExportAttributes--}
```
public boolean getExportAttributes()
```


Gets whether to export the attribute list to an external .att file, default value is false.

**Returns:**
boolean
### setExportAttributes(boolean value) {#setExportAttributes-boolean-}
```
public void setExportAttributes(boolean value)
```


Sets whether to export the attribute list to an external .att file, default value is false.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

