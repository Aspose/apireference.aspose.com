---
title: Tips om teckensnitt från PDF till PNG
linktitle: Tips om teckensnitt från PDF till PNG
second_title: Aspose.PDF för .NET API Referens
description: Steg för steg guide för att konvertera PDF till PNG med teckensnittstips med Aspose.PDF för .NET.
type: docs
weight: 160
url: /sv/net/document-conversion/pdf-to-png-font-hinting/
---
I den här handledningen går vi igenom processen att konvertera en PDF till PNG-bilder med Aspose.PDF för .NET, samtidigt som teckensnittstips aktiveras. Teckensnittstips är en teknik som förbättrar läsbarheten för små teckensnitt. Genom att följa stegen nedan kommer du att kunna konvertera varje sida i PDF:en till en PNG-bild med teckensnittstips.

## Förutsättningar
Innan du börjar, se till att du uppfyller följande förutsättningar:

- Grundläggande kunskaper i programmeringsspråket C#.
- Aspose.PDF-bibliotek för .NET installerat på ditt system.
- En utvecklingsmiljö som Visual Studio.

## Steg 1: Öppna PDF-källdokumentet
I det här steget kommer vi att öppna käll-PDF-filen med Aspose.PDF för .NET. Följ koden nedan:

```csharp
// Sökväg till dokumentkatalogen.
string dataDir = "YOUR DOCUMENTS DIRECTORY";
// Öppna dokumentet
Document pdfDocument = new Document(dataDir + "input.pdf");
```

 Se till att byta ut`"YOUR DOCUMENTS DIRECTORY"` med den faktiska katalogen där din PDF-fil finns.

## Steg 2: Aktivera teckensnittstips
Efter att ha öppnat PDF-filen kommer vi att aktivera teckensnittstips med hjälp av renderingsalternativen. Använd följande kod:

```csharp
// Skapa renderingsalternativ för att aktivera teckensnittstips
RenderingOptions opts = new RenderingOptions();
opts. UseFontHinting = true;
```

## Steg 3: Konvertera till PNG-bilder
Nu ska vi konvertera varje sida i PDF:en till en PNG-bild med teckensnittstips. Använd följande kod:

```csharp
for (int pageCount = 1; pageCount <= pdfDocument.Pages.Count; pageCount++)
{
     using (FileStream imageStream = new FileStream(dataDir + "image" + pageCount + "_out" + ".png", FileMode.Create))
     {
         // Skapa ett PNGDevice-objekt med de angivna attributen
         // Bredd, höjd, upplösning, kvalitet
         // Kvalitet [0-100], 100 är max
         // Skapa ett Resolution-objekt
         Resolution resolution = new Resolution(300);
         PngDevice pngDevice = new PngDevice(resolution);
         // Ställ in fördefinierade renderingsalternativ
         pngDevice.RenderingOptions = opts;

         // Konvertera en specifik sida och spara bilden i strömmen
         pngDevice.Process(pdfDocument.Pages[pageCount], imageStream);

         // Stäng strömmen
         imageStream.Close();
     }
}
```

Koden ovan konverterar varje sida i PDF-filen till en PNG-bild med teckensnittstips och sparar varje bild som en separat PNG-fil.

### Exempel på källkod för PDF till PNGFont Hinting med Aspose.PDF för .NET

```csharp
try
{
	
	// Sökvägen till dokumentkatalogen.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// Öppna dokumentet
	Document pdfDocument = new Document(dataDir + "input.pdf");
	// Skapa Aspose.Pdf.RenderingOptions för att aktivera teckensnittstips
	RenderingOptions opts = new RenderingOptions();
	opts.UseFontHinting = true;
	
	for (int pageCount = 1; pageCount <= pdfDocument.Pages.Count; pageCount++)
	{
		using (FileStream imageStream = new FileStream(dataDir + "image" + pageCount + "_out" + ".png", FileMode.Create))
		{
			// Skapa PNG-enhet med specificerade attribut
			// Bredd, höjd, upplösning, kvalitet
			// Kvalitet [0-100], 100 är max
			// Skapa upplösningsobjekt
			Resolution resolution = new Resolution(300);
			PngDevice pngDevice = new PngDevice(resolution);
			// Ställ in fördefinierade renderingsalternativ
			pngDevice.RenderingOptions = opts;

			//Konvertera en viss sida och spara bilden för att streama
			pngDevice.Process(pdfDocument.Pages[pageCount], imageStream);

			// Stäng strömmen
			imageStream.Close();
		}
	}
	
}
catch (Exception ex)
{
	Console.WriteLine(ex.Message);
}
```

## Slutsats
I den här handledningen täckte vi steg-för-steg-processen för att konvertera PDF till PNG-bilder med teckensnittstips med Aspose.PDF för .NET. Genom att följa instruktionerna ovan bör du nu kunna konvertera varje sida i PDF-filen till en PNG-bild med teckensnittstips. Den här funktionen är användbar när du vill behålla läsbarheten för små teckensnitt när du konverterar till PNG-bilder.

### FAQ's

#### F: Vad är teckensnittstips och varför är det viktigt när man konverterar PDF till PNG?

S: Teckensnittstips är en teknik som används för att förbättra läsbarheten för små teckensnitt genom att justera deras former och placering. När du konverterar PDF- till PNG-bilder säkerställer aktivering av teckensnittstips att texten i de resulterande PNG-bilderna förblir läsbar och tydlig, särskilt för små teckenstorlekar. Detta är viktigt för att bibehålla textens kvalitet och läsbarhet vid konvertering av PDF-dokument till bilder.

#### F: Hur påverkar teckensnittstips PNG-konverteringsprocessen?

S: Teckensnittstips påverkar hur texten renderas i de resulterande PNG-bilderna under konverteringsprocessen från PDF till PNG. Genom att aktivera teckensnittstips justerar Aspose.PDF-biblioteket teckensnittsrenderingen för att säkerställa att små teckensnitt behåller sin tydlighet och läsbarhet, vilket gör PNG-bilderna mer visuellt tilltalande och läsbara.

#### F: Kan jag justera inställningarna för teckensnittstips för att anpassa PNG-konverteringen?

 S: Ja, Aspose.PDF för .NET-biblioteket erbjuder alternativ för att anpassa PNG-konverteringsprocessen, inklusive inställningar för teckensnittstips. I det medföljande kodexemplet är`UseFontHinting` egendom av`RenderingOptions` objektet är inställt på`true` för att aktivera teckensnittstips. Du kan finjustera konverteringsprocessen ytterligare genom att justera andra egenskaper i`RenderingOptions` klass enligt dina krav.

#### F: Hur sparas PNG-bilderna i PNG-konverteringsprocessen?

S: I det medföljande kodexemplet konverteras varje sida i PDF-dokumentet till en separat PNG-bild. PNG-bilderna sparas som enskilda filer med filnamn efter mönstret "image{pageCount}_ out.png", där`{pageCount}` är numret på sidan som konverteras. Varje PNG-bild representerar en sida av det ursprungliga PDF-dokumentet.