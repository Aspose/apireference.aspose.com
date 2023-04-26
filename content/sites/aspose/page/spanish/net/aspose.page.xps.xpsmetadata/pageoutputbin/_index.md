---
title: Class PageOutputBin
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin clase. Describe la lista completa de contenedores admitidos para el dispositivo. Permite la especificación de la bandeja de salida por página. ElJobOutputBin DocumentOutputBin yPageOutputBin las palabras clave son mutuamente excluyentes solo una debe especificarse en un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2330
url: /es/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

Describe la lista completa de contenedores admitidos para el dispositivo. Permite la especificación de la bandeja de salida por página. El[`JobOutputBin`](../joboutputbin/) ,[`DocumentOutputBin`](../documentoutputbin/) y`PageOutputBin` las palabras clave son mutuamente excluyentes, solo una debe especificarse en un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | Crea una nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un[`Feature`](../feature/) , un[`Option`](../option/) o un[`Property`](../property/) instancia. |

### Ver también

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


