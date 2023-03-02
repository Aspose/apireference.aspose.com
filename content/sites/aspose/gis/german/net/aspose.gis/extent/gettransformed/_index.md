---
title: Extent.GetTransformed
second_title: Aspose.GIS für .NET-API-Referenz
description: Extent methode. Gibt einen neuen Extent in angegeben zurückSpatialReferenceSystem das diesen Extent enthält.
type: docs
weight: 150
url: /de/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Gibt einen neuen Extent in angegeben zurück[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) das diesen Extent enthält.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) zu verwandeln. |

### Rückgabewert

Das Ergebnis der Transformation in diesem Umfang in die angegebene SRS.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null` . |
| NotSupportedException | Die Umwandlung in das bereitgestellte SRS wird nicht unterstützt. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Transformation fehlgeschlagen. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) in diesem Umfang ist`null` . |

### Siehe auch

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* namensraum [Aspose.Gis](../../extent/)
* Montage [Aspose.GIS](../../../)


