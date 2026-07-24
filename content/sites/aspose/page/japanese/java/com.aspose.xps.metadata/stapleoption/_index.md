---
title: "Staple.StapleOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "JobStapleAllDocuments と DocumentStaple の機能オプションを説明します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

JobStapleAllDocuments と DocumentStaple の機能オプションについて説明します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | 新しいインスタンスを作成します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| [None](#None) | 綴じなしを指定します。 |
| [SaddleStitch](#SaddleStitch) | サドルステッチ綴じを指定します。 |
| [StapleBottomLeft](#StapleBottomLeft) | 左下隅に1本のホチキス留めを指定します。 |
| [StapleBottomRight](#StapleBottomRight) | 右下隅に1本のホチキス留めを指定します。 |
| [StapleDualBottom](#StapleDualBottom) | 下端に沿って2本のホチキス留めを指定します。 |
| [StapleDualLeft](#StapleDualLeft) | 左端に沿って2本のホチキス留めを指定します。 |
| [StapleDualRight](#StapleDualRight) | 右端に沿って2本のホチキス留めを指定します。 |
| [StapleDualTop](#StapleDualTop) | 上端に沿って2本のホチキス留めを指定します |
| [StapleTopLeft](#StapleTopLeft) | 左上隅に1本のホチキス留めを指定します。 |
| [StapleTopRight](#StapleTopRight) | 右上隅に1本のホチキス留めを指定します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | このオプションの項目リストの末尾に項目のリストを追加します。 |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | 機能に IStapleOptionItem インスタンスの配列を追加します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 要素名を取得します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Angle のスコア付きプロパティ値を設定します。 |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | SheetCapacity のスコア付きプロパティ値を設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| optionName | java.lang.String | オプション名です。 |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | 任意の IStapleOptionItem インスタンスの配列です。 |

### None {#None}
```
public static final Staple.StapleOption None
```


綴じなしを指定します。

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


サドルステッチ綴じを指定します。

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


左下隅に1本のホチキス留めを指定します。

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


右下隅に1本のホチキス留めを指定します。

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


下端に沿って2本のホチキス留めを指定します。

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


左端に沿って2本のホチキス留めを指定します。

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


右端に沿って2本のホチキス留めを指定します。

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


上端に沿って2本のホチキス留めを指定します

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


左上隅に1本のホチキス留めを指定します。

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


右上隅に1本のホチキス留めを指定します。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


このオプションの項目リストの末尾に項目のリストを追加します。各項目は ScoredProperty または Property のインスタンスでなければなりません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 追加する項目のリスト。 |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


機能に IStapleOptionItem インスタンスの配列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | 任意の IStapleOptionItem インスタンスの配列です。 |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


Angle のスコア付きプロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| angle | int | Angle のスコア付きプロパティ値です。 |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


SheetCapacity のスコア付きプロパティ値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| sheetCapacity | int | SheetCapacity のスコア付きプロパティ値です。 |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
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

