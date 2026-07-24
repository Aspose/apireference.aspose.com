---
title: "DocumentPageRanges"
second_title: "Aspose.Page for Java API リファレンス"
description: "ドキュメントのページ単位での出力範囲を説明します。"
type: docs
weight: 31
url: /ja/java/com.aspose.xps.metadata/documentpageranges/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentPageRanges extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

ドキュメントのページ単位での出力範囲を説明します。パラメーター値は以下の構造に従う必要があります: - PageRangeText: "PageRange" または "PageRange,PageRange" - PageRange: "PageNumber" または "PageNumber-PageNumber" - PageNumber: 1 から N まで、ここで N はドキュメントのページ数です。PageNumber が N を超える場合、PageNumber は N になります。文字列内の空白は無視されるべきです。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [DocumentPageRanges(String value)](#DocumentPageRanges-java.lang.String-) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | 最短および最長の文字列を定義します。 |
| [getMinLength()](#getMinLength--) | 文字列値に対して、許容される最短の文字列を定義します。 |
| [getName()](#getName--) | 要素名を取得します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DocumentPageRanges(String value) {#DocumentPageRanges-java.lang.String-}
```
public DocumentPageRanges(String value)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.lang.String | パラメータ値。 |

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
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


最短および最長の文字列を定義します。

**Returns:**
int - 許容される最長文字列。
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


文字列値に対して、許容される最短の文字列を定義します。

**Returns:**
int - 許容される最短文字列。
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

