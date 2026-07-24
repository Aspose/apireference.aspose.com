---
title: "XpsPath"
second_title: "Aspose.Page for Java API リファレンス"
description: "Path 要素の機能をカプセル化するクラス。"
type: docs
weight: 40
url: /ja/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Path 要素の機能をカプセル化するクラス。この要素は固定ページにベクターグラフィックと画像を追加する唯一の手段です。ページ上にレンダリングされる単一のベクターグラフィックを定義します。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [deepClone()](#deepClone--) | このパスをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i による要素の子へのアクセスを提供します。 |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 要素の描画領域を制限するパスジオメトリを返します。 |
| [getData()](#getData--) | パスのジオメトリを返します。 |
| [getFill()](#getFill--) | パスの Data プロパティで指定されたジオメトリを描画するために使用されるブラシを返します。 |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | ハイパーリンクのターゲットオブジェクトを返します。 |
| [getOpacity()](#getOpacity--) | 要素の均一な透明度を定義する値を返します。 |
| [getOpacityMask()](#getOpacityMask--) | Opacity 属性と同様に要素に適用されるアルファ値のマスクを指定するブラシを返しますが、要素の異なる領域に対して異なるアルファ値を設定できます。 |
| [getRenderTransform()](#getRenderTransform--) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を返します。 |
| [getStroke()](#getStroke--) | ストロークを描画するために使用されるブラシを返します。 |
| [getStrokeDashArray()](#getStrokeDashArray--) | アウトラインストロークのダッシュとギャップの長さを指定する配列を返します。 |
| [getStrokeDashCap()](#getStrokeDashCap--) | 各ダッシュの端がどのように描画されるかを指定する値を返します。 |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | ダッシュ配列パターンを繰り返す開始点を返します。 |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | ストローク内の最後のダッシュの終端形状を定義する値を返します。 |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | ストローク内の最初のダッシュの開始形状を定義する値を返します。 |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | 最大ミタ長とストローク厚さの半分との比率を返します。 |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | ストローク内の最初のダッシュの開始形状を定義する値を返します。 |
| [getStrokeThickness()](#getStrokeThickness--) | 有効座標空間の単位でストロークの太さを返します（パスのレンダー変換を含む）。 |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable インターフェイスの実装。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 要素の描画領域を制限するパスジオメトリを設定します。 |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | パスのジオメトリを設定します。 |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | パスの Data プロパティで指定されたジオメトリを描画するために使用されるブラシを設定します。 |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | ハイパーリンクのターゲットオブジェクトを設定します。 |
| [setOpacity(float value)](#setOpacity-float-) | 要素の均一な透明度を定義する値を設定します。 |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | 要素に適用されるアルファ値のマスクを指定するブラシを設定します。このマスクは Opacity 属性と同様の方法で適用されますが、要素の異なる領域に対して異なるアルファ値を設定できます。 |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を設定します。 |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | ストロークを描画するために使用されるブラシを設定します。 |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | アウトラインストロークのダッシュとギャップの長さを指定する配列を設定します。 |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | 各ダッシュの端がどのように描画されるかを指定する値を設定します。 |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | ダッシュ配列パターンを繰り返す開始点を設定します。 |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | ストローク内の最後のダッシュの終端形状を定義する値を設定します。 |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | ストローク内の最初のダッシュの開始形状を定義する値を設定します。 |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | 最大ミタ長とストローク厚さの半分との比率を設定します。 |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | ストローク内の最初のダッシュの開始形状を定義する値を設定します。 |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | 有効座標空間の単位でストロークの太さを設定します（パスのレンダー変換を含む）。 |
| [size()](#size--) | 子要素の数を返します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


このパスをクローンします。

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


パスのジオメトリを返します。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


パスの Data プロパティで指定されたジオメトリを描画するために使用されるブラシを返します。

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
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
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


ストロークを描画するために使用されるブラシを返します。

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


アウトラインストロークのダッシュとギャップの長さを指定する配列を返します。

**Returns:**
float[] - アウトラインストロークのダッシュとギャップの長さを指定する配列。
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


各ダッシュの端がどのように描画されるかを指定する値を返します。

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


ダッシュ配列パターンを繰り返す開始点を返します。この値が省略された場合、ダッシュ配列はストロークの原点に合わせられます。

**Returns:**
float - ダッシュ配列パターンを繰り返す開始点です。
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


ストローク内の最後のダッシュの終端形状を定義する値を返します。

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


ストローク内の最初のダッシュの開始形状を定義する値を返します。

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


最大ミータ長とストロークの厚さの半分との比率を返します。この値は、  StrokeLineJoin  属性が  Miter  を指定している場合にのみ有効です。

**Returns:**
float - 最大ミータ長とストロークの厚さの半分との比率です。
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


ストローク内の最初のダッシュの開始形状を定義する値を返します。

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


ストロークの太さを、実効座標空間の単位で返します（パスのレンダートランスフォームを含む）。ストロークは Path element\\u2019s Data property が指定するジオメトリの境界の上に描画されます。StrokeThickness の半分は Data プロパティが指定するジオメトリの外側に伸び、残りの半分はジオメトリの内部に伸びます。

**Returns:**
float - ストロークの太さです。
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

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


パスのジオメトリを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | パスのジオメトリ。 |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


パスの Data プロパティで指定されたジオメトリを描画するために使用されるブラシを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 指定されたジオメトリを塗装するために使用されるブラシです。 |

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

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


ストロークを描画するために使用されるブラシを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | ストロークを描画するために使用されるブラシです。 |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


アウトラインストロークのダッシュとギャップの長さを指定する配列を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float[] | アウトラインストロークのダッシュとギャップの長さを指定する配列です。 |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


各ダッシュの端がどのように描画されるかを指定する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | 各ダッシュの端がどのように描画されるかを指定する値です。 |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


ダッシュ配列パターンを繰り返す開始点を設定します。この値が省略された場合、ダッシュ配列はストロークの原点に合わせられます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ダッシュ配列パターンを繰り返す開始点です。 |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


ストローク内の最後のダッシュの終端形状を定義する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | ストローク内の最後のダッシュの端の形状を定義する値です。 |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


ストローク内の最初のダッシュの開始形状を定義する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | ストローク内の最初のダッシュの開始部の形状を定義する値です。 |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


最大ミータ長とストロークの厚さの半分との比率を設定します。この値は、  StrokeLineJoin  属性が  Miter  を指定している場合にのみ有効です。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | 最大ミータ長とストロークの厚さの半分との比率です。 |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


ストローク内の最初のダッシュの開始形状を定義する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | ストローク内の最初のダッシュの開始部の形状を定義する値です。 |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


ストロークの太さを、実効座標空間の単位で設定します（パスのレンダートランスフォームを含む）。ストロークは Path element\\u2019s Data property が指定するジオメトリの境界の上に描画されます。StrokeThickness の半分は Data プロパティが指定するジオメトリの外側に伸び、残りの半分はジオメトリの内部に伸びます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ストロークの太さです。 |

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

