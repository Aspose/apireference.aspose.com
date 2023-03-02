---
title: Class VectorMapLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: Aspose.Gis.Rendering.VectorMapLayer classe. Une couche à lintérieurMap qui représente une couche vectorielle data.
type: docs
weight: 2000
url: /fr/net/aspose.gis.rendering/vectormaplayer/
---
## VectorMapLayer class

Une couche à l'intérieur[`Map`](../map/) qui représente une couche vectorielle data.

```csharp
public class VectorMapLayer : MapLayer
```

## Constructeurs

| Nom | La description |
| --- | --- |
| [VectorMapLayer](vectormaplayer/#constructor)(FeaturesSequence) | Crée une nouvelle instance avec le symboliseur par défaut. |
| [VectorMapLayer](vectormaplayer/#constructor_1)(FeaturesSequence, VectorSymbolizer) | Crée une nouvelle instance avec le symboliseur par défaut. |
| [VectorMapLayer](vectormaplayer/#constructor_5)(VectorLayer, bool) | Crée une nouvelle instance avec le symboliseur par défaut. |
| [VectorMapLayer](vectormaplayer/#constructor_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Crée une nouvelle instance avec le symboliseur par défaut. |
| [VectorMapLayer](vectormaplayer/#constructor_4)(VectorLayer, VectorSymbolizer, bool) | Crée une nouvelle instance. |
| [VectorMapLayer](vectormaplayer/#constructor_3)(VectorLayer, VectorSymbolizer, Labeling, bool) | Crée une nouvelle instance. |

## Propriétés

| Nom | La description |
| --- | --- |
| [FeaturesSequence](../../aspose.gis.rendering/vectormaplayer/featuressequence/) { get; } | La séquence de caractéristiques représentée par ce`VecteurCarteCouche` . |
| [Labeling](../../aspose.gis.rendering/vectormaplayer/labeling/) { get; set; } | Spécifie les options de déformation de la couche de carte. |
| [Opacity](../../aspose.gis.rendering/maplayer/opacity/) { get; set; } | Opacité du calque. |
| [Symbolizer](../../aspose.gis.rendering/vectormaplayer/symbolizer/) { get; set; } | Symboliseur à utiliser pour rendre les entités de la couche. |

## Méthodes

| Nom | La description |
| --- | --- |
| override [Dispose](../../aspose.gis.rendering/vectormaplayer/dispose/)() | Dispose des ressources. |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld)(AbstractPath, SldImportOptions) | Importe le style à partir du fichier descripteur de calque stylisé situé au chemin spécifié. |
| [ImportSld](../../aspose.gis.rendering/vectormaplayer/importsld/#importsld_1)(string, SldImportOptions) | Importe le style à partir du fichier descripteur de calque stylisé situé au chemin spécifié. |
| [ImportSldFromString](../../aspose.gis.rendering/vectormaplayer/importsldfromstring/)(string, SldImportOptions) | Importe le style à partir de la chaîne de descripteur de calque stylisé spécifiée. |

### Voir également

* class [MapLayer](../maplayer/)
* espace de noms [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* Assemblée [Aspose.GIS](../../)


