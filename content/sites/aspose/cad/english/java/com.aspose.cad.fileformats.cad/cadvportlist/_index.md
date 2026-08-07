---
title: "CadVportList"
linktitle: "CadVportList"
second_title: "Aspose.CAD for Java"
description: "The cad viewport dictionary The following group codes apply to VPORT symbol table entries."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/cadvportlist/
---

**Inheritance:** java.lang.Object, NonGenericList

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable, com.aspose.cad_internal.dxf.core.fileformats.cad.ICadSymbolTableGroupCodes

The cad viewport dictionary The following group codes apply to VPORT symbol table entries. The VPORT table is unique: it may contain several entries with the same name (indicating a multiple-viewport configuration). The entries corresponding to the active viewport configuration all have the name *ACTIVE. The first such entry describes the current viewport. Since the name is not unique, we use List as a container

## Constructors

| Constructor | Description |
| --- | --- |
| [CadVportList()](#CadVportList) | Initializes a new instance of the CadVportList class. |

## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone) | The clone. |
| [addRange(CadVportTableObject[] objects)](#addRange-com.aspose.cad.fileformats.cad.cadtables.CadVportTableObject:A) | Adds the range of the objects to container. |
| [getCadSymbolTableGroupCodes()](#getCadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)](#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |

### CadVportList() {#CadVportList}
```java
public CadVportList()
```

Initializes a new instance of the CadVportList class.

### deepClone() {#deepClone}
```java
public final Object deepClone()
```

The clone.

**Returns:** Object - The Object .

### addRange(CadVportTableObject[] objects) {#addRange-com.aspose.cad.fileformats.cad.cadtables.CadVportTableObject:A}
```java
public final void addRange(CadVportTableObject[] objects)
```

Adds the range of the objects to container.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| objects | CadVportTableObject[] | The objects array. |

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

