---
title: "PageOutputColor.PageOutputColorOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "PageOutputColor 機能のオプションを説明します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.metadata/pageoutputcolor.pageoutputcoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageOutputColor.IPageOutputColorItem](../../com.aspose.xps.metadata/ipageoutputcoloritem)
```
public static final class PageOutputColor.PageOutputColorOption extends Option implements PageOutputColor.IPageOutputColorItem
```

PageOutputColor 機能のオプションを説明します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)](#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Color(int deviceBitsPerPixel, int driverBitsPerPixel)](#Color-int-int-) | 出力がカラーであることを指定します。 |
| [Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)](#Grayscale-int-int-) | 出力がグレースケールであることを指定します。 |
| [Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)](#Monochrome-int-int-) | 出力がモノクロ（黒）であることを指定します。 |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | このオプションの項目リストの末尾に項目のリストを追加します。 |
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | オプションに IPageOutputColorOptionItem インスタンスの配列を追加します。 |
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
### PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items) {#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| optionName | java.lang.String | オプション名です。 |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | 任意の IPageOutputColorOptionItem インスタンスの配列です。 |

### Color(int deviceBitsPerPixel, int driverBitsPerPixel) {#Color-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Color(int deviceBitsPerPixel, int driverBitsPerPixel)
```


出力がカラーであることを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| deviceBitsPerPixel | int | プリンターがサポートするカラー データのピクセルあたりビット数を示す DeviceBitsPerPixel スコア付きプロパティ値です。 |
| driverBitsPerPixel | int | コアドライバーがビットマップレンダリングバッファに使用すべきピクセルあたりビット数を示す DriverBitsPerPixel スコア付きプロパティ値です。 |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel) {#Grayscale-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)
```


出力がグレースケールであることを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| deviceBitsPerPixel | int | プリンターがサポートするカラー データのピクセルあたりビット数を示す DeviceBitsPerPixel スコア付きプロパティ値です。 |
| driverBitsPerPixel | int | コアドライバーがビットマップレンダリングバッファに使用すべきピクセルあたりビット数を示す DriverBitsPerPixel スコア付きプロパティ値です。 |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel) {#Monochrome-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)
```


出力がモノクロ（黒）であることを指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| deviceBitsPerPixel | int | プリンターがサポートするカラー データのピクセルあたりビット数を示す DeviceBitsPerPixel スコア付きプロパティ値です。 |
| driverBitsPerPixel | int | コアドライバーがビットマップレンダリングバッファに使用すべきピクセルあたりビット数を示す DriverBitsPerPixel スコア付きプロパティ値です。 |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


このオプションの項目リストの末尾に項目のリストを追加します。各項目は ScoredProperty または Property のインスタンスでなければなりません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 追加する項目のリスト。 |

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```


オプションに IPageOutputColorOptionItem インスタンスの配列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | 任意の IPageOutputColorOptionItem インスタンスの配列です。 |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
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

