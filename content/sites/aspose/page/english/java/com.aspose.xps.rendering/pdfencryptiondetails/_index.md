---
title: PdfEncryptionDetails
second_title: Aspose.Page for Java API Reference
description: Contains details for a pdf encryption.
type: docs
weight: 16
url: /java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Contains details for a pdf encryption.
## Constructors

| Constructor | Description |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Initializes a new instance of the  PdfEncryptionDetailsCore  class. |
## Methods

| Method | Description |
| --- | --- |
| [getUserPassword()](#getUserPassword--) | Returns the user password. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Sets the user password. |
| [getOwnerPassword()](#getOwnerPassword--) | Returns the owner password. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Sets the owner password. |
| [getPermissions()](#getPermissions--) | Returns the permissions. |
| [setPermissions(int value)](#setPermissions-int-) | Sets the permissions. |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Returns the encryption mode. |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Sets the encryption mode. |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Initializes a new instance of the  PdfEncryptionDetailsCore  class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| userPassword | java.lang.String | The user password. |
| ownerPassword | java.lang.String | The owner password. |
| permissions | int | The permissions. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | The encryption algorithm. |

### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Returns the user password.

Opening the document with the correct user password (or opening a document that does not have a user password) allows additional operations to be performed according to the user access permissions specified in the document\\u2019s encryption dictionary.

**Returns:**
java.lang.String - The user password.
### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Sets the user password.

Opening the document with the correct user password (or opening a document that does not have a user password) allows additional operations to be performed according to the user access permissions specified in the document\\u2019s encryption dictionary.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The user password. |

### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Returns the owner password.

Opening the document with the correct owner password (assuming it is not the same as the user password) allows full (owner) access to the document. This unlimited access includes the ability to change the document\\u2019s passwords and access permissions.

**Returns:**
java.lang.String - The owner password.
### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Sets the owner password.

Opening the document with the correct owner password (assuming it is not the same as the user password) allows full (owner) access to the document. This unlimited access includes the ability to change the document\\u2019s passwords and access permissions.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The owner password. |

### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Returns the permissions.

**Returns:**
int - The permissions.
### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Sets the permissions.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The permissions. |

### getEncryptionAlgorithm() {#getEncryptionAlgorithm--}
```
public PdfEncryptionAlgorithm getEncryptionAlgorithm()
```


Returns the encryption mode.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### setEncryptionAlgorithm(PdfEncryptionAlgorithm value) {#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public void setEncryptionAlgorithm(PdfEncryptionAlgorithm value)
```


Sets the encryption mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | The encryption algorithm. |

