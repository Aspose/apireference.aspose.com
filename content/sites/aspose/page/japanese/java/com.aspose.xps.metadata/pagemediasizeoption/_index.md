---
title: "PageMediaSize.PageMediaSizeOption"
second_title: "Aspose.Page for Java API リファレンス"
description: "PageMediaSize 機能のオプションを説明します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.metadata/pagemediasize.pagemediasizeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaSize.IPageMediaSizeItem](../../com.aspose.xps.metadata/ipagemediasizeitem)
```
public static final class PageMediaSize.PageMediaSizeOption extends Option implements PageMediaSize.IPageMediaSizeItem
```

PageMediaSize 機能のオプションを説明します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PageMediaSizeOption(String name, PageMediaSize.IPageMediaSizeOptionItem[] items)](#PageMediaSizeOption-java.lang.String-com.aspose.xps.metadata.PageMediaSize.IPageMediaSizeOptionItem...-) | 新しいインスタンスを作成します。 |
| [PageMediaSizeOption(PageMediaSize.PageMediaSizeOption option)](#PageMediaSizeOption-com.aspose.xps.metadata.PageMediaSize.PageMediaSizeOption-) | このオプション インスタンスをクローンします。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| [BusinessCard](#BusinessCard) | 名刺 |
| [CreditCard](#CreditCard) | クレジットカード |
| [CustomMediaSize](#CustomMediaSize) | カスタムメディアサイズを指定します。 |
| [ISOA0](#ISOA0) | ISOA0 |
| [ISOA1](#ISOA1) | ISOA1 |
| [ISOA10](#ISOA10) | ISOA10 |
| [ISOA2](#ISOA2) | ISOA2 |
| [ISOA3](#ISOA3) | ISOA3 |
| [ISOA3Extra](#ISOA3Extra) | ISOA3 エクストラ |
| [ISOA3Rotated](#ISOA3Rotated) | ISOA3 回転 |
| [ISOA4](#ISOA4) | ISOA4 |
| [ISOA4Extra](#ISOA4Extra) | ISOA4 エクストラ |
| [ISOA4Rotated](#ISOA4Rotated) | ISOA4 回転 |
| [ISOA5](#ISOA5) | ISOA5 |
| [ISOA5Extra](#ISOA5Extra) | ISOA5 エクストラ |
| [ISOA5Rotated](#ISOA5Rotated) | ISOA5 回転 |
| [ISOA6](#ISOA6) | ISOA6 |
| [ISOA6Rotated](#ISOA6Rotated) | ISOA6 回転 |
| [ISOA7](#ISOA7) | ISOA7 |
| [ISOA8](#ISOA8) | ISOA8 |
| [ISOA9](#ISOA9) | ISOA9 |
| [ISOB0](#ISOB0) | ISOB0 |
| [ISOB1](#ISOB1) | ISOB1 |
| [ISOB10](#ISOB10) | ISOB10 |
| [ISOB2](#ISOB2) | ISOB2 |
| [ISOB3](#ISOB3) | ISOB3 |
| [ISOB4](#ISOB4) | ISOB4 |
| [ISOB4Envelope](#ISOB4Envelope) | ISOB4 封筒 |
| [ISOB5Envelope](#ISOB5Envelope) | ISOB5 封筒 |
| [ISOB5Extra](#ISOB5Extra) | ISOB5 追加 |
| [ISOB7](#ISOB7) | ISOB7 |
| [ISOB8](#ISOB8) | ISOB8 |
| [ISOB9](#ISOB9) | ISOB9 |
| [ISOC0](#ISOC0) | ISOC0 |
| [ISOC1](#ISOC1) | ISOC1 |
| [ISOC10](#ISOC10) | ISOC10 |
| [ISOC2](#ISOC2) | ISOC2 |
| [ISOC3](#ISOC3) | ISOC3 |
| [ISOC3Envelope](#ISOC3Envelope) | ISOC3 封筒 |
| [ISOC4](#ISOC4) | ISOC4 |
| [ISOC4Envelope](#ISOC4Envelope) | ISOC4 封筒 |
| [ISOC5](#ISOC5) | ISOC5 |
| [ISOC5Envelope](#ISOC5Envelope) | ISOC5 封筒 |
| [ISOC6](#ISOC6) | ISOC6 |
| [ISOC6C5Envelope](#ISOC6C5Envelope) | ISOC6C5 封筒 |
| [ISOC6Envelope](#ISOC6Envelope) | ISOC6 封筒 |
| [ISOC7](#ISOC7) | ISOC7 |
| [ISOC8](#ISOC8) | ISOC8 |
| [ISOC9](#ISOC9) | ISOC9 |
| [ISODLEnvelope](#ISODLEnvelope) | ISODL 封筒 |
| [ISODLEnvelopeRotated](#ISODLEnvelopeRotated) | ISODL 回転封筒 |
| [ISOSRA3](#ISOSRA3) | ISOSRA3 |
| [JISB0](#JISB0) | JISB0 |
| [JISB1](#JISB1) | JISB1 |
| [JISB10](#JISB10) | JISB10 |
| [JISB2](#JISB2) | JISB2 |
| [JISB3](#JISB3) | JISB3 |
| [JISB4](#JISB4) | JISB4 |
| [JISB4Rotated](#JISB4Rotated) | JISB4 回転 |
| [JISB5](#JISB5) | JISB5 |
| [JISB5Rotated](#JISB5Rotated) | JISB5 回転 |
| [JISB6](#JISB6) | JISB6 |
| [JISB6Rotated](#JISB6Rotated) | JISB6 回転 |
| [JISB7](#JISB7) | JISB7 |
| [JISB8](#JISB8) | JISB8 |
| [JISB9](#JISB9) | JISB9 |
| [Japan2LPhoto](#Japan2LPhoto) | Japan 2L 写真 |
| [JapanChou3Envelope](#JapanChou3Envelope) | Japan Chou3 封筒 |
| [JapanChou3EnvelopeRotated](#JapanChou3EnvelopeRotated) | Japan Chou3 回転封筒 |
| [JapanChou4Envelope](#JapanChou4Envelope) | Japan Chou4 封筒 |
| [JapanChou4EnvelopeRotated](#JapanChou4EnvelopeRotated) | Japan Chou4 回転封筒 |
| [JapanDoubleHagakiPostcard](#JapanDoubleHagakiPostcard) | 日本 ダブル葉書ポストカード |
| [JapanDoubleHagakiPostcardRotated](#JapanDoubleHagakiPostcardRotated) | 日本 ダブル葉書ポストカード 回転 |
| [JapanHagakiPostcard](#JapanHagakiPostcard) | 日本 葉書ポストカード |
| [JapanHagakiPostcardRotated](#JapanHagakiPostcardRotated) | 日本 葉書ポストカード 回転 |
| [JapanKaku2Envelope](#JapanKaku2Envelope) | 日本 カク2封筒 |
| [JapanKaku2EnvelopeRotated](#JapanKaku2EnvelopeRotated) | 日本 カク2封筒 回転 |
| [JapanKaku3Envelope](#JapanKaku3Envelope) | 日本 カク3封筒 |
| [JapanKaku3EnvelopeRotated](#JapanKaku3EnvelopeRotated) | 日本 カク3封筒 回転 |
| [JapanLPhoto](#JapanLPhoto) | 日本 L 写真 |
| [JapanQuadrupleHagakiPostcard](#JapanQuadrupleHagakiPostcard) | 日本 クアドラプル葉書ポストカード |
| [JapanYou1Envelope](#JapanYou1Envelope) | 日本 ユー1封筒 |
| [JapanYou2Envelope](#JapanYou2Envelope) | 日本 ユー2封筒 |
| [JapanYou3Envelope](#JapanYou3Envelope) | 日本 ユー3封筒 |
| [JapanYou4Envelope](#JapanYou4Envelope) | 日本 ユー4封筒 |
| [JapanYou4EnvelopeRotated](#JapanYou4EnvelopeRotated) | 日本 ユー4封筒 回転 |
| [JapanYou6Envelope](#JapanYou6Envelope) | 日本 ユー6封筒 |
| [JapanYou6EnvelopeRotated](#JapanYou6EnvelopeRotated) | 日本 ユー6封筒 回転 |
| [NorthAmerica10x11](#NorthAmerica10x11) | 北米 10x11 |
| [NorthAmerica10x12](#NorthAmerica10x12) | 北米 10x12 |
| [NorthAmerica10x14](#NorthAmerica10x14) | 北米 10x14 |
| [NorthAmerica11x17](#NorthAmerica11x17) | 北米 11x17 |
| [NorthAmerica14x17](#NorthAmerica14x17) | 北米 14x17 |
| [NorthAmerica4x6](#NorthAmerica4x6) | 北米 4x6 |
| [NorthAmerica4x8](#NorthAmerica4x8) | 北米 4x8 |
| [NorthAmerica5x7](#NorthAmerica5x7) | 北米 5x7 |
| [NorthAmerica8x10](#NorthAmerica8x10) | 北米 8x10 |
| [NorthAmerica9x11](#NorthAmerica9x11) | 北米 9x11 |
| [NorthAmericaArchitectureASheet](#NorthAmericaArchitectureASheet) | 北米 アーキテクチャ A シート |
| [NorthAmericaArchitectureBSheet](#NorthAmericaArchitectureBSheet) | 北米 アーキテクチャ B シート |
| [NorthAmericaArchitectureCSheet](#NorthAmericaArchitectureCSheet) | 北米 アーキテクチャ C シート |
| [NorthAmericaArchitectureDSheet](#NorthAmericaArchitectureDSheet) | 北米 アーキテクチャ D シート |
| [NorthAmericaArchitectureESheet](#NorthAmericaArchitectureESheet) | 北米 アーキテクチャ E シート |
| [NorthAmericaCSheet](#NorthAmericaCSheet) | 北米 C シート |
| [NorthAmericaDSheet](#NorthAmericaDSheet) | 北米 D シート |
| [NorthAmericaESheet](#NorthAmericaESheet) | 北米 E シート |
| [NorthAmericaExecutive](#NorthAmericaExecutive) | 北米 エグゼクティブ |
| [NorthAmericaGermanLegalFanfold](#NorthAmericaGermanLegalFanfold) | 北米 ドイツ 法的 ファンフォールド |
| [NorthAmericaGermanStandardFanfold](#NorthAmericaGermanStandardFanfold) | 北米 ドイツ 標準 ファンフォールド |
| [NorthAmericaLegal](#NorthAmericaLegal) | 北米 リーガル |
| [NorthAmericaLegalExtra](#NorthAmericaLegalExtra) | 北米 リーガル エクストラ |
| [NorthAmericaLetter](#NorthAmericaLetter) | 北米 レター |
| [NorthAmericaLetterExtra](#NorthAmericaLetterExtra) | 北米 レター エクストラ |
| [NorthAmericaLetterPlus](#NorthAmericaLetterPlus) | 北米 レター プラス |
| [NorthAmericaLetterRotated](#NorthAmericaLetterRotated) | 北米 レター 回転 |
| [NorthAmericaMonarchEnvelope](#NorthAmericaMonarchEnvelope) | 北米 モナーク封筒 |
| [NorthAmericaNote](#NorthAmericaNote) | 北米 ノート |
| [NorthAmericaNumber10Envelope](#NorthAmericaNumber10Envelope) | 北米 ナンバー10封筒 |
| [NorthAmericaNumber10EnvelopeRotated](#NorthAmericaNumber10EnvelopeRotated) | 北米 ナンバー10封筒 回転 |
| [NorthAmericaNumber11Envelope](#NorthAmericaNumber11Envelope) | 北米 ナンバー11封筒 |
| [NorthAmericaNumber12Envelope](#NorthAmericaNumber12Envelope) | 北米 ナンバー12封筒 |
| [NorthAmericaNumber14Envelope](#NorthAmericaNumber14Envelope) | 北米 ナンバー14封筒 |
| [NorthAmericaNumber9Envelope](#NorthAmericaNumber9Envelope) | 北米 ナンバー9封筒 |
| [NorthAmericaPersonalEnvelope](#NorthAmericaPersonalEnvelope) | 北米 パーソナル封筒 |
| [NorthAmericaQuarto](#NorthAmericaQuarto) | 北米 クォート |
| [NorthAmericaStatement](#NorthAmericaStatement) | 北米 ステートメント |
| [NorthAmericaSuperA](#NorthAmericaSuperA) | 北米 スーパA |
| [NorthAmericaSuperB](#NorthAmericaSuperB) | 北米 スーパB |
| [NorthAmericaTabloid](#NorthAmericaTabloid) | 北米 タブロイド |
| [NorthAmericaTabloidExtra](#NorthAmericaTabloidExtra) | 北米 タブロイドエクストラ |
| [OtherMetricA3Plus](#OtherMetricA3Plus) | その他 メートル法 A3 プラス |
| [OtherMetricA4Plus](#OtherMetricA4Plus) | その他 メートル法 A4 プラス |
| [OtherMetricFolio](#OtherMetricFolio) | その他 メートル法 フォリオ |
| [OtherMetricInviteEnvelope](#OtherMetricInviteEnvelope) | その他 メートル法 招待封筒 |
| [OtherMetricItalianEnvelope](#OtherMetricItalianEnvelope) | その他 メートル法 イタリア封筒 |
| [PRC10Envelope](#PRC10Envelope) | PRC10封筒 |
| [PRC10EnvelopeRotated](#PRC10EnvelopeRotated) | PRC10封筒（回転） |
| [PRC16K](#PRC16K) | PRC16K |
| [PRC16KRotated](#PRC16KRotated) | PRC16K（回転） |
| [PRC1Envelope](#PRC1Envelope) | PRC1封筒 |
| [PRC1EnvelopeRotated](#PRC1EnvelopeRotated) | PRC1封筒（回転） |
| [PRC2Envelope](#PRC2Envelope) | PRC2封筒 |
| [PRC2EnvelopeRotated](#PRC2EnvelopeRotated) | PRC2封筒（回転） |
| [PRC32K](#PRC32K) | PRC32K |
| [PRC32KBig](#PRC32KBig) | PRC32K（大） |
| [PRC32KRotated](#PRC32KRotated) | PRC32K（回転） |
| [PRC3Envelope](#PRC3Envelope) | PRC3 封筒 |
| [PRC3EnvelopeRotated](#PRC3EnvelopeRotated) | PRC3 封筒（回転） |
| [PRC4Envelope](#PRC4Envelope) | PRC4 封筒 |
| [PRC4EnvelopeRotated](#PRC4EnvelopeRotated) | PRC4 封筒（回転） |
| [PRC5Envelope](#PRC5Envelope) | PRC 封筒 |
| [PRC5EnvelopeRotated](#PRC5EnvelopeRotated) | PRC5 封筒（回転） |
| [PRC6Envelope](#PRC6Envelope) | PRC6 封筒 |
| [PRC6EnvelopeRotated](#PRC6EnvelopeRotated) | PRC6 封筒（回転） |
| [PRC7Envelope](#PRC7Envelope) | PRC7 封筒 |
| [PRC7EnvelopeRotated](#PRC7EnvelopeRotated) | PRC7 封筒（回転） |
| [PRC8Envelope](#PRC8Envelope) | PRC8 封筒 |
| [PRC8EnvelopeRotated](#PRC8EnvelopeRotated) | PRC8 封筒（回転） |
| [PRC9Envelope](#PRC9Envelope) | PRC9 封筒 |
| [PRC9EnvelopeRotated](#PRC9EnvelopeRotated) | PRC9 封筒（回転） |
| [PSCustomMediaSize](#PSCustomMediaSize) | カスタムメディアサイズを指定します（PostScript 固有）。 |
| [Roll06Inch](#Roll06Inch) | ロール 06 インチ |
| [Roll08Inch](#Roll08Inch) | ロール 08 インチ |
| [Roll12Inch](#Roll12Inch) | ロール 12 インチ |
| [Roll15Inch](#Roll15Inch) | ロール 15 インチ |
| [Roll18Inch](#Roll18Inch) | ロール 18 インチ |
| [Roll22Inch](#Roll22Inch) | ロール 22 インチ |
| [Roll24Inch](#Roll24Inch) | ロール 24 インチ |
| [Roll30Inch](#Roll30Inch) | ロール 30 インチ |
| [Roll36Inch](#Roll36Inch) | ロール 36 インチ |
| [Roll54Inch](#Roll54Inch) | ロール 54 インチ |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | このオプションの項目リストの末尾に項目のリストを追加します。 |
| [add(PageMediaSize.IPageMediaSizeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaSize.IPageMediaSizeOptionItem...-) | オプションに項目を追加します。 |
| [clone()](#clone--) | このオプション インスタンスをクローンします。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | 要素名を取得します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMediaSizeHeight(int mediaSizeHeight)](#setMediaSizeHeight-int-) | MediaSizeWidth のスコア付きプロパティ値を追加します。 |
| [setMediaSizeWidth(int mediaSizeWidth)](#setMediaSizeWidth-int-) | MediaSizeWidth のスコア付きプロパティ値を追加します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaSizeOption(String name, PageMediaSize.IPageMediaSizeOptionItem[] items) {#PageMediaSizeOption-java.lang.String-com.aspose.xps.metadata.PageMediaSize.IPageMediaSizeOptionItem...-}
```
public PageMediaSizeOption(String name, PageMediaSize.IPageMediaSizeOptionItem[] items)
```


新しいインスタンスを作成します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 名前 | java.lang.String | オプション名です。 |
| items | [IPageMediaSizeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediasizeoptionitem) | オプション項目です。 |

### PageMediaSizeOption(PageMediaSize.PageMediaSizeOption option) {#PageMediaSizeOption-com.aspose.xps.metadata.PageMediaSize.PageMediaSizeOption-}
```
public PageMediaSizeOption(PageMediaSize.PageMediaSizeOption option)
```


このオプション インスタンスをクローンします。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| option | [PageMediaSizeOption](../../com.aspose.xps.metadata/pagemediasizeoption) | クローン対象のインスタンス。 |

### BusinessCard {#BusinessCard}
```
public static PageMediaSize.PageMediaSizeOption BusinessCard
```


名刺

### CreditCard {#CreditCard}
```
public static PageMediaSize.PageMediaSizeOption CreditCard
```


クレジットカード

### CustomMediaSize {#CustomMediaSize}
```
public static PageMediaSize.PageMediaSizeOption CustomMediaSize
```


カスタムメディアサイズを指定します。DeviceMediaSize に対して検証する必要があります。

### ISOA0 {#ISOA0}
```
public static PageMediaSize.PageMediaSizeOption ISOA0
```


ISOA0

### ISOA1 {#ISOA1}
```
public static PageMediaSize.PageMediaSizeOption ISOA1
```


ISOA1

### ISOA10 {#ISOA10}
```
public static PageMediaSize.PageMediaSizeOption ISOA10
```


ISOA10

### ISOA2 {#ISOA2}
```
public static PageMediaSize.PageMediaSizeOption ISOA2
```


ISOA2

### ISOA3 {#ISOA3}
```
public static PageMediaSize.PageMediaSizeOption ISOA3
```


ISOA3

### ISOA3Extra {#ISOA3Extra}
```
public static PageMediaSize.PageMediaSizeOption ISOA3Extra
```


ISOA3 エクストラ

### ISOA3Rotated {#ISOA3Rotated}
```
public static PageMediaSize.PageMediaSizeOption ISOA3Rotated
```


ISOA3 回転

### ISOA4 {#ISOA4}
```
public static PageMediaSize.PageMediaSizeOption ISOA4
```


ISOA4

### ISOA4Extra {#ISOA4Extra}
```
public static PageMediaSize.PageMediaSizeOption ISOA4Extra
```


ISOA4 エクストラ

### ISOA4Rotated {#ISOA4Rotated}
```
public static PageMediaSize.PageMediaSizeOption ISOA4Rotated
```


ISOA4 回転

### ISOA5 {#ISOA5}
```
public static PageMediaSize.PageMediaSizeOption ISOA5
```


ISOA5

### ISOA5Extra {#ISOA5Extra}
```
public static PageMediaSize.PageMediaSizeOption ISOA5Extra
```


ISOA5 エクストラ

### ISOA5Rotated {#ISOA5Rotated}
```
public static PageMediaSize.PageMediaSizeOption ISOA5Rotated
```


ISOA5 回転

### ISOA6 {#ISOA6}
```
public static PageMediaSize.PageMediaSizeOption ISOA6
```


ISOA6

### ISOA6Rotated {#ISOA6Rotated}
```
public static PageMediaSize.PageMediaSizeOption ISOA6Rotated
```


ISOA6 回転

### ISOA7 {#ISOA7}
```
public static PageMediaSize.PageMediaSizeOption ISOA7
```


ISOA7

### ISOA8 {#ISOA8}
```
public static PageMediaSize.PageMediaSizeOption ISOA8
```


ISOA8

### ISOA9 {#ISOA9}
```
public static PageMediaSize.PageMediaSizeOption ISOA9
```


ISOA9

### ISOB0 {#ISOB0}
```
public static PageMediaSize.PageMediaSizeOption ISOB0
```


ISOB0

### ISOB1 {#ISOB1}
```
public static PageMediaSize.PageMediaSizeOption ISOB1
```


ISOB1

### ISOB10 {#ISOB10}
```
public static PageMediaSize.PageMediaSizeOption ISOB10
```


ISOB10

### ISOB2 {#ISOB2}
```
public static PageMediaSize.PageMediaSizeOption ISOB2
```


ISOB2

### ISOB3 {#ISOB3}
```
public static PageMediaSize.PageMediaSizeOption ISOB3
```


ISOB3

### ISOB4 {#ISOB4}
```
public static PageMediaSize.PageMediaSizeOption ISOB4
```


ISOB4

### ISOB4Envelope {#ISOB4Envelope}
```
public static PageMediaSize.PageMediaSizeOption ISOB4Envelope
```


ISOB4 封筒

### ISOB5Envelope {#ISOB5Envelope}
```
public static PageMediaSize.PageMediaSizeOption ISOB5Envelope
```


ISOB5 封筒

### ISOB5Extra {#ISOB5Extra}
```
public static PageMediaSize.PageMediaSizeOption ISOB5Extra
```


ISOB5 追加

### ISOB7 {#ISOB7}
```
public static PageMediaSize.PageMediaSizeOption ISOB7
```


ISOB7

### ISOB8 {#ISOB8}
```
public static PageMediaSize.PageMediaSizeOption ISOB8
```


ISOB8

### ISOB9 {#ISOB9}
```
public static PageMediaSize.PageMediaSizeOption ISOB9
```


ISOB9

### ISOC0 {#ISOC0}
```
public static PageMediaSize.PageMediaSizeOption ISOC0
```


ISOC0

### ISOC1 {#ISOC1}
```
public static PageMediaSize.PageMediaSizeOption ISOC1
```


ISOC1

### ISOC10 {#ISOC10}
```
public static PageMediaSize.PageMediaSizeOption ISOC10
```


ISOC10

### ISOC2 {#ISOC2}
```
public static PageMediaSize.PageMediaSizeOption ISOC2
```


ISOC2

### ISOC3 {#ISOC3}
```
public static PageMediaSize.PageMediaSizeOption ISOC3
```


ISOC3

### ISOC3Envelope {#ISOC3Envelope}
```
public static PageMediaSize.PageMediaSizeOption ISOC3Envelope
```


ISOC3 封筒

### ISOC4 {#ISOC4}
```
public static PageMediaSize.PageMediaSizeOption ISOC4
```


ISOC4

### ISOC4Envelope {#ISOC4Envelope}
```
public static PageMediaSize.PageMediaSizeOption ISOC4Envelope
```


ISOC4 封筒

### ISOC5 {#ISOC5}
```
public static PageMediaSize.PageMediaSizeOption ISOC5
```


ISOC5

### ISOC5Envelope {#ISOC5Envelope}
```
public static PageMediaSize.PageMediaSizeOption ISOC5Envelope
```


ISOC5 封筒

### ISOC6 {#ISOC6}
```
public static PageMediaSize.PageMediaSizeOption ISOC6
```


ISOC6

### ISOC6C5Envelope {#ISOC6C5Envelope}
```
public static PageMediaSize.PageMediaSizeOption ISOC6C5Envelope
```


ISOC6C5 封筒

### ISOC6Envelope {#ISOC6Envelope}
```
public static PageMediaSize.PageMediaSizeOption ISOC6Envelope
```


ISOC6 封筒

### ISOC7 {#ISOC7}
```
public static PageMediaSize.PageMediaSizeOption ISOC7
```


ISOC7

### ISOC8 {#ISOC8}
```
public static PageMediaSize.PageMediaSizeOption ISOC8
```


ISOC8

### ISOC9 {#ISOC9}
```
public static PageMediaSize.PageMediaSizeOption ISOC9
```


ISOC9

### ISODLEnvelope {#ISODLEnvelope}
```
public static PageMediaSize.PageMediaSizeOption ISODLEnvelope
```


ISODL 封筒

### ISODLEnvelopeRotated {#ISODLEnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption ISODLEnvelopeRotated
```


ISODL 回転封筒

### ISOSRA3 {#ISOSRA3}
```
public static PageMediaSize.PageMediaSizeOption ISOSRA3
```


ISOSRA3

### JISB0 {#JISB0}
```
public static PageMediaSize.PageMediaSizeOption JISB0
```


JISB0

### JISB1 {#JISB1}
```
public static PageMediaSize.PageMediaSizeOption JISB1
```


JISB1

### JISB10 {#JISB10}
```
public static PageMediaSize.PageMediaSizeOption JISB10
```


JISB10

### JISB2 {#JISB2}
```
public static PageMediaSize.PageMediaSizeOption JISB2
```


JISB2

### JISB3 {#JISB3}
```
public static PageMediaSize.PageMediaSizeOption JISB3
```


JISB3

### JISB4 {#JISB4}
```
public static PageMediaSize.PageMediaSizeOption JISB4
```


JISB4

### JISB4Rotated {#JISB4Rotated}
```
public static PageMediaSize.PageMediaSizeOption JISB4Rotated
```


JISB4 回転

### JISB5 {#JISB5}
```
public static PageMediaSize.PageMediaSizeOption JISB5
```


JISB5

### JISB5Rotated {#JISB5Rotated}
```
public static PageMediaSize.PageMediaSizeOption JISB5Rotated
```


JISB5 回転

### JISB6 {#JISB6}
```
public static PageMediaSize.PageMediaSizeOption JISB6
```


JISB6

### JISB6Rotated {#JISB6Rotated}
```
public static PageMediaSize.PageMediaSizeOption JISB6Rotated
```


JISB6 回転

### JISB7 {#JISB7}
```
public static PageMediaSize.PageMediaSizeOption JISB7
```


JISB7

### JISB8 {#JISB8}
```
public static PageMediaSize.PageMediaSizeOption JISB8
```


JISB8

### JISB9 {#JISB9}
```
public static PageMediaSize.PageMediaSizeOption JISB9
```


JISB9

### Japan2LPhoto {#Japan2LPhoto}
```
public static PageMediaSize.PageMediaSizeOption Japan2LPhoto
```


Japan 2L 写真

### JapanChou3Envelope {#JapanChou3Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanChou3Envelope
```


Japan Chou3 封筒

### JapanChou3EnvelopeRotated {#JapanChou3EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption JapanChou3EnvelopeRotated
```


Japan Chou3 回転封筒

### JapanChou4Envelope {#JapanChou4Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanChou4Envelope
```


Japan Chou4 封筒

### JapanChou4EnvelopeRotated {#JapanChou4EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption JapanChou4EnvelopeRotated
```


Japan Chou4 回転封筒

### JapanDoubleHagakiPostcard {#JapanDoubleHagakiPostcard}
```
public static PageMediaSize.PageMediaSizeOption JapanDoubleHagakiPostcard
```


日本 ダブル葉書ポストカード

### JapanDoubleHagakiPostcardRotated {#JapanDoubleHagakiPostcardRotated}
```
public static PageMediaSize.PageMediaSizeOption JapanDoubleHagakiPostcardRotated
```


日本 ダブル葉書ポストカード 回転

### JapanHagakiPostcard {#JapanHagakiPostcard}
```
public static PageMediaSize.PageMediaSizeOption JapanHagakiPostcard
```


日本 葉書ポストカード

### JapanHagakiPostcardRotated {#JapanHagakiPostcardRotated}
```
public static PageMediaSize.PageMediaSizeOption JapanHagakiPostcardRotated
```


日本 葉書ポストカード 回転

### JapanKaku2Envelope {#JapanKaku2Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanKaku2Envelope
```


日本 カク2封筒

### JapanKaku2EnvelopeRotated {#JapanKaku2EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption JapanKaku2EnvelopeRotated
```


日本 カク2封筒 回転

### JapanKaku3Envelope {#JapanKaku3Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanKaku3Envelope
```


日本 カク3封筒

### JapanKaku3EnvelopeRotated {#JapanKaku3EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption JapanKaku3EnvelopeRotated
```


日本 カク3封筒 回転

### JapanLPhoto {#JapanLPhoto}
```
public static PageMediaSize.PageMediaSizeOption JapanLPhoto
```


日本 L 写真

### JapanQuadrupleHagakiPostcard {#JapanQuadrupleHagakiPostcard}
```
public static PageMediaSize.PageMediaSizeOption JapanQuadrupleHagakiPostcard
```


日本 クアドラプル葉書ポストカード

### JapanYou1Envelope {#JapanYou1Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanYou1Envelope
```


日本 ユー1封筒

### JapanYou2Envelope {#JapanYou2Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanYou2Envelope
```


日本 ユー2封筒

### JapanYou3Envelope {#JapanYou3Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanYou3Envelope
```


日本 ユー3封筒

### JapanYou4Envelope {#JapanYou4Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanYou4Envelope
```


日本 ユー4封筒

### JapanYou4EnvelopeRotated {#JapanYou4EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption JapanYou4EnvelopeRotated
```


日本 ユー4封筒 回転

### JapanYou6Envelope {#JapanYou6Envelope}
```
public static PageMediaSize.PageMediaSizeOption JapanYou6Envelope
```


日本 ユー6封筒

### JapanYou6EnvelopeRotated {#JapanYou6EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption JapanYou6EnvelopeRotated
```


日本 ユー6封筒 回転

### NorthAmerica10x11 {#NorthAmerica10x11}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica10x11
```


北米 10x11

### NorthAmerica10x12 {#NorthAmerica10x12}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica10x12
```


北米 10x12

### NorthAmerica10x14 {#NorthAmerica10x14}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica10x14
```


北米 10x14

### NorthAmerica11x17 {#NorthAmerica11x17}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica11x17
```


北米 11x17

### NorthAmerica14x17 {#NorthAmerica14x17}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica14x17
```


北米 14x17

### NorthAmerica4x6 {#NorthAmerica4x6}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica4x6
```


北米 4x6

### NorthAmerica4x8 {#NorthAmerica4x8}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica4x8
```


北米 4x8

### NorthAmerica5x7 {#NorthAmerica5x7}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica5x7
```


北米 5x7

### NorthAmerica8x10 {#NorthAmerica8x10}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica8x10
```


北米 8x10

### NorthAmerica9x11 {#NorthAmerica9x11}
```
public static PageMediaSize.PageMediaSizeOption NorthAmerica9x11
```


北米 9x11

### NorthAmericaArchitectureASheet {#NorthAmericaArchitectureASheet}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaArchitectureASheet
```


北米 アーキテクチャ A シート

### NorthAmericaArchitectureBSheet {#NorthAmericaArchitectureBSheet}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaArchitectureBSheet
```


北米 アーキテクチャ B シート

### NorthAmericaArchitectureCSheet {#NorthAmericaArchitectureCSheet}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaArchitectureCSheet
```


北米 アーキテクチャ C シート

### NorthAmericaArchitectureDSheet {#NorthAmericaArchitectureDSheet}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaArchitectureDSheet
```


北米 アーキテクチャ D シート

### NorthAmericaArchitectureESheet {#NorthAmericaArchitectureESheet}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaArchitectureESheet
```


北米 アーキテクチャ E シート

### NorthAmericaCSheet {#NorthAmericaCSheet}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaCSheet
```


北米 C シート

### NorthAmericaDSheet {#NorthAmericaDSheet}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaDSheet
```


北米 D シート

### NorthAmericaESheet {#NorthAmericaESheet}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaESheet
```


北米 E シート

### NorthAmericaExecutive {#NorthAmericaExecutive}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaExecutive
```


北米 エグゼクティブ

### NorthAmericaGermanLegalFanfold {#NorthAmericaGermanLegalFanfold}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaGermanLegalFanfold
```


北米 ドイツ 法的 ファンフォールド

### NorthAmericaGermanStandardFanfold {#NorthAmericaGermanStandardFanfold}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaGermanStandardFanfold
```


北米 ドイツ 標準 ファンフォールド

### NorthAmericaLegal {#NorthAmericaLegal}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaLegal
```


北米 リーガル

### NorthAmericaLegalExtra {#NorthAmericaLegalExtra}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaLegalExtra
```


北米 リーガル エクストラ

### NorthAmericaLetter {#NorthAmericaLetter}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaLetter
```


北米 レター

### NorthAmericaLetterExtra {#NorthAmericaLetterExtra}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaLetterExtra
```


北米 レター エクストラ

### NorthAmericaLetterPlus {#NorthAmericaLetterPlus}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaLetterPlus
```


北米 レター プラス

### NorthAmericaLetterRotated {#NorthAmericaLetterRotated}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaLetterRotated
```


北米 レター 回転

### NorthAmericaMonarchEnvelope {#NorthAmericaMonarchEnvelope}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaMonarchEnvelope
```


北米 モナーク封筒

### NorthAmericaNote {#NorthAmericaNote}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaNote
```


北米 ノート

### NorthAmericaNumber10Envelope {#NorthAmericaNumber10Envelope}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaNumber10Envelope
```


北米 ナンバー10封筒

### NorthAmericaNumber10EnvelopeRotated {#NorthAmericaNumber10EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaNumber10EnvelopeRotated
```


北米 ナンバー10封筒 回転

### NorthAmericaNumber11Envelope {#NorthAmericaNumber11Envelope}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaNumber11Envelope
```


北米 ナンバー11封筒

### NorthAmericaNumber12Envelope {#NorthAmericaNumber12Envelope}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaNumber12Envelope
```


北米 ナンバー12封筒

### NorthAmericaNumber14Envelope {#NorthAmericaNumber14Envelope}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaNumber14Envelope
```


北米 ナンバー14封筒

### NorthAmericaNumber9Envelope {#NorthAmericaNumber9Envelope}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaNumber9Envelope
```


北米 ナンバー9封筒

### NorthAmericaPersonalEnvelope {#NorthAmericaPersonalEnvelope}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaPersonalEnvelope
```


北米 パーソナル封筒

### NorthAmericaQuarto {#NorthAmericaQuarto}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaQuarto
```


北米 クォート

### NorthAmericaStatement {#NorthAmericaStatement}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaStatement
```


北米 ステートメント

### NorthAmericaSuperA {#NorthAmericaSuperA}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaSuperA
```


北米 スーパA

### NorthAmericaSuperB {#NorthAmericaSuperB}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaSuperB
```


北米 スーパB

### NorthAmericaTabloid {#NorthAmericaTabloid}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaTabloid
```


北米 タブロイド

### NorthAmericaTabloidExtra {#NorthAmericaTabloidExtra}
```
public static PageMediaSize.PageMediaSizeOption NorthAmericaTabloidExtra
```


北米 タブロイドエクストラ

### OtherMetricA3Plus {#OtherMetricA3Plus}
```
public static PageMediaSize.PageMediaSizeOption OtherMetricA3Plus
```


その他 メートル法 A3 プラス

### OtherMetricA4Plus {#OtherMetricA4Plus}
```
public static PageMediaSize.PageMediaSizeOption OtherMetricA4Plus
```


その他 メートル法 A4 プラス

### OtherMetricFolio {#OtherMetricFolio}
```
public static PageMediaSize.PageMediaSizeOption OtherMetricFolio
```


その他 メートル法 フォリオ

### OtherMetricInviteEnvelope {#OtherMetricInviteEnvelope}
```
public static PageMediaSize.PageMediaSizeOption OtherMetricInviteEnvelope
```


その他 メートル法 招待封筒

### OtherMetricItalianEnvelope {#OtherMetricItalianEnvelope}
```
public static PageMediaSize.PageMediaSizeOption OtherMetricItalianEnvelope
```


その他 メートル法 イタリア封筒

### PRC10Envelope {#PRC10Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC10Envelope
```


PRC10封筒

### PRC10EnvelopeRotated {#PRC10EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC10EnvelopeRotated
```


PRC10封筒（回転）

### PRC16K {#PRC16K}
```
public static PageMediaSize.PageMediaSizeOption PRC16K
```


PRC16K

### PRC16KRotated {#PRC16KRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC16KRotated
```


PRC16K（回転）

### PRC1Envelope {#PRC1Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC1Envelope
```


PRC1封筒

### PRC1EnvelopeRotated {#PRC1EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC1EnvelopeRotated
```


PRC1封筒（回転）

### PRC2Envelope {#PRC2Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC2Envelope
```


PRC2封筒

### PRC2EnvelopeRotated {#PRC2EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC2EnvelopeRotated
```


PRC2封筒（回転）

### PRC32K {#PRC32K}
```
public static PageMediaSize.PageMediaSizeOption PRC32K
```


PRC32K

### PRC32KBig {#PRC32KBig}
```
public static PageMediaSize.PageMediaSizeOption PRC32KBig
```


PRC32K（大）

### PRC32KRotated {#PRC32KRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC32KRotated
```


PRC32K（回転）

### PRC3Envelope {#PRC3Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC3Envelope
```


PRC3 封筒

### PRC3EnvelopeRotated {#PRC3EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC3EnvelopeRotated
```


PRC3 封筒（回転）

### PRC4Envelope {#PRC4Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC4Envelope
```


PRC4 封筒

### PRC4EnvelopeRotated {#PRC4EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC4EnvelopeRotated
```


PRC4 封筒（回転）

### PRC5Envelope {#PRC5Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC5Envelope
```


PRC 封筒

### PRC5EnvelopeRotated {#PRC5EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC5EnvelopeRotated
```


PRC5 封筒（回転）

### PRC6Envelope {#PRC6Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC6Envelope
```


PRC6 封筒

### PRC6EnvelopeRotated {#PRC6EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC6EnvelopeRotated
```


PRC6 封筒（回転）

### PRC7Envelope {#PRC7Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC7Envelope
```


PRC7 封筒

### PRC7EnvelopeRotated {#PRC7EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC7EnvelopeRotated
```


PRC7 封筒（回転）

### PRC8Envelope {#PRC8Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC8Envelope
```


PRC8 封筒

### PRC8EnvelopeRotated {#PRC8EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC8EnvelopeRotated
```


PRC8 封筒（回転）

### PRC9Envelope {#PRC9Envelope}
```
public static PageMediaSize.PageMediaSizeOption PRC9Envelope
```


PRC9 封筒

### PRC9EnvelopeRotated {#PRC9EnvelopeRotated}
```
public static PageMediaSize.PageMediaSizeOption PRC9EnvelopeRotated
```


PRC9 封筒（回転）

### PSCustomMediaSize {#PSCustomMediaSize}
```
public static PageMediaSize.PageMediaSizeOption PSCustomMediaSize
```


カスタムメディアサイズ（PostScript 固有）を指定します。DeviceMediaSize に対して検証する必要があります。

### Roll06Inch {#Roll06Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll06Inch
```


ロール 06 インチ

### Roll08Inch {#Roll08Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll08Inch
```


ロール 08 インチ

### Roll12Inch {#Roll12Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll12Inch
```


ロール 12 インチ

### Roll15Inch {#Roll15Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll15Inch
```


ロール 15 インチ

### Roll18Inch {#Roll18Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll18Inch
```


ロール 18 インチ

### Roll22Inch {#Roll22Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll22Inch
```


ロール 22 インチ

### Roll24Inch {#Roll24Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll24Inch
```


ロール 24 インチ

### Roll30Inch {#Roll30Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll30Inch
```


ロール 30 インチ

### Roll36Inch {#Roll36Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll36Inch
```


ロール 36 インチ

### Roll54Inch {#Roll54Inch}
```
public static PageMediaSize.PageMediaSizeOption Roll54Inch
```


ロール 54 インチ

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


このオプションの項目リストの末尾に項目のリストを追加します。各項目は ScoredProperty または Property のインスタンスでなければなりません。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | 追加する項目のリスト。 |

### add(PageMediaSize.IPageMediaSizeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaSize.IPageMediaSizeOptionItem...-}
```
public PageMediaSize.PageMediaSizeOption add(PageMediaSize.IPageMediaSizeOptionItem[] items)
```


オプションに項目を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| items | [IPageMediaSizeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediasizeoptionitem) | 追加する項目。 |

**Returns:**
[PageMediaSizeOption](../../com.aspose.xps.metadata/pagemediasizeoption) - This options.
### clone() {#clone--}
```
public PageMediaSize.PageMediaSizeOption clone()
```


このオプションインスタンスをクローンします。クローン作成コンストラクタへのショートカットです。

**Returns:**
[PageMediaSizeOption](../../com.aspose.xps.metadata/pagemediasizeoption) - The clone of this option instance.
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




### setMediaSizeHeight(int mediaSizeHeight) {#setMediaSizeHeight-int-}
```
public PageMediaSize.PageMediaSizeOption setMediaSizeHeight(int mediaSizeHeight)
```


MediaSizeWidth のスコア付きプロパティ値を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| mediaSizeHeight | int | MediaSizeHeight のスコア付きプロパティ値です。 |

**Returns:**
[PageMediaSizeOption](../../com.aspose.xps.metadata/pagemediasizeoption) - This option.
### setMediaSizeWidth(int mediaSizeWidth) {#setMediaSizeWidth-int-}
```
public PageMediaSize.PageMediaSizeOption setMediaSizeWidth(int mediaSizeWidth)
```


MediaSizeWidth のスコア付きプロパティ値を追加します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| mediaSizeWidth | int | MediaSizeWidth のスコア付きプロパティ値です。 |

**Returns:**
[PageMediaSizeOption](../../com.aspose.xps.metadata/pagemediasizeoption) - This option.
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

