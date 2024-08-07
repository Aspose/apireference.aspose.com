---
title: Customize Page Numbes While Adding TOC
linktitle: Customize Page Numbes While Adding TOC
second_title: Aspose.PDF for .NET API Reference
description: Learn how to customize page numbers while adding a table of contents (TOC) using Aspose.PDF for .NET with this step-by-step guide and code example.
type: docs
weight: 100
url: /net/programming-with-document/customizepagenumbeswhileaddingtoc/
---

In this tutoria, we will explore how to customize page numbers while adding a table of contents (TOC) using Aspose.PDF for .NET. We will provide step-by-step guidance, along with a code example, to help you achieve this.

## Step 1: Loading an existing PDF file

First, we need to load an existing PDF file. For this tutorial, we will use the file "42824.pdf" located in the "YOUR DOCUMENT DIRECTORY" directory. Replace this directory path with the actual path to your document directory.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
string inFile = dataDir + "42824.pdf";
string outFile = dataDir + "42824_out.pdf";
Document doc = new Document(inFile);
```

## Step 2: Adding a TOC page

Next, we need to add a new page at the beginning of the document to serve as the TOC page. We can achieve this by using the `Insert()` method of the `Pages` collection of the `Document` object.

```csharp
Aspose.Pdf.Page tocPage = doc.Pages.Insert(1);
```

## Step 3: Creating a TOC object

To create a TOC object, we first need to create a `TocInfo` object and set its properties. In this tutorial, we will set the title of the TOC to "Table Of Contents" and the page number prefix to "P".

```csharp
TocInfo tocInfo = new TocInfo();
TextFragment title = new TextFragment("Table Of Contents");
title.TextState.FontSize = 20;
title.TextState.FontStyle = FontStyles.Bold;
tocInfo.Title = title;
tocInfo.PageNumbersPrefix = "P";
tocPage.TocInfo = tocInfo;
```

## Step 4: Creating TOC entries

To create TOC entries, we need to loop through all the pages of the document, except for the TOC page, and create a heading object for each page. We can then add the heading object to the TOC page and specify its destination page.

```csharp
for (int i = 1; i < doc.Pages.Count; i++)
{
    // Create Heading object
    Aspose.Pdf.Heading heading2 = new Aspose.Pdf.Heading(1);
    TextSegment segment2 = new TextSegment();
    heading2.TocPage = tocPage;
    heading2.Segments.Add(segment2);
    // Specify the destination page for heading object
    heading2.DestinationPage = doc.Pages[i + 1];
    // Destination page
    heading2.Top = doc.Pages[i + 1].Rect.Height;
    // Destination coordinate
    segment2.Text = "Page " + i.ToString();
    // Add heading to page containing TOC
    tocPage.Paragraphs.Add(heading2);
}
```

## Step 5: Saving the updated document

Finally, we need to save the updated document to a new file. We can achieve this by using the `Save()` method of the `Document` object.

```csharp
doc.Save(outFile);
```

### Example source code for customizing page numbes while adding TOC using Aspose.PDF for .NET

```csharp

            
			string dataDir = "YOUR DOCUMENT DIRECTORY";
            string inFile = dataDir + "42824.pdf";
            string outFile = dataDir + "42824_out.pdf";
            // Load an existing PDF files
            Document doc = new Document(inFile);
            // Get access to first page of PDF file
            Aspose.Pdf.Page tocPage = doc.Pages.Insert(1);
            // Create object to represent TOC information
            TocInfo tocInfo = new TocInfo();
            TextFragment title = new TextFragment("Table Of Contents");
            title.TextState.FontSize = 20;
            title.TextState.FontStyle = FontStyles.Bold;
            // Set the title for TOC
            tocInfo.Title = title;
            tocInfo.PageNumbersPrefix = "P";
            tocPage.TocInfo = tocInfo;
            for (int i = 1; i<doc.Pages.Count; i++)
            {
                // Create Heading object
                Aspose.Pdf.Heading heading2 = new Aspose.Pdf.Heading(1);
                TextSegment segment2 = new TextSegment();
                heading2.TocPage = tocPage;
                heading2.Segments.Add(segment2);
                // Specify the destination page for heading object
                heading2.DestinationPage = doc.Pages[i + 1];
                // Destination page
                heading2.Top = doc.Pages[i + 1].Rect.Height;
                // Destination coordinate
                segment2.Text = "Page " + i.ToString();
                // Add heading to page containing TOC
                tocPage.Paragraphs.Add(heading2);
            }

            // Save the updated document
            doc.Save(outFile);
            
        
```

## Conclusion

In this tutorial, we have provided step-by-step guidance on how to customize page numbers while adding a TOC using Aspose.PDF for .NET. We have also provided a code example that you can use as a reference when implementing this feature in your


