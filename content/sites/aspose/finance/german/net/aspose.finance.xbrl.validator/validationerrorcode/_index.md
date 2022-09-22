---
title: ValidationErrorCode
second_title: Aspose.Finance für .NET-API-Referenz
description: Validierungsfehlercode enum.
type: docs
weight: 8160
url: /de/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Validierungsfehlercode enum.

```csharp
public enum ValidationErrorCode
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | SchemaRef type MUSS vorkommen und MUSS den festen Inhalt "simple" haben. |
| SchemaRefNoHref | `1` | SchemaRef MUSS ein href-Attribut haben. |
| ContextNoId | `2` | Kontext-ID MUSS das ID-Attribut enthalten. |
| ContextNoEntity | `3` | Das Element entity ist erforderlicher Inhalt des Elements context. |
| ContextEntityNoIdentifier | `4` | Das Entitätselement MUSS ein Identifikatorelement enthalten |
| ContextPeriodNoStartTime | `5` | Kontextzeitraumtyp ist Dauer, hat aber kein Startdatum. |
| ContextPeriodNoEndTime | `6` | Kontextzeitraumtyp ist Dauer, hat aber kein Enddatum. |
| ContextPeriodStartAfterEnd | `7` | Kontextzeitraumtyp ist Dauer, aber Enddatum liegt vor Startdatum. |
| ContextInstantNoTime | `8` | Der Kontextzeitraumtyp ist sofortig, hat aber kein sofortiges Datum. |
| ContextScenarioXbrlNamespace | `9` | Kontextszenario darf keinen xbrl-Namespace-Knoten haben. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Kontextszenario kann kein Element in der Substitutionsgruppe für Elemente haben, die im xbrl-Namespace definiert sind. |
| ContextScenarioEmpty | `11` | Kontextszenario darf nicht leer sein" |
| ContextSegmentXbrlNamespace | `12` | Kontextsegment darf keinen xbrl-Namespace-Knoten haben. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Kontextsegment darf kein Element in der Substitutionsgruppe für Elemente enthalten, die im xbrl-Namespace definiert sind. |
| ContextSegmentEmpty | `14` | Kontextsegment darf nicht leer sein |
| ItemNoContext | `15` | Artikel muss einen Kontext haben. |
| ItemPeroidTypeConflictWithContext | `16` | Artikel hat Periodentypkonflikt mit Kontext. |
| ItemNumericNoUnit | `17` | Artikel ist numerisch und muss eine Einheit haben. |
| MonetaryItemNoSingleUnitMeasure | `18` | Artikel ist monetär und muss eine einzige Maßeinheit haben. |
| MonetaryItemNoISO4217 | `19` | Der Artikel ist ein Geldtyp und muss eine Maßeinheit im Stil von Iso 4217 haben. |
| ShareItemNoSingleUnitMeasure | `20` | Artikel ist Aktientyp und muss eine einzelne Maßeinheit haben. |
| ShareItemNoShareUnitMeasure | `21` | Der Artikel ist vom Typ „Share“ und muss eine xbrli:shares-Maßeinheit haben. |
| NillItemWithPrecisionOrDecimals | `22` | Artikel ist null und darf weder Genauigkeit noch Dezimalstellen haben. |
| FractionItemWithPrecisionOrDecimals | `23` | Das Element ist ein Bruchtyp und darf weder Genauigkeit noch Dezimalstellen haben. |
| NumericItemWithBothPrecisionAndDecimals | `24` | Das Element ist ein numerischer Typ und darf nicht sowohl Genauigkeit als auch Dezimalstellen aufweisen. |
| NumericItemWithoutPrecisionOrDecimals | `25` | Das Element ist ein numerischer Typ und muss entweder eine Genauigkeit oder Dezimalstellen haben. |
| NonNumericItemWithPrecisionOrDecimals | `26` | Das Element ist kein numerischer Typ und darf weder Genauigkeit noch Dezimalstellen haben. |
| FootnoteArcFromNotFound | `27` | Fußnotenbogen kann von Loc. nicht gefunden werden |
| FootnoteArcToNotFound | `28` | Fußnotenbogen kann Fußnote nicht finden. |
| DefinitionArcFromNotFound | `29` | Definitionsbogen kann von Loc. nicht gefunden werden |
| DefinitionArcToNotFound | `30` | Definitionsbogen kann Loc. nicht finden |
| EssenceAliasDefinitionArcDifferentType | `31` | Essenz-Alias-Definitionsbogen hat verschiedene Typen. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Essence-Alias-Definitionsbogen hat verschiedene periodTypes. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Essenz-Alias-Definitionsbogen hat unterschiedliche Balancen. |
| CalculationArcFromNotFound | `34` | Berechnungsbogen kann von Loc. nicht gefunden werden |
| CalculationArcToNotFound | `35` | Berechnungsbogen kann Loc. nicht finden |
| CalculationArcZeroWeight | `36` | Berechnungsbogen hat Nullgewicht. |
| CalculationArcSummationItemNonNumeric | `37` | Summenelementberechnungsbogen hat ein nicht numerisches Konzept. |
| CalculationArcIllegalBalancecWeight | `38` | Summenelementberechnungsbogen hat ein nicht numerisches Konzept. |
| LabelArcFromNotFound | `39` | Label-Bogen kann von Loc. nicht gefunden werden |
| LabelArcToNotFound | `40` | Label arc kann Label nicht finden. |
| PresentationArcFromNotFound | `41` | Präsentationsbogen kann von Loc. nicht gefunden werden |
| PresentationArcToNotFound | `42` | Präsentationsbogen kann Loc. nicht finden |
| PresentationArcPreferredLabelNotFound | `43` | Präsentationsbogen kann PreferredLabel nicht finden. |
| ReferenceArcFromNotFound | `44` | Referenzbogen kann von Loc. nicht gefunden werden |
| ReferenceArcToNotFound | `45` | Referenzbogen kann Referenz nicht finden. |
| InlineFactMissContext | `46` | Inline Fact kann Kontext nicht finden. |
| InlineFactMissUnit | `47` | Inline Fact kann Einheit nicht finden. |
| InlineDuplicatedId | `48` | Inline-Xbrl-Dokument hat ID. dupliziert |
| InlineRelationshipMissFromRef | `49` | Inline-Beziehung kann von ref. nicht gefunden werden |
| InlineRelationshipMissToRef | `50` | Inline-Beziehung kann ref. nicht finden |
| InlineRelationshipIllegalFromRef | `51` | Inline-Beziehung ist illegal von ref. |
| InlineRelationshipIllegalToRef | `52` | Inline-Beziehung zu ref. ist unzulässig |
| InlineContinuationNotMatch | `53` | Die Inline-Fortsetzung hat eine ungültige Übereinstimmung. |
| InlineFootnoteNotlang | `54` | Inline-Fußnote hat keine Sprache. |
| InlineFractionIllegalChildElement | `55` | Inline-Bruch hat unzulässiges untergeordnetes Element. |
| InlineFractionIllegalAttrbuites | `56` | Inline-Bruch hat unzulässige Attribute. |
| InlineFractionIllegalAncestor | `57` | Inline-Bruch hat illegalen Vorfahren. |
| InlineFractionTermNegative | `58` | Inline-Bruch hat Term negativ. |
| InlineHeaderIllegalAncestor | `59` | Inline-Bruch hat unzulässiges Tag. |
| InlineHeaderDisplayNone | `60` | Inline-Header-Vater-Div-Knoten hat keinen Stil von "display:none". |
| InlineHeaderIllegalChildElement | `61` | Inline-Header hat mehr als ein „verstecktes“ Element oder mehr als ein „Ressourcen“-Element. |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction hat illegalen Vorfahren. |
| InlineNonFractionIllegalChildElement | `63` | Inline nonFraction hat illegales untergeordnetes Element. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction hat illegale Eigenschaften. |
| InlineNonFractionTermNegative | `65` | Inline nonFraction hat einen negativen Begriff. |
| InlineTupleIllegalChildElement | `66` | Inline-Tupel enthält unzulässiges Element. |
| InlineContinuationNoId | `67` | Das ix:continuation-Element MUSS ein id-Attribut haben.. |
| InlineContinuationIllegalAncestor | `68` | Das ix:continuation-Element DARF KEIN Nachkomme eines ix:hidden-Elements sein. |
| InlineExcludeIllegalAncestor | `69` | Das ix:exclude-Element MUSS ein Nachkomme von mindestens einem ix:continuation-, ix:footnote- oder ix:nonNumeric-Element sein. |

### Siehe auch

* namensraum [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* Montage [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
