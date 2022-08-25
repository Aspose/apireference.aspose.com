---
title: Create
second_title: Référence de l'API Aspose.GIS pour .NET
description: Crée la couche et louvre pour ajouter de nouvelles fonctionnalités.
type: docs
weight: 10
url: /fr/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

Crée la couche et l'ouvre pour ajouter de nouvelles fonctionnalités.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| driver | FileDriver | Pilote à utiliser. |

### Return_Value

Une couche en écriture seule.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* espace de noms [Aspose.Gis](../../vectorlayer)
* Assemblée [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

Crée la couche et l'ouvre pour ajouter de nouvelles fonctionnalités.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| driver | FileDriver | Pilote à utiliser. |
| options | DriverOptions | Options spécifiques au pilote. |

### Return_Value

Une couche en écriture seule.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* espace de noms [Aspose.Gis](../../vectorlayer)
* Assemblée [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

Crée la couche et l'ouvre pour ajouter de nouvelles fonctionnalités.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| driver | FileDriver | Pilote à utiliser. |

### Return_Value

Une couche en écriture seule.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* espace de noms [Aspose.Gis](../../vectorlayer)
* Assemblée [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

Crée la couche et l'ouvre pour ajouter de nouvelles fonctionnalités.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| driver | FileDriver | Pilote à utiliser. |
| options | DriverOptions | Options spécifiques au pilote. |

### Return_Value

Une couche en écriture seule.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception) | Erreur lors de l'écriture de la fonctionnalité dans le fichier. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* espace de noms [Aspose.Gis](../../vectorlayer)
* Assemblée [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| driver | FileDriver | Pilote à utiliser. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. Utilisation[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) pour vérifier si le système de référence spatiale est pris en charge. |

### Voir également

* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* espace de noms [Aspose.Gis](../../vectorlayer)
* Assemblée [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| driver | FileDriver | Pilote à utiliser. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. Utilisation[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) pour vérifier si le système de référence spatiale est pris en charge. |

### Voir également

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* espace de noms [Aspose.Gis](../../vectorlayer)
* Assemblée [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au fichier. |
| driver | FileDriver | Pilote à utiliser. |
| options | DriverOptions | Options spécifiques au pilote. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. Utilisation[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) pour vérifier si le système de référence spatiale est pris en charge. |

### Voir également

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* espace de noms [Aspose.Gis](../../vectorlayer)
* Assemblée [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

Crée le calque et l'ouvre pour l'ajout.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au fichier. |
| driver | FileDriver | Pilote à utiliser. |
| options | DriverOptions | Options spécifiques au pilote. |
| spatialReferenceSystem | SpatialReferenceSystem | Système de référence spatiale. |

### Return_Value

Un exemple de[`VectorLayer`](../../vectorlayer).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| [GisException](../../gisexception) | Erreur lors de la lecture ou de l'écriture de la fonctionnalité vers/depuis le fichier. |
| IOException | Une erreur d'E/S s'est produite. |
| NotSupportedException | Le système de référence spatiale n'est pas pris en charge par le pilote. Utilisation[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem) pour vérifier si le système de référence spatiale est pris en charge. |

### Voir également

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* espace de noms [Aspose.Gis](../../vectorlayer)
* Assemblée [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
