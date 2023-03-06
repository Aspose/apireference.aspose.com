---
title: IGeometry.GetBuffer
second_title: Référence de l'API Aspose.GIS pour .NET
description: IGeometry méthode. Calcule une région tampon autour de cette géométrie.
type: docs
weight: 200
url: /fr/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

Calcule une région tampon autour de cette géométrie.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| distance | Double | La largeur de la région tampon (en unités de référence spatiale). |
| quadrantSegments | Int32 | Nombre de segments utilisés pour approximer une courbure de 90 degrés. Plus ce nombre est élevé, meilleure est l'approximation des courbes. La valeur par défaut est 30. |

### Return_Value

Une géométrie qui représente tous les points situés à une distance spécifiée de cette géométrie. Le type de résultat est soit[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) ou[`IMultiPolygon`](../../imultipolygon/) .

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | Cette géométrie est invalide de telle manière que l'opération ne peut pas être terminée. |
| ArgumentOutOfRangeException | Les segments du quadrant sont inférieurs ou égaux à 0. |

### Voir également

* interface [IGeometry](../)
* espace de noms [Aspose.Gis.Geometries](../../igeometry/)
* Assemblée [Aspose.GIS](../../../)


