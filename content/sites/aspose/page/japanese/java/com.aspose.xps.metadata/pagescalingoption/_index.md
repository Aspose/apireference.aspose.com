---
title: "PageScaling.PageScalingOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "PageScaling 機能のオプションを説明します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

PageScaling の機能オプションを記述します。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [Custom](#Custom) | Application Media Size にカスタムスケーリングを適用するように指定します。 |
| [CustomSquare](#CustomSquare) | Application Media Size にカスタム正方形スケーリングを適用するように指定します。 |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | アプリケーションのブリードサイズをアスペクト比を保持したまま PageImageableSize にスケーリングするように指定します。 |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | アプリケーションのコンテンツサイズをアスペクト比を保持したまま PageImageableSize にスケーリングするように指定します。 |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | アプリケーションのメディアサイズをアスペクト比を保持したまま PageImageableSize にスケーリングするように指定します。 |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | アプリケーションのメディアサイズをアスペクト比を保持したまま PageMediaSize にスケーリングするように指定します。 |
| [None](#None) | スケーリングを適用しないように指定します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | このオプションの項目リストの末尾に項目のリストを追加します。 |
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
### Custom {#Custom}
```
public static PageScaling.PageScalingOption Custom
```


Application Media Size にカスタムスケーリングを適用するように指定します。

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


Application Media Size にカスタム正方形スケーリングを適用するように指定します。

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```


アプリケーションのブリードサイズをアスペクト比を保持したまま PageImageableSize にスケーリングするように指定します。

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```


アプリケーションのコンテンツサイズをアスペクト比を保持したまま PageImageableSize にスケーリングするように指定します。

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```


アプリケーションのメディアサイズをアスペクト比を保持したまま PageImageableSize にスケーリングするように指定します。

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```


アプリケーションのメディアサイズをアスペクト比を保持したまま PageMediaSize にスケーリングするように指定します。

### None {#None}
```
public static PageScaling.PageScalingOption None
```


スケーリングを適用しないように指定します。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


このオプションの項目リストの末尾に項目のリストを追加します。各項目は ScoredProperty または Property のインスタンスでなければなりません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 追加する項目のリスト。 |

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

