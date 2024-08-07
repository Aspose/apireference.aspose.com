---
title: Ange språk på fältnivå
linktitle: Ange språk på fältnivå
second_title: Aspose.Words för .NET API Referens
description: Lär dig hur du anger lokalisering på fältnivå i Word-dokument med Aspose.Words för .NET.
type: docs
weight: 10
url: /sv/net/working-with-fields/specify-locale-at-field-level/
---

Här är en steg-för-steg-guide för att förklara följande C#-källkod som gör det möjligt att specificera lokalisering på fältnivå med funktionen Aspose.Words för .NET. Se till att du har inkluderat Aspose.Words-biblioteket i ditt projekt innan du använder den här koden.

## Steg 1: Ange sökväg till dokumentkatalogen

```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
```

Var noga med att ange rätt sökväg till din dokumentkatalog där det redigerade dokumentet kommer att sparas.

## Steg 2: Skapa en dokumentgenerator

```csharp
DocumentBuilder builder = new DocumentBuilder();
```

 Här skapar vi en instans av`DocumentBuilder` klass som gör att vi kan lägga till fält i dokumentet.

## Steg 3: Infoga ett datumfält med en specifik plats

```csharp
Field field = builder. InsertField(FieldType.FieldDate, true);
field.LocaleId = 1049;
```

 Vi använder dokumentgeneratorn för att infoga ett typfält`FieldType.FieldDate` in i dokumentet. Genom att ställa in`LocaleId` egendom till`1049`, specificerar vi den ryska lokaliseringen för detta fält.

## Steg 4: Spara det ändrade dokumentet

```csharp
builder.Document.Save(dataDir + "WorkingWithFields.SpecifylocaleAtFieldlevel.docx");
```

Slutligen sparar vi det modifierade dokumentet med den angivna platsen till en specificerad fil.

### Exempel på källkod för att ange lokalisering på fältnivå med Aspose.Words för .NET

```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";

DocumentBuilder builder = new DocumentBuilder();

Field field = builder. InsertField(FieldType.FieldDate, true);
field.LocaleId = 1049;

builder.Document.Save(dataDir + "WorkingWithFields.SpecifylocaleAtFieldlevel.docx");
```

Detta var ett exempel på en källkod för att ange lokalisering på fältnivå i ett dokument som använder Aspose.Words för .NET. Du kan använda den här koden för att infoga datumfält med specifika platser i dina Word-dokument.
