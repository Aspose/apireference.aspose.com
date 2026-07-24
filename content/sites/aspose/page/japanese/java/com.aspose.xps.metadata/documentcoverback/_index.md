---
title: "DocumentCoverBack"
second_title: "Aspose.Page for Java API リファレンス"
description: "裏面のカバーシートを説明します。"
type: docs
weight: 19
url: /ja/java/com.aspose.xps.metadata/documentcoverback/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentCoverBack extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

裏表紙（終了）カバーシートを記述します。各ドキュメントは個別のシートを持ちます。カバーシートは、ドキュメントの最終ページに使用される PageMediaSize と PageMediaType 上に印刷する必要があります。カバーシートは、指定されたオプションで示されるように、DocumentDuplex や DocumentNUp などの処理オプションに統合すべきです。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options)](#DocumentCoverBack-com.aspose.xps.metadata.DocumentCoverBack.CoverBackOption...-) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | この機能の項目リストの末尾に項目のリストを追加します。 |
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
### DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options) {#DocumentCoverBack-com.aspose.xps.metadata.DocumentCoverBack.CoverBackOption...-}
```
public DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [CoverBackOption\[\]](../../com.aspose.xps.metadata/coverbackoption) | 機能に固有のオプションの配列です。 |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


この機能のアイテムリストの末尾に項目のリストを追加します。各項目は Feature、Option、または Property のインスタンスである必要があります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | 追加する項目のリスト。 |

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

