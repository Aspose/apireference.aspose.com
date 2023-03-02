---
title: Class GeographicDatum
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.SpatialReferencing.GeographicDatum classe. Il dato geografico mette in relazione la longitudine e la latitudine con un particolare luogo sulla terra.
type: docs
weight: 2120
url: /it/net/aspose.gis.spatialreferencing/geographicdatum/
---
## GeographicDatum class

Il dato geografico mette in relazione la longitudine e la latitudine con un particolare luogo sulla terra.

```csharp
public class GeographicDatum : IdentifiableObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [GeographicDatum](geographicdatum/)(string, Ellipsoid, BursaWolfParameters, Identifier) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| static [Etrs89](../../aspose.gis.spatialreferencing/geographicdatum/etrs89/) { get; } | Dato ETRS 89. |
| static [Nad83](../../aspose.gis.spatialreferencing/geographicdatum/nad83/) { get; } | Dato NAD 83. |
| static [Osgb36](../../aspose.gis.spatialreferencing/geographicdatum/osgb36/) { get; } | Dato OSGB 1936. |
| static [Wgs72](../../aspose.gis.spatialreferencing/geographicdatum/wgs72/) { get; } | WGS 72 dato. |
| static [Wgs84](../../aspose.gis.spatialreferencing/geographicdatum/wgs84/) { get; } | WGS 84 dato. |
| [Ellipsoid](../../aspose.gis.spatialreferencing/geographicdatum/ellipsoid/) { get; } | Ellissoide, utilizzato in questo dato per approssimare la Terra. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Se questo identificatore di oggetti è un identificatore EPSG, restituisce il suo codice. Altrimenti - ritorna -1. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Identificatore di questo oggetto identificabile. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Nome di questo oggetto. |
| [ToWgs84Parameters](../../aspose.gis.spatialreferencing/geographicdatum/towgs84parameters/) { get; } | BursaWolfParametri che possono essere utilizzati per trasformare le coordinate in questo datum in coordinate nel datum WGS84. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum) | Determina se due datum sono equivalenti. Le stesse coordinate di datum equivalenti corrispondono allo stesso punto sulla Terra. Alcuni parametri di datum equivalenti possono essere diversi, ad esempio[`Name`](../identifiableobject/name/) . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/geographicdatum/isequivalent/)(GeographicDatum, GeographicDatum) | Determina se due datum sono equivalenti. Le stesse coordinate di datum equivalenti corrispondono allo stesso punto sulla Terra. Alcuni parametri di datum equivalenti possono essere diversi, ad esempio[`Name`](../identifiableobject/name/) . |

### Guarda anche

* class [IdentifiableObject](../identifiableobject/)
* spazio dei nomi [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assemblea [Aspose.GIS](../../)


