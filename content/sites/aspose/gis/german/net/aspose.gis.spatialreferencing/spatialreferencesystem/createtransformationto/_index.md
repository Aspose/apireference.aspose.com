---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Aspose.GIS für .NET-API-Referenz
description: SpatialReferenceSystem methode. Erstellt daraus eine TransformationSpatialReferenceSystem zum anderenSpatialReferenceSystem .
type: docs
weight: 180
url: /de/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Erstellt daraus eine Transformation`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Andere`SpatialReferenceSystem`. |

### Rückgabewert

Verwandlung daraus`SpatialReferenceSystem` zum anderen`SpatialReferenceSystem`.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| NotSupportedException | Transformation dazwischen`SpatialReferenceSystem` and argument is not supported. Dies kann passieren, weil eine der Projektionen nicht unterstützt wird oder eines der Systeme dies tut[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) oder [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | Transformation konnte aufgrund falscher Parameter nicht erstellt werden`SpatialReferenceSystem` . |

### Siehe auch

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* namensraum [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Montage [Aspose.GIS](../../../)


