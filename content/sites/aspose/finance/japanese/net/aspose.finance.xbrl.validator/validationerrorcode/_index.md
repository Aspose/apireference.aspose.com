---
title: Enum ValidationErrorCode
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.Validator.ValidationErrorCode 列挙. 検証エラー コード enum.
type: docs
weight: 8210
url: /ja/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

検証エラー コード enum.

```csharp
public enum ValidationErrorCode
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | SchemaRef タイプが発生しなければならず、固定コンテンツ「シンプル」を持たなければなりません. |
| SchemaRefNoHref | `1` | SchemaRef には href 属性が必要です。 |
| ContextNoId | `2` | コンテキスト ID には id 属性を含める必要があります. |
| ContextNoEntity | `3` | エンティティ要素は、コンテキスト要素の必須コンテンツです。 |
| ContextEntityNoIdentifier | `4` | エンティティ要素には識別子要素 が含まれている必要があります |
| ContextPeriodNoStartTime | `5` | コンテキストの期間タイプは期間ですが、開始日がありません. |
| ContextPeriodNoEndTime | `6` | コンテキストの期間タイプは期間ですが、終了日がありません. |
| ContextPeriodStartAfterEnd | `7` | コンテキストの期間タイプは期間ですが、終了日は開始日より前です。 |
| ContextInstantNoTime | `8` | コンテキスト peroid タイプはインスタントですが、インスタント日付がありません. |
| ContextScenarioXbrlNamespace | `9` | コンテキスト シナリオは xbrl 名前空間ノードを持つことはできません. |
| ContextScenarioXbrlSubstitutionGroup | `10` | コンテキスト シナリオでは、xbrl 名前空間で定義された要素の置換グループに要素を含めることはできません. |
| ContextScenarioEmpty | `11` | コンテキスト シナリオを空にすることはできません" |
| ContextSegmentXbrlNamespace | `12` | コンテキスト セグメントは xbrl 名前空間ノードを持つことはできません. |
| ContextSegmentXbrlSubstitutionGroup | `13` | コンテキスト セグメントは、xbrl 名前空間で定義された要素の置換グループに要素を持つことはできません. |
| ContextSegmentEmpty | `14` | コンテキスト セグメントを空にすることはできません |
| ItemNoContext | `15` | アイテムにはコンテキストが必要です. |
| ItemPeroidTypeConflictWithContext | `16` | アイテムにはコンテキストと競合する期間タイプがあります. |
| ItemNumericNoUnit | `17` | 項目は数値であり、単位が必要です. |
| MonetaryItemNoSingleUnitMeasure | `18` | アイテムは通貨タイプであり、単一の単位メジャーが必要です. |
| MonetaryItemNoISO4217 | `19` | アイテムは通貨タイプであり、Iso 4217 スタイルの単位メジャーが必要です. |
| ShareItemNoSingleUnitMeasure | `20` | アイテムは共有タイプで、単一の単位メジャーが必要です. |
| ShareItemNoShareUnitMeasure | `21` | アイテムはシェア タイプであり、xbrli:shares ユニット メジャーが必要です。 |
| NillItemWithPrecisionOrDecimals | `22` | アイテムは nil であり、精度または小数を指定してはなりません。 |
| FractionItemWithPrecisionOrDecimals | `23` | 項目は小数タイプで、精度または小数を指定してはなりません。 |
| NumericItemWithBothPrecisionAndDecimals | `24` | アイテムは数値型であり、精度と小数の両方を持つことはできません. |
| NumericItemWithoutPrecisionOrDecimals | `25` | 項目は数値型で、精度または小数のいずれかが必要です。 |
| NonNumericItemWithPrecisionOrDecimals | `26` | 項目は数値型ではなく、精度または小数を指定してはなりません。 |
| FootnoteArcFromNotFound | `27` | 脚注アークが Loc. から見つかりません |
| FootnoteArcToNotFound | `28` | 脚注アークが脚注に見つかりません。 |
| DefinitionArcFromNotFound | `29` | 定義アークが Loc. から見つかりません |
| DefinitionArcToNotFound | `30` | 定義アークが Loc. に見つかりません |
| EssenceAliasDefinitionArcDifferentType | `31` | Essence-alias 定義アークには異なるタイプがあります. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Essence-alias 定義 arc には異なる periodTypes. があります |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Essence-alias 定義アークのバランスが異なります. |
| CalculationArcFromNotFound | `34` | 計算アークが Loc. から見つかりません |
| CalculationArcToNotFound | `35` | 計算アークが Loc. に見つかりません |
| CalculationArcZeroWeight | `36` | 計算アークの重みはゼロです. |
| CalculationArcSummationItemNonNumeric | `37` | 合計アイテムの計算アークには非数値概念があります. |
| CalculationArcIllegalBalancecWeight | `38` | 合計アイテムの計算アークには非数値概念があります. |
| LabelArcFromNotFound | `39` | ラベル アークが Loc. から見つかりません |
| LabelArcToNotFound | `40` | ラベル アークがラベルに見つかりません。 |
| PresentationArcFromNotFound | `41` | プレゼンテーション アークが Loc. から見つかりません |
| PresentationArcToNotFound | `42` | プレゼンテーション アークが Loc. に見つかりません |
| PresentationArcPreferredLabelNotFound | `43` | プレゼンテーション アークで preferredLabel. が見つかりません |
| ReferenceArcFromNotFound | `44` | 参照アークが Loc. から見つかりません |
| ReferenceArcToNotFound | `45` | 参照アークが参照に見つかりません. |
| InlineFactMissContext | `46` | インライン ファクトでコンテキストが見つかりません。 |
| InlineFactMissUnit | `47` | Inline Fact で単位が見つかりません。 |
| InlineDuplicatedId | `48` | インライン Xbrl ドキュメントの ID が重複しています。 |
| InlineRelationshipMissFromRef | `49` | インライン関係が ref. から見つかりません |
| InlineRelationshipMissToRef | `50` | インライン関係が ref. に見つかりません |
| InlineRelationshipIllegalFromRef | `51` | ref. からのインライン関係が不正です |
| InlineRelationshipIllegalToRef | `52` | インライン関係は ref. に対して不正です |
| InlineContinuationNotMatch | `53` | インライン継続の一致が不正です。 |
| InlineFootnoteNotlang | `54` | インライン脚注に lang. がありません |
| InlineFractionIllegalChildElement | `55` | Inline Fraction に不正な子要素があります。 |
| InlineFractionIllegalAttrbuites | `56` | インライン分数に不正な属性があります。 |
| InlineFractionIllegalAncestor | `57` | インライン分数に不正な先祖があります. |
| InlineFractionTermNegative | `58` | インライン分数に負の項があります。 |
| InlineHeaderIllegalAncestor | `59` | インライン分数に不正なタグがあります. |
| InlineHeaderDisplayNone | `60` | インライン ヘッダーの親 div ノードに「display:none」のスタイルがありません。 |
| InlineHeaderIllegalChildElement | `61` | インライン ヘッダーに複数の「hidden」要素または複数の「resources」要素があります。 |
| InlineNonFractionIllegalAncestor | `62` | インラインの nonFraction に不正な先祖があります. |
| InlineNonFractionIllegalChildElement | `63` | インラインの nonFraction に不正な子要素があります。 |
| InlineNonFractionIllegalProperties | `64` | インラインの nonFraction に不正なプロパティがあります。 |
| InlineNonFractionTermNegative | `65` | インラインの nonFraction には負の項があります。 |
| InlineTupleIllegalChildElement | `66` | インライン タプルに不正な要素があります。 |
| InlineContinuationNoId | `67` | ix:continuation 要素には id 属性が必要です.. |
| InlineContinuationIllegalAncestor | `68` | ix:continuation 要素は、ix:hidden 要素の子孫であってはなりません. |
| InlineExcludeIllegalAncestor | `69` | ix:exclude 要素は、少なくとも 1 つの ix:continuation、ix:footnote、または ix:nonNumeric 要素の子孫でなければなりません. |

### 関連項目

* 名前空間 [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator/)
* 組み立て [Aspose.Finance](../../)


