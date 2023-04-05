---
title: Class JobPrimaryBannerSheet
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryBannerSheet classe. Décrit la page de garde à imprimer pour le travail. La feuille de bannière doit être sortie sur le default PageMediaSize et en utilisant la valeur par défautPageMediaType . La page de garde doit être isolée du reste du travail. Cela signifie que toutes les options de finition ou de traitement telles que JobDuplexAllDocumentsContiguously JobStapleAllDocuments  ouJobBindAllDocuments  ne doit pas inclure la feuille de bannière. La page de garde doit apparaître comme la première feuille du travail.
type: docs
weight: 1470
url: /fr/net/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class

Décrit la page de garde à imprimer pour le travail. La feuille de bannière doit être sortie sur le default [`PageMediaSize`](../pagemediasize/) et en utilisant la valeur par défaut[`PageMediaType`](../pagemediatype/) . La page de garde doit être isolée du reste du travail. Cela signifie que toutes les options de finition ou de traitement (telles que [`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/) ,[`JobStapleAllDocuments`](../jobstaplealldocuments/) , ou[`JobBindAllDocuments`](../jobbindalldocuments/) ) ne doit pas inclure la feuille de bannière. La page de garde doit apparaître comme la première feuille du travail.

```csharp
public sealed class JobPrimaryBannerSheet : Feature, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [JobPrimaryBannerSheet](jobprimarybannersheet/)(params BannerSheetOption[]) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chacun doit être un[`Feature`](../feature/) , un[`Option`](../option/) ou un[`Property`](../property/) instance. |

## Autres membres

| Nom | La description |
| --- | --- |
| class [BannerSheetOption](jobprimarybannersheet.bannersheetoption/) | Représente les options du`JobPrimaryBannerSheet` fonctionnalité. |

### Voir également

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


