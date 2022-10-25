---
title: AssetInfo
second_title: Aspose.3D for Java API Reference
description: Information of asset.
type: docs
weight: 17
url: /java/com.aspose.threed/assetinfo/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject)
```
public class AssetInfo extends A3DObject
```

Information of asset. Asset information can be attached to a com.aspose.threed.Scene. Child com.aspose.threed.Scene can have its own com.aspose.threed.AssetInfo to override parent's definition.
## Constructors

| Constructor | Description |
| --- | --- |
| [AssetInfo()](#AssetInfo--) | Initializes a new instance of the com.aspose.threed.AssetInfo class. |
| [AssetInfo(String name)](#AssetInfo-java.lang.String-) | Initializes a new instance of the com.aspose.threed.AssetInfo class. |
## Methods

| Method | Description |
| --- | --- |
| [getCreationTime()](#getCreationTime--) | Gets or Sets the creation time of this asset |
| [setCreationTime(Calendar value)](#setCreationTime-java.util.Calendar-) | Gets or Sets the creation time of this asset |
| [getModificationTime()](#getModificationTime--) | Gets or Sets the modification time of this asset |
| [setModificationTime(Calendar value)](#setModificationTime-java.util.Calendar-) | Gets or Sets the modification time of this asset |
| [getAmbient()](#getAmbient--) | Gets or Sets the default ambient color of this asset |
| [setAmbient(Vector4 value)](#setAmbient-com.aspose.threed.Vector4-) | Gets or Sets the default ambient color of this asset |
| [getUrl()](#getUrl--) | Gets or Sets the URL of this asset. |
| [setUrl(String value)](#setUrl-java.lang.String-) | Gets or Sets the URL of this asset. |
| [getApplicationVendor()](#getApplicationVendor--) | Gets the application vendor's name |
| [setApplicationVendor(String value)](#setApplicationVendor-java.lang.String-) | Sets the application vendor's name |
| [getCopyright()](#getCopyright--) | Gets the document's copyright |
| [setCopyright(String value)](#setCopyright-java.lang.String-) | Sets the document's copyright |
| [getApplicationName()](#getApplicationName--) | Gets the application that created this asset |
| [setApplicationName(String value)](#setApplicationName-java.lang.String-) | Sets the application that created this asset |
| [getApplicationVersion()](#getApplicationVersion--) | Gets the version of the application that created this asset. |
| [setApplicationVersion(String value)](#setApplicationVersion-java.lang.String-) | Sets the version of the application that created this asset. |
| [getTitle()](#getTitle--) | Gets the title of this asset |
| [setTitle(String value)](#setTitle-java.lang.String-) | Sets the title of this asset |
| [getSubject()](#getSubject--) | Gets the subject of this asset |
| [setSubject(String value)](#setSubject-java.lang.String-) | Sets the subject of this asset |
| [getAuthor()](#getAuthor--) | Gets the author of this asset |
| [setAuthor(String value)](#setAuthor-java.lang.String-) | Sets the author of this asset |
| [getKeywords()](#getKeywords--) | Gets the keywords of this asset |
| [setKeywords(String value)](#setKeywords-java.lang.String-) | Sets the keywords of this asset |
| [getRevision()](#getRevision--) | Gets the revision number of this asset, usually used in version control system. |
| [setRevision(String value)](#setRevision-java.lang.String-) | Sets the revision number of this asset, usually used in version control system. |
| [getComment()](#getComment--) | Gets the comment of this asset. |
| [setComment(String value)](#setComment-java.lang.String-) | Sets the comment of this asset. |
| [getUnitName()](#getUnitName--) | Gets the unit of length used in this asset. |
| [setUnitName(String value)](#setUnitName-java.lang.String-) | Sets the unit of length used in this asset. |
| [getUnitScaleFactor()](#getUnitScaleFactor--) | Gets the scale factor to real-world meter. |
| [setUnitScaleFactor(double value)](#setUnitScaleFactor-double-) | Sets the scale factor to real-world meter. |
| [getCoordinatedSystem()](#getCoordinatedSystem--) | Gets the coordinate system used in this asset. |
| [setCoordinatedSystem(CoordinatedSystem value)](#setCoordinatedSystem-com.aspose.threed.CoordinatedSystem-) | Sets the coordinate system used in this asset. |
| [getUpVector()](#getUpVector--) | Gets the up-vector used in this asset. |
| [setUpVector(Axis value)](#setUpVector-com.aspose.threed.Axis-) | Sets the up-vector used in this asset. |
### AssetInfo() {#AssetInfo--}
```
public AssetInfo()
```


Initializes a new instance of the com.aspose.threed.AssetInfo class.

### AssetInfo(String name) {#AssetInfo-java.lang.String-}
```
public AssetInfo(String name)
```


Initializes a new instance of the com.aspose.threed.AssetInfo class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### getCreationTime() {#getCreationTime--}
```
public Calendar getCreationTime()
```


Gets or Sets the creation time of this asset

**Returns:**
java.util.Calendar
### setCreationTime(Calendar value) {#setCreationTime-java.util.Calendar-}
```
public void setCreationTime(Calendar value)
```


Gets or Sets the creation time of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.Calendar | New value |

### getModificationTime() {#getModificationTime--}
```
public Calendar getModificationTime()
```


Gets or Sets the modification time of this asset

**Returns:**
java.util.Calendar
### setModificationTime(Calendar value) {#setModificationTime-java.util.Calendar-}
```
public void setModificationTime(Calendar value)
```


Gets or Sets the modification time of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.Calendar | New value |

### getAmbient() {#getAmbient--}
```
public Vector4 getAmbient()
```


Gets or Sets the default ambient color of this asset

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
### setAmbient(Vector4 value) {#setAmbient-com.aspose.threed.Vector4-}
```
public void setAmbient(Vector4 value)
```


Gets or Sets the default ambient color of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector4](../../com.aspose.threed/vector4) | New value |

### getUrl() {#getUrl--}
```
public String getUrl()
```


Gets or Sets the URL of this asset.

**Returns:**
java.lang.String
### setUrl(String value) {#setUrl-java.lang.String-}
```
public void setUrl(String value)
```


Gets or Sets the URL of this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getApplicationVendor() {#getApplicationVendor--}
```
public String getApplicationVendor()
```


Gets the application vendor's name

**Returns:**
java.lang.String
### setApplicationVendor(String value) {#setApplicationVendor-java.lang.String-}
```
public void setApplicationVendor(String value)
```


Sets the application vendor's name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getCopyright() {#getCopyright--}
```
public String getCopyright()
```


Gets the document's copyright

**Returns:**
java.lang.String
### setCopyright(String value) {#setCopyright-java.lang.String-}
```
public void setCopyright(String value)
```


Sets the document's copyright

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getApplicationName() {#getApplicationName--}
```
public String getApplicationName()
```


Gets the application that created this asset

**Returns:**
java.lang.String
### setApplicationName(String value) {#setApplicationName-java.lang.String-}
```
public void setApplicationName(String value)
```


Sets the application that created this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getApplicationVersion() {#getApplicationVersion--}
```
public String getApplicationVersion()
```


Gets the version of the application that created this asset.

**Returns:**
java.lang.String
### setApplicationVersion(String value) {#setApplicationVersion-java.lang.String-}
```
public void setApplicationVersion(String value)
```


Sets the version of the application that created this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getTitle() {#getTitle--}
```
public String getTitle()
```


Gets the title of this asset

**Returns:**
java.lang.String
### setTitle(String value) {#setTitle-java.lang.String-}
```
public void setTitle(String value)
```


Sets the title of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getSubject() {#getSubject--}
```
public String getSubject()
```


Gets the subject of this asset

**Returns:**
java.lang.String
### setSubject(String value) {#setSubject-java.lang.String-}
```
public void setSubject(String value)
```


Sets the subject of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getAuthor() {#getAuthor--}
```
public String getAuthor()
```


Gets the author of this asset

**Returns:**
java.lang.String
### setAuthor(String value) {#setAuthor-java.lang.String-}
```
public void setAuthor(String value)
```


Sets the author of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getKeywords() {#getKeywords--}
```
public String getKeywords()
```


Gets the keywords of this asset

**Returns:**
java.lang.String
### setKeywords(String value) {#setKeywords-java.lang.String-}
```
public void setKeywords(String value)
```


Sets the keywords of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getRevision() {#getRevision--}
```
public String getRevision()
```


Gets the revision number of this asset, usually used in version control system.

**Returns:**
java.lang.String
### setRevision(String value) {#setRevision-java.lang.String-}
```
public void setRevision(String value)
```


Sets the revision number of this asset, usually used in version control system.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getComment() {#getComment--}
```
public String getComment()
```


Gets the comment of this asset.

**Returns:**
java.lang.String
### setComment(String value) {#setComment-java.lang.String-}
```
public void setComment(String value)
```


Sets the comment of this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getUnitName() {#getUnitName--}
```
public String getUnitName()
```


Gets the unit of length used in this asset. e.g. cm/m/km/inch/feet

**Returns:**
java.lang.String
### setUnitName(String value) {#setUnitName-java.lang.String-}
```
public void setUnitName(String value)
```


Sets the unit of length used in this asset. e.g. cm/m/km/inch/feet

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getUnitScaleFactor() {#getUnitScaleFactor--}
```
public double getUnitScaleFactor()
```


Gets the scale factor to real-world meter.

**Returns:**
double
### setUnitScaleFactor(double value) {#setUnitScaleFactor-double-}
```
public void setUnitScaleFactor(double value)
```


Sets the scale factor to real-world meter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### getCoordinatedSystem() {#getCoordinatedSystem--}
```
public CoordinatedSystem getCoordinatedSystem()
```


Gets the coordinate system used in this asset.

**Returns:**
[CoordinatedSystem](../../com.aspose.threed/coordinatedsystem)
### setCoordinatedSystem(CoordinatedSystem value) {#setCoordinatedSystem-com.aspose.threed.CoordinatedSystem-}
```
public void setCoordinatedSystem(CoordinatedSystem value)
```


Sets the coordinate system used in this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [CoordinatedSystem](../../com.aspose.threed/coordinatedsystem) | New value |

### getUpVector() {#getUpVector--}
```
public Axis getUpVector()
```


Gets the up-vector used in this asset.

**Returns:**
[Axis](../../com.aspose.threed/axis)
### setUpVector(Axis value) {#setUpVector-com.aspose.threed.Axis-}
```
public void setUpVector(Axis value)
```


Sets the up-vector used in this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Axis](../../com.aspose.threed/axis) | New value |

