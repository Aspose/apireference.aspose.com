---
title: Identifier Class
type: docs
weight: 110
url: /python-net/aspose.gis.spatialreferencing/identifier/
---

**Summary:** Represents an identifier - a reference to external description of an object.<br/>            If you create a SRS from WKT, [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier/) corresponds to "AUTHORITY" keyword.

**Module:** [aspose.gis.spatialreferencing](/psd/python-net/aspose.gis.spatialreferencing/)

**Full Name:** aspose.gis.spatialreferencing.Identifier

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [Identifier(authority_name, authority_unique_identifier)](#Identifier_authority_name_authority_unique_identifier_1) | Create new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| authority_name | string | r | A name of authority, which gave an [Identifier.authority_unique_identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier/). |
| authority_unique_identifier | string | r | A unique way to represent an object within a [Identifier.authority_name](/psd/python-net/aspose.gis.spatialreferencing/identifier/). |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [epsg(epsg_code)](#epsg_epsg_code_1) | Creates new Identifier that represents EPSG identifier with code <paramref name="epsgCode" />. |
| [get_epsg_code()](#get_epsg_code__2) | If this object represents a valid EPSG identifier (e.g. - authority name is "EPSG" and authority unique identifier is integer) -<br/>            return it. Otherwise - return -1. |


### Constructor: Identifier(authority_name, authority_unique_identifier) {#Identifier_authority_name_authority_unique_identifier_1}


```
 Identifier(authority_name, authority_unique_identifier) 
```

Create new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| authority_name | string | [Identifier.authority_name](/psd/python-net/aspose.gis.spatialreferencing/identifier/). |
| authority_unique_identifier | string | [Identifier.authority_unique_identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier/). |

### Method: epsg(epsg_code)  [static] {#epsg_epsg_code_1}


```
 epsg(epsg_code) 
```

Creates new Identifier that represents EPSG identifier with code <paramref name="epsgCode" />.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| epsg_code | int | Epsg code. |

**Returns**

| Type | Description |
| :- | :- |
| [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | New identifier with [Identifier.authority_name](/psd/python-net/aspose.gis.spatialreferencing/identifier/) "EPSG" and [Identifier.authority_unique_identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier/) <paramref name="epsgCode" />.<br/>            If <paramref name="epsgCode" /> is less then 0 - return <see langword="null" />; |


### Method: get_epsg_code() {#get_epsg_code__2}


```
 get_epsg_code() 
```

If this object represents a valid EPSG identifier (e.g. - authority name is "EPSG" and authority unique identifier is integer) -<br/>            return it. Otherwise - return -1.

**Returns**

| Type | Description |
| :- | :- |
| int | EPSG identifier represented by this object. If this object doesn't represent an EPSG identifier - return -1. |


