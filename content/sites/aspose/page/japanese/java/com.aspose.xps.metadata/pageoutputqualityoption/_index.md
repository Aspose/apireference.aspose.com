---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "PageOutputQuality 機能オプションを定義します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

PageOutputQuality の機能オプションを定義します。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [Automatic](#Automatic) | 自動出力の意図を指定します（クライアントが自動的に最適な設定を選択できるようにします）。 |
| [Draft](#Draft) | ドラフト出力の意図を指定します（ドラフト品質のテキストとグラフィックにバランスが取れています）。 |
| [Fax](#Fax) | FAX 出力の意図を指定します（標準的なFAX品質にバランスが取れています）。 |
| [High](#High) | 高品質出力の意図を指定します（高品質のテキストとグラフィックにバランスが取れています）。 |
| [Normal](#Normal) | 通常出力の意図を指定します（テキストとグラフィックの品質が良好になるようバランスが取れています）。 |
| [Photographic](#Photographic) | 写真出力の意図を指定します（画像は最高品質であるべきです）。 |
| [Text](#Text) | テキストのみの出力の意図を指定します（グラフィックは低品質で出力されるか、まったく出力されない可能性があります）。 |
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
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


自動出力の意図を指定します（クライアントが自動的に最適な設定を選択できるようにします）。

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


ドラフト出力の意図を指定します（ドラフト品質のテキストとグラフィックにバランスが取れています）。

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


FAX 出力の意図を指定します（標準的なFAX品質にバランスが取れています）。

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


高品質出力の意図を指定します（高品質のテキストとグラフィックにバランスが取れています）。

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


通常出力の意図を指定します（テキストとグラフィックの品質が良好になるようバランスが取れています）。

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


写真出力の意図を指定します（画像は最高品質であるべきです）。

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


テキストのみの出力の意図を指定します（グラフィックは低品質で出力されるか、まったく出力されない可能性があります）。

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

