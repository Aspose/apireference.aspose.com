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

Information of asset. Asset information can be attached to a [Scene](../../com.aspose.threed/scene). Child [Scene](../../com.aspose.threed/scene) can have its own [AssetInfo](../../com.aspose.threed/assetinfo) to override parent's definition.
## Constructors

| Constructor | Description |
| --- | --- |
| [AssetInfo()](#AssetInfo--) | Initializes a new instance of the [AssetInfo](../../com.aspose.threed/assetinfo) class. |
| [AssetInfo(String name)](#AssetInfo-java.lang.String-) | Initializes a new instance of the [AssetInfo](../../com.aspose.threed/assetinfo) class. |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getAmbient()](#getAmbient--) | Gets or Sets the default ambient color of this asset |
| [getApplicationName()](#getApplicationName--) | Gets the application that created this asset |
| [getApplicationVendor()](#getApplicationVendor--) | Gets the application vendor's name |
| [getApplicationVersion()](#getApplicationVersion--) | Gets the version of the application that created this asset. |
| [getAuthor()](#getAuthor--) | Gets the author of this asset |
| [getClass()](#getClass--) |  |
| [getComment()](#getComment--) | Gets the comment of this asset. |
| [getCoordinatedSystem()](#getCoordinatedSystem--) | Gets the coordinate system used in this asset. |
| [getCopyright()](#getCopyright--) | Gets the document's copyright |
| [getCreationTime()](#getCreationTime--) | Gets or Sets the creation time of this asset |
| [getKeywords()](#getKeywords--) | Gets the keywords of this asset |
| [getModificationTime()](#getModificationTime--) | Gets or Sets the modification time of this asset |
| [getName()](#getName--) | Gets the name. |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getRevision()](#getRevision--) | Gets the revision number of this asset, usually used in version control system. |
| [getSubject()](#getSubject--) | Gets the subject of this asset |
| [getTitle()](#getTitle--) | Gets the title of this asset |
| [getUnitName()](#getUnitName--) | Gets the unit of length used in this asset. |
| [getUnitScaleFactor()](#getUnitScaleFactor--) | Gets the scale factor to real-world meter. |
| [getUpVector()](#getUpVector--) | Gets the up-vector used in this asset. |
| [getUrl()](#getUrl--) | Gets or Sets the URL of this asset. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setAmbient(Vector4 value)](#setAmbient-com.aspose.threed.Vector4-) | Gets or Sets the default ambient color of this asset |
| [setApplicationName(String value)](#setApplicationName-java.lang.String-) | Sets the application that created this asset |
| [setApplicationVendor(String value)](#setApplicationVendor-java.lang.String-) | Sets the application vendor's name |
| [setApplicationVersion(String value)](#setApplicationVersion-java.lang.String-) | Sets the version of the application that created this asset. |
| [setAuthor(String value)](#setAuthor-java.lang.String-) | Sets the author of this asset |
| [setComment(String value)](#setComment-java.lang.String-) | Sets the comment of this asset. |
| [setCoordinatedSystem(CoordinatedSystem value)](#setCoordinatedSystem-com.aspose.threed.CoordinatedSystem-) | Sets the coordinate system used in this asset. |
| [setCopyright(String value)](#setCopyright-java.lang.String-) | Sets the document's copyright |
| [setCreationTime(Calendar value)](#setCreationTime-java.util.Calendar-) | Gets or Sets the creation time of this asset |
| [setKeywords(String value)](#setKeywords-java.lang.String-) | Sets the keywords of this asset |
| [setModificationTime(Calendar value)](#setModificationTime-java.util.Calendar-) | Gets or Sets the modification time of this asset |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setRevision(String value)](#setRevision-java.lang.String-) | Sets the revision number of this asset, usually used in version control system. |
| [setSubject(String value)](#setSubject-java.lang.String-) | Sets the subject of this asset |
| [setTitle(String value)](#setTitle-java.lang.String-) | Sets the title of this asset |
| [setUnitName(String value)](#setUnitName-java.lang.String-) | Sets the unit of length used in this asset. |
| [setUnitScaleFactor(double value)](#setUnitScaleFactor-double-) | Sets the scale factor to real-world meter. |
| [setUpVector(Axis value)](#setUpVector-com.aspose.threed.Axis-) | Sets the up-vector used in this asset. |
| [setUrl(String value)](#setUrl-java.lang.String-) | Gets or Sets the URL of this asset. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AssetInfo() {#AssetInfo--}
```
public AssetInfo()
```


Initializes a new instance of the [AssetInfo](../../com.aspose.threed/assetinfo) class.

### AssetInfo(String name) {#AssetInfo-java.lang.String-}
```
public AssetInfo(String name)
```


Initializes a new instance of the [AssetInfo](../../com.aspose.threed/assetinfo) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propertyName | java.lang.String | Property name. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### getAmbient() {#getAmbient--}
```
public Vector4 getAmbient()
```


Gets or Sets the default ambient color of this asset

**Returns:**
[Vector4](../../com.aspose.threed/vector4)
### getApplicationName() {#getApplicationName--}
```
public String getApplicationName()
```


Gets the application that created this asset

**Returns:**
java.lang.String
### getApplicationVendor() {#getApplicationVendor--}
```
public String getApplicationVendor()
```


Gets the application vendor's name

**Returns:**
java.lang.String
### getApplicationVersion() {#getApplicationVersion--}
```
public String getApplicationVersion()
```


Gets the version of the application that created this asset.

**Returns:**
java.lang.String
### getAuthor() {#getAuthor--}
```
public String getAuthor()
```


Gets the author of this asset

**Returns:**
java.lang.String
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getComment() {#getComment--}
```
public String getComment()
```


Gets the comment of this asset.

**Returns:**
java.lang.String
### getCoordinatedSystem() {#getCoordinatedSystem--}
```
public CoordinatedSystem getCoordinatedSystem()
```


Gets the coordinate system used in this asset.

**Returns:**
[CoordinatedSystem](../../com.aspose.threed/coordinatedsystem)
### getCopyright() {#getCopyright--}
```
public String getCopyright()
```


Gets the document's copyright

**Returns:**
java.lang.String
### getCreationTime() {#getCreationTime--}
```
public Calendar getCreationTime()
```


Gets or Sets the creation time of this asset

**Returns:**
java.util.Calendar
### getKeywords() {#getKeywords--}
```
public String getKeywords()
```


Gets the keywords of this asset

**Returns:**
java.lang.String
### getModificationTime() {#getModificationTime--}
```
public Calendar getModificationTime()
```


Gets or Sets the modification time of this asset

**Returns:**
java.util.Calendar
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection)
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Get the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |

**Returns:**
java.lang.Object - The value of the found property
### getRevision() {#getRevision--}
```
public String getRevision()
```


Gets the revision number of this asset, usually used in version control system.

**Returns:**
java.lang.String
### getSubject() {#getSubject--}
```
public String getSubject()
```


Gets the subject of this asset

**Returns:**
java.lang.String
### getTitle() {#getTitle--}
```
public String getTitle()
```


Gets the title of this asset

**Returns:**
java.lang.String
### getUnitName() {#getUnitName--}
```
public String getUnitName()
```


Gets the unit of length used in this asset. e.g. cm/m/km/inch/feet

**Returns:**
java.lang.String
### getUnitScaleFactor() {#getUnitScaleFactor--}
```
public double getUnitScaleFactor()
```


Gets the scale factor to real-world meter.

**Returns:**
double
### getUpVector() {#getUpVector--}
```
public Axis getUpVector()
```


Gets the up-vector used in this asset.

**Returns:**
[Axis](../../com.aspose.threed/axis)
### getUrl() {#getUrl--}
```
public String getUrl()
```


Gets or Sets the URL of this asset.

**Returns:**
java.lang.String
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Removes a dynamic property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Remove the specified property identified by name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String |  |

**Returns:**
boolean
### setAmbient(Vector4 value) {#setAmbient-com.aspose.threed.Vector4-}
```
public void setAmbient(Vector4 value)
```


Gets or Sets the default ambient color of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector4](../../com.aspose.threed/vector4) | New value |

### setApplicationName(String value) {#setApplicationName-java.lang.String-}
```
public void setApplicationName(String value)
```


Sets the application that created this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setApplicationVendor(String value) {#setApplicationVendor-java.lang.String-}
```
public void setApplicationVendor(String value)
```


Sets the application vendor's name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setApplicationVersion(String value) {#setApplicationVersion-java.lang.String-}
```
public void setApplicationVersion(String value)
```


Sets the version of the application that created this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setAuthor(String value) {#setAuthor-java.lang.String-}
```
public void setAuthor(String value)
```


Sets the author of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setComment(String value) {#setComment-java.lang.String-}
```
public void setComment(String value)
```


Sets the comment of this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setCoordinatedSystem(CoordinatedSystem value) {#setCoordinatedSystem-com.aspose.threed.CoordinatedSystem-}
```
public void setCoordinatedSystem(CoordinatedSystem value)
```


Sets the coordinate system used in this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [CoordinatedSystem](../../com.aspose.threed/coordinatedsystem) | New value |

### setCopyright(String value) {#setCopyright-java.lang.String-}
```
public void setCopyright(String value)
```


Sets the document's copyright

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setCreationTime(Calendar value) {#setCreationTime-java.util.Calendar-}
```
public void setCreationTime(Calendar value)
```


Gets or Sets the creation time of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.Calendar | New value |

### setKeywords(String value) {#setKeywords-java.lang.String-}
```
public void setKeywords(String value)
```


Sets the keywords of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setModificationTime(Calendar value) {#setModificationTime-java.util.Calendar-}
```
public void setModificationTime(Calendar value)
```


Gets or Sets the modification time of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.Calendar | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Sets the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |
| value | java.lang.Object | The value of the property |

### setRevision(String value) {#setRevision-java.lang.String-}
```
public void setRevision(String value)
```


Sets the revision number of this asset, usually used in version control system.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setSubject(String value) {#setSubject-java.lang.String-}
```
public void setSubject(String value)
```


Sets the subject of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setTitle(String value) {#setTitle-java.lang.String-}
```
public void setTitle(String value)
```


Sets the title of this asset

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setUnitName(String value) {#setUnitName-java.lang.String-}
```
public void setUnitName(String value)
```


Sets the unit of length used in this asset. e.g. cm/m/km/inch/feet

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setUnitScaleFactor(double value) {#setUnitScaleFactor-double-}
```
public void setUnitScaleFactor(double value)
```


Sets the scale factor to real-world meter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | double | New value |

### setUpVector(Axis value) {#setUpVector-com.aspose.threed.Axis-}
```
public void setUpVector(Axis value)
```


Sets the up-vector used in this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Axis](../../com.aspose.threed/axis) | New value |

### setUrl(String value) {#setUrl-java.lang.String-}
```
public void setUrl(String value)
```


Gets or Sets the URL of this asset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

