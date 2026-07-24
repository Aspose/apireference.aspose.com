---
title: "PrintTicket"
second_title: "Aspose.Page for Java API リファレンス"
description: "任意のスコープの共通 PrintTicket を実装するクラスです。"
type: docs
weight: 141
url: /ja/java/com.aspose.xps.metadata/printticket/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class PrintTicket implements Iterable<String>
```

任意のスコープの共通 PrintTicket を実装するクラスです。ジョブ、ドキュメント、ページレベルの印刷チケットの基底クラスです。PrintTicket 要素は PrintTicket ドキュメントのルート要素です。PrintTicket 要素はジョブを出力するために必要なすべてのジョブ書式情報を含みます。 https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PrintTicket(IPrintTicketItem[] items)](#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | 印刷チケット アイテム名のイテレータを返します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | この PrintTicket アイテムリストからアイテムを削除します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PrintTicket(IPrintTicketItem[] items) {#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-}
```
public PrintTicket(IPrintTicketItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IPrintTicketItem\[\]](../../com.aspose.xps.metadata/iprintticketitem) | 任意の IPrintTicketItem インスタンスの配列です。各インスタンスは Feature、ParameterInit、または Property のいずれかでなければなりません。 |

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


印刷チケット アイテム名のイテレータを返します。

**Returns:**
java.util.Iterator<java.lang.String> - リストのイテレータを返します。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


この PrintTicket アイテムリストからアイテムを削除します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 名前 | java.lang.String[] | アイテム名の配列です。 |

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

