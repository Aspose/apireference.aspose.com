---
title: Class PageWatermark
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.PageWatermark クラス. 出力の透かし設定と透かし特性を記述します透かしは物理ページではなく論理ページに を適用しますたとえばDocumentDuplex有効にすると 透かしがそれぞれに表示されます各シートのページもしもDocumentDuplex 2 の場合各シートには 2 つの透かしがあります https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2640
url: /ja/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

出力の透かし設定と透かし特性を記述します。透かしは、物理ページではなく、論理ページに を適用します。たとえば、[`DocumentDuplex`](../documentduplex/)有効にすると、 透かしがそれぞれに表示されます各シートのページ。もしも[`DocumentDuplex`](../documentduplex/), =2 の場合、各シートには 2 つの透かしがあります。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

## その他のメンバー

| 名前 | 説明 |
| --- | --- |
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | 任意のインターフェイス`PageWatermark`機能アイテム. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | 任意のインターフェイス[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/)item. |
| class [Layering](pagewatermark.layering/) | インナーを記述特徴。透かしのレイヤー動作を定義します。 |
| class [LayeringOption](pagewatermark.layeringoption/) | は、[`Layering`](../pagewatermark.layering/)機能オプション. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | は、`PageWatermark`機能 options. |

### 関連項目

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


