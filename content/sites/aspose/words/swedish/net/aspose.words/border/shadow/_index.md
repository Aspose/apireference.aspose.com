---
title: Border.Shadow
linktitle: Shadow
articleTitle: Shadow
second_title: Aspose.Words för .NET
description: Border Shadow fast egendom. Hämtar eller ställer in ett värde som anger om gränsen har en skugga i C#.
type: docs
weight: 60
url: /sv/net/aspose.words/border/shadow/
---
## Border.Shadow property

Hämtar eller ställer in ett värde som anger om gränsen har en skugga.

```csharp
public bool Shadow { get; set; }
```

## Anmärkningar

Microsoft Word, för att en kantlinje ska ha en skugga, bör kanterna på alla fyra sidorna (vänster, topp, höger och botten) vara av samma typ, bredd, färg och alla ska ha egenskapen Shadow inställd på`Sann`.

## Exempel

Visar hur man skapar grön vågig sidkant med en skugga.

```csharp
Document doc = new Document();
PageSetup pageSetup = doc.Sections[0].PageSetup;

pageSetup.Borders.LineStyle = LineStyle.DoubleWave;
pageSetup.Borders.LineWidth = 2;
pageSetup.Borders.Color = Color.Green;
pageSetup.Borders.DistanceFromText = 24;
pageSetup.Borders.Shadow = true;

doc.Save(ArtifactsDir + "PageSetup.PageBorders.docx");
```

### Se även

* class [Border](../)
* namnutrymme [Aspose.Words](../../../aspose.words/)
* hopsättning [Aspose.Words](../../../)
