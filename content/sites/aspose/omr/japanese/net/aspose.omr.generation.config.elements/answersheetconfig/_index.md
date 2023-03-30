---
title: Class AnswerSheetConfig
second_title: Aspose.OMR for .NET API リファレンス
description: Aspose.OMR.Generation.Config.Elements.AnswerSheetConfig クラス. AnswerSheet 要素を表します 列と行でグループ化された選択ボックスを追加できます 問題が互いに近くに配置されているため多くの問題を 1 ページに収めたい場合は解答用紙を使用してください
type: docs
weight: 90
url: /ja/net/aspose.omr.generation.config.elements/answersheetconfig/
---
## AnswerSheetConfig class

AnswerSheet 要素を表します。 列と行でグループ化された選択ボックスを追加できます。 問題が互いに近くに配置されているため、多くの問題を 1 ページに収めたい場合は、解答用紙を使用してください。

```csharp
public class AnswerSheetConfig : BaseConfig
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [AnswerSheetConfig](answersheetconfig/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AnswersCount](../../aspose.omr.generation.config.elements/answersheetconfig/answerscount/) { get; set; } | 解答用紙の各問題の解答選択肢の数. |
| [AnswersValues](../../aspose.omr.generation.config.elements/answersheetconfig/answersvalues/) { get; set; } | 各値はバブル内のシンボルを表します。と同じカウントを持つ必要があります[`AnswersCount`](./answerscount/) 例: 新しい文字列[] {"A", "B", "C", "D"} 例: 新しい文字列[] {"1", "2", "3", "4"} |
| [BubbleType](../../aspose.omr.generation.config.elements/answersheetconfig/bubbletype/) { get; set; } | 泡の種類 |
| [Column](../../aspose.omr.generation.config.elements/answersheetconfig/column/) { get; set; } | 描画する列を示します sheet |
| [ColumnsCount](../../aspose.omr.generation.config.elements/answersheetconfig/columnscount/) { get; set; } | 描画する列数を設定します。 |
| [ElementsCount](../../aspose.omr.generation.config.elements/answersheetconfig/elementscount/) { get; set; } | 解答用紙の問題の総数を決定します。 |
| override [Name](../../aspose.omr.generation.config.elements/answersheetconfig/name/) { get; set; } | 解答用紙名 |
| [StartId](../../aspose.omr.generation.config.elements/answersheetconfig/startid/) { get; set; } | 質問の開始インデックス numbering |
| override [Type](../../aspose.omr.generation.config.elements/answersheetconfig/type/) { get; set; } | omr 要素のタイプ。 JSON シリアル化の必須フィールド. |
| [VerticalMargin](../../aspose.omr.generation.config.elements/answersheetconfig/verticalmargin/) { get; set; } | 解答用紙の縦余白。ピクセル単位で設定. |

## 田畑

| 名前 | 説明 |
| --- | --- |
| [BubbleSize](../../aspose.omr.generation.config.elements/answersheetconfig/bubblesize/) | 泡の大きさ |

### 関連項目

* class [BaseConfig](../../aspose.omr.generation.config/baseconfig/)
* 名前空間 [Aspose.OMR.Generation.Config.Elements](../../aspose.omr.generation.config.elements/)
* 組み立て [Aspose.OMR](../../)


