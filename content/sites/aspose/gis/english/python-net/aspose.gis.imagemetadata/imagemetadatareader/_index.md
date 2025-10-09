---
title: ImageMetadataReader Class
type: docs
weight: 30
url: /python-net/aspose.gis.imagemetadata/imagemetadatareader/
---

**Summary:** Class for editing, adding some EXIF tags

**Module:** [aspose.gis.imagemetadata](/psd/python-net/aspose.gis.imagemetadata/)

**Full Name:** aspose.gis.imagemetadata.ImageMetadataReader

**Aspose.PSD Version:** 25.9.0

## **Methods**
| **Name** | **Description** |
| :- | :- |
| [get_reader(file_name)](#get_reader_file_name_1) | Creates a reader instance for EXIF tags |
| [get_reader(stream)](#get_reader_stream_2) | Creates a reader instance for EXIF tags |
| [read_data()](#read_data__3) | Extracts all supported EXIF tags |
| [save(file_name)](#save_file_name_4) | Save to new file since the original one is locked for changes |
| [save(file_name, format)](#save_file_name_format_5) | Save to new file since the original one is locked for changes |
| [save(stream)](#save_stream_6) | Saving changes to a separate stream |
| [save(stream, format)](#save_stream_format_7) | Saving changes to a separate stream |
| [set_artist(artist)](#set_artist_artist_8) | Saving the EXIF Artist tag, adding or overwriting the data. |
| [set_description(description)](#set_description_description_9) | Saving the EXIF ImageDescription tag, adding or overwriting the data. |
| [set_geo_location(latitude, longitude)](#set_geo_location_latitude_longitude_10) | Saving the EXIF GPSLatitudeRef, GPSLongitudeRef, GPSLatitude and GPSLongitude tags, adding or overwriting the data. |
| [set_image_size(width, height)](#set_image_size_width_height_11) | Saving the EXIF ImageWidth and ImageHeight tags, adding or overwriting the data. |
| [set_modify_date(modify_date)](#set_modify_date_modify_date_12) | Saving the EXIF ModifyDate (DataTime) tag, adding or overwriting the data. |
| [try_get_artist(artist)](#try_get_artist_artist_13) | It tries to find EXIF tag Artist, if the tag is not found it returns null |
| [try_get_description(description)](#try_get_description_description_14) | It tries to find EXIF tag ImageDescription, if the tag is not found it returns null |
| [try_get_geo_location(geo_location)](#try_get_geo_location_geo_location_15) | It tries to find EXIF set of tags GPSLatitudeRef, GPSLongitudeRef, GPSLatitude, GPSLongitude, if the tags does not presented it returns null |
| [try_get_image_size(image_size)](#try_get_image_size_image_size_16) | It tries to find EXIF set of tags ImageWidth and ImageHeight, if the tags does not presented it returns null |
| [try_get_modify_date(modify_date)](#try_get_modify_date_modify_date_17) | It tries to find EXIF tag ModifyDate (DataTime), if the tag is not found it returns default DataTime value |


### Method: get_reader(file_name)  [static] {#get_reader_file_name_1}


```
 get_reader(file_name) 
```

Creates a reader instance for EXIF tags

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| file_name | string | Full name of the image file. |

**Returns**

| Type | Description |
| :- | :- |
| [ImageMetadataReader](/psd/python-net/aspose.gis.imagemetadata/imagemetadatareader) | Metadata reader instance |


### Method: get_reader(stream)  [static] {#get_reader_stream_2}


```
 get_reader(stream) 
```

Creates a reader instance for EXIF tags

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| stream | _io.BufferedRandom | Image data source stream |

**Returns**

| Type | Description |
| :- | :- |
| [ImageMetadataReader](/psd/python-net/aspose.gis.imagemetadata/imagemetadatareader) | Metadata reader instance |


### Method: read_data() {#read_data__3}


```
 read_data() 
```

Extracts all supported EXIF tags

**Returns**

| Type | Description |
| :- | :- |
| [ImageData](/psd/python-net/aspose.gis.imagemetadata/imagedata) | ImageData that represented set of supported tags |


### Method: save(file_name) {#save_file_name_4}


```
 save(file_name) 
```

Save to new file since the original one is locked for changes

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| file_name | string | Full name of the destination file |

### Method: save(file_name, format) {#save_file_name_format_5}


```
 save(file_name, format) 
```

Save to new file since the original one is locked for changes

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| file_name | string | Full name of the destination file |
| format | [ImageFormat](/psd/python-net/aspose.gis.imagemetadata/imageformat) | Specifies the format for saving |

### Method: save(stream) {#save_stream_6}


```
 save(stream) 
```

Saving changes to a separate stream

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| stream | _io.BufferedRandom | Destination stream |

### Method: save(stream, format) {#save_stream_format_7}


```
 save(stream, format) 
```

Saving changes to a separate stream

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| stream | _io.BufferedRandom | Destination stream |
| format | [ImageFormat](/psd/python-net/aspose.gis.imagemetadata/imageformat) | Specifies the format for saving |

### Method: set_artist(artist) {#set_artist_artist_8}


```
 set_artist(artist) 
```

Saving the EXIF Artist tag, adding or overwriting the data.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| artist | string | The artist. |

### Method: set_description(description) {#set_description_description_9}


```
 set_description(description) 
```

Saving the EXIF ImageDescription tag, adding or overwriting the data.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| description | string | The description. |

### Method: set_geo_location(latitude, longitude) {#set_geo_location_latitude_longitude_10}


```
 set_geo_location(latitude, longitude) 
```

Saving the EXIF GPSLatitudeRef, GPSLongitudeRef, GPSLatitude and GPSLongitude tags, adding or overwriting the data.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| latitude | double | The latitude. |
| longitude | double | The longitude. |

### Method: set_image_size(width, height) {#set_image_size_width_height_11}


```
 set_image_size(width, height) 
```

Saving the EXIF ImageWidth and ImageHeight tags, adding or overwriting the data.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| width | int | The width. |
| height | int | The height. |

### Method: set_modify_date(modify_date) {#set_modify_date_modify_date_12}


```
 set_modify_date(modify_date) 
```

Saving the EXIF ModifyDate (DataTime) tag, adding or overwriting the data.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| modify_date | datetime | The modify date. |

### Method: try_get_artist(artist) {#try_get_artist_artist_13}


```
 try_get_artist(artist) 
```

It tries to find EXIF tag Artist, if the tag is not found it returns null

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| artist | String | The artist. |

**Returns**

| Type | Description |
| :- | :- |
| bool | True if successful |


### Method: try_get_description(description) {#try_get_description_description_14}


```
 try_get_description(description) 
```

It tries to find EXIF tag ImageDescription, if the tag is not found it returns null

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| description | String | The description. |

**Returns**

| Type | Description |
| :- | :- |
| bool | True if successful |


### Method: try_get_geo_location(geo_location) {#try_get_geo_location_geo_location_15}


```
 try_get_geo_location(geo_location) 
```

It tries to find EXIF set of tags GPSLatitudeRef, GPSLongitudeRef, GPSLatitude, GPSLongitude, if the tags does not presented it returns null

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| geo_location | [GeoLocation[]](/psd/python-net/aspose.gis.imagemetadata/geolocation) | The geo location. |

**Returns**

| Type | Description |
| :- | :- |
| bool | True if successful |


### Method: try_get_image_size(image_size) {#try_get_image_size_image_size_16}


```
 try_get_image_size(image_size) 
```

It tries to find EXIF set of tags ImageWidth and ImageHeight, if the tags does not presented it returns null

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| image_size | [ImageSize[]](/psd/python-net/aspose.gis.imagemetadata/imagesize) | Size of the image. |

**Returns**

| Type | Description |
| :- | :- |
| bool | True if successful |


### Method: try_get_modify_date(modify_date) {#try_get_modify_date_modify_date_17}


```
 try_get_modify_date(modify_date) 
```

It tries to find EXIF tag ModifyDate (DataTime), if the tag is not found it returns default DataTime value

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| modify_date | datetime[] | The modify date. |

**Returns**

| Type | Description |
| :- | :- |
| bool | True if successful |


