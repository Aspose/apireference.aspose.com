---
title: "XpsCanvas"
second_title: "Aspose.Page for Java API リファレンス"
description: "Canvas 要素の機能をカプセル化するクラス。"
type: docs
weight: 16
url: /ja/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Canvas要素の機能をカプセル化するクラス。この要素は要素をまとめます。たとえば、GlyphsおよびPath要素をキャンバス内でグループ化し、単位として識別（ハイパーリンク先として）したり、各子要素と先祖要素に合成プロパティ値を適用したりできます。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | このキャンバスの子リストに要素を追加します。 |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | このキャンバスの子リストの index 位置に要素を挿入します。 |
| [addCanvas()](#addCanvas--) | このキャンバスの子リストに新しいキャンバスを追加します。 |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | このキャンバスの子リストに新しいグリフを追加します。 |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | このキャンバスの子リストに新しいパスを追加します。 |
| [deepClone()](#deepClone--) | このキャンバスをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i による要素の子へのアクセスを提供します。 |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 要素の描画領域を制限するパスジオメトリを返します。 |
| [getEdgeMode()](#getEdgeMode--) | キャンバス内のパスのエッジがどのように描画されるかを制御する値を返します。 |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | ハイパーリンクのターゲットオブジェクトを返します。 |
| [getOpacity()](#getOpacity--) | 要素の均一な透明度を定義する値を返します。 |
| [getOpacityMask()](#getOpacityMask--) | Opacity 属性と同様に要素に適用されるアルファ値のマスクを指定するブラシを返しますが、要素の異なる領域に対して異なるアルファ値を設定できます。 |
| [getRenderTransform()](#getRenderTransform--) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を返します。 |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | このキャンバスの子リストの index 位置に新しいキャンバスを挿入します。 |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | このキャンバスの子リストの index 位置に新しいグリフを挿入します。 |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | このキャンバスの子リストの index 位置に新しいパスを挿入します。 |
| [iterator()](#iterator--) | Iterable インターフェイスの実装。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 要素の描画領域を制限するパスジオメトリを設定します。 |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | キャンバス内のパスのエッジがどのように描画されるかを制御する値を設定します。 |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | ハイパーリンクのターゲットオブジェクトを設定します。 |
| [setOpacity(float value)](#setOpacity-float-) | 要素の均一な透明度を定義する値を設定します。 |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | 要素に適用されるアルファ値のマスクを指定するブラシを設定します。このマスクは Opacity 属性と同様の方法で適用されますが、要素の異なる領域に対して異なるアルファ値を設定できます。 |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を設定します。 |
| [size()](#size--) | 子要素の数を返します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


このキャンバスの子リストに要素を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 要素 | T | 追加する要素です。 |

**Returns:**
T - 追加された要素。
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


このキャンバスの子リストの index 位置に要素を挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 要素を挿入すべき位置。 |
| 要素 | T | 挿入する要素。 |

**Returns:**
T - 挿入された要素。
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


このキャンバスの子リストに新しいキャンバスを追加します。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


このキャンバスの子リストに新しいグリフを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| fontFamily | java.lang.String | フォントファミリー。 |
| fontSize | float | フォントサイズ。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | フォントスタイル。 |
| originX | float | グリフの原点 X 座標。 |
| originY | float | グリフの原点 T 座標。 |
| unicodeString | java.lang.String | 印刷される文字列。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


このキャンバスの子リストに新しいパスを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | パスのジオメトリ。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


このキャンバスをクローンします。

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


キャンバス内のパスのエッジがどのように描画されるかを制御する値を返します。

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


このキャンバスの子リストの index 位置に新しいキャンバスを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Canvas を挿入すべき位置です。 |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


このキャンバスの子リストの index 位置に新しいグリフを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Glyphs を挿入すべき位置です。 |
| fontFamily | java.lang.String | フォントファミリー。 |
| fontSize | float | フォントサイズ。 |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | フォントスタイル。 |
| originX | float | グリフの原点 X 座標。 |
| originY | float | グリフの原点 T 座標。 |
| unicodeString | java.lang.String | 印刷される文字列。 |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


このキャンバスの子リストの index 位置に新しいパスを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | 新しい Path を挿入すべき位置です。 |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | パスのジオメトリ。 |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


キャンバス内のパスのエッジがどのように描画されるかを制御する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | エッジ描画モード。 |

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

