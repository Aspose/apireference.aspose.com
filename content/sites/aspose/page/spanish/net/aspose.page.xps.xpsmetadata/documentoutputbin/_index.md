---
title: Class DocumentOutputBin
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin clase. Describe la lista completa de contenedores admitidos para el dispositivo. Permite la especificación de output bin por documento. ElJobOutputBin DocumentOutputBin y PageOutputBin las palabras clave son mutuamente excluyentes solo se debe especificar una en un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 760
url: /es/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

Describe la lista completa de contenedores admitidos para el dispositivo. Permite la especificación de output bin por documento. El[`JobOutputBin`](../joboutputbin/) ,`DocumentOutputBin` y [`PageOutputBin`](../pageoutputbin/) las palabras clave son mutuamente excluyentes, solo se debe especificar una en un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | Crea una nueva instancia. |

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
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


