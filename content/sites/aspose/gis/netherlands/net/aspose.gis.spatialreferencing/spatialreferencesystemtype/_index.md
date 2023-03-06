---
title: Enum SpatialReferenceSystemType
second_title: Aspose.GIS voor .NET API-referentie
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType opsomming. Vertegenwoordigt type ruimtelijk referentiesysteem.
type: docs
weight: 2270
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

Vertegenwoordigt type ruimtelijk referentiesysteem.

```csharp
public enum SpatialReferenceSystemType
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Unknown | `0` | Standaardwaarde. Kan worden geretourneerd van[`Type`](../spatialreferencesystem/type/) als dit een samengestelde SRS is met een ongeldige combinatie van onderliggende SRS'en. Zien[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | Geografische SRS is gebaseerd op lengtegraad en breedtegraad. Geografische SRS kan worden geconverteerd naar[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) via[`AsGeographic`](../spatialreferencesystem/asgeographic/) methode. |
| Geocentric | `2` | Geocentrische SRS is driedimensionale cartesische SRS met oorsprong in het centrum van de aarde. Geocentrische SRS kan worden omgezet naar[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) via[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) methode. |
| Projected | `3` | Geprojecteerde SRS is gebaseerd op lineaire X en lineaire Y. Het is het resultaat van het toepassen van een projectie op eenGeographic SRS. Geprojecteerde SRS kan worden geconverteerd naar[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) via[`AsProjected`](../spatialreferencesystem/asprojected/) methode. |
| Vertical | `4` | Verticale SRS beschrijft lineaire hoogtecoördinaat. Verticale SRS kan worden geconverteerd naar[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) via[`AsVertical`](../spatialreferencesystem/asvertical/) methode. |
| Local | `5` | Lokale SRS relateert coördinaten aan een object, andere aan de aarde. Lokale SRS kan worden geconverteerd naar[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) via[`AsLocal`](../spatialreferencesystem/aslocal/) methode. |

### Zie ook

* naamruimte [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* montage [Aspose.GIS](../../)


