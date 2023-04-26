---
title: Class DocumentNUp
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp クラス. 複数の論理ページの出力とフォーマットを 1 つの物理シートに記述します 各ドキュメントは個別にコンパイルされますとJobNUpAllDocumentsContiguously は相互に排他的ですこれらのキーワード間の制約処理を決定するのはドライバー次第です
type: docs
weight: 750
url: /ja/net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

複数の論理ページの出力とフォーマットを 1 つの物理シートに記述します。 各ドキュメントは個別にコンパイルされます。と[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) は相互に排他的です。これらのキーワード間の制約処理を決定するのは、ドライバー次第です。

```csharp
DocumentNUp
```

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | の追加とオプションscored プロパティ値. 物理シートあたりの論理ページ数を指定します. |

### 関連項目

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


