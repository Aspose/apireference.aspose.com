---
title: PdfSaveOptions.UseCoreFonts
linktitle: UseCoreFonts
articleTitle: UseCoreFonts
second_title: Aspose.Words för .NET
description: PdfSaveOptions UseCoreFonts fast egendom. Hämtar eller ställer in ett värde som avgör om TrueTypeteckensnitten Arial Times New Roman Courier New och Symbol ska ersättas med kärnPDF Type 1teckensnitt i C#.
type: docs
weight: 310
url: /sv/net/aspose.words.saving/pdfsaveoptions/usecorefonts/
---
## PdfSaveOptions.UseCoreFonts property

Hämtar eller ställer in ett värde som avgör om TrueType-teckensnitten Arial, Times New Roman, Courier New och Symbol ska ersättas med kärn-PDF Type 1-teckensnitt.

```csharp
public bool UseCoreFonts { get; set; }
```

## Anmärkningar

Standardvärdet är`falsk` . När detta värde är satt till`Sann` Teckensnitten Arial, Times New Roman, Courier New och Symbol ersätts i PDF-dokument med motsvarande typsnitt typ 1.

Grundläggande PDF-teckensnitt, eller deras teckensnittsmått och lämpliga ersättningsteckensnitt, måste vara tillgängliga för any PDF-visningsprogram.

Den här inställningen fungerar endast för text i ANSI-kodning (Windows-1252). Icke-ANSI-text kommer att skrivas med inbäddat TrueType-teckensnitt oavsett denna inställning.

PDF/A- och PDF/UA-kompatibilitet kräver att alla teckensnitt är inbäddade.`falsk` värde kommer att användas automatiskt när du sparar till PDF/A och PDF/UA.

Kärnteckensnitt stöds inte när du sparar till PDF 2.0-format.`falsk` värde kommer att användas automatiskt när du sparar till PDF 2.0.

Detta alternativ har högre prioritet då[`FontEmbeddingMode`](../fontembeddingmode/) alternativ.

## Exempel

Visar hur du aktiverar/inaktiverar PDF Typ 1-teckensnittsersättning.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Font.Name = "Arial";
builder.Writeln("Hello world!");
builder.Font.Name = "Courier New";
builder.Writeln("The quick brown fox jumps over the lazy dog.");

// Skapa ett "PdfSaveOptions"-objekt som vi kan skicka till dokumentets "Spara"-metod
// för att ändra hur den metoden konverterar dokumentet till .PDF.
PdfSaveOptions options = new PdfSaveOptions();

// Ställ in egenskapen "UseCoreFonts" till "true" för att ersätta vissa teckensnitt,
// inklusive de två typsnitten i vårt dokument, med deras PDF Type 1-ekvivalenter.
// Ställ in egenskapen "UseCoreFonts" på "false" för att inte tillämpa PDF Typ 1-teckensnitt.
options.UseCoreFonts = useCoreFonts;

doc.Save(ArtifactsDir + "PdfSaveOptions.EmbedCoreFonts.pdf", options);

if (useCoreFonts)
    Assert.That(3000, Is.AtLeast(new FileInfo(ArtifactsDir + "PdfSaveOptions.EmbedCoreFonts.pdf").Length));
else
    Assert.That(30000, Is.LessThan(new FileInfo(ArtifactsDir + "PdfSaveOptions.EmbedCoreFonts.pdf").Length));
```

### Se även

* class [PdfSaveOptions](../)
* namnutrymme [Aspose.Words.Saving](../../../aspose.words.saving/)
* hopsättning [Aspose.Words](../../../)
