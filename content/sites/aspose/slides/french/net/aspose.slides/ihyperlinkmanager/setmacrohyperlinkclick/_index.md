---
title: SetMacroHyperlinkClick
second_title: Référence de l'API Aspose.Slides pour .NET
description: Définir le lien hypertexte de la macro en un clic.
type: docs
weight: 70
url: /fr/net/aspose.slides/ihyperlinkmanager/setmacrohyperlinkclick/
---
## IHyperlinkManager.SetMacroHyperlinkClick method

Définir le lien hypertexte de la macro en un clic.

```csharp
public IHyperlink SetMacroHyperlinkClick(string macroName)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| macroName | String | Nom de la macro |

### Return_Value

Objet lien hypertexte[`IHyperlink`](../../ihyperlink)

### Exemples

```csharp
[C#]
using (Presentation presentation = new Presentation())
{
    IAutoShape shape = presentation.Slides[0].Shapes.AddAutoShape(ShapeType.BlankButton, 20, 20, 80, 30);
    shape.HyperlinkManager.SetMacroHyperlinkClick("MacroName");
}
```

### Voir également

* interface [IHyperlink](../../ihyperlink)
* interface [IHyperlinkManager](../../ihyperlinkmanager)
* espace de noms [Aspose.Slides](../../ihyperlinkmanager)
* Assemblée [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
