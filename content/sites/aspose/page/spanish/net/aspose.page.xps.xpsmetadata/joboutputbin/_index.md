---
title: Class JobOutputBin
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.JobOutputBin clase. Describe la bandeja de salida instalada en un dispositivo o la lista completa de bandejas admitidas para un dispositivo. LaJobOutputBin DocumentOutputBin yPageOutputBin Las palabras clave son mutuamente excluyentes solo una debe especificarse en un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/jooutputbin
type: docs
weight: 1430
url: /es/net/aspose.page.xps.xpsmetadata/joboutputbin/
---
## JobOutputBin class

Describe la bandeja de salida instalada en un dispositivo o la lista completa de bandejas admitidas para un dispositivo. La`JobOutputBin` ,[`DocumentOutputBin`](../documentoutputbin/) y[`PageOutputBin`](../pageoutputbin/) Las palabras clave son mutuamente excluyentes, solo una debe especificarse en un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/jooutputbin

```csharp
public sealed class JobOutputBin : OutputBin, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [JobOutputBin](joboutputbin/)(params IOutputBinItem[]) | Crea una nueva instancia. |

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
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


