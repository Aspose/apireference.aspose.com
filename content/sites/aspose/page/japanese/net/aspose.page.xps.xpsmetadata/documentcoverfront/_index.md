---
title: Class DocumentCoverFront
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentCoverFront クラス. 表紙冒頭の表紙を記述します各ドキュメントには個別のシートがあります カバー シートはPageMediaSizeとPageMediaTypeドキュメントの最初のページに使用される カバー シートは処理 options に統合する必要があります DocumentDuplex DocumentNUp  指定されたオプションで示される. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcoverfront
type: docs
weight: 660
url: /ja/net/aspose.page.xps.xpsmetadata/documentcoverfront/
---
## DocumentCoverFront class

表紙（冒頭）の表紙を記述します。各ドキュメントには個別のシートがあります。 カバー シートは、[`PageMediaSize`](../pagemediasize/)と[`PageMediaType`](../pagemediatype/)ドキュメントの最初のページに使用される 。カバー シートは処理 options に統合する必要があります ([`DocumentDuplex`](../documentduplex/) 、[`DocumentNUp`](../documentnup/) ) 指定されたオプションで示される. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront

```csharp
public sealed class DocumentCoverFront : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentCoverFront](documentcoverfront/)(params CoverFrontOption[]) | 新しいインスタンスを作成します。 |

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
| class [CoverFrontOption](documentcoverfront.coverfrontoption/) | は、`DocumentCoverFront`機能オプション. |

### 関連項目

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


