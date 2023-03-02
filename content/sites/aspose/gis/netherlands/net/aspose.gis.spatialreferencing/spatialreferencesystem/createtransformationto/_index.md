---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Aspose.GIS voor .NET API-referentie
description: SpatialReferenceSystem methode. Creëert hieruit een transformatieRuimtelijk ReferentieSysteem naar een anderRuimtelijk ReferentieSysteem .
type: docs
weight: 180
url: /nl/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Creëert hieruit een transformatie`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Een andere`Ruimtelijk ReferentieSysteem`. |

### Winstwaarde

Transformatie hiervan`Ruimtelijk ReferentieSysteem` naar een ander`Ruimtelijk ReferentieSysteem`.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| NotSupportedException | Transformatie tussen dit`Ruimtelijk ReferentieSysteem` en argument wordt niet ondersteund. Dit kan gebeuren omdat een van de projecties niet wordt ondersteund, of een van de systemen is[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) of [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | Transformatie kan niet worden gemaakt vanwege verkeerde parameters binnenin`Ruimtelijk ReferentieSysteem` . |

### Zie ook

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* naamruimte [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* montage [Aspose.GIS](../../../)


