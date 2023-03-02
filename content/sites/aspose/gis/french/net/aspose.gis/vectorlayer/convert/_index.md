---
title: VectorLayer.Convert
second_title: Référence de l'API Aspose.GIS pour .NET
description: VectorLayer méthode. Convertir un calque dans un format différent.
type: docs
weight: 200
url: /fr/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

Convertir un calque dans un format différent.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| sourcePath | String | Chemin d'accès au calque qui sera converti. |
| sourceDriver | FileDriver | Le pilote de format pour la couche source. |
| destinationPath | String | Chemin d'accès au calque qui sera créé à la suite de la conversion. |
| destinationDriver | FileDriver | Le pilote de format pour la couche de destination. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'un ou l'autre des chemins est`null`. |

### Voir également

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

Convertir un calque dans un format différent.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| sourcePath | AbstractPath | Chemin d'accès au calque qui sera converti. |
| sourceDriver | FileDriver | Le pilote de format pour la couche source. |
| destinationPath | AbstractPath | Chemin d'accès au calque qui sera créé à la suite de la conversion. |
| destinationDriver | FileDriver | Le pilote de format pour la couche de destination. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'un ou l'autre des chemins est`null`. |

### Voir également

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

Convertir un calque dans un format différent.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| sourcePath | String | Chemin d'accès au calque qui sera converti. |
| sourceDriver | FileDriver | Le pilote de format pour la couche source. |
| destinationPath | String | Chemin d'accès au calque qui sera créé à la suite de la conversion. |
| destinationDriver | FileDriver | Le pilote de format pour la couche de destination. |
| options | ConversionOptions | Options pour la procédure de conversion. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'un ou l'autre des chemins est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception/) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Système de référence spatiale spécifié dans*options* n'est pas pris en charge par*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Échec de la transformation de la géométrie des entités du système de référence spatiale source vers le système de référence spatiale cible. |

### Voir également

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

Convertir un calque dans un format différent.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| sourcePath | AbstractPath | Chemin d'accès au calque qui sera converti. |
| sourceDriver | FileDriver | Le pilote de format pour la couche source. |
| destinationPath | AbstractPath | Chemin d'accès au calque qui sera créé à la suite de la conversion. |
| destinationDriver | FileDriver | Le pilote de format pour la couche de destination. |
| options | ConversionOptions | Options pour la procédure de conversion. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'un ou l'autre des chemins est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception/) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Système de référence spatiale spécifié dans*options* n'est pas pris en charge par*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Échec de la transformation de la géométrie des entités du système de référence spatiale source vers le système de référence spatiale cible. |

### Voir également

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)


