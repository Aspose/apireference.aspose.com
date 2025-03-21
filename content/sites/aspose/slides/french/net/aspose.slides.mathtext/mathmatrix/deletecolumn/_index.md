---
title: DeleteColumn
second_title: Référence de l'API Aspose.Slides pour .NET
description: Supprime la colonne spécifiée
type: docs
weight: 120
url: /fr/net/aspose.slides.mathtext/mathmatrix/deletecolumn/
---
## MathMatrix.DeleteColumn method

Supprime la colonne spécifiée

```csharp
public void DeleteColumn(int columnIndex)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| columnIndex | Int32 | Index de base zéro de la colonne à supprimer. |

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | Lorsque vous essayez de supprimer la dernière colonne unique de la matrice |
| ArgumentOutOfRangeException | Si columnIndex inférieur à zéro ou supérieur ou égal à ColumnCount |

### Exemples

Exemple :

```csharp
[C#]
IMathMatrix matrix = new MathMatrix(2, 3);
matrix.DeleteColumn(0);
```

### Voir également

* class [MathMatrix](../../mathmatrix)
* espace de noms [Aspose.Slides.MathText](../../mathmatrix)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
