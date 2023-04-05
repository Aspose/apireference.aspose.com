---
title: Class DocumentBinding
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentBinding classe. Décrit la méthode de liaison. Chaque document est lié séparément. DocumentBinding et JobBindAllDocuments sexcluent mutuellement. Il appartient au pilote de déterminer la gestion des contraintes entre les mots clés. https//docs.microsoft.com/enus/windows/win32/printdocs/documentbinding
type: docs
weight: 560
url: /fr/net/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class

Décrit la méthode de liaison. Chaque document est lié séparément. DocumentBinding et JobBindAllDocuments s'excluent mutuellement. Il appartient au pilote de déterminer la gestion des contraintes entre les mots clés. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding

```csharp
public sealed class DocumentBinding : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [DocumentBinding](documentbinding/)(params BindingOption[]) | Crée une nouvelle instance. |

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
| class [BindingGutter](documentbinding.bindinggutter/) | Décrit la façon de spécifier le valeur de propriété notée, que ce soit par une valeur entière ou par la référence à la paramètre. |
| class [BindingOption](documentbinding.bindingoption/) | Représente les options du`DocumentBinding` fonctionnalité. |
| interface [IBindingOptionItem](documentbinding.ibindingoptionitem/) | L'interface de tout[`BindingOption`](../documentbinding.bindingoption/) article. |

### Voir également

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


