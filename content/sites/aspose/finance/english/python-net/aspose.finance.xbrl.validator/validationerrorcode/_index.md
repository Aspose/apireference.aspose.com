---
title: ValidationErrorCode enumeration
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 90
url: /python-net/aspose.finance.xbrl.validator/validationerrorcode/
is_root: false
---

## ValidationErrorCode enumeration

Validation error code enum.



The ValidationErrorCode type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| SCHEMA_REF_NO_TYPE_SIMPLE | SchemaRef type MUST occur and MUST have the fixed content "simple". |
| SCHEMA_REF_NO_HREF | SchemaRef MUST have an href attribute. |
| CONTEXT_NO_ID | Context id MUST include the id attribute. |
| CONTEXT_NO_ENTITY | The entity element is required content of the context element. |
| CONTEXT_ENTITY_NO_IDENTIFIER | The entity element MUST contain an identifier element |
| CONTEXT_PERIOD_NO_START_TIME | Context peroid type is duration, but has no start date. |
| CONTEXT_PERIOD_NO_END_TIME | Context peroid type is duration, but has no end date. |
| CONTEXT_PERIOD_START_AFTER_END | Context peroid type is duration, but end date is before start date. |
| CONTEXT_INSTANT_NO_TIME | Context peroid type is instant, but has no instant date. |
| CONTEXT_SCENARIO_XBRL_NAMESPACE | Context scenario can't have xbrl namespace node. |
| CONTEXT_SCENARIO_XBRL_SUBSTITUTION_GROUP | Context scenario  can't have element in the substitution group for elements defined in the xbrl namespace. |
| CONTEXT_SCENARIO_EMPTY | Context scenario can't be empty" |
| CONTEXT_SEGMENT_XBRL_NAMESPACE | Context segment can't have xbrl namespace node. |
| CONTEXT_SEGMENT_XBRL_SUBSTITUTION_GROUP | Context segment can't have element in the substitution group for elements defined in the xbrl namespace. |
| CONTEXT_SEGMENT_EMPTY | Context segment can't be empty |
| ITEM_NO_CONTEXT | Item must have a context. |
| ITEM_PEROID_TYPE_CONFLICT_WITH_CONTEXT | Item has period type conflict with context. |
| ITEM_NUMERIC_NO_UNIT | Item is numeric and must have a unit. |
| MONETARY_ITEM_NO_SINGLE_UNIT_MEASURE | Item is monetary type and must have a single unit measure. |
| MONETARY_ITEM_NO_ISO4217 | Item is monetary type and must have a Iso 4217 style unit measure. |
| SHARE_ITEM_NO_SINGLE_UNIT_MEASURE | Item is share type and must have a single unit measure. |
| SHARE_ITEM_NO_SHARE_UNIT_MEASURE | Item is share type and must have a xbrli:shares unit measure. |
| NILL_ITEM_WITH_PRECISION_OR_DECIMALS | Item is nil and must not have either precision or decimals. |
| FRACTION_ITEM_WITH_PRECISION_OR_DECIMALS | Item is fraction type and must not have either precision or decimals. |
| NUMERIC_ITEM_WITH_BOTH_PRECISION_AND_DECIMALS | Item is numeric type and must not have both precision and decimals. |
| NUMERIC_ITEM_WITHOUT_PRECISION_OR_DECIMALS | Item is numeric type and must have either precision or decimals. |
| NON_NUMERIC_ITEM_WITH_PRECISION_OR_DECIMALS | Item is not numeric type and must not have either precision or decimals. |
| FOOTNOTE_ARC_FROM_NOT_FOUND | Footnote arc can't find from Loc. |
| FOOTNOTE_ARC_TO_NOT_FOUND | Footnote arc can't find to footnote. |
| DEFINITION_ARC_FROM_NOT_FOUND | Definition arc can't find from Loc. |
| DEFINITION_ARC_TO_NOT_FOUND | Definition arc can't find to Loc. |
| ESSENCE_ALIAS_DEFINITION_ARC_DIFFERENT_TYPE | Essence-alias Definition arc has different types. |
| ESSENCE_ALIAS_DEFINITION_ARC_DIFFERENT_PERIOD_TYPE | Essence-alias Definition arc has different periodTypes. |
| ESSENCE_ALIAS_DEFINITION_ARC_DIFFERENT_BALANCE | Essence-alias Definition arc has different balances. |
| CALCULATION_ARC_FROM_NOT_FOUND | Calculation arc can't find from Loc. |
| CALCULATION_ARC_TO_NOT_FOUND | Calculation arc can't find to Loc. |
| CALCULATION_ARC_ZERO_WEIGHT | Calculation arc has zero weight. |
| CALCULATION_ARC_SUMMATION_ITEM_NON_NUMERIC | Summation item calculation arc has non numeric concept. |
| CALCULATION_ARC_ILLEGAL_BALANCEC_WEIGHT | Summation item calculation arc has non numeric concept. |
| LABEL_ARC_FROM_NOT_FOUND | Label arc can't find from Loc. |
| LABEL_ARC_TO_NOT_FOUND | Label arc can't find to Label. |
| PRESENTATION_ARC_FROM_NOT_FOUND | Presentation arc can't find from Loc. |
| PRESENTATION_ARC_TO_NOT_FOUND | Presentation arc can't find to Loc. |
| PRESENTATION_ARC_PREFERRED_LABEL_NOT_FOUND | Presentation arc can't find preferredLabel. |
| REFERENCE_ARC_FROM_NOT_FOUND | Reference arc can't find from Loc. |
| REFERENCE_ARC_TO_NOT_FOUND | Reference arc can't find to Reference. |
| INLINE_FACT_MISS_CONTEXT | Inline Fact can't find context. |
| INLINE_FACT_MISS_UNIT | Inline Fact can't find unit. |
| INLINE_DUPLICATED_ID | Inline Xbrl document has duplicated id. |
| INLINE_RELATIONSHIP_MISS_FROM_REF | Inline relationship can't find from ref. |
| INLINE_RELATIONSHIP_MISS_TO_REF | Inline relationship can't find to ref. |
| INLINE_RELATIONSHIP_ILLEGAL_FROM_REF | Inline relationship has illegal from ref. |
| INLINE_RELATIONSHIP_ILLEGAL_TO_REF | Inline relationship has illegal to ref. |
| INLINE_CONTINUATION_NOT_MATCH | Inline Continuation has illegal to match. |
| INLINE_FOOTNOTE_NOTLANG | Inline Footnote has no lang. |
| INLINE_FRACTION_ILLEGAL_CHILD_ELEMENT | Inline Fraction has illegal childelement. |
| INLINE_FRACTION_ILLEGAL_ATTRBUITES | Inline Fraction has illegal attrbuites. |
| INLINE_FRACTION_ILLEGAL_ANCESTOR | Inline Fraction has illegal Ancestor. |
| INLINE_FRACTION_TERM_NEGATIVE | Inline Fraction has Term Negative. |
| INLINE_HEADER_ILLEGAL_ANCESTOR | Inline Fraction has illegal tag. |
| INLINE_HEADER_DISPLAY_NONE | Inline header father div node has no style of "display:none". |
| INLINE_HEADER_ILLEGAL_CHILD_ELEMENT | Inline header has more than one "hidden" element or more than one "resources" element. |
| INLINE_NON_FRACTION_ILLEGAL_ANCESTOR | Inline nonFraction has illegal Ancestor. |
| INLINE_NON_FRACTION_ILLEGAL_CHILD_ELEMENT | Inline nonFraction has illegal Child Elemnt. |
| INLINE_NON_FRACTION_ILLEGAL_PROPERTIES | Inline nonFraction has illegal Properties. |
| INLINE_NON_FRACTION_TERM_NEGATIVE | Inline nonFraction has Term Negative. |
| INLINE_TUPLE_ILLEGAL_CHILD_ELEMENT | Inline tuple has illegal element. |
| INLINE_CONTINUATION_NO_ID | The ix:continuation element MUST have an id attribute.. |
| INLINE_CONTINUATION_ILLEGAL_ANCESTOR | The ix:continuation element MUST NOT be a descendant of an ix:hidden element. |
| INLINE_EXCLUDE_ILLEGAL_ANCESTOR | The ix:exclude element MUST be a descendant of at least one ix:continuation, ix:footnote or ix:nonNumeric element. |


### See Also

* module [aspose.finance.xbrl.validator](../)
