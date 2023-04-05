---
title: Class DocumentBinding
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.DocumentBinding clase. Describe el método de enlace. Cada documento se encuaderna por separado. DocumentBinding y JobBindAllDocuments se excluyen mutuamente. Depende del controlador determinar el manejo de restricciones entre palabras clave. https//docs.microsoft.com/enus/windows/win32/printdocs/documentbinding
type: docs
weight: 560
url: /es/net/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class

Describe el método de enlace. Cada documento se encuaderna por separado. DocumentBinding y JobBindAllDocuments se excluyen mutuamente. Depende del controlador determinar el manejo de restricciones entre palabras clave. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding

```csharp
public sealed class DocumentBinding : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [DocumentBinding](documentbinding/)(params BindingOption[]) | Crea una nueva instancia. |

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
| class [BindingGutter](documentbinding.bindinggutter/) | Describe la forma de especificar el valor de propiedad puntuado, ya sea por un valor entero o por la referencia a la parámetro. |
| class [BindingOption](documentbinding.bindingoption/) | Representa opciones del`DocumentBinding` característica. |
| interface [IBindingOptionItem](documentbinding.ibindingoptionitem/) | La interfaz de cualquier[`BindingOption`](../documentbinding.bindingoption/) artículo. |

### Ver también

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


