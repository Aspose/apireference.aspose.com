---
title: VectorLayer.UseSpatialIndex
second_title: Référence de l'API Aspose.GIS pour .NET
description: VectorLayer méthode. Charge lindex spatial pour accélérer le filtrage par valeur dattribut dans les méthodes de filtrage telles queWhereIntersects etNearestTo. Si lindex nexiste pas le crée en premier. UtiliserforceRebuild pour forcer la recréation de lindex.
type: docs
weight: 190
url: /fr/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

Charge l'index spatial pour accélérer le filtrage par valeur d'attribut dans les méthodes de filtrage telles que[`WhereIntersects`](../../featuressequence/whereintersects/) et[`NearestTo`](../nearestto/). Si l'index n'existe pas, le crée en premier. Utiliser*forceRebuild* pour forcer la recréation de l'index.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| indexPath | String | Chemin d'accès au fichier d'index. |
| forceRebuild | Boolean | S'il faut recréer l'index même s'il existe déjà. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| IOException | Une erreur d'E/S s'est produite. |
| InvalidOperationException | L'index spatial est déjà chargé pour cette couche. |
| [GisException](../../gisexception/) | Le fichier existe et ce n'est pas un fichier d'index spatial créé par Aspose.GIS. |

### Voir également

* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

Charge l'index spatial pour accélérer le filtrage par valeur d'attribut dans les méthodes de filtrage telles que[`WhereIntersects`](../../featuressequence/whereintersects/) et[`NearestTo`](../nearestto/). Si l'index n'existe pas, le crée en premier. Utiliser*forceRebuild* pour forcer la recréation de l'index.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| indexPath | AbstractPath | Chemin d'accès au fichier d'index. |
| forceRebuild | Boolean | S'il faut recréer l'index même s'il existe déjà. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le chemin est`null`. |
| IOException | Une erreur d'E/S s'est produite. |
| InvalidOperationException | L'index spatial est déjà chargé pour cette couche. |
| [GisException](../../gisexception/) | Le fichier existe et ce n'est pas un fichier d'index spatial créé par Aspose.GIS. |

### Voir également

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* espace de noms [Aspose.Gis](../../vectorlayer/)
* Assemblée [Aspose.GIS](../../../)


