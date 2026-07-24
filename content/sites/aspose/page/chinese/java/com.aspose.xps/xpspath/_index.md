---
title: "XpsPath"
second_title: "Aspose.Page for Java API 参考"
description: "封装 Path 元素特性的类。"
type: docs
weight: 40
url: /zh/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

封装 Path 元素特性的类。此元素是向固定页面添加矢量图形和图像的唯一方式。它定义了将在页面上渲染的单个矢量图形。
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆此路径。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 提供通过索引 i 访问元素子项的功能。 |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 返回限制元素渲染区域的路径几何体。 |
| [getData()](#getData--) | 返回路径的几何形状。 |
| [getFill()](#getFill--) | 返回用于绘制路径 Data 属性指定的几何形状的画刷。 |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 返回超链接目标对象。 |
| [getOpacity()](#getOpacity--) | 返回定义元素统一透明度的值。 |
| [getOpacityMask()](#getOpacityMask--) | 返回指定 alpha 值掩码的画刷，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素的不同区域使用不同的 alpha 值。 |
| [getRenderTransform()](#getRenderTransform--) | 返回仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [getStroke()](#getStroke--) | 返回用于绘制笔画的画刷。 |
| [getStrokeDashArray()](#getStrokeDashArray--) | 返回指定轮廓笔画的虚线和间隔长度的数组。 |
| [getStrokeDashCap()](#getStrokeDashCap--) | 返回指定每段虚线端点绘制方式的值。 |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | 返回用于重复虚线数组模式的起始点。 |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | 返回定义笔画中最后一段虚线末端形状的值。 |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | 返回定义笔画中第一段虚线起始形状的值。 |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | 返回最大斜接长度与笔画厚度一半之间的比例。 |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | 返回定义笔画中第一段虚线起始形状的值。 |
| [getStrokeThickness()](#getStrokeThickness--) | 返回笔画的粗细，单位为有效坐标空间（包括路径的渲染变换）。 |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | 实现 Iterable 接口。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 设置限制元素渲染区域的路径几何。 |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | 设置路径的几何形状。 |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | 设置用于绘制路径 Data 属性指定的几何形状的画刷。 |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 设置超链接目标对象。 |
| [setOpacity(float value)](#setOpacity-float-) | 设置定义元素统一透明度的值。 |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | 设置画刷，指定一组 alpha 值的掩码，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素不同区域使用不同的 alpha 值。 |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 设置仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | 设置用于绘制笔画的画刷。 |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | 设置指定轮廓笔画的虚线和间隔长度的数组。 |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | 设置指定每段虚线端点绘制方式的值。 |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | 设置用于重复虚线数组模式的起始点。 |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | 设置定义笔画中最后一段虚线末端形状的值。 |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | 设置定义笔画中第一段虚线起始形状的值。 |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | 设置最大斜接长度与笔画厚度一半之间的比例。 |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | 设置定义笔画中第一段虚线起始形状的值。 |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | 设置笔画的粗细，单位为有效坐标空间（包括路径的渲染变换）。 |
| [size()](#size--) | 返回子元素的数量。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


克隆此路径。

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


提供通过索引 i 访问元素子项的功能。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int | 子元素的索引。 |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


返回限制元素渲染区域的路径几何体。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


返回路径的几何形状。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


返回用于绘制路径 Data 属性指定的几何形状的画刷。

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


返回超链接目标对象。

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


返回定义元素统一透明度的值。

**Returns:**
float - 定义元素统一透明度的值。
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


返回指定 alpha 值掩码的画刷，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素的不同区域使用不同的 alpha 值。

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


返回仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


返回用于绘制笔画的画刷。

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


返回指定轮廓笔画的虚线和间隔长度的数组。

**Returns:**
float[] - 指定轮廓笔画的虚线和间隔长度的数组。
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


返回指定每段虚线端点绘制方式的值。

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


返回用于重复虚线数组模式的起始点。如果省略此值，虚线数组将与笔画的原点对齐。

**Returns:**
float - 重复虚线数组模式的起始点。
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


返回定义笔画中最后一段虚线末端形状的值。

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


返回定义笔画中第一段虚线起始形状的值。

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


返回最大斜接长度与笔画厚度一半之间的比例。仅当 StrokeLineJoin 属性指定 Miter 时，此值才有意义。

**Returns:**
float - 最大斜接长度与笔画厚度一半之间的比例。
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


返回定义笔画中第一段虚线起始形状的值。

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


返回笔画的粗细，单位为有效坐标空间（包括路径的渲染变换）。笔画绘制在 Path 元素的 Data 属性指定的几何形状边界之上。StrokeThickness 的一半延伸到 Data 属性指定的几何形状之外，另一半延伸到几何形状内部。

**Returns:**
float - 笔画的粗细。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


实现 Iterable 接口。

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - 返回列表的枚举器。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


设置限制元素渲染区域的路径几何。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 限制元素渲染区域的路径几何。 |

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


设置路径的几何形状。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


设置用于绘制路径 Data 属性指定的几何形状的画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 用于绘制指定的几何形状的画刷。 |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


设置超链接目标对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | 超链接目标对象。 |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


设置定义元素统一透明度的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 定义元素统一透明度的值。 |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


设置画刷，指定一组 alpha 值的掩码，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素不同区域使用不同的 alpha 值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 指定掩码的画刷。 |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


设置仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 仿射变换矩阵。 |

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


设置用于绘制笔画的画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 用于绘制笔画的画刷。 |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


设置指定轮廓笔画的虚线和间隔长度的数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float[] | 指定轮廓笔画的虚线和间隙长度的数组。 |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


设置指定每段虚线端点绘制方式的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | 指定每段虚线末端绘制方式的值。 |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


设置重复虚线数组模式的起始点。如果省略此值，虚线数组将与笔画的原点对齐。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 重复虚线数组模式的起始点。 |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


设置定义笔画中最后一段虚线末端形状的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | 定义笔画中最后一段虚线末端形状的值。 |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


设置定义笔画中第一段虚线起始形状的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | 定义笔画中第一段虚线起始形状的值。 |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


设置最大斜接长度与笔画厚度一半之间的比例。仅当 StrokeLineJoin 属性指定 Miter 时，此值才有意义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 最大斜接长度与笔画厚度一半之间的比例。 |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


设置定义笔画中第一段虚线起始形状的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | 定义笔画中第一段虚线起始形状的值。 |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


设置笔画的粗细，单位为有效坐标空间（包括路径的渲染变换）。笔画绘制在 Path 元素的 Data 属性指定的几何形状边界之上。StrokeThickness 的一半延伸到 Data 属性指定的几何形状之外，另一半延伸到几何形状内部。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 笔画的粗细。 |

### size() {#size--}
```
public int size()
```


返回子元素的数量。

**Returns:**
int - 子元素的数量。
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

