---
title: Konvertera fält i kroppen
linktitle: Konvertera fält i kroppen
second_title: Aspose.Words för .NET API Referens
description: Lär dig hur du använder Aspose.Words för .NET för att konvertera sidfält till text i brödtexten i ett Word-dokument.
type: docs
weight: 10
url: /sv/net/working-with-fields/convert-fields-in-body/
---

I denna steg-för-steg handledning kommer vi att gå igenom hur du använder funktionen ConvertFieldsInBody i Aspose.Words för .NET med den medföljande C#-källkoden. Med den här funktionen kan du konvertera specifika fält i dokumentets brödtext till vanlig text, vilket gör dina dokument lättare att bearbeta. Följ stegen nedan för att använda den här funktionen effektivt.

## Steg 1: Förutsättningar

Innan du börjar, se till att du har installerat Aspose.Words för .NET och har ett dokument redo att bearbetas. Se också till att du har katalogsökvägen till dina dokument.

## Steg 2: Ladda dokumentet

Börja med att deklarera en variabel för sökvägen till din dokumentkatalog, använd sedan den variabeln för att initiera ett dokumentobjekt från det angivna dokumentet. I vårt exempel heter dokumentet "Linked fields.docx".

```csharp
// Sökvägen till din dokumentkatalog.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

//Ladda dokumentet
Document doc = new Document(dataDir + "Linked fields.docx");
```

## Steg 3: Konvertera sidfält till vanlig text

Nu när dokumentet är laddat kan vi gå vidare till konverteringsstegen. För att konvertera sidfälten till vanlig text i brödtexten i det första avsnittet kan du använda`Range.Fields` metod för att få alla fält i det angivna intervallet och filtrera sedan bort typfält`FieldType.FieldPage` . Då kan du använda`ForEach` metod för att gå igenom varje fält och anropa`Unlink()` metod för att konvertera den till vanlig text.

```csharp
// Skicka lämpliga parametrar för att konvertera sidfälten till vanlig text i brödtexten i det första avsnittet.
doc.FirstSection.Body.Range.Fields.Where(f => f.Type == FieldType.FieldPage).ToList().ForEach(f => f.Unlink());
```

## Steg 4: Spara det ändrade dokumentet

 När du har konverterat sidfälten till vanlig text kan du spara det ändrade dokumentet med hjälp av`Save()` metod och ange sökvägen och namnet på utdatafilen. I vårt exempel sparar vi det som "WorkingWithFields.ConvertFieldsInBody.docx".

```csharp
// Spara det ändrade dokumentet
doc.Save(dataDir + "WorkingWithFields.ConvertFieldsInBody.docx");
```

### Exempel på källkod för att konvertera fält i body med Aspose.Words för .NET

Här är det fullständiga källkodsexemplet för att konvertera fält till kroppen med Aspose.Words för .NET:

```csharp
// Sökvägen till din dokumentkatalog.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

//Ladda dokumentet
Document doc = new Document(dataDir + "Linked fields.docx");

// Skicka lämpliga parametrar för att konvertera sidfälten till vanlig text i brödtexten i det första avsnittet.
doc.FirstSection.Body.Range.Fields.Where(f => f.Type == FieldType.FieldPage).ToList().ForEach(f => f.A
