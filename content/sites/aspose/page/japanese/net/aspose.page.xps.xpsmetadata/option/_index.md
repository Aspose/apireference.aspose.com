---
title: Class Option
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsMetadata.Option クラス. 共通の PrintTicket を実装するクラス. すべてのスキーマ定義オプションの基本クラス. Option 要素にはすべてのPropertyand ScoredPropertyこのオプションに関連付けられている要素. https//docs.microsoft.com/enus/windows/win32/printdocs/option
type: docs
weight: 1660
url: /ja/net/aspose.page.xps.xpsmetadata/option/
---
## Option class

共通の PrintTicket を実装するクラス. すべてのスキーマ定義オプションの基本クラス. Option 要素には、すべての[`Property`](../property/)and [`ScoredProperty`](../scoredproperty/)このオプションに関連付けられている要素. https://docs.microsoft.com/en-us/windows/win32/printdocs/option

```csharp
Option
```

```csharp
public class Option : CompositePrintTicketElement, IFeatureItem
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Option](option/#constructor)(params IOptionItem[]) | 新しい PrintTicket オプション インスタンスを作成します。 |
| [Option](option/#constructor_1)(Option) | クローン オプション インスタンスを作成します。 |
| [Option](option/#constructor_2)(string, params IOptionItem[]) | 新しい PrintTicket オプション インスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 要素名を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | このオプションの項目リストの最後に項目のリストを追加します。 それぞれが[`ScoredProperty`](../scoredproperty/)また[`Property`](../property/)インスタンス. |

### 関連項目

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* 名前空間 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 組み立て [Aspose.Page](../../)


