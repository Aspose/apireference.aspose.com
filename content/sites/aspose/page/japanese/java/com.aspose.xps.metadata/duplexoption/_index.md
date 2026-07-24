---
title: "Duplex.DuplexOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "JobDuplexAllDocumentsContiguously と DocumentDuplex 機能のオプションを説明します。"
type: docs
weight: 11
url: /ja/java/com.aspose.xps.metadata/duplex.duplexoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Duplex.DuplexOption extends Option
```

JobDuplexAllDocumentsContiguously と DocumentDuplex 機能のオプションを説明します。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [OneSided](#OneSided) | 片面印刷を指定します。 |
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
| [twoSidedLongEdge(Duplex.DuplexMode duplexMode)](#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | ページが MediaSizeHeight 方向に平行に裏返されるように、両面印刷を指定します。 |
| [twoSidedShortEdge(Duplex.DuplexMode duplexMode)](#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | ページが MediaSizeWidth 方向に平行に裏返されるように、両面印刷を指定します。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### OneSided {#OneSided}
```
public static final Duplex.DuplexOption OneSided
```


片面印刷を指定します。

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
### twoSidedLongEdge(Duplex.DuplexMode duplexMode) {#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static final Duplex.DuplexOption twoSidedLongEdge(Duplex.DuplexMode duplexMode)
```


ページが MediaSizeHeight 方向に平行に裏返されるように、両面印刷を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | DuplexMode |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The  Duplex  option.
### twoSidedShortEdge(Duplex.DuplexMode duplexMode) {#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static final Duplex.DuplexOption twoSidedShortEdge(Duplex.DuplexMode duplexMode)
```


ページが MediaSizeWidth 方向に平行に裏返されるように、両面印刷を指定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | DuplexMode |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The

```
Duplex
```

オプション。
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

