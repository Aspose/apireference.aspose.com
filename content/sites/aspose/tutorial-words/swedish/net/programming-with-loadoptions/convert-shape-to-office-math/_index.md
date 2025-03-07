---
title: Konvertera Shape till Office Math
linktitle: Konvertera Shape till Office Math
second_title: Aspose.Words för .NET API Referens
description: Lär dig hur du konverterar former till Office-matematiska formler när du laddar upp dokument med Aspose.Words för .NET.
type: docs
weight: 10
url: /sv/net/programming-with-loadoptions/convert-shape-to-office-math/
---

När du arbetar med dokument som innehåller matematiska former i en C#-applikation kan du behöva konvertera dem till Office matematiska formler för bättre kompatibilitet och presentation. Med Aspose.Words-biblioteket för .NET kan du enkelt konvertera former till Office-matematiska formler medan du laddar ett dokument. I den här steg-för-steg-guiden går vi igenom hur du använder Aspose.Words för .NET C#-källkod för att ladda ett dokument med att konvertera former till Office-matematiska formler med LoadOptions.

## Förstå Aspose.Words-biblioteket

Innan du dyker in i koden är det viktigt att förstå Aspose.Words-biblioteket för .NET. Aspose.Words är ett kraftfullt bibliotek för att skapa, redigera, konvertera och skydda Word-dokument på olika plattformar inklusive .NET. Den erbjuder många funktioner för att manipulera dokument, som att infoga text, ändra formatering, lägga till avsnitt och mycket mer.

## Konfigurera laddningsalternativ

Det första steget är att konfigurera laddningsalternativen för vårt dokument. Använd klassen LoadOptions för att ange laddningsparametrar. I vårt fall vill vi konvertera formerna till Office matematiska formler, så vi måste ställa in egenskapen ConvertShapeToOfficeMath till true. Så här gör du:

```csharp
LoadOptions loadOptions = new LoadOptions { ConvertShapeToOfficeMath = true };
```

Vi skapar ett nytt LoadOptions-objekt och ställer in egenskapen ConvertShapeToOfficeMath till true för att möjliggöra konvertering av former till Office-matematiska formler när dokumentet laddas.

## Dokumentladdning med konvertering av former till Office-matematikformler

Nu när vi har konfigurerat laddningsalternativen kan vi ladda dokumentet med klassen Document och ange laddningsalternativen. Här är ett exempel :

```csharp
Document doc = new Document(dataDir + "Office math.docx", loadOptions);
```

I det här exemplet laddar vi dokumentet "Office math.docx" som finns i dokumentkatalogen med de angivna laddningsalternativen.

## Registrering av handlingen

Efter att ha laddat dokumentet med att konvertera former till Office-matematiska formler kan du spara det i önskat format med hjälp av Spara-metoden för klassen Document. För att till exempel spara dokumentet i .docx-format:

```csharp
doc.Save(dataDir + "WorkingWithLoadOptions.ConvertShapeToOfficeMath.docx", SaveFormat.Docx);
```

Se till att ersätta "dataDir" med katalogsökvägen till dina dokument.

### Exempel på källkod för LoadOptions med funktionen "Konvertera form till Office Math" med Aspose.Words för .NET

```csharp
// Sökväg till din dokumentkatalog
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Konfiguration av laddningsalternativen med funktionen "Konvertera form".

  To Office Math"
LoadOptions loadOptions = new LoadOptions { ConvertShapeToOfficeMath = true };

// Ladda dokumentet med de angivna alternativen
Document doc = new Document(dataDir + "Office math.docx", loadOptions);

//Spara dokumentet i önskat format
doc.Save(dataDir + "WorkingWithLoadOptions.ConvertShapeToOfficeMath.docx", SaveFormat.Docx);
```

## Slutsats

I den här guiden förklarade vi hur man laddar ett dokument med att konvertera former till Office matematiska formler med hjälp av Aspose.Words-biblioteket för .NET. Genom att följa de medföljande stegen och använda den medföljande C#-källkoden kan du enkelt tillämpa den här funktionen i din C#-applikation. Konvertering av former till Office matematiska formler ger bättre kompatibilitet och presentation av dokument som innehåller matematiska element.
