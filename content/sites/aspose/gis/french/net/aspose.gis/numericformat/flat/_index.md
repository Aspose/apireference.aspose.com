---
title: NumericFormat.Flat
second_title: Référence de l'API Aspose.GIS pour .NET
description: NumericFormat méthode. Convertit un nombre en texte à virgule fixe sans notation scientifique.
type: docs
weight: 20
url: /fr/net/aspose.gis/numericformat/flat/
---
## NumericFormat.Flat method

Convertit un nombre en texte à virgule fixe sans notation scientifique.

```csharp
public static NumericFormat Flat(int significantDigits)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| significantDigits | Int32 | Nombre de chiffres significatifs. La précision maximale disponible est "308" |

### Return_Value

Le spécificateur de précision d'arrondi.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | Le nombre de chiffres significatifs est inférieur à 0 ou supérieur à 308. |

### Remarques

Le code interne génère des chaînes de nombres pour WKT via :ordinate.ToString("0.##..", CultureInfo.InvariantCulture) decision.

### Voir également

* class [NumericFormat](../)
* espace de noms [Aspose.Gis](../../numericformat/)
* Assemblée [Aspose.GIS](../../../)


