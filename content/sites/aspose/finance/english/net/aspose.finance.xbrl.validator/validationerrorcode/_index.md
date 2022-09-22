---
title: ValidationErrorCode
second_title: Aspose.Finance for .NET API Reference
description: Validation error code enum.
type: docs
weight: 8210
url: /net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Validation error code enum.

```csharp
public enum ValidationErrorCode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | SchemaRef type MUST occur and MUST have the fixed content "simple". |
| SchemaRefNoHref | `1` | SchemaRef MUST have an href attribute. |
| ContextNoId | `2` | Context id MUST include the id attribute. |
| ContextNoEntity | `3` | The entity element is required content of the context element. |
| ContextEntityNoIdentifier | `4` | The entity element MUST contain an identifier element |
| ContextPeriodNoStartTime | `5` | Context peroid type is duration, but has no start date. |
| ContextPeriodNoEndTime | `6` | Context peroid type is duration, but has no end date. |
| ContextPeriodStartAfterEnd | `7` | Context peroid type is duration, but end date is before start date. |
| ContextInstantNoTime | `8` | Context peroid type is instant, but has no instant date. |
| ContextScenarioXbrlNamespace | `9` | Context scenario can't have xbrl namespace node. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Context scenario can't have element in the substitution group for elements defined in the xbrl namespace. |
| ContextScenarioEmpty | `11` | Context scenario can't be empty" |
| ContextSegmentXbrlNamespace | `12` | Context segment can't have xbrl namespace node. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Context segment can't have element in the substitution group for elements defined in the xbrl namespace. |
| ContextSegmentEmpty | `14` | Context segment can't be empty |
| ItemNoContext | `15` | Item must have a context. |
| ItemPeroidTypeConflictWithContext | `16` | Item has period type conflict with context. |
| ItemNumericNoUnit | `17` | Item is numeric and must have a unit. |
| MonetaryItemNoSingleUnitMeasure | `18` | Item is monetary type and must have a single unit measure. |
| MonetaryItemNoISO4217 | `19` | Item is monetary type and must have a Iso 4217 style unit measure. |
| ShareItemNoSingleUnitMeasure | `20` | Item is share type and must have a single unit measure. |
| ShareItemNoShareUnitMeasure | `21` | Item is share type and must have a xbrli:shares unit measure. |
| NillItemWithPrecisionOrDecimals | `22` | Item is nil and must not have either precision or decimals. |
| FractionItemWithPrecisionOrDecimals | `23` | Item is fraction type and must not have either precision or decimals. |
| NumericItemWithBothPrecisionAndDecimals | `24` | Item is numeric type and must not have both precision and decimals. |
| NumericItemWithoutPrecisionOrDecimals | `25` | Item is numeric type and must have either precision or decimals. |
| NonNumericItemWithPrecisionOrDecimals | `26` | Item is not numeric type and must not have either precision or decimals. |
| FootnoteArcFromNotFound | `27` | Footnote arc can't find from Loc. |
| FootnoteArcToNotFound | `28` | Footnote arc can't find to footnote. |
| DefinitionArcFromNotFound | `29` | Definition arc can't find from Loc. |
| DefinitionArcToNotFound | `30` | Definition arc can't find to Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | Essence-alias Definition arc has different types. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Essence-alias Definition arc has different periodTypes. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Essence-alias Definition arc has different balances. |
| CalculationArcFromNotFound | `34` | Calculation arc can't find from Loc. |
| CalculationArcToNotFound | `35` | Calculation arc can't find to Loc. |
| CalculationArcZeroWeight | `36` | Calculation arc has zero weight. |
| CalculationArcSummationItemNonNumeric | `37` | Summation item calculation arc has non numeric concept. |
| CalculationArcIllegalBalancecWeight | `38` | Summation item calculation arc has non numeric concept. |
| LabelArcFromNotFound | `39` | Label arc can't find from Loc. |
| LabelArcToNotFound | `40` | Label arc can't find to Label. |
| PresentationArcFromNotFound | `41` | Presentation arc can't find from Loc. |
| PresentationArcToNotFound | `42` | Presentation arc can't find to Loc. |
| PresentationArcPreferredLabelNotFound | `43` | Presentation arc can't find preferredLabel. |
| ReferenceArcFromNotFound | `44` | Reference arc can't find from Loc. |
| ReferenceArcToNotFound | `45` | Reference arc can't find to Reference. |
| InlineFactMissContext | `46` | Inline Fact can't find context. |
| InlineFactMissUnit | `47` | Inline Fact can't find unit. |
| InlineDuplicatedId | `48` | Inline Xbrl document has duplicated id. |
| InlineRelationshipMissFromRef | `49` | Inline relationship can't find from ref. |
| InlineRelationshipMissToRef | `50` | Inline relationship can't find to ref. |
| InlineRelationshipIllegalFromRef | `51` | Inline relationship has illegal from ref. |
| InlineRelationshipIllegalToRef | `52` | Inline relationship has illegal to ref. |
| InlineContinuationNotMatch | `53` | Inline Continuation has illegal to match. |
| InlineFootnoteNotlang | `54` | Inline Footnote has no lang. |
| InlineFractionIllegalChildElement | `55` | Inline Fraction has illegal childelement. |
| InlineFractionIllegalAttrbuites | `56` | Inline Fraction has illegal attrbuites. |
| InlineFractionIllegalAncestor | `57` | Inline Fraction has illegal Ancestor. |
| InlineFractionTermNegative | `58` | Inline Fraction has Term Negative. |
| InlineHeaderIllegalAncestor | `59` | Inline Fraction has illegal tag. |
| InlineHeaderDisplayNone | `60` | Inline header father div node has no style of "display:none". |
| InlineHeaderIllegalChildElement | `61` | Inline header has more than one "hidden" element or more than one "resources" element. |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction has illegal Ancestor. |
| InlineNonFractionIllegalChildElement | `63` | Inline nonFraction has illegal Child Elemnt. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction has illegal Properties. |
| InlineNonFractionTermNegative | `65` | Inline nonFraction has Term Negative. |
| InlineTupleIllegalChildElement | `66` | Inline tuple has illegal element. |
| InlineContinuationNoId | `67` | The ix:continuation element MUST have an id attribute.. |
| InlineContinuationIllegalAncestor | `68` | The ix:continuation element MUST NOT be a descendant of an ix:hidden element. |
| InlineExcludeIllegalAncestor | `69` | The ix:exclude element MUST be a descendant of at least one ix:continuation, ix:footnote or ix:nonNumeric element. |

### See Also

* namespace [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* assembly [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
