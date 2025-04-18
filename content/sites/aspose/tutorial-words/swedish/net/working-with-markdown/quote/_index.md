---
title: Citat
linktitle: Citat
second_title: Aspose.Words för .NET API Referens
description: Lär dig hur du använder citat med Aspose.Words för .NET Steg-för-steg-guide.
type: docs
weight: 10
url: /sv/net/working-with-markdown/quote/
---

I det här exemplet kommer vi att förklara hur man använder citatfunktionen med Aspose.Words för .NET Citat används för att markera delar av text genom att omge dem med en speciell ram.

## Steg 1: Använda en dokumentgenerator

Först använder vi en dokumentgenerator för att lägga till innehåll i vårt dokument.

```csharp
DocumentBuilder builder = new DocumentBuilder();
```

## Steg 2: Använd standardcitatstilen

Vi använder standardstyckeformatet "Citat" för att tillämpa citatformatering på texten.

```csharp
builder.ParagraphFormat.StyleName = "Quote";
builder.Writeln("Blockquote");
```

## Steg 3: Skapa stilar för kapslade nivåer

 Vi kan skapa stilar för kapslade nivåer med hjälp av`Styles.Add` metod för`Document` objekt. I det här exemplet skapar vi en stil som heter "Quote1" för att representera en kapslad citatnivå.

```csharp
Style quoteLevel2 = builder.Document.Styles.Add(StyleType.Paragraph, "Quote1");
builder.ParagraphFormat.Style = quoteLevel2;
builder.Document.Styles["Quote1"].BaseStyleName = "Quote";
builder.Writeln("1. Nested blockquote");
```

### Exempel på källkod för citat med Aspose.Words för .NET


```csharp
	// Använd en dokumentbyggare för att lägga till innehåll i dokumentet.
	DocumentBuilder builder = new DocumentBuilder();

	// Som standard lagrar ett dokument blockcitatstil för den första nivån.
	builder.ParagraphFormat.StyleName = "Quote";
	builder.Writeln("Blockquote");

	// Skapa stilar för kapslade nivåer genom stilarv.
	Style quoteLevel2 = builder.Document.Styles.Add(StyleType.Paragraph, "Quote1");
	builder.ParagraphFormat.Style = quoteLevel2;
	builder.Document.Styles["Quote1"].BaseStyleName = "Quote";
	builder.Writeln("1. Nested blockquote");
            
```

Grattis! Du har nu lärt dig hur du använder citeringsfunktionen med Aspose.Words för .NET.

