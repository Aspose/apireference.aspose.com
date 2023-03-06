---
title: EsriAsciiDriver.OpenLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: EsriAsciiDriver méthode. Ouvre le calque pour la lecture.
type: docs
weight: 20
url: /fr/net/aspose.gis.formats.esriascii/esriasciidriver/openlayer/
---
## OpenLayer(AbstractPath, RasterDriverOptions) {#openlayer_2}

Ouvre le calque pour la lecture.

```csharp
public override RasterLayer OpenLayer(AbstractPath path, RasterDriverOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | RasterDriverOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| ArgumentNullException | Le chemin est`null`. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas ouvrir les couches raster (voir[`CanOpenLayers`](../canopenlayers/)). |

### Voir également

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [RasterDriverOptions](../../../aspose.gis/rasterdriveroptions/)
* class [EsriAsciiDriver](../)
* espace de noms [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* Assemblée [Aspose.GIS](../../../)

---

## OpenLayer(string, EsriAsciiOptions) {#openlayer_4}

Ouvre un calque pour la lecture.

```csharp
public RasterLayer OpenLayer(string path, EsriAsciiOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| options | EsriAsciiOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Voir également

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [EsriAsciiOptions](../../esriasciioptions/)
* class [EsriAsciiDriver](../)
* espace de noms [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* Assemblée [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, EsriAsciiOptions) {#openlayer_1}

Ouvre un calque pour la lecture.

```csharp
public RasterLayer OpenLayer(AbstractPath path, EsriAsciiOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | EsriAsciiOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/).

### Voir également

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [EsriAsciiOptions](../../esriasciioptions/)
* class [EsriAsciiDriver](../)
* espace de noms [Aspose.Gis.Formats.EsriAscii](../../esriasciidriver/)
* Assemblée [Aspose.GIS](../../../)


