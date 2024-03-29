---
title: PreferredParsers
second_title: Referencia de API de Aspose.Cells para .NET
description: Obtiene y establece los analizadores de valores preferidos para cargar el archivo de texto.
type: docs
weight: 60
url: /es/net/aspose.cells/txtloadoptions/preferredparsers/
---
## TxtLoadOptions.PreferredParsers property

Obtiene y establece los analizadores de valores preferidos para cargar el archivo de texto.

```csharp
public ICustomParser[] PreferredParsers { get; set; }
```

### Observaciones

parsers[0] es el analizador que se usará para la primera columna en el archivo de plantilla de texto, parsers[1] es el analizador que se usará para la segunda columna, etc. El último (parsers[parsers. length-1]) se usará para todas las demás columnas a partir de parsers.length-1. Si un elemento es nulo, la columna correspondiente será analizada por el analizador predeterminado de Aspose.Cells.

### Ver también

* interface [ICustomParser](../../icustomparser)
* class [TxtLoadOptions](../../txtloadoptions)
* espacio de nombres [Aspose.Cells](../../txtloadoptions)
* asamblea [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
