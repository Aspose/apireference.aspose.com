---
title: Field Display Results
linktitle: Field Display Results
second_title: Aspose.Words for .NET API Reference
description: Step by step guide for displaying field results in your Word documents with Aspose.Words for .NET. 
type: docs
weight: 10
url: /net/working-with-fields/field-display-results/
---

Here is a step-by-step guide to explain the C# source code below, which uses the "Show Field Results" feature of Aspose.Words for .NET. Make sure to follow each step carefully to get the desired results.

## Step 1: Document Directory Setup

In the code provided, you must specify the directory of your documents. Replace the value "YOUR DOCUMENT DIRECTORY" with the appropriate path to your documents directory.

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Step 2: Loading the document

The first step is to load the document in which you want to display the field results.

```csharp
Document document = new Document(dataDir + "Miscellaneous fields.docx");
```

Be sure to replace "Miscellaneous Fields.docx" with the name of your own file.

## Step 3: Update fields

We use the `UpdateFields()` method to update all fields in the document.

```csharp
document. UpdateFields();
```

This step is important because it ensures that field results are displayed correctly.

## Step 4: Displaying Field Results

We use a `foreach` loop to loop through all the fields in the document and display their results.

```csharp
foreach(Field field in document.Range.Fields)
     Console.WriteLine(field.DisplayResult);
```

On each iteration of the loop, we access the `DisplayResult` property of the field to get the displayed result.

### Source Code Example for Display Field Results with Aspose.Words for .NET

```csharp
// The path to the documents directory.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

// Load the document.
Document document = new Document(dataDir + "Miscellaneous fields.docx");

// Update fields.
document. UpdateFields();

// Display of field results.
foreach(Field field in document.Range.Fields)
     Console.WriteLine(field.DisplayResult);
```

In this example, we uploaded a document, updated all the fields, and then cycled through the fields to display their results. You can customize this step using your own logic to process field results.

This concludes our guide to using the "Show Field Results" feature with Aspose.Words for .NET.