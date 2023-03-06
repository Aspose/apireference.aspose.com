---
title: Class Ellipsoid
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.SpatialReferencing.Ellipsoid clase. Elipsoide representa un elipsoide que se aproxima a la tierra.
type: docs
weight: 2070
url: /es/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

Elipsoide representa un elipsoide, que se aproxima a la tierra.

```csharp
public class Ellipsoid : IdentifiableObject
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | Crea nuevo Elipsoide. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | Elipsoide aireado. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 Elipsoide. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | Elipsoide WGS 72. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | Elipsoide WGS 84. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Si el identificador de este objeto es un identificador EPSG, devuelva su código. De lo contrario, devuelva -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificador de este objeto identificable. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | Aplanamiento inverso del elipsoide. 0 si se trata de una esfera. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | Detecta si este elipsoide es una esfera. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | Detecta si el elipsoide es válido: su semieje mayor es mayor que 0 y el aplanamiento inverso es positivo o igual a 0. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nombre de este objeto. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | Semieje mayor del elipsoide. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | Eje semimenor del elipsoide. Igual al semieje mayor si se trata de una esfera. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | Determina si dos elipsoides son equivalentes. Si el elipsoide A es equivalente al elipsoide B, entonces tienen el mismo semieje mayor y aplanamiento inverso. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Devuelve una cadena que representa el objeto actual. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | Determina si dos elipsoides son equivalentes. Si el elipsoide A es equivalente al elipsoide B, entonces tienen el mismo semieje mayor y aplanamiento inverso. |

### Ver también

* class [IdentifiableObject](../identifiableobject/)
* espacio de nombres [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* asamblea [Aspose.GIS](../../)


