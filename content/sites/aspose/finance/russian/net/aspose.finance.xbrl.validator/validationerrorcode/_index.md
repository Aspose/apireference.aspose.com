---
title: ValidationErrorCode
second_title: Справочник по API Aspose.Finance для .NET
description: Код ошибки проверки enum.
type: docs
weight: 8160
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
| SchemaRefNoTypeSimple | `0` | Тип SchemaRef ДОЛЖЕН встречаться и ДОЛЖЕН иметь фиксированное содержимое "simple". |
| SchemaRefNoHref | `1` | SchemaRef ДОЛЖЕН иметь атрибут href. |
| ContextNoId | `2` | Идентификатор контекста ДОЛЖЕН включать атрибут id. |
| ContextNoEntity | `3` | Элемент сущности является обязательным содержимым элемента контекста. |
| ContextEntityNoIdentifier | `4` | Элемент сущности ДОЛЖЕН содержать элемент идентификатора |
| ContextPeriodNoStartTime | `5` | Тип периода контекста — продолжительность, но не имеет даты начала. |
| ContextPeriodNoEndTime | `6` | Тип контекста peroid — длительность, но не дата окончания. |
| ContextPeriodStartAfterEnd | `7` | Тип периода контекста — продолжительность, но дата окончания предшествует дате начала. |
| ContextInstantNoTime | `8` | Контекстный тип peroid является мгновенным, но не имеет мгновенной даты. |
| ContextScenarioXbrlNamespace | `9` | Сценарий контекста не может иметь узел пространства имен xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Сценарий контекста не может иметь элемент в группе замены для элементов, определенных в пространстве имен xbrl. |
| ContextScenarioEmpty | `11` | Контекстный сценарий не может быть пустым" |
| ContextSegmentXbrlNamespace | `12` | Сегмент контекста не может иметь узел пространства имен xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Сегмент контекста не может иметь элемент в группе замены для элементов, определенных в пространстве имен xbrl. |
| ContextSegmentEmpty | `14` | Сегмент контекста не может быть пустым |
| ItemNoContext | `15` | Элемент должен иметь контекст. |
| ItemPeroidTypeConflictWithContext | `16` | Элемент имеет конфликт типа периода с контекстом. |
| ItemNumericNoUnit | `17` | Элемент является числовым и должен иметь единицу измерения. |
| MonetaryItemNoSingleUnitMeasure | `18` | Товар имеет денежный тип и должен иметь единую единицу измерения. |
| MonetaryItemNoISO4217 | `19` | Товар имеет денежный тип и должен иметь единицу измерения в стиле ISO 4217. |
| ShareItemNoSingleUnitMeasure | `20` | Элемент относится к типу акций и должен иметь единую меру. |
| ShareItemNoShareUnitMeasure | `21` | Элемент относится к типу акций и должен иметь единицу измерения xbrli:shares. |
| NillItemWithPrecisionOrDecimals | `22` | Элемент равен нулю и не должен иметь ни точности, ни десятичных знаков. |
| FractionItemWithPrecisionOrDecimals | `23` | Элемент представляет собой дробь и не должен иметь ни точности, ни десятичных знаков. |
| NumericItemWithBothPrecisionAndDecimals | `24` | Элемент имеет числовой тип и не должен иметь как точность, так и десятичные дроби. |
| NumericItemWithoutPrecisionOrDecimals | `25` | Элемент имеет числовой тип и должен иметь либо точность, либо десятичные дроби. |
| NonNumericItemWithPrecisionOrDecimals | `26` | Элемент не является числовым типом и не должен иметь ни точности, ни десятичных знаков. |
| FootnoteArcFromNotFound | `27` | Дуга сноски не может быть найдена в Loc. |
| FootnoteArcToNotFound | `28` | Дуга сноски не может найти сноску. |
| DefinitionArcFromNotFound | `29` | Не удается найти дугу определения из Loc. |
| DefinitionArcToNotFound | `30` | Дуга определения не может найти Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | Сущность-алиас Дуга определения имеет разные типы. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Сущность-псевдоним Дуга определения имеет разные типы периодов. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Сущность-алиас Дуга определения имеет разные балансы. |
| CalculationArcFromNotFound | `34` | Дуга расчета не может найти из Loc. |
| CalculationArcToNotFound | `35` | Дуга расчета не может найти Loc. |
| CalculationArcZeroWeight | `36` | Расчетная дуга имеет нулевой вес. |
| CalculationArcSummationItemNonNumeric | `37` | Дуга вычисления элемента суммирования имеет нечисловую концепцию. |
| CalculationArcIllegalBalancecWeight | `38` | Дуга вычисления элемента суммирования имеет нечисловую концепцию. |
| LabelArcFromNotFound | `39` | Дуга метки не может найти из Loc. |
| LabelArcToNotFound | `40` | Дуга метки не может найти метку. |
| PresentationArcFromNotFound | `41` | Арка презентации не может быть найдена в Loc. |
| PresentationArcToNotFound | `42` | Дуга презентации не может найти Loc. |
| PresentationArcPreferredLabelNotFound | `43` | Дуга презентации не может найти PreferredLabel. |
| ReferenceArcFromNotFound | `44` | Справочная дуга не может быть найдена в Loc. |
| ReferenceArcToNotFound | `45` | Опорная дуга не может найти опорную. |
| InlineFactMissContext | `46` | Встроенный факт не может найти контекст. |
| InlineFactMissUnit | `47` | Встроенный факт не может найти единицу измерения. |
| InlineDuplicatedId | `48` | Встроенный документ Xbrl имеет повторяющийся идентификатор. |
| InlineRelationshipMissFromRef | `49` | Встроенная связь не может быть найдена из ref. |
| InlineRelationshipMissToRef | `50` | Встроенная связь не может найти ссылку |
| InlineRelationshipIllegalFromRef | `51` | Встроенная связь имеет недопустимое значение из ref. |
| InlineRelationshipIllegalToRef | `52` | Встроенная связь имеет недопустимую ссылку на ref. |
| InlineContinuationNotMatch | `53` | Встроенное продолжение имеет недопустимое соответствие. |
| InlineFootnoteNotlang | `54` | Встроенная сноска не имеет языка. |
| InlineFractionIllegalChildElement | `55` | Встроенная дробь имеет недопустимый дочерний элемент. |
| InlineFractionIllegalAttrbuites | `56` | Встроенная дробь имеет недопустимые атрибуты. |
| InlineFractionIllegalAncestor | `57` | Встроенная дробь имеет недопустимый предок. |
| InlineFractionTermNegative | `58` | Встроенная дробь имеет отрицательный термин. |
| InlineHeaderIllegalAncestor | `59` | Встроенная дробь имеет недопустимый тег. |
| InlineHeaderDisplayNone | `60` | Отцовский узел div встроенного заголовка не имеет стиля "display:none". |
| InlineHeaderIllegalChildElement | `61` | Встроенный заголовок содержит более одного элемента "hidden" или более одного элемента "resources". |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction имеет недопустимый предок. |
| InlineNonFractionIllegalChildElement | `63` | В строке nonFraction есть недопустимый дочерний элемент. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction имеет недопустимые свойства. |
| InlineNonFractionTermNegative | `65` | Inline nonFraction имеет отрицательный термин. |
| InlineTupleIllegalChildElement | `66` | Встроенный кортеж содержит недопустимый элемент. |
| InlineContinuationNoId | `67` | Элемент ix:continuation ДОЛЖЕН иметь атрибут id.. |
| InlineContinuationIllegalAncestor | `68` | Элемент ix:continuation НЕ ДОЛЖЕН быть потомком элемента ix:hidden. |
| InlineExcludeIllegalAncestor | `69` | Элемент ix:exclude ДОЛЖЕН быть потомком хотя бы одного элемента ix:continuation, ix:footnote или ix:nonNumeric. |

### Смотрите также

* пространство имен [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* сборка [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
