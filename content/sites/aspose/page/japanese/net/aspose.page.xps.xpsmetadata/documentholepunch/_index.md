---
title: Class DocumentHolePunch
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentHolePunch クラス. 出力の穴あけ特性を記述します各ドキュメントは個別にパンチされます JobHolePunchとDocumentHolePunchキーワードは相互に排他的です PrintTicket または Print Capabilities ドキュメントで両方を同時に指定しないでください https//docs.microsoft.com/enus/windows/win32/printdocs/documentholepunch
type: docs
weight: 700
url: /ja/net/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class

出力の穴あけ特性を記述します。各ドキュメントは個別にパンチされます。 [`JobHolePunch`](../jobholepunch/)と`DocumentHolePunch`キーワードは相互に排他的です。 PrintTicket または Print Capabilities ドキュメントで両方を同時に指定しないでください。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch

```csharp
public sealed class DocumentHolePunch : HolePunch, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentHolePunch](documentholepunch/)(params HolePunchOption[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

### 関連項目

* class [HolePunch](../holepunch/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


