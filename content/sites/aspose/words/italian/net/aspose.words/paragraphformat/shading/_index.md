---
title: ParagraphFormat.Shading
linktitle: Shading
articleTitle: Shading
second_title: Aspose.Words per .NET
description: ParagraphFormat Shading proprietà. Restituisce aShading oggetto che fa riferimento alla formattazione dellombreggiatura per il paragrafo in C#.
type: docs
weight: 280
url: /it/net/aspose.words/paragraphformat/shading/
---
## ParagraphFormat.Shading property

Restituisce a[`Shading`](../../shading/) oggetto che fa riferimento alla formattazione dell'ombreggiatura per il paragrafo.

```csharp
public Shading Shading { get; }
```

## Esempi

Mostra come decorare il testo con bordi e ombreggiature.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

BorderCollection borders = builder.ParagraphFormat.Borders;
borders.DistanceFromText = 20;
borders[BorderType.Left].LineStyle = LineStyle.Double;
borders[BorderType.Right].LineStyle = LineStyle.Double;
borders[BorderType.Top].LineStyle = LineStyle.Double;
borders[BorderType.Bottom].LineStyle = LineStyle.Double;

Shading shading = builder.ParagraphFormat.Shading;
shading.Texture = TextureIndex.TextureDiagonalCross;
shading.BackgroundPatternColor = Color.LightCoral;
shading.ForegroundPatternColor = Color.LightSalmon;

builder.Write("This paragraph is formatted with a double border and shading.");
doc.Save(ArtifactsDir + "DocumentBuilder.ApplyBordersAndShading.docx");
```

### Guarda anche

* class [Shading](../../shading/)
* class [ParagraphFormat](../)
* spazio dei nomi [Aspose.Words](../../../aspose.words/)
* assemblea [Aspose.Words](../../../)
