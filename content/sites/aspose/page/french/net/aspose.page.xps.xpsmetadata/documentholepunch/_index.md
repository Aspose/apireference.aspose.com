---
title: Class DocumentHolePunch
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentHolePunch classe. Décrit les caractéristiques de perforation de la sortie. Chaque document est perforé séparément. LeJobHolePunch etDocumentHolePunch les motsclés sexcluent mutuellement. Les deux ne doivent pas être spécifiés simultanément dans un document PrintTicket ou Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentholepunch
type: docs
weight: 700
url: /fr/net/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class

Décrit les caractéristiques de perforation de la sortie. Chaque document est perforé séparément. Le[`JobHolePunch`](../jobholepunch/) et`DocumentHolePunch` les mots-clés s'excluent mutuellement. Les deux ne doivent pas être spécifiés simultanément dans un document PrintTicket ou Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch

```csharp
public sealed class DocumentHolePunch : HolePunch, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [DocumentHolePunch](documentholepunch/)(params HolePunchOption[]) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette fonctionnalité. Chacun doit être un[`Feature`](../feature/) , un[`Option`](../option/) ou un[`Property`](../property/) instance. |

### Voir également

* class [HolePunch](../holepunch/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


