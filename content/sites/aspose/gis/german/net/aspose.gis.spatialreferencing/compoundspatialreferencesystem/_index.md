---
title: CompoundSpatialReferenceSystem
second_title: Aspose.GIS für .NET-API-Referenz
description: VerbundSRS vereint zwei zugrunde liegende SRS von denen keine zusammengesetzt sein kann.
type: docs
weight: 1960
url: /de/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Verbund-SRS vereint zwei zugrunde liegende SRS, von denen keine zusammengesetzt sein kann.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound) { get; } | Gib das zurück. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric) { get; } | Gibt dieses SRS konvertiert zurück[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem) . verwenden[`Type`](../spatialreferencesystem/type) um herauszufinden, ob eine Konvertierung möglich ist. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic) { get; } | Geben Sie die geografische Darstellung dieses SRS zurück. Wenn diese zusammengesetzte SRS tatsächlich eine geografische SRS darstellt, ist das Ergebnis eine dreidimensionale geografische SRS (mit Längen-, Breiten- und Höhendimensionen). Andernfalls wird eine Ausnahme ausgelöst. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal) { get; } | Gibt dieses SRS konvertiert zurück[`LocalSpatialReferenceSystem`](../localspatialreferencesystem) . verwenden[`Type`](../spatialreferencesystem/type) um herauszufinden, ob eine Konvertierung möglich ist. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected) { get; } | Projizierte Darstellung dieses SRS zurückgeben. Wenn diese zusammengesetzte SRS tatsächlich eine projizierte SRS darstellt, ist das Ergebnis eine dreidimensionale projizierte SRS (mit X-, Y-, Höhendimensionen). Andernfalls wird eine Ausnahme ausgelöst. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical) { get; } | Gibt dieses SRS konvertiert zurück[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem) . verwenden[`Type`](../spatialreferencesystem/type) um herauszufinden, ob eine Konvertierung möglich ist. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount) { get; } | Anzahl der Dimensionen. Für zusammengesetzte SRS ist dies die Summe der Anzahl der Dimensionen der zugrunde liegenden SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode) { get; } | Wenn dieser Objektbezeichner ein EPSG-Bezeichner ist - geben Sie seinen Code zurück. Andernfalls - gib -1. zurück |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum) { get; } | Geben Sie das geografische Datum dieses SRS zurück. Wenn beides[`Head`](./head) und[`Tail`](./tail) Geographisches Datum haben - Geographisches Datum des Kopfes zurückgeben. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum) { get; } | Zusammengesetzte SRS haben ein geografisches Datum, wenn eines der zugrunde liegenden SRS ein geografisches Datum hat. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian) { get; } | Verbund-SRS hat Nullmeridian, wenn einer der zugrunde liegenden SRS Nullmeridian hat. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head) { get; } | Erster zugrunde liegender SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier) { get; } | Kennung dieses identifizierbaren Objekts. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound) { get; } | gibt zurück`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle) { get; } | Gibt zurück, ob diese SRS einfach ist (keine Vereinigung von zwei SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid) { get; } | Gleich wie[`Validate`](../spatialreferencesystem/validate) , aber keine Fehlermeldung zurückgeben. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name) { get; } | Name dieses Objekts. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian) { get; } | Nullmeridian dieser SRS zurückgeben. Wenn beides[`Head`](./head) und[`Tail`](./tail) Nullmeridian haben - Nullmeridian des Kopfes zurückgeben. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail) { get; } | Zweiter zugrunde liegender SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type) { get; } | Typ dieses zusammengesetzten SRS. Kann seinGeographicif diese zusammengesetzte SRS ist eine Kombination aus geografischer und vertikaler SRS, oderProjected if dieses zusammengesetzte SRS ist eine Kombination aus projiziertem und vertikalem SRS. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto)(SpatialReferenceSystem) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt)() | Gibt die Darstellung dieses SRS als WKT-String zurück. Der Ergebnis-WKT-String stimmt mit der OGC 01-009-Spezifikation überein und wird normalerweise "WKT1" genannt. |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis)(int) | Erhalten[`Axis`](../axis) das beschreibt dimension. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit)(int) | Erhalten[`Unit`](../unit)der Abmessung. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent)(SpatialReferenceSystem) | Erkennt, ob dieses SRS anderen SRS entspricht. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring)() | Gibt eine Zeichenfolge zurück, die das aktuelle Objekt darstellt. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate)(out string) | Stellen Sie fest, ob diese SRS gültig ist. Sehen[`Validate`](../spatialreferencesystem/validate) für Gültigkeitsbeschreibung. |

### Siehe auch

* class [SpatialReferenceSystem](../spatialreferencesystem)
* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing)
* Montage [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
