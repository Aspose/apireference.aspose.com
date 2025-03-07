---
title: Uppdatera bokmärkesdata
linktitle: Uppdatera bokmärkesdata
second_title: Aspose.Words för .NET API Referens
description: Steg-för-steg-guide för att förklara C#-källkoden för Aspose.Words-funktionen för uppdatering av bokmärkesdata för .NET.
type: docs
weight: 10
url: /sv/net/programming-with-bookmarks/update-bookmark-data/
---

I den här handledningen kommer vi att gå igenom en steg-för-steg-guide för att förstå och implementera funktionen Uppdatera bokmärkesdata i Aspose.Words för .NET. Den här funktionen låter dig uppdatera innehållet och egenskaperna för bokmärken i ett Word-dokument med hjälp av C#-källkoden.

## Krav

Innan du fortsätter med handledningen, se till att du har följande krav på plats:

- Aspose.Words för .NET-biblioteket installerat
- Grundläggande kunskaper i programmeringsspråket C#
- Visual Studio eller någon annan kompatibel IDE

## Steg 1: Ladda dokumentet

I det här steget kommer vi att ladda Word-dokumentet som innehåller de bokmärken vi vill uppdatera. Förutsatt att du har dokumentet lagrat i en specifik katalog, använd följande kod för att ladda dokumentet:

```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "Bookmarks.docx");
```

 Byta ut`"YOUR DOCUMENT DIRECTORY"` med den faktiska katalogsökvägen där ditt dokument finns.

## Steg 2: Öppna bokmärket

För att uppdatera bokmärkesdata måste vi först komma åt det specifika bokmärket i dokumentet. Varje bokmärke har ett unikt namn kopplat till sig. Använd följande kod för att komma åt ett bokmärke med namnet "MyBookmark1":

```csharp
Bookmark bookmark = doc.Range.Bookmarks["MyBookmark1"];
```

Se till att bokmärkets namn matchar det i ditt dokument. Du kan ändra det enligt dina krav.

## Steg 3: Uppdatera bokmärkesegenskaper och innehåll

När du har kommit åt bokmärket kan du uppdatera dess egenskaper och innehåll. I följande kodavsnitt kommer vi att uppdatera bokmärkets namn och text:

```csharp
string name = bookmark.Name;
string text = bookmark.Text;

bookmark.Name = "RenamedBookmark";
bookmark.Text = "This is a new bookmarked text.";
```

Du kan anpassa bokmärkets namn och den nya texten efter dina behov. Ovanstående kod byter namn på bokmärket till "RenamedBookmark" och uppdaterar textinnehållet.

## Steg 4: Spara det uppdaterade dokumentet

När du har uppdaterat bokmärkesdata måste du spara det ändrade dokumentet. Använd följande kod för att spara dokumentet:

```csharp
doc.Save(dataDir + "UpdatedDocument.docx");
```

Denna kod kommer att spara det ändrade dokumentet med namnet "UpdatedDocument.docx" i samma katalog som originaldokumentet.

### Exempel på källkod för Uppdatera bokmärkesdata med Aspose.Words för .NET

```csharp

	// Sökvägen till dokumentkatalogen.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Bookmarks.docx");

	Bookmark bookmark = doc.Range.Bookmarks["MyBookmark1"];

	string name = bookmark.Name;
	string text = bookmark.Text;

	bookmark.Name = "RenamedBookmark";
	bookmark.Text = "This is a new bookmarked text.";

```

 Byta ut`"YOUR DOCUMENT DIRECTORY"` med den faktiska katalogsökvägen där ditt dokument finns.

## Slutsats

Grattis! Du har framgångsrikt lärt dig hur du uppdaterar bokmärkesdata med Aspose.Words för .NET. Genom att följa den steg-för-steg-guide som finns i denna handledning, bör du nu kunna införliva den här funktionen i dina C#-applikationer och manipulera bokmärken i Word-dokument programmatiskt.