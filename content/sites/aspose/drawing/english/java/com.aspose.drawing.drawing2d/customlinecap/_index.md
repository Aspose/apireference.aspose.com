---
title: CustomLineCap
second_title: Aspose.Drawing for Java API Reference
description: Encapsulates a custom user-defined line cap.
type: docs
weight: 17
url: /java/com.aspose.drawing.drawing2d/customlinecap/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public class CustomLineCap implements System.IDisposable
```

Encapsulates a custom user-defined line cap.
## Constructors

| Constructor | Description |
| --- | --- |
| [CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath)](#CustomLineCap-com.aspose.drawing.drawing2d.GraphicsPath-com.aspose.drawing.drawing2d.GraphicsPath-) | Initializes a new instance of the [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) class with the specified outline and fill. |
| [CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath, int baseCap)](#CustomLineCap-com.aspose.drawing.drawing2d.GraphicsPath-com.aspose.drawing.drawing2d.GraphicsPath-int-) | Initializes a new instance of the [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) class from the specified existing [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration with the specified outline and fill. |
| [CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath, int baseCap, float baseInset)](#CustomLineCap-com.aspose.drawing.drawing2d.GraphicsPath-com.aspose.drawing.drawing2d.GraphicsPath-int-float-) | Initializes a new instance of the [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) class from the specified existing [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration with the specified outline, fill, and inset. |
## Methods

| Method | Description |
| --- | --- |
| [getStrokeJoin()](#getStrokeJoin--) | Gets the [LineJoin](../../com.aspose.drawing.drawing2d/linejoin) enumeration that determines how lines that compose this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) object are joined. |
| [setStrokeJoin(int value)](#setStrokeJoin-int-) | Sets the [LineJoin](../../com.aspose.drawing.drawing2d/linejoin) enumeration that determines how lines that compose this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) object are joined. |
| [getBaseCap()](#getBaseCap--) | Gets the [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration on which this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) is based. |
| [setBaseCap(int value)](#setBaseCap-int-) | Sets the [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration on which this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) is based. |
| [getBaseInset()](#getBaseInset--) | Gets the distance between the cap and the line. |
| [setBaseInset(float value)](#setBaseInset-float-) | Sets the distance between the cap and the line. |
| [getWidthScale()](#getWidthScale--) | Gets the amount by which to scale this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) Class object with respect to the width of the [Pen](../../com.aspose.drawing/pen) object. |
| [setWidthScale(float value)](#setWidthScale-float-) | Sets the amount by which to scale this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) Class object with respect to the width of the [Pen](../../com.aspose.drawing/pen) object. |
| [dispose()](#dispose--) | Releases all resources used by this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) object. |
| [deepClone()](#deepClone--) | Creates an exact copy of this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap). |
| [setStrokeCaps(int startCap, int endCap)](#setStrokeCaps-int-int-) | Sets the caps used to start and end lines that make up this custom cap. |
| [getStrokeCaps(int[] startCap, int[] endCap)](#getStrokeCaps-int---int---) | Gets the caps used to start and end lines that make up this custom cap. |
| [getFillPath()](#getFillPath--) |  |
| [getStrokePath()](#getStrokePath--) | Gets the object that defines the outline of the custom cap. |
### CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath) {#CustomLineCap-com.aspose.drawing.drawing2d.GraphicsPath-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath)
```


Initializes a new instance of the [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) class with the specified outline and fill.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fillPath | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | A [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object that defines the fill for the custom cap. |
| strokePath | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | A [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object that defines the outline of the custom cap. |

### CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath, int baseCap) {#CustomLineCap-com.aspose.drawing.drawing2d.GraphicsPath-com.aspose.drawing.drawing2d.GraphicsPath-int-}
```
public CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath, int baseCap)
```


Initializes a new instance of the [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) class from the specified existing [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration with the specified outline and fill.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fillPath | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | A [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object that defines the fill for the custom cap. |
| strokePath | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | A [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object that defines the outline of the custom cap. |
| baseCap | int | The line cap from which to create the custom cap. |

### CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath, int baseCap, float baseInset) {#CustomLineCap-com.aspose.drawing.drawing2d.GraphicsPath-com.aspose.drawing.drawing2d.GraphicsPath-int-float-}
```
public CustomLineCap(GraphicsPath fillPath, GraphicsPath strokePath, int baseCap, float baseInset)
```


Initializes a new instance of the [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) class from the specified existing [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration with the specified outline, fill, and inset.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| fillPath | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | A [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object that defines the fill for the custom cap. |
| strokePath | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | A [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object that defines the outline of the custom cap. |
| baseCap | int | The line cap from which to create the custom cap. |
| baseInset | float | The distance between the cap and the line. |

### getStrokeJoin() {#getStrokeJoin--}
```
public final int getStrokeJoin()
```


Gets the [LineJoin](../../com.aspose.drawing.drawing2d/linejoin) enumeration that determines how lines that compose this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) object are joined.

**Returns:**
int - the [LineJoin](../../com.aspose.drawing.drawing2d/linejoin) enumeration that determines how lines that compose this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) object are joined.
### setStrokeJoin(int value) {#setStrokeJoin-int-}
```
public final void setStrokeJoin(int value)
```


Sets the [LineJoin](../../com.aspose.drawing.drawing2d/linejoin) enumeration that determines how lines that compose this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) object are joined.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the [LineJoin](../../com.aspose.drawing.drawing2d/linejoin) enumeration that determines how lines that compose this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) object are joined. |

### getBaseCap() {#getBaseCap--}
```
public final int getBaseCap()
```


Gets the [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration on which this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) is based.

**Returns:**
int - the [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration on which this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) is based.
### setBaseCap(int value) {#setBaseCap-int-}
```
public final void setBaseCap(int value)
```


Sets the [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration on which this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) is based.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | the [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration on which this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) is based. |

### getBaseInset() {#getBaseInset--}
```
public final float getBaseInset()
```


Gets the distance between the cap and the line.

**Returns:**
float - the distance between the cap and the line.
### setBaseInset(float value) {#setBaseInset-float-}
```
public final void setBaseInset(float value)
```


Sets the distance between the cap and the line.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the distance between the cap and the line. |

### getWidthScale() {#getWidthScale--}
```
public final float getWidthScale()
```


Gets the amount by which to scale this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) Class object with respect to the width of the [Pen](../../com.aspose.drawing/pen) object.

**Returns:**
float - the amount by which to scale this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) Class object with respect to the width of the [Pen](../../com.aspose.drawing/pen) object.
### setWidthScale(float value) {#setWidthScale-float-}
```
public final void setWidthScale(float value)
```


Sets the amount by which to scale this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) Class object with respect to the width of the [Pen](../../com.aspose.drawing/pen) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | the amount by which to scale this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) Class object with respect to the width of the [Pen](../../com.aspose.drawing/pen) object. |

### dispose() {#dispose--}
```
public final void dispose()
```


Releases all resources used by this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) object.

### deepClone() {#deepClone--}
```
public final Object deepClone()
```


Creates an exact copy of this [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap).

**Returns:**
java.lang.Object - The [CustomLineCap](../../com.aspose.drawing.drawing2d/customlinecap) this method creates, cast as an object.
### setStrokeCaps(int startCap, int endCap) {#setStrokeCaps-int-int-}
```
public final void setStrokeCaps(int startCap, int endCap)
```


Sets the caps used to start and end lines that make up this custom cap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startCap | int | The [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration used at the beginning of a line within this cap. |
| endCap | int | The [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration used at the end of a line within this cap. |

### getStrokeCaps(int[] startCap, int[] endCap) {#getStrokeCaps-int---int---}
```
public final void getStrokeCaps(int[] startCap, int[] endCap)
```


Gets the caps used to start and end lines that make up this custom cap.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startCap | int[] | The [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration used at the beginning of a line within this cap. |
| endCap | int[] | The [LineCap](../../com.aspose.drawing.drawing2d/linecap) enumeration used at the end of a line within this cap. |

### getFillPath() {#getFillPath--}
```
public GraphicsPath getFillPath()
```




**Returns:**
[GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath)
### getStrokePath() {#getStrokePath--}
```
public GraphicsPath getStrokePath()
```


Gets the object that defines the outline of the custom cap.

**Returns:**
[GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) - The object that defines the outline of the custom cap.
