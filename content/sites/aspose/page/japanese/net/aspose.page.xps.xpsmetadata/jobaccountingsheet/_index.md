---
title: Class JobAccountingSheet
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.JobAccountingSheet クラス. ジョブで出力する帳票を記述します default に会計帳票が出力されているはずですPageMediaSizeデフォルトを使用してPageMediaType .アカウンティング シートはジョブの残りの部分から 分離する必要がありますこれは仕上げまたは処理オプション  など   また  アカウンティング シートを含めないでください アカウンティング シートは実装者の裁量でジョブの最初または最後のページとして表示される場合があります
type: docs
weight: 1140
url: /ja/net/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class

ジョブで出力する帳票を記述します。 default に会計帳票が出力されているはずです。[`PageMediaSize`](../pagemediasize/)デフォルトを使用して[`PageMediaType`](../pagemediatype/) .アカウンティング シートは、ジョブの残りの部分から 分離する必要があります。これは、仕上げまたは処理オプション ( など) 、 、 また ) アカウンティング シートを含めないでください。 アカウンティング シートは、実装者の裁量でジョブの最初または最後のページとして表示される場合があります。

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobAccountingSheet : Feature, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [JobAccountingSheet](jobaccountingsheet/)(params JobAccountingSheetOption[]) | 新しいインスタンスを作成します。 |

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
| class [JobAccountingSheetOption](jobaccountingsheet.jobaccountingsheetoption/) | は、`JobAccountingSheet`機能オプション. |

### 関連項目

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


