---
title: Utbytbara symboler i sidhuvudet
linktitle: Utbytbara symboler i sidhuvudet
second_title: Aspose.PDF för .NET API Referens
description: Lär dig hur du använder utbytbara symboler i sidhuvudet och sidfoten i ett PDF-dokument med Aspose.PDF för .NET.
type: docs
weight: 320
url: /sv/net/programming-with-text/replaceable-symbols-in-header-footer/
---

I den här handledningen kommer vi att förklara hur man använder utbytbara symboler i sidhuvudet och sidfoten i ett PDF-dokument med hjälp av Aspose.PDF-biblioteket för .NET. Vi kommer att gå igenom steg-för-steg-processen för att skapa en PDF, ställa in marginaler, lägga till sidhuvud och sidfot med utbytbara symboler och spara PDF:en med den medföljande C#-källkoden.

## Förutsättningar

Innan du börjar, se till att du har följande:

- Aspose.PDF för .NET-biblioteket installerat.
- En grundläggande förståelse för C#-programmering.

## Steg 1: Konfigurera dokumentkatalogen

 Först måste du ställa in sökvägen till katalogen där du vill spara den genererade PDF-filen. Byta ut`"YOUR DOCUMENT DIRECTORY"` i`dataDir` variabel med sökvägen till din önskade katalog.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Steg 2: Skapa ett PDF-dokument och en sida

 Därefter skapar vi ett nytt PDF-dokument och lägger till en sida till det med hjälp av`Document` klass och`Page` klass från Aspose.PDF-biblioteket.

```csharp
Document doc = new Document();
Page page = doc.Pages.Add();
```

## Steg 3: Ställ in marginaler

 Vi ställer in marginalerna för sidan med hjälp av`MarginInfo` klass. Justera marginalvärdena enligt dina krav.

```csharp
MarginInfo marginInfo = new MarginInfo();
marginInfo.Top = 90;
marginInfo.Bottom = 50;
marginInfo.Left = 50;
marginInfo.Right = 50;
page.PageInfo.Margin = marginInfo;
```

## Steg 4: Lägg till rubrik med utbytbara symboler

 Vi skapar en`HeaderFooter` objekt för sidan och lägg till en`TextFragment` med utbytbara symboler.

```csharp
HeaderFooter hfFirst = new HeaderFooter();
page.Header = hfFirst;
hfFirst.Margin.Left = 50;
hfFirst.Margin.Right = 50;

TextFragment t1 = new TextFragment("report title");
// Ställ in textegenskaper om så önskas
t1.TextState.Font = FontRepository.FindFont("Arial");
t1.TextState.FontSize = 16;
t1.TextState.ForegroundColor = Aspose.Pdf.Color.Black;
t1.TextState.FontStyle = FontStyles.Bold;
t1.TextState.HorizontalAlignment = Aspose.Pdf.HorizontalAlignment.Center;
t1.TextState.LineSpacing = 5f;

hfFirst.Paragraphs.Add(t1);

// Lägg till fler textfragment eller anpassa efter behov
```

## Steg 5: Lägg till sidfot med utbytbara symboler

 På samma sätt skapar vi en`HeaderFooter` objekt för sidfoten och lägg till`TextFragment` föremål med utbytbara symboler.

```csharp
HeaderFooter hfFoot = new HeaderFooter();
page.Footer = hfFoot;
hfFoot.Margin.Left = 50;
hfFoot.Margin.Right = 50;

TextFragment t3 = new TextFragment("Generated on test date");
TextFragment t4 = new TextFragment("report name ");
TextFragment t5 = new TextFragment("Page $p of $P");

// Lägg till fler textfragment eller anpassa efter behov

hfFoot.Paragraphs.Add(tab2);
```

## Steg 6: Spara PDF-dokumentet

Slutligen sparar vi PDF-dokumentet till den angivna utdatafilen.

```csharp
dataDir = dataDir + "ReplaceableSymbolsInHeaderFooter_out.pdf";
doc.Save(dataDir);
Console.WriteLine("\nReplaceable symbols replaced successfully in the header and footer.\nFile saved at " + dataDir);
```

### Exempel på källkod för utbytbara symboler i sidhuvud med Aspose.PDF för .NET 
```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();
Page page = doc.Pages.Add();
MarginInfo marginInfo = new MarginInfo();
marginInfo.Top = 90;
marginInfo.Bottom = 50;
marginInfo.Left = 50;
marginInfo.Right = 50;
// Tilldela marginInfo-instansen Margin-egenskapen för sec1.PageInfo
page.PageInfo.Margin = marginInfo;
HeaderFooter hfFirst = new HeaderFooter();
page.Header = hfFirst;
hfFirst.Margin.Left = 50;
hfFirst.Margin.Right = 50;
// Instantiera ett textstycke som lagrar innehållet för att visas som rubrik
TextFragment t1 = new TextFragment("report title");
t1.TextState.Font = FontRepository.FindFont("Arial");
t1.TextState.FontSize = 16;
t1.TextState.ForegroundColor = Aspose.Pdf.Color.Black;
t1.TextState.FontStyle = FontStyles.Bold;
t1.TextState.HorizontalAlignment = Aspose.Pdf.HorizontalAlignment.Center;
t1.TextState.LineSpacing = 5f;
hfFirst.Paragraphs.Add(t1);
TextFragment t2 = new TextFragment("Report_Name");
t2.TextState.Font = FontRepository.FindFont("Arial");
t2.TextState.ForegroundColor = Aspose.Pdf.Color.Black;
t2.TextState.HorizontalAlignment = Aspose.Pdf.HorizontalAlignment.Center;
t2.TextState.LineSpacing = 5f;
t2.TextState.FontSize = 12;
hfFirst.Paragraphs.Add(t2);
// Skapa ett HeaderFooter-objekt för avsnittet
HeaderFooter hfFoot = new HeaderFooter();
// Ställ in HeaderFooter-objektet till udda och jämna sidfot
page.Footer = hfFoot;
hfFoot.Margin.Left = 50;
hfFoot.Margin.Right = 50;
// Lägg till ett textstycke som innehåller aktuellt sidnummer av totalt antal sidor
TextFragment t3 = new TextFragment("Generated on test date");
TextFragment t4 = new TextFragment("report name ");
TextFragment t5 = new TextFragment("Page $p of $P");
// Instantiera ett tabellobjekt
Table tab2 = new Table();
// Lägg till tabellen i styckesamlingen av önskat avsnitt
hfFoot.Paragraphs.Add(tab2);
// Ställ in med tabellens kolumnbredder
tab2.ColumnWidths = "165 172 165";
// Skapa rader i tabellen och sedan celler i raderna
Row row3 = tab2.Rows.Add();
row3.Cells.Add();
row3.Cells.Add();
row3.Cells.Add();
// Ställ in den vertikala justeringen av texten som mittjusterad
row3.Cells[0].Alignment = Aspose.Pdf.HorizontalAlignment.Left;
row3.Cells[1].Alignment = Aspose.Pdf.HorizontalAlignment.Center;
row3.Cells[2].Alignment = Aspose.Pdf.HorizontalAlignment.Right;
row3.Cells[0].Paragraphs.Add(t3);
row3.Cells[1].Paragraphs.Add(t4);
row3.Cells[2].Paragraphs.Add(t5);
//Sec1.Paragraphs.Add(New Text("Aspose.Total för Java är en sammanställning av alla Java-komponenter som erbjuds av Aspose. Den kompileras på en #$NL" + "daglig basis för att säkerställa att den innehåller de mest uppdaterade versionerna av varje av våra Java-komponenter. #$NL " + "Genom att använda Aspose.Total för Java kan utvecklare skapa ett brett utbud av applikationer. #$NL #$NL #$NP" + "Aspose.Total för Java är en sammanställning av alla Java-komponenter erbjuds av Aspose. Den sammanställs dagligen #$NL" + "för att säkerställa att den innehåller de senaste versionerna av var och en av våra Java-komponenter. #$NL " + "Genom att använda Aspose.Total för Java-utvecklare kan du skapa en bred utbud av applikationer. #$NL #$NL #$NP" + "Aspose.Total för Java är en sammanställning av alla Java-komponenter som erbjuds av Aspose. Den kompileras på en#$NL" + "daglig basis för att säkerställa att den innehåller det mesta uppdaterade versioner av var och en av våra Java-komponenter. #$NL " + "Att använda Aspose.Total för Java kan utvecklare skapa ett brett utbud av applikationer. #$NL #$NL"))
Table table = new Table();
table.ColumnWidths = "33% 33% 34%";
table.DefaultCellPadding = new MarginInfo();
table.DefaultCellPadding.Top = 10;
table.DefaultCellPadding.Bottom = 10;
// Lägg till tabellen i styckesamlingen av önskat avsnitt
page.Paragraphs.Add(table);
// Ställ in standardcellkant med hjälp av BorderInfo-objektet
table.DefaultCellBorder = new BorderInfo(BorderSide.All, 0.1f);
// Ställ in tabellkanten med ett annat anpassat BorderInfo-objekt
table.Border = new BorderInfo(BorderSide.All, 1f);
table.RepeatingRowsCount = 1;
// Skapa rader i tabellen och sedan celler i raderna
Row row1 = table.Rows.Add();
row1.Cells.Add("col1");
row1.Cells.Add("col2");
row1.Cells.Add("col3");
const string CRLF = "\r\n";
for (int i = 0; i <= 10; i++)
{
	Row row = table.Rows.Add();
	row.IsRowBroken = true;
	for (int c = 0; c <= 2; c++)
	{
		Cell c1;
		if (c == 2)
			c1 = row.Cells.Add("Aspose.Total for Java is a compilation of every Java component offered by Aspose. It is compiled on a" + CRLF + "daily basis to ensure it contains the most up to date versions of each of our Java components. " + CRLF + "daily basis to ensure it contains the most up to date versions of each of our Java components. " + CRLF + "Using Aspose.Total for Java developers can create a wide range of applications.");
		else
			c1 = row.Cells.Add("item1" + c);
		c1.Margin = new MarginInfo();
		c1.Margin.Left = 30;
		c1.Margin.Top = 10;
		c1.Margin.Bottom = 10;
	}
}
dataDir = dataDir + "ReplaceableSymbolsInHeaderFooter_out.pdf";
doc.Save(dataDir);
Console.WriteLine("\nSymbols replaced successfully in header and footer.\nFile saved at " + dataDir);
```

## Slutsats

den här handledningen har du lärt dig hur du använder utbytbara symboler i sidhuvudet och sidfoten i ett PDF-dokument med Aspose.PDF-biblioteket för .NET. Genom att följa den steg-för-steg-guide och exekvera den medföljande C#-koden kan du skapa en PDF, ställa in marginaler, lägga till sidhuvud och sidfot med utbytbara symboler och spara PDF:en.