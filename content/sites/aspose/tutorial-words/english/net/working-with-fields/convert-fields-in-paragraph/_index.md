---
title: Convert Fields In Paragraph
linktitle: Convert Fields In Paragraph
second_title: Aspose.Words for .NET API Reference
description: Convert IF fields to plain text in a paragraph with Aspose.Words for .NET.
type: docs
weight: 10
url: /net/working-with-fields/convert-fields-in-paragraph/
---

Here is a tutorial that demonstrates how to use the Convert Fields to Paragraph feature with Aspose.Words for .NET. This code converts all IF type fields encountered in the last paragraph of a document to plain text. Follow the steps below to understand and run this code.

Make sure you've installed Aspose.Words for .NET and set up your development environment before you begin.

## Step 1: Import references

To use Aspose.Words in your project, you need to add the necessary references. Make sure you have added a reference to the Aspose.Words library in your project.

## Step 2: Loading the document

Before you can convert fields, you must load the document that contains the fields to convert. Be sure to specify the correct path to the directory containing the document. Here's how to upload the document:

```csharp
// Path to the documents directory.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Load the document.
Document doc = new Document(dataDir + "Linked fields.docx");
```

Replace "YOUR DOCUMENTS DIRECTORY" with the actual path to your documents directory.

## Step 3: Converting fields to text

Now that the document is loaded, we can proceed with converting the  type fields to plain text. In this example, we only target the fields present in the last paragraph of the document. Here is the code that performs this conversion:

```csharp
doc.FirstSection.Body.LastParagraph.Range.Fields
     .Where(f => f.Type == FieldType.FieldIf)
     .ToList()
     .ForEach(f => f.Unlink());
```

This code uses a combination of LINQ methods to filter out fields in the last paragraph of the document and then converts them to plain text by calling the `Unlink()` method.

## Step 4: Saving the modified document

Once the fields have been converted, you can save the modified document. Use the `Save()` method for this. Here is an example :

```csharp
doc.Save(dataDir + "WorkingWithFields.TestFile.docx");
```

Be sure to specify the correct path and file name for the backup.

### Source code example for Convert Fields In Paragraph using Aspose.Words for .NET

```csharp
// Path to the documents directory.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Load the document.
Document doc = new Document(dataDir + "Linked fields.docx");

// Convert IF fields to plain text in the last paragraph of the document.
doc.FirstSection.Body.LastParagraph.Range.Fields
     .Where(f => f.Type == FieldType.FieldIf)
     .ToList()
     .ForEach(f => f.Unlink());

// Save the modified document.
doc.Save(dataDir + "WorkingWithFields.TestFile.docx");
```

