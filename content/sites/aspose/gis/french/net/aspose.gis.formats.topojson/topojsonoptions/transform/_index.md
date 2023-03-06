---
title: TopoJsonOptions.Transform
second_title: Référence de l'API Aspose.GIS pour .NET
description: TopoJsonOptions propriété. Spécifie lobjet de transformation à utiliser pour quantifier les coordonnées et encoder les arcs en delta dans la sortie TopoJSON.
type: docs
weight: 60
url: /fr/net/aspose.gis.formats.topojson/topojsonoptions/transform/
---
## TopoJsonOptions.Transform property

Spécifie l'objet de transformation à utiliser pour quantifier les coordonnées et encoder les arcs en delta dans la sortie TopoJSON.

```csharp
public TopoJsonTransform Transform { get; set; }
```

### Remarques

Ceci est une option d'écriture - cela n'affecte pas la lecture. Cette option est mutuellement exclusive avec[`QuantizationNumber`](../quantizationnumber/) - une seule de ces deux options ne peut pas être`null` . Si ce n'est pas`null` - Les coordonnées TopoJSON de sortie sont quantifiées et les arcs sont codés en delta avec l'objet de transformation spécifié . Reportez-vous à la spécification TopoJSON pour plus de détails sur l'objet de transformation. Par défaut à`null` .

### Voir également

* class [TopoJsonTransform](../../topojsontransform/)
* class [TopoJsonOptions](../)
* espace de noms [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* Assemblée [Aspose.GIS](../../../)


