---
title: Enum ValidationErrorCode
second_title: Aspose.Finance voor .NET API-referentie
description: Aspose.Finance.Xbrl.Validator.ValidationErrorCode opsomming. Validatie foutcode enum.
type: docs
weight: 8210
url: /nl/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Validatie foutcode enum.

```csharp
public enum ValidationErrorCode
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | Type SchemaRef MOET voorkomen en MOET de vaste inhoud "eenvoudig" hebben. |
| SchemaRefNoHref | `1` | SchemaRef MOET een href-attribuut hebben. |
| ContextNoId | `2` | Context id MOET het id attribuut bevatten. |
| ContextNoEntity | `3` | Het entiteitselement is de vereiste inhoud van het contextelement. |
| ContextEntityNoIdentifier | `4` | Het entiteitselement MOET een identificatie-element bevatten |
| ContextPeriodNoStartTime | `5` | Context peroïde type is duur, maar heeft geen startdatum. |
| ContextPeriodNoEndTime | `6` | Context peroïde type is duur, maar heeft geen einddatum. |
| ContextPeriodStartAfterEnd | `7` | Type contextperoid is duur, maar einddatum ligt voor startdatum. |
| ContextInstantNoTime | `8` | Type context peroid is instant, maar heeft geen instant date. |
| ContextScenarioXbrlNamespace | `9` | Contextscenario kan geen xbrl-naamruimteknooppunt hebben. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Contextscenario kan geen element in de vervangingsgroep hebben voor elementen die zijn gedefinieerd in de xbrl-naamruimte. |
| ContextScenarioEmpty | `11` | Contextscenario mag niet leeg zijn" |
| ContextSegmentXbrlNamespace | `12` | Contextsegment kan geen xbrl-naamruimteknooppunt hebben. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Contextsegment kan geen element in de vervangingsgroep hebben voor elementen die zijn gedefinieerd in de xbrl-naamruimte. |
| ContextSegmentEmpty | `14` | Contextsegment mag niet leeg zijn |
| ItemNoContext | `15` | Item moet een context hebben. |
| ItemPeroidTypeConflictWithContext | `16` | Item heeft een periodetypeconflict met context. |
| ItemNumericNoUnit | `17` | Item is numeriek en moet een eenheid hebben. |
| MonetaryItemNoSingleUnitMeasure | `18` | Artikel is van het monetaire type en moet een enkele maateenheid hebben. |
| MonetaryItemNoISO4217 | `19` | Artikel is van het monetaire type en moet een maateenheid in Iso 4217-stijl hebben. |
| ShareItemNoSingleUnitMeasure | `20` | Item is van het type share en moet een enkele maateenheid hebben. |
| ShareItemNoShareUnitMeasure | `21` | Item is van het type share en moet een eenheidsmaat xbrli:shares hebben. |
| NillItemWithPrecisionOrDecimals | `22` | Item is nul en mag geen precisie of decimalen hebben. |
| FractionItemWithPrecisionOrDecimals | `23` | Item is van het breuktype en mag geen precisie of decimalen hebben. |
| NumericItemWithBothPrecisionAndDecimals | `24` | Item is van het numerieke type en mag niet zowel precisie als decimalen hebben. |
| NumericItemWithoutPrecisionOrDecimals | `25` | Item is van het numerieke type en moet precisie of decimalen hebben. |
| NonNumericItemWithPrecisionOrDecimals | `26` | Item is geen numeriek type en mag geen precisie of decimalen hebben. |
| FootnoteArcFromNotFound | `27` | Voetnootboog kan niet worden gevonden vanaf Loc. |
| FootnoteArcToNotFound | `28` | Voetnootboog kan voetnoot niet vinden. |
| DefinitionArcFromNotFound | `29` | Definitie boog kan niet worden gevonden vanaf Loc. |
| DefinitionArcToNotFound | `30` | Definitie arc kan Loc. niet vinden |
| EssenceAliasDefinitionArcDifferentType | `31` | Essentie-alias Definitieboog heeft verschillende typen. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Essence-alias Definitie arc heeft verschillende periodTypes. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Essentie-alias Definitie boog heeft verschillende balansen. |
| CalculationArcFromNotFound | `34` | Berekeningsboog kan niet worden gevonden vanaf Loc. |
| CalculationArcToNotFound | `35` | Berekeningsboog kan Loc. niet vinden |
| CalculationArcZeroWeight | `36` | Berekeningsboog heeft geen gewicht. |
| CalculationArcSummationItemNonNumeric | `37` | Sommatie-itemberekeningsboog heeft een niet-numeriek concept. |
| CalculationArcIllegalBalancecWeight | `38` | Sommatie-itemberekeningsboog heeft een niet-numeriek concept. |
| LabelArcFromNotFound | `39` | Labelarc kan niet vinden vanaf Loc. |
| LabelArcToNotFound | `40` | Label arc kan Label. niet vinden |
| PresentationArcFromNotFound | `41` | Presentatieboog kan niet worden gevonden vanaf Loc. |
| PresentationArcToNotFound | `42` | Presentatieboog kan Loc. niet vinden |
| PresentationArcPreferredLabelNotFound | `43` | Presentatieboog kan voorkeurslabel niet vinden. |
| ReferenceArcFromNotFound | `44` | Referentieboog kan niet worden gevonden vanaf Loc. |
| ReferenceArcToNotFound | `45` | Referentieboog kan referentie niet vinden. |
| InlineFactMissContext | `46` | Inline Fact kan geen context vinden. |
| InlineFactMissUnit | `47` | Inline Fact kan eenheid niet vinden. |
| InlineDuplicatedId | `48` | Inline Xbrl-document heeft dubbele id. |
| InlineRelationshipMissFromRef | `49` | Inline-relatie kan niet worden gevonden van ref. |
| InlineRelationshipMissToRef | `50` | Inline-relatie kan ref. niet vinden |
| InlineRelationshipIllegalFromRef | `51` | Inline-relatie is illegaal van ref. |
| InlineRelationshipIllegalToRef | `52` | Inline-relatie is illegaal om te ref. |
| InlineContinuationNotMatch | `53` | Inline voortzetting is illegaal om overeen te komen. |
| InlineFootnoteNotlang | `54` | Inline voetnoot heeft geen taal. |
| InlineFractionIllegalChildElement | `55` | Inline Fraction heeft een ongeldig onderliggend element. |
| InlineFractionIllegalAttrbuites | `56` | Inline Fraction heeft illegale attributen. |
| InlineFractionIllegalAncestor | `57` | Inline Fraction heeft een illegale voorouder. |
| InlineFractionTermNegative | `58` | Inline breuk heeft term negatief. |
| InlineHeaderIllegalAncestor | `59` | Inline Fraction heeft een ongeldige tag. |
| InlineHeaderDisplayNone | `60` | Inline header vader div node heeft geen stijl van "display:none". |
| InlineHeaderIllegalChildElement | `61` | Inline header heeft meer dan één "verborgen" element of meer dan één "resources"-element. |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction heeft illegale Ancestor. |
| InlineNonFractionIllegalChildElement | `63` | Inline nonFraction heeft een onwettig kindelement. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction heeft illegale eigenschappen. |
| InlineNonFractionTermNegative | `65` | Inline nonFraction heeft Term Negative. |
| InlineTupleIllegalChildElement | `66` | Inline-tuple heeft een ongeldig element. |
| InlineContinuationNoId | `67` | Het ix:continuation element MOET een id attribuut hebben.. |
| InlineContinuationIllegalAncestor | `68` | Het ix:continuation element MAG GEEN afstammeling zijn van een ix:hidden element. |
| InlineExcludeIllegalAncestor | `69` | Het ix:exclude-element MOET een afstammeling zijn van ten minste één ix:continuation-, ix:footnote- of ix:nonNumeric-element. |

### Zie ook

* naamruimte [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator/)
* montage [Aspose.Finance](../../)


