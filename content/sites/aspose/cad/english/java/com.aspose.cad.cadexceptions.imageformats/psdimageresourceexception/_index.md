---
title: "PsdImageResourceException"
linktitle: "PsdImageResourceException"
second_title: "Aspose.CAD for Java"
description: "The psd image resource exception."
type: docs
weight: 10
url: /java/com.aspose.cad.cadexceptions.imageformats/psdimageresourceexception/
---

**Inheritance:** java.lang.Object, com.aspose.cad.cadexceptions.imageformats.PsdImageException

The psd image resource exception.

## Constructors

| Constructor | Description |
| --- | --- |
| [PsdImageResourceException(String message, ResourceBlock resource)](#PsdImageResourceException-java.lang.String-com.aspose.cad.fileformats.psd.ResourceBlock) | Initializes a new instance of the PsdImageResourceException class. |
| [PsdImageResourceException(String message, ResourceBlock resource, Throwable innerException)](#PsdImageResourceException-java.lang.String-com.aspose.cad.fileformats.psd.ResourceBlock-java.lang.Throwable) | Initializes a new instance of the PsdImageResourceException class. |

## Methods

| Method | Description |
| --- | --- |
| [getResource()](#getResource) | Gets the psd resource which caused this exception. |

### PsdImageResourceException(String message, ResourceBlock resource) {#PsdImageResourceException-java.lang.String-com.aspose.cad.fileformats.psd.ResourceBlock}
```java
public PsdImageResourceException(String message, ResourceBlock resource)
```

Initializes a new instance of the PsdImageResourceException class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| message | String | The exception message. |
| resource | ResourceBlock | The resource. |

### PsdImageResourceException(String message, ResourceBlock resource, Throwable innerException) {#PsdImageResourceException-java.lang.String-com.aspose.cad.fileformats.psd.ResourceBlock-java.lang.Throwable}
```java
public PsdImageResourceException(String message, ResourceBlock resource, Throwable innerException)
```

Initializes a new instance of the PsdImageResourceException class.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| message | String | The exception message. |
| resource | ResourceBlock | The resource. |
| innerException | Throwable | The inner exception. |

### getResource() {#getResource}
```java
public ResourceBlock getResource()
```

Gets the psd resource which caused this exception.

**Returns:** ResourceBlock - The resource.

