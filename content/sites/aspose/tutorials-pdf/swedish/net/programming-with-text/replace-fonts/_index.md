---
title: Byt ut teckensnitt
linktitle: Byt ut teckensnitt
second_title: Aspose.PDF för .NET API Referens
description: Lär dig hur du ersätter teckensnitt i ett PDF-dokument med Aspose.PDF för .NET.
type: docs
weight: 340
url: /sv/net/programming-with-text/replace-fonts/
---

I den här handledningen kommer vi att förklara hur du byter ut specifika teckensnitt i ett PDF-dokument med hjälp av Aspose.PDF-biblioteket för .NET. Vi kommer att gå igenom steg-för-steg-processen för att ladda ett PDF-dokument, söka efter textfragment, identifiera de typsnitt som ska ersättas, ersätta teckensnitten och spara den modifierade PDF-filen med den medföljande C#-källkoden.

## Förutsättningar

Innan du börjar, se till att du har följande:

- Aspose.PDF för .NET-biblioteket installerat.
- En grundläggande förståelse för C#-programmering.

## Steg 1: Konfigurera dokumentkatalogen

 Först måste du ställa in sökvägen till katalogen där du har indata-PDF-filen. Byta ut`"YOUR DOCUMENT DIRECTORY"` i`dataDir`variabel med sökvägen till din PDF-fil.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Steg 2: Ladda PDF-dokumentet

 Därefter laddar vi PDF-dokumentet med hjälp av`Document` klass från Aspose.PDF-biblioteket.

```csharp
Document pdfDocument = new Document(dataDir + "ReplaceTextPage.pdf");
```

## Steg 3: Sök och ersätt teckensnitt

 Vi skapar en`TextFragmentAbsorber` objekt och ställ in redigeringsalternativet för att ta bort oanvända teckensnitt. Sedan accepterar vi absorbenten för alla sidor i PDF-dokumentet för att söka efter textfragment.

```csharp
TextFragmentAbsorber absorber = new TextFragmentAbsorber(new TextEditOptions(TextEditOptions.FontReplace.RemoveUnusedFonts));
pdfDocument.Pages.Accept(absorber);
```

## Steg 4: Byt ut teckensnitt

Vi går igenom alla textfragment som identifieras av absorbatorn. Om teckensnittsnamnet på ett textfragment matchar det teckensnitt som ska ersättas, ersätter vi det med det nya teckensnittet.

```csharp
foreach (TextFragment textFragment in absorber.TextFragments)
{
    if (textFragment.TextState.Font.FontName == "Arial,Bold")
    {
        textFragment.TextState.Font = FontRepository.FindFont("Arial");
    }
}
```

## Steg 5: Spara den modifierade PDF-filen

Slutligen sparar vi det modifierade PDF-dokumentet till den angivna utdatafilen.

```csharp
dataDir = dataDir + "ReplaceFonts_out.pdf";
pdfDocument.Save(dataDir);
Console.WriteLine("\nFonts replaced successfully in the PDF document.\nFile saved at " + dataDir);
```

### Exempel på källkod för Ersätt teckensnitt med Aspose.PDF för .NET 
```csharp
try
{
	// Sökvägen till dokumentkatalogen.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// Ladda käll-PDF-fil
	Document pdfDocument = new Document(dataDir + "ReplaceTextPage.pdf");
	// Sök efter textfragment och ställ in redigeringsalternativ som ta bort oanvända teckensnitt
	TextFragmentAbsorber absorber = new TextFragmentAbsorber(new TextEditOptions(TextEditOptions.FontReplace.RemoveUnusedFonts));
	// Acceptera absorbenten för alla sidor
	pdfDocument.Pages.Accept(absorber);
	// Gå igenom alla textfragment
	foreach (TextFragment textFragment in absorber.TextFragments)
	{
		// Om teckensnittsnamnet är ArialMT, ersätt teckensnittsnamnet med Arial
		if (textFragment.TextState.Font.FontName == "Arial,Bold")
		{
			textFragment.TextState.Font = FontRepository.FindFont("Arial");
		}
	}
	dataDir = dataDir + "ReplaceFonts_out.pdf";
	// Spara uppdaterat dokument
	pdfDocument.Save(dataDir);
	Console.WriteLine("\nFonts replaced successfully in pdf document.\nFile saved at " + dataDir);
}
catch (Exception ex)
{
	Console.WriteLine(ex.Message + "\nThis example will only work if you apply a valid Aspose License. You can purchase full license or get 30 day temporary license from http:// Www.aspose.com/purchase/default.aspx.");
}
```

## Slutsats

I den här handledningen har du lärt dig hur du byter ut specifika teckensnitt i ett PDF-dokument med hjälp av Aspose.PDF-biblioteket för .NET. Genom att följa steg-för-steg-guiden och köra den medföljande C#-koden kan du ladda ett PDF-dokument, söka efter textfragment, identifiera och ersätta specifika teckensnitt och spara den modifierade PDF-filen.