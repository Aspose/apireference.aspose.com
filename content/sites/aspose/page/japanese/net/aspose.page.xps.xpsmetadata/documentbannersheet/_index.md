---
title: Class DocumentBannerSheet
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet クラス. 特定のドキュメントに対して出力するバナーシートを記述しますバナーシートはdefault に出力する必要がありますPageMediaSizeデフォルトを使用してPageMediaType.バナー シートは ジョブの残りの部分からも分離する必要がありますこれは仕上げまたは処理オプション  などDocumentDuplex DocumentStaple  またDocumentBinding にバナー シートを含めないでくださいバナー シートはジョブの残りの部分から分離されている場合と分離されていない場合があります これはジョブの仕上げまたは処理オプションにドキュメント バナー シートが含まれる可能性があることを意味します バナー シートはドキュメントの最初のシートとして発生する必要があります https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 540
url: /ja/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

特定のドキュメントに対して出力するバナーシートを記述します。バナーシートはdefault に出力する必要があります[`PageMediaSize`](../pagemediasize/)デフォルトを使用して[`PageMediaType`](../pagemediatype/).バナー シートは、 ジョブの残りの部分からも分離する必要があります。これは、仕上げまたは処理オプション ( など)[`DocumentDuplex`](../documentduplex/) 、[`DocumentStaple`](../documentstaple/) 、 また[`DocumentBinding`](../documentbinding/)) にバナー シートを含めないでください。バナー シートは、ジョブの残りの部分から分離されている場合と分離されていない場合があります。 これは、ジョブの仕上げまたは処理オプションに、ドキュメント バナー シートが含まれる可能性があることを意味します。 バナー シートは、ドキュメントの最初のシートとして発生する必要があります。 https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | 新しいインスタンスを作成します。 |

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
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | のオプションを表します`DocumentBannerSheet`feature. |

### 関連項目

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


