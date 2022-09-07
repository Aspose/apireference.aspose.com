---
title: RvmLoadOptions
second_title: Aspose.3D for Java API Reference
description: Load options for AVEVA Plant Design Management Systems RVM file.
type: docs
weight: 142
url: /java/com.aspose.threed/rvmloadoptions/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.IOConfig](../../com.aspose.threed/ioconfig), [com.aspose.threed.LoadOptions](../../com.aspose.threed/loadoptions)
```
public class RvmLoadOptions extends LoadOptions
```

Load options for AVEVA Plant Design Management System's RVM file.
## Constructors

| Constructor | Description |
| --- | --- |
| [RvmLoadOptions(FileContentType contentType)](#RvmLoadOptions-com.aspose.threed.FileContentType-) | Construct a com.aspose.threed.RvmLoadOptions instance |
| [RvmLoadOptions()](#RvmLoadOptions--) | Construct a com.aspose.threed.RvmLoadOptions instance |
## Methods

| Method | Description |
| --- | --- |
| [getGenerateMaterials()](#getGenerateMaterials--) | Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. |
| [setGenerateMaterials(boolean value)](#setGenerateMaterials-boolean-) | Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. |
| [getCylinderRadialSegments()](#getCylinderRadialSegments--) | Gets the number of cylinder's radial segments, default value is 16 |
| [setCylinderRadialSegments(int value)](#setCylinderRadialSegments-int-) | Sets the number of cylinder's radial segments, default value is 16 |
| [getDishLongitudeSegments()](#getDishLongitudeSegments--) | Gets the number of dish' longitude segments, default value is 12 |
| [setDishLongitudeSegments(int value)](#setDishLongitudeSegments-int-) | Sets the number of dish' longitude segments, default value is 12 |
| [getDishLatitudeSegments()](#getDishLatitudeSegments--) | Gets the number of dish' latitude segments, default value is 8 |
| [setDishLatitudeSegments(int value)](#setDishLatitudeSegments-int-) | Sets the number of dish' latitude segments, default value is 8 |
| [getTorusTubularSegments()](#getTorusTubularSegments--) | Gets the number of torus' tubular segments, default value is 20 |
| [setTorusTubularSegments(int value)](#setTorusTubularSegments-int-) | Sets the number of torus' tubular segments, default value is 20 |
| [getRectangularTorusSegments()](#getRectangularTorusSegments--) | Gets the number of rectangular torus' radial segments, default value is 20 |
| [setRectangularTorusSegments(int value)](#setRectangularTorusSegments-int-) | Sets the number of rectangular torus' radial segments, default value is 20 |
| [getCenterScene()](#getCenterScene--) | Center the scene after it's loaded. |
| [setCenterScene(boolean value)](#setCenterScene-boolean-) | Center the scene after it's loaded. |
| [getAttributePrefix()](#getAttributePrefix--) | Gets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:" |
| [setAttributePrefix(String value)](#setAttributePrefix-java.lang.String-) | Sets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:" |
| [getLookupAttributes()](#getLookupAttributes--) | Gets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true. |
| [setLookupAttributes(boolean value)](#setLookupAttributes-boolean-) | Sets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true. |
### RvmLoadOptions(FileContentType contentType) {#RvmLoadOptions-com.aspose.threed.FileContentType-}
```
public RvmLoadOptions(FileContentType contentType)
```


Construct a com.aspose.threed.RvmLoadOptions instance

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| contentType | [FileContentType](../../com.aspose.threed/filecontenttype) |  |

### RvmLoadOptions() {#RvmLoadOptions--}
```
public RvmLoadOptions()
```


Construct a com.aspose.threed.RvmLoadOptions instance

### getGenerateMaterials() {#getGenerateMaterials--}
```
public boolean getGenerateMaterials()
```


Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. Default value is true

**Returns:**
boolean
### setGenerateMaterials(boolean value) {#setGenerateMaterials-boolean-}
```
public void setGenerateMaterials(boolean value)
```


Generate materials with random colors for each objects in the scene if color table is not exported within the RVM file. Default value is true

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getCylinderRadialSegments() {#getCylinderRadialSegments--}
```
public int getCylinderRadialSegments()
```


Gets the number of cylinder's radial segments, default value is 16

**Returns:**
int
### setCylinderRadialSegments(int value) {#setCylinderRadialSegments-int-}
```
public void setCylinderRadialSegments(int value)
```


Sets the number of cylinder's radial segments, default value is 16

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getDishLongitudeSegments() {#getDishLongitudeSegments--}
```
public int getDishLongitudeSegments()
```


Gets the number of dish' longitude segments, default value is 12

**Returns:**
int
### setDishLongitudeSegments(int value) {#setDishLongitudeSegments-int-}
```
public void setDishLongitudeSegments(int value)
```


Sets the number of dish' longitude segments, default value is 12

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getDishLatitudeSegments() {#getDishLatitudeSegments--}
```
public int getDishLatitudeSegments()
```


Gets the number of dish' latitude segments, default value is 8

**Returns:**
int
### setDishLatitudeSegments(int value) {#setDishLatitudeSegments-int-}
```
public void setDishLatitudeSegments(int value)
```


Sets the number of dish' latitude segments, default value is 8

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getTorusTubularSegments() {#getTorusTubularSegments--}
```
public int getTorusTubularSegments()
```


Gets the number of torus' tubular segments, default value is 20

**Returns:**
int
### setTorusTubularSegments(int value) {#setTorusTubularSegments-int-}
```
public void setTorusTubularSegments(int value)
```


Sets the number of torus' tubular segments, default value is 20

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getRectangularTorusSegments() {#getRectangularTorusSegments--}
```
public int getRectangularTorusSegments()
```


Gets the number of rectangular torus' radial segments, default value is 20

**Returns:**
int
### setRectangularTorusSegments(int value) {#setRectangularTorusSegments-int-}
```
public void setRectangularTorusSegments(int value)
```


Sets the number of rectangular torus' radial segments, default value is 20

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getCenterScene() {#getCenterScene--}
```
public boolean getCenterScene()
```


Center the scene after it's loaded.

**Returns:**
boolean
### setCenterScene(boolean value) {#setCenterScene-boolean-}
```
public void setCenterScene(boolean value)
```


Center the scene after it's loaded.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getAttributePrefix() {#getAttributePrefix--}
```
public String getAttributePrefix()
```


Gets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:"

**Returns:**
java.lang.String
### setAttributePrefix(String value) {#setAttributePrefix-java.lang.String-}
```
public void setAttributePrefix(String value)
```


Sets the prefix of the attributes that were defined in external attribute files, The prefix are used to avoid name conflicts, default value is "rvm:"

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### getLookupAttributes() {#getLookupAttributes--}
```
public boolean getLookupAttributes()
```


Gets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true.

**Returns:**
boolean
### setLookupAttributes(boolean value) {#setLookupAttributes-boolean-}
```
public void setLookupAttributes(boolean value)
```


Sets whether to load attributes from external attribute list file(.att/.attrib/.txt), default value is true.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

