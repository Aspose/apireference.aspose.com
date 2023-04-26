---
title: Class JobInputBin
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.JobInputBin クラス. デバイスにインストールされている入力ビンまたはデバイスでサポートされているビンの完全なリストについて説明します ジョブごとに入力ビンを指定できますのJobInputBin DocumentInputBin とPageInputBinキーワードは相互に排他的です PrintTicket または Print Capabilities ドキュメントで両方を同時に指定することはできません 
type: docs
weight: 1380
url: /ja/net/aspose.page.xps.xpsmetadata/jobinputbin/
---
## JobInputBin class

デバイスにインストールされている入力ビン、またはデバイスでサポートされているビンの完全なリストについて説明します。 ジョブごとに入力ビンを指定できます。の`JobInputBin` 、[`DocumentInputBin`](../documentinputbin/), と[`PageInputBin`](../pageinputbin/)キーワードは相互に排他的です。 PrintTicket または Print Capabilities ドキュメントで両方を同時に指定することはできません 。

```csharp
public sealed class JobInputBin : InputBin, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [JobInputBin](jobinputbin/)(params IInputBinItem[]) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが[`Feature`](../feature/)、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

### 関連項目

* class [InputBin](../inputbin/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


