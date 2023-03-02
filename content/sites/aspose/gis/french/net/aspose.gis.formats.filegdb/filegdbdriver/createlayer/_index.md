---
title: FileGdbDriver.CreateLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: FileGdbDriver méthode. Crée une couche et louvre pour ajouter de nouvelles fonctionnalités.
type: docs
weight: 60
url: /fr/net/aspose.gis.formats.filegdb/filegdbdriver/createlayer/
---
## CreateLayer(string, FileGdbOptions) {#createlayer_8}

Crée une couche et l'ouvre pour ajouter de nouvelles fonctionnalités.

```csharp
public VectorLayer CreateLayer(string path, FileGdbOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| options | FileGdbOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | La couche existe déjà. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* espace de noms [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(string, FileGdbOptions, SpatialReferenceSystem) {#createlayer_9}

Crée un calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(string path, FileGdbOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| options | FileGdbOptions | Options spécifiques au pilote. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | La couche existe déjà. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [FileGdbOptions](../../filegdboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* espace de noms [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Crée un calque et l'ouvre pour l'ajout.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | DriverOptions | Options spécifiques au pilote. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | La couche existe déjà. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* espace de noms [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, FileGdbOptions, SpatialReferenceSystem) {#createlayer_3}

Crée un calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(AbstractPath path, FileGdbOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | FileGdbOptions | Options spécifiques au pilote. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | La couche existe déjà. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* espace de noms [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* Assemblée [Aspose.GIS](../../../)


