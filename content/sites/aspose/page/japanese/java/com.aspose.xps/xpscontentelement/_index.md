---
title: "XpsContentElement"
second_title: "Aspose.Page for Java API リファレンス"
description: "XPS コンテンツ要素 Canvas、Path、Glyphs の機能をカプセル化します。"
type: docs
weight: 18
url: /ja/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

XPS コンテンツ要素（Canvas、Path、Glyphs）の機能をカプセル化します。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i による要素の子へのアクセスを提供します。 |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 要素の描画領域を制限するパスジオメトリを返します。 |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | ハイパーリンクのターゲットオブジェクトを返します。 |
| [getOpacity()](#getOpacity--) | 要素の均一な透明度を定義する値を返します。 |
| [getOpacityMask()](#getOpacityMask--) | Opacity 属性と同様に要素に適用されるアルファ値のマスクを指定するブラシを返しますが、要素の異なる領域に対して異なるアルファ値を設定できます。 |
| [getRenderTransform()](#getRenderTransform--) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を返します。 |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable インターフェイスの実装。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 要素の描画領域を制限するパスジオメトリを設定します。 |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | ハイパーリンクのターゲットオブジェクトを設定します。 |
| [setOpacity(float value)](#setOpacity-float-) | 要素の均一な透明度を定義する値を設定します。 |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | 要素に適用されるアルファ値のマスクを指定するブラシを設定します。このマスクは Opacity 属性と同様の方法で適用されますが、要素の異なる領域に対して異なるアルファ値を設定できます。 |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を設定します。 |
| [size()](#size--) | 子要素の数を返します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


インデックス i による要素の子へのアクセスを提供します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| i | int | 子要素のインデックス。 |

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


要素の描画領域を制限するパスジオメトリを返します。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


ハイパーリンクのターゲットオブジェクトを返します。

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


要素の均一な透明度を定義する値を返します。

**Returns:**
float - 要素の均一な透明度を定義する値。
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Opacity 属性と同様に要素に適用されるアルファ値のマスクを指定するブラシを返しますが、要素の異なる領域に対して異なるアルファ値を設定できます。

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を返します。

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


Iterable インターフェイスの実装。

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - リストの列挙子を返します。
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


要素の描画領域を制限するパスジオメトリを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 要素の描画領域を制限するパスジオメトリ。 |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


ハイパーリンクのターゲットオブジェクトを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | ハイパーリンクのターゲットオブジェクト。 |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


要素の均一な透明度を定義する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | 要素の均一な透明度を定義する値。 |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


要素に適用されるアルファ値のマスクを指定するブラシを設定します。このマスクは Opacity 属性と同様の方法で適用されますが、要素の異なる領域に対して異なるアルファ値を設定できます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | マスクを指定するブラシ。 |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | アフィン変換行列。 |

### size() {#size--}
```
public int size()
```


子要素の数を返します。

**Returns:**
int - 子要素の数。
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

