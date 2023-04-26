---
title: Class DocumentCollate
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentCollate クラス. 出力の照合特性を記述します個々のドキュメントのすべてのページが照合されます DocumentCollate と JobCollateAlldocuments は相互に排他的ですこれらのキーワードの の両方または 1 つだけが実装されているかどうかの動作と実装はドライバーに任されています
type: docs
weight: 620
url: /ja/net/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class

出力の照合特性を記述します。個々のドキュメントのすべてのページが照合されます。 DocumentCollate と JobCollateAlldocuments は相互に排他的です。これらのキーワードの の両方または 1 つだけが実装されているかどうかの動作と実装は、ドライバーに任されています。

```csharp
public sealed class DocumentCollate : Collate, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentCollate](documentcollate/)(params CollateOption[]) |  |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

### 関連項目

* class [Collate](../collate/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


