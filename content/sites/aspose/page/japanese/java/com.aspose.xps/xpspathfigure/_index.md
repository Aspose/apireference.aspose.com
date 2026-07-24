---
title: "XpsPathFigure"
second_title: "Aspose.Page for Java API リファレンス"
description: "PathFigure 要素の機能をカプセル化するクラス。"
type: docs
weight: 41
url: /ja/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

PathFigure 要素の機能をカプセル化するクラスです。この要素は、1 つ以上の直線または曲線セグメントの集合で構成されます。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(T obj)](#add-T-) | 配列に新しいオブジェクトを追加します。 |
| [deepClone()](#deepClone--) | このパスフィギュアをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i によって配列の要素へのアクセスを提供します。 |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | 子パスセグメントのリストを返します。 |
| [getStartPoint()](#getStartPoint--) | パスフィギュアの最初のセグメントの開始点を返します。 |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | 指定された位置に新しいオブジェクトを配列に挿入します。 |
| [isClosed()](#isClosed--) | パスフィギュアが閉じているかどうかを示す値を返します。 |
| [isFilled()](#isFilled--) | パスフィギュアが包含するパスジオメトリの面積計算に使用されているかどうかを示す値を返します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | 配列からオブジェクトを削除します。 |
| [removeAt(int index)](#removeAt-int-) | 指定された位置で配列からオブジェクトを削除します。 |
| [setClosed(boolean value)](#setClosed-boolean-) | パスフィギュアが閉じているかどうかを示す値を設定します。 |
| [setFilled(boolean value)](#setFilled-boolean-) | パスフィギュアが包含するパスジオメトリの面積計算に使用されているかどうかを示す値を設定します。 |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | パスフィギュアの最初のセグメントの開始点を設定します。 |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


このパスフィギュアをクローンします。

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


子パスセグメントのリストを返します。

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - 子パスセグメントのリスト。
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


パスフィギュアの最初のセグメントの開始点を返します。

**Returns:**
java.awt.geom.Point2D - パスフィギュアの最初のセグメントの開始点。
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


パスフィギュアが閉じているかどうかを示す値を返します。

**Returns:**
boolean - パス図形が閉じているかどうかを示す値。
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


パスフィギュアが包含するパスジオメトリの面積計算に使用されているかどうかを示す値を返します。

**Returns:**
boolean - パス図形が包含するパスジオメトリの面積計算に使用されているかどうかを示す値。
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


パスフィギュアが閉じているかどうかを示す値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | boolean | パス図形が閉じているかどうかを示す値。 |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


パスフィギュアが包含するパスジオメトリの面積計算に使用されているかどうかを示す値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | boolean | パス図形が包含するパスジオメトリの面積計算に使用されているかどうかを示す値。 |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


パスフィギュアの最初のセグメントの開始点を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.awt.geom.Point2D | パス図形の最初のセグメントの開始点。 |

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

