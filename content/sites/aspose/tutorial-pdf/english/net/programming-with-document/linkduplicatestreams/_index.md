---
title: Link Duplicate Streams
linktitle: Link Duplicate Streams
second_title: Aspose.PDF for .NET API Reference
description: Learn how to use Aspose.PDF for .NET Link Duplicate Streams feature to optimize your PDF documents with this step-by-step guide.
type: docs
weight: 230
url: /net/programming-with-document/linkduplicatestreams/
---
Aspose.PDF for .NET is a comprehensive and powerful library that provides a variety of features to work with PDF files. One of its key features is the ability to optimize PDF files. In this article, we will explain how to use the Link Duplicate Streams feature of Aspose.PDF for .NET to optimize PDF files. We will provide step-by-step instructions and include a full source code example to make it easy for developers to follow along.

## Step 1: Opening the PDF Document

To open the PDF document using Aspose.PDF for .NET, follow these steps:

```csharp
// The path to the documents directory.
string dataDir = "YOUR DOCUMENT DIRECTORY";
// Open document
Document pdfDocument = new Document(dataDir + "OptimizeDocument.pdf");
```

In the code above, replace "YOUR DOCUMENT DIRECTORY" with the path to your project directory.

## Step 2: Setting the LinkDuplicateStreams Option

To set the LinkDuplicateStreams option, follow these steps:

```csharp
// Set LinkDuplcateStreams option 
var optimizeOptions = new Pdf.Optimization.OptimizationOptions
{
    LinkDuplcateStreams = true
};
```

In the code above, we created a new instance of OptimizationOptions and set the LinkDuplicateStreams option to true.

## Step 3: Optimizing the PDF Document

To optimize the PDF document, follow these steps:

```csharp
// Optimize PDF document using OptimizationOptions
pdfDocument.OptimizeResources(optimizeOptions);
```

In the code above, we used the OptimizeResources method of the pdfDocument object to optimize the PDF document using the OptimizationOptions we created earlier.

## Step 4: Saving the Updated Document

To save the updated document, follow these steps:

```csharp
dataDir = dataDir + "OptimizeDocument_out.pdf";
// Save updated document
pdfDocument.Save(dataDir);
```

In the code above, we used the Save method of the pdfDocument object to save the updated document to a new file named "OptimizeDocument_out.pdf" in the project directory.

### Example Source Code for Link Duplicate Streams using Aspose.PDF for .NET

```csharp

	// The path to the documents directory.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	// Open document
	Document pdfDocument = new Document(dataDir + "OptimizeDocument.pdf");
	// Set LinkDuplcateStreams option 
	var optimizeOptions = new Pdf.Optimization.OptimizationOptions
	{
		LinkDuplcateStreams = true
	};
	// Optimize PDF document using OptimizationOptions
	pdfDocument.OptimizeResources(optimizeOptions);
	dataDir = dataDir + "OptimizeDocument_out.pdf";
	// Save updated document
	pdfDocument.Save(dataDir);
	
```

