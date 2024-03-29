---
title: OriginalWidthInch
second_title: Référence de l'API Aspose.Cells pour .NET
description: Obtient la largeur dorigine de limage en pouces.
type: docs
weight: 150
url: /fr/net/aspose.cells.drawing/picture/originalwidthinch/
---
## Picture.OriginalWidthInch property

Obtient la largeur d'origine de l'image, en pouces.

```csharp
public double OriginalWidthInch { get; }
```

### Exemples

```csharp

[C#]
//Instanciation d'un objet Workbook
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];
// Ajout d'une image à l'emplacement d'une cellule dont les indices de ligne et de colonne sont 1 dans la feuille de calcul. C'est la cellule "B2"
int imgIndex = worksheet.Pictures.Add(1, 1, "example.jpeg");
// Récupère l'objet image inséré
Picture pic = worksheet.Pictures[imgIndex];
// Obtient la largeur d'origine de l'image.
double picWidthInch = pic.OriginalWidthInch;
// Enregistrez le fichier excel.
workbook.Save("result.xlsx");
```

### Voir également

* class [Picture](../../picture)
* espace de noms [Aspose.Cells.Drawing](../../picture)
* Assemblée [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
