---
title: "JobPrimaryBannerSheet"
second_title: "Aspose.Page for Java API リファレンス"
description: "ジョブの出力バナーシートを説明します。"
type: docs
weight: 64
url: /ja/java/com.aspose.xps.metadata/jobprimarybannersheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobPrimaryBannerSheet extends Feature implements IJobPrintTicketItem
```

ジョブの出力バナーシートについて説明します。バナーシートはデフォルトの  PageMediaSize  で、デフォルトの  PageMediaType  を使用して出力する必要があります。バナーシートはジョブの残りの部分から分離されている必要があります。つまり、JobDuplexAllDocumentsContiguously、JobStapleAllDocuments、または JobBindAllDocuments などの仕上げや処理オプションにはバナーシートを含めてはなりません。バナーシートはジョブの最初のシートとして配置されるべきです。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options)](#JobPrimaryBannerSheet-com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption...-) | 新しいインスタンスを作成します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | この機能の項目リストの末尾に項目のリストを追加します。 |
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
### JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options) {#JobPrimaryBannerSheet-com.aspose.xps.metadata.JobPrimaryBannerSheet.BannerSheetOption...-}
```
public JobPrimaryBannerSheet(JobPrimaryBannerSheet.BannerSheetOption[] options)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| options | [BannerSheetOption\[\]](../../com.aspose.xps.metadata/bannersheetoption) | 機能に固有のオプションの配列です。 |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


この機能のアイテムリストの末尾に項目のリストを追加します。各項目は Feature、Option、または Property のインスタンスである必要があります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | 追加する項目のリスト。 |

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

