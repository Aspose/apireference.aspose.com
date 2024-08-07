---
title: Återge tabell i PDF-dokument
linktitle: Återge tabell i PDF-dokument
second_title: Aspose.PDF för .NET API Referens
description: Lär dig hur du visar en tabell i PDF-dokument med Aspose.PDF för .NET.
type: docs
weight: 170
url: /sv/net/programming-with-tables/render-table/
---
I den här handledningen guidar vi dig steg för steg för att visa en tabell i PDF-dokument med Aspose.PDF för .NET. Vi kommer att förklara den medföljande C#-källkoden och visa dig hur du implementerar den.

## Steg 1: Skapa dokumentet
Först skapar vi ett nytt PDF-dokument:

```csharp
// Sökväg till dokumentkatalogen
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Skapa ett nytt dokument
Document doc = new Document();
```

## Steg 2: Konfigurera sidmarginaler och orientering
Därefter konfigurerar vi sidmarginalerna och ställer in orienteringen till liggande läge:

```csharp
PageInfo pageInfo = doc.PageInfo;
Aspose.Pdf.MarginInfo marginInfo = pageInfo.Margin;

marginInfo. Left = 37;
marginInfo. Right = 37;
marginInfo. Top = 37;
marginInfo.Bottom = 37;

pageInfo.IsLandscape = true;
```

## Steg 3: Skapa tabellen och kolumnerna
Låt oss nu skapa en tabell och ställa in kolumnbredderna:

```csharp
Aspose.Pdf.Table table = new Aspose.Pdf.Table();
table. ColumnWidths = "50 100";
```

## Steg 4: Lägg till rader och celler i tabellen
Därefter lägger vi till rader och celler i tabellen med en loop:

```csharp
for (int i = 1; i <= 120; i++)
{
     Aspose.Pdf.Row row = table.Rows.Add();
     row. FixedRowHeight = 15;
     Aspose.Pdf.Cell cell1 = row.Cells.Add();
     cell1.Paragraphs.Add(new TextFragment("Content 1"));
     Aspose.Pdf.Cell cell2 = row.Cells.Add();
     cell2.Paragraphs.Add(new TextFragment("HHHHH"));
}
```

## Steg 5: Lägga till tabellen på sidan
Låt oss nu lägga till tabellen på dokumentsidan:

```csharp
Page curPage = doc.Pages.Add();
Aspose.Pdf.Paragraphs paragraphs = curPage.Paragraphs;
paragraphs. Add(table);
```

## Steg 6: Visa tabellen på en ny sida
Därefter skapar vi en ny tabell och ställer in egenskapen "IsInNewPage" till "true" för att visa tabellen på en ny sida:

```csharp
Aspose.Pdf.Table table1 = new Aspose.Pdf.Table();
table. ColumnWidths = "100 100";
for (int i = 1; i <= 10; i++)
{
     Aspose.Pdf.Row row = table1.Rows.Add();
     Aspose.Pdf.Cell cell1 = row.Cells.Add();
     cell1.Paragraphs.Add(new TextFragment("LAAAAAAA"));
     Aspose.Pdf.Cell cell2 = row.Cells.Add();
     cell2.Paragraphs.Add(new TextFragment("LAAGGGGGG"));
}
table1.IsInNewPage = true;
paragraphs. Add(table1);
```

## Steg 7: Spara PDF
Slutligen sparar vi PDF-dokumentet:

```csharp
dataDir = dataDir + "IsNewPageProperty_Test_out.pdf";
doc.Save(dataDir);

Console.WriteLine("\nTable displayed successfully on a page.\nFile saved at location: " + dataDir);
```

### Exempel på källkod för Render Table med Aspose.PDF för .NET

```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
PageInfo pageInfo = doc.PageInfo;
Aspose.Pdf.MarginInfo marginInfo = pageInfo.Margin;

marginInfo.Left = 37;
marginInfo.Right = 37;
marginInfo.Top = 37;
marginInfo.Bottom = 37;

pageInfo.IsLandscape = true;

Aspose.Pdf.Table table = new Aspose.Pdf.Table();
table.ColumnWidths = "50 100";
// Tillagd sida.
Page curPage = doc.Pages.Add();
for (int i = 1; i <= 120; i++)
{
	Aspose.Pdf.Row row = table.Rows.Add();
	row.FixedRowHeight = 15;
	Aspose.Pdf.Cell cell1 = row.Cells.Add();
	cell1.Paragraphs.Add(new TextFragment("Content 1"));
	Aspose.Pdf.Cell cell2 = row.Cells.Add();
	cell2.Paragraphs.Add(new TextFragment("HHHHH"));
}
Aspose.Pdf.Paragraphs paragraphs = curPage.Paragraphs;
paragraphs.Add(table);
/********************************************/
Aspose.Pdf.Table table1 = new Aspose.Pdf.Table();
table.ColumnWidths = "100 100";
for (int i = 1; i <= 10; i++)
{
	Aspose.Pdf.Row row = table1.Rows.Add();
	Aspose.Pdf.Cell cell1 = row.Cells.Add();
	cell1.Paragraphs.Add(new TextFragment("LAAAAAAA"));
	Aspose.Pdf.Cell cell2 = row.Cells.Add();
	cell2.Paragraphs.Add(new TextFragment("LAAGGGGGG"));
}
table1.IsInNewPage = true;
// Jag vill behålla tabell 1 till nästa sida...
paragraphs.Add(table1);
dataDir = dataDir + "IsNewPageProperty_Test_out.pdf";
doc.Save(dataDir);

Console.WriteLine("\nTable render successfully on a page.\nFile saved at " + dataDir);
```

## Slutsats
Grattis! Du har nu lärt dig hur du visar en tabell i ett PDF-dokument med Aspose.PDF för .NET. Denna steg-för-steg-guide visade dig hur du skapar ett dokument, konfigurerar sidmarginaler och orientering, lägger till en tabell och visar en tabell på en ny sida. Nu kan du tillämpa denna kunskap i dina egna projekt.

### Vanliga frågor om rendering av tabell i PDF-dokument

#### F: Hur kan jag ändra tabellens utseende, som att ändra cellfärger eller lägga till kanter?

S: För att ändra tabellens utseende kan du ställa in olika egenskaper för`Aspose.Pdf.Table` och dess celler. Du kan till exempel ställa in`BackgroundColor` egenskap hos celler för att ändra deras bakgrundsfärg. Du kan också ställa in`Border` egenskapen för tabellen eller enskilda celler för att lägga till ramar. Dessutom kan du anpassa teckensnitt, textfärg och justering av tabellinnehållet genom att ändra`TextState` av`TextFragment` objekt som lagts till i cellerna.

#### F: Kan jag lägga till sidhuvuden eller sidfötter i tabellen?

S: Ja, du kan lägga till sidhuvuden eller sidfötter i tabellen genom att skapa ytterligare rader i början eller slutet av tabellen och ställa in lämpligt innehåll i cellerna. Du kan anpassa sidhuvuden eller sidfötter oberoende av resten av tabellinnehållet genom att lägga till olika stilar eller innehåll till dessa specifika rader.

#### F: Hur kan jag kontrollera tabellens position på sidan?

 S: För att kontrollera tabellens position på sidan kan du justera`MarginInfo` av`PageInfo` objekt. De`MarginInfo`låter dig ställa in vänster, höger, övre och nedre marginalerna på sidan, vilket påverkar det tillgängliga utrymmet för tabellen. Du kan också använda`PositioningType` egendom av`Aspose.Pdf.Table` för att kontrollera dess horisontella och vertikala justering inom sidans innehållsområde.

#### F: Kan jag exportera tabellen till olika filformat, som Excel eller CSV?

S: Aspose.PDF för .NET är i första hand utformad för att arbeta med PDF-dokument. Även om det kan exportera PDF-dokumentet som en bild eller XPS, stöder det inte direkt export av tabeller till format som Excel eller CSV. För att exportera tabelldata till olika filformat kan du behöva använda ytterligare bibliotek eller metoder för att konvertera PDF-innehållet till önskat format.

#### F: Hur kan jag lägga till hyperlänkar till tabellcellerna?

 S: För att lägga till hyperlänkar till tabellcellerna kan du använda`Aspose.Pdf.WebHyperlink` klass för att skapa en hyperlänk och sedan lägga till den som ett ankare till`TextFragment`inne i cellen. Detta gör att du kan associera en URL eller länkmål med specifik text eller innehåll i cellen, vilket skapar klickbara hyperlänkar.