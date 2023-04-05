---
title: Class DocumentDuplex
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentDuplex クラス. 出力のデュプレックス特性を記述します両面印刷機能によりメディアの両面に 印刷できます各ドキュメントは別々に二重化されます. DocumentDuplex と JobDuplexAllDocumentsContiguously は相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https//docs.microsoft.com/enus/windows/win32/printdocs/ documentduplex
type: docs
weight: 690
url: /ja/net/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class

出力のデュプレックス特性を記述します。両面印刷機能により、メディアの両面に 印刷できます。各ドキュメントは別々に二重化されます. DocumentDuplex と JobDuplexAllDocumentsContiguously は相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/ documentduplex

```csharp
public sealed class DocumentDuplex : Duplex, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentDuplex](documentduplex/)(params DuplexOption[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

### 関連項目

* class [Duplex](../duplex/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


