---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "PageMediaType 機能のオプションを説明します。"
type: docs
weight: 13
url: /ja/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

PageMediaType 機能のオプションを説明します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | 新しいインスタンスを作成します。 |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | このオプション インスタンスをクローンします。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| [Archival](#Archival) | アーカイブ品質のメディアを指定します。 |
| [AutoSelect](#AutoSelect) | メディアが自動的に選択されることを指定します。 |
| [BackPrintFilm](#BackPrintFilm) | 特殊な裏面印刷フィルムメディアを指定します。 |
| [Bond](#Bond) | 標準的なボンドメディアを指定します。 |
| [CardStock](#CardStock) | 標準的なカードストックメディアを指定します。 |
| [Continous](#Continous) | 連続供給メディアを指定します。 |
| [EnvelopePlain](#EnvelopePlain) | 標準的な封筒メディアを指定します。 |
| [EnvelopeWindow](#EnvelopeWindow) | 窓付き封筒メディアを指定します。 |
| [Fabric](#Fabric) | 布製メディアを指定します。 |
| [HighResolution](#HighResolution) | 特殊な高解像度メディアを指定します。 |
| [Label](#Label) | ラベルメディアを指定します。 |
| [MultiLayerForm](#MultiLayerForm) | 付属の多部構成フォームメディアを指定します。 |
| [MultiPartForm](#MultiPartForm) | 別々の多部構成フォームメディアを指定します。 |
| [None](#None) | 不明またはリストにないメディアを指定します。 |
| [Photographic](#Photographic) | 標準的な写真メディアを指定します。 |
| [PhotographicFilm](#PhotographicFilm) | フィルム写真メディアを指定します。 |
| [PhotographicGlossy](#PhotographicGlossy) | 光沢写真メディアを指定します。 |
| [PhotographicHighGloss](#PhotographicHighGloss) | 高光沢写真メディアを指定します。 |
| [PhotographicMatte](#PhotographicMatte) | マット写真メディアを指定します。 |
| [PhotographicSatin](#PhotographicSatin) | サテン写真メディアを指定します。 |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | セミグロス写真メディアを指定します。 |
| [Plain](#Plain) | 標準的な紙メディアを指定します。 |
| [Screen](#Screen) | 連続形式で出力ディスプレイに出力することを指定します。 |
| [ScreenPaged](#ScreenPaged) | ページ形式で出力ディスプレイに出力することを指定します。 |
| [Stationary](#Stationary) | 特殊な文房具メディアを指定します。 |
| [TShirtTransfer](#TShirtTransfer) | 特殊なTシャツ転写メディアを指定します。 |
| [TabStockFull](#TabStockFull) | 事前にカットされていないタブストックメディア（シングルタブ）を指定します。 |
| [TabStockPreCut](#TabStockPreCut) | 事前にカットされたタブストックメディア（複数タブ）を指定します。 |
| [Transparency](#Transparency) | 透明メディアを指定します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | このオプションの項目リストの末尾に項目のリストを追加します。 |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | オプションに IPageMediaTypeOptionItem インスタンスの配列を追加します。 |
| [clone()](#clone--) | このオプション インスタンスをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 要素名を取得します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Weight スコアプロパティの値を設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| optionName | java.lang.String | オプション名です。 |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | 任意の IPageMediaTypeOptionItem インスタンスの配列です。 |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


このオプション インスタンスをクローンします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | クローン対象のインスタンス。 |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


アーカイブ品質のメディアを指定します。

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


メディアが自動的に選択されることを指定します。

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


特殊な裏面印刷フィルムメディアを指定します。

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


標準的なボンドメディアを指定します。

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


標準的なカードストックメディアを指定します。

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


連続供給メディアを指定します。

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


標準的な封筒メディアを指定します。

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


窓付き封筒メディアを指定します。

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


布製メディアを指定します。

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


特殊な高解像度メディアを指定します。

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


ラベルメディアを指定します。

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


付属の多部構成フォームメディアを指定します。

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


別々の多部構成フォームメディアを指定します。

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


不明またはリストにないメディアを指定します。

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


標準的な写真メディアを指定します。

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


フィルム写真メディアを指定します。

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


光沢写真メディアを指定します。

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


高光沢写真メディアを指定します。

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


マット写真メディアを指定します。

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


サテン写真メディアを指定します。

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


セミグロス写真メディアを指定します。

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


標準的な紙メディアを指定します。

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


連続形式で出力ディスプレイに出力することを指定します。

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


ページ形式で出力ディスプレイに出力することを指定します。

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


特殊な文房具メディアを指定します。

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


特殊なTシャツ転写メディアを指定します。

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


事前にカットされていないタブストックメディア（シングルタブ）を指定します。

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


事前にカットされたタブストックメディア（複数タブ）を指定します。

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


透明メディアを指定します。

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


このオプションの項目リストの末尾に項目のリストを追加します。各項目は ScoredProperty または Property のインスタンスでなければなりません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 追加する項目のリスト。 |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


オプションに IPageMediaTypeOptionItem インスタンスの配列を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | 任意の IPageMediaTypeOptionItem インスタンスの配列です。 |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


このオプションインスタンスをクローンします。クローン作成コンストラクタへのショートカットです。

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


Weight スコアプロパティの値を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 重み | int | Weight スコアプロパティの値です。 |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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

