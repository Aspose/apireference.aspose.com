---
title: "CadLayersList"
linktitle: "CadLayersList"
second_title: "Aspose.CAD for Java"
description: "Layer tables list Since the name is not unique, we use List as a container"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad/cadlayerslist/
---

**Inheritance:** java.lang.Object, NonGenericList

**All Implemented Interfaces:** com.aspose.ms.System.ICloneable, com.aspose.cad_internal.dxf.core.fileformats.cad.ICadSymbolTableGroupCodes

Layer tables list Since the name is not unique, we use List as a container

## Constructors

| Constructor | Description |
| --- | --- |
| [CadLayersList()](#CadLayersList) | Initializes a new instance of the CadLayersList class. |

## Methods

| Method | Description |
| --- | --- |
| [deepClone()](#deepClone) | The clone. |
| [addRange(CadLayerTable[] objects)](#addRange-com.aspose.cad.fileformats.cad.cadtables.CadLayerTable:A) | Adds the range of the objects to container. |
| [getLayer(String name)](#getLayer-java.lang.String) | Gets list of layers by name. |
| [getLayersNames()](#getLayersNames) | Gets the layers names. |
| [getApplicationCodesContainer()](#getApplicationCodesContainer) | Gets or sets the application codes container. |
| [setApplicationCodesContainer(CadApplicationCodesContainer value)](#setApplicationCodesContainer-com.aspose.cad.fileformats.cad.cadobjects.CadApplicationCodesContainer) | Gets or sets the application codes container. |
| [getCadSymbolTableGroupCodes()](#getCadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |
| [setCadSymbolTableGroupCodes(CadSymbolTableGroupCodes value)](#setCadSymbolTableGroupCodes-com.aspose.cad.fileformats.cad.cadtables.CadSymbolTableGroupCodes) | Gets or sets the cad symbol table group codes. |

### CadLayersList() {#CadLayersList}
```java
public CadLayersList()
```

Initializes a new instance of the CadLayersList class.

### deepClone() {#deepClone}
```java
public Object deepClone()
```

The clone.

**Returns:** Object - The object .

### addRange(CadLayerTable[] objects) {#addRange-com.aspose.cad.fileformats.cad.cadtables.CadLayerTable:A}
```java
public void addRange(CadLayerTable[] objects)
```

Adds the range of the objects to container.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| objects | CadLayerTable[] | The objects array. |

### getLayer(String name) {#getLayer-java.lang.String}
```java
public CadLayerTable getLayer(String name)
```

Gets list of layers by name.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The name parameter. |

**Returns:** CadLayerTable - The list of CadLayerTable

### getLayersNames() {#getLayersNames}
```java
public List<String> getLayersNames()
```

Gets the layers names.

**Returns:** List<String> - The list of string layers names

### getApplicationCodesContainer() {#getApplicationCodesContainer}
```java
public CadApplicationCodesContainer getApplicationCodesContainer()
```

Gets or sets the application codes container.

**Returns:** CadApplicationCodesContainer - The application codes container.

### setApplicationCodesContainer(CadApplicationCodesContainer value) {#setApplicationCodesContainer-com.aspose.cad.fileformats.cad.cadobjects.CadApplicationCodesContainer}
```java
public void setApplicationCodesContainer(CadApplicationCodesContainer value)
```

Gets or sets the application codes container.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | CadApplicationCodesContainer | The application codes container. |

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

