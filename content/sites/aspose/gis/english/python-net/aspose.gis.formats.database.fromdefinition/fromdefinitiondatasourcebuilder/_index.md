---
title: FromDefinitionDataSourceBuilder Class
type: docs
weight: 10
url: /python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder/
---

**Summary:** Provides the ability to configure a data source object

**Module:** [aspose.gis.formats.database.fromdefinition](/psd/python-net/aspose.gis.formats.database.fromdefinition/)

**Full Name:** aspose.gis.formats.database.fromdefinition.FromDefinitionDataSourceBuilder

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [add_attribute(name, type)](#add_attribute_name_type_1) | Configures the name of the field that will contain information for the feature attribute. |
| [build()](#build__2) | The method retrieves an implementation of the [IFromDefinitionDataSource](/psd/python-net/aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/) |
| [geometry_field(name)](#geometry_field_name_3) | Configures the name of the field from which the geometry will be extracted. |
| [identity_attribute(name, overwrite_same_key)](#identity_attribute_name_overwrite_same_key_4) | Mandatory setting that allows tracking changes. |


### Method: add_attribute(name, type) {#add_attribute_name_type_1}


```
 add_attribute(name, type) 
```

Configures the name of the field that will contain information for the feature attribute.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | Name of database field for attribute. |
| type | [AttributeDataType](/psd/python-net/aspose.gis/attributedatatype) | Type of data into which data from the database should be converted. |

**Returns**

| Type | Description |
| :- | :- |
| [FromDefinitionDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder) | [FromDefinitionDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder/) |


### Method: build() {#build__2}


```
 build() 
```

The method retrieves an implementation of the [IFromDefinitionDataSource](/psd/python-net/aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/)

**Returns**

| Type | Description |
| :- | :- |
| [IFromDefinitionDataSource](/psd/python-net/aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource) | Implementation of the [IFromDefinitionDataSource](/psd/python-net/aspose.gis.formats.database.fromdefinition/ifromdefinitiondatasource/) |


### Method: geometry_field(name) {#geometry_field_name_3}


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
| [FromDefinitionDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder) | [FromDefinitionDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder/) |


### Method: identity_attribute(name, overwrite_same_key) {#identity_attribute_name_overwrite_same_key_4}


```
 identity_attribute(name, overwrite_same_key) 
```

Mandatory setting that allows tracking changes.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| name | string | An attribute of a feature that will be treated as uniquely identifying the feature. |
| overwrite_same_key | bool | If this flag is set to true, then newly added features with a unique identifier the same that is already present in the layer, <br/>            the current one will be overwritten, and the data will be read as updated if differences are found.<br/>            Otherwise, an exception will be thrown. |

**Returns**

| Type | Description |
| :- | :- |
| [FromDefinitionDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder) | [FromDefinitionDataSourceBuilder](/psd/python-net/aspose.gis.formats.database.fromdefinition/fromdefinitiondatasourcebuilder/) |


