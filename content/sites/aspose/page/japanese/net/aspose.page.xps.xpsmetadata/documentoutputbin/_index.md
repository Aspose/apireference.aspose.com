---
title: Class DocumentOutputBin
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin クラス. デバイスでサポートされているビンの完全なリストについて説明しますドキュメントごとに output bin を指定できますのJobOutputBin DocumentOutputBinand PageOutputBinキーワードは相互に排他的です PrintTicket または Print Capabilities ドキュメントで指定する必要があるのは 1 つのみです
type: docs
weight: 760
url: /ja/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

デバイスでサポートされているビンの完全なリストについて説明します。ドキュメントごとに output bin を指定できます。の[`JobOutputBin`](../joboutputbin/) 、`DocumentOutputBin`and [`PageOutputBin`](../pageoutputbin/)キーワードは相互に排他的です PrintTicket または Print Capabilities ドキュメントで指定する必要があるのは 1 つのみです。

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | 新しいインスタンスを作成します。 |

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
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


