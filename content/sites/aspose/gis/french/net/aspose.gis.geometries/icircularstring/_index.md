---
title: Interface ICircularString
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Geometries.ICircularString interface. Une courbe à plusieurs sommets avec interpolation circulaire entre les points.
type: docs
weight: 960
url: /fr/net/aspose.gis.geometries/icircularstring/
---
## ICircularString interface

Une courbe à plusieurs sommets avec interpolation circulaire entre les points.

```csharp
public interface ICircularString : ICurve, IEquatable<ICircularString>, IReadOnlyList<IPoint>
```

## Méthodes

| Nom | La description |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icircularstring/toeditable/)() | Obtient une copie modifiable de cette géométrie. |

### Remarques

Le`Chaîne circulaire` consiste en un ou plusieurs segments d'arc de cercle connectés bout à bout. Les trois premiers points définissent le premier segment. Le premier point est le point de départ de l'arc. Le deuxième point est tout point intermédiaire de l'arc autre que le point de départ ou d'arrivée. Le troisième point est la fin de l'arc. Les arcs suivants sont définis uniquement par leurs points intermédiaires et finaux, car le point de départ est implicitement défini comme le point final du segment précédent.

### Voir également

* interface [ICurve](../icurve/)
* interface [IPoint](../ipoint/)
* espace de noms [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* Assemblée [Aspose.GIS](../../)


