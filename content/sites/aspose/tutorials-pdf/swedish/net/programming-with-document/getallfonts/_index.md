---
title: Hämta alla teckensnitt i PDF-fil
linktitle: Hämta alla teckensnitt i PDF-fil
second_title: Aspose.PDF för .NET API Referens
description: Lär dig hur du använder Aspose.PDF för .NET för att få alla teckensnitt som används i en PDF-fil programmatiskt med denna steg-för-steg-guide och exempelkod.
type: docs
weight: 160
url: /sv/net/programming-with-document/getallfonts/
---
Aspose.PDF för .NET är ett kraftfullt bibliotek som gör det möjligt för utvecklare att arbeta med PDF-filer programmatiskt. En av funktionerna som det ger är möjligheten att få alla teckensnitt som används i en PDF-fil. Detta kan vara användbart om du behöver programmera analysera eller manipulera teckensnitten i en PDF-fil.

I den här handledningen kommer vi att diskutera hur man använder Aspose.PDF för .NET för att få alla teckensnitt som används i ett PDF-dokument. Vi kommer att tillhandahålla en steg-för-steg-guide om hur du gör detta, tillsammans med exempel på källkod.

## Steg 1: Skapa en ny C# Console Application
För att komma igång, skapa en ny C# Console Application i Visual Studio. Du kan namnge det vad du vill. När projektet har skapats måste du lägga till en referens till Aspose.PDF för .NET-biblioteket.

## Steg 2: Importera Aspose.PDF-namnområdet
Lägg till följande kodrad överst i din C#-fil för att importera Aspose.PDF-namnrymden:

```csharp
using Aspose.Pdf;
```

## Steg 3: Ladda PDF-dokumentet
Ladda PDF-dokumentet som du vill hämta typsnitten från:

```csharp
Document doc = new Document(dataDir + "input.pdf");
```

## Steg 4: Hämta alla teckensnitt
Få alla teckensnitt som används i PDF-dokumentet:

```csharp
Aspose.Pdf.Text.Font[] fonts = doc.FontUtilities.GetAllFonts();
```

## Steg 5: Skriv ut alla teckensnitt
Skriv ut alla teckensnitt som används i PDF-dokumentet:

```csharp
foreach (Aspose.Pdf.Text.Font font in fonts)
{
    Console.WriteLine(font.FontName);
}
```

### Exempel på källkod för Get All Fonts med Aspose.PDF för .NET
```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "input.pdf");
Aspose.Pdf.Text.Font[] fonts = doc.FontUtilities.GetAllFonts();
foreach (Aspose.Pdf.Text.Font font in fonts)
{
    Console.WriteLine(font.FontName);
}
```

## Slutsats
den här handledningen har vi diskuterat hur man får alla teckensnitt som används i ett PDF-dokument med Aspose.PDF för .NET. Att få alla teckensnitt som används i ett PDF-dokument kan vara användbart om du behöver programmera analysera eller manipulera teckensnitten i ett PDF-dokument. Aspose.PDF för .NET tillhandahåller ett enkelt och lättanvänt API för att arbeta med PDF-dokument, inklusive att hämta alla teckensnitt som används i ett PDF-dokument.

### FAQ's

#### F: Varför skulle jag behöva få alla teckensnitt som används i ett PDF-dokument?

S: Att få alla teckensnitt som används i ett PDF-dokument kan vara användbart om du behöver programmera analysera eller manipulera teckensnitten för olika ändamål, till exempel typsnittsersättning eller teckensnittsanpassning.

#### F: Hur kan jag få alla teckensnitt som används i ett PDF-dokument med Aspose.PDF för .NET?

 S: Du kan få alla teckensnitt som används i ett PDF-dokument med Aspose.PDF för .NET genom att anropa`GetAllFonts` metod för`FontUtilities` klass. Denna metod returnerar en array av`Aspose.Pdf.Text.Font` objekt, som representerar de typsnitt som används i PDF-dokumentet.

#### F: Kan jag filtrera typsnitt baserat på vissa kriterier?

S: Ja, du kan filtrera typsnitt baserat på vissa kriterier med Aspose.PDF för .NET. Efter att ha fått alla teckensnitt kan du programmera analysera teckensnitten och tillämpa filtreringslogik efter behov.

#### F: Är Aspose.PDF för .NET kompatibelt med olika teckensnittsformat?

S: Ja, Aspose.PDF för .NET är kompatibel med olika teckensnittsformat, inklusive TrueType, OpenType och Type 1-teckensnitt. Det kan fungera med olika teckensnittsformat och hantera dem under manipulering av PDF-dokument.