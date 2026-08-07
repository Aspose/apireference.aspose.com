---
title: "Asset"
linktitle: "Asset"
second_title: "Aspose.CAD for Java"
description: "The COLLADA asset."
type: docs
weight: 10
url: /java/com.aspose.cad.fileformats.collada.fileparser.elements/asset/
---

**Inheritance:** java.lang.Object, ColladaElement

The COLLADA asset. The asset element defines asset management information regarding its parent element.

## Constructors

| Constructor | Description |
| --- | --- |
| [Asset()](#Asset) | Initializes a new instance of the Asset class. |

## Methods

| Method | Description |
| --- | --- |
| [getUpAxis()](#getUpAxis) | Gets or sets the up axis. The up_axis element contains descriptive information about coordinate system of the geometric data. All coordinates are right-handed by definition. This element specifies which axis is considered up. The default is the Y-axis.The up_axis element may appear zero or one time. |
| [setUpAxis(String value)](#setUpAxis-java.lang.String) | Gets or sets the up axis. The up_axis element contains descriptive information about coordinate system of the geometric data. All coordinates are right-handed by definition. This element specifies which axis is considered up. The default is the Y-axis.The up_axis element may appear zero or one time. |
| [getKeywords()](#getKeywords) | Gets or sets the keywords. The keywords element contains a list of words used as search criteria for the parent element. There may be only one keywords element. |
| [setKeywords(String value)](#setKeywords-java.lang.String) | Gets or sets the keywords. The keywords element contains a list of words used as search criteria for the parent element. There may be only one keywords element. |
| [getCoverage()](#getCoverage) | Gets or sets the coverage. Specifies the location of the asset using the WGS84 coordinate system. |
| [setCoverage(Coverage value)](#setCoverage-com.aspose.cad.fileformats.collada.fileparser.elements.Coverage) | Gets or sets the coverage. Specifies the location of the asset using the WGS84 coordinate system. |
| [getContributor()](#getContributor) | Gets or sets the contributor. The contributor element defines authoring information for asset management. |
| [setContributor(Contributor[] value)](#setContributor-com.aspose.cad.fileformats.collada.fileparser.elements.Contributor:A) | Gets or sets the contributor. The contributor element defines authoring information for asset management. |
| [getCreated()](#getCreated) | Gets or sets the time of asset creation. The created element contains the date and time that the parent element was created and is represented in an ISO 8601 format. The created element may appear zero or one time. |
| [setCreated(Date value)](#setCreated-java.util.Date) | Gets or sets the time of asset creation. The created element contains the date and time that the parent element was created and is represented in an ISO 8601 format. The created element may appear zero or one time. |
| [getModified()](#getModified) | Gets or sets the time of asset was last modified. The created element contains the date and time that the parent element was created and is represented in an ISO 8601 format. The created element may appear zero or one time. |
| [setModified(Date value)](#setModified-java.util.Date) | Gets or sets the time of asset was last modified. The created element contains the date and time that the parent element was created and is represented in an ISO 8601 format. The created element may appear zero or one time. |
| [getRevision()](#getRevision) | Gets or sets the revision information. The revision element contains the revision information for the parent element. The revision element may appear zero or one time. |
| [setRevision(String value)](#setRevision-java.lang.String) | Gets or sets the revision information. The revision element contains the revision information for the parent element. The revision element may appear zero or one time. |
| [getSubject()](#getSubject) | Gets or sets the subject. The subject element contains a description of the topical subject of the parent element. The subject element may appear zero or one time |
| [setSubject(String value)](#setSubject-java.lang.String) | Gets or sets the subject. The subject element contains a description of the topical subject of the parent element. The subject element may appear zero or one time |
| [getTitle()](#getTitle) | Gets or sets the title. The title element contains the title information for the parent element. The title element may appear zero or one time. |
| [setTitle(String value)](#setTitle-java.lang.String) | Gets or sets the title. The title element contains the title information for the parent element. The title element may appear zero or one time. |
| [getUnit()](#getUnit) | Gets or sets the unit. The unit element contains descriptive information about unit of measure. It has attributes for the name of the unit and the measurement with respect to the meter. The unit element may appear zero or one time. |
| [setUnit(AssetUnit value)](#setUnit-com.aspose.cad.fileformats.collada.fileparser.elements.AssetUnit) | Gets or sets the unit. The unit element contains descriptive information about unit of measure. It has attributes for the name of the unit and the measurement with respect to the meter. The unit element may appear zero or one time. |
| [getExtras()](#getExtras) | Gets or sets the extras. |
| [setExtras(Extra[] value)](#setExtras-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A) | Gets or sets the extras. |

### Asset() {#Asset}
```java
public Asset()
```

Initializes a new instance of the Asset class.

### getUpAxis() {#getUpAxis}
```java
public final String getUpAxis()
```

Gets or sets the up axis. The up_axis element contains descriptive information about coordinate system of the geometric data. All coordinates are right-handed by definition. This element specifies which axis is considered up. The default is the Y-axis.The up_axis element may appear zero or one time.

**Returns:** String

### setUpAxis(String value) {#setUpAxis-java.lang.String}
```java
public final void setUpAxis(String value)
```

Gets or sets the up axis. The up_axis element contains descriptive information about coordinate system of the geometric data. All coordinates are right-handed by definition. This element specifies which axis is considered up. The default is the Y-axis.The up_axis element may appear zero or one time.

### getKeywords() {#getKeywords}
```java
public final String getKeywords()
```

Gets or sets the keywords. The keywords element contains a list of words used as search criteria for the parent element. There may be only one keywords element.

**Returns:** String

### setKeywords(String value) {#setKeywords-java.lang.String}
```java
public final void setKeywords(String value)
```

Gets or sets the keywords. The keywords element contains a list of words used as search criteria for the parent element. There may be only one keywords element.

### getCoverage() {#getCoverage}
```java
public final Coverage getCoverage()
```

Gets or sets the coverage. Specifies the location of the asset using the WGS84 coordinate system.

**Returns:** Coverage

### setCoverage(Coverage value) {#setCoverage-com.aspose.cad.fileformats.collada.fileparser.elements.Coverage}
```java
public final void setCoverage(Coverage value)
```

Gets or sets the coverage. Specifies the location of the asset using the WGS84 coordinate system.

### getContributor() {#getContributor}
```java
public final Contributor[] getContributor()
```

Gets or sets the contributor. The contributor element defines authoring information for asset management.

**Returns:** Contributor[]

### setContributor(Contributor[] value) {#setContributor-com.aspose.cad.fileformats.collada.fileparser.elements.Contributor:A}
```java
public final void setContributor(Contributor[] value)
```

Gets or sets the contributor. The contributor element defines authoring information for asset management.

### getCreated() {#getCreated}
```java
public final Date getCreated()
```

Gets or sets the time of asset creation. The created element contains the date and time that the parent element was created and is represented in an ISO 8601 format. The created element may appear zero or one time.

**Returns:** Date

### setCreated(Date value) {#setCreated-java.util.Date}
```java
public final void setCreated(Date value)
```

Gets or sets the time of asset creation. The created element contains the date and time that the parent element was created and is represented in an ISO 8601 format. The created element may appear zero or one time.

### getModified() {#getModified}
```java
public final Date getModified()
```

Gets or sets the time of asset was last modified. The created element contains the date and time that the parent element was created and is represented in an ISO 8601 format. The created element may appear zero or one time.

**Returns:** Date

### setModified(Date value) {#setModified-java.util.Date}
```java
public final void setModified(Date value)
```

Gets or sets the time of asset was last modified. The created element contains the date and time that the parent element was created and is represented in an ISO 8601 format. The created element may appear zero or one time.

### getRevision() {#getRevision}
```java
public final String getRevision()
```

Gets or sets the revision information. The revision element contains the revision information for the parent element. The revision element may appear zero or one time.

**Returns:** String

### setRevision(String value) {#setRevision-java.lang.String}
```java
public final void setRevision(String value)
```

Gets or sets the revision information. The revision element contains the revision information for the parent element. The revision element may appear zero or one time.

### getSubject() {#getSubject}
```java
public final String getSubject()
```

Gets or sets the subject. The subject element contains a description of the topical subject of the parent element. The subject element may appear zero or one time

**Returns:** String

### setSubject(String value) {#setSubject-java.lang.String}
```java
public final void setSubject(String value)
```

Gets or sets the subject. The subject element contains a description of the topical subject of the parent element. The subject element may appear zero or one time

### getTitle() {#getTitle}
```java
public final String getTitle()
```

Gets or sets the title. The title element contains the title information for the parent element. The title element may appear zero or one time.

**Returns:** String

### setTitle(String value) {#setTitle-java.lang.String}
```java
public final void setTitle(String value)
```

Gets or sets the title. The title element contains the title information for the parent element. The title element may appear zero or one time.

### getUnit() {#getUnit}
```java
public final AssetUnit getUnit()
```

Gets or sets the unit. The unit element contains descriptive information about unit of measure. It has attributes for the name of the unit and the measurement with respect to the meter. The unit element may appear zero or one time.

**Returns:** AssetUnit

### setUnit(AssetUnit value) {#setUnit-com.aspose.cad.fileformats.collada.fileparser.elements.AssetUnit}
```java
public final void setUnit(AssetUnit value)
```

Gets or sets the unit. The unit element contains descriptive information about unit of measure. It has attributes for the name of the unit and the measurement with respect to the meter. The unit element may appear zero or one time.

### getExtras() {#getExtras}
```java
public final Extra[] getExtras()
```

Gets or sets the extras.

**Returns:** Extra[]

### setExtras(Extra[] value) {#setExtras-com.aspose.cad.fileformats.collada.fileparser.elements.Extra:A}
```java
public final void setExtras(Extra[] value)
```

Gets or sets the extras.

