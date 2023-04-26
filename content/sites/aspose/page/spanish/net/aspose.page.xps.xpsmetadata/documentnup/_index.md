---
title: Class DocumentNUp
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp clase. Describe la salida y el formato de varias páginas lógicas en una sola hoja física. Cada documento se compila por separado. yJobNUpAllDocumentsContiguously son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave. https//docs.microsoft.com/enus/windows/win32/printdocs/documentnup
type: docs
weight: 750
url: /es/net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

Describe la salida y el formato de varias páginas lógicas en una sola hoja física. Cada documento se compila por separado. y[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) son mutuamente excluyentes. Depende del controlador determinar el manejo de restricciones entre estas palabras clave. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup

```csharp
DocumentNUp
```

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | Crea una nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un[`Feature`](../feature/) , un[`Option`](../option/) o un[`Property`](../property/) instancia. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | Agrega y opción con un valor de propiedad puntuado. Especifica el número de páginas lógicas por hoja física. |

### Ver también

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


