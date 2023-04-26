---
title: Class DocumentCollate
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentCollate clase. Describe las características de clasificación de la salida. Se intercalan todas las páginas de cada documento individual. DocumentCollate y JobCollateAlldocuments se excluyen mutuamente. El comportamiento y la implementación de si se implementan ambas o solo una de estas palabras clave se deja al controlador. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcollate
type: docs
weight: 620
url: /es/net/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class

Describe las características de clasificación de la salida. Se intercalan todas las páginas de cada documento individual. DocumentCollate y JobCollateAlldocuments se excluyen mutuamente. El comportamiento y la implementación de si se implementan ambas o solo una de estas palabras clave se deja al controlador. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate

```csharp
public sealed class DocumentCollate : Collate, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentCollate](documentcollate/)(params CollateOption[]) |  |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un[`Feature`](../feature/) , un[`Option`](../option/) o un[`Property`](../property/) instancia. |

### Ver también

* class [Collate](../collate/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


