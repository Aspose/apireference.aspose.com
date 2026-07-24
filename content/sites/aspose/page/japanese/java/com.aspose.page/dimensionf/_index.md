---
title: "DimensionF"
second_title: "Aspose.Page for Java API リファレンス"
description: "Dimension クラスは、コンポーネントの幅と高さを単精度で単一のオブジェクトにカプセル化します。"
type: docs
weight: 11
url: /ja/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

`Dimension` クラスは、コンポーネントの幅と高さ（単精度）を単一のオブジェクトにカプセル化します。

通常、`width` と `height` の値は負でない整数です。次元を作成できるコンストラクタは、これらのプロパティに負の値を設定することを防ぎません。`width` または `height` の値が負の場合、他のオブジェクトで定義された一部のメソッドの動作は未定義です。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [DimensionF()](#DimensionF--) | `Dimension` の幅がゼロで高さがゼロのインスタンスを作成します。 |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | 指定された次元と同じ幅と高さを持つ `Dimension` のインスタンスを作成します。 |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | `Dimension` を構築し、指定された幅と指定された高さで初期化します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| [height](#height) | height 次元; 負の値を使用できます。 |
| [width](#width) | width 次元; 負の値を使用できます。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | 2 つの dimension オブジェクトが等しい値かどうかを確認します。 |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | この `Dimension` オブジェクトのサイズを取得します。 |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | この `Dimension` のハッシュコードを返します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | この `Dimension` オブジェクトのサイズを指定されたサイズに設定します。 |
| [setSize(double width, double height)](#setSize-double-double-) | この `Dimension` オブジェクトのサイズを、指定された幅と高さ（倍精度）に設定します。 |
| [setSize(float width, float height)](#setSize-float-float-) | この `Dimension` オブジェクトのサイズを、指定された幅と高さに設定します。 |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | この `Dimension` オブジェクトの `height` と `width` フィールドの値を表す文字列を返します。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


`Dimension` の幅がゼロで高さがゼロのインスタンスを作成します。

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


指定された次元と同じ幅と高さを持つ `Dimension` のインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | `width` と `height` の値に対する指定された次元 |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


`Dimension` を構築し、指定された幅と指定された高さで初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float | 指定された幅 |
| height | float | 指定された高さ |

### height {#height}
```
public float height
```


height 次元; 負の値を使用できます。

### width {#width}
```
public float width
```


width 次元; 負の値を使用できます。

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


2 つの dimension オブジェクトが等しい値かどうかを確認します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


この `Dimension` オブジェクトのサイズを取得します。このメソッドは完全性のために含まれており、`Component` に定義された `getSize` メソッドと同等です。

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


この `Dimension` のハッシュコードを返します。

**Returns:**
int - この `Dimension` のハッシュコード
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


この `Dimension` オブジェクトのサイズを指定されたサイズに設定します。このメソッドは完全性のために含まれており、`Component` に定義された `setSize` メソッドと同等です。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | この `Dimension` オブジェクトの新しいサイズ |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


この `Dimension` オブジェクトのサイズを、指定された幅と高さ（倍精度）に設定します。`width` または `height` が `Integer.MAX_VALUE` より大きい場合、`Integer.MAX_VALUE` にリセットされることに注意してください。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | double | `Dimension` オブジェクトの新しい幅 |
| height | double | `Dimension` オブジェクトの新しい高さ |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


この `Dimension` オブジェクトのサイズを指定された幅と高さに設定します。このメソッドは完全性のために含まれており、`Component` に定義された `setSize` メソッドと同等です。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| width | float | この `Dimension` オブジェクトの新しい幅 |
| height | float | この `Dimension` オブジェクトの新しい高さ |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


この `Dimension` オブジェクトの `height` と `width` フィールドの値を文字列で返します。このメソッドはデバッグ目的でのみ使用されることを意図しており、返される文字列の内容や形式は実装間で異なる場合があります。返される文字列は空になることがありますが、`null` になることはありません。

**Returns:**
java.lang.String - この `Dimension` オブジェクトの文字列表現
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

