---
title: LocalDatum Class
type: docs
weight: 120
url: /python-net/aspose.gis.spatialreferencing/localdatum/
---

**Summary:** Indicates method used for measurements in local spatial reference system.

**Module:** [aspose.gis.spatialreferencing](/psd/python-net/aspose.gis.spatialreferencing/)

**Full Name:** aspose.gis.spatialreferencing.LocalDatum

**Inheritance:** IdentifiableObject

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [LocalDatum(name, datum_type, identifier)](#LocalDatum_name_datum_type_identifier_1) | Create new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| datum_type | int | r | An integer number, indicating measurement method that had been used. |
| epsg_code | int | r | If this objects identifier is EPSG identifier - return its code. Otherwise - return -1. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | r | Identifier of this identifiable object. |
| name | string | r | Name of this object. |


### Constructor: LocalDatum(name, datum_type, identifier) {#LocalDatum_name_datum_type_identifier_1}


```
 LocalDatum(name, datum_type, identifier) 
```

Create new instance.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | name of datum. |
| datum_type | int | integer number, representing type of datum. |
| identifier | [Identifier](/psd/python-net/aspose.gis.spatialreferencing/identifier) | identifier of datum. |

