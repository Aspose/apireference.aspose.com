---
title: DriverOptions.ValidateGeometriesOnWrite
second_title: Referencia de API de Aspose.GIS para .NET
description: DriverOptions propiedad. Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece entrue IsValid se llama para cada geometría cuando se agrega a la capa y si falla la validación IsValid esfalse GisException es lanzado.
type: docs
weight: 90
url: /es/net/aspose.gis/driveroptions/validategeometriesonwrite/
---
## DriverOptions.ValidateGeometriesOnWrite property

Determina si las geometrías deben validarse cuando se agregan a la capa. Si se establece en`true` ,[`IsValid`](../../../aspose.gis.geometries/geometry/isvalid/) se llama para cada geometría cuando se agrega a la capa, y si falla la validación ([`IsValid`](../../../aspose.gis.geometries/geometry/isvalid/) es`false` ),[`GisException`](../../gisexception/) es lanzado.

```csharp
public bool ValidateGeometriesOnWrite { get; set; }
```

### Observaciones

Esta es una opción de creación - no afecta la apertura.

### Ver también

* class [DriverOptions](../)
* espacio de nombres [Aspose.Gis](../../driveroptions/)
* asamblea [Aspose.GIS](../../../)


