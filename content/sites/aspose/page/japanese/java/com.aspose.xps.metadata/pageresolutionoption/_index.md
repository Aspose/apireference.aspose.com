---
title: "PageResolution.PageResolutionOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "PageResolution 機能のオプションを説明します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.metadata/pageresolution.pageresolutionoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageResolution.IPageResolutionItem](../../com.aspose.xps.metadata/ipageresolutionitem)
```
public static final class PageResolution.PageResolutionOption extends Option implements PageResolution.IPageResolutionItem
```

PageResolution の機能オプションを記述します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)](#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | このオプションの項目リストの末尾に項目のリストを追加します。 |
| [add(PageResolution.IPageResolutionOptionItem[] items)](#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | IPageResolutionOptionItem インスタンスの配列をオプションに追加します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 要素名を取得します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setResolutionX(int resolutionX)](#setResolutionX-int-) | ResolutionX のスコア付きプロパティ値を設定します。 |
| [setResolutionY(int resolutionY)](#setResolutionY-int-) | ResolutionY のスコア付きプロパティ値を設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items) {#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| optionName | java.lang.String | オプション名です。 |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | IPageResolutionOptionItem インスタンスの任意の配列です。 |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


このオプションの項目リストの末尾に項目のリストを追加します。各項目は ScoredProperty または Property のインスタンスでなければなりません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 追加する項目のリスト。 |

### add(PageResolution.IPageResolutionOptionItem[] items) {#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolution.PageResolutionOption add(PageResolution.IPageResolutionOptionItem[] items)
```


IPageResolutionOptionItem インスタンスの配列をオプションに追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | IPageResolutionOptionItem インスタンスの任意の配列です。 |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This options instance.
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




### setResolutionX(int resolutionX) {#setResolutionX-int-}
```
public PageResolution.PageResolutionOption setResolutionX(int resolutionX)
```


ResolutionX のスコア付きプロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| resolutionX | int | ResolutionX のスコア付きプロパティ値です。 |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
### setResolutionY(int resolutionY) {#setResolutionY-int-}
```
public PageResolution.PageResolutionOption setResolutionY(int resolutionY)
```


ResolutionY のスコア付きプロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| resolutionY | int | ResolutionY のスコア付きプロパティ値です。 |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
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

