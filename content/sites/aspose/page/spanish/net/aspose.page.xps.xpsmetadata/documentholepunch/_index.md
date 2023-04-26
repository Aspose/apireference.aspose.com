---
title: Class DocumentHolePunch
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentHolePunch clase. Describe las características de perforación de agujeros de la salida. Cada documento se perfora por separado. ElJobHolePunch yDocumentHolePunch las palabras clave se excluyen mutuamente. Ambas no deben especificarse simultáneamente en un documento PrintTicket o Print Capabilities. https//docs.microsoft.com/enus/windows/win32/printdocs/documentholepunch
type: docs
weight: 710
url: /es/net/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class

Describe las características de perforación de agujeros de la salida. Cada documento se perfora por separado. El[`JobHolePunch`](../jobholepunch/) y`DocumentHolePunch` las palabras clave se excluyen mutuamente. Ambas no deben especificarse simultáneamente en un documento PrintTicket o Print Capabilities. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch

```csharp
public sealed class DocumentHolePunch : HolePunch, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentHolePunch](documentholepunch/)(params HolePunchOption[]) | Crea una nueva instancia. |

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
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


