---
title: FileDriver.CreateLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: FileDriver méthode. Crée le calque et louvre pour lajout.
type: docs
weight: 60
url: /fr/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(string path)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas créer de calques vectoriels (voir[`CanCreateLayers`](../cancreatelayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas créer de calques vectoriels (voir[`CanCreateLayers`](../cancreatelayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| options | DriverOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception/) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas créer de calques vectoriels (voir[`CanCreateLayers`](../cancreatelayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | DriverOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception/) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas créer de calques vectoriels (voir[`CanCreateLayers`](../cancreatelayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. Utilisation[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) pour vérifier si le système de référence spatiale est pris en charge. |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. Utilisation[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) pour vérifier si le système de référence spatiale est pris en charge. |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| options | DriverOptions | Options spécifiques au pilote. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception/) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. Utilisation[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) pour vérifier si le système de référence spatiale est pris en charge. |
| NotSupportedException | Le pilote ne peut pas créer de calques vectoriels (voir[`CanCreateLayers`](../cancreatelayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| options | DriverOptions | Options spécifiques au pilote. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer/).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception/) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. Utilisation[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem/) pour vérifier si le système de référence spatiale est pris en charge. |
| NotSupportedException | Le pilote ne peut pas créer de calques vectoriels (voir[`CanCreateLayers`](../cancreatelayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)


