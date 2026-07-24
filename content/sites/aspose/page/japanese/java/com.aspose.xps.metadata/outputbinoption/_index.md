---
title: "OutputBin.OutputBinOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "JobOutputBin、DocumentOutputBin、および PageOutputBin の機能オプションについて説明します。"
type: docs
weight: 12
url: /ja/java/com.aspose.xps.metadata/outputbin.outputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.OutputBin.IOutputBinItem](../../com.aspose.xps.metadata/ioutputbinitem)
```
public static final class OutputBin.OutputBinOption extends Option implements OutputBin.IOutputBinItem
```

JobOutputBin、DocumentOutputBin、PageOutputBin 機能のオプションを説明します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [OutputBinOption(OutputBin.IOutputBinOptionItem[] items)](#OutputBinOption-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | このオプションの項目リストの末尾に項目のリストを追加します。 |
| [add(OutputBin.IOutputBinOptionItem[] items)](#add-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-) | 機能に IOutputBinOptionItem インスタンスの配列を追加します。 |
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
### OutputBinOption(OutputBin.IOutputBinOptionItem[] items) {#OutputBinOption-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-}
```
public OutputBinOption(OutputBin.IOutputBinOptionItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOutputBinOptionItem\[\]](../../com.aspose.xps.metadata/ioutputbinoptionitem) | 任意の IOutputBinOptionItem インスタンスの配列です。 |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


このオプションの項目リストの末尾に項目のリストを追加します。各項目は ScoredProperty または Property のインスタンスでなければなりません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 追加する項目のリスト。 |

### add(OutputBin.IOutputBinOptionItem[] items) {#add-com.aspose.xps.metadata.OutputBin.IOutputBinOptionItem...-}
```
public OutputBin.OutputBinOption add(OutputBin.IOutputBinOptionItem[] items)
```


機能に IOutputBinOptionItem インスタンスの配列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOutputBinOptionItem\[\]](../../com.aspose.xps.metadata/ioutputbinoptionitem) | 任意の IOutputBinOptionItem インスタンスの配列です。 |

**Returns:**
[OutputBinOption](../../com.aspose.xps.metadata/outputbinoption) - This options instance.
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

