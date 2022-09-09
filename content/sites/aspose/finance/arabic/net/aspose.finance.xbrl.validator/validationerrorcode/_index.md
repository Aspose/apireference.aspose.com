---
title: ValidationErrorCode
second_title: Aspose.Finance لمرجع .NET API
description: تعداد رمز خطأ التحقق .
type: docs
weight: 8160
url: /ar/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

تعداد رمز خطأ التحقق .

```csharp
public enum ValidationErrorCode
```

### قيم

| اسم | قيمة | وصف |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | يجب أن يحدث نوع SchemaRef ويجب أن يحتوي على محتوى ثابت "بسيط". |
| SchemaRefNoHref | `1` | يجب أن يحتوي المخطط على سمة href . |
| ContextNoId | `2` | يجب أن يتضمن معرّف السياق سمة المعرّف. |
| ContextNoEntity | `3` | عنصر الكيان هو المحتوى المطلوب لعنصر السياق. |
| ContextEntityNoIdentifier | `4` | يجب أن يحتوي عنصر الكيان على عنصر معرف |
| ContextPeriodNoStartTime | `5` | النوع peroid هو المدة ، لكن ليس له تاريخ بدء. |
| ContextPeriodNoEndTime | `6` | النوع peroid هو المدة ، لكن ليس له تاريخ انتهاء . |
| ContextPeriodStartAfterEnd | `7` | النوع peroid هو المدة ، لكن تاريخ الانتهاء يسبق تاريخ البدء. |
| ContextInstantNoTime | `8` | النوع peroid هو فوري ، لكن ليس له تاريخ فوري. |
| ContextScenarioXbrlNamespace | `9` | لا يمكن أن يحتوي سيناريو السياق على عقدة مساحة اسم xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `10` | لا يمكن أن يحتوي سيناريو السياق على عنصر في مجموعة الاستبدال للعناصر المحددة في مساحة اسم xbrl. |
| ContextScenarioEmpty | `11` | لا يمكن أن يكون سيناريو السياق فارغًا " |
| ContextSegmentXbrlNamespace | `12` | لا يمكن أن يحتوي مقطع السياق على عقدة مساحة اسم xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `13` | لا يمكن أن يحتوي مقطع السياق على عنصر في مجموعة الاستبدال للعناصر المحددة في مساحة الاسم xbrl. |
| ContextSegmentEmpty | `14` | لا يمكن ترك مقطع السياق فارغًا |
| ItemNoContext | `15` | يجب أن يكون للعنصر سياق . |
| ItemPeroidTypeConflictWithContext | `16` | العنصر به نوع فترة يتعارض مع السياق . |
| ItemNumericNoUnit | `17` | العنصر رقمي ويجب أن يحتوي على وحدة . |
| MonetaryItemNoSingleUnitMeasure | `18` | العنصر هو نوع نقدي ويجب أن يحتوي على وحدة قياس واحدة. |
| MonetaryItemNoISO4217 | `19` | العنصر هو نوع نقدي ويجب أن يحتوي على مقياس وحدة نمط Iso 4217. |
| ShareItemNoSingleUnitMeasure | `20` | العنصر هو نوع المشاركة ويجب أن يحتوي على وحدة قياس واحدة. |
| ShareItemNoShareUnitMeasure | `21` | العنصر هو نوع المشاركة ويجب أن يحتوي على xbrli: قياس وحدة الأسهم. |
| NillItemWithPrecisionOrDecimals | `22` | العنصر صفري ويجب ألا يحتوي على دقة أو كسور عشرية. |
| FractionItemWithPrecisionOrDecimals | `23` | العنصر هو نوع كسر ويجب ألا يحتوي على دقة أو كسور عشرية. |
| NumericItemWithBothPrecisionAndDecimals | `24` | العنصر هو نوع رقمي ويجب ألا يحتوي على كل من الدقة والأرقام العشرية. |
| NumericItemWithoutPrecisionOrDecimals | `25` | العنصر هو نوع رقمي ويجب أن يحتوي إما على الدقة أو الكسور العشرية. |
| NonNumericItemWithPrecisionOrDecimals | `26` | العنصر ليس نوعًا رقميًا ويجب ألا يحتوي على دقة أو كسور عشرية. |
| FootnoteArcFromNotFound | `27` | لا يمكن العثور على قوس الحاشية السفلية من Loc . |
| FootnoteArcToNotFound | `28` | لا يمكن العثور على قوس الحاشية السفلية في الحاشية السفلية. |
| DefinitionArcFromNotFound | `29` | تعريف القوس لا يمكن العثور عليه من Loc . |
| DefinitionArcToNotFound | `30` | تعريف القوس لا يمكن العثور عليه إلى Loc . |
| EssenceAliasDefinitionArcDifferentType | `31` | تعريف القوس البديل له أنواع مختلفة. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | تعريف الجوهر المستعار له أنواع مختلفة من الفترة. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | تعريف الجوهر المستعار له أرصدة مختلفة. |
| CalculationArcFromNotFound | `34` | لا يمكن العثور على قوس الحساب من Loc. |
| CalculationArcToNotFound | `35` | لا يمكن العثور على قوس الحساب إلى Loc . |
| CalculationArcZeroWeight | `36` | قوس الحساب له وزن صفري . |
| CalculationArcSummationItemNonNumeric | `37` | قوس حساب عنصر التجميع له مفهوم غير رقمي. |
| CalculationArcIllegalBalancecWeight | `38` | قوس حساب عنصر التجميع له مفهوم غير رقمي. |
| LabelArcFromNotFound | `39` | لا يمكن العثور على Label arc من Loc . |
| LabelArcToNotFound | `40` | لا يمكن العثور على Label arc to Label. |
| PresentationArcFromNotFound | `41` | لا يمكن العثور على قوس العرض من Loc. |
| PresentationArcToNotFound | `42` | لا يمكن العثور على قوس العرض في Loc. |
| PresentationArcPreferredLabelNotFound | `43` | لا يمكن العثور على قوس العرض التقديمي المفضل. |
| ReferenceArcFromNotFound | `44` | لا يمكن العثور على القوس المرجعي من Loc. |
| ReferenceArcToNotFound | `45` | لا يمكن العثور على القوس المرجعي للمرجع . |
| InlineFactMissContext | `46` | الحقيقة المضمنة لا يمكنها العثور على السياق . |
| InlineFactMissUnit | `47` | الحقيقة المضمنة لا يمكن العثور على الوحدة . |
| InlineDuplicatedId | `48` | يحتوي مستند Xbrl المضمن على معرف مكرر. |
| InlineRelationshipMissFromRef | `49` | لا يمكن العثور على العلاقة المضمنة من المرجع . |
| InlineRelationshipMissToRef | `50` | لا يمكن العثور على العلاقة المضمنة للمرجع . |
| InlineRelationshipIllegalFromRef | `51` | العلاقة المضمنة غير قانونية من المرجع . |
| InlineRelationshipIllegalToRef | `52` | العلاقة المضمنة غير قانونية للمرجع . |
| InlineContinuationNotMatch | `53` | ميزة المتابعة المضمنة غير قانونية للمطابقة . |
| InlineFootnoteNotlang | `54` | لا تحتوي الحاشية السفلية المضمنة على لغة . |
| InlineFractionIllegalChildElement | `55` | يحتوي الكسر المضمن على عنصر تابع غير قانوني . |
| InlineFractionIllegalAttrbuites | `56` | يحتوي الكسر المضمن على سمات غير قانونية . |
| InlineFractionIllegalAncestor | `57` | يحتوي الكسر المضمن على أصل غير قانوني . |
| InlineFractionTermNegative | `58` | الكسر المضمن له مصطلح سلبي . |
| InlineHeaderIllegalAncestor | `59` | يحتوي الكسر المضمن على علامة غير قانونية . |
| InlineHeaderDisplayNone | `60` | لا تحتوي عقدة div الأب في الرأس المضمنة على نمط "عرض: لا شيء" . |
| InlineHeaderIllegalChildElement | `61` | يحتوي الرأس المضمن على أكثر من عنصر "مخفي" أو أكثر من عنصر "موارد". |
| InlineNonFractionIllegalAncestor | `62` | يحتوي nonFraction على سلف غير قانوني. |
| InlineNonFractionIllegalChildElement | `63` | يحتوي nonFraction على عنصر فرعي غير قانوني. |
| InlineNonFractionIllegalProperties | `64` | يحتوي nonFraction على خصائص غير قانونية. |
| InlineNonFractionTermNegative | `65` | غير مضمنة تحتوي على مصطلح سلبي . |
| InlineTupleIllegalChildElement | `66` | تحتوي المجموعة المضمنة على عنصر غير قانوني. |
| InlineContinuationNoId | `67` | يجب أن يكون لعنصر المتابعة ix: سمة معرف .. |
| InlineContinuationIllegalAncestor | `68` | يجب ألا يكون العنصر التاسع: تابعًا تابعًا لعنصر ix: مخفي. |
| InlineExcludeIllegalAncestor | `69` | يجب أن يكون العنصر التاسع: استبعاد عنصر تابع لـ ix واحد على الأقل: استمرار ، ix: حاشية سفلية أو ix: عنصر غير رقمي. |

### أنظر أيضا

* مساحة الاسم [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* المجسم [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
