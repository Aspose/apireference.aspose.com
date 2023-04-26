---
title: Class DocumentDuplex
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentDuplex clase. Describe las características dúplex de la salida. La función dúplex permite la impresión de en ambos lados del material. Cada documento se duplica por separado. DocumentDuplex y JobDuplexAllDocumentsContiguously se excluyen mutuamente. Depende del controlador determinar el manejo de restricciones entre estas palabras clave. https//docs.microsoft.com/enus/windows/win32/printdocs/ documentoduplex
type: docs
weight: 700
url: /es/net/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class

Describe las características dúplex de la salida. La función dúplex permite la impresión de en ambos lados del material. Cada documento se duplica por separado. DocumentDuplex y JobDuplexAllDocumentsContiguously se excluyen mutuamente. Depende del controlador determinar el manejo de restricciones entre estas palabras clave. https://docs.microsoft.com/en-us/windows/win32/printdocs/ documentoduplex

```csharp
public sealed class DocumentDuplex : Duplex, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentDuplex](documentduplex/)(params DuplexOption[]) | Crea una nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un[`Feature`](../feature/) , un[`Option`](../option/) o un[`Property`](../property/) instancia. |

### Ver también

* class [Duplex](../duplex/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


