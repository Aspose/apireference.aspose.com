---
title: Class PageOutputBin
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin クラス. デバイスでサポートされているビンの完全なリストについて説明しますページ単位で出力ビンを指定できます JobOutputBin DocumentOutputBinとPageOutputBinキーワードは相互に排他的です PrintTicket または Print Capabilities ドキュメントで指定する必要があるのは 1 つだけです.
type: docs
weight: 2320
url: /ja/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

デバイスでサポートされているビンの完全なリストについて説明します。ページ単位で出力ビンを指定できます。 [`JobOutputBin`](../joboutputbin/) 、[`DocumentOutputBin`](../documentoutputbin/)と`PageOutputBin`キーワードは相互に排他的です PrintTicket または Print Capabilities ドキュメントで指定する必要があるのは 1 つだけです.

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

### 関連項目

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


