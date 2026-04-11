---
title: رمز_خطأ_التحقق
second_title: مرجع واجهة برمجة تطبيقات Aspose.Finance لـ .NET
description: تعداد رموز أخطاء التحقق.
type: docs
weight: 8210
url: /ar/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

تعداد رموز أخطاء التحقق.

```csharp
public enum ValidationErrorCode
```

### القيم

| الاسم | القيمة | الوصف |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | يجب أن يحدث نوع SchemaRef ويجب أن يحتوي على المحتوى الثابت \"simple\". |
| SchemaRefNoHref | `1` | يجب أن يحتوي SchemaRef على سمة href. |
| ContextNoId | `2` | يجب أن يتضمن معرف السياق سمة المعرف. |
| ContextNoEntity | `3` | عنصر الكيان هو محتوى مطلوب لعنصر السياق. |
| ContextEntityNoIdentifier | `4` | يجب أن يحتوي عنصر الكيان على عنصر معرف |
| ContextPeriodNoStartTime | `5` | نوع فترة السياق هو مدة، لكن لا يوجد تاريخ بدء. |
| ContextPeriodNoEndTime | `6` | نوع فترة السياق هو مدة، لكن لا يوجد تاريخ انتهاء. |
| ContextPeriodStartAfterEnd | `7` | نوع فترة السياق هو مدة، لكن تاريخ الانتهاء قبل تاريخ البدء. |
| ContextInstantNoTime | `8` | نوع فترة السياق هو لحظة، لكن لا يوجد تاريخ لحظي. |
| ContextScenarioXbrlNamespace | `9` | لا يمكن أن يحتوي سيناريو السياق على عقدة مساحة اسم xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `10` | لا يمكن أن يحتوي سيناريو السياق على عنصر في مجموعة الاستبدال للعناصر المعرفة في مساحة اسم xbrl. |
| ContextScenarioEmpty | `11` | لا يمكن أن يكون سيناريو السياق فارغًا\" |
| ContextSegmentXbrlNamespace | `12` | لا يمكن أن يحتوي جزء السياق على عقدة مساحة اسم xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `13` | لا يمكن أن يحتوي جزء السياق على عنصر في مجموعة الاستبدال للعناصر المعرفة في مساحة اسم xbrl. |
| ContextSegmentEmpty | `14` | لا يمكن أن يكون جزء السياق فارغًا |
| ItemNoContext | `15` | يجب أن يحتوي البند على سياق. |
| ItemPeroidTypeConflictWithContext | `16` | العنصر لديه تعارض في نوع الفترة مع السياق. |
| ItemNumericNoUnit | `17` | العنصر رقمي ويجب أن يكون له وحدة. |
| MonetaryItemNoSingleUnitMeasure | `18` | العنصر من نوع نقدي ويجب أن يحتوي على وحدة قياس واحدة. |
| MonetaryItemNoISO4217 | `19` | العنصر من نوع نقدي ويجب أن يحتوي على وحدة قياس بنمط Iso 4217. |
| ShareItemNoSingleUnitMeasure | `20` | العنصر من نوع حصة ويجب أن يحتوي على وحدة قياس واحدة. |
| ShareItemNoShareUnitMeasure | `21` | العنصر من نوع حصة ويجب أن يحتوي على وحدة قياس xbrli:shares. |
| NillItemWithPrecisionOrDecimals | `22` | العنصر فارغ ولا يجب أن يحتوي على الدقة أو الكسور. |
| FractionItemWithPrecisionOrDecimals | `23` | العنصر من نوع كسر ولا يجب أن يحتوي على الدقة أو الكسور. |
| NumericItemWithBothPrecisionAndDecimals | `24` | العنصر من نوع رقمي ولا يجب أن يحتوي على كل من الدقة والكسور. |
| NumericItemWithoutPrecisionOrDecimals | `25` | العنصر من نوع رقمي ويجب أن يحتوي على الدقة أو الكسور. |
| NonNumericItemWithPrecisionOrDecimals | `26` | العنصر ليس من نوع رقمي ولا يجب أن يحتوي على الدقة أو الكسور. |
| FootnoteArcFromNotFound | `27` | قوس الحاشية لا يمكن العثور عليه من Loc. |
| FootnoteArcToNotFound | `28` | قوس الحاشية لا يمكن العثور عليه إلى الحاشية. |
| DefinitionArcFromNotFound | `29` | قوس التعريف لا يمكن العثور عليه من Loc. |
| DefinitionArcToNotFound | `30` | قوس التعريف لا يمكن العثور عليه إلى Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | قوس تعريف Essence-alias يحتوي على أنواع مختلفة. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | قوس تعريف Essence-alias يحتوي على periodTypes مختلفة. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | قوس تعريف Essence-alias يحتوي على أرصدة مختلفة. |
| CalculationArcFromNotFound | `34` | قوس الحساب لا يمكن العثور عليه من Loc. |
| CalculationArcToNotFound | `35` | قوس الحساب لا يمكن العثور عليه إلى Loc. |
| CalculationArcZeroWeight | `36` | قوس الحساب لديه وزن صفر. |
| CalculationArcSummationItemNonNumeric | `37` | قوس حساب عنصر الجمع يحتوي على مفهوم غير رقمي. |
| CalculationArcIllegalBalancecWeight | `38` | قوس حساب عنصر الجمع يحتوي على مفهوم غير رقمي. |
| LabelArcFromNotFound | `39` | قوس التسمية لا يمكن العثور عليه من Loc. |
| LabelArcToNotFound | `40` | قوس التسمية لا يمكن العثور عليه إلى Label. |
| PresentationArcFromNotFound | `41` | قوس العرض لا يمكن العثور عليه من Loc. |
| PresentationArcToNotFound | `42` | Presentation arc لا يمكنه العثور على Loc. |
| PresentationArcPreferredLabelNotFound | `43` | Presentation arc لا يمكنه العثور على preferredLabel. |
| ReferenceArcFromNotFound | `44` | Reference arc لا يمكنه العثور على من Loc. |
| ReferenceArcToNotFound | `45` | Reference arc لا يمكنه العثور على إلى Reference. |
| InlineFactMissContext | `46` | Inline Fact لا يمكنه العثور على context. |
| InlineFactMissUnit | `47` | Inline Fact لا يمكنه العثور على unit. |
| InlineDuplicatedId | `48` | وثيقة Inline Xbrl تحتوي على معرف مكرر. |
| InlineRelationshipMissFromRef | `49` | Inline relationship لا يمكنه العثور على من ref. |
| InlineRelationshipMissToRef | `50` | Inline relationship لا يمكنه العثور على إلى ref. |
| InlineRelationshipIllegalFromRef | `51` | Inline relationship يحتوي على from ref غير قانوني. |
| InlineRelationshipIllegalToRef | `52` | Inline relationship يحتوي على to ref غير قانوني. |
| InlineContinuationNotMatch | `53` | Inline Continuation يحتوي على to match غير قانوني. |
| InlineFootnoteNotlang | `54` | Inline Footnote لا يحتوي على lang. |
| InlineFractionIllegalChildElement | `55` | Inline Fraction يحتوي على childelement غير قانوني. |
| InlineFractionIllegalAttrbuites | `56` | Inline Fraction يحتوي على attrbuites غير قانوني. |
| InlineFractionIllegalAncestor | `57` | Inline Fraction يحتوي على Ancestor غير قانوني. |
| InlineFractionTermNegative | `58` | Inline Fraction يحتوي على Term Negative. |
| InlineHeaderIllegalAncestor | `59` | Inline Fraction يحتوي على tag غير قانوني. |
| InlineHeaderDisplayNone | `60` | العنصر الأب div لـ Inline header لا يحتوي على النمط "display:none". |
| InlineHeaderIllegalChildElement | `61` | Inline header يحتوي على أكثر من عنصر "hidden" أو أكثر من عنصر "resources". |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction يحتوي على Ancestor غير قانوني. |
| InlineNonFractionIllegalChildElement | `63` | Inline nonFraction يحتوي على Child Elemnt غير قانوني. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction يحتوي على Properties غير قانوني. |
| InlineNonFractionTermNegative | `65` | Inline nonFraction يحتوي على Term Negative. |
| InlineTupleIllegalChildElement | `66` | Inline tuple يحتوي على عنصر غير قانوني. |
| InlineContinuationNoId | `67` | يجب أن يحتوي عنصر ix:continuation على سمة id.. |
| InlineContinuationIllegalAncestor | `68` | يجب ألا يكون عنصر ix:continuation تابعًا لعنصر ix:hidden. |
| InlineExcludeIllegalAncestor | `69` | يجب أن يكون عنصر ix:exclude تابعًا لعنصر واحد على الأقل من عناصر ix:continuation أو ix:footnote أو ix:nonNumeric. |

### انظر أيضًا

* namespace [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* assembly [Aspose.Finance](../../)

<!-- لا تقم بالتعديل: تم إنشاؤه بواسطة xmldocmd لـ Aspose.Finance.dll -->
