---
title: PostGisDriver Class
type: docs
weight: 10
url: /python-net/aspose.gis.formats.postgis/postgisdriver/
---

**Summary:** A driver for the PostGIS database.

**Module:** [aspose.gis.formats.postgis](/psd/python-net/aspose.gis.formats.postgis/)

**Full Name:** aspose.gis.formats.postgis.PostGisDriver

**Inheritance:** DatabaseDriver

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [from_definition(table_name)](#from_definition_table_name_1) | Allows the start of the process of configuring the data source [IFromDefinitionDataSource](/psd/python-net/aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/) for further work with it. |
| [from_query(query)](#from_query_query_2) | Configuring the data source for custom database queries. |


### Method: from_definition(table_name) {#from_definition_table_name_1}


```
 from_definition(table_name) 
```

Allows the start of the process of configuring the data source [IFromDefinitionDataSource](/psd/python-net/aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/) for further work with it.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| table_name | string | Name of the database table from which the data will be extracted |

**Returns**

| Type | Description |
| :- | :- |
| [FromDefinitionDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder/) | [FromDefinitionDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder/) |


### Method: from_query(query) {#from_query_query_2}


```
 from_query(query) 
```

Configuring the data source for custom database queries.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| query | string | Query string. |

**Returns**

| Type | Description |
| :- | :- |
| [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder/) | [DatabaseQueryDataSourceBuilder](/psd/python-net/aspose.gis.formats.database/databasequerydatasourcebuilder/) |


