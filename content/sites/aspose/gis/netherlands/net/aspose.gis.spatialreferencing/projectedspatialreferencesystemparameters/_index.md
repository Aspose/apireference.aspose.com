---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters klas. Parameters om geprojecteerde SRS te maken. Sommige parameters hebben standaardwaarden. Sommige parameters hebben redelijke standaardinstellingen dus u hoeft niet alleen deze toe te wijzen. Als unull voor die parameters wordt een standaardwaarde gebruikt. ProjectionMethodName EnBase heb geen standaardinstellingen  je moet een aantal non toewijzennull waarde aan deze eigenschappen.
type: docs
weight: 2230
url: /nl/net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Parameters om geprojecteerde SRS te maken. Sommige parameters hebben standaardwaarden. Sommige parameters hebben redelijke standaardinstellingen, dus u hoeft niet alleen deze toe te wijzen. Als u`null` voor die parameters wordt een standaardwaarde gebruikt. [`ProjectionMethodName`](./projectionmethodname/) En[`Base`](./base/) heb geen standaardinstellingen - je moet een aantal non toewijzen`null` waarde aan deze eigenschappen.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | De standaard constructeur. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Volgorde van assen. Standaard naarXY . |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | Basis geografische SRS (SRS waarop projectie wordt toegepast). U MOET deze eigenschap instellen op niet`null` waarde om geldige SRS te creëren, deze eigenschap heeft geen standaard. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | Eenheden die in deze SRS moeten worden gebruikt. Standaard is[`Meter`](../unit/meter/) . |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Naam van geprojecteerde SRS. Standaard is "Naamloos". |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Identificatie van projectiemethode. Er is geen standaardwaarde, u kunt deze parameter instellen op not`null` waarde, als u een ID aan de projectie wilt koppelen. Als u dit doet, is het aan u om ervoor te zorgen dat de identifier consistent is in de projectiemethode naam (de naam van de projectiemethode verandert niet wanneer u deze eigenschap instelt). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Naam van projectiemethode. Er is geen standaardinstelling en u MOET deze parameter instellen op not`null` waarde, aangezien geprojecteerde SRS zonder projectienaam nutteloos is. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | As die X (horizontale) dimensie beschrijft. Standaard ingesteld op as met oostelijke richting. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | As die Y (verticale) dimensie beschrijft. Standaard as met noordelijke richting. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Voegt projectieparameter toe aan deze SRS. Als er al een parameter met een dergelijke naam is toegevoegd, update deze dan. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Haalt projectieparameter op met gespecificeerde naam. |

### Zie ook

* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


