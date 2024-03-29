---
title: CreateCustomActionLink
second_title: Référence de l'API Aspose.PDF pour .NET
description: Crée un lien vers des actions personnalisées dans le document PDF.
type: docs
weight: 140
url: /fr/net/aspose.pdf.facades/pdfcontenteditor/createcustomactionlink/
---
## PdfContentEditor.CreateCustomActionLink method

Crée un lien vers des actions personnalisées dans le document PDF.

```csharp
public void CreateCustomActionLink(Rectangle rect, int originalPage, Color color, Enum[] actionName)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| rect | Rectangle | Le rectangle pour le clic actif. |
| originalPage | Int32 | Le nombre de pages d'origine où le rectangle lié avec le lien sera créé. |
| color | Color | La couleur du rectangle pour le clic actif. |
| actionName | Enum[] | Tableau d'actions (membres de l'énumération PredefinedAction) correspondant à l'exécution d'éléments de menu dans Acrobat Viewer. |

### Exemples

```csharp
PdfContentEditor editor = new PdfContentEditor();
editor.BindPdf("example.pdf");
editor.CreateCustomActionLink(new System.Drawing.Rectangle(0, 0, 100, 100),
    1, System.Drawing.Color.Red,
    new Enum[] { PredefinedAction.FirstPage, PredefinedAction.PrintDialog });
editor.Save("example_out.pdf");
```

### Voir également

* class [PdfContentEditor](../../pdfcontenteditor)
* espace de noms [Aspose.Pdf.Facades](../../pdfcontenteditor)
* Assemblée [Aspose.PDF](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
