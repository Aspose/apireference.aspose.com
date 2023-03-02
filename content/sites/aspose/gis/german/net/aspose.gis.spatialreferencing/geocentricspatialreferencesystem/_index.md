---
title: Class GeocentricSpatialReferenceSystem
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem klas. Geozentrische SRS ist eine dreidimensionale kartesische SRS mit Ursprung im Erdmittelpunkt.
type: docs
weight: 2090
url: /de/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Geozentrische SRS ist eine dreidimensionale kartesische SRS mit Ursprung im Erdmittelpunkt.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Gibt dieses SRS konvertiert zurück[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . verwenden[`IsCompound`](../spatialreferencesystem/iscompound/) um herauszufinden, ob eine Konvertierung möglich ist. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | Gib das zurück. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Gibt dieses SRS konvertiert zurück[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . verwenden[`Type`](../spatialreferencesystem/type/) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Gibt dieses SRS konvertiert zurück[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . verwenden[`Type`](../spatialreferencesystem/type/) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Gibt dieses SRS konvertiert zurück[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . verwenden[`Type`](../spatialreferencesystem/type/) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Gibt dieses SRS konvertiert zurück[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . verwenden[`Type`](../spatialreferencesystem/type/) um herauszufinden, ob eine Konvertierung möglich ist. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | Reihenfolge der Achsen in diesem SRS. Wenn dieses SRS nicht gültig ist und falsche Achsenrichtungen hat,Invalid wird zurückgegeben. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | Geben Sie 3 zurück, da geozentrische SRS immer dreidimensional ist. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | Geben Sie das geografische Datum dieser SRS zurück. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | Rückkehr`true` , da geozentrische SRS immer ein geografisches Datum haben. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | Rückkehr`true` , da geozentrische SRS immer Nullmeridian haben. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Kennung dieses identifizierbaren Objekts. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Gibt zurück, ob diese SRS zusammengesetzt ist (eine Vereinigung von zwei SRS). Die folgenden Kombinationen von SRS in zusammengesetzten SRS gelten als gültig: Geografische SRS + Vertikale SRS, in diesem Fall wird die Art der zusammengesetzten SRS seinGeographic . Projiziertes SRS + Vertikales SRS, in diesem Fall eine Art zusammengesetztes SRSProjected . Wenn die Kombination von SRSs unterschiedlich ist, wird der Typ des zusammengesetzten SRS seinUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Gibt zurück, ob diese SRS einfach ist (keine Vereinigung von zwei SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Gleich wie[`Validate`](../spatialreferencesystem/validate/) , aber keine Fehlermeldung zurückgeben. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | Einheit, verwendet in diesem SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Name dieses Objekts. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | Geben Sie den Nullmeridian dieser SRS zurück. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | RückkehrGeocentric . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Gibt die Darstellung dieses SRS als WKT-String zurück. Der Ergebnis-WKT-String stimmt mit der OGC 01-009-Spezifikation überein und wird normalerweise "WKT1" genannt. |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | Erhalten[`Axis`](../axis/) das beschreibt dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | Erhalten[`Unit`](../unit/)der Abmessung. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Erkennt, ob dieses SRS anderen SRS entspricht. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | Stellen Sie fest, ob diese SRS gültig ist. Sehen[`Validate`](../spatialreferencesystem/validate/) für Gültigkeitsbeschreibung. |

### Siehe auch

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Montage [Aspose.GIS](../../)


