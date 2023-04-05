---
title: Class PageScaling
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.PageScaling クラス. 出力のスケーリング特性について説明します https//docs.microsoft.com/enus/windows/win32/printdocs/pagescaling
type: docs
weight: 2480
url: /ja/net/aspose.page.xps.xpsmetadata/pagescaling/
---
## PageScaling class

出力のスケーリング特性について説明します。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescaling

```csharp
public sealed class PageScaling : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PageScaling](pagescaling/)(params IPageScalingItem[]) | 新しいインスタンスを作成します。 |

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
| interface [IPageScalingItem](pagescaling.ipagescalingitem/) | 任意のインターフェイス`PageScaling`機能アイテム. |
| class [PageScalingOption](pagescaling.pagescalingoption/) | は、`PageScaling`機能 options. |
| class [ScaleOffsetAlignment](pagescaling.scaleoffsetalignment/) | インナーを記述feature. |
| class [ScaleOffsetAlignmentOption](pagescaling.scaleoffsetalignmentoption/) | は、[`ScaleOffsetAlignment`](../pagescaling.scaleoffsetalignment/) features options. スケーリングされたコンテンツの配置を指定します. |

### 関連項目

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


