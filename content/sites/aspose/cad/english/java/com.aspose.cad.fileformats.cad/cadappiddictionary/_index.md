---
title: "CadAppIdDictionary"
linktitle: "CadAppIdDictionary"
second_title: "Aspose.CAD for Java"
description: "Collection of cad layouts"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/cadappiddictionary/
---

**Inheritance:** java.lang.Object, NonGenericDictionary

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable, com.aspose.cad_internal.dxf.core.fileformats.cad.ICadSymbolTableGroupCodes

Collection of cad layouts

## Constructors

| Constructor | Description |
| --- | --- |
| [CadAppIdDictionary()](#CadAppIdDictionary) | Initializes a new instance of the CadAppIdDictionary class. |

## Methods

| Method | Description |
| --- | --- |
| [getCadSymbolTableGroupCodes()](#getCadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)](#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [add(String key, CadAppIdTableObject value)](#add-java.lang.String-com.aspose.cad.fileformats.cad.cadtables.CadAppIdTableObject) | Adds a CadAppIdTableObject to the dictionary. |
| [remove(String key)](#remove-java.lang.String) | Removes the CadAppIdTableObject with the specified key. |
| [deepClone()](#deepClone) | Clones the dictionary. |

### CadAppIdDictionary() {#CadAppIdDictionary}
```java
public CadAppIdDictionary()
```

Initializes a new instance of the CadAppIdDictionary class.

### getCadSymbolTableGroupCodes() {#getCadSymbolTableGroupCodes}
```java
public CadSymbolTableGroupCodes getCadSymbolTableGroupCodes()
```

Gets or sets the cad symbol table group codes.

**Returns:** CadSymbolTableGroupCodes - The cad symbol table group codes.

### setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value) {#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes}
```java
public void setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)
```

Gets or sets the cad symbol table group codes.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadSymbolTableGroupCodes | The cad symbol table group codes. |

### add(String key, CadAppIdTableObject value) {#add-java.lang.String-com.aspose.cad.fileformats.cad.cadtables.CadAppIdTableObject}
```java
public void add(String key, CadAppIdTableObject value)
```

Adds a CadAppIdTableObject to the dictionary.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The CadAppIdTableObject key. |
| value | CadAppIdTableObject | The CadAppIdTableObject to add. |

### remove(String key) {#remove-java.lang.String}
```java
public boolean remove(String key)
```

Removes the CadAppIdTableObject with the specified key.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| key | String | The CadAppIdTableObject key to remove. |

**Returns:** boolean - True if the element is successfully removed; otherwise, false. This method also returns false if key was not found in the dictionary.

### deepClone() {#deepClone}
```java
public Object deepClone()
```

Clones the dictionary.

**Returns:** Object - A new object that is a shallow copy of this instance.

