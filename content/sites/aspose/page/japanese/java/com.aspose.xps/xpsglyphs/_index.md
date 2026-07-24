---
title: "XpsGlyphs"
second_title: "Aspose.Page for Java API リファレンス"
description: "Glyphs 要素の機能をカプセル化するクラス。"
type: docs
weight: 25
url: /ja/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Glyphs 要素の機能をカプセル化するクラスです。この要素は単一フォントからの均一にフォーマットされたテキストのランを表します。正確なレンダリングに必要な情報を提供し、ビューアの検索および選択機能をサポートします。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [deepClone()](#deepClone--) | このグリフをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i による要素の子へのアクセスを提供します。 |
| [getBidiLevel()](#getBidiLevel--) | Unicode アルゴリズムの双方向入れ子レベルを指定する値を返します。 |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 要素の描画領域を制限するパスジオメトリを返します。 |
| [getFill()](#getFill--) | レンダリングされたグリフの形状を塗りつぶすために使用されるブラシを返します。 |
| [getFont()](#getFont--) | 要素のテキスト組版に使用される TrueType フォントのフォントリソースを返します。 |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | 有効座標空間の単位で浮動小数点数として表された、描画サーフェス単位のフォントサイズを返します。 |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | ハイパーリンクのターゲットオブジェクトを返します。 |
| [getOpacity()](#getOpacity--) | 要素の均一な透明度を定義する値を返します。 |
| [getOpacityMask()](#getOpacityMask--) | Opacity 属性と同様に要素に適用されるアルファ値のマスクを指定するブラシを返しますが、要素の異なる領域に対して異なるアルファ値を設定できます。 |
| [getOriginX()](#getOriginX--) | ラン内の最初のグリフの x 座標を、有効座標空間の単位で返します。 |
| [getOriginY()](#getOriginY--) | ラン内の最初のグリフの y 座標を、有効座標空間の単位で返します。 |
| [getRenderTransform()](#getRenderTransform--) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を返します。 |
| [getStyleSimulations()](#getStyleSimulations--) | スタイルシミュレーションを指定する値を返します。 |
| [getUnicodeString()](#getUnicodeString--) | Glyphs 要素によってレンダリングされたテキスト文字列を返します。 |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | グリフが横向きに回転していることを示す値を返します。原点は回転していないグリフの上部中央として定義されます。 |
| [iterator()](#iterator--) | Iterable インターフェイスの実装。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Unicode アルゴリズムの双方向入れ子レベルを指定する値を設定します。 |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 要素の描画領域を制限するパスジオメトリを設定します。 |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | レンダリングされたグリフの形状を塗りつぶすために使用されるブラシを設定します。 |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | 有効座標空間の単位で浮動小数点数として表された、描画サーフェス単位のフォントサイズを設定します。 |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | ハイパーリンクのターゲットオブジェクトを設定します。 |
| [setOpacity(float value)](#setOpacity-float-) | 要素の均一な透明度を定義する値を設定します。 |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | 要素に適用されるアルファ値のマスクを指定するブラシを設定します。このマスクは Opacity 属性と同様の方法で適用されますが、要素の異なる領域に対して異なるアルファ値を設定できます。 |
| [setOriginX(float value)](#setOriginX-float-) | ラン内の最初のグリフの x 座標を、有効座標空間の単位で設定します。 |
| [setOriginY(float value)](#setOriginY-float-) | ラン内の最初のグリフの y 座標を、有効座標空間の単位で設定します。 |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を設定します。 |
| [setSideways(boolean value)](#setSideways-boolean-) | グリフが横向きに回転していることを示す値を設定します。原点は回転していないグリフの上部中央として定義されます。 |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | スタイルシミュレーションを指定する値を設定します。 |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Glyphs 要素によってレンダリングされたテキスト文字列を設定します。 |
| [size()](#size--) | 子要素の数を返します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


このグリフをクローンします。

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Unicode アルゴリズムの双方向入れ子レベルを指定する値を返します。偶数値は左から右へのレイアウトを示し、奇数値は右から左へのレイアウトを示します。右から左へのレイアウトでは、ランの原点が最初のグリフの右側に配置され、正の前進幅（左方向への進みを表す）により、後続のグリフが前のグリフの左側に配置されます。

**Returns:**
int - Unicode アルゴリズムの双方向入れ子レベルを指定する値。
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


レンダリングされたグリフの形状を塗りつぶすために使用されるブラシを返します。

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


要素のテキスト組版に使用される TrueType フォントのフォントリソースを返します。

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


有効座標空間の単位で浮動小数点数として表された、描画サーフェス単位のフォントサイズを返します。

**Returns:**
float - フォントサイズ。
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


ラン内の最初のグリフの x 座標を、有効座標空間の単位で返します。

**Returns:**
float - ラン内の最初のグリフの x 座標（有効座標空間の単位）。
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


ラン内の最初のグリフの y 座標を、有効座標空間の単位で返します。

**Returns:**
float - ラン内の最初のグリフの y 座標（有効座標空間の単位）。
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を返します。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


スタイルシミュレーションを指定する値を返します。

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Glyphs 要素によって描画されたテキスト文字列を返します。テキストは Unicode コードポイントで指定されます。

**Returns:**
java.lang.String - Glyphs 要素によって描画されたテキスト文字列。
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


グリフが横向きに回転していることを示す値を返します。原点は回転していないグリフの上部中央として定義されます。

**Returns:**
boolean - グリフが横向きであることを示す値。
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Unicode アルゴリズムの双方向入れ子レベルを指定する値を設定します。偶数値は左から右へのレイアウトを意味し、奇数値は右から左へのレイアウトを意味します。右から左へのレイアウトでは、ランの起点が最初のグリフの右側に配置され、正の前進幅（左方向への進みを表す）により、後続のグリフが前のグリフの左側に配置されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | Unicode アルゴリズムの双方向入れ子レベルを指定する値。 |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


要素の描画領域を制限するパスジオメトリを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 要素の描画領域を制限するパスジオメトリ。 |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


レンダリングされたグリフの形状を塗りつぶすために使用されるブラシを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 描画されたグリフの形状を塗りつぶすために使用されるブラシ。 |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


有効座標空間の単位で浮動小数点数として表された、描画サーフェス単位のフォントサイズを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | フォントサイズ。 |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


ラン内の最初のグリフの x 座標を、有効座標空間の単位で設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ラン内の最初のグリフの x 座標（有効座標空間の単位）。 |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


ラン内の最初のグリフの y 座標を、有効座標空間の単位で設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ラン内の最初のグリフの y 座標（有効座標空間の単位）。 |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


要素およびすべての子要素（存在する場合）のすべての属性に対して新しい座標系を確立するアフィン変換行列を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | アフィン変換行列。 |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


グリフが横向きに回転していることを示す値を設定します。原点は回転していないグリフの上部中央として定義されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | boolean | グリフが横向きであることを示す値。 |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


スタイルシミュレーションを指定する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | スタイルシミュレーションを指定する値。 |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Glyphs 要素によって描画されたテキスト文字列を設定します。テキストは Unicode コードポイントで指定されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.lang.String | Glyphs 要素によって描画されたテキスト文字列。 |

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

