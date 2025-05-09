---
title: Flytta till avsnitt
linktitle: Flytta till avsnitt
second_title: Aspose.Words för .NET API Referens
description: Steg-för-steg-guide för att använda Flytta till avsnitt i Aspose.Words för .NET manipulera avsnitt och stycken i Word-dokument.
type: docs
weight: 10
url: /sv/net/add-content-using-documentbuilder/move-to-section/
---

I det här exemplet kommer vi att gå igenom hur du använder funktionen Move To Section i Aspose.Words för .NET steg för steg med hjälp av den medföljande C#-källkoden. Den här funktionen låter dig navigera och manipulera olika avsnitt i ett Word-dokument. Följ stegen nedan för att integrera den här funktionen i din applikation.

## Steg 1: Skapa ett nytt dokument och lägg till ett avsnitt

Först måste vi skapa ett nytt dokument och lägga till ett avsnitt till det. Använd följande kod för att utföra detta steg:

```csharp
Document doc = new Document();
doc.AppendChild(new Section(doc));
```

Denna kod skapar ett nytt tomt dokument och lägger till en sektion till detta dokument.

## Steg 2: Flytta DocumentBuilder till den andra sektionen och lägg till text

Därefter måste vi flytta DocumentBuilder till den andra delen av dokumentet och lägga till lite text där. Använd följande kod för att utföra detta steg:

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder. MoveToSection(1);
builder.Writeln("Text added to the 2nd section.");
```

Den här koden skapar en DocumentBuilder från det befintliga dokumentet och flyttar sedan markören från DocumentBuilder till den andra delen av dokumentet. Slutligen lägger den till den angivna texten till detta avsnitt.

## Steg 3: Ladda ett dokument med befintliga stycken

Om du vill arbeta med ett befintligt dokument som innehåller stycken kan du ladda detta dokument med följande kod:

```csharp
doc = new Document(MyDir + "Paragraphs.docx");
ParagraphCollection paragraphs = doc.FirstSection.Body.Paragraphs;
Assert.AreEqual(22, paragraphs.Count);
```

Denna kod laddar det angivna dokumentet (ersätt "MyDir + "Paragraphs.docx""med den faktiska sökvägen till ditt dokument) och kommer åt samlingen av stycken från den första delen av dokumentet. Linjen`Assert.AreEqual(22, paragraphs.Count);` kontrollerar att handlingen innehåller 22 paragrafer.

## Steg 4: skapa en DocumentBuilder för ett dokument

Du kan skapa DocumentBuilder-markören till ett specifikt stycke med hjälp av positionsindex.

```csharp
builder = new DocumentBuilder(doc);
Assert.AreEqual(0, paragraphs.IndexOf(builder.CurrentParagraph));
```

## Steg 5: Flytta markören till ett specifikt stycke


Du kan flytta DocumentBuilder-markören till ett specifikt stycke med hjälp av positionsindex. Så här gör du:

```csharp
builder. MoveToParagraph(2, 10);
Assert.AreEqual(2, paragraphs.IndexOf(builder.CurrentParagraph));
builder.Writeln("This is a new third paragraph.");
Assert.AreEqual(3, paragraphs.IndexOf(builder.CurrentParagraph));
```

Den här koden flyttar markören för DocumentBuilder till det tredje stycket i det andra avsnittet (stycket i index 2) och till position 10. Sedan lägger den till ett nytt stycke med lite text och kontrollerar att markören är väl placerad på detta nya stycke .

### Exempel på källkod för Move To Move To Section med Aspose.Words för .NET

```csharp

	
	Document doc = new Document();
	doc.AppendChild(new Section(doc));

	// Flytta en DocumentBuilder till den andra sektionen och lägg till text.
	DocumentBuilder builder = new DocumentBuilder(doc);
	builder.MoveToSection(1);
	builder.Writeln("Text added to the 2nd section.");

	// Skapa dokument med stycken.
	doc = new Document(MyDir + "Paragraphs.docx");
	ParagraphCollection paragraphs = doc.FirstSection.Body.Paragraphs;
	Assert.AreEqual(22, paragraphs.Count);

	//När vi skapar en DocumentBuilder för ett dokument är dess markör som standard i början av dokumentet,
	// och allt innehåll som läggs till av DocumentBuilder kommer bara att läggas till dokumentet.
	builder = new DocumentBuilder(doc);
	Assert.AreEqual(0, paragraphs.IndexOf(builder.CurrentParagraph));

	// Du kan flytta markören till valfri position i ett stycke.
	builder.MoveToParagraph(2, 10);
	Assert.AreEqual(2, paragraphs.IndexOf(builder.CurrentParagraph));
	builder.Writeln("This is a new third paragraph. ");
	Assert.AreEqual(3, paragraphs.IndexOf(builder.CurrentParagraph));
	
        
```

Det är allt ! Du har nu förstått hur du använder flytt till sektionsfunktionaliteten i Aspose.Words för .NET med den medföljande källkoden. Du kan nu integrera den här funktionen i ditt eget program och manipulera avsnitt och stycken i dina Word-dokument dynamiskt.

