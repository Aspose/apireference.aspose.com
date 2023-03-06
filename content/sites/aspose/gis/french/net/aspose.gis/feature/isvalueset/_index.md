---
title: Feature.IsValueSet
second_title: Référence de l'API Aspose.GIS pour .NET
description: Feature méthode. Vérifie si la valeur dattribut est définie dans cette fonctionnalité.
type: docs
weight: 90
url: /fr/net/aspose.gis/feature/isvalueset/
---
## Feature.IsValueSet method

Vérifie si la valeur d'attribut est définie dans cette fonctionnalité.

```csharp
public bool IsValueSet(string attributeName)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| attributeName | String | Nom de l'attribut. |

### Return_Value

`true`si la valeur de l'attribut spécifié est définie ; sinon,`false` .

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | L'attribut n'est pas verrouillé. |
| ArgumentException | L'attribut portant ce nom n'existe pas dans cette couche. |
| ArgumentNullException | Le nom de l'attribut est`null`. |

### Voir également

* class [Feature](../)
* espace de noms [Aspose.Gis](../../feature/)
* Assemblée [Aspose.GIS](../../../)


