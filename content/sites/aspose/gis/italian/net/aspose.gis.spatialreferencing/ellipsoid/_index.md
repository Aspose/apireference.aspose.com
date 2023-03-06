---
title: Class Ellipsoid
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing.Ellipsoid classe. Lellissoide rappresenta un ellissoide che si avvicina alla terra.
type: docs
weight: 2070
url: /it/net/aspose.gis.spatialreferencing/ellipsoid/
---
## Ellipsoid class

L'ellissoide rappresenta un ellissoide, che si avvicina alla terra.

```csharp
public class Ellipsoid : IdentifiableObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Ellipsoid](ellipsoid/)(string, double, double, Identifier) | Crea un nuovo ellissoide. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| static [Airy](../../aspose.gis.spatialreferencing/ellipsoid/airy/) { get; } | Airy ellissoide. |
| static [Grs80](../../aspose.gis.spatialreferencing/ellipsoid/grs80/) { get; } | GRS 1980 Ellissoide. |
| static [Wgs72](../../aspose.gis.spatialreferencing/ellipsoid/wgs72/) { get; } | WGS 72 Ellissoide. |
| static [Wgs84](../../aspose.gis.spatialreferencing/ellipsoid/wgs84/) { get; } | WGS 84 Ellissoide. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Se questo identificatore di oggetti è un identificatore EPSG, restituisce il suo codice. Altrimenti - ritorna -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatore di questo oggetto identificabile. |
| [InverseFlattening](../../aspose.gis.spatialreferencing/ellipsoid/inverseflattening/) { get; } | Appiattimento inverso dell'ellissoide. 0 se questa è una sfera. |
| [IsSphere](../../aspose.gis.spatialreferencing/ellipsoid/issphere/) { get; } | Rileva se questo ellissoide è una sfera. |
| [IsValid](../../aspose.gis.spatialreferencing/ellipsoid/isvalid/) { get; } | Rileva se l'ellissoide è valido: il suo semiasse maggiore è maggiore di 0 e l'appiattimento inverso è positivo o uguale a 0. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nome di questo oggetto. |
| [SemiMajorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semimajoraxis/) { get; } | Semiasse maggiore dell'ellissoide. |
| [SemiMinorAxis](../../aspose.gis.spatialreferencing/ellipsoid/semiminoraxis/) { get; } | Semiasse minore dell'ellissoide. Uguale al semiasse maggiore se si tratta di una sfera. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid) | Determina se due ellissoidi sono equivalenti. Se l'ellissoide A è equivalente all'ellissoide B, allora hanno lo stesso semiasse maggiore e l'appiattimento inverso. |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/ellipsoid/isequivalent/)(Ellipsoid, Ellipsoid) | Determina se due ellissoidi sono equivalenti. Se l'ellissoide A è equivalente all'ellissoide B, allora hanno lo stesso semiasse maggiore e l'appiattimento inverso. |

### Guarda anche

* class [IdentifiableObject](../identifiableobject/)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assemblea [Aspose.GIS](../../)


