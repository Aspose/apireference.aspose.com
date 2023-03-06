---
title: Class ProjectedSpatialReferenceSystem
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystem klas. Die projizierte SRS ist das Ergebnis der Anwendung einer Projektion auf eine geografische SRS. Eine projizierte SRS kann zweidimensional oder dreidimensional sein. Wenn die projizierte SRS dreidimensional ist dann ist sie tatsächlich eine zusammengesetzte SRS aus einer zweidimensionalen projizierten SRS und einer eindimensionalen Vertikalen SRS.
type: docs
weight: 2220
url: /de/net/aspose.gis.spatialreferencing/projectedspatialreferencesystem/
---
## ProjectedSpatialReferenceSystem class

Die projizierte SRS ist das Ergebnis der Anwendung einer Projektion auf eine geografische SRS. Eine projizierte SRS kann zweidimensional oder dreidimensional sein. Wenn die projizierte SRS dreidimensional ist, dann ist sie tatsächlich eine zusammengesetzte SRS aus einer zweidimensionalen projizierten SRS und einer eindimensionalen Vertikalen SRS.

```csharp
public abstract class ProjectedSpatialReferenceSystem : SpatialReferenceSystem
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/angularunit/) { get; } | Einheit, die für Winkelwerte in diesem SRS und für Winkelparameter von verwendet wird[`Projection`](./projection/) . Entspricht der Winkeleinheit von[`Base`](./base/) . |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Gibt dieses SRS konvertiert zurück[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . verwenden[`IsCompound`](../spatialreferencesystem/iscompound/) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Gibt dieses SRS konvertiert zurück[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . verwenden[`Type`](../spatialreferencesystem/type/) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Gibt dieses SRS konvertiert zurück[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . verwenden[`Type`](../spatialreferencesystem/type/) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Gibt dieses SRS konvertiert zurück[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . verwenden[`Type`](../spatialreferencesystem/type/) um herauszufinden, ob eine Konvertierung möglich ist. |
| [AsProjected](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/asprojected/) { get; } | Gib das zurück. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Gibt dieses SRS konvertiert zurück[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . verwenden[`Type`](../spatialreferencesystem/type/) um herauszufinden, ob eine Konvertierung möglich ist. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/axisesorder/) { get; } | Reihenfolge der Achsen in diesem SRS. Wenn dieses SRS nicht gültig ist und falsche Achsenrichtungen hat,Invalid wird zurückgegeben. |
| abstract [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/base/) { get; } | Geografisches SRS zu dem[`Projection`](./projection/) wurde angewendet, um diese SRS zu erhalten. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/dimensionscount/) { get; } | Gibt die Anzahl der Dimensionen in diesem SRS zurück. Für projizierte SRS kann dies sein: zwei – wenn es sich um eine einzelne projizierte SRS handelt. drei – wenn es sich um eine zusammengesetzte SRS handelt, die aus einer einzelnen, zweidimensionalen, projizierten SRS und einer vertikalen SRS besteht, die eine dritte Dimension hinzufügt. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Gibt das geografische Datum dieser SRS zurück. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasgeographicdatum/) { get; } | Gibt wahr zurück, da projizierte SRS immer einen Nullmeridian haben. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/hasprimemeridian/) { get; } | Gibt wahr zurück, da projizierte SRS immer einen Nullmeridian haben. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Kennung dieses identifizierbaren Objekts. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Gibt zurück, ob diese SRS zusammengesetzt ist (eine Vereinigung von zwei SRS). Die folgenden Kombinationen von SRS in zusammengesetzten SRS gelten als gültig: Geografische SRS + Vertikale SRS, in diesem Fall wird die Art der zusammengesetzten SRS seinGeographic . Projiziertes SRS + Vertikales SRS, in diesem Fall eine Art zusammengesetztes SRSProjected . Wenn die Kombination von SRSs unterschiedlich ist, wird der Typ des zusammengesetzten SRS seinUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Gibt zurück, ob diese SRS einfach ist (keine Vereinigung von zwei SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Gleich wie[`Validate`](../spatialreferencesystem/validate/) , aber keine Fehlermeldung zurückgeben. |
| abstract [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/linearunit/) { get; } | Einheit, die für lineare Maßangaben in diesem SRS und für lineare Parameter von verwendet wird[`Projection`](./projection/) . |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name dieses Objekts. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Gibt Nullmeridian dieser SRS zurück. |
| abstract [Projection](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/projection/) { get; } | Projektion, die angewendet wurde[`Base`](./base/) um diese SRS zu erhalten. |
| [Type](../../aspose.gis.spatialreferencing/projectedspatialreferencesystem/type/) { get; } | gibt zurückProjected . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Gibt die Darstellung dieses SRS als WKT-String zurück. Der Ergebnis-WKT-String stimmt mit der OGC 01-009-Spezifikation überein und wird normalerweise "WKT1" genannt. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Erhalten[`Axis`](../axis/) das beschreibt dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Erhalten[`Unit`](../unit/)der Abmessung. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Erkennt, ob dieses SRS anderen SRS entspricht. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Stellen Sie fest, ob diese SRS gültig ist. |

### Siehe auch

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Montage [Aspose.GIS](../../)


