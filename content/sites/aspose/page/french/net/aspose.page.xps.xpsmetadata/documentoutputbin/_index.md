---
title: Class DocumentOutputBin
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin classe. Décrit la liste complète des bacs pris en charge pour le périphérique. Permet la spécification de output bin par document. LeJobOutputBin DocumentOutputBin et PageOutputBin les motsclés sexcluent mutuellement un seul doit être spécifié dans un document PrintTicket ou Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 760
url: /fr/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

Décrit la liste complète des bacs pris en charge pour le périphérique. Permet la spécification de output bin par document. Le[`JobOutputBin`](../joboutputbin/) ,`DocumentOutputBin` et [`PageOutputBin`](../pageoutputbin/) les mots-clés s'excluent mutuellement, un seul doit être spécifié dans un document PrintTicket ou Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | Crée une nouvelle instance. |

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
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


