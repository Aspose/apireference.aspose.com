---
title: ValidationErrorCode
second_title: Aspose.Finance för .NET API-referens
description: Valideringsfelkod enum.
type: docs
weight: 8160
url: /sv/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Valideringsfelkod enum.

```csharp
public enum ValidationErrorCode
```

### Värderingar

| namn | Värde | Beskrivning |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | SchemaRef-typ MÅSTE förekomma och MÅSTE ha det fasta innehållet "enkelt". |
| SchemaRefNoHref | `1` | SchemaRef MÅSTE ha ett href-attribut. |
| ContextNoId | `2` | Kontext-id MÅSTE inkludera id-attributet. |
| ContextNoEntity | `3` | Entitetselementet är obligatoriskt innehåll i kontextelementet. |
| ContextEntityNoIdentifier | `4` | Entitetselementet MÅSTE innehålla ett identifierarelement |
| ContextPeriodNoStartTime | `5` | Typ av kontextperiod är varaktighet, men har inget startdatum. |
| ContextPeriodNoEndTime | `6` | Typ av kontextperiod är varaktighet, men har inget slutdatum. |
| ContextPeriodStartAfterEnd | `7` | Typ av kontextperiod är varaktighet, men slutdatumet är före startdatumet. |
| ContextInstantNoTime | `8` | Kontextperiodtypen är omedelbar, men har inget direktdatum. |
| ContextScenarioXbrlNamespace | `9` | Kontextscenario kan inte ha xbrl-namnområdesnod. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Kontextscenario kan inte ha element i substitutionsgruppen för element definierade i xbrl-namnrymden. |
| ContextScenarioEmpty | `11` | Sammanhangsscenariot kan inte vara tomt" |
| ContextSegmentXbrlNamespace | `12` | Kontextsegment kan inte ha xbrl-namnområdesnod. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Kontextsegment kan inte ha element i substitutionsgruppen för element definierade i xbrl-namnrymden. |
| ContextSegmentEmpty | `14` | Kontextsegment kan inte vara tomt |
| ItemNoContext | `15` | Objekt måste ha ett sammanhang. |
| ItemPeroidTypeConflictWithContext | `16` | Objekt har periodtypkonflikt med sammanhanget. |
| ItemNumericNoUnit | `17` | Objektet är numeriskt och måste ha en enhet. |
| MonetaryItemNoSingleUnitMeasure | `18` | Objektet är monetärt och måste ha ett enda mått. |
| MonetaryItemNoISO4217 | `19` | Föremålet är monetärt och måste ha en Iso 4217 stil enhetsmått. |
| ShareItemNoSingleUnitMeasure | `20` | Objektet är delningstyp och måste ha ett enda mått. |
| ShareItemNoShareUnitMeasure | `21` | Objektet är delningstyp och måste ha ett xbrli:shares unit measure. |
| NillItemWithPrecisionOrDecimals | `22` | Artikeln är noll och får inte ha vare sig precision eller decimaler. |
| FractionItemWithPrecisionOrDecimals | `23` | Objekt är bråktyp och får inte ha vare sig precision eller decimaler. |
| NumericItemWithBothPrecisionAndDecimals | `24` | Objektet är av numerisk typ och får inte ha både precision och decimaler. |
| NumericItemWithoutPrecisionOrDecimals | `25` | Objektet är numeriskt och måste ha antingen precision eller decimaler. |
| NonNumericItemWithPrecisionOrDecimals | `26` | Objektet är inte numeriskt och får inte ha vare sig precision eller decimaler. |
| FootnoteArcFromNotFound | `27` | Fotnotsbågen kan inte hittas från Loc. |
| FootnoteArcToNotFound | `28` | Fotnotsbågen kan inte hitta till fotnoten. |
| DefinitionArcFromNotFound | `29` | Definitionsbågen kan inte hittas från Loc. |
| DefinitionArcToNotFound | `30` | Definitionsbågen kan inte hitta till Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | Essence-alias Definition arc har olika typer. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Essence-alias Definition arc har olika periodTypes. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Essence-alias Definitionsbåge har olika balanser. |
| CalculationArcFromNotFound | `34` | Beräkningsbågen kan inte hittas från Loc. |
| CalculationArcToNotFound | `35` | Beräkningsbågen kan inte hitta till Loc. |
| CalculationArcZeroWeight | `36` | Beräkningsbåge har noll vikt. |
| CalculationArcSummationItemNonNumeric | `37` | Beräkningsbåge för summeringsobjekt har ett icke-numeriskt koncept. |
| CalculationArcIllegalBalancecWeight | `38` | Beräkningsbåge för summeringsobjekt har ett icke-numeriskt koncept. |
| LabelArcFromNotFound | `39` | Etikettbågen kan inte hittas från Loc. |
| LabelArcToNotFound | `40` | Etikettbågen kan inte hittas för att etikettera. |
| PresentationArcFromNotFound | `41` | Presentationsbågen kan inte hittas från Loc. |
| PresentationArcToNotFound | `42` | Presentationsbågen kan inte hitta till Loc. |
| PresentationArcPreferredLabelNotFound | `43` | Presentationsbågen kan inte hitta föredragen etikett. |
| ReferenceArcFromNotFound | `44` | Referensbågen kan inte hittas från Loc. |
| ReferenceArcToNotFound | `45` | Referensbågen kan inte hittas till referens. |
| InlineFactMissContext | `46` | Inline Fact kan inte hitta sammanhang. |
| InlineFactMissUnit | `47` | Inline Fact kan inte hitta enhet. |
| InlineDuplicatedId | `48` | Inline Xbrl-dokument har duplicerat id. |
| InlineRelationshipMissFromRef | `49` | Inline relation kan inte hittas från ref. |
| InlineRelationshipMissToRef | `50` | Inline relation kan inte hitta till ref. |
| InlineRelationshipIllegalFromRef | `51` | Inline relation har olaglig från ref. |
| InlineRelationshipIllegalToRef | `52` | Inline relation har olaglig att ref. |
| InlineContinuationNotMatch | `53` | Inline Continuation har olagligt att matcha. |
| InlineFootnoteNotlang | `54` | Inline fotnot har inget språk. |
| InlineFractionIllegalChildElement | `55` | Inline Fraction har olagligt underordnat element. |
| InlineFractionIllegalAttrbuites | `56` | Inline Fraction har olagliga egenskaper. |
| InlineFractionIllegalAncestor | `57` | Inline fraktion har olaglig Ancestor. |
| InlineFractionTermNegative | `58` | Inline fraktion har term negativ. |
| InlineHeaderIllegalAncestor | `59` | Inline Fraction har olaglig tagg. |
| InlineHeaderDisplayNone | `60` | Inline header fader div nod har ingen stil av "display:none". |
| InlineHeaderIllegalChildElement | `61` | Inline header har mer än ett "dolt" element eller mer än ett "resurs"-element. |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction har olaglig Ancestor. |
| InlineNonFractionIllegalChildElement | `63` | Inline nonFraction har olagligt Child Element. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction har olagliga egenskaper. |
| InlineNonFractionTermNegative | `65` | Inline nonFraction har term negativ. |
| InlineTupleIllegalChildElement | `66` | Inline tuppel har olagligt element. |
| InlineContinuationNoId | `67` | Elementet ix:continuation MÅSTE ha ett id-attribut.. |
| InlineContinuationIllegalAncestor | `68` | ix:fortsättningselementet FÅR INTE vara en avkomling av ett ix:hidden element. |
| InlineExcludeIllegalAncestor | `69` | Elementet ix:exclude MÅSTE vara en avkomling av minst en ix:fortsättning, ix:fotnot eller ix:nonNumeric element. |

### Se även

* namnutrymme [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* hopsättning [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
