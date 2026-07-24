---
title: "CompositePrintTicketElement"
second_title: "Aspose.Page for Java API リファレンス"
description: "他の要素を含む複合 Print Schema 要素になる可能性があるクラスの基底クラスです。"
type: docs
weight: 11
url: /ja/java/com.aspose.xps.metadata/compositeprintticketelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)
```
public abstract class CompositePrintTicketElement extends PrintTicketElement
```

他の要素を含む可能性のある複合 Print Schema 要素の基底クラスです。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)](#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-) | 新しいインスタンスを作成します。 |
| [CompositePrintTicketElement(CompositePrintTicketElement element)](#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-) | この要素インスタンスをクローンします。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 要素名を取得します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompositePrintTicketElement(String name, IPrintTicketElementChild[] items) {#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-}
```
public CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 名前 | java.lang.String | 要素の名前を、いくつかの XML スキーマ（Microsoft Print Schema Framework など）に従って指定します。 |
| items | [IPrintTicketElementChild\[\]](../../com.aspose.xps.metadata/iprintticketelementchild) | 子アイテムの任意の配列です。 |

### CompositePrintTicketElement(CompositePrintTicketElement element) {#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-}
```
public CompositePrintTicketElement(CompositePrintTicketElement element)
```


この要素インスタンスをクローンします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| element | [CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement) | クローンする要素インスタンスです。 |

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
### getName() {#getName--}
```
public String getName()
```


要素名を取得します。

**Returns:**
java.lang.String
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

