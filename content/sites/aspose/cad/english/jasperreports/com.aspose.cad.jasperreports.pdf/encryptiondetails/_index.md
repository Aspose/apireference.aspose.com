---
title: "EncryptionDetails"
linktitle: "EncryptionDetails"
second_title: "Aspose.CAD for JasperReports"
description: "Contains details for a pdf encryption."
type: docs
weight: 10
url: /jasperreports/com.aspose.cad.jasperreports.pdf/encryptiondetails/
---

Contains details for a pdf encryption.

## Constructors

| Constructor | Description |
| --- | --- |
| [EncryptionDetails(String userPassword, String ownerPassword, int permissions, EncryptionDetails.EncryptionAlgorithmEnum encryptionAlgorithm)](#EncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.cad.jasperreports.pdf.EncryptionDetails.EncryptionAlgorithmEnum) | Initializes a new instance of the PdfEncryptionDetailsCore class. |

## Methods

| Method | Description |
| --- | --- |
| [getUserPassword()](#getUserPassword) | Gets or sets the User password. Value: The user password. Opening the document with the correct user password (or opening a document that does not have a user password) allows additional operations to be performed according to the user access permissions specified in the document’s encryption dictionary. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String) | Gets or sets the User password. Value: The user password. Opening the document with the correct user password (or opening a document that does not have a user password) allows additional operations to be performed according to the user access permissions specified in the document’s encryption dictionary. |
| [getOwnerPassword()](#getOwnerPassword) | Gets or sets the Owner password. Value: The owner password. Opening the document with the correct owner password (assuming it is not the same as the user password) allows full (owner) access to the document. This unlimited access includes the ability to change the document’s passwords and access permissions. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String) | Gets or sets the Owner password. Value: The owner password. Opening the document with the correct owner password (assuming it is not the same as the user password) allows full (owner) access to the document. This unlimited access includes the ability to change the document’s passwords and access permissions. |
| [getPermissions()](#getPermissions) | Gets or sets the permissions. Value: The permissions. |
| [setPermissions(int value)](#setPermissions-int) | Gets or sets the permissions. Value: The permissions. |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm) | Gets the encryption mode. Value: The encryption algorithm. |
| [setEncryptionAlgorithm(EncryptionDetails.EncryptionAlgorithmEnum encryptionAlgorithm)](#setEncryptionAlgorithm-com.aspose.cad.jasperreports.pdf.EncryptionDetails.EncryptionAlgorithmEnum) | Gets or sets the encryption mode. Value: The encryption algorithm. |

### EncryptionDetails(String userPassword, String ownerPassword, int permissions, EncryptionDetails.EncryptionAlgorithmEnum encryptionAlgorithm) {#EncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.cad.jasperreports.pdf.EncryptionDetails.EncryptionAlgorithmEnum}
```java
public EncryptionDetails(String userPassword, String ownerPassword, int permissions, EncryptionDetails.EncryptionAlgorithmEnum encryptionAlgorithm)
```

Initializes a new instance of the PdfEncryptionDetailsCore class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| userPassword | String | The user password. |
| ownerPassword | String | The owner password. |
| permissions | int | The permissions. |
| encryptionAlgorithm | EncryptionDetails.EncryptionAlgorithmEnum | The encryption algorithm. |

### getUserPassword() {#getUserPassword}
```java
public String getUserPassword()
```

Gets or sets the User password. Value: The user password. Opening the document with the correct user password (or opening a document that does not have a user password) allows additional operations to be performed according to the user access permissions specified in the document’s encryption dictionary.

**Returns:** String

### setUserPassword(String value) {#setUserPassword-java.lang.String}
```java
public void setUserPassword(String value)
```

Gets or sets the User password. Value: The user password. Opening the document with the correct user password (or opening a document that does not have a user password) allows additional operations to be performed according to the user access permissions specified in the document’s encryption dictionary.

### getOwnerPassword() {#getOwnerPassword}
```java
public String getOwnerPassword()
```

Gets or sets the Owner password. Value: The owner password. Opening the document with the correct owner password (assuming it is not the same as the user password) allows full (owner) access to the document. This unlimited access includes the ability to change the document’s passwords and access permissions.

**Returns:** String

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String}
```java
public void setOwnerPassword(String value)
```

Gets or sets the Owner password. Value: The owner password. Opening the document with the correct owner password (assuming it is not the same as the user password) allows full (owner) access to the document. This unlimited access includes the ability to change the document’s passwords and access permissions.

### getPermissions() {#getPermissions}
```java
public int getPermissions()
```

Gets or sets the permissions. Value: The permissions.

**Returns:** int

### setPermissions(int value) {#setPermissions-int}
```java
public void setPermissions(int value)
```

Gets or sets the permissions. Value: The permissions.

### getEncryptionAlgorithm() {#getEncryptionAlgorithm}
```java
public EncryptionDetails.EncryptionAlgorithmEnum getEncryptionAlgorithm()
```

Gets the encryption mode. Value: The encryption algorithm.

**Returns:** EncryptionDetails.EncryptionAlgorithmEnum

### setEncryptionAlgorithm(EncryptionDetails.EncryptionAlgorithmEnum encryptionAlgorithm) {#setEncryptionAlgorithm-com.aspose.cad.jasperreports.pdf.EncryptionDetails.EncryptionAlgorithmEnum}
```java
public void setEncryptionAlgorithm(EncryptionDetails.EncryptionAlgorithmEnum encryptionAlgorithm)
```

Gets or sets the encryption mode. Value: The encryption algorithm.

