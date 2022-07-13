---
title: ValidationErrorCode
second_title: Справочник по API Aspose.Finance для .NET
description: Код ошибки проверки enum.
type: docs
weight: 8150
url: /ru/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Код ошибки проверки enum.

```csharp
public enum ValidationErrorCode
```

### Ценности

| Имя | Ценность | Описание |
| --- | --- | --- |
| ContextPeriodNoStartTime | `0` | Контекстный период имеет тип продолжительности, но не имеет даты начала. |
| ContextPeriodNoEndTime | `1` | Контекстный период имеет тип продолжительности, но не имеет даты окончания. |
| ContextPeriodStartAfterEnd | `2` | Тип периода контекста — продолжительность, но дата окончания предшествует дате начала. |
| ContextInstantNoTime | `3` | Контекстный тип peroid является мгновенным, но не имеет мгновенной даты. |
| ContextScenarioXbrlNamespace | `4` | Сценарий контекста не может иметь узел пространства имен xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `5` | Сценарий контекста не может иметь элемент в группе замены для элементов, определенных в пространстве имен xbrl. |
| ContextScenarioEmpty | `6` | Контекстный сценарий не может быть пустым" |
| ContextSegmentXbrlNamespace | `7` | Сегмент контекста не может иметь узел пространства имен xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `8` | Сегмент контекста не может иметь элемент в группе замены для элементов, определенных в пространстве имен xbrl. |
| ContextSegmentEmpty | `9` | Сегмент контекста не может быть пустым |
| ItemNoContext | `10` | Элемент должен иметь контекст. |
| ItemPeroidTypeConflictWithContext | `11` | Элемент имеет конфликт типа периода с контекстом. |
| ItemNumericNoUnit | `12` | Элемент является числовым и должен иметь единицу измерения. |
| MonetaryItemNoSingleUnitMeasure | `13` | Товар имеет денежный тип и должен иметь единую меру. |
| MonetaryItemNoISO4217 | `14` | Товар имеет денежный тип и должен иметь единицу измерения в стиле Iso 4217. |
| ShareItemNoSingleUnitMeasure | `15` | Элемент относится к общему типу и должен иметь единую единицу измерения. |
| ShareItemNoShareUnitMeasure | `16` | Элемент относится к типу акций и должен иметь единицу измерения xbrli:shares. |
| NillItemWithPrecisionOrDecimals | `17` | Элемент равен нулю и не должен иметь ни точности, ни десятичных знаков. |
| FractionItemWithPrecisionOrDecimals | `18` | Элемент представляет собой дробь и не должен иметь ни точности, ни десятичных знаков. |
| NumericItemWithBothPrecisionAndDecimals | `19` | Элемент является числовым типом и не должен иметь как точность, так и десятичные дроби. |
| NumericItemWithoutPrecisionOrDecimals | `20` | Элемент имеет числовой тип и должен иметь точность или десятичные дроби. |
| NonNumericItemWithPrecisionOrDecimals | `21` | Элемент не является числовым типом и не должен иметь точности или десятичных знаков. |
| FootnoteArcFromNotFound | `22` | Арка сноски не может найти в лок. |
| FootnoteArcToNotFound | `23` | Дуга сноски не может найти сноску. |
| DefinitionArcFromNotFound | `24` | Определения дуги не удается найти в лок. |
| DefinitionArcToNotFound | `25` | Дуга определения не может найти лок. |
| EssenceAliasDefinitionArcDifferentType | `26` | Сущность-псевдоним Определение дуги имеет разные типы. |
| EssenceAliasDefinitionArcDifferentPeriodType | `27` | Сущность-псевдоним Дуга определения имеет разные типы периодов. |
| EssenceAliasDefinitionArcDifferentBalance | `28` | Сущность-псевдоним Определение дуги имеет разные балансы. |
| CalculationArcFromNotFound | `29` | Расчетная дуга не может найти из лок. |
| CalculationArcToNotFound | `30` | Расчетная дуга не может найти Loc. |
| CalculationArcZeroWeight | `31` | Расчетная дуга имеет нулевой вес. |
| CalculationArcSummationItemNonNumeric | `32` | Дуга вычисления элемента суммирования имеет нечисловую концепцию. |
| CalculationArcIllegalBalancecWeight | `33` | Дуга вычисления элемента суммирования имеет нечисловую концепцию. |
| LabelArcFromNotFound | `34` | Дуга метки не может найти в лок. |
| LabelArcToNotFound | `35` | Дуга метки не может найти метку. |
| PresentationArcFromNotFound | `36` | Арка презентации не может найти в лок. |
| PresentationArcToNotFound | `37` | Арка презентации не может найти лок. |
| PresentationArcPreferredLabelNotFound | `38` | Дуга презентации не может найти предпочитаемую метку. |
| ReferenceArcFromNotFound | `39` | Справочную дугу не удается найти в лок. |
| ReferenceArcToNotFound | `40` | Опорная дуга не может найти опорную. |
| InlineFactMissContext | `41` | Inline Fact не может найти контекст. |
| InlineFactMissUnit | `42` | Inline Fact не может найти единицу измерения. |
| InlineDuplicatedId | `43` | Встроенный документ Xbrl имеет повторяющийся идентификатор. |
| InlineRelationshipMissFromRef | `44` | Встроенная связь не может быть найдена из ссылки. |
| InlineRelationshipMissToRef | `45` | Встроенная связь не может найти ссылку. |
| InlineRelationshipIllegalFromRef | `46` | Встроенная связь имеет недопустимое значение из ссылки. |
| InlineRelationshipIllegalToRef | `47` | Встроенная связь недопустима для ссылки. |
| InlineContinuationNotMatch | `48` | Встроенное продолжение имеет недопустимое совпадение. |
| InlineFootnoteNotlang | `49` | Встроенная сноска не имеет языка. |
| InlineFractionIllegalChildElement | `50` | Inline Fraction содержит недопустимый дочерний элемент. |
| InlineFractionIllegalAttrbuites | `51` | Inline Fraction имеет недопустимые атрибуты. |
| InlineFractionIllegalAncestor | `52` | Встроенная дробь имеет недопустимый предок. |
| InlineFractionTermNegative | `53` | Встроенная дробь имеет отрицательный термин. |
| InlineHeaderIllegalAncestor | `54` | Встроенная дробь имеет недопустимый тег. |
| InlineHeaderDisplayNone | `55` | Отцовский узел div встроенного заголовка не имеет стиля "display:none". |
| InlineHeaderIllegalChildElement | `56` | Встроенный заголовок содержит более одного «скрытого» элемента или более одного элемента «ресурсы». |
| InlineNonFractionIllegalAncestor | `57` | Inline nonFraction имеет недопустимый предок. |
| InlineNonFractionIllegalChildElement | `58` | В строке nonFraction есть недопустимый дочерний элемент. |
| InlineNonFractionIllegalProperties | `59` | Inline nonFraction имеет недопустимые свойства. |
| InlineNonFractionTermNegative | `60` | Inline nonFraction имеет Term Negative. |
| InlineTupleIllegalChildElement | `61` | Встроенный кортеж содержит недопустимый элемент. |

### Смотрите также

* пространство имен [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* сборка [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
