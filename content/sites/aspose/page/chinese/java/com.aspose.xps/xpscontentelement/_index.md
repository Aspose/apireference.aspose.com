---
title: "XpsContentElement"
second_title: "Aspose.Page for Java API 参考"
description: "封装 XPS 内容元素 Canvas、Path 和 Glyphs 的特性。"
type: docs
weight: 18
url: /zh/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

封装 XPS 内容元素（Canvas、Path 和 Glyphs）的特性。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 提供通过索引 i 访问元素子项的功能。 |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 返回限制元素渲染区域的路径几何体。 |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 返回超链接目标对象。 |
| [getOpacity()](#getOpacity--) | 返回定义元素统一透明度的值。 |
| [getOpacityMask()](#getOpacityMask--) | 返回指定 alpha 值掩码的画刷，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素的不同区域使用不同的 alpha 值。 |
| [getRenderTransform()](#getRenderTransform--) | 返回仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | 实现 Iterable 接口。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 设置限制元素渲染区域的路径几何。 |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 设置超链接目标对象。 |
| [setOpacity(float value)](#setOpacity-float-) | 设置定义元素统一透明度的值。 |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | 设置画刷，指定一组 alpha 值的掩码，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素不同区域使用不同的 alpha 值。 |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 设置仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [size()](#size--) | 返回子元素的数量。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

