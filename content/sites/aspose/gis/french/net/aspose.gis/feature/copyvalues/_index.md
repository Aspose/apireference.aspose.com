---
title: Feature.CopyValues
second_title: Référence de l'API Aspose.GIS pour .NET
description: Feature méthode. Copie les valeurs des attributs dune autre entité.
type: docs
weight: 20
url: /fr/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

Copie les valeurs des attributs d'une autre entité.

```csharp
public void CopyValues(Feature inputFeature)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| inputFeature | Feature | Fonctionnalité à partir de laquelle copier les valeurs. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |
| ArgumentException | L'attribut portant ce nom n'existe pas dans cette couche. |
| InvalidOperationException | L'attribut n'est pas verrouillé. |
| InvalidOperationException | La valeur d'entrée est nulle et l'attribut de cette entité ne peut pas être nul. |
| [GisException](../../gisexception/) | Un attribut a le même nom mais des types de données différents dans les entités. |

### Remarques

Cette méthode copie uniquement les attributs avec des noms correspondants.

### Voir également

* class [Feature](../)
* espace de noms [Aspose.Gis](../../feature/)
* Assemblée [Aspose.GIS](../../../)


