---
title: ValidationErrorCode
second_title: Aspose.Finance 适用于 .NET API 参考
description: 验证错误代码枚举。
type: docs
weight: 8210
url: /zh/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

验证错误代码枚举。

```csharp
public enum ValidationErrorCode
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | SchemaRef 类型必须出现，并且必须具有固定内容 "simple"。 |
| SchemaRefNoHref | `1` | SchemaRef 必须具有 href 属性。 |
| ContextNoId | `2` | 上下文 id 必须包含 id 属性。 |
| ContextNoEntity | `3` | entity 元素是 context 元素的必需内容。 |
| ContextEntityNoIdentifier | `4` | entity 元素必须包含一个 identifier 元素 |
| ContextPeriodNoStartTime | `5` | 上下文 peroid 类型为 duration，但没有开始日期。 |
| ContextPeriodNoEndTime | `6` | 上下文 peroid 类型为 duration，但没有结束日期。 |
| ContextPeriodStartAfterEnd | `7` | 上下文 peroid 类型为 duration，但结束日期早于开始日期。 |
| ContextInstantNoTime | `8` | 上下文 peroid 类型为 instant，但没有瞬时日期。 |
| ContextScenarioXbrlNamespace | `9` | 上下文 scenario 不能包含 xbrl 命名空间节点。 |
| ContextScenarioXbrlSubstitutionGroup | `10` | 上下文 scenario 不能包含在 xbrl 命名空间中定义的元素的替代组中的元素。 |
| ContextScenarioEmpty | `11` | 上下文 scenario 不能为空" |
| ContextSegmentXbrlNamespace | `12` | 上下文 segment 不能包含 xbrl 命名空间节点。 |
| ContextSegmentXbrlSubstitutionGroup | `13` | 上下文 segment 不能包含在 xbrl 命名空间中定义的元素的替代组中的元素。 |
| ContextSegmentEmpty | `14` | 上下文 segment 不能为空 |
| ItemNoContext | `15` | Item 必须具有上下文。 |
| ItemPeroidTypeConflictWithContext | `16` | 项目的期间类型与上下文冲突。 |
| ItemNumericNoUnit | `17` | 项目是数值型，必须具有单位。 |
| MonetaryItemNoSingleUnitMeasure | `18` | 项目是货币类型，必须只有一个单位度量。 |
| MonetaryItemNoISO4217 | `19` | 项目是货币类型，必须使用 ISO 4217 样式的单位度量。 |
| ShareItemNoSingleUnitMeasure | `20` | 项目是股份类型，必须只有一个单位度量。 |
| ShareItemNoShareUnitMeasure | `21` | 项目是股份类型，必须使用 xbrli:shares 单位度量。 |
| NillItemWithPrecisionOrDecimals | `22` | 项目为空，且不能具有精度或小数位。 |
| FractionItemWithPrecisionOrDecimals | `23` | 项目是分数类型，且不能具有精度或小数位。 |
| NumericItemWithBothPrecisionAndDecimals | `24` | 项目是数值类型，不能同时具有精度和小数位。 |
| NumericItemWithoutPrecisionOrDecimals | `25` | 项目是数值类型，必须具有精度或小数位之一。 |
| NonNumericItemWithPrecisionOrDecimals | `26` | 项目不是数值类型，不能具有精度或小数位。 |
| FootnoteArcFromNotFound | `27` | 脚注弧无法从 Loc 找到。 |
| FootnoteArcToNotFound | `28` | 脚注弧无法找到目标脚注。 |
| DefinitionArcFromNotFound | `29` | 定义弧无法从 Loc 找到。 |
| DefinitionArcToNotFound | `30` | 定义弧无法找到目标 Loc。 |
| EssenceAliasDefinitionArcDifferentType | `31` | 本质别名定义弧的类型不同。 |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | 本质别名定义弧的期间类型不同。 |
| EssenceAliasDefinitionArcDifferentBalance | `33` | 本质别名定义弧的余额不同。 |
| CalculationArcFromNotFound | `34` | 计算弧无法从 Loc 找到。 |
| CalculationArcToNotFound | `35` | 计算弧无法找到目标 Loc。 |
| CalculationArcZeroWeight | `36` | 计算弧的权重为零。 |
| CalculationArcSummationItemNonNumeric | `37` | 求和项目的计算弧具有非数值概念。 |
| CalculationArcIllegalBalancecWeight | `38` | 求和项目的计算弧具有非数值概念。 |
| LabelArcFromNotFound | `39` | 标签弧无法从 Loc 找到。 |
| LabelArcToNotFound | `40` | 标签弧无法找到目标标签。 |
| PresentationArcFromNotFound | `41` | 呈现弧无法从 Loc 找到。 |
| PresentationArcToNotFound | `42` | Presentation arc 找不到 Loc。 |
| PresentationArcPreferredLabelNotFound | `43` | Presentation arc 找不到 preferredLabel。 |
| ReferenceArcFromNotFound | `44` | Reference arc 找不到来自 Loc。 |
| ReferenceArcToNotFound | `45` | Reference arc 找不到目标 Reference。 |
| InlineFactMissContext | `46` | Inline Fact 找不到上下文。 |
| InlineFactMissUnit | `47` | Inline Fact 找不到单位。 |
| InlineDuplicatedId | `48` | Inline Xbrl document 存在重复的 id。 |
| InlineRelationshipMissFromRef | `49` | Inline relationship 找不到来源 ref。 |
| InlineRelationshipMissToRef | `50` | Inline relationship 找不到目标 ref。 |
| InlineRelationshipIllegalFromRef | `51` | Inline relationship 的 from ref 非法。 |
| InlineRelationshipIllegalToRef | `52` | Inline relationship 的 to ref 非法。 |
| InlineContinuationNotMatch | `53` | Inline Continuation 的 to match 非法。 |
| InlineFootnoteNotlang | `54` | Inline Footnote 没有 lang。 |
| InlineFractionIllegalChildElement | `55` | Inline Fraction 的 childelement 非法。 |
| InlineFractionIllegalAttrbuites | `56` | Inline Fraction 的 attrbuites 非法。 |
| InlineFractionIllegalAncestor | `57` | Inline Fraction 的 Ancestor 非法。 |
| InlineFractionTermNegative | `58` | Inline Fraction 包含 Term Negative。 |
| InlineHeaderIllegalAncestor | `59` | Inline Fraction 的 tag 非法。 |
| InlineHeaderDisplayNone | `60` | Inline header 父 div 节点没有 "display:none" 样式。 |
| InlineHeaderIllegalChildElement | `61` | Inline header 包含多个 "hidden" 元素或多个 "resources" 元素。 |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction 的 Ancestor 非法。 |
| InlineNonFractionIllegalChildElement | `63` | Inline nonFraction 的 Child Elemnt 非法。 |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction 的 Properties 非法。 |
| InlineNonFractionTermNegative | `65` | Inline nonFraction 包含 Term Negative。 |
| InlineTupleIllegalChildElement | `66` | Inline tuple 的 element 非法。 |
| InlineContinuationNoId | `67` | ix:continuation 元素必须具有 id 属性.. |
| InlineContinuationIllegalAncestor | `68` | ix:continuation 元素不得是 ix:hidden 元素的后代。 |
| InlineExcludeIllegalAncestor | `69` | ix:exclude 元素必须是至少一个 ix:continuation、ix:footnote 或 ix:nonNumeric 元素的后代。 |

### 另请参阅

* namespace [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
