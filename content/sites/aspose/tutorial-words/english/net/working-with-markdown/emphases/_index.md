---
title: Emphases
linktitle: Emphases
second_title: Aspose.Words for .NET API Reference
description: Learn how to use emphases (bold and italics) with Aspose.Words for .NET Step-by-step guide.
type: docs
weight: 10
url: /net/working-with-markdown/emphases/
---

In this example, we will explain how to use emphases with Aspose.Words for .NET. emphases is used to emphasize certain parts of the text, such as bold and italics.

## Step 1: Document initialization

First, we'll initialize the document by creating an instance of the `Document` class.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document();
```

## Step 2: Using a document generator

Next, we'll use a document generator to add content to our document.

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Step 3: Add text with Emphases

We can add emphases text by changing the document generator's font properties. In this example, we use bold and italics to emphasize different parts of the text.

```csharp
builder.Writeln("Markdown treats asterisks (*) and underscores (_) as emphases indicators.");
builder.Write("You can write");

builder.Font.Bold = true;
builder.Write("bold");

builder.Font.Bold = false;
builder.Write(" or ");

builder.Font.Italic = true;
builder.Write("italic");

builder.Font.Italic = false;
builder.Writeln(".");

builder.Write("You can also write ");
builder.Font.Bold = true;

builder.Font.Italic = true;
builder.Write("bold and italic");

builder.Font.Bold = false;
builder.Font.Italic = false;
builder. Write(".");

```

## Step 4: Saving the document

Finally, we can save the document in the desired format. In this example, we are using the `.md` extension for a Markdown format.

```csharp
builder.Document.Save(dataDir + "WorkingWithMarkdown.Emphases.md");
```

Congratulation ! You have now learned how to use emphases with Aspose.Words for .NET.

### Example source code for Emphases using Aspose.Words for .NET


```csharp
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	builder.Writeln("Markdown treats asterisks (*) and underscores (_) as indicators of emphases.");
	builder.Write("You can write ");

	builder.Font.Bold = true;
	builder.Write("bold");

	builder.Font.Bold = false;
	builder.Write(" or ");

	builder.Font.Italic = true;
	builder.Write("italic");

	builder.Font.Italic = false;
	builder.Writeln(" text. ");

	builder.Write("You can also write ");
	builder.Font.Bold = true;

	builder.Font.Italic = true;
	builder.Write("BoldItalic");

	builder.Font.Bold = false;
	builder.Font.Italic = false;
	builder.Write("text.");

	builder.Document.Save(dataDir + "WorkingWithMarkdown.Emphases.md");
            
```

