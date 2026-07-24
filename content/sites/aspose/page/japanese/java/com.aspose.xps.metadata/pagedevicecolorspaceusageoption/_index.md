---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "PageDeviceColorSpaceUsage 機能のオプションを説明します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

PageDeviceColorSpaceUsage 機能オプションを説明します。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | デバイスが、  PageDeviceColorSpaceProfileURI  パラメータで指定されたプロファイルをデバイス カラースペース プロファイルとして使用できると判断した場合、同じプロファイルを使用しているすべての要素は、すでにデバイス カラースペースで指定されているものとして扱われます。 |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | PageDeviceColorSpaceProfileURI パラメータで指定されたプロファイルのチャンネル数がデバイスのプライマリ数と一致する場合、すべての要素に対してデバイスの内部カラー管理の代わりに SHOULD 使用されます。 |
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
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


デバイスが PageDeviceColorSpaceProfileURI パラメータで指定されたプロファイルをデバイス カラースペース プロファイルとして使用できると判断した場合、同じプロファイルを使用するすべての要素は既にデバイス カラースペースで指定されているものとして扱われます。その他のすべての要素は、その要素に指定されたプロファイルを必ず使用しなければなりません。プロファイルをデバイス カラースペース プロファイルとして使用できない場合、プロファイルを使用する要素は他のカラープロファイルを使用する要素と同様にカラー管理されなければなりません。

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


PageDeviceColorSpaceProfileURI パラメータで指定されたプロファイルのチャンネル数がデバイスのプライマリ数と一致する場合、すべての要素に対してデバイスの内部カラー管理の代わりに使用すべきです。このプロファイルを使用する要素はデバイス カラースペースにあるとみなされ、これ以上カラー管理されません。

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

