---
title: ShapefileDriver.EditLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: ShapefileDriver méthode. Ouvre un calque pour modification.
type: docs
weight: 50
url: /fr/net/aspose.gis.formats.shapefile/shapefiledriver/editlayer/
---
## EditLayer(AbstractPath, DriverOptions) {#editlayer}

Ouvre un calque pour modification.

```csharp
public override VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | DriverOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../../aspose.gis/gisexception/) | Erreur lors de la lecture de la fonctionnalité à partir du fichier. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [ShapefileDriver](../)
* espace de noms [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* Assemblée [Aspose.GIS](../../../)

---

## EditLayer(string, ShapefileOptions) {#editlayer_3}

Ouvre un calque pour modification.

```csharp
public VectorLayer EditLayer(string path, ShapefileOptions options = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| options | ShapefileOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* espace de noms [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* Assemblée [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, ShapefileOptions) {#editlayer_1}

Ouvre un calque pour modification.

```csharp
public VectorLayer EditLayer(AbstractPath path, ShapefileOptions options = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | ShapefileOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [ShapefileOptions](../../shapefileoptions/)
* class [ShapefileDriver](../)
* espace de noms [Aspose.Gis.Formats.Shapefile](../../shapefiledriver/)
* Assemblée [Aspose.GIS](../../../)


