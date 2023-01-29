---
title: License
second_title: Aspose.OCR for Java API Reference
description: License class for set and check license.
type: docs
weight: 15
url: /java/com.aspose.ocr/license/
---

**Inheritance:**
java.lang.Object
```
public class License
```

License class for set and check license.
## Constructors

| Constructor | Description |
| --- | --- |
| [License()](#License--) |  |
## Methods

| Method | Description |
| --- | --- |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Set license for library. |
| [setLicense(FileInputStream stream)](#setLicense-java.io.FileInputStream-) | Set license for library. |
| [setLicense(String filename)](#setLicense-java.lang.String-) | Set license for library. |
| [isValid()](#isValid--) | Check license. |
### License() {#License--}
```
public License()
```


### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public static void setLicense(InputStream stream)
```


Set license for library.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.InputStream | InputStream with license. |

### setLicense(FileInputStream stream) {#setLicense-java.io.FileInputStream-}
```
public static void setLicense(FileInputStream stream)
```


Set license for library.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.FileInputStream | FileInputStream with license. |

### setLicense(String filename) {#setLicense-java.lang.String-}
```
public static void setLicense(String filename)
```


Set license for library.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | Path to xml file with license. |

### isValid() {#isValid--}
```
public static boolean isValid()
```


Check license.

**Returns:**
boolean - Boolean value license is valid.
