---
title: Class JobPrimaryCoverBack
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryCoverBack クラス. 裏エンディング表紙を記述します各ジョブには個別のプライマリ シートがあります カバー シートはPageMediaSizeとPageMediaType はジョブの最終ページに使用されますカバー シートは処理 options に統合する必要があります JobDuplexAllDocumentsContiguously JobNUpAllDocumentsContiguously  指定されたオプションで示される. https//docs.microsoft.com/enus/windows/win32/printdocs/jobprimarycoverback
type: docs
weight: 1510
url: /ja/net/aspose.page.xps.xpsmetadata/jobprimarycoverback/
---
## JobPrimaryCoverBack class

裏（エンディング）表紙を記述します。各ジョブには個別のプライマリ シートがあります。 カバー シートは、[`PageMediaSize`](../pagemediasize/)と[`PageMediaType`](../pagemediatype/) は、ジョブの最終ページに使用されます。カバー シートは処理 options に統合する必要があります ([`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/) 、[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) ) 指定されたオプションで示される. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback

```csharp
public sealed class JobPrimaryCoverBack : Feature, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [JobPrimaryCoverBack](jobprimarycoverback/)(params CoverBackOption[]) | 新しいインスタンスを作成します。 |

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
| class [CoverBackOption](jobprimarycoverback.coverbackoption/) | は、`JobPrimaryCoverBack`機能オプション. |

### 関連項目

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


