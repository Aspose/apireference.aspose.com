---
title: "XpsMatrix"
second_title: "Aspose.Page for Java API リファレンス"
description: "MatrixTransform プロパティ要素の機能をカプセル化するクラス。"
type: docs
weight: 36
url: /ja/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

MatrixTransformプロパティ要素の機能をカプセル化するクラス。この要素は、要素の座標系を操作するために使用される任意のアフィン行列変換を定義します。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [deepClone()](#deepClone--) | この変換行列をクローンします。 |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 実際の実装。 |
| [equals(Object obj)](#equals-java.lang.Object-) | 指定された  object  がこのインスタンスと等しいかどうかを判断します。 |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | M11 要素を取得します。 |
| [getM12()](#getM12--) | M12 要素を取得します。 |
| [getM21()](#getM21--) | M21 要素を取得します。 |
| [getM22()](#getM22--) | M22 要素を取得します。 |
| [getM31()](#getM31--) | M31 要素を取得します。 |
| [getM32()](#getM32--) | M32 要素を取得します。 |
| [hashCode()](#hashCode--) | このインスタンスのハッシュコードを返します。 |
| [isIdentity()](#isIdentity--) | このインスタンスが単位行列かどうかを示す値を取得します。 |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | この行列を、デフォルト（Prepend）順序で指定された  matrix  行列で乗算します。 |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | この行列を、  matrixOrder  で指定された順序で指定された  matrix  行列で乗算します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 演算子 == を実装します。 |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 演算子 ! を実装します。 |
| [reset()](#reset--) | この Matrix を単位行列にリセットします。 |
| [rotate(float angle)](#rotate-float-) | デフォルト（Prepend）順序で、  angle  の時計回り回転をこの Matrix に適用します。 |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) |   matrixOrder  で指定された順序で、  angle  の時計回り回転をこの Matrix に適用します。 |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | デフォルト（Prepend）順序で、  pivot  を中心に  angle  の時計回り回転をこの Matrix に適用します。 |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) |   matrixOrder  で指定された順序で、  pivot  を中心に  angle  の時計回り回転をこの Matrix に適用します。 |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | デフォルト（Prepend）順序で、指定されたスケールベクトル（scaleX と scaleY）をこの Matrix に適用します。 |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) |   matrixOrder  で指定された順序で、指定されたスケールベクトル（scaleX と scaleY）をこの Matrix に適用します。 |
| [skew(double skewX, double skewY)](#skew-double-double-) | 指定されたせん断変換をこの Matrix に適用します。 |
| [toString()](#toString--) | この  XpsMatrix  インスタンスの文字列表現を返します。 |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | この Matrix が表すアフィン変換を指定された矩形に適用します。 |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | この Matrix が表すアフィン変換を指定された点に適用します。 |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | この Matrix が表すアフィン変換を指定された点の配列に適用します。 |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | この Matrix が表すアフィン変換を指定された点配列の一部に適用します。 |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | 指定された平行移動ベクトルをこの Matrix に適用します。 |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) |   matrixOrder  で指定された順序で、指定された平行移動ベクトルをこの Matrix に適用します。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


この変換行列をクローンします。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


実際の実装。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 最初の行列です。 |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 2 番目の行列です。 |

**Returns:**
boolean - 行列が等しい場合は[true]
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


指定された  object  がこのインスタンスと等しいかどうかを判断します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| obj | java.lang.Object | このインスタンスと比較するオブジェクト。 |

**Returns:**
boolean - 指定されたオブジェクトがこのインスタンスと等しい場合は true、そうでない場合は false。obj パラメータが null の場合。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


M11 要素を取得します。

**Returns:**
float - M11 要素。
### getM12() {#getM12--}
```
public float getM12()
```


M12 要素を取得します。

**Returns:**
float - M12 要素。
### getM21() {#getM21--}
```
public float getM21()
```


M21 要素を取得します。

**Returns:**
float - M21 要素。
### getM22() {#getM22--}
```
public float getM22()
```


M22 要素を取得します。

**Returns:**
float - M22 要素。
### getM31() {#getM31--}
```
public float getM31()
```


M31 要素を取得します。

**Returns:**
float - M31 要素。
### getM32() {#getM32--}
```
public float getM32()
```


M32 要素を取得します。

**Returns:**
float - M32 要素。
### hashCode() {#hashCode--}
```
public int hashCode()
```


このインスタンスのハッシュコードを返します。

**Returns:**
int - このインスタンスのハッシュコードで、ハッシュアルゴリズムやハッシュテーブルのようなデータ構造での使用に適しています。
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


このインスタンスが単位行列かどうかを示す値を取得します。

値: このインスタンスが単位行列の場合は True、そうでない場合は false。

**Returns:**
boolean - このインスタンスが単位行列かどうかを示す値。
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


この行列を、デフォルト（Prepend）順序で指定された  matrix  行列で乗算します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 行列。 |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


この行列を、  matrixOrder  で指定された順序で指定された  matrix  行列で乗算します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 行列。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 順序。 |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


演算子 == を実装します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 最初の行列です。 |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 2 番目の行列です。 |

**Returns:**
boolean - 演算子の結果。
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


!= 演算子を実装します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 最初の行列です。 |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 2 番目の行列です。 |

**Returns:**
boolean - 演算子の結果。
### reset() {#reset--}
```
public void reset()
```


この Matrix を単位行列にリセットします。

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


デフォルト（Prepend）順序で、  angle  の時計回り回転をこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| angle | float | 角度。 |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


  matrixOrder  で指定された順序で、  angle  の時計回り回転をこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| angle | float | 角度。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 順序。 |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


デフォルト（Prepend）順序で、  pivot  を中心に  angle  の時計回り回転をこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| angle | float | 角度。 |
| ピボット | java.awt.geom.Point2D | ピボット点。 |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


  matrixOrder  で指定された順序で、  pivot  を中心に  angle  の時計回り回転をこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| angle | float | 角度。 |
| ピボット | java.awt.geom.Point2D | ピボット点。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 順序。 |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


デフォルト（Prepend）順序で、指定されたスケールベクトル（scaleX と scaleY）をこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| scaleX | float | スケール x。 |
| scaleY | float | スケール y。 |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


  matrixOrder  で指定された順序で、指定されたスケールベクトル（scaleX と scaleY）をこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| scaleX | float | スケール X。 |
| scaleY | float | スケール Y。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 順序。 |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


指定されたせん断変換をこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| skewX | double | skew xです。 |
| skewY | double | skew yです。 |

### toString() {#toString--}
```
public String toString()
```


この  XpsMatrix  インスタンスの文字列表現を返します。

**Returns:**
java.lang.String - 文字列表現
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


この Matrix が表すアフィン変換を指定された矩形に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | 矩形です。 |

**Returns:**
java.awt.geom.Rectangle2D - 変換された矩形
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


この Matrix が表すアフィン変換を指定された点に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| ポイント | java.awt.geom.Point2D | 点です。 |

**Returns:**
java.awt.geom.Point2D - 変換された点
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


この Matrix が表すアフィン変換を指定された点の配列に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 点です。 |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


この Matrix が表すアフィン変換を指定された点配列の一部に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 点です。 |
| startIndex | int | 開始インデックスです。 |
| numberOfPoints | int | 点の数です。 |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


指定された平行移動ベクトルをこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| offsetX | float | オフセット Xです。 |
| offsetY | float | オフセット Yです。 |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


  matrixOrder  で指定された順序で、指定された平行移動ベクトルをこの Matrix に適用します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| offsetX | float | オフセット Xです。 |
| offsetY | float | オフセット Yです。 |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 順序。 |

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

