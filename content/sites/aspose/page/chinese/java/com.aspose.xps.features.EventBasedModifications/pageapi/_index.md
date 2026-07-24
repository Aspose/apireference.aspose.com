---
title: "PageAPI"
second_title: "Aspose.Page for Java API 参考"
description: "页面元素修改 API。"
type: docs
weight: 12
url: /zh/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

**Page** 元素修改 API。
## 方法

| 方法 | 描述 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | 添加内容元素（Canvas、Path 或 Glyphs） |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | 在页面的索引位置插入元素（Canvas、Path 或 Glyphs）。 |
| [<T>remove(T element)](#-T-remove-T-) | 从页面中移除元素。 |
| [addCanvas()](#addCanvas--) | 向页面添加新的画布。 |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 向页面添加新的字形。 |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 向页面添加新的字形。 |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | 向文档添加大纲条目。 |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | 向页面添加新的路径。 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | 创建一个新的描边椭圆弧段。 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | 创建一个新的椭圆弧段。 |
| [createCanvas()](#createCanvas--) | 创建一个新的画布。 |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | 在基于 ICC 的色彩空间中创建新颜色。 |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | 在 scRGB 色彩空间中创建新颜色。 |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | 在 scRGB 色彩空间中创建新颜色。 |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | 在 sRGB 色彩空间中创建新颜色。 |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | 在 sRGB 色彩空间中创建新颜色。 |
| [createColor(Color color)](#createColor-java.awt.Color-) | 创建新颜色。 |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | 在基于 ICC 的色彩空间中创建新颜色。 |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 创建新字形。 |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 创建新字形。 |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | 创建新的渐变停止点。 |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | 创建新的渐变停止点。 |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 创建新的图像画刷。 |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 创建新的图像画刷。 |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | 创建新的线性渐变画刷。 |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | 创建新的线性渐变画刷。 |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | 创建新的仿射变换矩阵。 |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | 创建新的路径。 |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | 创建新的开放路径图形。 |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | 创建新的路径图形。 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | 创建新的开放路径图形。 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | 创建新的路径图形。 |
| [createPathGeometry()](#createPathGeometry--) | 创建新的路径几何体。 |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | 创建一个使用简写形式指定的新路径几何体。 |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | 创建一个使用指定路径图形列表的新路径几何体。 |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | 创建一组新的描边立方 B?zier 曲线。 |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | 创建一组新的立方 B?zier 曲线。 |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | 创建一个包含任意数量单个顶点的新的描边多边形绘图。 |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | 创建一个包含任意数量单个顶点的新的多边形绘图。 |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | 创建一组新的描边二次 B?zier 曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。 |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | 创建一组新的二次 B?zier 曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。 |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 创建一个新的径向渐变画刷。 |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 创建一个新的径向渐变画刷。 |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | 创建一个新的纯色画刷。 |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | 创建一个新的纯色画刷。 |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 创建一个新的可视画刷。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | 返回页面的高度，以有效坐标空间的单位表示的实数。 |
| [getPageCount()](#getPageCount--) | 返回活动文档中的页数。 |
| [getTotalPageCount()](#getTotalPageCount--) | 返回 XPS 文档中所有文档的总页数。 |
| [getUtils()](#getUtils--) | 获取提供超出正式 XPS 操作 API 的实用功能的对象。 |
| [getWidth()](#getWidth--) | 返回页面的宽度，以有效坐标空间的单位表示的实数。 |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | 在页面的  index  位置插入一个新的画布。 |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 在页面的  index  位置插入新的字形。 |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 在页面的  index  位置插入新的字形。 |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | 在页面的  index  位置插入一个新的路径。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | 从页面的  index  位置移除一个元素。 |
| [setHeight(float value)](#setHeight-float-) | 设置页面的高度，以有效坐标空间的单位表示的实数。 |
| [setWidth(float value)](#setWidth-float-) | 设置页面的宽度，以有效坐标空间的单位表示的实数。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


添加内容元素（Canvas、Path 或 Glyphs）

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 元素 | T | 要添加的元素。 |

**Returns:**
T - 已添加的元素。
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


在页面的索引位置插入元素（Canvas、Path 或 Glyphs）。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入元素的位置。 |
| 元素 | T | 要插入的元素。 |

**Returns:**
T - 已插入的元素。
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


从页面中移除元素。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 元素 | T | 要删除的元素。 |

**Returns:**
T - 已删除的元素。
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


向页面添加新的画布。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


向页面添加新的字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 字体资源。 |
| fontRenderingEmSize | float | 字体大小。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


向页面添加新的字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontFamily | java.lang.String | 字体族。 |
| fontRenderingEmSize | float | 字体大小。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


向文档添加大纲条目。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| description | java.lang.String | 条目描述。 |
| outlineLevel | int | 大纲级别。 |
| targetPageNumber | int | 目标页码。 |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


向页面添加新的路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


创建一个新的描边椭圆弧段。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| point | java.awt.geom.Point2D | 椭圆弧的终点。 |
| 大小 | java.awt.geom.Dimension2D | 椭圆弧的 x 和 y 半径，以 x,y 对的形式。 |
| rotationAngle | float | 指示椭圆相对于当前坐标系的旋转方式。 |
| isLargeArc | boolean | 确定弧线的扫掠是否为 180 度或更大。 |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 弧线绘制的方向。 |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


创建一个新的椭圆弧段。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| point | java.awt.geom.Point2D | 椭圆弧的终点。 |
| 大小 | java.awt.geom.Dimension2D | 椭圆弧的 x 和 y 半径，以 x,y 对的形式。 |
| rotationAngle | float | 指示椭圆相对于当前坐标系的旋转方式。 |
| isLargeArc | boolean | 确定弧线的扫掠是否为 180 度或更大。 |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 弧线绘制的方向。 |
| isStroked | boolean | 指定路径此段的描边是否绘制。 |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


创建一个新的画布。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


在基于 ICC 的色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC 配置文件资源。 |
| components | float[] | 颜色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


在 scRGB 色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| r | float | 红色分量。 |
| g | float | 绿色分量。 |
| b | float | 蓝色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


在 scRGB 色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | float | Alpha 颜色分量。 |
| r | float | 红色分量。 |
| g | float | 绿色分量。 |
| b | float | 蓝色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


在 sRGB 色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| r | int | 红色分量。 |
| g | int | 绿色分量。 |
| b | int | 蓝色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


在 sRGB 色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| a | int | Alpha 颜色分量。 |
| r | int | 红色分量。 |
| g | int | 绿色分量。 |
| b | int | 蓝色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | java.awt.Color | RGB 颜色的本机颜色实例。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


在基于 ICC 的色彩空间中创建新颜色。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| path | java.lang.String | ICC 配置文件的路径。 |
| components | float[] | 颜色分量。 |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


创建新字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 字体资源。 |
| fontRenderingEmSize | float | 字体大小。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


创建新字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontFamily | java.lang.String | 字体族。 |
| fontRenderingEmSize | float | 字体大小。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


创建新的渐变停止点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 渐变停止颜色。 |
| 偏移量 | float | 渐变偏移量。 |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


创建新的渐变停止点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | java.awt.Color | 渐变停止颜色。 |
| 偏移量 | float | 渐变偏移量。 |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


创建新的图像画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | 图像资源。 |
| 视图框 | java.awt.geom.Rectangle2D | 画笔源内容的位置和尺寸。 |
| 视口 | java.awt.geom.Rectangle2D | 在包含坐标空间中，主画笔瓦片的区域（可能会重复）被用于填充画笔所应用的区域。 |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


创建新的图像画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 图像路径 | java.lang.String | 用作画笔瓦片的图像路径。 |
| 视图框 | java.awt.geom.Rectangle2D | 画笔源内容的位置和尺寸。 |
| 视口 | java.awt.geom.Rectangle2D | 在包含坐标空间中，主画笔瓦片的区域（可能会重复）被用于填充画笔所应用的区域。 |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


创建新的线性渐变画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 线性渐变的起始点。 |
| 结束点 | java.awt.geom.Point2D | 线性渐变的结束点。 |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


创建新的线性渐变画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 渐变停止点 | java.util.List<com.aspose.xps.XpsGradientStop> | 渐变停止点的列表。 |
| 起始点 | java.awt.geom.Point2D | 线性渐变的起始点。 |
| 结束点 | java.awt.geom.Point2D | 线性渐变的结束点。 |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


创建新的仿射变换矩阵。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| m11 | float | 元素 11。 |
| m12 | float | 元素 12。 |
| m21 | float | 元素 21。 |
| m22 | float | 元素 22。 |
| m31 | float | 元素 31。 |
| m32 | float | 元素 32。 |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


创建新的路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


创建新的开放路径图形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


创建新的路径图形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |
| isClosed | boolean | 指定路径是否闭合。如果设置为 true，则描边以 "closed" 方式绘制，即路径图形最后一个段的最后一点会连接到 StartPoint 属性指定的点；否则描边以 "open" 方式绘制，最后一点不会连接到起始点。仅在路径图形用于指定描边的 Path 元素时适用。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


创建新的开放路径图形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | 路径段的列表。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


创建新的路径图形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 起始点 | java.awt.geom.Point2D | 路径图形的第一个段的起始点。 |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | 路径段的列表。 |
| isClosed | boolean | 指定路径是否闭合。如果设置为 true，则描边以 "closed" 方式绘制，即路径图形最后一个段的最后一点会连接到 StartPoint 属性指定的点；否则描边以 "open" 方式绘制，最后一点不会连接到起始点。仅在路径图形用于指定描边的 Path 元素时适用。 |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


创建新的路径几何体。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


创建一个使用简写形式指定的新路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | 路径几何的简写形式。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


创建一个使用指定路径图形列表的新路径几何体。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | 路径图形的列表。 |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


创建一组新的描边立方 B?zier 曲线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 多个 B?bezier 段的控制点。 |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


创建一组新的立方 B?zier 曲线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 多个 B?bezier 段的控制点。 |
| isStroked | boolean | 指定路径此段的描边是否绘制。 |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


创建一个包含任意数量单个顶点的新的描边多边形绘图。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 定义折线段的多个段的坐标集合。 |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


创建一个包含任意数量单个顶点的新的多边形绘图。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 定义折线段的多个段的坐标集合。 |
| isStroked | boolean | 指定路径此段的描边是否绘制。 |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


创建一组新的描边二次 B?zier 曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 多个二次 B?bezier 段的控制点。 |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


创建一组新的二次 B?zier 曲线，从路径图形中的前一点通过一组顶点，并使用指定的控制点。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 多个二次 B?bezier 段的控制点。 |
| isStroked | boolean | 指定路径此段的描边是否绘制。 |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


创建一个新的径向渐变画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 径向渐变的中心点（即椭圆的中心）。 |
| gradientOrigin | java.awt.geom.Point2D | 径向渐变的起始点。 |
| radiusX | float | 定义径向渐变的椭圆在 x 维度上的半径。 |
| radiusY | float | 定义径向渐变的椭圆在 y 维度上的半径。 |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


创建一个新的径向渐变画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 渐变停止点 | java.util.List<com.aspose.xps.XpsGradientStop> | 渐变停止点的列表。 |
| center | java.awt.geom.Point2D | 径向渐变的中心点（即椭圆的中心）。 |
| gradientOrigin | java.awt.geom.Point2D | 径向渐变的起始点。 |
| radiusX | float | 定义径向渐变的椭圆在 x 维度上的半径。 |
| radiusY | float | 定义径向渐变的椭圆在 y 维度上的半径。 |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


创建一个新的纯色画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 填充元素的颜色。 |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


创建一个新的纯色画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| color | java.awt.Color | 填充元素的颜色。 |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


创建一个新的可视画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | 用于视觉刷子的 Visual 属性的 XPS 元素（Canvas、Path 或 Glyphs）。 |
| 视图框 | java.awt.geom.Rectangle2D | 画笔源内容的位置和尺寸。 |
| 视口 | java.awt.geom.Rectangle2D | 在包含坐标空间中，主画笔瓦片的区域（可能会重复）被用于填充画笔所应用的区域。 |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getHeight() {#getHeight--}
```
public float getHeight()
```


返回页面的高度，以有效坐标空间的单位表示的实数。

**Returns:**
float - 页面高度。
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


返回活动文档中的页数。

**Returns:**
int - 活动文档中的页数。
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


返回 XPS 文档中所有文档的总页数。

**Returns:**
int - XPS 文档中所有文档的总页数。
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


获取提供超出正式 XPS 操作 API 的实用功能的对象。

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


返回页面的宽度，以有效坐标空间的单位表示的实数。

**Returns:**
float - 页面宽度。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


在页面的  index  位置插入一个新的画布。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Canvas 的位置。 |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


在页面的  index  位置插入新的字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Glyphs 的位置。 |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 字体资源。 |
| fontSize | float | 字体大小。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


在页面的  index  位置插入新的字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Glyphs 的位置。 |
| fontFamily | java.lang.String | 字体族。 |
| fontSize | float | 字体大小。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点 Y 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


在页面的  index  位置插入一个新的路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Path 的位置。 |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


从页面的  index  位置移除一个元素。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应删除元素的位置。 |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


设置页面的高度，以有效坐标空间的单位表示的实数。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 页面的高度。 |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


设置页面的宽度，以有效坐标空间的单位表示的实数。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 页面的宽度。 |

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

