---
title: DatabaseQueryDataSourceBuilder Class
type: docs
weight: 40
url: /python-net/aspose.gis.formats.database/databasequerydatasourcebuilder/
---

**Summary:** Provides the ability to configure a query to database to to extract geospatial information.

**Module:** [aspose.gis.formats.database](/psd/python-net/aspose.gis.formats.database/)

**Full Name:** aspose.gis.formats.database.DatabaseQueryDataSourceBuilder

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add_attribute(name, type)](#add_attribute_name_type_1) | Configures the name of the field that will contain information for the feature attribute. |
| [as_trackable_for_changes(table_name, identity_attribute, overwrite_same_key, db_func)](#as_trackable_for_changes_table_name_identity_attribute_overwrite_same_key_db_func_2) | Configure the resulting layer to track changes and create a data source to synchronize the changes made. |
| [build()](#build__3) | The method retrieves an implementation of the [IDatabaseDataSource](/psd/python-net/aspose.gis.formats.database/idatabasedatasource/) |
| [geometry_field(name)](#geometry_field_name_4) | Configures the name of the field from which the geometry will be extracted. |
| [srid_field(name)](#srid_field_name_5) | Configuring the name of the query field that will contain the spatial reference system identifier (srid). |
| [use_external_srs_from_query(srs_query)](#use_external_srs_from_query_srs_query_6) | Allows you to configure the data source to use third-party spatial reference system data, bypassing the pre-installed data in the Aspose.GIS library. |


### Method: add_attribute(name, type) {#add_attribute_name_type_1}


```
 add_attribute(name, type) 
```

Configures the name of the field that will contain information for the feature attribute.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of query field for attribute. |
| type | [AttributeDataType](/psd/python-net/aspose.gis/attributedatatype) | Type of data into which data from the database should be converted. |

**Returns**

| Type | Description |
| :- | :- |
| [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder) | [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder/) |


### Method: as_trackable_for_changes(table_name, identity_attribute, overwrite_same_key, db_func) {#as_trackable_for_changes_table_name_identity_attribute_overwrite_same_key_db_func_2}


```
 as_trackable_for_changes(table_name, identity_attribute, overwrite_same_key, db_func) 
```

Configure the resulting layer to track changes and create a data source to synchronize the changes made.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| table_name | string | The name of the table where the changes will be made. |
| identity_attribute | string | An attribute of a feature that will be treated as uniquely identifying the feature. |
| overwrite_same_key | bool | If this flag is set to true, then newly added features with a unique identifier the same that is already present in the layer, the current one will be overwritten, and the data will be read as updated if differences are found. |
| db_func | string | Function that will be supplied in SQL query to transform binary data into geographic data representation of the current database. |

**Returns**

| Type | Description |
| :- | :- |
| [DatabaseEditableDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.dataediting/databaseeditabledatasourcebuilder/) | [DatabaseEditableDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.dataediting/databaseeditabledatasourcebuilder/) |


### Method: build() {#build__3}


```
 build() 
```

The method retrieves an implementation of the [IDatabaseDataSource](/psd/python-net/aspose.gis.formats.database/idatabasedatasource/)

**Returns**

| Type | Description |
| :- | :- |
| [IDatabaseDataSource](/psd/python-net/aspose.gis.formats.database/idatabasedatasource) | Implementation of the [IDatabaseDataSource](/psd/python-net/aspose.gis.formats.database/idatabasedatasource/) |


### Method: geometry_field(name) {#geometry_field_name_4}


```
 geometry_field(name) 
```

Configures the name of the field from which the geometry will be extracted.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of gemetry field. |

**Returns**

| Type | Description |
| :- | :- |
| [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder) | [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder/) |


### Method: srid_field(name) {#srid_field_name_5}


```
 srid_field(name) 
```

Configuring the name of the query field that will contain the spatial reference system identifier (srid).

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of the query field containing the spatial reference system identifier. |

**Returns**

| Type | Description |
| :- | :- |
| [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder) | [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder/) |


### Method: use_external_srs_from_query(srs_query) {#use_external_srs_from_query_srs_query_6}


```
 use_external_srs_from_query(srs_query) 
```

Allows you to configure the data source to use third-party spatial reference system data, bypassing the pre-installed data in the Aspose.GIS library.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| srs_query | string | Query to retrieve information about additional spatial coordinate systems used in the main query to retrieve features. |

**Returns**

| Type | Description |
| :- | :- |
| [DatabaseExternalSrsSettingsBuilder](/psd/python-net/aspose.gis.formats.database/databaseexternalsrssettingsbuilder) | [DatabaseExternalSrsSettingsBuilder](/psd/python-net/aspose.gis.formats.database/databaseexternalsrssettingsbuilder/) |


