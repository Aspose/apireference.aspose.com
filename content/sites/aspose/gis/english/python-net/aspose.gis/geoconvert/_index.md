---
title: GeoConvert Class
type: docs
weight: 1140
url: /python-net/aspose.gis/geoconvert/
---

**Summary:** Converts coordinates to/from the different formats.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.GeoConvert

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [as_point_text(latitude, longitude, format)](#as_point_text_latitude_longitude_format_1) | Returns the calculated position as a string in the specified format. |
| [as_point_text(point, format)](#as_point_text_point_format_2) | Returns the calculated position as a string in the specified format. |
| [parse_point_text(text)](#parse_point_text_text_3) | Converts the string that contains сoordinates to IPoint object. |
| [try_parse_point_text(text, point)](#try_parse_point_text_text_point_4) | Converts the string that contains сoordinates to IPoint object. A return value indicates whether the conversion succeeded or failed. |


### Method: as_point_text(latitude, longitude, format)  [static] {#as_point_text_latitude_longitude_format_1}


```
 as_point_text(latitude, longitude, format) 
```

Returns the calculated position as a string in the specified format.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| latitude | double | Position latitude. |
| longitude | double | Position longitude. |
| format | [PointFormats](/psd/python-net/aspose.gis/pointformats) | Format of the result. |

**Returns**

| Type | Description |
| :- | :- |
| string | Position as string. |


### Method: as_point_text(point, format)  [static] {#as_point_text_point_format_2}


```
 as_point_text(point, format) 
```

Returns the calculated position as a string in the specified format.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| point | [IPoint](/psd/python-net/aspose.gis.geometries/ipoint/) | IPoint object. |
| format | [PointFormats](/psd/python-net/aspose.gis/pointformats) | Format of the result. |

**Returns**

| Type | Description |
| :- | :- |
| string | Position as string. |


### Method: parse_point_text(text)  [static] {#parse_point_text_text_3}


```
 parse_point_text(text) 
```

Converts the string that contains сoordinates to IPoint object.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| text | string | A string that contains coordinates to convert.<br/>            The string should contain both coordinate latitude and longitude.<br/>            Coordinates should be separated by whitespace, by comma or by semicolon. |

**Returns**

| Type | Description |
| :- | :- |
| [IPoint](/psd/python-net/aspose.gis.geometries/ipoint/) | IPoint object with coordinates that are equivalent to the input string. |


### Method: try_parse_point_text(text, point)  [static] {#try_parse_point_text_text_point_4}


```
 try_parse_point_text(text, point) 
```

Converts the string that contains сoordinates to IPoint object. A return value indicates whether the conversion succeeded or failed.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| text | string | A string that contains coordinates to convert.<br/>            The string should contain both coordinate latitude and longitude.<br/>            Coordinates should be separated by whitespace, by comma or by semicolon. |
| point | [IPoint[]](/psd/python-net/aspose.gis.geometries/ipoint/) | When this method returns, contains the IPoint object with parsed coordinates, if the conversion succeeded, or null if the conversion failed. |

**Returns**

| Type | Description |
| :- | :- |
| bool | True if text was parsed successfully, otherwise False. |


