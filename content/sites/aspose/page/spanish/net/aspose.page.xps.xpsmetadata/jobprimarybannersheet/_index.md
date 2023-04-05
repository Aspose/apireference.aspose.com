---
title: Class JobPrimaryBannerSheet
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryBannerSheet clase. Describe la portada que se imprimirá para el trabajo. La portada debe salir en default PageMediaSize y usando el valor predeterminadoPageMediaType . La portada debe estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento como JobDuplexAllDocumentsContiguously JobStapleAllDocuments  oJobBindAllDocuments  no debe incluir la portada. La portada debe aparecer como la primera hoja del trabajo.
type: docs
weight: 1470
url: /es/net/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class

Describe la portada que se imprimirá para el trabajo. La portada debe salir en default [`PageMediaSize`](../pagemediasize/) y usando el valor predeterminado[`PageMediaType`](../pagemediatype/) . La portada debe estar aislada del resto del trabajo. Esto significa que cualquier opción de acabado o procesamiento (como [`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/) ,[`JobStapleAllDocuments`](../jobstaplealldocuments/) , o[`JobBindAllDocuments`](../jobbindalldocuments/) ) no debe incluir la portada. La portada debe aparecer como la primera hoja del trabajo.

```csharp
public sealed class JobPrimaryBannerSheet : Feature, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [JobPrimaryBannerSheet](jobprimarybannersheet/)(params BannerSheetOption[]) | Crea una nueva instancia. |

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
| class [BannerSheetOption](jobprimarybannersheet.bannersheetoption/) | Representa opciones del`JobPrimaryBannerSheet` característica. |

### Ver también

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


