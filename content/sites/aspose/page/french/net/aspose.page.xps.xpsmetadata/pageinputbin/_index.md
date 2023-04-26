---
title: Class PageInputBin
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.PageInputBin classe. Décrit le bac dentrée installé dans un périphérique ou la liste complète des bacs pris en charge pour un périphérique. Permet la spécification du bac dentrée sur une base par page. LeJobInputBin DocumentInputBin et PageInputBin les motsclés sont mutuellement exclusifs. Les deux ne doivent pas être spécifiés simultanément dans un document PrintTicket ou Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2030
url: /fr/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

Décrit le bac d'entrée installé dans un périphérique ou la liste complète des bacs pris en charge pour un périphérique. Permet la spécification du bac d'entrée sur une base par page. Le[`JobInputBin`](../jobinputbin/) ,[`DocumentInputBin`](../documentinputbin/) et `PageInputBin` les mots-clés sont mutuellement exclusifs. Les deux ne doivent pas être spécifiés simultanément dans un document PrintTicket ou Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chacun doit être un[`Feature`](../feature/) , un[`Option`](../option/) ou un[`Property`](../property/) instance. |

### Voir également

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


