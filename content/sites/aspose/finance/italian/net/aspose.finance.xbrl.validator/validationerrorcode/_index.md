---
title: ValidationErrorCode
second_title: Aspose.Finance per .NET API Reference
description: Codice errore di convalida enum.
type: docs
weight: 8160
url: /it/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Codice errore di convalida enum.

```csharp
public enum ValidationErrorCode
```

### I valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | Il tipo SchemaRef DEVE verificarsi e DEVE avere il contenuto fisso "semplice". |
| SchemaRefNoHref | `1` | SchemaRef DEVE avere un attributo href. |
| ContextNoId | `2` | L'ID contesto DEVE includere l'attributo id. |
| ContextNoEntity | `3` | L'elemento entità è contenuto obbligatorio dell'elemento contesto. |
| ContextEntityNoIdentifier | `4` | L'elemento entità DEVE contenere un elemento identificativo |
| ContextPeriodNoStartTime | `5` | Il tipo di periodo di contesto è la durata, ma non ha una data di inizio. |
| ContextPeriodNoEndTime | `6` | Il tipo di periodo di contesto è la durata, ma non ha una data di fine. |
| ContextPeriodStartAfterEnd | `7` | Il tipo di periodo di contesto è la durata, ma la data di fine è precedente alla data di inizio. |
| ContextInstantNoTime | `8` | Il tipo di periodo di contesto è istantaneo, ma non ha una data istantanea. |
| ContextScenarioXbrlNamespace | `9` | Lo scenario contestuale non può avere il nodo dello spazio dei nomi xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Lo scenario di contesto non può avere un elemento nel gruppo di sostituzione per gli elementi definiti nello spazio dei nomi xbrl. |
| ContextScenarioEmpty | `11` | Lo scenario contestuale non può essere vuoto" |
| ContextSegmentXbrlNamespace | `12` | Il segmento di contesto non può avere il nodo dello spazio dei nomi xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Il segmento Context non può avere un elemento nel gruppo di sostituzione per gli elementi definiti nello spazio dei nomi xbrl. |
| ContextSegmentEmpty | `14` | Il segmento di contesto non può essere vuoto |
| ItemNoContext | `15` | L'elemento deve avere un contesto. |
| ItemPeroidTypeConflictWithContext | `16` | L'elemento presenta un conflitto di tipo periodo con il contesto. |
| ItemNumericNoUnit | `17` | L'elemento è numerico e deve avere un'unità. |
| MonetaryItemNoSingleUnitMeasure | `18` | L'articolo è di tipo monetario e deve avere una singola unità di misura. |
| MonetaryItemNoISO4217 | `19` | L'articolo è di tipo monetario e deve avere un'unità di misura di stile Iso 4217. |
| ShareItemNoSingleUnitMeasure | `20` | L'elemento è di tipo condivisione e deve avere una singola unità di misura. |
| ShareItemNoShareUnitMeasure | `21` | L'elemento è un tipo di condivisione e deve avere un'unità di misura xbrli:shares. |
| NillItemWithPrecisionOrDecimals | `22` | L'elemento è zero e non deve avere né precisione né decimali. |
| FractionItemWithPrecisionOrDecimals | `23` | L'elemento è di tipo frazione e non deve avere né precisione né decimali. |
| NumericItemWithBothPrecisionAndDecimals | `24` | L'elemento è di tipo numerico e non deve avere né la precisione né i decimali. |
| NumericItemWithoutPrecisionOrDecimals | `25` | L'elemento è di tipo numerico e deve avere precisione o decimali. |
| NonNumericItemWithPrecisionOrDecimals | `26` | L'elemento non è di tipo numerico e non deve avere né precisione né decimali. |
| FootnoteArcFromNotFound | `27` | Impossibile trovare l'arco della nota a piè di pagina da Loc. |
| FootnoteArcToNotFound | `28` | Impossibile trovare l'arco della nota a piè di pagina. |
| DefinitionArcFromNotFound | `29` | Impossibile trovare l'arco di definizione da Loc. |
| DefinitionArcToNotFound | `30` | Impossibile trovare l'arco di definizione in Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | Essence-alias Definizione arco ha diversi tipi. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | L'arco di definizione dell'alias essenza ha diversi tipi di periodo. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Essence-alias Definizione arco ha equilibri diversi. |
| CalculationArcFromNotFound | `34` | Impossibile trovare l'arco di calcolo da Loc. |
| CalculationArcToNotFound | `35` | Impossibile trovare l'arco di calcolo in Loc. |
| CalculationArcZeroWeight | `36` | L'arco di calcolo ha peso zero. |
| CalculationArcSummationItemNonNumeric | `37` | L'arco di calcolo dell'elemento sommatore ha un concetto non numerico. |
| CalculationArcIllegalBalancecWeight | `38` | L'arco di calcolo dell'elemento sommatore ha un concetto non numerico. |
| LabelArcFromNotFound | `39` | Impossibile trovare l'arco etichetta da Loc. |
| LabelArcToNotFound | `40` | Impossibile trovare l'arco etichetta in etichetta. |
| PresentationArcFromNotFound | `41` | Impossibile trovare l'arco di presentazione da Loc. |
| PresentationArcToNotFound | `42` | Impossibile trovare l'arco di presentazione in Loc. |
| PresentationArcPreferredLabelNotFound | `43` | Impossibile trovare l'arco di presentazione preferredLabel. |
| ReferenceArcFromNotFound | `44` | Impossibile trovare l'arco di riferimento da Loc. |
| ReferenceArcToNotFound | `45` | Impossibile trovare l'arco di riferimento in riferimento. |
| InlineFactMissContext | `46` | Inline Fact non riesce a trovare il contesto. |
| InlineFactMissUnit | `47` | Inline Fact non riesce a trovare l'unità. |
| InlineDuplicatedId | `48` | Il documento Xbrl in linea ha ID duplicato. |
| InlineRelationshipMissFromRef | `49` | Impossibile trovare la relazione in linea da ref. |
| InlineRelationshipMissToRef | `50` | Impossibile trovare la relazione in linea con il rif. |
| InlineRelationshipIllegalFromRef | `51` | La relazione in linea è illegale da ref. |
| InlineRelationshipIllegalToRef | `52` | La relazione in linea è illegale per rif. |
| InlineContinuationNotMatch | `53` | La continuazione in linea ha una corrispondenza illegale. |
| InlineFootnoteNotlang | `54` | Nota a piè di pagina in linea non ha lang. |
| InlineFractionIllegalChildElement | `55` | La frazione in linea ha un elemento figlio illegale. |
| InlineFractionIllegalAttrbuites | `56` | La frazione in linea ha attributi illegali. |
| InlineFractionIllegalAncestor | `57` | La frazione in linea ha Antenato illegale. |
| InlineFractionTermNegative | `58` | La frazione in linea ha un termine negativo. |
| InlineHeaderIllegalAncestor | `59` | La frazione in linea ha un tag illegale. |
| InlineHeaderDisplayNone | `60` | Il nodo div padre dell'intestazione inline non ha lo stile "display:none". |
| InlineHeaderIllegalChildElement | `61` | L'intestazione in linea ha più di un elemento "nascosto" o più di un elemento "risorse". |
| InlineNonFractionIllegalAncestor | `62` | Inline nonFraction ha Antenato illegale. |
| InlineNonFractionIllegalChildElement | `63` | Inline nonFraction ha un elemento figlio illegale. |
| InlineNonFractionIllegalProperties | `64` | Inline nonFraction ha proprietà illegali. |
| InlineNonFractionTermNegative | `65` | Inline nonFraction ha un termine negativo. |
| InlineTupleIllegalChildElement | `66` | La tupla inline ha un elemento illegale. |
| InlineContinuationNoId | `67` | L'elemento ix:continuation DEVE avere un attributo id.. |
| InlineContinuationIllegalAncestor | `68` | L'elemento ix:continuation NON DEVE essere un discendente di un elemento ix:hidden. |
| InlineExcludeIllegalAncestor | `69` | L'elemento ix:exclude DEVE essere un discendente di almeno un elemento ix:continuation, ix:footnote o ix:nonNumeric. |

### Guarda anche

* spazio dei nomi [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* assemblea [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
