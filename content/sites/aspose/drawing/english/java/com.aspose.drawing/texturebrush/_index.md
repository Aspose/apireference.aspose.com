---
title: TextureBrush
second_title: Aspose.Drawing for Java API Reference
description: Each property of the TextureBrush class is a Brush object that uses an image to fill the interior of a shape.
type: docs
weight: 53
url: /java/com.aspose.drawing/texturebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.drawing.Brush](../../com.aspose.drawing/brush)
```
public final class TextureBrush extends Brush
```

Each property of the TextureBrush class is a Brush object that uses an image to fill the interior of a shape. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [TextureBrush(Image bitmap)](#TextureBrush-com.aspose.drawing.Image-) | Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image. |
| [TextureBrush(Image image, int wrapMode)](#TextureBrush-com.aspose.drawing.Image-int-) | Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image and wrap mode. |
| [TextureBrush(Image image, int wrapMode, RectangleF dstRect)](#TextureBrush-com.aspose.drawing.Image-int-com.aspose.drawing.RectangleF-) | Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image, wrap mode, and bounding rectangle. |
| [TextureBrush(Image image, RectangleF dstRect)](#TextureBrush-com.aspose.drawing.Image-com.aspose.drawing.RectangleF-) | Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image, and bounding rectangle. |
| [TextureBrush(Image image, RectangleF dstRect, ImageAttributes imageAttr)](#TextureBrush-com.aspose.drawing.Image-com.aspose.drawing.RectangleF-com.aspose.drawing.imaging.ImageAttributes-) | Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image, bounding rectangle, and image attributes. |
## Methods

| Method | Description |
| --- | --- |
| [getImage()](#getImage--) | Gets the Image object associated with this TextureBrush object. |
| [getTransform()](#getTransform--) | Gets a copy of the Matrix object that defines a local geometric transformation for the image associated with this TextureBrush object. |
| [setTransform(Matrix value)](#setTransform-com.aspose.drawing.drawing2d.Matrix-) | Sets a copy of the Matrix object that defines a local geometric transformation for the image associated with this TextureBrush object. |
| [getWrapMode()](#getWrapMode--) | Gets a WrapMode enumeration that indicates the wrap mode for this TextureBrush object. |
| [setWrapMode(int value)](#setWrapMode-int-) | Sets a WrapMode enumeration that indicates the wrap mode for this TextureBrush object. |
| [deepClone()](#deepClone--) | Creates an exact copy of this [TextureBrush](../../com.aspose.drawing/texturebrush) object. |
| [resetTransform()](#resetTransform--) | Resets the Transform property of this [TextureBrush](../../com.aspose.drawing/texturebrush) object to identity. |
| [multiplyTransform(Matrix matrix)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-) | Multiplies the [Matrix](../../com.aspose.drawing.drawing2d/matrix) object that represents the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) object by prepending the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) object. |
| [multiplyTransform(Matrix matrix, int order)](#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-) | Multiplies the [Matrix](../../com.aspose.drawing.drawing2d/matrix) object that represents the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) object in the specified order. |
| [translateTransform(float dx, float dy)](#translateTransform-float-float-) | Translates the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified dimensions. |
| [translateTransform(float dx, float dy, int order)](#translateTransform-float-float-int-) | Translates the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified dimensions in the specified order. |
| [scaleTransform(float sx, float sy)](#scaleTransform-float-float-) | Scales the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified amounts. |
| [scaleTransform(float sx, float sy, int order)](#scaleTransform-float-float-int-) | Scales the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified amounts in the specified order. |
| [rotateTransform(float angle)](#rotateTransform-float-) | Rotates the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified amount. |
| [rotateTransform(float angle, int order)](#rotateTransform-float-int-) | Rotates the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified amount in the specified order. |
### TextureBrush(Image bitmap) {#TextureBrush-com.aspose.drawing.Image-}
```
public TextureBrush(Image bitmap)
```


Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| bitmap | [Image](../../com.aspose.drawing/image) | The `Image`([.getImage](../../null/\#getImage)) object with which this [TextureBrush](../../com.aspose.drawing/texturebrush) object fills interiors. |

### TextureBrush(Image image, int wrapMode) {#TextureBrush-com.aspose.drawing.Image-int-}
```
public TextureBrush(Image image, int wrapMode)
```


Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image and wrap mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | The image. |
| wrapMode | int | A `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) enumeration that specifies how this [TextureBrush](../../com.aspose.drawing/texturebrush) object is tiled. |

### TextureBrush(Image image, int wrapMode, RectangleF dstRect) {#TextureBrush-com.aspose.drawing.Image-int-com.aspose.drawing.RectangleF-}
```
public TextureBrush(Image image, int wrapMode, RectangleF dstRect)
```


Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image, wrap mode, and bounding rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | The image. |
| wrapMode | int | A `WrapMode`([.getWrapMode](../../null/\#getWrapMode)/[.setWrapMode(int)](../../null/\#setWrapMode-int-)) enumeration that specifies how this [TextureBrush](../../com.aspose.drawing/texturebrush) object is tiled. |
| dstRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents the bounding rectangle for this [TextureBrush](../../com.aspose.drawing/texturebrush) object. |

### TextureBrush(Image image, RectangleF dstRect) {#TextureBrush-com.aspose.drawing.Image-com.aspose.drawing.RectangleF-}
```
public TextureBrush(Image image, RectangleF dstRect)
```


Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image, and bounding rectangle.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | The `Image`([.getImage](../../null/\#getImage)) object with which this [TextureBrush](../../com.aspose.drawing/texturebrush) object fills interiors. |
| dstRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents the bounding rectangle for this [TextureBrush](../../com.aspose.drawing/texturebrush) object. |

### TextureBrush(Image image, RectangleF dstRect, ImageAttributes imageAttr) {#TextureBrush-com.aspose.drawing.Image-com.aspose.drawing.RectangleF-com.aspose.drawing.imaging.ImageAttributes-}
```
public TextureBrush(Image image, RectangleF dstRect, ImageAttributes imageAttr)
```


Initializes a new instance of the [TextureBrush](../../com.aspose.drawing/texturebrush) class that uses the specified image, bounding rectangle, and image attributes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| image | [Image](../../com.aspose.drawing/image) | The Image object with which this TextureBrush object fills interiors. |
| dstRect | [RectangleF](../../com.aspose.drawing/rectanglef) | A RectangleF structure that represents the bounding rectangle for this TextureBrush object. |
| imageAttr | [ImageAttributes](../../com.aspose.drawing.imaging/imageattributes) | An ImageAttributes object that contains additional information about the image used by this TextureBrush object. |

### getImage() {#getImage--}
```
public Image getImage()
```


Gets the Image object associated with this TextureBrush object.

**Returns:**
[Image](../../com.aspose.drawing/image) - the Image object associated with this TextureBrush object.
### getTransform() {#getTransform--}
```
public Matrix getTransform()
```


Gets a copy of the Matrix object that defines a local geometric transformation for the image associated with this TextureBrush object.

**Returns:**
[Matrix](../../com.aspose.drawing.drawing2d/matrix) - a copy of the Matrix object that defines a local geometric transformation for the image associated with this TextureBrush object.
### setTransform(Matrix value) {#setTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public void setTransform(Matrix value)
```


Sets a copy of the Matrix object that defines a local geometric transformation for the image associated with this TextureBrush object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | a copy of the Matrix object that defines a local geometric transformation for the image associated with this TextureBrush object. |

### getWrapMode() {#getWrapMode--}
```
public int getWrapMode()
```


Gets a WrapMode enumeration that indicates the wrap mode for this TextureBrush object.

**Returns:**
int - a WrapMode enumeration that indicates the wrap mode for this TextureBrush object.
### setWrapMode(int value) {#setWrapMode-int-}
```
public void setWrapMode(int value)
```


Sets a WrapMode enumeration that indicates the wrap mode for this TextureBrush object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | a WrapMode enumeration that indicates the wrap mode for this TextureBrush object. |

### deepClone() {#deepClone--}
```
public Object deepClone()
```


Creates an exact copy of this [TextureBrush](../../com.aspose.drawing/texturebrush) object.

**Returns:**
java.lang.Object - The [TextureBrush](../../com.aspose.drawing/texturebrush) object this method creates, cast as an Object object.
### resetTransform() {#resetTransform--}
```
public void resetTransform()
```


Resets the Transform property of this [TextureBrush](../../com.aspose.drawing/texturebrush) object to identity.

### multiplyTransform(Matrix matrix) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-}
```
public void multiplyTransform(Matrix matrix)
```


Multiplies the [Matrix](../../com.aspose.drawing.drawing2d/matrix) object that represents the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) object by prepending the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) object by which to multiply the geometric transformation. |

### multiplyTransform(Matrix matrix, int order) {#multiplyTransform-com.aspose.drawing.drawing2d.Matrix-int-}
```
public void multiplyTransform(Matrix matrix, int order)
```


Multiplies the [Matrix](../../com.aspose.drawing.drawing2d/matrix) object that represents the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix) object in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) object by which to multiply the geometric transformation. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) enumeration that specifies the order in which to multiply the two matrices. |

### translateTransform(float dx, float dy) {#translateTransform-float-float-}
```
public void translateTransform(float dx, float dy)
```


Translates the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified dimensions. This method prepends the translation to the transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The dimension by which to translate the transformation in the x direction. |
| dy | float | The dimension by which to translate the transformation in the y direction. |

### translateTransform(float dx, float dy, int order) {#translateTransform-float-float-int-}
```
public void translateTransform(float dx, float dy, int order)
```


Translates the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified dimensions in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The dimension by which to translate the transformation in the x direction. |
| dy | float | The dimension by which to translate the transformation in the y direction. |
| order | int | The order (prepend or append) in which to apply the translation. |

### scaleTransform(float sx, float sy) {#scaleTransform-float-float-}
```
public void scaleTransform(float sx, float sy)
```


Scales the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified amounts. This method prepends the scaling matrix to the transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | The amount by which to scale the transformation in the x direction. |
| sy | float | The amount by which to scale the transformation in the y direction. |

### scaleTransform(float sx, float sy, int order) {#scaleTransform-float-float-int-}
```
public void scaleTransform(float sx, float sy, int order)
```


Scales the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified amounts in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sx | float | The amount by which to scale the transformation in the x direction. |
| sy | float | The amount by which to scale the transformation in the y direction. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) enumeration that specifies whether to append or prepend the scaling matrix. |

### rotateTransform(float angle) {#rotateTransform-float-}
```
public void rotateTransform(float angle)
```


Rotates the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified amount. This method prepends the rotation to the transformation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of rotation. |

### rotateTransform(float angle, int order) {#rotateTransform-float-int-}
```
public void rotateTransform(float angle, int order)
```


Rotates the local geometric transformation of this [TextureBrush](../../com.aspose.drawing/texturebrush) object by the specified amount in the specified order.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| angle | float | The angle of rotation. |
| order | int | A [MatrixOrder](../../com.aspose.drawing.drawing2d/matrixorder) enumeration that specifies whether to append or prepend the rotation matrix. |

