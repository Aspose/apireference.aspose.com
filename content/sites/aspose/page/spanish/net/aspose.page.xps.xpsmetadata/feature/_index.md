---
title: Class Feature
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.Feature clase. La clase que encapsula una función de esquema de impresión común. La clase base para todas las funciones definidas por el esquema. A El elemento contiene una lista completa de losOption yProperty elementos que describen completamente un atributo de dispositivo una configuración de formato de trabajo u otra característica relevante. https//docs.microsoft.com/enus/windows/win32/printdocs/feature
type: docs
weight: 880
url: /es/net/aspose.page.xps.xpsmetadata/feature/
---
## Feature class

La clase que encapsula una función de esquema de impresión común. La clase base para todas las funciones definidas por el esquema. A El elemento contiene una lista completa de los[`Option`](../option/) y[`Property`](../property/) elementos que describen completamente un atributo de dispositivo, una configuración de formato de trabajo u otra característica relevante. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature

```csharp
Feature
```

```csharp
public class Feature : CompositePrintTicketElement, IFeatureItem, IPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Feature](feature/#constructor)(string, Feature, params IFeatureItem[]) | Crea una nueva instancia de función PrintTicket. |
| [Feature](feature/#constructor_1)(string, Option, params IFeatureItem[]) | Crea una nueva instancia de función PrintTicket. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtiene el nombre del elemento. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Agrega una lista de elementos al final de la lista de elementos de esta característica. Cada uno debe ser un`Feature` , un[`Option`](../option/) o un[`Property`](../property/) instancia. |

### Ver también

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* interface [IPrintTicketItem](../iprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


