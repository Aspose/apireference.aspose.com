---
title: "JobBindAllDocuments.BindingOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "JobBindAllDocuments 機能のオプションについて説明します。"
type: docs
weight: 11
url: /ja/java/com.aspose.xps.metadata/jobbindalldocuments.bindingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobBindAllDocuments.BindingOption extends Option
```

JobBindAllDocuments 機能のオプションを記述します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)](#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-) | 新しいインスタンスを作成します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| [Bale](#Bale) | ベイル結合を指定します。 |
| [BindBottom](#BindBottom) | 下端に沿った結合を指定します。 |
| [BindLeft](#BindLeft) | 左端に沿った結合を指定します。 |
| [BindRight](#BindRight) | 右端に沿った結合を指定します。 |
| [BindTop](#BindTop) | 上端に沿った結合を指定します。 |
| [Booklet](#Booklet) | ブックレット結合を指定します。 |
| [EdgeStitchBottom](#EdgeStitchBottom) | 下端に沿ったエッジステッチングを指定します。 |
| [EdgeStitchLeft](#EdgeStitchLeft) | 左端に沿ったエッジステッチングを指定します。 |
| [EdgeStitchRight](#EdgeStitchRight) | 右端に沿ったエッジステッチングを指定します。 |
| [EdgeStitchTop](#EdgeStitchTop) | 上端に沿ったエッジステッチングを指定します。 |
| [Fold](#Fold) | 折りたたみ結合を指定します。 |
| [JogOffset](#JogOffset) | ジョグオフセット結合を指定します。 |
| [None](#None) | 結合なしを指定します。 |
| [Trim](#Trim) | トリミング結合を指定します。 |
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
### BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items) {#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-}
```
public BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 名前 | java.lang.String | オプション名。 |
| items | [IBindingOptionItem\[\]](../../com.aspose.xps.metadata/ibindingoptionitem) | 有効な子項目の配列です。 |

### Bale {#Bale}
```
public static final JobBindAllDocuments.BindingOption Bale
```


ベイル結合を指定します。

### BindBottom {#BindBottom}
```
public static final JobBindAllDocuments.BindingOption BindBottom
```


下端に沿った結合を指定します。

### BindLeft {#BindLeft}
```
public static final JobBindAllDocuments.BindingOption BindLeft
```


左端に沿った結合を指定します。

### BindRight {#BindRight}
```
public static final JobBindAllDocuments.BindingOption BindRight
```


右端に沿った結合を指定します。

### BindTop {#BindTop}
```
public static final JobBindAllDocuments.BindingOption BindTop
```


上端に沿った結合を指定します。

### Booklet {#Booklet}
```
public static final JobBindAllDocuments.BindingOption Booklet
```


ブックレット結合を指定します。

### EdgeStitchBottom {#EdgeStitchBottom}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchBottom
```


下端に沿ったエッジステッチングを指定します。

### EdgeStitchLeft {#EdgeStitchLeft}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchLeft
```


左端に沿ったエッジステッチングを指定します。

### EdgeStitchRight {#EdgeStitchRight}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchRight
```


右端に沿ったエッジステッチングを指定します。

### EdgeStitchTop {#EdgeStitchTop}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchTop
```


上端に沿ったエッジステッチングを指定します。

### Fold {#Fold}
```
public static final JobBindAllDocuments.BindingOption Fold
```


折りたたみ結合を指定します。

### JogOffset {#JogOffset}
```
public static final JobBindAllDocuments.BindingOption JogOffset
```


ジョグオフセット結合を指定します。

### None {#None}
```
public static final JobBindAllDocuments.BindingOption None
```


結合なしを指定します。

### Trim {#Trim}
```
public static final JobBindAllDocuments.BindingOption Trim
```


トリミング結合を指定します。

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

