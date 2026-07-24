---
title: "JobPrimaryCoverFront.CoverFrontOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "JobPrimaryCoverFront 機能のオプションを説明します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.metadata/jobprimarycoverfront.coverfrontoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverFront.CoverFrontOption extends Option
```

JobPrimaryCoverFront機能のオプションを説明します。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [BlankCover](#BlankCover) | 空白のカバーシートを印刷することを指定します。 |
| [NoCover](#NoCover) | カバーが出力されないことを指定します。 |
| [PrintBack](#PrintBack) | 「CoverFrontSource」で指定されたカバーをカバーシートの裏面に印刷することを指定します。 |
| [PrintBoth](#PrintBoth) | 「CoverFrontSource」で指定されたカバーをカバーシートの表裏いずれかに印刷できることを指定します。 |
| [PrintFront](#PrintFront) | 「CoverFrontSource」で指定されたカバーをカバーシートの表面に印刷することを指定します。 |
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
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverFront.CoverFrontOption BlankCover
```


空白のカバーシートを印刷することを指定します。

### NoCover {#NoCover}
```
public static final JobPrimaryCoverFront.CoverFrontOption NoCover
```


カバーが出力されないことを指定します。

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverFront.CoverFrontOption PrintBack
```


「CoverFrontSource」で指定されたカバーをカバーシートの裏面に印刷することを指定します。JobPrimaryCoverFrontSource ParameterInit 要素が指定されていない場合、このオプションは無視されるべきです。

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverFront.CoverFrontOption PrintBoth
```


「CoverFrontSource」で指定されたカバーをカバーシートの表裏いずれかに印刷できることを指定します。JobPrimaryCoverFrontSource ParameterInit 要素が指定されていない場合、このオプションは無視されるべきです。

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverFront.CoverFrontOption PrintFront
```


「CoverFrontSource」で指定されたカバーをカバーシートの表面に印刷することを指定します。JobPrimaryCoverFrontSource ParameterInit 要素が指定されていない場合、このオプションは無視されるべきです。

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

