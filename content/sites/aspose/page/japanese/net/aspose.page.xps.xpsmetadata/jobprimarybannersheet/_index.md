---
title: Class JobPrimaryBannerSheet
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryBannerSheet クラス. ジョブで出力するバナーシートを記述しますバナーシートはdefault に出力する必要がありますPageMediaSizeデフォルトを使用してPageMediaType.バナー シートは残りのジョブから分離する必要がありますこれは仕上げまたは処理オプション  などJobDuplexAllDocumentsContiguously JobStapleAllDocuments  またJobBindAllDocuments  にバナー シートを含めないでくださいバナー シートはジョブの最初のシートとして発生する必要があります
type: docs
weight: 1480
url: /ja/net/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class

ジョブで出力するバナーシートを記述します。バナーシートはdefault に出力する必要があります[`PageMediaSize`](../pagemediasize/)デフォルトを使用して[`PageMediaType`](../pagemediatype/).バナー シートは、残りのジョブから分離する必要があります。これは、仕上げまたは処理オプション ( など)[`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/) 、[`JobStapleAllDocuments`](../jobstaplealldocuments/) 、 また[`JobBindAllDocuments`](../jobbindalldocuments/) ) にバナー シートを含めないでください。バナー シートは、ジョブの最初のシートとして発生する必要があります。

```csharp
public sealed class JobPrimaryBannerSheet : Feature, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [JobPrimaryBannerSheet](jobprimarybannersheet/)(params BannerSheetOption[]) | 新しいインスタンスを作成します。 |

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
| class [BannerSheetOption](jobprimarybannersheet.bannersheetoption/) | のオプションを表します`JobPrimaryBannerSheet`feature. |

### 関連項目

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


