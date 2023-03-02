---
title: Enum SpatialReferenceSystemType
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType opsomming. Repräsentiert die Art des räumlichen Bezugssystems.
type: docs
weight: 2270
url: /de/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

Repräsentiert die Art des räumlichen Bezugssystems.

```csharp
public enum SpatialReferenceSystemType
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Unknown | `0` | Standardwert. Kann zurückgegeben werden von[`Type`](../spatialreferencesystem/type/) wenn dies ein zusammengesetzter SRS mit einer ungültigen Kombination von zugrunde liegenden SRSs ist. Sehen[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | Geografisches SRS basiert auf Winkellänge und Winkelbreite. Geografisches SRS kann konvertiert werden[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) über[`AsGeographic`](../spatialreferencesystem/asgeographic/) Methode. |
| Geocentric | `2` | Geozentrisches SRS ist ein dreidimensionales kartesisches SRS mit Ursprung im Erdmittelpunkt. Geozentrisches SRS kann konvertiert werden[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) über[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) Methode. |
| Projected | `3` | Projiziertes SRS basiert auf linearem X und linearem Y. Es ist das Ergebnis der Anwendung einer Projektion auf aGeographic SRS. Projiziertes SRS kann konvertiert werden[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) über[`AsProjected`](../spatialreferencesystem/asprojected/) Methode. |
| Vertical | `4` | Vertical SRS beschreibt die lineare Höhenkoordinate. Vertical SRS kann konvertiert werden[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) über[`AsVertical`](../spatialreferencesystem/asvertical/) Methode. |
| Local | `5` | Lokales SRS bezieht Koordinaten auf einige Objekte, andere auf die Erde. Lokales SRS kann konvertiert werden[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) über[`AsLocal`](../spatialreferencesystem/aslocal/) Methode. |

### Siehe auch

* namensraum [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* Montage [Aspose.GIS](../../)


