---
title: Class JobNUpAllDocumentsContiguously
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.JobNUpAllDocumentsContiguously クラス. 1 つの物理シートへの複数の論理ページの出力について説明します job 内のすべてのドキュメントは連続して一緒にコンパイルされますJobNUpAllDocumentsContiguouslyとDocumentNUp は相互に排他的ですこれらのキーワード間の制約の処理を決定するのはドライバー次第です
type: docs
weight: 1380
url: /ja/net/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class

1 つの物理シートへの複数の論理ページの出力について説明します。 job 内のすべてのドキュメントは、連続して一緒にコンパイルされます。`JobNUpAllDocumentsContiguously`と[`DocumentNUp`](../documentnup/) は相互に排他的です。これらのキーワード間の制約の処理を決定するのは、ドライバー次第です。

```csharp
public sealed class JobNUpAllDocumentsContiguously : NUp, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [JobNUpAllDocumentsContiguously](jobnupalldocumentscontiguously/)(params INUpItem[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/addpagespersheetoption/)(int) | の追加とオプションscored プロパティ値. 物理シートあたりの論理ページ数を指定します. |

### 関連項目

* class [NUp](../nup/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


