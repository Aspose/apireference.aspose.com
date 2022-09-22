---
title: ValidationErrorCode
second_title: Référence de l'API Aspose.Finance pour .NET
description: Énumération du code derreur de validation.
type: docs
weight: 8160
url: /fr/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Énumération du code d'erreur de validation.

```csharp
public enum ValidationErrorCode
```

### Valeurs

| Nom | Évaluer | La description |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | Le type SchemaRef DOIT apparaître et DOIT avoir le contenu fixe "simple". |
| SchemaRefNoHref | `1` | SchemaRef DOIT avoir un attribut href. |
| ContextNoId | `2` | L'identifiant de contexte DOIT inclure l'attribut id. |
| ContextNoEntity | `3` | L'élément d'entité est le contenu obligatoire de l'élément de contexte. |
| ContextEntityNoIdentifier | `4` | L'élément entité DOIT contenir un élément identifiant |
| ContextPeriodNoStartTime | `5` | Le type de période de contexte est la durée, mais n'a pas de date de début. |
| ContextPeriodNoEndTime | `6` | Le type de période de contexte est la durée, mais n'a pas de date de fin. |
| ContextPeriodStartAfterEnd | `7` | Le type de période de contexte est la durée, mais la date de fin est antérieure à la date de début. |
| ContextInstantNoTime | `8` | Le type de période de contexte est instantané, mais n'a pas de date instantanée. |
| ContextScenarioXbrlNamespace | `9` | Le scénario de contexte ne peut pas avoir de nœud d'espace de noms xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Le scénario de contexte ne peut pas avoir d'élément dans le groupe de substitution pour les éléments définis dans l'espace de noms xbrl. |
| ContextScenarioEmpty | `11` | Le scénario de contexte ne peut pas être vide " |
| ContextSegmentXbrlNamespace | `12` | Le segment de contexte ne peut pas avoir de nœud d'espace de noms xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Le segment de contexte ne peut pas avoir d'élément dans le groupe de substitution pour les éléments définis dans l'espace de noms xbrl. |
| ContextSegmentEmpty | `14` | Le segment de contexte ne peut pas être vide |
| ItemNoContext | `15` | L'élément doit avoir un contexte. |
| ItemPeroidTypeConflictWithContext | `16` | L'élément a un conflit de type de période avec le contexte. |
| ItemNumericNoUnit | `17` | L'élément est numérique et doit avoir une unité. |
| MonetaryItemNoSingleUnitMeasure | `18` | L'élément est de type monétaire et doit avoir une seule unité de mesure. |
| MonetaryItemNoISO4217 | `19` | L'article est de type monétaire et doit avoir une unité de mesure de style Iso 4217. |
| ShareItemNoSingleUnitMeasure | `20` | L'élément est de type partage et doit avoir une seule unité de mesure. |
| ShareItemNoShareUnitMeasure | `21` | L'élément est de type partage et doit avoir une unité de mesure xbrli:shares. |
| NillItemWithPrecisionOrDecimals | `22` | L'élément est nul et ne doit avoir ni précision ni décimales. |
| FractionItemWithPrecisionOrDecimals | `23` | L'élément est de type fraction et ne doit avoir ni précision ni décimales. |
| NumericItemWithBothPrecisionAndDecimals | `24` | L'élément est de type numérique et ne doit pas avoir à la fois de précision et de décimales. |
| NumericItemWithoutPrecisionOrDecimals | `25` | L'élément est de type numérique et doit avoir une précision ou des décimales. |
| NonNumericItemWithPrecisionOrDecimals | `26` | L'élément n'est pas de type numérique et ne doit avoir ni précision ni décimales. |
| FootnoteArcFromNotFound | `27` | Arc de note de bas de page introuvable à partir de Loc. |
| FootnoteArcToNotFound | `28` | L'arc de la note de bas de page ne peut pas être trouvé dans la note de bas de page. |
| DefinitionArcFromNotFound | `29` | Arc de définition introuvable à partir de Loc. |
| DefinitionArcToNotFound | `30` | Arc de définition introuvable à Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | L'arc de définition Essence-alias a différents types. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | L'arc de définition Essence-alias a différents periodTypes. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | L'arc de définition Essence-alias a des équilibres différents. |
| CalculationArcFromNotFound | `34` | Arc de calcul introuvable à partir de Loc. |
| CalculationArcToNotFound | `35` | Arc de calcul introuvable à Loc. |
| CalculationArcZeroWeight | `36` | L'arc de calcul a un poids nul. |
| CalculationArcSummationItemNonNumeric | `37` | L'arc de calcul de l'élément de sommation a un concept non numérique. |
| CalculationArcIllegalBalancecWeight | `38` | L'arc de calcul de l'élément de sommation a un concept non numérique. |
| LabelArcFromNotFound | `39` | Arc d'étiquette introuvable à partir de Loc. |
| LabelArcToNotFound | `40` | L'arc d'étiquette ne peut pas trouver l'étiquette. |
| PresentationArcFromNotFound | `41` | Arc de présentation introuvable à partir de Loc. |
| PresentationArcToNotFound | `42` | Arc de présentation introuvable à Loc. |
| PresentationArcPreferredLabelNotFound | `43` | L'arc de présentation ne trouve pas l'étiquette préférée. |
| ReferenceArcFromNotFound | `44` | Arc de référence introuvable à partir de Loc. |
| ReferenceArcToNotFound | `45` | L'arc de référence ne peut pas trouver la référence. |
| InlineFactMissContext | `46` | Inline Fact ne peut pas trouver le contexte. |
| InlineFactMissUnit | `47` | Inline Fact ne peut pas trouver l'unité. |
| InlineDuplicatedId | `48` | Le document Xbrl en ligne a un identifiant dupliqué. |
| InlineRelationshipMissFromRef | `49` | Impossible de trouver la relation en ligne à partir de la réf. |
| InlineRelationshipMissToRef | `50` | Impossible de trouver la relation en ligne à ref. |
| InlineRelationshipIllegalFromRef | `51` | La relation en ligne est illégale à partir de la réf. |
| InlineRelationshipIllegalToRef | `52` | La relation en ligne est illégale pour ref. |
| InlineContinuationNotMatch | `53` | Inline Continuation a une correspondance illégale. |
| InlineFootnoteNotlang | `54` | La note de bas de page intégrée n'a pas de langue. |
| InlineFractionIllegalChildElement | `55` | La fraction en ligne a un élément enfant illégal. |
| InlineFractionIllegalAttrbuites | `56` | La fraction en ligne a des attributs illégaux. |
| InlineFractionIllegalAncestor | `57` | La fraction en ligne a un ancêtre illégal. |
| InlineFractionTermNegative | `58` | La fraction en ligne a un terme négatif. |
| InlineHeaderIllegalAncestor | `59` | La fraction en ligne a une balise illégale. |
| InlineHeaderDisplayNone | `60` | Le nœud div père de l'en-tête en ligne n'a pas le style "display: none". |
| InlineHeaderIllegalChildElement | `61` | L'en-tête en ligne a plus d'un élément "caché" ou plus d'un élément "ressources". |
| InlineNonFractionIllegalAncestor | `62` | La non-fraction en ligne a un ancêtre illégal. |
| InlineNonFractionIllegalChildElement | `63` | La non-fraction en ligne a un élément enfant illégal. |
| InlineNonFractionIllegalProperties | `64` | La non-fraction en ligne a des propriétés illégales. |
| InlineNonFractionTermNegative | `65` | La non-fraction en ligne a un terme négatif. |
| InlineTupleIllegalChildElement | `66` | Le tuple en ligne a un élément illégal. |
| InlineContinuationNoId | `67` | L'élément ix:continuation DOIT avoir un attribut id.. |
| InlineContinuationIllegalAncestor | `68` | L'élément ix:continuation NE DOIT PAS être un descendant d'un élément ix:hidden. |
| InlineExcludeIllegalAncestor | `69` | L'élément ix:exclude DOIT être un descendant d'au moins un élément ix:continuation, ix:footnote ou ix:nonNumeric. |

### Voir également

* espace de noms [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator)
* Assemblée [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
