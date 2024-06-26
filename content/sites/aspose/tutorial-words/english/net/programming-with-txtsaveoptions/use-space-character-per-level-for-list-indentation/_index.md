---
title: Use Space Character Per Level For List Indentation
linktitle: Use Space Character Per Level For List Indentation
second_title: Aspose.Words for .NET API Reference
description: Step-by-step guide to using a space character per level for list indentation in Aspose.Words for .NET. Create well-structured Word documents with ease.
type: docs
weight: 10
url: /net/programming-with-txtsaveoptions/use-space-character-per-level-for-list-indentation/
---
Aspose.Words for .NET is a powerful library for creating, editing, and manipulating Word documents in a C# application. Among the features offered by Aspose.Words is the possibility of using one space character per level for the indentation of lists. In this guide, we will show you how to use the C# source code of Aspose.Words for .NET to implement this functionality.

## Understanding the Aspose.Words library

Before diving into the code, it's important to understand the Aspose.Words library for .NET. Aspose.Words is a popular library that makes working with Word documents easy and efficient. It offers a wide range of functionalities for creating, modifying and manipulating Word documents, including management of lists and indentation.

## Creating the document and adding content

The first step is to create a new document and add content to it. Use the Document class to create a new document instance. Then use the DocumentBuilder class to add text and create a list with multiple levels of indentation. Here is an example :

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create a list with three levels of indentation
builder.ListFormat.ApplyNumberDefault();
builder. Writen("Element 1");
builder.ListFormat.ListIndent();
builder. Writen("Element 2");
builder.ListFormat.ListIndent();
builder.Write("Element 3");
```

In this example, we create a new document and use the DocumentBuilder to add text and create a list with three levels of indentation. We've added three items to the list, with each item indented an additional level.

## Using one space character per level for list indentation

Once the content has been added, we can now configure the indentation of the lists using one space character per level. For this we use the TxtSaveOptions class and we set the ListIndentation.Count property to the number of indentation levels and the ListIndentation.Character property to the space character to use. Here's how:

```csharp
TxtSaveOptions saveOptions = new TxtSaveOptions();
saveOptions.ListIndentation.Count = 3;
saveOptions.ListIndentation.Character = ' ';

doc.Save(dataDir + "WorkingWithTxtSaveOptions.UseSpaceCharacterPerLevelForListIndentation.txt", saveOptions);
```

In this example, we create an instance of TxtSaveOptions and set the ListIndentation.Count property to 3 to indicate that there are three levels of indentation in the list. We also set the ListIndentation.Character property to the space character (' ') we want to use for indentation.

### Example source code for the "Use one space character per level for list indentation" feature with Aspose.Words for .NET

Here is the complete sample source code for the "Use one space character per level for list indentation" feature with Aspose.Words for .NET:

```csharp

using Aspose.Words;
using Aspose.Words.Saving;

namespace Example
{
     class Program
     {
         static void Main(string[] args)
         {
             // Path to your document directory
             string dataDir = "YOUR DOCUMENTS DIRECTORY";

             // Create the document and add content
             Document doc = new Document();
             DocumentBuilder builder = new DocumentBuilder(doc);

             // Create a list with three levels of indentation
             builder.ListFormat.ApplyNumberDefault();
             builder. Writen("Element 1");
             builder.ListFormat.ListIndent();
             builder. Writen("Element 2");
             builder.ListFormat.ListIndent();
             builder.Write("Element 3");

             // Use one space character per level for list indentation
             TxtSaveOptions saveOptions = new TxtSaveOptions();
             saveOptions.ListIndentation.Count = 3;
             saveOptions.ListIndentation.Character = ' ';

             // Save the document with the specified options
             doc.Save(dataDir + "WorkingWithTxtSaveOptions.UseSpaceCharacterPerLevelForListIndentation.txt", saveOptions);
         }
     }
}

```

## Conclusion

In this guide, we explained how to use Aspose.Words for .NET to apply the "Use one space character per level for list indentation" functionality. By following the steps provided and using the C# source code provided, you can easily configure the indentation of lists in your Word documents using one space character per level. Aspose.Words offers tremendous flexibility and power for working with text formatting and list management, allowing you to create well-structured documents in your C# application.
