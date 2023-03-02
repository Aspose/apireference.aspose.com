---
title: Dataset.Open
second_title: Référence de l'API Aspose.GIS pour .NET
description: Dataset méthode. Ouvre le jeu de données.
type: docs
weight: 20
url: /fr/net/aspose.gis/dataset/open/
---
## Open(string, FileDriver) {#open_3}

Ouvre le jeu de données.

```csharp
public static Dataset Open(string path, FileDriver driver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au jeu de données. |
| driver | FileDriver | Pilote à utiliser. |

### Return_Value

Un exemple de[`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de l'ensemble de données. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* espace de noms [Aspose.Gis](../../dataset/)
* Assemblée [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

Ouvre le jeu de données.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au jeu de données. |
| driver | FileDriver | Pilote à utiliser. |

### Return_Value

Un exemple de[`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de l'ensemble de données. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* espace de noms [Aspose.Gis](../../dataset/)
* Assemblée [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_4}

Ouvre le jeu de données.

```csharp
public static Dataset Open(string path, FileDriver driver, DriverOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | String | Chemin d'accès au jeu de données. |
| driver | FileDriver | Pilote à utiliser. |
| options | DriverOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de l'ensemble de données. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* espace de noms [Aspose.Gis](../../dataset/)
* Assemblée [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

Ouvre le jeu de données.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| path | AbstractPath | Chemin d'accès au jeu de données. |
| driver | FileDriver | Pilote à utiliser. |
| options | DriverOptions | Options spécifiques au pilote. |

### Return_Value

Un exemple de[`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de l'ensemble de données. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* espace de noms [Aspose.Gis](../../dataset/)
* Assemblée [Aspose.GIS](../../../)

---

## Open(IDbConnection, DatabaseDriver) {#open_2}

Ouvre le jeu de données.

```csharp
public static Dataset Open(IDbConnection connection, DatabaseDriver driver)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| connection | IDbConnection | Connexion ouverte à la base de données. |
| driver | DatabaseDriver | Pilote à utiliser. |

### Return_Value

Un exemple de[`Dataset`](../).

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | L'objet Options a un type incorrect pour ce pilote. |
| ArgumentNullException | Le chemin est`null`. |
| [GisException](../../gisexception/) | Erreur lors de la lecture de l'ensemble de données. |
| IOException | Une erreur d'E/S s'est produite. |

### Voir également

* class [DatabaseDriver](../../databasedriver/)
* class [Dataset](../)
* espace de noms [Aspose.Gis](../../dataset/)
* Assemblée [Aspose.GIS](../../../)


