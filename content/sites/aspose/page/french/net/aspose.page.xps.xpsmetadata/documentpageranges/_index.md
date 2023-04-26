---
title: Class DocumentPageRanges
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges classe. Décrit la plage de sortie du document en pages. La valeur du paramètre doit respecter la structure suivante   PageRangeText  PageRange ou PageRangePageRange  PageRange  PageNumber ou PageNumberPageNumber  PageNumber  1 à N où N est le nombre de pages dans le document. Si PageNumber  N alors PageNumber  N. Les espaces blancs dans la chaîne doivent être ignorés. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 780
url: /fr/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

Décrit la plage de sortie du document en pages. La valeur du paramètre doit respecter la structure suivante : - PageRangeText : "PageRange" ou "PageRange,PageRange" - PageRange : "PageNumber" ou "PageNumber-PageNumber" - PageNumber : 1 à N, où N est le nombre de pages dans le document. Si PageNumber &gt; N, alors PageNumber = N. Les espaces blancs dans la chaîne doivent être ignorés. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | Pour les valeurs de chaîne, définit la chaîne autorisée la plus longue. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | Pour les valeurs de chaîne, définit la chaîne autorisée la plus courte. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

### Voir également

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


