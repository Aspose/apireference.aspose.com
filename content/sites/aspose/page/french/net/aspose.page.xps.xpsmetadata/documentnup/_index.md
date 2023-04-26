---
title: Class DocumentNUp
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp classe. Décrit la sortie et le format de plusieurs pages logiques sur une seule feuille physique. Chaque document est compilé séparément. etJobNUpAllDocumentsContiguously sexcluent mutuellement. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots clés. https//docs.microsoft.com/enus/windows/win32/printdocs/documentnup
type: docs
weight: 750
url: /fr/net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

Décrit la sortie et le format de plusieurs pages logiques sur une seule feuille physique. Chaque document est compilé séparément. et[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) s'excluent mutuellement. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots clés. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup

```csharp
DocumentNUp
```

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chacun doit être un[`Feature`](../feature/) , un[`Option`](../option/) ou un[`Property`](../property/) instance. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | Ajoute et option avec un valeur de propriété notée. Spécifie le nombre de pages logiques par feuille physique. |

### Voir également

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


