---
title: Class GeographicDatum
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.SpatialReferencing.GeographicDatum clase. El dato geográfico relaciona la longitud y la latitud con un lugar particular de la tierra.
type: docs
weight: 2120
url: /es/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

El dato geográfico relaciona la longitud y la latitud con un lugar particular de la tierra.

```csharp
public class GeographicDatum : IdentifiableObject
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Crea nueva instancia. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | ETRS 89 datum. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | NAD 83 datum. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | Datos OSGB 1936. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | Dato WGS 72. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | Dato WGS 84. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Elipsoide, usado en este datum para aproximar la Tierra. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Si el identificador de este objeto es un identificador EPSG, devuelva su código. De lo contrario, devuelva -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificador de este objeto identificable. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nombre de este objeto. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParamters que se pueden utilizar para transformar coordenadas en este datum a coordenadas en datum WGS84. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | Determina si dos datums son equivalentes. Las mismas coordenadas de datums equivalentes coinciden con el mismo lugar en la Tierra. Algunos parámetros de datums equivalentes pueden ser diferentes, por ejemplo[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Devuelve una cadena que representa el objeto actual. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | Determina si dos datums son equivalentes. Las mismas coordenadas de datums equivalentes coinciden con el mismo lugar en la Tierra. Algunos parámetros de datums equivalentes pueden ser diferentes, por ejemplo[`Name`](../identifiableobject/name/) . |

### Ver también

* class [IdentifiableObject](../identifiableobject/)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* asamblea [Aspose.GIS](../../)


