---
title: SaveTo
second_title: Référence de l'API Aspose.GIS pour .NET
description: Enregistre la séquence dentités dans la couche.
type: docs
weight: 50
url: /fr/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

Enregistre la séquence d'entités dans la couche.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| destinationPath | String | Chemin d'accès à la couche de sortie. |
| destinationDriver | FileDriver | Le pilote de format pour la couche de sortie. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Tout argument est`null`. |
| [GisException](../../gisexception) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Échec de la transformation de la géométrie des entités du système de référence spatiale source vers le système de référence spatiale cible. |

### Voir également

* class [FileDriver](../../filedriver)
* class [FeaturesSequence](../../featuressequence)
* espace de noms [Aspose.Gis](../../featuressequence)
* Assemblée [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

Enregistre la séquence d'entités dans la couche.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| destinationPath | AbstractPath | Chemin d'accès à la couche de sortie. |
| destinationDriver | FileDriver | Le pilote de format pour la couche de sortie. |

### Exceptions

| exception | condition |
| --- | --- |
| [GisException](../../gisexception) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Échec de la transformation de la géométrie des entités du système de référence spatiale source vers le système de référence spatiale cible. |

### Voir également

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [FeaturesSequence](../../featuressequence)
* espace de noms [Aspose.Gis](../../featuressequence)
* Assemblée [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

Enregistre la séquence d'entités dans la couche.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| destinationPath | String | Chemin d'accès à la couche de sortie. |
| destinationDriver | FileDriver | Le pilote de format pour la couche de sortie. |
| options | SavingOptions | Options pour la procédure de sauvegarde. |

### Exceptions

| exception | condition |
| --- | --- |
| [GisException](../../gisexception) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Échec de la transformation de la géométrie des entités du système de référence spatiale source vers le système de référence spatiale cible. |
| NotSupportedException | Système de référence spatiale spécifié dans*options*n'est pas pris en charge par*destinationDriver* . |

### Voir également

* class [FileDriver](../../filedriver)
* class [SavingOptions](../../savingoptions)
* class [FeaturesSequence](../../featuressequence)
* espace de noms [Aspose.Gis](../../featuressequence)
* Assemblée [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

Enregistre la séquence d'entités dans la couche.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| destinationPath | AbstractPath | Chemin d'accès à la couche de sortie. |
| destinationDriver | FileDriver | Le pilote de format pour la couche de sortie. |
| options | SavingOptions | Options pour la procédure de sauvegarde. |

### Exceptions

| exception | condition |
| --- | --- |
| [GisException](../../gisexception) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception) | Échec de la transformation de la géométrie des entités du système de référence spatiale source vers le système de référence spatiale cible. |
| NotSupportedException | Système de référence spatiale spécifié dans*options*n'est pas pris en charge par*destinationDriver* . |

### Voir également

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SavingOptions](../../savingoptions)
* class [FeaturesSequence](../../featuressequence)
* espace de noms [Aspose.Gis](../../featuressequence)
* Assemblée [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
