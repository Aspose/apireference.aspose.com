---
title: "DocumentUtils"
second_title: "Aspose.Page for Java API 参考"
description: "此类提供了超出正式 XPS 操作 API 的实用工具。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

此类提供了超出正式 XPS 操作 API 的实用工具。
## 方法

| 方法 | 描述 |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | 创建表示圆形的路径几何体。 |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | 创建表示两个角度之间圆形段的路径几何体。 |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | 创建表示椭圆的路径几何体。 |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | 创建一个用图像填充的矩形路径。 |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | 创建一个用图像填充的矩形路径。 |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | 创建表示两条径向射线之间圆形切片的路径几何体。 |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | 创建表示矩形的路径几何体。 |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | 创建表示外切于圆的正 n 边形的路径几何体。 |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | 创建表示内切于圆的正 n 边形的路径几何体。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### createCircle(Point2D center, float radius) {#createCircle-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createCircle(Point2D center, float radius)
```


创建表示圆形的路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 圆的中心点。 |
| 半径 | float | 圆的半径。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


创建表示两个角度之间圆形段的路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 圆的中心点。 |
| 半径 | float | 圆的半径。 |
| startAngle | float | 起始射线的角度（度）。 |
| endAngle | float | 结束射线的角度（度）。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


创建表示椭圆的路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 椭圆的中心点。 |
| radiusX | float | 椭圆的水平半径。 |
| radiusY | float | 椭圆的垂直半径。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


创建一个用图像填充的矩形路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fileName | java.lang.String | 图像文件的名称。 |
| imageBox | java.awt.geom.Rectangle2D | 用于填充图像的图像框。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


创建一个用图像填充的矩形路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fileName | java.lang.String | 图像文件的名称。 |
| imageBox | java.awt.geom.Rectangle2D | 用于填充图像的图像框。 |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | 图像适配模式。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


创建表示两条径向射线之间圆形切片的路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 圆的中心点。 |
| 半径 | float | 圆的半径。 |
| startAngle | float | 起始射线的角度（度）。 |
| endAngle | float | 结束射线的角度（度）。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


创建表示矩形的路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | 矩形。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


创建表示外切于圆的正 n 边形的路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| n | int | 顶点的数量。 |
| center | java.awt.geom.Point2D | 圆的中心点。 |
| 半径 | float | 圆的半径。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


创建表示内切于圆的正 n 边形的路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| n | int | 顶点的数量。 |
| center | java.awt.geom.Point2D | 圆的中心点。 |
| 半径 | float | 圆的半径。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

