---
title: SpatialReferenceSystem
second_title: Aspose.GIS für .NET-API-Referenz
description: Das räumliche Referenzsystem bildet Koordinaten mit Orten auf der Erde ab. Es gibt verschiedene Arten von SRS sieheType./spatialreferencesystem/type . Was mehr ist wenn Typ SRS istGeographic oder Projected SRS kann zusammengesetzt oder einfach sein sieheIsCompound./spatialreferencesystem/iscompound .
type: docs
weight: 2150
url: /de/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Das räumliche Referenzsystem bildet Koordinaten mit Orten auf der Erde ab. Es gibt verschiedene Arten von SRS, siehe[`Type`](./type) . Was mehr ist, wenn Typ SRS istGeographic oder Projected SRS kann zusammengesetzt oder einfach sein, siehe[`IsCompound`](./iscompound) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Gibt dieses SRS konvertiert zurück[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . verwenden[`IsCompound`](./iscompound) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Gibt dieses SRS konvertiert zurück[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . verwenden[`Type`](./type) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Gibt dieses SRS konvertiert zurück[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . verwenden[`Type`](./type) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Gibt dieses SRS konvertiert zurück[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . verwenden[`Type`](./type) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Gibt dieses SRS konvertiert zurück[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . verwenden[`Type`](./type) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Gibt dieses SRS konvertiert zurück[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . verwenden[`Type`](./type) um herauszufinden, ob eine Konvertierung möglich ist. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount) { get; } | Gibt die Anzahl der Dimensionen in dieser SRS zurück. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum) { get; } | Gibt das geografische Datum dieser SRS zurück. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum) { get; } | Bestimmt, ob diese SRS ein geografisches Datum hat. Dies gilt für jede geografische, projizierte und geozentrische SRS. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian) { get; } | Gibt zurück, ob diese SRS einen Nullmeridian hat. Dies gilt für jede geografische, projizierte und geozentrische SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Kennung dieses identifizierbaren Objekts. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Gibt zurück, ob diese SRS zusammengesetzt ist (eine Vereinigung von zwei SRS). Die folgenden Kombinationen von SRS in zusammengesetzten SRS gelten als gültig: Geografische SRS + Vertikale SRS, in diesem Fall wird die Art der zusammengesetzten SRS seinGeographic . Projiziertes SRS + Vertikales SRS, in diesem Fall eine Art zusammengesetztes SRSProjected . Wenn die Kombination von SRSs unterschiedlich ist, wird der Typ des zusammengesetzten SRS seinUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Gibt zurück, ob diese SRS einfach ist (keine Vereinigung von zwei SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Gleich wie[`Validate`](./validate) , aber keine Fehlermeldung zurückgeben. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Name dieses Objekts. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian) { get; } | Gibt Nullmeridian dieser SRS zurück. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type) { get; } | Ruft den Typ dieses SRS ab, siehe[`SpatialReferenceSystemType`](../spatialreferencesystemtype) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89) { get; } | Räumliches Bezugssystem ETRS 89 (EPSG:4258). |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea) { get; } | ETRS 89 / ETRS Lambert Azimutal Equal Area (EPSG:3035) Raumbezugssystem. |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic) { get; } | Raumbezugssystem ETRS 89 / Lambert Conformal Conic (EPSG:3034). |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83) { get; } | Räumliches Bezugssystem NAD 83 (EPSG:4269). |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36) { get; } | OSGB 36 (EPSG:4277) Raumbezugssystem. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid) { get; } | OSGB 36 / British National Grid (EPSG:27700) Raumbezugssystem. |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator) { get; } | Raumbezugssystem Web Mercator (EPSG:3857). |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72) { get; } | WGS 72 (EPSG:4322) Raumbezugssystem. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84) { get; } | WGS 84 (EPSG:4326) Raumbezugssystem. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg)(int) | Erstellen Sie ein räumliches Bezugssystem basierend auf dem angegebenen EPSG-Code. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt)(string) | Erstellt eine neue`SpatialReferenceSystem` basierend auf WKT (Well-Known Text)-String. |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Gibt die Darstellung dieses SRS als WKT-String zurück. Der Ergebnis-WKT-String stimmt mit der OGC 01-009-Spezifikation überein und wird normalerweise "WKT1" genannt. |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis)(int) | Erhalten[`Axis`](../axis) das beschreibt dimension. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit)(int) | Erhalten[`Unit`](../unit)der Abmessung. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Erkennt, ob dieses SRS anderen SRS entspricht. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate)(out string) | Stellen Sie fest, ob diese SRS gültig ist. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Verbund-SRS erstellen. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric)(GeocentricSpatialReferenceSystemParameters, Identifier) | Geozentrisches SRS aus benutzerdefinierten Parametern erstellen. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic)(GeographicSpatialReferenceSystemParameters, Identifier) | Erstellen Sie geografische SRS aus benutzerdefinierten Parametern. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Lokalen SRS erstellen. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected)(ProjectedSpatialReferenceSystemParameters, Identifier) | Projizierte SRS aus benutzerdefinierten Parametern erstellen. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical)(string, VerticalDatum, Unit, Axis, Identifier) | Vertikale SRS erstellen. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent)(SpatialReferenceSystem, SpatialReferenceSystem) | Bestimmt, ob zwei SRS äquivalent sind. Gleiche Koordinaten äquivalenter SRS stimmen mit demselben Ort auf der Erde überein. Einige Parameter äquivalenter SRS können beispielsweise unterschiedlich sein[`Name`](../identifiableobject/name) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg)(int, out SpatialReferenceSystem) | Erstellen Sie ein räumliches Bezugssystem basierend auf dem angegebenen EPSG-Code. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt)(string, out SpatialReferenceSystem) | Erstellt eine neue`SpatialReferenceSystem` basierend auf WKT (Well-Known Text)-String. |

### Siehe auch

* class [IdentifiableObject](../identifiableobject)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* Montage [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
