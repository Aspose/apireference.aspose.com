---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS voor .NET API-referentie
description: FileDriver methode. Bepaalt of gespecificeerd ruimtelijk referentiesysteem wordt ondersteund door de driver.
type: docs
weight: 100
url: /nl/net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Bepaalt of gespecificeerd ruimtelijk referentiesysteem wordt ondersteund door de driver.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Ruimtelijk referentiesysteem. |

### Winstwaarde

Booleaanse waarde, die aangeeft of het gespecificeerde ruimtelijke referentiesysteem wordt ondersteund door de driver. `null` wordt beschouwd als ondersteund door elke driver.

### Opmerkingen

Als ruimtelijk referentiesysteem niet wordt ondersteund, en u geeft het door aan[`CreateLayer`](../createlayer/) methode, eenNotSupportedException zal worden gegooid.

### Zie ook

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* naamruimte [Aspose.Gis](../../filedriver/)
* montage [Aspose.GIS](../../../)


