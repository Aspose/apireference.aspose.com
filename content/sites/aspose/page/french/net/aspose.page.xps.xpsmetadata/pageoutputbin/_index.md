---
title: Class PageOutputBin
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin classe. Décrit la liste complète des bacs pris en charge pour le périphérique. Permet de spécifier le bac de sortie page par page. LeJobOutputBin DocumentOutputBin etPageOutputBin les motsclés sont mutuellement exclusifs un seul doit être spécifié dans un document PrintTicket ou Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2320
url: /fr/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Décrit la liste complète des bacs pris en charge pour le périphérique. Permet de spécifier le bac de sortie page par page. Le[`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) et`PageOutputBin` les mots-clés sont mutuellement exclusifs, un seul doit être spécifié dans un document PrintTicket ou Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chacun doit être un[`Feature`](../feature/) , un[`Option`](../option/) ou un[`Property`](../property/) instance. |

### Voir également

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


