---
title: Lägg till SWF-fil som anteckning
linktitle: Lägg till SWF-fil som anteckning
second_title: Aspose.PDF för .NET API-referens
description: Lär dig hur du lägger till SWF-filer som kommentarer i Aspose.PDF för .NET med denna steg-för-steg-guide.
type: docs
weight: 30
url: /sv/net/annotations/addswffileasannotation/
---
Om du är en .NET-utvecklare som vill lägga till en SWF-multimediefil som en anteckning till ditt PDF-dokument med Aspose.PDF för .NET, är den här steg-för-steg-guiden för dig. I den här artikeln kommer vi att förklara hur du lägger till SWF-filer som anteckningar i dina PDF-dokument med programmeringsspråket C#. 

Följ stegen nedan för att lägga till en SWF-fil som en anteckning i ditt PDF-dokument med Aspose.PDF för .NET:

## Steg 1: Ställ in katalogsökvägen

Först måste vi ställa in katalogsökvägen där PDF-filen och SWF-filen lagras. 

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

Ersätt "DIN DOKUMENTKATOLOG" med sökvägen till din dokumentkatalog.

## Steg 2: Ladda PDF-dokumentet

Därefter måste vi ladda PDF-dokumentet med följande kod:

```csharp
Document doc = new Document(dataDir + "AddSwfFileAsAnnotation.pdf");
```

Denna kod kommer att ladda filen "AddSwfFileAsAnnotation.pdf" från dokumentkatalogen.

## Steg 3: Skaffa sidan för att lägga till anteckning

Nu måste vi få referensen till sidan som vi vill lägga till kommentaren till. I den här handledningen lägger vi till anteckningen på dokumentets första sida.

```csharp
Page page = doc.Pages[1];
```

## Steg 4: Skapa ett ScreenAnnotation-objekt

 Vi kan nu skapa en`ScreenAnnotation` objekt med SWF-filen som argument.

```csharp
ScreenAnnotation annotation = new ScreenAnnotation(page, new Aspose.Pdf.Rectangle(0, 400, 600, 700), dataDir + "input.swf");
```

 De`ScreenAnnotation` konstruktorn tar tre argument:

- `page`: Sidan som kommentaren kommer att läggas till.
- `rectangle`: rektangeln där SWF-filen kommer att visas på sidan.
- `dataDir + "input.swf"`: Sökvägen till SWF-filen.

## Steg 5: Lägg till anteckningen på sidan

Nu kan vi lägga till anteckningen i anteckningssamlingen på sidan.

```csharp
page.Annotations.Add(annotation);
```

## Steg 6: Spara det uppdaterade PDF-dokumentet

Slutligen måste vi spara det uppdaterade PDF-dokumentet med anteckningen med följande kod:

```csharp
dataDir = dataDir + "AddSwfFileAsAnnotation_out.pdf";
doc.Save(dataDir);
```

Denna kod kommer att spara det uppdaterade PDF-dokumentet med anteckningen som "AddSwfFileAsAnnotation_out.pdf" i dokumentkatalogen.

### Exempel på källkod för att lägga till SWF-fil som en anteckning med Aspose.PDF för .NET

```csharp
	// Sökvägen till dokumentkatalogen.
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	//Öppna PDF-dokumentet
	Document doc = new Document(dataDir + "AddSwfFileAsAnnotation.pdf");

	// Få referens till sidan som du behöver lägga till anteckningen på
	Page page = doc.Pages[1];

	// Skapa ScreenAnnotation-objekt med .swf multimediafil som argument
	ScreenAnnotation annotation = new ScreenAnnotation(page, new Aspose.Pdf.Rectangle(0, 400, 600, 700), dataDir + "input.swf");

	// Lägg till anteckningen i anteckningssamlingen på sidan
	page.Annotations.Add(annotation);

	dataDir = dataDir + "AddSwfFileAsAnnotation_out.pdf";
	// Spara uppdateringen av PDF-dokumentet med anteckning
	doc.Save(dataDir);
```        
