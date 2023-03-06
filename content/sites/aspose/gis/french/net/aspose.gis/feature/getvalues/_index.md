---
title: Feature.GetValues
second_title: Référence de l'API Aspose.GIS pour .NET
description: Feature méthode. Renvoie les valeurs de tous les attributs dun tableau.
type: docs
weight: 50
url: /fr/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

Renvoie les valeurs de tous les attributs d'un tableau.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| values | Object[] | Le tableau dans lequel copier les valeurs des attributs. |
| defaultValue | Object | La valeur à renvoyer si la valeur de l'attribut est manquante (non définie). La valeur par défaut est`null`. Pensez à utiliser 'DBNull.Value' pour séparer 'unset' et '`null` valeurs. |

### Return_Value

Plusieurs attributs copiés.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| InvalidOperationException | L'attribut n'est pas verrouillé. |

### Remarques

Les attributs de valeurs de la fonctionnalité sont copiés dans le tableau de valeurs qui est passé en tant que paramètre. Pour les attributs avec une valeur non définie, le paramètre 'unsetValue' spécifié est renvoyé.  La longueur du tableau de valeurs n'a pas besoin de correspondre au nombre d'attributs dans l'entité. Si la longueur du tableau est supérieure au nombre d'attributs, toutes les valeurs d'attribut sont copiées dans le tableau ; si elle est inférieure, seul le nombre de longueurs de tableau des valeurs d'attribut est copié dans le tableau, en commençant par la valeur d'attribut avec l'ordinal 0.

### Voir également

* class [Feature](../)
* espace de noms [Aspose.Gis](../../feature/)
* Assemblée [Aspose.GIS](../../../)


