---
title: Restart List At Each Section
linktitle: Restart List At Each Section
second_title: Aspose.Words for .NET API Reference
description: Learn how to reset a numbered list to each section in a Word document with Aspose.Words for .NET.
type: docs
weight: 10
url: /net/working-with-list/restart-list-at-each-section/
---

In this step by step tutorial, we will show you how to reset a numbered list to each section in a Word document using Aspose.Words for .NET. We'll explain the provided C# source code and show you how to implement it in your own projects.

To get started, make sure you have Aspose.Words for .NET installed and configured in your development environment. If you haven't already, download and install the library from the official site.

## Step 1: Creating the Document and List

First, create a new document and add a default numbered list:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();

doc.Lists.Add(ListTemplate.NumberDefault);

List list = doc.Lists[0];
list. IsRestartAtEachSection = true;
```

## Step 2: Adding items to the list

Then use a `DocumentBuilder` to add items to the list. You can use a loop to add multiple items to the list:

```csharp
DocumentBuilder builder = new DocumentBuilder(doc);
builder.ListFormat.List = list;

for (int i = 1; i < 45; i++)
{
     builder.Writeln($"List item {i}");

     if (i == 15)
         builder.InsertBreak(BreakType.SectionBreakNewPage);
}
```

In this example, we're inserting a section break after the 15th list item to illustrate renumbering.

## Step 3: Save the modified document

Finally, save the modified document:

```csharp
OoxmlSaveOptions options = new OoxmlSaveOptions { Compliance = OoxmlCompliance.Iso29500_2008_Transitional };

doc.Save(dataDir + "ResetListAtEachSection.docx", options);
```

So ! You have successfully reset a numbered list to each section in a Word document using Aspose.Words for .NET.

### Example source code for resetting the list at each section

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document();

doc.Lists.Add(ListTemplate.NumberDefault);

List list = doc.Lists[0];
list. IsRestartAtEachSection = true;

DocumentBuilder builder = new DocumentBuilder(doc);
builder.ListFormat.List = list;

for (int i = 1; i < 45; i++)
{
	 builder.Writeln($"List item {i}");

	 if (i == 15)
		 builder.InsertBreak(BreakType.SectionBreakNewPage);
}

OoxmlSaveOptions options = new OoxmlSaveOptions { Compliance = OoxmlCompliance.Iso29500_2008_Transitional };

doc.Save(dataDir + "ResetListAtEachSection.docx", options);

```

Feel free to use this code in your own projects and modify it to suit your specific needs.

