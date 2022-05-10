---
title: ValidationErrorCode
second_title: Aspose.Finance for .NET API Reference
description: 
type: docs
weight: 8130
url: /net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Validation error code enum.

```csharp
public enum ValidationErrorCode
```

## Values

| Name | Value | Description |
| --- | --- | --- |
| ContextPeriodNoStartTime | `0` | Context peroid type is duration, but has no start date. |
| ContextPeriodNoEndTime | `1` | Context peroid type is duration, but has no end date. |
| ContextPeriodStartAfterEnd | `2` | Context peroid type is duration, but end date is before start date. |
| ContextInstantNoTime | `3` | Context peroid type is instant, but has no instant date. |
| ContextScenarioXbrlNamespace | `4` | Context scenario can't have xbrl namespace node. |
| ContextScenarioXbrlSubstitutionGroup | `5` | Context scenario can't have element in the substitution group for elements defined in the xbrl namespace. |
| ContextScenarioEmpty | `6` | Context scenario can't be empty" |
| ContextSegmentXbrlNamespace | `7` | Context segment can't have xbrl namespace node. |
| ContextSegmentXbrlSubstitutionGroup | `8` | Context segment can't have element in the substitution group for elements defined in the xbrl namespace. |
| ContextSegmentEmpty | `9` | Context segment can't be empty |
| ItemNoContext | `10` | Item must have a context. |
| ItemPeroidTypeConflictWithContext | `11` | Item has period type conflict with context. |
| ItemNumericNoUnit | `12` | Item is numeric and must have a unit. |
| MonetaryItemNoSingleUnitMeasure | `13` | Item is monetary type and must have a single unit measure. |
| MonetaryItemNoISO4217 | `14` | Item is monetary type and must have a Iso 4217 style unit measure. |
| ShareItemNoSingleUnitMeasure | `15` | Item is share type and must have a single unit measure. |
| ShareItemNoShareUnitMeasure | `16` | Item is share type and must have a xbrli:shares unit measure. |
| NillItemWithPrecisionOrDecimals | `17` | Item is nil and must not have either precision or decimals. |
| FractionItemWithPrecisionOrDecimals | `18` | Item is fraction type and must not have either precision or decimals. |
| NumericItemWithBothPrecisionAndDecimals | `19` | Item is numeric type and must not have both precision and decimals. |
| NumericItemWithoutPrecisionOrDecimals | `20` | Item is numeric type and must have either precision or decimals. |
| NonNumericItemWithPrecisionOrDecimals | `21` | Item is not numeric type and must not have either precision or decimals. |
| FootnoteArcFromNotFound | `22` | Footnote arc can't find from Loc. |
| FootnoteArcToNotFound | `23` | Footnote arc can't find to footnote. |
| DefinitionArcFromNotFound | `24` | Definition arc can't find from Loc. |
| DefinitionArcToNotFound | `25` | Definition arc can't find to Loc. |
| EssenceAliasDefinitionArcDifferentType | `26` | Essence-alias Definition arc has different types. |
| EssenceAliasDefinitionArcDifferentPeriodType | `27` | Essence-alias Definition arc has different periodTypes. |
| EssenceAliasDefinitionArcDifferentBalance | `28` | Essence-alias Definition arc has different balances. |
| CalculationArcFromNotFound | `29` | Calculation arc can't find from Loc. |
| CalculationArcToNotFound | `30` | Calculation arc can't find to Loc. |
| CalculationArcZeroWeight | `31` | Calculation arc has zero weight. |
| CalculationArcSummationItemNonNumeric | `32` | Summation item calculation arc has non numeric concept. |
| CalculationArcIllegalBalancecWeight | `33` | Summation item calculation arc has non numeric concept. |
| LabelArcFromNotFound | `34` | Label arc can't find from Loc. |
| LabelArcToNotFound | `35` | Label arc can't find to Label. |
| PresentationArcFromNotFound | `36` | Presentation arc can't find from Loc. |
| PresentationArcToNotFound | `37` | Presentation arc can't find to Loc. |
| PresentationArcPreferredLabelNotFound | `38` | Presentation arc can't find preferredLabel. |
| ReferenceArcFromNotFound | `39` | Reference arc can't find from Loc. |
| ReferenceArcToNotFound | `40` | Reference arc can't find to Reference. |
| InlineFactMissContext | `41` | Inline Fact can't find context. |
| InlineFactMissUnit | `42` | Inline Fact can't find unit. |
| InlineDuplicatedId | `43` | Inline Xbrl document has duplicated id. |
| InlineRelationshipMissFromRef | `44` | Inline relationship can't find from ref. |
| InlineRelationshipMissToRef | `45` | Inline relationship can't find to ref. |
| InlineRelationshipIllegalFromRef | `46` | Inline relationship has illegal from ref. |
| InlineRelationshipIllegalToRef | `47` | Inline relationship has illegal to ref. |
| InlineContinuationNotMatch | `48` | Inline Continuation has illegal to match. |
| InlineFootnoteNotlang | `49` | Inline Footnote has no lang. |
| InlineFractionIllegalChildElement | `50` | Inline Fraction has illegal childelement. |
| InlineFractionIllegalAttrbuites | `51` | Inline Fraction has illegal attrbuites. |
| InlineFractionIllegalAncestor | `52` | Inline Fraction has illegal Ancestor. |
| InlineFractionTermNegative | `53` | Inline Fraction has Term Negative. |
| InlineHeaderIllegalAncestor | `54` | Inline Fraction has illegal tag. |
| InlineHeaderDisplayNone | `55` | Inline header father div node has no style of "display:none". |
| InlineHeaderIllegalChildElement | `56` | Inline header has more than one "hidden" element or more than one "resources" element. |
| InlineNonFractionIllegalAncestor | `57` | Inline nonFraction has illegal Ancestor. |
| InlineNonFractionIllegalChildElement | `58` | Inline nonFraction has illegal Child Elemnt. |
| InlineNonFractionIllegalProperties | `59` | Inline nonFraction has illegal Properties. |
| InlineNonFractionTermNegative | `60` | Inline nonFraction has Term Negative. |
| InlineTupleIllegalChildElement | `61` | Inline tuple has illegal element. |

### See Also

* namespace [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* assembly [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
