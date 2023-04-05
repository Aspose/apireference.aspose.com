---
title: Class DocumentCollate
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentCollate classe. Décrit les caractéristiques dassemblage de la sortie. Toutes les pages de chaque document individuel sont assemblées. DocumentCollate et JobCollateAlldocuments sexcluent mutuellement. Le comportement et limplémentation du fait que les deux ou un seul de ces motsclés soient implémentés sont laissés au pilote. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcollate
type: docs
weight: 610
url: /fr/net/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class

Décrit les caractéristiques d'assemblage de la sortie. Toutes les pages de chaque document individuel sont assemblées. DocumentCollate et JobCollateAlldocuments s'excluent mutuellement. Le comportement et l'implémentation du fait que les deux ou un seul de ces mots-clés soient implémentés sont laissés au pilote. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate

```csharp
public sealed class DocumentCollate : Collate, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [DocumentCollate](documentcollate/)(params CollateOption[]) |  |

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chacun doit être un[`Feature`](../feature/) , un[`Option`](../option/) ou un[`Property`](../property/) instance. |

### Voir également

* class [Collate](../collate/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


