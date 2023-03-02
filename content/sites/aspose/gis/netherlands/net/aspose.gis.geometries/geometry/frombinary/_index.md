---
title: Geometry.FromBinary
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Creëert een geometrie van zijn welbekende binaire representatie.
type: docs
weight: 460
url: /nl/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

Creëert een geometrie van zijn welbekende binaire representatie.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| wkb | Byte[] | Bekende binaire weergave van een geometrie. |

### Winstwaarde

Een geometrie vertegenwoordigd door het argument.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is nul. |
| NotSupportedException | Argument vertegenwoordigt een geometrie van een niet-ondersteund type. |
| FormatException | Argument is geen geldige bekende binaire waarde. |

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

Creëert een geometrie van zijn welbekende binaire representatie.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| wkb | Byte[] | Bekende binaire weergave van een geometrie. |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem dat aan de geometrie moet worden toegewezen. |

### Winstwaarde

Een geometrie vertegenwoordigd door het argument.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is nul. |
| NotSupportedException | Argument vertegenwoordigt een geometrie van een niet-ondersteund type. |
| FormatException | Argument is geen geldige bekende binaire waarde. |

### Opmerkingen

Als er extra bytes zijn na de geometrie aFormatException uitzondering wordt gegenereerd.

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


