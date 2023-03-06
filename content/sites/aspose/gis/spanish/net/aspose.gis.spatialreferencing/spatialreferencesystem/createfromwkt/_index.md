---
title: SpatialReferenceSystem.CreateFromWkt
second_title: Referencia de API de Aspose.GIS para .NET
description: SpatialReferenceSystem método. Crea un nuevoSistema de referencia espacial basado en la cadena WKT texto conocido.
type: docs
weight: 20
url: /es/net/aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/
---
## SpatialReferenceSystem.CreateFromWkt method

Crea un nuevo`Sistema de referencia espacial` basado en la cadena WKT (texto conocido).

```csharp
public static SpatialReferenceSystem CreateFromWkt(string wkt)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| wkt | String | Cadena WKT. |

### Valor_devuelto

Nuevo`Sistema de referencia espacial` .

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null` . |
| FormatException | La jerarquía de los valores wkt, su orden o tipos, es incorrecta. |
| NotSupportedException | El elemento raíz WKT no es compatible (por ejemplo, es FITTED_CS). |

### Ver también

* method [TryCreateFromWkt](../trycreatefromwkt/)
* class [SpatialReferenceSystem](../)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* asamblea [Aspose.GIS](../../../)


