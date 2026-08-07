---
title: "CadLineTypesDictionary"
linktitle: "CadLineTypesDictionary"
second_title: "Aspose.CAD for Java"
description: "Represents dictionary with types of lines."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/cadlinetypesdictionary/
---

**Inheritance:** java.lang.Object, NonGenericDictionary

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable, com.aspose.cad_internal.dxf.core.fileformats.cad.ICadSymbolTableGroupCodes

Represents dictionary with types of lines.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadLineTypesDictionary()](#CadLineTypesDictionary) | Initializes a new instance of the CadLineTypesDictionary class. |

## Methods

| Method | Description |
| --- | --- |
| [getCadSymbolTableGroupCodes()](#getCadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)](#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [add(String key, CadLineTypeTableObject value)](#add-java.lang.String-com.aspose.cad.fileformats.cad.cadtables.CadLineTypeTableObject) | Adds a CadLineTypeTableObject to the dictionary. |
| [remove(String key)](#remove-java.lang.String) | Removes the CadLineTypeTableObject with the specified key. |
| [deepClone()](#deepClone) | Clones the dictionary. |

### CadLineTypesDictionary() {#CadLineTypesDictionary}
```java
public CadLineTypesDictionary()
```

Initializes a new instance of the CadLineTypesDictionary class.

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

### add(String key, CadLineTypeTableObject value) {#add-java.lang.String-com.aspose.cad.fileformats.cad.cadtables.CadLineTypeTableObject}
```java
public void add(String key, CadLineTypeTableObject value)
```

Adds a CadLineTypeTableObject to the dictionary.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The CadLineTypeTableObject key. |
| value | CadLineTypeTableObject | The CadLineTypeTableObject to add. |

### remove(String key) {#remove-java.lang.String}
```java
public boolean remove(String key)
```

Removes the CadLineTypeTableObject with the specified key.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The CadLineTypeTableObject key to remove. |

**Returns:** boolean - True if the element is successfully removed; otherwise, false. This method also returns false if key was not found in the dictionary.

### deepClone() {#deepClone}
```java
public Object deepClone()
```

Clones the dictionary.

**Returns:** Object - A new object that is a shallow copy of this instance.

