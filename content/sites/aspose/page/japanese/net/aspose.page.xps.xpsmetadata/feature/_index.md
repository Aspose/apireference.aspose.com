---
title: Class Feature
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.Feature クラス. 共通の印刷スキーマ機能をカプセル化するクラス すべてのスキーマ定義機能の基本クラス A要素にはOptionとProperty デバイス属性ジョブの書式設定またはその他の関連する特性を完全に記述する要素
type: docs
weight: 870
url: /ja/net/aspose.page.xps.xpsmetadata/feature/
---
## Feature class

共通の印刷スキーマ機能をカプセル化するクラス。 すべてのスキーマ定義機能の基本クラス。 A要素には、[`Option`](../option/)と[`Property`](../property/) デバイス属性、ジョブの書式設定、またはその他の関連する特性を完全に記述する要素。

```csharp
Feature
```

```csharp
public class Feature : CompositePrintTicketElement, IFeatureItem, IPrintTicketItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Feature](feature/#constructor)(string, Feature, params IFeatureItem[]) | 新しい PrintTicket 機能インスタンスを作成します。 |
| [Feature](feature/#constructor_1)(string, Option, params IFeatureItem[]) | 新しい PrintTicket 機能インスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | この機能のアイテム リストの最後にアイテムのリストを追加します。 それぞれが`Feature`、[`Option`](../option/)または[`Property`](../property/)インスタンス. |

### 関連項目

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* interface [IPrintTicketItem](../iprintticketitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


