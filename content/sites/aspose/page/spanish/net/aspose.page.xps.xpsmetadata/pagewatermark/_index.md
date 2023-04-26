---
title: Class PageWatermark
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.PageWatermark clase. Describe la configuración de la marca de agua de la salida y las características de la marca de agua. Las marcas de agua se aplican a la página lógica no a la página física. Por ejemplo siDocumentDuplex está habilitado aparecerá una marca de agua en cada página en cada hoja. SiDocumentDuplex  2 cada hoja tendrá 2 marcas de agua. https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2650
url: /es/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Describe la configuración de la marca de agua de la salida y las características de la marca de agua. Las marcas de agua se aplican a la página lógica, no a la página física. Por ejemplo, si[`DocumentDuplex`](../documentduplex/) está habilitado, aparecerá una marca de agua en cada página en cada hoja. Si[`DocumentDuplex`](../documentduplex/) , =2, cada hoja tendrá 2 marcas de agua. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Crea una nueva instancia. |

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
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | La interfaz de cualquier`PageWatermark` característica artículo. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | La interfaz de cualquier[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) artículo. |
| class [Layering](pagewatermark.layering/) | Describe interior característica. Define el comportamiento de capas de la marca de agua. |
| class [LayeringOption](pagewatermark.layeringoption/) | Describe el[`Layering`](../pagewatermark.layering/) opciones de funciones. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | Describe el`PageWatermark` características opciones. |

### Ver también

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


