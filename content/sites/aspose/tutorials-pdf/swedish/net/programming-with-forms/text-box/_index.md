---
title: Textruta
linktitle: Textruta
second_title: Aspose.PDF för .NET API Referens
description: Lär dig hur du skapar ett textfält i ett PDF-dokument med Aspose.PDF för .NET.
type: docs
weight: 290
url: /sv/net/programming-with-forms/text-box/
---
I den här guiden kommer vi att förklara steg för steg hur man använder Aspose.PDF-biblioteket för .NET för att skapa ett textfält i ett PDF-dokument. Vi visar dig hur du öppnar dokumentet, skapar textfältet, anpassar dess egenskaper och sparar den redigerade PDF-filen.

## Steg 1: Konfigurera dokumentkatalogen

 Det första steget är att konfigurera dokumentkatalogen där PDF-filen du vill arbeta med finns. Du kan använda`dataDir` variabel för att ange katalogsökvägen.

```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

 Se till att byta ut`"YOUR DOCUMENTS DIRECTORY"` med den faktiska sökvägen till din dokumentkatalog.

## Steg 2: Öppna PDF-dokumentet

 det här steget kommer vi att öppna PDF-dokumentet med hjälp av`Document` klass av Aspose.PDF.

```csharp
Document pdfDocument = new Document(dataDir + "TextField.pdf");
```

Se till att PDF-filen finns i den angivna dokumentkatalogen.

## Steg 3: Skapa textfältet

 Vi kommer att skapa ett textfält med hjälp av`TextBoxField` klass. Du kan ange positionskoordinater och fältstorlek med hjälp av`Rectangle` klass.

```csharp
TextBoxField textBoxField = new TextBoxField(pdfDocument.Pages[1], new Aspose.Pdf.Rectangle(100, 200, 300, 300));
textBoxField. PartialName = "textbox1";
textBoxField.Value = "Text Field";
```

Anpassa koordinater, storlek, delnamn och textfältsvärde efter behov.

## Steg 4: Anpassa textfältsegenskaper

I det här steget kommer vi att anpassa textfältets egenskaper som kant, färg etc.

```csharp
Border border = new Border(textBoxField);
border. width = 5;
border. Dash = new Dash(1, 1);
textBoxField. Border = border;
textBoxField.Color = Aspose.Pdf.Color.FromRgb(System.Drawing.Color.Green);
```

Anpassa textfältets egenskaper enligt dina önskemål.

## Steg 5: Lägga till fältet i dokumentet

Nu när vi har skapat och konfigurerat textfältet kan vi lägga till det i PDF-dokumentet.

```csharp
pdfDocument.Form.Add(textBoxField, 1);
```

## Steg 6: Spara den ändrade PDF-filen

 Slutligen kan vi spara den modifierade PDF-filen med hjälp av`Save` metod för`Document` klass.

```csharp
dataDir = dataDir + "TextBox_out.pdf";
pdfDocument.Save(dataDir);
```

Var noga med att ange den fullständiga sökvägen och filnamnet för den redigerade PDF-filen.

### Exempel på källkod för Text Box med Aspose.PDF för .NET 
```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Öppna dokumentet
Document pdfDocument = new Document(dataDir + "TextField.pdf");
// Skapa ett fält
TextBoxField textBoxField = new TextBoxField(pdfDocument.Pages[1], new Aspose.Pdf.Rectangle(100, 200, 300, 300));
textBoxField.PartialName = "textbox1";
textBoxField.Value = "Text Box";
//TextBoxField.Border = new Border(
Border border = new Border(textBoxField);
border.Width = 5;
border.Dash = new Dash(1, 1);
textBoxField.Border = border;
textBoxField.Color = Aspose.Pdf.Color.FromRgb(System.Drawing.Color.Green);
// Lägg till fält i dokumentet
pdfDocument.Form.Add(textBoxField, 1);
dataDir = dataDir + "TextBox_out.pdf";
// Spara modifierad PDF
pdfDocument.Save(dataDir);
Console.WriteLine("\nTextbox field added successfully.\nFile saved at " + dataDir);
```

## Slutsats

I den här guiden lärde vi oss hur man använder Aspose.PDF-biblioteket för .NET för att skapa ett textfält i ett PDF-dokument. Genom att följa de beskrivna stegen kan du anpassa egenskaperna för textfältet och lägga till det i dokumentet efter behov. Utforska gärna funktionerna i Aspose.PDF för .NET ytterligare för att utöka möjligheterna att manipulera PDF-filer.

### FAQ's

#### F: Kan jag använda Aspose.PDF för .NET för att skapa flera textfält i ett enda PDF-dokument?

S: Ja, du kan skapa flera textfält i ett enda PDF-dokument med Aspose.PDF för .NET. Upprepa helt enkelt processen att skapa och anpassa textfält för varje önskad plats i dokumentet.

#### F: Hur kan jag anpassa utseendet på textfältet, till exempel teckenstorlek och färg?

S: Du kan anpassa utseendet på textfältet genom att justera dess egenskaper, såsom teckenstorlek, teckensnitt, färg, kantstil, bakgrundsfärg med mera. I exempelkällkoden som tillhandahålls anpassas kantbredd, streckmönster och textfärg.

#### F: Är det möjligt att extrahera den användarinmatade texten från det skapade textfältet?

S: Ja, du kan extrahera den användarinmatade texten från det skapade textfältet. Efter att användarna har fyllt i textfältet i PDF-dokumentet kan du programmässigt hämta fältvärdet med Aspose.PDF för .NET.

#### F: Kan jag lägga till textfält i ett befintligt PDF-dokument utan att skapa ett nytt?

S: Ja, du kan lägga till textfält i ett befintligt PDF-dokument utan att skapa ett nytt. Aspose.PDF för .NET ger möjlighet att ändra befintliga PDF-dokument, inklusive att lägga till textfält, kryssrutor och andra formulärelement.

#### F: Stöder Aspose.PDF för .NET andra typer av formulärfält, såsom kryssrutor och alternativknappar?

S: Ja, Aspose.PDF för .NET stöder olika typer av formulärfält, inklusive kryssrutor, alternativknappar, rullgardinslistor och mer. Du kan använda biblioteket för att arbeta med olika typer av formulärelement i PDF-dokument.