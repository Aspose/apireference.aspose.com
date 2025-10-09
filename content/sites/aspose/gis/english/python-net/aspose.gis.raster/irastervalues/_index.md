---
title: IRasterValues Class
type: docs
weight: 30
url: /python-net/aspose.gis.raster/irastervalues/
---

**Summary:** Provides access to the values of raster bands.

**Module:** [aspose.gis.raster](/psd/python-net/aspose.gis.raster/)

**Full Name:** aspose.gis.raster.IRasterValues

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [as_boolean(band_index)](#as_boolean_band_index_1) | Converts the specified band data to a <see langword="bool" /> value. |
| [as_byte(band_index)](#as_byte_band_index_2) | Converts the specified band data to a <see langword="byte" /> value. |
| [as_double(band_index)](#as_double_band_index_3) | Converts the specified band data to a <see langword="double" /> value. |
| [as_float(band_index)](#as_float_band_index_4) | Converts the specified band data to a <see langword="float" /> value. |
| [as_integer(band_index)](#as_integer_band_index_5) | Converts the specified band data to a <see langword="int" /> value. |
| [as_long(band_index)](#as_long_band_index_6) | Converts the specified band data to a <see langword="long" /> value. |
| [as_short(band_index)](#as_short_band_index_7) | Converts the specified band data to a <see langword="short" /> value. |
| [equals_no_data(band_index)](#equals_no_data_band_index_8) | Checks if the value represents background or 'no data' in the specified band. |
| [get_data_type(band_index)](#get_data_type_band_index_9) | Gets type of values. |
| [is_null(band_index)](#is_null_band_index_10) | Checks if the raster value is set in the specified band. |


### Method: as_boolean(band_index) {#as_boolean_band_index_1}


```
 as_boolean(band_index) 
```

Converts the specified band data to a <see langword="bool" /> value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| bool | The converted value. |


### Method: as_byte(band_index) {#as_byte_band_index_2}


```
 as_byte(band_index) 
```

Converts the specified band data to a <see langword="byte" /> value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| byte | The converted value. |


### Method: as_double(band_index) {#as_double_band_index_3}


```
 as_double(band_index) 
```

Converts the specified band data to a <see langword="double" /> value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| double | The converted value. |


### Method: as_float(band_index) {#as_float_band_index_4}


```
 as_float(band_index) 
```

Converts the specified band data to a <see langword="float" /> value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| float | The converted value. |


### Method: as_integer(band_index) {#as_integer_band_index_5}


```
 as_integer(band_index) 
```

Converts the specified band data to a <see langword="int" /> value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| int | The converted value. |


### Method: as_long(band_index) {#as_long_band_index_6}


```
 as_long(band_index) 
```

Converts the specified band data to a <see langword="long" /> value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| long | The converted value. |


### Method: as_short(band_index) {#as_short_band_index_7}


```
 as_short(band_index) 
```

Converts the specified band data to a <see langword="short" /> value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| short | The converted value. |


### Method: equals_no_data(band_index) {#equals_no_data_band_index_8}


```
 equals_no_data(band_index) 
```

Checks if the value represents background or 'no data' in the specified band.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| bool | Return 'true' if represents background or 'no data'. |


### Method: get_data_type(band_index) {#get_data_type_band_index_9}


```
 get_data_type(band_index) 
```

Gets type of values.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| [BandTypes](/psd/python-net/aspose.gis.raster/bandtypes) | The type of values. |


### Method: is_null(band_index) {#is_null_band_index_10}


```
 is_null(band_index) 
```

Checks if the raster value is set in the specified band.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| band_index | int | The index of the band. Numbering starts from 0. |

**Returns**

| Type | Description |
| :- | :- |
| bool | Return 'false' if not exist. |


