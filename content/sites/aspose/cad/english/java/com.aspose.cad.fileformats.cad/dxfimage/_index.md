---
title: "DxfImage"
linktitle: "DxfImage"
second_title: "Aspose.CAD for Java"
description: "Dxf image class"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/dxfimage/
---

**Inheritance:** java.lang.Object, CadImage

Dxf image class

## Constructors

| Constructor | Description |
| --- | --- |
| [DxfImage()](#DxfImage) | Initializes a new instance of the DxfImage class. |

## Methods

| Method | Description |
| --- | --- |
| [assignHandle(CadBase cadBase)](#assignHandle-com.aspose.cad.fileformats.cad.cadobjects.CadBase) | Assigns next available object handle. |
| [nextAvailableHandle()](#nextAvailableHandle) | Gets next available object handle |
| [removeEntity(CadBaseEntity entity)](#removeEntity-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity) | Removes entity. |
| [addEntity(CadBaseEntity entity)](#addEntity-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity) | Adds entity. |
| [addObject(CadBaseObject obj)](#addObject-com.aspose.cad.fileformats.cad.cadobjects.CadBaseObject) | Adds enity. |
| [removeObject(CadBaseObject obj)](#removeObject-com.aspose.cad.fileformats.cad.cadobjects.CadBaseObject) | Removes enity. |

### DxfImage() {#DxfImage}
```java
public DxfImage()
```

Initializes a new instance of the DxfImage class.

### assignHandle(CadBase cadBase) {#assignHandle-com.aspose.cad.fileformats.cad.cadobjects.CadBase}
```java
public final void assignHandle(CadBase cadBase)
```

Assigns next available object handle.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| cadBase | CadBase | instance to add. |

### nextAvailableHandle() {#nextAvailableHandle}
```java
public final String nextAvailableHandle()
```

Gets next available object handle

**Returns:** String

### removeEntity(CadBaseEntity entity) {#removeEntity-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity}
```java
public void removeEntity(CadBaseEntity entity)
```

Removes entity.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| entity | CadBaseEntity | Entity to add. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - Thrown when entity is null
- `com.aspose.ms.System.NotSupportedException` - Thrown if removing of the current entity is not implemented

### addEntity(CadBaseEntity entity) {#addEntity-com.aspose.cad.fileformats.cad.cadobjects.CadBaseEntity}
```java
public final void addEntity(CadBaseEntity entity)
```

Adds entity.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| entity | CadBaseEntity | Entity to add. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - Thrown when entity is null
- `com.aspose.ms.System.InvalidOperationException` - Thrown if the current entity has been added before
- `com.aspose.ms.System.NotSupportedException` - Thrown if adding of the current entity is not implemented

### addObject(CadBaseObject obj) {#addObject-com.aspose.cad.fileformats.cad.cadobjects.CadBaseObject}
```java
public final void addObject(CadBaseObject obj)
```

Adds enity.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| obj | CadBaseObject | Object to add. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - Thrown when object is null
- `com.aspose.ms.System.InvalidOperationException` - Thrown if the current object has been added before
- `com.aspose.ms.System.NotSupportedException` - Thrown if adding of the current object is not implemented

### removeObject(CadBaseObject obj) {#removeObject-com.aspose.cad.fileformats.cad.cadobjects.CadBaseObject}
```java
public final void removeObject(CadBaseObject obj)
```

Removes enity.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| obj | CadBaseObject | Object to remove. |

**Throws:**

- `com.aspose.ms.System.ArgumentNullException` - Thrown when object is null
- `com.aspose.ms.System.NotSupportedException` - Thrown if removing of the current object is not implemented

