---
title: LocalSpatialReferenceSystem
second_title: Aspose.GIS für .NET-API-Referenz
description: Lokale SRSbezogene Koordinaten zu einem Objekt nicht zur Erde.
type: docs
weight: 2080
url: /de/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

Lokale SRS-bezogene Koordinaten zu einem Objekt, nicht zur Erde.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound) { get; } | Gibt dieses SRS konvertiert zurück[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem) . verwenden[`IsCompound`](../spatialreferencesystem/iscompound) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Gibt dieses SRS konvertiert zurück[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . verwenden[`Type`](../spatialreferencesystem/type) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic) { get; } | Gibt dieses SRS konvertiert zurück[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem) . verwenden[`Type`](../spatialreferencesystem/type) um herauszufinden, ob eine Konvertierung möglich ist. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal) { get; } | Gib das zurück. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected) { get; } | Gibt dieses SRS konvertiert zurück[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem) . verwenden[`Type`](../spatialreferencesystem/type) um herauszufinden, ob eine Konvertierung möglich ist. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Gibt dieses SRS konvertiert zurück[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . verwenden[`Type`](../spatialreferencesystem/type) um herauszufinden, ob eine Konvertierung möglich ist. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount) { get; } | Anzahl der Dimensionen in diesem SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum) { get; } | wirftInvalidOperationException da Local SRS kein geografisches Datum hat. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum) { get; } | gibt zurück`false` da Local SRS kein geografisches Datum hat. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian) { get; } | gibt zurück`false` , da Local SRS keinen Nullmeridian hat. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Kennung dieses identifizierbaren Objekts. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound) { get; } | Gibt zurück, ob diese SRS zusammengesetzt ist (eine Vereinigung von zwei SRS). Die folgenden Kombinationen von SRS in zusammengesetzten SRS gelten als gültig: Geografische SRS + Vertikale SRS, in diesem Fall wird die Art der zusammengesetzten SRS seinGeographic . Projiziertes SRS + Vertikales SRS, in diesem Fall eine Art zusammengesetztes SRSProjected . Wenn die Kombination von SRSs unterschiedlich ist, wird der Typ des zusammengesetzten SRS seinUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Gibt zurück, ob diese SRS einfach ist (keine Vereinigung von zwei SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Gleich wie[`Validate`](../spatialreferencesystem/validate) , aber keine Fehlermeldung zurückgeben. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum) { get; } | Datum, das die Messmethode beschreibt. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Name dieses Objekts. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian) { get; } | wirftInvalidOperationException , da Local SRS keinen Nullmeridian hat. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type) { get; } | RückkehrLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit) { get; } | Einheit dieses SRS. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Gibt die Darstellung dieses SRS als WKT-String zurück. Der Ergebnis-WKT-String stimmt mit der OGC 01-009-Spezifikation überein und wird normalerweise "WKT1" genannt. |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis)(int) | Erhalten[`Axis`](../axis) das beschreibt dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit)(int) | Erhalten[`Unit`](./unit)der Abmessung. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Erkennt, ob dieses SRS anderen SRS entspricht. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate)(out string) | Stellen Sie fest, ob diese SRS gültig ist. Sehen[`Validate`](../spatialreferencesystem/validate) für Gültigkeitsbeschreibung. |

### Siehe auch

* class [SpatialReferenceSystem](../spatialreferencesystem)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* Montage [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
