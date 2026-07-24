---
title: "XpsCanvas"
second_title: "Aspose.Page for Java API 参考"
description: "封装 Canvas 元素特性的类。"
type: docs
weight: 16
url: /zh/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

封装 Canvas 元素特性的类。此元素将元素组合在一起。例如，Glyphs 和 Path 元素可以在画布中分组，以便被识别为一个单元（作为超链接目标），或将组合属性值应用于每个子元素和祖先元素。
## 方法

| 方法 | 描述 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | 向此画布的子列表添加一个元素。 |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | 在 index 位置插入一个元素到此画布的子列表中。 |
| [addCanvas()](#addCanvas--) | 向此画布的子列表添加一个新画布。 |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 向此画布的子列表添加新的字形。 |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | 向此画布的子列表添加一个新路径。 |
| [deepClone()](#deepClone--) | 克隆此画布。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 提供通过索引 i 访问元素子项的功能。 |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 返回限制元素渲染区域的路径几何体。 |
| [getEdgeMode()](#getEdgeMode--) | 返回控制画布内路径边缘渲染方式的值。 |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 返回超链接目标对象。 |
| [getOpacity()](#getOpacity--) | 返回定义元素统一透明度的值。 |
| [getOpacityMask()](#getOpacityMask--) | 返回指定 alpha 值掩码的画刷，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素的不同区域使用不同的 alpha 值。 |
| [getRenderTransform()](#getRenderTransform--) | 返回仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | 在 index 位置插入一个新画布到此画布的子列表中。 |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 在 index 位置插入新的字形到此画布的子列表中。 |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | 在 index 位置插入一个新路径到此画布的子列表中。 |
| [iterator()](#iterator--) | 实现 Iterable 接口。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 设置限制元素渲染区域的路径几何。 |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | 设置控制画布内路径边缘渲染方式的值。 |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 设置超链接目标对象。 |
| [setOpacity(float value)](#setOpacity-float-) | 设置定义元素统一透明度的值。 |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | 设置画刷，指定一组 alpha 值的掩码，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素不同区域使用不同的 alpha 值。 |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 设置仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [size()](#size--) | 返回子元素的数量。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


向此画布的子列表添加一个元素。

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


在 index 位置插入一个元素到此画布的子列表中。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入元素的位置。 |
| 元素 | T | 要插入的元素。 |

**Returns:**
T - 已插入的元素。
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


向此画布的子列表添加一个新画布。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


向此画布的子列表添加新的字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontFamily | java.lang.String | 字体族。 |
| fontSize | float | 字体大小。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点的 T 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


向此画布的子列表添加一个新路径。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


克隆此画布。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


返回控制画布内路径边缘渲染方式的值。

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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


在 index 位置插入一个新画布到此画布的子列表中。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Canvas 的位置。 |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


在 index 位置插入新的字形到此画布的子列表中。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Glyphs 的位置。 |
| fontFamily | java.lang.String | 字体族。 |
| fontSize | float | 字体大小。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 字体样式。 |
| originX | float | 字形原点 X 坐标。 |
| originY | float | 字形原点的 T 坐标。 |
| unicodeString | java.lang.String | 要打印的字符串。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


在 index 位置插入一个新路径到此画布的子列表中。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int | 应插入新 Path 的位置。 |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 路径的几何形状。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


设置控制画布内路径边缘渲染方式的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | 边缘渲染模式。 |

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

