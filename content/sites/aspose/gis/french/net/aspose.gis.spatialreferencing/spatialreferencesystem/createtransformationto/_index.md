---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Référence de l'API Aspose.GIS pour .NET
description: SpatialReferenceSystem méthode. Crée une transformation à partir de ceciSystème de référence spatiale à un autreSystème de référence spatiale .
type: docs
weight: 180
url: /fr/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Crée une transformation à partir de ceci`Système de référence spatiale` à un autre`Système de référence spatiale` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Un autre`Système de référence spatiale`. |

### Return_Value

Transformation de ce`Système de référence spatiale` à un autre`Système de référence spatiale`.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Transformation entre ceci`Système de référence spatiale` et l'argument n'est pas pris en charge. Cela peut arriver, car l'une des projections n'est pas prise en charge, ou l'un des systèmes est[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) ou [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | La transformation n'a pas pu être créée en raison de paramètres erronés à l'intérieur`Système de référence spatiale` . |

### Voir également

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* espace de noms [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* Assemblée [Aspose.GIS](../../../)


