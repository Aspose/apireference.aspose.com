---
title: "InputBin.InputBinOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "JobInputBin、DocumentInputBin、PageInputBin の機能オプションを説明します。"
type: docs
weight: 14
url: /ja/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

JobInputBin、DocumentInputBin、PageInputBin 機能のオプションを説明します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | 新しいインスタンスを作成します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| [AutoSelect](#AutoSelect) | デバイスは構成に基づいて自動的に最適なオプションを選択します。 |
| [AutoSheetFeeder](#AutoSheetFeeder) | インクジェットプリンター用のデバイス入力トレイです。 |
| [Cassette](#Cassette) | 給紙トレイがカセットであることを指定します。 |
| [Manual](#Manual) | デフォルトの手動給紙トレイを指定します。 |
| [Tractor](#Tractor) | 給紙トレイがトラクタであることを指定します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | このオプションの項目リストの末尾に項目のリストを追加します。 |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | オプションに IInputBinOptionItem インスタンスの配列を追加します。 |
| [clone()](#clone--) | このオプション インスタンスをクローンします。 |
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
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| optionName | java.lang.String | オプション名です。 |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | 任意の IInputBinOptionItem インスタンスの配列です。 |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


デバイスは構成に基づいて自動的に最適なオプションを選択します。

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


インクジェットプリンター用のデバイス入力トレイです。

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


給紙トレイがカセットであることを指定します。

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


デフォルトの手動給紙トレイを指定します。

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


給紙トレイがトラクタであることを指定します。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


このオプションの項目リストの末尾に項目のリストを追加します。各項目は ScoredProperty または Property のインスタンスでなければなりません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 追加する項目のリスト。 |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


オプションに IInputBinOptionItem インスタンスの配列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | 任意の IInputBinOptionItem インスタンスの配列です。 |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


このオプション インスタンスをクローンします。

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
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

