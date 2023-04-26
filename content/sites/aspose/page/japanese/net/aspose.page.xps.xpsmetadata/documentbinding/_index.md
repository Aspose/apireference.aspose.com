---
title: Class DocumentBinding
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentBinding クラス. バインド方法を記述します各ドキュメントは個別にバインドされます. DocumentBinding と JobBindAllDocuments は相互に排他的です. キーワード間の制約処理を決定するのはドライバー次第です. https//docs.microsoft.com/enus/windows/win32/printdocs/documentbinding
type: docs
weight: 570
url: /ja/net/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class

バインド方法を記述します。各ドキュメントは個別にバインドされます. DocumentBinding と JobBindAllDocuments は相互に排他的です. キーワード間の制約処理を決定するのはドライバー次第です. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding

```csharp
public sealed class DocumentBinding : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentBinding](documentbinding/)(params BindingOption[]) | 新しいインスタンスを作成します。 |

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
| class [BindingGutter](documentbinding.bindinggutter/) | 指定方法について説明します。スコアリングされたプロパティ値、 整数値またはパラメータ. |
| class [BindingOption](documentbinding.bindingoption/) | のオプションを表します`DocumentBinding`feature. |
| interface [IBindingOptionItem](documentbinding.ibindingoptionitem/) | 任意のインターフェイス[`BindingOption`](../documentbinding.bindingoption/)item. |

### 関連項目

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


