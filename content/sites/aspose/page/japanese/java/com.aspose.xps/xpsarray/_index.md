---
title: "XpsArray"
second_title: "Aspose.Page for Java API リファレンス"
description: "共通の XPS モデル配列オブジェクトの機能をカプセル化するクラス。"
type: docs
weight: 14
url: /ja/java/com.aspose.xps/xpsarray/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public abstract class XpsArray<T> extends XpsObject
```

共通の XPS モデル配列オブジェクトの機能をカプセル化するクラス。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(T obj)](#add-T-) | 配列に新しいオブジェクトを追加します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i によって配列の要素へのアクセスを提供します。 |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | 指定された位置に新しいオブジェクトを配列に挿入します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | 配列からオブジェクトを削除します。 |
| [removeAt(int index)](#removeAt-int-) | 指定された位置で配列からオブジェクトを削除します。 |
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

