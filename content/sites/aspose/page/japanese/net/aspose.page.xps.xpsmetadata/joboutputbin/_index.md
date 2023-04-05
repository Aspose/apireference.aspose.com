---
title: Class JobOutputBin
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.JobOutputBin クラス. デバイスにインストールされている出力ビンまたはデバイスでサポートされているビンの完全なリストについて説明しますJobOutputBin DocumentOutputBinとPageOutputBinキーワード は相互に排他的でPrintTicket または印刷機能ドキュメントで指定する必要があるのは 1 つのみです
type: docs
weight: 1420
url: /ja/net/aspose.page.xps.xpsmetadata/joboutputbin/
---
## JobOutputBin class

デバイスにインストールされている出力ビン、またはデバイスでサポートされているビンの完全なリストについて説明します。`JobOutputBin` 、[`DocumentOutputBin`](../documentoutputbin/)と[`PageOutputBin`](../pageoutputbin/)キーワード は相互に排他的で、PrintTicket または印刷機能ドキュメントで指定する必要があるのは 1 つのみです。

```csharp
public sealed class JobOutputBin : OutputBin, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [JobOutputBin](joboutputbin/)(params IOutputBinItem[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

### 関連項目

* class [OutputBin](../outputbin/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


