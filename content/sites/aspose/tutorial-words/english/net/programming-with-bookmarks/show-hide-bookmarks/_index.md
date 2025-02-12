---
title: Show Hide Bookmarks
linktitle: Show Hide Bookmarks
second_title: Aspose.Words for .NET API Reference
description: Learn how to show or hide a specific bookmark in a document using Aspose.Words for .NET.
type: docs
weight: 10
url: /net/programming-with-bookmarks/show-hide-bookmarks/
---

In this article, we will explore the C# source code above to understand how to use the Show Hide Bookmarks function in the Aspose.Words for .NET library. This feature allows you to show or hide a specific bookmark in a document.

## Prerequisites

- Basic knowledge of the C# language.
- .NET development environment with Aspose.Words library installed.

## Step 1: Loading the document

We use the `Document` class to load the existing document from a file:

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
Document doc = new Document(dataDir + "Bookmarks.docx");
```

## Step 2: Show or hide a specific bookmark

We use the `ShowHideBookmarkedContent` function to show or hide a specific bookmark in the document. This function takes as parameters the document, the name of the bookmark and a boolean to indicate whether to show or hide the bookmark:

```csharp
ShowHideBookmarkedContent(doc, "MyBookmark1", false);
```

## Step 3: Saving the modified document

We use the `Save` method to save the modified document to a file:

```csharp
doc.Save(dataDir + "WorkingWithBookmarks.ShowHideBookmarks.docx");
```

### Example source code for Show Hide Bookmarks using Aspose.Words for .NET

Here is the full example source code to demonstrate showing or hiding a specific bookmark using Aspose.Words for .NET:

```csharp

	// The path to the documents directory.
	string dataDir = "YOUR DOCUMENT DIRECTORY";
	Document doc = new Document(dataDir + "Bookmarks.docx");

	ShowHideBookmarkedContent(doc, "MyBookmark1", false);
	
	doc.Save(dataDir + "WorkingWithBookmarks.ShowHideBookmarks.docx");

```

## Conclusion

In this article, we explored the C# source code to understand how to use the Show Hide Bookmarks feature of Aspose.Words for .NET. We followed a step-by-step guide to show or hide a specific bookmark in a document.
