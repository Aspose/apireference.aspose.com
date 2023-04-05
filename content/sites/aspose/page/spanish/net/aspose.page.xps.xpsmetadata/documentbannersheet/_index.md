---
title: Class DocumentBannerSheet
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet clase. Describe la portada que se imprimirá para un documento en particular. La portada debe salir en default PageMediaSize y usando el valor predeterminadoPageMediaType . La portada debe también estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento como DocumentDuplex DocumentStaple  oDocumentBinding no debe incluir la portada. La portada puede o no estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento del trabajo puede incluir la portada del documento. La portada debe aparecer como la primera hoja del documento. https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 530
url: /es/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

Describe la portada que se imprimirá para un documento en particular. La portada debe salir en default [`PageMediaSize`](../pagemediasize/) y usando el valor predeterminado[`PageMediaType`](../pagemediatype/) . La portada debe también estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento (como [`DocumentDuplex`](../documentduplex/) ,[`DocumentStaple`](../documentstaple/) , o[`DocumentBinding`](../documentbinding/)) no debe incluir la portada. La portada puede o no estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento del trabajo puede incluir la portada del documento. La portada debe aparecer como la primera hoja del documento. https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | Crea una nueva instancia. |

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
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | Representa opciones del`DocumentBannerSheet` característica. |

### Ver también

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


