---
title: Autolink
linktitle: Autolink
second_title: Aspose.Words for .NET API Reference
description: Learn how to insert autolink with Aspose.Words for .NET Step-by-step guide.
type: docs
weight: 10
url: /net/working-with-markdown/autolink/
---

In this example, we will explain how to use the "Autolink" feature with Aspose.Words for .NET. This feature allows you to insert hyperlinks into your document automatically.

## Step 1: Using a document generator

First, we'll use a document generator to add content to our document.

```csharp
DocumentBuilder builder = new DocumentBuilder();
```

## Step 2: Inserting a hyperlink

We can insert a hyperlink using the `InsertHyperlink` method of the document generator. We specify the URL and the text to display for the link.

```csharp
builder.InsertHyperlink("https://www.aspose.com", "https://www.aspose.com", false);
```

## Step 3: Inserting an email address as a link

We can also insert an email address as a link using the "mailto:" prefix. This will allow users to click the link to open their default email client.

```csharp
builder.InsertHyperlink("email@aspose.com", "mailto:email@aspose.com", false);
```

## Step 4: Saving the document

Finally, we can save the document in the desired format.

### Example Source Code for Autolink using Aspose.Words for .NET


```csharp
	// Use a document builder to add content to the document.
	DocumentBuilder builder = new DocumentBuilder();

	// Insert hyperlink.
	builder.InsertHyperlink("https://www.aspose.com", "https://www.aspose.com", false);
	builder.InsertHyperlink("email@aspose.com", "mailto:email@aspose.com", false);
            
```


Congratulation ! You have now learned how to use the "Autolink" feature with Aspose.Words for .NET.


