---
title: ValidationErrorCode
second_title: Referencia de API de Aspose.Finance para .NET
description: Código de error de validación enum.
type: docs
weight: 8160
url: /es/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Código de error de validación enum.

```csharp
public enum ValidationErrorCode
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | El tipo SchemaRef DEBE ocurrir y DEBE tener el contenido fijo "simple". |
| SchemaRefNoHref | `1` | SchemaRef DEBE tener un atributo href. |
| ContextNoId | `2` | ID de contexto DEBE incluir el atributo id. |
| ContextNoEntity | `3` | El elemento de entidad es contenido obligatorio del elemento de contexto. |
| ContextEntityNoIdentifier | `4` | El elemento de entidad DEBE contener un elemento identificador |
| ContextPeriodNoStartTime | `5` | El tipo de período de contexto es la duración, pero no tiene fecha de inicio. |
| ContextPeriodNoEndTime | `6` | El tipo de período de contexto es la duración, pero no tiene fecha de finalización. |
| ContextPeriodStartAfterEnd | `7` | El tipo de período de contexto es la duración, pero la fecha de finalización es anterior a la fecha de inicio. |
| ContextInstantNoTime | `8` | El tipo de período de contexto es instantáneo, pero no tiene fecha instantánea. |
| ContextScenarioXbrlNamespace | `9` | El escenario de contexto no puede tener un nodo de espacio de nombres xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `10` | El escenario de contexto no puede tener un elemento en el grupo de sustitución para los elementos definidos en el espacio de nombres xbrl. |
| ContextScenarioEmpty | `11` | El escenario de contexto no puede estar vacío" |
| ContextSegmentXbrlNamespace | `12` | El segmento de contexto no puede tener un nodo de espacio de nombres xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `13` | El segmento de contexto no puede tener un elemento en el grupo de sustitución de elementos definidos en el espacio de nombres xbrl. |
| ContextSegmentEmpty | `14` | El segmento de contexto no puede estar vacío |
| ItemNoContext | `15` | El elemento debe tener un contexto. |
| ItemPeroidTypeConflictWithContext | `16` | El elemento tiene un conflicto de tipo de período con el contexto. |
| ItemNumericNoUnit | `17` | El artículo es numérico y debe tener una unidad. |
| MonetaryItemNoSingleUnitMeasure | `18` | El artículo es de tipo monetario y debe tener una sola unidad de medida. |
| MonetaryItemNoISO4217 | `19` | El artículo es de tipo monetario y debe tener una unidad de medida de estilo Iso 4217. |
| ShareItemNoSingleUnitMeasure | `20` | El artículo es de tipo compartido y debe tener una sola unidad de medida. |
| ShareItemNoShareUnitMeasure | `21` | El artículo es de tipo compartido y debe tener una unidad de medida xbrli:shares. |
| NillItemWithPrecisionOrDecimals | `22` | El ítem es nulo y no debe tener ni precisión ni decimales. |
| FractionItemWithPrecisionOrDecimals | `23` | El ítem es de tipo fracción y no debe tener ni precisión ni decimales. |
| NumericItemWithBothPrecisionAndDecimals | `24` | El elemento es de tipo numérico y no debe tener precisión ni decimales. |
| NumericItemWithoutPrecisionOrDecimals | `25` | El elemento es de tipo numérico y debe tener precisión o decimales. |
| NonNumericItemWithPrecisionOrDecimals | `26` | El ítem no es de tipo numérico y no debe tener ni precisión ni decimales. |
| FootnoteArcFromNotFound | `27` | Arco de nota al pie no se puede encontrar desde Loc. |
| FootnoteArcToNotFound | `28` | El arco de la nota al pie no puede encontrar la nota al pie. |
| DefinitionArcFromNotFound | `29` | Arco de definición no se puede encontrar desde Loc. |
| DefinitionArcToNotFound | `30` | Arco de definición no puede encontrar a Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | El arco de definición de alias de esencia tiene diferentes tipos. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | El arco de definición de alias de esencia tiene diferentes tipos de período. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | El arco de definición de alias de esencia tiene diferentes saldos. |
| CalculationArcFromNotFound | `34` | Arco de cálculo no se puede encontrar desde Loc. |
| CalculationArcToNotFound | `35` | Arco de cálculo no puede encontrar a Loc. |
| CalculationArcZeroWeight | `36` | El arco de cálculo tiene peso cero. |
| CalculationArcSummationItemNonNumeric | `37` | El arco de cálculo del elemento de suma tiene un concepto no numérico. |
| CalculationArcIllegalBalancecWeight | `38` | El arco de cálculo del elemento de suma tiene un concepto no numérico. |
| LabelArcFromNotFound | `39` | Arco de etiqueta no se puede encontrar desde Loc. |
| LabelArcToNotFound | `40` | El arco de la etiqueta no puede encontrar la etiqueta. |
| PresentationArcFromNotFound | `41` | El arco de presentación no se puede encontrar desde Loc. |
| PresentationArcToNotFound | `42` | El arco de presentación no se encuentra en Loc. |
| PresentationArcPreferredLabelNotFound | `43` | El arco de presentación no puede encontrar la etiqueta preferida. |
| ReferenceArcFromNotFound | `44` | No se puede encontrar el arco de referencia desde Loc. |
| ReferenceArcToNotFound | `45` | El arco de referencia no puede encontrar la Referencia. |
| InlineFactMissContext | `46` | El hecho en línea no puede encontrar el contexto. |
| InlineFactMissUnit | `47` | El hecho en línea no puede encontrar la unidad. |
| InlineDuplicatedId | `48` | El documento Xbrl en línea tiene una identificación duplicada. |
| InlineRelationshipMissFromRef | `49` | La relación en línea no se puede encontrar desde la ref. |
| InlineRelationshipMissToRef | `50` | La relación en línea no puede encontrar la referencia. |
| InlineRelationshipIllegalFromRef | `51` | La relación en línea tiene ilegal de ref. |
| InlineRelationshipIllegalToRef | `52` | La relación en línea tiene ilegal para ref. |
| InlineContinuationNotMatch | `53` | La continuación en línea tiene una coincidencia ilegal. |
| InlineFootnoteNotlang | `54` | La nota al pie en línea no tiene idioma. |
| InlineFractionIllegalChildElement | `55` | La fracción en línea tiene un elemento secundario ilegal. |
| InlineFractionIllegalAttrbuites | `56` | La fracción en línea tiene atributos ilegales. |
| InlineFractionIllegalAncestor | `57` | La fracción en línea tiene un antepasado ilegal. |
| InlineFractionTermNegative | `58` | La fracción en línea tiene un término negativo. |
| InlineHeaderIllegalAncestor | `59` | La fracción en línea tiene una etiqueta ilegal. |
| InlineHeaderDisplayNone | `60` | El nodo div padre del encabezado en línea no tiene el estilo "display:none". |
| InlineHeaderIllegalChildElement | `61` | El encabezado en línea tiene más de un elemento "oculto" o más de un elemento de "recursos". |
| InlineNonFractionIllegalAncestor | `62` | La no fracción en línea tiene un antepasado ilegal. |
| InlineNonFractionIllegalChildElement | `63` | La no fracción en línea tiene un elemento secundario ilegal. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction tiene propiedades ilegales. |
| InlineNonFractionTermNegative | `65` | No fracción en línea tiene un término negativo. |
| InlineTupleIllegalChildElement | `66` | La tupla en línea tiene un elemento ilegal. |
| InlineContinuationNoId | `67` | El elemento ix:continuation DEBE tener un atributo id.. |
| InlineContinuationIllegalAncestor | `68` | El elemento ix:continuation NO DEBE ser descendiente de un elemento ix:hidden. |
| InlineExcludeIllegalAncestor | `69` | El elemento ix:exclude DEBE ser descendiente de al menos un elemento ix:continuation, ix:footnote o ix:nonNumeric. |

### Ver también

* espacio de nombres [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* asamblea [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
