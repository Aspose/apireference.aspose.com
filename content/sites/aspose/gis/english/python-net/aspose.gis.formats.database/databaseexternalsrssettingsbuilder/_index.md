---
title: DatabaseExternalSrsSettingsBuilder Class
type: docs
weight: 30
url: /python-net/aspose.gis.formats.database/databaseexternalsrssettingsbuilder/
---

**Summary:** Provides the possibility of configuring a database query to retrieve a list of used spatial reference systems.

**Module:** [aspose.gis.formats.database](/psd/python-net/aspose.gis.formats.database/)

**Full Name:** aspose.gis.formats.database.DatabaseExternalSrsSettingsBuilder

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [end_external_srs()](#end_external_srs__1) | Complete the configuration of the external srs and return the parent context. |
| [external_srs_fields(auth_srid_field, sr_text_field)](#external_srs_fields_auth_srid_field_sr_text_field_2) | Specifies special field names from which to read information about additionally requested spatial reference systems. |


### Method: end_external_srs() {#end_external_srs__1}


```
 end_external_srs() 
```

Complete the configuration of the external srs and return the parent context.

**Returns**

| Type | Description |
| :- | :- |
| [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder) | [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder/) |


### Method: external_srs_fields(auth_srid_field, sr_text_field) {#external_srs_fields_auth_srid_field_sr_text_field_2}


```
 external_srs_fields(auth_srid_field, sr_text_field) 
```

Specifies special field names from which to read information about additionally requested spatial reference systems.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| auth_srid_field | string | Field for reading spatial reference id, default: auth_srid. |
| sr_text_field | string | Field for reading the spatial coordinate system represented by WKT, default: srtext. |

**Returns**

| Type | Description |
| :- | :- |
| [DatabaseExternalSrsSettingsBuilder](/psd/python-net/aspose.gis.formats.database/databaseexternalsrssettingsbuilder) | [DatabaseExternalSrsSettingsBuilder](/psd/python-net/aspose.gis.formats.database/databaseexternalsrssettingsbuilder/) |


