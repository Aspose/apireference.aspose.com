---
title: License
second_title: Aspose.OCR for Java API Reference
description: Provides methods to license the component
type: docs
weight: 21
url: /java/com.aspose.ocr/license/
---

**Inheritance:**
java.lang.Object
```
public class License
```

Provides methods to license the component.
## Constructors

| Constructor | Description |
| --- | --- |
| [License()](#License) | Initializes a new instance of this class. |
## Methods

| Method | Description |
| --- | --- |

| [setLicense(File licenseFile)](#setLicense-java.io.File) | Licenses the component. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream) | Licenses the component. |
| [setLicense(String licenseFilePath)](#setLicense-java.lang.String) | Licenses the component. |
| [isValid()](#isValid--) | Check license. |
### License() {#License}
```
public License()
```


Initializes a new instance of this class.


### setLicense(File licenseFile) {#setLicense-java.io.File}
```
public static void setLicense(File licenseFile)
```


Licenses the component.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| licenseFile | java.io.File | representation of file pathname |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream}
```
public static void setLicense(InputStream stream)
```


Licenses the component.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | A stream that contains the license. |

### setLicense(String licenseFilePath) {#setLicense-java.lang.String}
```
public static void setLicense(String licenseFilePath)
```


Licenses the component.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| licenseFilePath | java.lang.String | Can be a full or short file name Use an empty string to switch to evaluation mode. |



### isValid() {#isValid--}
```
public static boolean isValid()
```


Check license.

**Returns:**
boolean - Boolean value license is valid.
