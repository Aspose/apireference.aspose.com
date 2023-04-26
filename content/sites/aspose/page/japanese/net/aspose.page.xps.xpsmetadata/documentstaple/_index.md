---
title: Class DocumentStaple
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentStaple クラス. 出力のステープル特性を記述します各ドキュメントは個別にステープルされます JobStapleAllDocumentsとDocumentStapleキーワードは相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https//docs.microsoft.com/enus/windows/win32/printdocs/documentstaple
type: docs
weight: 830
url: /ja/net/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class

出力のステープル特性を記述します。各ドキュメントは個別にステープルされます。 [`JobStapleAllDocuments`](../jobstaplealldocuments/)と`DocumentStaple`キーワードは相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple

```csharp
public sealed class DocumentStaple : Staple, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentStaple](documentstaple/)(params StapleOption[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

### 関連項目

* class [Staple](../staple/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


