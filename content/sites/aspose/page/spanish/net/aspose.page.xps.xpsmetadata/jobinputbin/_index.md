---
title: Class JobInputBin
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.JobInputBin clase. Describe el contenedor de entrada instalado en un dispositivo o la lista completa de contenedores admitidos para un dispositivo. Permite la especificación del contenedor de entrada por trabajo. ElJobInputBin DocumentInputBin  yPageInputBin las palabras clave son mutuamente excluyentes. Ambos no deben especificarse simultáneamente en un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/jobinputbin
type: docs
weight: 1380
url: /es/net/aspose.page.xps.xpsmetadata/jobinputbin/
---
## JobInputBin class

Describe el contenedor de entrada instalado en un dispositivo o la lista completa de contenedores admitidos para un dispositivo. Permite la especificación del contenedor de entrada por trabajo. El`JobInputBin` ,[`DocumentInputBin`](../documentinputbin/) , y[`PageInputBin`](../pageinputbin/) las palabras clave son mutuamente excluyentes. Ambos no deben especificarse simultáneamente en un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobinputbin

```csharp
public sealed class JobInputBin : InputBin, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [JobInputBin](jobinputbin/)(params IInputBinItem[]) | Crea una nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un[`Feature`](../feature/) , un[`Option`](../option/) o un[`Property`](../property/) instancia. |

### Ver también

* class [InputBin](../inputbin/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


