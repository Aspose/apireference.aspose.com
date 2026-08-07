---
title: "CadUcsList"
linktitle: "CadUcsList"
second_title: "Aspose.CAD for Java"
description: "The cad view dictionary The following group codes apply to VPORT symbol table entries."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/caducslist/
---

**Inheritance:** java.lang.Object, NonGenericList

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable, com.aspose.cad_internal.dxf.core.fileformats.cad.ICadSymbolTableGroupCodes

The cad view dictionary The following group codes apply to VPORT symbol table entries. The VPORT table is unique: it may contain several entries with the same name (indicating a multiple-viewport configuration). The entries corresponding to the active viewport configuration all have the name *ACTIVE. The first such entry describes the current viewport. Since the name is not unique, we use List as a container

## Constructors

| Constructor | Description |
| --- | --- |
| [CadUcsList()](#CadUcsList) | Initializes a new instance of the CadUcsList class. |

## Methods

| Method | Description |
| --- | --- |
| [getCadSymbolTableGroupCodes()](#getCadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)](#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [deepClone()](#deepClone) | The clone. |
| [addRange(CadUcsTableObject[] objects)](#addRange-com.aspose.cad.fileformats.cad.cadtables.CadUcsTableObject:A) | Adds the range of the objects to container. |

### CadUcsList() {#CadUcsList}
```java
public CadUcsList()
```

Initializes a new instance of the CadUcsList class.

### getCadSymbolTableGroupCodes() {#getCadSymbolTableGroupCodes}
```java
public final CadSymbolTableGroupCodes getCadSymbolTableGroupCodes()
```

Gets or sets the cad symbol table group codes.

**Returns:** CadSymbolTableGroupCodes - The cad symbol table group codes.

### setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value) {#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes}
```java
public final void setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)
```

Gets or sets the cad symbol table group codes.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadSymbolTableGroupCodes | The cad symbol table group codes. |

### deepClone() {#deepClone}
```java
public final Object deepClone()
```

The clone.

**Returns:** Object - The Object .

### addRange(CadUcsTableObject[] objects) {#addRange-com.aspose.cad.fileformats.cad.cadtables.CadUcsTableObject:A}
```java
public final void addRange(CadUcsTableObject[] objects)
```

Adds the range of the objects to container.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| objects | CadUcsTableObject[] | The objects array. |

