---
title: PageSetup.RightMargin
linktitle: RightMargin
articleTitle: RightMargin
second_title: Aspose.Words pour .NET
description: PageSetup RightMargin propriété. Renvoie ou définit la distance en points entre le bord droit de la page et la limite droite du corps du texte en C#.
type: docs
weight: 370
url: /fr/net/aspose.words/pagesetup/rightmargin/
---
## PageSetup.RightMargin property

Renvoie ou définit la distance (en points) entre le bord droit de la page et la limite droite du corps du texte.

```csharp
public double RightMargin { get; set; }
```

## Exemples

Montre comment ajuster le format du papier, l’orientation, les marges, ainsi que d’autres paramètres pour une section.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.PageSetup.PaperSize = PaperSize.Legal;
builder.PageSetup.Orientation = Orientation.Landscape;
builder.PageSetup.TopMargin = ConvertUtil.InchToPoint(1.0);
builder.PageSetup.BottomMargin = ConvertUtil.InchToPoint(1.0);
builder.PageSetup.LeftMargin = ConvertUtil.InchToPoint(1.5);
builder.PageSetup.RightMargin = ConvertUtil.InchToPoint(1.5);
builder.PageSetup.HeaderDistance = ConvertUtil.InchToPoint(0.2);
builder.PageSetup.FooterDistance = ConvertUtil.InchToPoint(0.2);

builder.Writeln("Hello world!");

doc.Save(ArtifactsDir + "PageSetup.PageMargins.docx");
```

### Voir également

* class [PageSetup](../)
* espace de noms [Aspose.Words](../../../aspose.words/)
* Assemblée [Aspose.Words](../../../)
