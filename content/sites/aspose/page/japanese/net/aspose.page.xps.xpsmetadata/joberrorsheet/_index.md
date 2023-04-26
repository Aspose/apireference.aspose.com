---
title: Class JobErrorSheet
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet クラス. エラーシート出力について説明しますジョブ全体で 1 つのエラー シートが作成されますエラー sheet はデフォルトで出力されるはずですPageMediaSizeデフォルトを使用してPageMediaType. エラー シートはジョブの残りの部分から分離する必要がありますこれはすべての仕上げ or 処理オプション    また にエラー シートを含めないでくださいエラー シートはジョブの最終シートとして表示されます https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1300
url: /ja/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

エラーシート出力について説明します。ジョブ全体で 1 つのエラー シートが作成されます。エラー sheet はデフォルトで出力されるはずです[`PageMediaSize`](../pagemediasize/)デフォルトを使用して[`PageMediaType`](../pagemediatype/). エラー シートは、ジョブの残りの部分から分離する必要があります。これは、すべての仕上げ or 処理オプション ( 、 、 また) にエラー シートを含めないでください。エラー シートは、ジョブの最終シートとして表示されます。 https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

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
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | 新しいインスタンスを作成します。 |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | は、`JobErrorSheet`機能オプション. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | インナーを記述feature. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | 任意のインターフェイス`JobErrorSheet`機能アイテム. |

### 関連項目

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


