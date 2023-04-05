---
title: Class JobNUpAllDocumentsContiguously
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.JobNUpAllDocumentsContiguously classe. Décrit la sortie de plusieurs pages logiques vers une seule feuille physique. Tous les documents du job sont compilés ensemble de manière contiguë.JobNUpAllDocumentsContiguously etDocumentNUp sexcluent mutuellement. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots clés. https//docs.microsoft.com/enus/windows/win32/printdocs/jobnupalldocumentscontiguously
type: docs
weight: 1380
url: /fr/net/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class

Décrit la sortie de plusieurs pages logiques vers une seule feuille physique. Tous les documents du job sont compilés ensemble de manière contiguë.`JobNUpAllDocumentsContiguously` et[`DocumentNUp`](../documentnup/) s'excluent mutuellement. Il appartient au pilote de déterminer la gestion des contraintes entre ces mots clés. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously

```csharp
public sealed class JobNUpAllDocumentsContiguously : NUp, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [JobNUpAllDocumentsContiguously](jobnupalldocumentscontiguously/)(params INUpItem[]) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chacun doit être un[`Feature`](../feature/) , un[`Option`](../option/) ou un[`Property`](../property/) instance. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/addpagespersheetoption/)(int) | Ajoute et option avec un valeur de propriété notée. Spécifie le nombre de pages logiques par feuille physique. |

### Voir également

* class [NUp](../nup/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


