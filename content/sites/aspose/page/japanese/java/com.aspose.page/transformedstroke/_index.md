---
title: "TransformedStroke"
second_title: "Aspose.Page for Java API リファレンス"
description: "変換を含むストロークです。"
type: docs
weight: 17
url: /ja/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

変換を含むストロークです。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | 別の Stroke と AffineTransform に基づいて TransformedStroke を作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | このストロークで指定された Shape を描画し、アウトラインを作成します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | 基本的なストロークを取得します。 |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | 変換を取得します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


別の Stroke と AffineTransform に基づいて TransformedStroke を作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| base | java.awt.Stroke | ストロークのベースです。 |
| at | java.awt.geom.AffineTransform | アフィン変換です。 |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


このストロークで指定された Shape を描画し、アウトラインを作成します。このアウトラインは、ベースストロークによって生成されるアウトラインに対して、当社の AffineTransform によって歪められますが、スケーリング（すなわち線の太さ）のみが適用され、平行移動と回転はストローク後に元に戻されます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| s | java.awt.Shape | アウトライン化される Shape として。 |

**Returns:**
java.awt.Shape - 形状のアウトラインです。
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
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


基本的なストロークを取得します。

**Returns:**
java.awt.Stroke - 基本的なストロークです。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


変換を取得します。

**Returns:**
java.awt.geom.AffineTransform - 変換です。
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

