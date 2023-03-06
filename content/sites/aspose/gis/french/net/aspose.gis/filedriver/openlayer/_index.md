---
title: FileDriver.OpenLayer
second_title: Référence de l'API Aspose.GIS pour .NET
description: FileDriver méthode. Ouvre le calque pour la lecture.
type: docs
weight: 90
url: /fr/net/aspose.gis/filedriver/openlayer/
---
## OpenLayer(string) {#openlayer_2}

Ouvre le calque pour la lecture.

```csharp
public VectorLayer OpenLayer(string path)
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
| [GisException](../../gisexception/) | Erreur lors de la lecture de la fonctionnalité à partir du fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas ouvrir les calques vectoriels (voir[`CanOpenLayers`](../canopenlayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath) {#openlayer}

Ouvre le calque pour la lecture.

```csharp
public VectorLayer OpenLayer(AbstractPath path)
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
| [GisException](../../gisexception/) | Erreur lors de la lecture de la fonctionnalité à partir du fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas ouvrir les calques vectoriels (voir[`CanOpenLayers`](../canopenlayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## OpenLayer(string, DriverOptions) {#openlayer_3}

Ouvre le calque pour la lecture.

```csharp
public VectorLayer OpenLayer(string path, DriverOptions options)
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
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de la fonctionnalité à partir du fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas ouvrir les calques vectoriels (voir[`CanOpenLayers`](../canopenlayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)

---

## OpenLayer(AbstractPath, DriverOptions) {#openlayer_1}

Ouvre le calque pour la lecture.

```csharp
public abstract VectorLayer OpenLayer(AbstractPath path, DriverOptions options)
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
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de la fonctionnalité à partir du fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le pilote ne peut pas ouvrir les calques vectoriels (voir[`CanOpenLayers`](../canopenlayers/)). |

### Voir également

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* espace de noms [Aspose.Gis](../../filedriver/)
* Assemblée [Aspose.GIS](../../../)


