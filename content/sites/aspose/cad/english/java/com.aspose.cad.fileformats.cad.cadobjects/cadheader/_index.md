---
title: "CadHeader"
linktitle: "CadHeader"
second_title: "Aspose.CAD for Java"
description: "Class describing Cad header"
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.cad.cadobjects/cadheader/
---

Class describing Cad header

## Constructors

| Constructor | Description |
| --- | --- |
| [CadHeader()](#CadHeader) | Initializes a new instance of the CadHeader class. |

## Methods

| Method | Description |
| --- | --- |
| [getHeaderProperties()](#getHeaderProperties) | Gets or sets the header properties. |
| [getCustomProperties()](#getCustomProperties) | Gets or sets the custom properties. |
| [getAcadVersion()](#getAcadVersion) | Gets the acad version. |
| [getSummaryInfo()](#getSummaryInfo) | Gets the (DWG) summary information. |
| [getPropertiesSummaryInfoWrapper()](#getPropertiesSummaryInfoWrapper) | Gets the summary information wrapper for HeaderProperties ( CadHeader.getHeaderProperties() ). |

### CadHeader() {#CadHeader}
```java
public CadHeader()
```

Initializes a new instance of the CadHeader class.

### getHeaderProperties() {#getHeaderProperties}
```java
public HashMap<Integer,com.aspose.ms.System.Collections.Generic.List<CadParameter>> getHeaderProperties()
```

Gets or sets the header properties.

**Returns:** HashMap<Integer,com.aspose.ms.System.Collections.Generic.List<CadParameter>> - The header properties.

### getCustomProperties() {#getCustomProperties}
```java
public HashMap<String,String> getCustomProperties()
```

Gets or sets the custom properties.

**Returns:** HashMap<String,String> - The custom properties.

### getAcadVersion() {#getAcadVersion}
```java
public int getAcadVersion()
```

Gets the acad version.

**Returns:** int - The acad version.

### getSummaryInfo() {#getSummaryInfo}
```java
public final SummaryInfoData getSummaryInfo()
```

Gets the (DWG) summary information.

**Returns:** SummaryInfoData - The summary information.

### getPropertiesSummaryInfoWrapper() {#getPropertiesSummaryInfoWrapper}
```java
public final CadHeader.SummaryInfoWrapper getPropertiesSummaryInfoWrapper()
```

Gets the summary information wrapper for HeaderProperties ( CadHeader.getHeaderProperties() ).

**Returns:** CadHeader.SummaryInfoWrapper - The summary information wrapper for HeaderProperties ( CadHeader.getHeaderProperties() ).

