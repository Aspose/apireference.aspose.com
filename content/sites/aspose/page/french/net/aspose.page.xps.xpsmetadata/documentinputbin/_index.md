---
title: Class DocumentInputBin
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin classe. Décrit le bac dentrée installé dans un périphérique ou la liste complète des bacs pris en charge pour un périphérique. LeJobInputBin DocumentInputBin  etPageInputBin Les motsclés sexcluent mutuellement. Les deux ne doivent pas être spécifiés simultanément dans un document PrintTicket ou Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 740
url: /fr/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Décrit le bac d'entrée installé dans un périphérique ou la liste complète des bacs pris en charge pour un périphérique. Le[`JobInputBin`](../jobinputbin/) ,`DocumentInputBin` , et[`PageInputBin`](../pageinputbin/) Les mots-clés s'excluent mutuellement. Les deux ne doivent pas être spécifiés simultanément dans un document PrintTicket ou Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Crée une nouvelle instance. |

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
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


