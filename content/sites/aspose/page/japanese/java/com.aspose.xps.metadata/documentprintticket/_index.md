---
title: "DocumentPrintTicket"
second_title: "Aspose.Page for Java API リファレンス"
description: "ドキュメントレベルの印刷チケットをカプセル化するクラスです。"
type: docs
weight: 32
url: /ja/java/com.aspose.xps.metadata/documentprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class DocumentPrintTicket extends PrintTicket
```

ドキュメントレベルの印刷チケットをカプセル化するクラスです。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [DocumentPrintTicket(IDocumentPrintTicketItem[] items)](#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | ドキュメントレベルの印刷チケット インスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IDocumentPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | この PrintTicket アイテムリストの末尾にアイテムの配列を追加します。 |
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
### DocumentPrintTicket(IDocumentPrintTicketItem[] items) {#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public DocumentPrintTicket(IDocumentPrintTicketItem[] items)
```


ドキュメントレベルの印刷チケット インスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IDocumentPrintTicketItem\[\]](../../com.aspose.xps.metadata/idocumentprintticketitem) | 任意の IDocumentPrintTicketItem インスタンスの配列です。各インスタンスは Feature、ParameterInit、または Property のいずれかでなければなりません。 |

### add(IDocumentPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public void add(IDocumentPrintTicketItem[] items)
```


この PrintTicket アイテムリストの末尾にアイテムの配列を追加します。各アイテムは Feature、Option、または Property のインスタンスである可能性があります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IDocumentPrintTicketItem\[\]](../../com.aspose.xps.metadata/idocumentprintticketitem) | 追加するアイテムの配列です。 |

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

