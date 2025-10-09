---
title: AbstractPath Class
type: docs
weight: 10
url: /python-net/aspose.gis/abstractpath/
---

**Summary:** An <c>AbstractPath</c> is a base class for classes that specify a unique location in an environment similar to a filesystem,<br/>            like a local filesystem, a remote file storage or a ZIP archive, among others.

**Module:** [aspose.gis](/psd/python-net/aspose.gis/)

**Full Name:** aspose.gis.AbstractPath

**Aspose.PSD Version:** 25.9.0

## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| location | string | r | Gets a string representation of the location of this <c>AbstractPath</c>. |
| separator | char | r | Gets a separator character used to separate directory levels of the [AbstractPath.location](/psd/python-net/aspose.gis/abstractpath/) string. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [combine(location)](#combine_location_1) | Combines this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) with specified path components. |
| delete() | Deletes a file pointed to by this path. |
| [from_local_path(path)](#from_local_path_path_2) | Creates an [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) that represents a location on the local filesystem. |
| [from_stream(stream)](#from_stream_stream_3) | Creates an [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) from a stream. |
| [get_extension()](#get_extension__4) | Returns the extension of this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/). |
| [get_file_name()](#get_file_name__5) | Returns the file name and extension of this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/). |
| [get_file_name_without_extension()](#get_file_name_without_extension__6) | Returns the file name of this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) without the extension. |
| [is_file()](#is_file__7) | Gets a value indicating whether this path points to an existing file that can be opened for reading. |
| [list_directory()](#list_directory__8) | Returns paths located inside this <c>AbstractPath</c>, if it's a directory. |
| [open(access)](#open_access_9) | Opens this <c>AbstractPath</c> as a file. |
| [with_extension(new_extension)](#with_extension_new_extension_10) | Returns a new [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) with the file extension changed to the specified value. |


### Method: combine(location) {#combine_location_1}


```
 combine(location) 
```

Combines this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) with specified path components.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| location | string | A path component to append to this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/). |

**Returns**

| Type | Description |
| :- | :- |
| [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | A new [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) pointing to a [AbstractPath.location](/psd/python-net/aspose.gis/abstractpath/) that is a combination of locations of this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) and<br/>            the argument. |


### Method: from_local_path(path)  [static] {#from_local_path_path_2}


```
 from_local_path(path) 
```

Creates an [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) that represents a location on the local filesystem.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| path | string | A path on the local filesystem, like <c>"C:\\file.shp"</c> or <c>"D:\\directory\\"</c>. |

**Returns**

| Type | Description |
| :- | :- |
| [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | An [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) that represents the location defined by the <paramref name="path" />. |


### Method: from_stream(stream)  [static] {#from_stream_stream_3}


```
 from_stream(stream) 
```

Creates an [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) from a stream.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| stream | _io.BufferedRandom | A stream to create an [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) from. <c>Aspose.GIS</c> does not dispose the stream. |

**Returns**

| Type | Description |
| :- | :- |
| [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | An instance of [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) with the specified stream as its content. |


### Method: get_extension() {#get_extension__4}


```
 get_extension() 
```

Returns the extension of this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/).

**Returns**

| Type | Description |
| :- | :- |
| string | The extension of this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) (including the period ".") or<br/>            an empty string if the [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) has no extension. |


### Method: get_file_name() {#get_file_name__5}


```
 get_file_name() 
```

Returns the file name and extension of this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/).

**Returns**

| Type | Description |
| :- | :- |
| string | The characters after the last [AbstractPath.separator](/psd/python-net/aspose.gis/abstractpath/) character in the [AbstractPath.location](/psd/python-net/aspose.gis/abstractpath/). If the<br/>            last character is the [AbstractPath.separator](/psd/python-net/aspose.gis/abstractpath/) character, an empty string is returned. If there is no<br/>            [AbstractPath.separator](/psd/python-net/aspose.gis/abstractpath/) characters in the [AbstractPath.location](/psd/python-net/aspose.gis/abstractpath/), the [AbstractPath.location](/psd/python-net/aspose.gis/abstractpath/) itself<br/>            is returned. |


### Method: get_file_name_without_extension() {#get_file_name_without_extension__6}


```
 get_file_name_without_extension() 
```

Returns the file name of this [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) without the extension.

**Returns**

| Type | Description |
| :- | :- |
| string | The string returned by [AbstractPath.get_file_name()](/psd/python-net/aspose.gis/abstractpath/) minus the last period and all characters following it. |


### Method: is_file() {#is_file__7}


```
 is_file() 
```

Gets a value indicating whether this path points to an existing file that can be opened for reading.

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if location points to a file; <see langword="false" /> otherwise. |


### Method: list_directory() {#list_directory__8}


```
 list_directory() 
```

Returns paths located inside this <c>AbstractPath</c>, if it's a directory.

**Returns**

| Type | Description |
| :- | :- |
| System.Collections.Generic.IEnumerable<AbstractPath> | Paths located inside this <c>AbstractPath</c>. |


### Method: open(access) {#open_access_9}


```
 open(access) 
```

Opens this <c>AbstractPath</c> as a file.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| access | System.IO.FileAccess | Specifies a subset of operations that can be performed on a stream. |

**Returns**

| Type | Description |
| :- | :- |
| _io.BufferedRandom | A stream opened with the specified FileAccess. |


### Method: with_extension(new_extension) {#with_extension_new_extension_10}


```
 with_extension(new_extension) 
```

Returns a new [AbstractPath](/psd/python-net/aspose.gis/abstractpath/) with the file extension changed to the specified value.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| new_extension | string | A new extension. |

**Returns**

| Type | Description |
| :- | :- |
| [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | A new [AbstractPath](/psd/python-net/aspose.gis/abstractpath/), that points to a file in the same directory, but with a new extension. |


