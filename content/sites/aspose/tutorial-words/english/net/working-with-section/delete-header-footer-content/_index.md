---
title: Delete Header Footer Content
linktitle: Delete Header Footer Content
second_title: Aspose.Words for .NET API Reference
description: In this tutorial, learn how to remove header and footer content from a Word document with Aspose.Words for .NET. 
type: docs
weight: 10
url: /net/working-with-section/delete-header-footer-content/
---

In this tutorial, we are going to show you how to remove header and footer content from Word document using Aspose.Words library for .NET. Removing content from headers and footers can be useful when you want to reset or remove these elements from your document. We'll take you step-by-step to help you understand and implement the code in your .NET project.

## Prerequisites
Before you begin, make sure you have the following items:
- A working knowledge of the C# programming language
- The Aspose.Words library for .NET installed in your project
- A Word document containing headers and footers that you want to remove

## Step 1: Define the document directory
First, you need to set the directory path to the location of your Word document. Replace `"YOUR DOCUMENT DIRECTORY"` in the code with the appropriate path.

```csharp
// Path to your documents directory
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Step 2: Load the document and go to the section
Next, we'll load the Word document into an instance of the `Document` class. We will access the first section of the document using index 0.

```csharp
// Load the document
Document doc = new Document(dataDir + "Document.docx");

// Access the section
Section section = doc.Sections[0];
```

## Step 3: Delete header and footer content
To remove the header and footer content from the section, we'll use the `ClearHeadersFooters` method.

```csharp
section.ClearHeadersFooters();
```

### Sample source code for Delete Header Footer Content using Aspose.Words for .NET 

```csharp

// Path to your document directory 
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document(dataDir + "Document.docx");
Section section = doc.Sections[0];
section.ClearHeadersFooters();

```

## Conclusion
In this tutorial, we have seen how to remove header and footer content from a Word document using Aspose.Words for .NET. Removing content from headers and footers allows you to reset or remove those specific elements from your document. Feel free to customize and use this feature according to your specific needs.

