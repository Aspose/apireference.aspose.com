---
title: Class DocumentCoverBack
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentCoverBack clase. Describe la portada posterior final. Cada documento tendrá una hoja separada. La portada debe estar impresa en elPageMediaSize yPageMediaType utilizado para la página final del documento. La portada debe integrarse en las opciones de procesamiento comoDocumentDuplex DocumentNUp  como lo indica la opción especificada. https//docs.microsoft.com/enus/windows/win32/printdocs/documentcoverback
type: docs
weight: 630
url: /es/net/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class

Describe la portada posterior (final). Cada documento tendrá una hoja separada. La portada debe estar impresa en el[`PageMediaSize`](../pagemediasize/) y[`PageMediaType`](../pagemediatype/) utilizado para la página final del documento. La portada debe integrarse en las opciones de procesamiento (como[`DocumentDuplex`](../documentduplex/) ,[`DocumentNUp`](../documentnup/) ) como lo indica la opción especificada. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback

```csharp
public sealed class DocumentCoverBack : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentCoverBack](documentcoverback/)(params CoverBackOption[]) | Crea una nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un[`Feature`](../feature/) , un[`Option`](../option/) o un[`Property`](../property/) instancia. |

## Otros miembros

| Nombre | Descripción |
| --- | --- |
| class [CoverBackOption](documentcoverback.coverbackoption/) | Describe el`DocumentCoverBack` opciones de funciones. |

### Ver también

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


