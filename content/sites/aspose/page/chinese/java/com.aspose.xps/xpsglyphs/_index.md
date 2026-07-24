---
title: "XpsGlyphs"
second_title: "Aspose.Page for Java API 参考"
description: "封装 Glyphs 元素特性的类。"
type: docs
weight: 25
url: /zh/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

封装 Glyphs 元素特性的类。此元素表示来自单一字体的统一格式文本序列。它提供准确渲染所需的信息，并支持查看器中的搜索和选择功能。
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆此字形。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 提供通过索引 i 访问元素子项的功能。 |
| [getBidiLevel()](#getBidiLevel--) | 返回指定 Unicode 算法双向嵌套级别的值。 |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 返回限制元素渲染区域的路径几何体。 |
| [getFill()](#getFill--) | 返回用于填充已渲染字形形状的画刷。 |
| [getFont()](#getFont--) | 返回用于排版元素文本的 TrueType 字体资源。 |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | 返回绘图表面单位中的字体大小，以有效坐标空间单位的浮点数表示。 |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 返回超链接目标对象。 |
| [getOpacity()](#getOpacity--) | 返回定义元素统一透明度的值。 |
| [getOpacityMask()](#getOpacityMask--) | 返回指定 alpha 值掩码的画刷，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素的不同区域使用不同的 alpha 值。 |
| [getOriginX()](#getOriginX--) | 返回序列中第一个字形的 X 坐标，单位为有效坐标空间。 |
| [getOriginY()](#getOriginY--) | 返回序列中第一个字形的 Y 坐标，单位为有效坐标空间。 |
| [getRenderTransform()](#getRenderTransform--) | 返回仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [getStyleSimulations()](#getStyleSimulations--) | 返回指定样式仿真的值。 |
| [getUnicodeString()](#getUnicodeString--) | 返回 Glyphs 元素渲染的文本字符串。 |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | 返回指示字形已侧转的值，原点定义为未侧转字形的顶部中心。 |
| [iterator()](#iterator--) | 实现 Iterable 接口。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | 设置指定 Unicode 算法双向嵌套级别的值。 |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 设置限制元素渲染区域的路径几何。 |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | 设置用于填充已渲染字形形状的画刷。 |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | 设置绘图表面单位中的字体大小，以有效坐标空间单位的浮点数表示。 |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 设置超链接目标对象。 |
| [setOpacity(float value)](#setOpacity-float-) | 设置定义元素统一透明度的值。 |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | 设置画刷，指定一组 alpha 值的掩码，该掩码以与 Opacity 属性相同的方式应用于元素，但允许元素不同区域使用不同的 alpha 值。 |
| [setOriginX(float value)](#setOriginX-float-) | 设置序列中第一个字形的 X 坐标，单位为有效坐标空间。 |
| [setOriginY(float value)](#setOriginY-float-) | 设置序列中第一个字形的 Y 坐标，单位为有效坐标空间。 |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 设置仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。 |
| [setSideways(boolean value)](#setSideways-boolean-) | 设置指示字形已侧转的值，原点定义为未侧转字形的顶部中心。 |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | 设置指定样式仿真的值。 |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | 设置 Glyphs 元素渲染的文本字符串。 |
| [size()](#size--) | 返回子元素的数量。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


克隆此字形。

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


返回指定 Unicode 算法双向嵌套级别的值。偶数值表示从左到右布局，奇数值表示从右到左布局。右到左布局将序列原点放置在第一个字形的右侧，正的前进宽度（表示向左的前进）会将后续字形放置在前一个字形的左侧。

**Returns:**
int - 指定 Unicode 算法双向嵌套级别的值。
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


返回用于填充已渲染字形形状的画刷。

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


返回用于排版元素文本的 TrueType 字体资源。

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


返回绘图表面单位中的字体大小，以有效坐标空间单位的浮点数表示。

**Returns:**
float - 字体大小。
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


返回序列中第一个字形的 X 坐标，单位为有效坐标空间。

**Returns:**
float - 运行中第一个字形的 x 坐标，单位为有效坐标空间。
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


返回序列中第一个字形的 Y 坐标，单位为有效坐标空间。

**Returns:**
float - 运行中第一个字形的 y 坐标，单位为有效坐标空间。
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


返回仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


返回指定样式仿真的值。

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


返回由 Glyphs 元素呈现的文本字符串。文本以 Unicode 代码点指定。

**Returns:**
java.lang.String - 由 Glyphs 元素呈现的文本字符串。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


返回指示字形已侧转的值，原点定义为未侧转字形的顶部中心。

**Returns:**
boolean - 表示字形已倾斜的值。
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


设置指定 Unicode 算法双向嵌套级别的值。偶数值表示从左到右布局，奇数值表示从右到左布局。右到左布局将运行起点放在第一个字形的右侧，正的前进宽度（表示向左的前进）会将后续字形放置在前一个字形的左侧。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 指定 Unicode 算法双向嵌套级别的值。 |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


设置限制元素渲染区域的路径几何。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 限制元素渲染区域的路径几何。 |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


设置用于填充已渲染字形形状的画刷。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 用于填充已渲染字形形状的画刷。 |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


设置绘图表面单位中的字体大小，以有效坐标空间单位的浮点数表示。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 字体大小。 |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


设置序列中第一个字形的 X 坐标，单位为有效坐标空间。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 运行中第一个字形的 x 坐标，单位为有效坐标空间。 |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


设置序列中第一个字形的 Y 坐标，单位为有效坐标空间。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 运行中第一个字形的 y 坐标，单位为有效坐标空间。 |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


设置仿射变换矩阵，为元素的所有属性以及所有子元素（如果有）建立新的坐标系。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 仿射变换矩阵。 |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


设置指示字形已侧转的值，原点定义为未侧转字形的顶部中心。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | boolean | 表示字形已倾斜的值。 |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


设置指定样式仿真的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | 指定样式模拟的值。 |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


设置由 Glyphs 元素呈现的文本字符串。文本以 Unicode 代码点指定。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 由 Glyphs 元素呈现的文本字符串。 |

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

