---
title: "XpsPathGeometry"
second_title: "Aspose.Page for Java API リファレンス"
description: "PathGeometry プロパティ要素の機能をカプセル化するクラス。"
type: docs
weight: 42
url: /ja/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

PathGeometry プロパティ要素の機能をカプセル化するクラス。この要素は、Figures 属性または子 PathFigure 要素のいずれかで指定されたパス図形のセットを含みます。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(T obj)](#add-T-) | 配列に新しいオブジェクトを追加します。 |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | 最後の pah 図形の子セグメントリストにパスセグメントを追加します。 |
| [deepClone()](#deepClone--) | このパスジオメトリをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i によって配列の要素へのアクセスを提供します。 |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | 幾何形状の交差領域がどのように結合されて領域を形成するかを指定する値を返します。 |
| [getPathFigures()](#getPathFigures--) | 子パス図形のリストを返します。 |
| [getTransform()](#getTransform--) | パスジオメトリが塗りつぶし、クリッピング、またはストロークに使用される前に、すべての子および子孫要素に適用されるローカル行列変換を確立するアフィン変換行列を返します。 |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | 指定された位置に新しいオブジェクトを配列に挿入します。 |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | 最後のパス図形の子セグメントリストの index 位置にパスセグメントを挿入します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | 配列からオブジェクトを削除します。 |
| [removeAt(int index)](#removeAt-int-) | 指定された位置で配列からオブジェクトを削除します。 |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | 最後のパス図形の子セグメントリストからパスセグメントを削除します。 |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | 最後のパス図形の子セグメントリストの index 位置からパスセグメントを削除します。 |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | 幾何形状の交差領域がどのように結合されて領域を形成するかを指定する値を設定します。 |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | パスジオメトリが塗りつぶし、クリッピング、またはストロークに使用される前に、すべての子および子孫要素に適用されるローカル行列変換を確立するアフィン変換行列を設定します。 |
| [size()](#size--) | 要素数を返します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


配列に新しいオブジェクトを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| obj | T | 追加するオブジェクト。 |

**Returns:**
T - 追加されたオブジェクト。
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


最後の pah 図形の子セグメントリストにパスセグメントを追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 追加されるパスセグメント。 |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


このパスジオメトリをクローンします。

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
public T get(int i)
```


インデックス i によって配列の要素へのアクセスを提供します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| i | int | 要素のインデックス。 |

**Returns:**
T - インデックス i の位置にある要素。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


幾何形状の交差領域がどのように結合されて領域を形成するかを指定する値を返します。

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


子パス図形のリストを返します。

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - 子パス図形のリスト。
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


パスジオメトリが塗りつぶし、クリッピング、またはストロークに使用される前に、すべての子および子孫要素に適用されるローカル行列変換を確立するアフィン変換行列を返します。

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


指定された位置に新しいオブジェクトを配列に挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | オブジェクトを挿入する位置。 |
| obj | T | 挿入するオブジェクト。 |

**Returns:**
T - 挿入されたオブジェクト。
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


最後のパス図形の子セグメントリストの index 位置にパスセグメントを挿入します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | セグメントを挿入すべき位置。 |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 挿入されるパスセグメント。 |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


配列からオブジェクトを削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| obj | T | 削除するオブジェクト。 |

**Returns:**
T - 削除されたオブジェクト。
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


指定された位置で配列からオブジェクトを削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | オブジェクトを削除する位置。 |

**Returns:**
T - 削除されたオブジェクト。
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


最後のパス図形の子セグメントリストからパスセグメントを削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | 削除されるパスセグメント。 |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


最後のパス図形の子セグメントリストの index 位置からパスセグメントを削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| インデックス | int | パスセグメントを削除すべき位置。 |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


幾何形状の交差領域がどのように結合されて領域を形成するかを指定する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | 幾何形状の交差領域がどのように結合されて領域を形成するかを指定する値。 |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


パスジオメトリが塗りつぶし、クリッピング、またはストロークに使用される前に、すべての子および子孫要素に適用されるローカル行列変換を確立するアフィン変換行列を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | アフィン変換行列。 |

### size() {#size--}
```
public int size()
```


要素数を返します。

**Returns:**
int - 要素数。
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

