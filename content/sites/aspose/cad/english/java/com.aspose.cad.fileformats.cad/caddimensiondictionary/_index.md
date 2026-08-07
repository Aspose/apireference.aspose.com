---
title: "CadDimensionDictionary"
linktitle: "CadDimensionDictionary"
second_title: "Aspose.CAD for Java"
description: "Dimension styles dictionary."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/caddimensiondictionary/
---

**Inheritance:** java.lang.Object, NonGenericDictionary

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable, com.aspose.cad_internal.dxf.core.fileformats.cad.ICadSymbolTableGroupCodes

Dimension styles dictionary.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadDimensionDictionary()](#CadDimensionDictionary) | Initializes a new instance of the CadDimensionDictionary class. |

## Methods

| Method | Description |
| --- | --- |
| [getCadSymbolTableGroupCodes()](#getCadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)](#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [add(String key, CadDimensionStyleTable value)](#add-java.lang.String-com.aspose.cad.fileformats.cad.cadtables.CadDimensionStyleTable) | Adds a CadDimensionStyleTable to the dictionary. |
| [remove(String key)](#remove-java.lang.String) | Removes the CadDimensionStyleTable with the specified key. |
| [deepClone()](#deepClone) | Clones the dictionary. |

### CadDimensionDictionary() {#CadDimensionDictionary}
```java
public CadDimensionDictionary()
```

Initializes a new instance of the CadDimensionDictionary class.

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

### add(String key, CadDimensionStyleTable value) {#add-java.lang.String-com.aspose.cad.fileformats.cad.cadtables.CadDimensionStyleTable}
```java
public void add(String key, CadDimensionStyleTable value)
```

Adds a CadDimensionStyleTable to the dictionary.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The CadDimensionStyleTable key. |
| value | CadDimensionStyleTable | The CadDimensionStyleTable to add. |

### remove(String key) {#remove-java.lang.String}
```java
public boolean remove(String key)
```

Removes the CadDimensionStyleTable with the specified key.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The CadDimensionStyleTable key to remove. |

**Returns:** boolean - True if the element is successfully removed; otherwise, false. This method also returns false if key was not found in the dictionary.

### deepClone() {#deepClone}
```java
public Object deepClone()
```

Clones the dictionary.

**Returns:** Object - A new object that is a shallow copy of this instance.

