---
title: Class DocumentInputBin
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin クラス. デバイスにインストールされている入力ビンまたはデバイスでサポートされているビンの完全なリストについて説明しますJobInputBin DocumentInputBin  とPageInputBin キーワードは相互に排他的です PrintTicket または印刷機能ドキュメントで両方を同時に指定しないでください https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 740
url: /ja/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

デバイスにインストールされている入力ビン、またはデバイスでサポートされているビンの完全なリストについて説明します。[`JobInputBin`](../jobinputbin/) 、`DocumentInputBin` 、 と[`PageInputBin`](../pageinputbin/) キーワードは相互に排他的です。 PrintTicket または印刷機能ドキュメントで両方を同時に指定しないでください。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | 新しいインスタンスを作成します。 |

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
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


