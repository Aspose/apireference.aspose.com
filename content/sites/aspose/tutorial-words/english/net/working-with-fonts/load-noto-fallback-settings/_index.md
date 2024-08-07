---
title: Load Noto Fallback Settings
linktitle: Load Noto Fallback Settings
second_title: Aspose.Words for .NET API Reference
description: In this tutorial, learn how to load Noto override parameters into a Word document with Aspose.Words for .NET.
type: docs
weight: 10
url: /net/working-with-fonts/load-noto-fallback-settings/
---
In this tutorial, we will walk you through how to load Noto font substitution settings into a Word document using the Aspose.Words Library for .NET. The Noto Font Substitution settings allow you to manage the substitution of fonts when displaying or printing documents. We'll take you step-by-step to help you understand and implement the code in your .NET project.

## Prerequisites
Before you begin, make sure you have the following items:
- A working knowledge of the C# programming language
- The Aspose.Words library for .NET installed in your project

## Step 1: Define the document directory
First, you need to set the directory path to the location of your Word document. Replace `"YOUR DOCUMENT DIRECTORY"` in the code with the appropriate path.

```csharp
// Path to your documents directory
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## Step 2: Load the document and configure font substitution settings
Next, we'll load the document using the `Document` class and configure the font override settings using the `FontSettings` class. We will load the Noto font fallback settings using the `LoadNotoFallbackSettings()` method.

```csharp
// Load the document and configure font substitution settings
Document doc = new Document(dataDir + "Rendering.docx");
FontSettings fontSettings = new FontSettings();
fontSettings.FallbackSettings.LoadNotoFallbackSettings();
doc.FontSettings = fontSettings;
```

## Step 3: Save the document
Finally, we'll save the document with the Noto font substitution settings applied.

```csharp
// Save the document
doc.Save(dataDir + "WorkingWithFonts.NotoFallbackSettings.pdf");
```


### Sample source code for Noto Fallback Settings using Aspose.Words for .NET 
```csharp

// Path to your document directory 
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document(dataDir + "Rendering.docx");
FontSettings fontSettings = new FontSettings();
fontSettings.FallbackSettings.LoadNotoFallbackSettings();
doc.FontSettings = fontSettings;
doc.Save(dataDir + "WorkingWithFonts.NotoFallbackSettings.pdf");

```

## Conclusion
In this tutorial, we saw how to load Noto font substitution settings in a Word document with Aspose.Words for .NET. Noto font substitution settings allow you to manage font substitution to improve the display and printing of your documents. Feel free to use this feature to customize the font substitution to your needs.