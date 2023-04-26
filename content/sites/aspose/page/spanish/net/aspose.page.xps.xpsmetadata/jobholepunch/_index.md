---
title: Class JobHolePunch
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.JobHolePunch clase. Describe las características de perforación de agujeros de la salida. Todos los documentos se perforan juntos. ElJobHolePunch yDocumentHolePunchlas palabras clave son mutuamente excluyentes. Ambas no deben especificarse simultáneamente en un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/jobholepunch
type: docs
weight: 1360
url: /es/net/aspose.page.xps.xpsmetadata/jobholepunch/
---
## JobHolePunch class

Describe las características de perforación de agujeros de la salida. Todos los documentos se perforan juntos. El`JobHolePunch` y[`DocumentHolePunch`](../documentholepunch/)las palabras clave son mutuamente excluyentes. Ambas no deben especificarse simultáneamente en un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobholepunch

```csharp
public sealed class JobHolePunch : HolePunch, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [JobHolePunch](jobholepunch/)(params HolePunchOption[]) | Crea una nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un[`Feature`](../feature/) , un[`Option`](../option/) o un[`Property`](../property/) instancia. |

### Ver también

* class [HolePunch](../holepunch/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


