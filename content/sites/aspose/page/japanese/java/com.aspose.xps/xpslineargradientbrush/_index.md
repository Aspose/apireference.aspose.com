---
title: "XpsLinearGradientBrush"
second_title: "Aspose.Page for Java API リファレンス"
description: "LinearGradientBrush プロパティ要素の機能をカプセル化するクラス。"
type: docs
weight: 34
url: /ja/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

LinearGradientBrush プロパティ要素の機能をカプセル化するクラス。この要素はベクトルに沿った線形グラデーションブラシを指定するために使用されます。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [deepClone()](#deepClone--) | この線形グラデーションブラシを複製します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | 色の補間に使用されるガンマ関数を指定する値を返します。 |
| [getEndPoint()](#getEndPoint--) | 線形グラデーションの終点を返します。 |
| [getGradientStops()](#getGradientStops--) | グラデーションを構成するグラデーションストップのリストを返します。 |
| [getOpacity()](#getOpacity--) | ブラシの塗りの均一な透明度を定義する値を返します。 |
| [getSpreadMethod()](#getSpreadMethod--) | ブラシが主要な初期グラデーション領域の外側のコンテンツ領域をどのように塗りつぶすかを示す値を返します。 |
| [getStartPoint()](#getStartPoint--) | 線形グラデーションの始点を返します。 |
| [getTransform()](#getTransform--) | ブラシの座標空間に適用される行列変換を返します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | 色の補間に使用されるガンマ関数を指定する値を設定します。 |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | 線形グラデーションの終点を取得/設定します。 |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | グラデーションを構成するグラデーションストップのリストを設定します。 |
| [setOpacity(float value)](#setOpacity-float-) | ブラシの塗りの均一な透明度を定義する値を設定します。 |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | ブラシが主要な初期グラデーション領域の外側のコンテンツ領域をどのように塗りつぶすかを示す値を設定します。 |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | 線形グラデーションの始点を設定します。 |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | ブラシの座標空間に適用される行列変換を設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


この線形グラデーションブラシを複製します。

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


色の補間に使用されるガンマ関数を指定する値を返します。ガンマ調整は、指定されている場合、アルファ成分には適用しないでください。

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


線形グラデーションの終点を返します。

**Returns:**
java.awt.geom.Point2D - 線形グラデーションの終点。
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


グラデーションを構成するグラデーションストップのリストを返します。

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - グラデーションを構成するグラデーションストップのリスト。
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


ブラシの塗りの均一な透明度を定義する値を返します。

**Returns:**
float - ブラシの塗りの均一な透明度を定義する値。
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


ブラシが主要な初期グラデーション領域の外側のコンテンツ領域をどのように塗りつぶすかを示す値を返します。

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


線形グラデーションの始点を返します。

**Returns:**
java.awt.geom.Point2D - 線形グラデーションの始点。
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


ブラシの座標空間に適用される行列変換を返します。Transform プロパティは現在の有効なレンダー変換と連結され、ブラシローカルの有効なレンダー変換を生成します。ブラシのビュー ポートはローカルの有効なレンダー変換を使用して変換されます。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


カラー補間のガンマ関数を指定する値を設定します。指定されている場合、ガンマ調整はアルファ成分には適用しないでください。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | カラー補間のガンマ関数を指定する値。 |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


線形グラデーションの終点を取得/設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.awt.geom.Point2D | 線形グラデーションの終了点です。 |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


グラデーションを構成するグラデーションストップのリストを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.util.List<com.aspose.xps.XpsGradientStop> | グラデーションを構成するグラデーションストップのリスト。 |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


ブラシの塗りの均一な透明度を定義する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ブラシの塗りの均一な透明度を定義する値。 |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


ブラシが主要な初期グラデーション領域の外側のコンテンツ領域をどのように塗りつぶすかを示す値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | 一次的な初期グラデーション領域の外側のコンテンツ領域をブラシがどのように塗りつぶすかを示す値。 |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


線形グラデーションの始点を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.awt.geom.Point2D | 線形グラデーションの開始点です。 |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


ブラシの座標空間に適用される行列変換を設定します。Transform プロパティは現在の有効なレンダー変換と連結され、ブラシローカルの有効なレンダー変換を生成します。ブラシのビュー ポートはローカルの有効なレンダー変換を使用して変換されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | ブラシの座標空間に適用される行列変換。 |

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

