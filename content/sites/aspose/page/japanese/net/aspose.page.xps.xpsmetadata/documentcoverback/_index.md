---
title: Class DocumentCoverBack
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentCoverBack クラス. 裏エンディング表紙を記述します各ドキュメントには個別のシートがあります カバー シートはPageMediaSizeとPageMediaType はドキュメントの最終ページに使用されますカバー シートは処理 options に統合する必要があります DocumentDuplex DocumentNUp  指定されたオプションで示される. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcoverback
type: docs
weight: 640
url: /ja/net/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class

裏（エンディング）表紙を記述します。各ドキュメントには個別のシートがあります。 カバー シートは、[`PageMediaSize`](../pagemediasize/)と[`PageMediaType`](../pagemediatype/) はドキュメントの最終ページに使用されます。カバー シートは処理 options に統合する必要があります ([`DocumentDuplex`](../documentduplex/) 、[`DocumentNUp`](../documentnup/) ) 指定されたオプションで示される. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback

```csharp
public sealed class DocumentCoverBack : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentCoverBack](documentcoverback/)(params CoverBackOption[]) | 新しいインスタンスを作成します。 |

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
| class [CoverBackOption](documentcoverback.coverbackoption/) | は、`DocumentCoverBack`機能オプション. |

### 関連項目

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


