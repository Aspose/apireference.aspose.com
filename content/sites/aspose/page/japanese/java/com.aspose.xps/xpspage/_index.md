---
title: "XpsPage"
second_title: "Aspose.Page for Java API リファレンス"
description: "FixedPage 要素の機能をカプセル化するクラス。"
type: docs
weight: 38
url: /ja/java/com.aspose.xps/xpspage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public final class XpsPage extends XpsElement
```

FixedPage 要素の機能をカプセル化するクラス。この要素はページの内容を保持し、FixedPage パートのルート要素です。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [deepClone()](#deepClone--) | このページをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i による要素の子へのアクセスを提供します。 |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | ページの高さを、実座標空間の単位で実数として返します。 |
| [getWidth()](#getWidth--) | ページの幅を、実座標空間の単位で実数として返します。 |
| [getXmlLang()](#getXmlLang--) | 現在の要素およびすべての子要素や子孫要素で使用されるデフォルト言語を指定する値を返します。 |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable インターフェイスの実装。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHeight(float value)](#setHeight-float-) | ページの高さを、実座標空間の単位で実数として設定します。 |
| [setWidth(float value)](#setWidth-float-) | ページの幅を、実座標空間の単位で実数として設定します。 |
| [setXmlLang(String value)](#setXmlLang-java.lang.String-) | 現在の要素およびすべての子要素や子孫要素で使用されるデフォルト言語を指定する値を設定します。 |
| [size()](#size--) | 子要素の数を返します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPage deepClone()
```


このページをクローンします。

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Clone of this page.
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
### getHeight() {#getHeight--}
```
public float getHeight()
```


ページの高さを、実座標空間の単位で実数として返します。

**Returns:**
float - ページの高さです。
### getWidth() {#getWidth--}
```
public float getWidth()
```


ページの幅を、実座標空間の単位で実数として返します。

**Returns:**
float - ページの幅です。
### getXmlLang() {#getXmlLang--}
```
public String getXmlLang()
```


現在の要素およびすべての子要素や子孫要素で使用されるデフォルト言語を指定する値を返します。

**Returns:**
java.lang.String - デフォルト言語を指定する値。
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




### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


ページの高さを、実座標空間の単位で実数として設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ページの高さです。 |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


ページの幅を、実座標空間の単位で実数として設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | float | ページの幅です。 |

### setXmlLang(String value) {#setXmlLang-java.lang.String-}
```
public void setXmlLang(String value)
```


現在の要素およびすべての子要素や子孫要素で使用されるデフォルト言語を指定する値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.lang.String | デフォルト言語を指定する値。 |

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

