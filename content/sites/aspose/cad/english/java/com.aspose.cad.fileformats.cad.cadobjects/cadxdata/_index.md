---
title: "CadXdata"
linktitle: "CadXdata"
second_title: "Aspose.CAD for Java"
description: "The Cad xdata."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadxdata/
---

The Cad xdata.

## Constructors

| Constructor | Description |
| --- | --- |
| [CadXdata()](#CadXdata) | Initializes a new instance of the CadXdata class. Initializes a new instance of the class. |

## Methods

| Method | Description |
| --- | --- |
| [getDataList()](#getDataList) | Gets or sets the data list. |
| [setDataList(List<CadCodeValue> value)](#setDataList-java.util.List) | Gets or sets the data list. |
| [getName()](#getName) | Gets or sets the name. |
| [setName(String value)](#setName-java.lang.String) | Gets or sets the name. |
| [getFirstValue(CadXdata xdata, int attribute)](#getFirstValue-com.aspose.cad.fileformats.cad.cadobjects.CadXdata-int) | Get first occurrence of an attribute from XData |

### CadXdata() {#CadXdata}
```java
public CadXdata()
```

Initializes a new instance of the CadXdata class. Initializes a new instance of the class.

### getDataList() {#getDataList}
```java
public List<CadCodeValue> getDataList()
```

Gets or sets the data list.

**Returns:** List<CadCodeValue> - The data list.

### setDataList(List<CadCodeValue> value) {#setDataList-java.util.List}
```java
public void setDataList(List<CadCodeValue> value)
```

Gets or sets the data list.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | List<CadCodeValue> | The data list. |

### getName() {#getName}
```java
public String getName()
```

Gets or sets the name.

**Returns:** String - The name.

### setName(String value) {#setName-java.lang.String}
```java
public void setName(String value)
```

Gets or sets the name.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | String | The name. |

### getFirstValue(CadXdata xdata, int attribute) {#getFirstValue-com.aspose.cad.fileformats.cad.cadobjects.CadXdata-int}
```java
public static CadCodeValue getFirstValue(CadXdata xdata, int attribute)
```

Get first occurrence of an attribute from XData

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| xdata | CadXdata | Xdata array |
| attribute | int | Attribute code |

**Returns:** CadCodeValue - CadCodeValue representation of a value

