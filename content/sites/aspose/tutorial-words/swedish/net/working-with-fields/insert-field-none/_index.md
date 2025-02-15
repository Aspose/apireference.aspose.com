---
title: Infoga fält Inget
linktitle: Infoga fält Inget
second_title: Aspose.Words för .NET API Referens
description: Lär dig hur du lägger in en mästare AUCUN i dokumenten Word avec Aspose.Words för .NET.
type: docs
weight: 10
url: /sv/net/working-with-fields/insert-field-none/
---

Här är en steg-för-steg-guide för att förklara C#-källkoden nedan, som använder funktionen "Infoga inget fält" i Aspose.Words för .NET. Se till att följa varje steg noggrant för att få önskat resultat.

## Steg 1: Installation av dokumentkatalog

I den angivna koden måste du ange katalogen för dina dokument. Ersätt värdet "DIN DOKUMENTKATOLOG" med lämplig sökväg till din dokumentkatalog.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Steg 2: Skapa Document and DocumentBuilder

Vi börjar med att skapa ett nytt dokument och initiera en DocumentBuilder.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Steg 3: Infoga fältet INGEN

 Vi använder`InsertField()` metod för DocumentBuilder för att infoga ett INGEN-fält i dokumentet.

```csharp
FieldUnknown field = (FieldUnknown)builder.InsertField(FieldType.FieldNone, false);
```

### Källkodsexempel för att infoga ett NONE-fält med Aspose.Words för .NET

```csharp
// Sökvägen till dokumentkatalogen.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Skapa dokumentet och DocumentBuilder.
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Infoga INGEN-fältet.
FieldUnknown field = (FieldUnknown)builder.InsertField(FieldType.FieldNone, false);

doc.Save(dataDir + "InsertionFieldNone.docx");
```

I det här exemplet har vi skapat ett nytt dokument, initierat en DocumentBuilder och sedan infogat ett INGEN-fält. Dokumentet sparas sedan med ett angivet filnamn.

Detta avslutar vår guide om hur du använder funktionen "Infoga inget fält" med Aspose.Words för .NET.