---
title: Class JobBindAllDocuments
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.JobBindAllDocuments クラス. バインド方法を記述しますジョブ内のすべての文書が製本されます. JobBindAllDocumentsとDocumentBinding相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https//docs.microsoft.com/enus/windows/win32/printdocs/jobbindalldocuments
type: docs
weight: 1150
url: /ja/net/aspose.page.xps.xpsmetadata/jobbindalldocuments/
---
## JobBindAllDocuments class

バインド方法を記述します。ジョブ内のすべての文書が製本されます. `JobBindAllDocuments`と[`DocumentBinding`](../documentbinding/)相互に排他的です. これらのキーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobbindalldocuments

```csharp
public sealed class JobBindAllDocuments : Feature, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [JobBindAllDocuments](jobbindalldocuments/)(params BindingOption[]) | 新しいインスタンスを作成します。 |

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
| class [BindingGutter](jobbindalldocuments.bindinggutter/) | 指定方法について説明します。スコアリングされたプロパティ値、 整数値またはパラメータ. |
| class [BindingOption](jobbindalldocuments.bindingoption/) | は、`JobBindAllDocuments`機能オプション. |
| interface [IBindingOptionItem](jobbindalldocuments.ibindingoptionitem/) | 任意のインターフェイス[`BindingOption`](../jobbindalldocuments.bindingoption/)item. |

### 関連項目

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


