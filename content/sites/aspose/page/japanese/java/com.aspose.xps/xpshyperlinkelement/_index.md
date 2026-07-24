---
title: "XpsHyperlinkElement"
second_title: "Aspose.Page for Java API リファレンス"
description: "ハイパーリンクになり得る XPS 要素の共通機能をカプセル化します。"
type: docs
weight: 28
url: /ja/java/com.aspose.xps/xpshyperlinkelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public abstract class XpsHyperlinkElement extends XpsElement
```

ハイパーリンクになり得る XPS 要素の共通機能をカプセル化します。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | インデックス i による要素の子へのアクセスを提供します。 |
| [getClass()](#getClass--) |  |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | ハイパーリンクのターゲットオブジェクトを返します。 |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable インターフェイスの実装。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | ハイパーリンクのターゲットオブジェクトを設定します。 |
| [size()](#size--) | 子要素の数を返します。 |
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
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


ハイパーリンクのターゲットオブジェクトを返します。

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
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




### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


ハイパーリンクのターゲットオブジェクトを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | ハイパーリンクのターゲットオブジェクト。 |

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

