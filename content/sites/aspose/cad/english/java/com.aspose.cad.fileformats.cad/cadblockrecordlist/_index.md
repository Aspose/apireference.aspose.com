---
title: "CadBlockRecordList"
linktitle: "CadBlockRecordList"
second_title: "Aspose.CAD for Java"
description: "The cad view dictionary The following group codes apply to VPORT symbol table entries."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/cadblockrecordlist/
---

**Inheritance:** java.lang.Object, NonGenericList

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable, com.aspose.cad_internal.dxf.core.fileformats.cad.ICadSymbolTableGroupCodes

The cad view dictionary The following group codes apply to VPORT symbol table entries. The VPORT table is unique: it may contain several entries with the same name (indicating a multiple-viewport configuration). The entries corresponding to the active viewport configuration all have the name *ACTIVE. The first such entry describes the current viewport. Since the name is not unique, we use List as a container

## Constructors

| Constructor | Description |
| --- | --- |
| [CadBlockRecordList()](#CadBlockRecordList) | //<<<<<<<< #endregion Fields //>>>>>>>> #region Constructors /** Initializes a new instance of the CadBlockRecordList class. |

## Methods

| Method | Description |
| --- | --- |
| [getCadSymbolTableGroupCodes()](#getCadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)](#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [deepClone()](#deepClone) | The clone. |
| [addRange(CadBlockTableObject[] objects)](#addRange-com.aspose.cad.fileformats.cad.cadtables.CadBlockTableObject:A) | Adds the range of the objects to container. |
| [getBlockByLayoutHandle(String layoutHandle)](#getBlockByLayoutHandle-java.lang.String) | Gets block table by layout handle |

### CadBlockRecordList() {#CadBlockRecordList}
```java
public CadBlockRecordList()
```

//<<<<<<<< #endregion Fields //>>>>>>>> #region Constructors /** Initializes a new instance of the CadBlockRecordList class.

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
public Object deepClone()
```

The clone.

**Returns:** Object - The object .

### addRange(CadBlockTableObject[] objects) {#addRange-com.aspose.cad.fileformats.cad.cadtables.CadBlockTableObject:A}
```java
public void addRange(CadBlockTableObject[] objects)
```

Adds the range of the objects to container.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| objects | CadBlockTableObject[] | The objects array. |

### getBlockByLayoutHandle(String layoutHandle) {#getBlockByLayoutHandle-java.lang.String}
```java
public final CadBlockTableObject getBlockByLayoutHandle(String layoutHandle)
```

Gets block table by layout handle

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| layoutHandle | String | The layout handle. |

**Returns:** CadBlockTableObject

