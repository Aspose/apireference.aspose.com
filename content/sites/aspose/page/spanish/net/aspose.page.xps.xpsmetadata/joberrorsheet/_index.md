---
title: Class JobErrorSheet
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet clase. Describe la salida de la hoja de errores. Todo el trabajo tendrá una sola hoja de error. El error sheet debería salir por defectoPageMediaSize y usando el valor predeterminadoPageMediaType . La hoja de errores debe aislarse del resto del trabajo. Esto significa que cualquier opción de procesamiento de acabado o como   o  no debe incluir la hoja de error. La hoja de error debe aparecer como hoja final del trabajo. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /es/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Describe la salida de la hoja de errores. Todo el trabajo tendrá una sola hoja de error. El error sheet debería salir por defecto[`PageMediaSize`](../pagemediasize/) y usando el valor predeterminado[`PageMediaType`](../pagemediatype/) . La hoja de errores debe aislarse del resto del trabajo. Esto significa que cualquier opción de procesamiento de acabado o (como , , o ) no debe incluir la hoja de error. La hoja de error debe aparecer como hoja final del trabajo. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Crea una nueva instancia. |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Describe el`JobErrorSheet` opciones de funciones. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Describe interior característica. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | La interfaz de cualquier`JobErrorSheet` característica artículo. |

### Ver también

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* espacio de nombres [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* asamblea [Aspose.Page](../../)


