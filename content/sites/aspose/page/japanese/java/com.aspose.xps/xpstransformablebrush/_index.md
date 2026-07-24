---
title: "XpsTransformableBrush"
second_title: "Aspose.Page for Java API リファレンス"
description: "SolidColorBrush を除く、変形可能なブラシ要素の共通機能をカプセル化するクラス。"
type: docs
weight: 52
url: /ja/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

変形可能なブラシ要素（SolidColorBrush を除くすべて）の共通機能をカプセル化するクラス。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | ブラシの塗りの均一な透明度を定義する値を返します。 |
| [getTransform()](#getTransform--) | ブラシの座標空間に適用される行列変換を返します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | ブラシの塗りの均一な透明度を定義する値を設定します。 |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | ブラシの座標空間に適用される行列変換を設定します。 |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


ブラシの塗りの均一な透明度を定義する値を返します。

**Returns:**
float - ブラシの塗りの均一な透明度を定義する値。
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


ブラシの塗りの均一な透明度を定義する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ブラシの塗りの均一な透明度を定義する値。 |

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

