---
title: TextEffectFormat
second_title: Référence de l'API Aspose.Cells pour .NET
description: Contient des propriétés et des méthodes qui sappliquent aux objets WordArt.
type: docs
weight: 2830
url: /fr/net/aspose.cells.drawing/texteffectformat/
---
## TextEffectFormat class

Contient des propriétés et des méthodes qui s'appliquent aux objets WordArt.

```csharp
public class TextEffectFormat
```

## Propriétés

| Nom | La description |
| --- | --- |
| [FontBold](../../aspose.cells.drawing/texteffectformat/fontbold) { get; set; } | Indique si la police est en gras. |
| [FontItalic](../../aspose.cells.drawing/texteffectformat/fontitalic) { get; set; } | Indique si la police est en italique. |
| [FontName](../../aspose.cells.drawing/texteffectformat/fontname) { get; set; } | Le nom de la police utilisée dans le WordArt. |
| [FontSize](../../aspose.cells.drawing/texteffectformat/fontsize) { get; set; } | La taille (en points) de la police utilisée dans le WordArt. |
| [PresetShape](../../aspose.cells.drawing/texteffectformat/presetshape) { get; set; } | Obtient et définit le type de forme prédéfini. |
| [RotatedChars](../../aspose.cells.drawing/texteffectformat/rotatedchars) { get; set; } | Si vrai, les caractères du WordArt spécifié sont pivotés de 90 degrés par rapport à la forme de délimitation du WordArt. |
| [Text](../../aspose.cells.drawing/texteffectformat/text) { get; set; } | Le texte dans le WordArt. |

## Méthodes

| Nom | La description |
| --- | --- |
| [SetTextEffect](../../aspose.cells.drawing/texteffectformat/settexteffect)(MsoPresetTextEffect) | Définit l'effet de texte prédéfini. |

### Exemples

```csharp

[C#]

//Instanciation d'un objet Workbook
Workbook workbook = new Workbook();
Aspose.Cells.Drawing.ShapeCollection shapes = workbook.Worksheets[0].Shapes;
shapes.AddTextEffect(MsoPresetTextEffect.TextEffect1, "Aspose", "Arial", 30, false, false, 0, 0, 0, 0, 100, 200);
TextEffectFormat textEffectFormat = shapes[0].TextEffect;
textEffectFormat.SetTextEffect(MsoPresetTextEffect.TextEffect10);
workbook.Save("Book1.xls");

[Visual Basic]

'Instanciation d'un objet Workbook
Dim workbook As Workbook = New Workbook()
Dim shapes As Aspose.Cells.Drawing.ShapeCollection = workbook.Worksheets(0).Shapes
shapes.AddTextEffect(MsoPresetTextEffect.TextEffect1, "Aspose", "Arial", 30, false, false, 0, 0, 0, 0, 100, 200)
Dim textEffectFormat As TextEffectFormat = shapes(0).TextEffect
TextEffectFormat.SetTextEffect(MsoPresetTextEffect.TextEffect10)
workbook.Save("Book1.xls")

```

### Voir également

* espace de noms [Aspose.Cells.Drawing](../../aspose.cells.drawing)
* Assemblée [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
