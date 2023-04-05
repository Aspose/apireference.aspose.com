---
title: Class DocumentPageRanges
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentPageRanges clase. Describe el rango de salida del documento en páginas. El valor del parámetro debe ajustarse a la siguiente estructura  PageRangeText PageRange o PageRangePageRange  PageRange PageNumber o PageNumberPageNumber  PageNumber 1 a N donde N es el número de páginas en el documento. Si PageNumber  N entonces PageNumber  N. Se deben ignorar los espacios en blanco en la cadena. https//docs.microsoft.com/enus/windows/win32/printdocs/documentpageranges
type: docs
weight: 770
url: /es/net/aspose.page.xps.xpsmetadata/documentpageranges/
---
## DocumentPageRanges class

Describe el rango de salida del documento en páginas. El valor del parámetro debe ajustarse a la siguiente estructura: - PageRangeText: "PageRange" o "PageRange,PageRange" - PageRange: "PageNumber" o "PageNumber-PageNumber" - PageNumber: 1 a N, donde N es el número de páginas en el documento. Si PageNumber &gt; N, entonces PageNumber = N. Se deben ignorar los espacios en blanco en la cadena. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges

```csharp
public sealed class DocumentPageRanges : StringParameterInit, IDocumentPrintTicketItem, 
    IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentPageRanges](documentpageranges/)(string) | Crea una nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [MaxLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/maxlength/) { get; } | Para valores de cadena, define la cadena más larga permitida. |
| virtual [MinLength](../../aspose.page.xps.xpsmetadata/stringparameterinit/minlength/) { get; } | Para valores de cadena, define la cadena más corta permitida. |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

### Ver también

* class [StringParameterInit](../stringparameterinit/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


