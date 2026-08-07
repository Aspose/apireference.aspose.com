---
title: "CadViewList"
linktitle: "CadViewList"
second_title: "Aspose.CAD for Java"
description: "The cad view dictionary The following group codes apply to VPORT symbol table entries."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/cadviewlist/
---

**Inheritance:** java.lang.Object, NonGenericList

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable, com.aspose.cad_internal.dxf.core.fileformats.cad.ICadSymbolTableGroupCodes

The cad view dictionary The following group codes apply to VPORT symbol table entries. The VPORT table is unique: it may contain several entries with the same name (indicating a multiple-viewport configuration). The entries corresponding to the active viewport configuration all have the name *ACTIVE. The first such entry describes the current viewport. Since the name is not unique, we use List as a container

## Constructors

| Constructor | Description |
| --- | --- |
| [CadViewList()](#CadViewList) | Initializes a new instance of the CadViewList class. |

## Methods

| Method | Description |
| --- | --- |
| [getCadSymbolTableGroupCodes()](#getCadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)](#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [deepClone()](#deepClone) | The clone. |
| [addRange(CadViewTableObject[] objects)](#addRange-com.aspose.cad.fileformats.cad.cadtables.CadViewTableObject:A) | Adds the range of the objects to container. |

### CadViewList() {#CadViewList}
```java
public CadViewList()
```

Initializes a new instance of the CadViewList class.

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

### addRange(CadViewTableObject[] objects) {#addRange-com.aspose.cad.fileformats.cad.cadtables.CadViewTableObject:A}
```java
public final void addRange(CadViewTableObject[] objects)
```

Adds the range of the objects to container.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| objects | CadViewTableObject[] | The objects array. |

