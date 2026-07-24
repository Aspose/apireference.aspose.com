---
title: "PagePoster"
second_title: "Aspose.Page for Java API リファレンス"
description: "単一ページの出力を複数の物理メディアシートに記述します。"
type: docs
weight: 118
url: /ja/java/com.aspose.xps.metadata/pageposter/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PagePoster extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

単一ページの出力を複数の物理メディアシートに変換する方法を説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageposter
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PagePoster()](#PagePoster--) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | この機能の項目リストの末尾に項目のリストを追加します。 |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | PagesPerSheet スコアドプロパティ値を持つオプションを追加します。 |
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
### PagePoster() {#PagePoster--}
```
public PagePoster()
```


新しいインスタンスを作成します。

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


この機能のアイテムリストの末尾に項目のリストを追加します。各項目は Feature、Option、または Property のインスタンスである必要があります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | 追加する項目のリスト。 |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public PagePoster addPagesPerSheetOption(int value)
```


PagesPerSheet のスコア付きプロパティ値を使用してオプションを追加します。論理ページあたりの物理シート数を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | PagesPerSheet のスコア付きプロパティ値。 |

**Returns:**
[PagePoster](../../com.aspose.xps.metadata/pageposter) - This feature instance.
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

