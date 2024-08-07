---
title: Programming With Txtloadoptions
linktitle: Programming With Txtloadoptions
second_title: Aspose.Words for .NET API Reference
description: Examples contain detect numbering with whitespaces, handle spaces options and document text direction
type: docs
weight: 1640
url: /words/net/programming-with-txtloadoptions/
---
Examples contain detect numbering with whitespaces, handle spaces options and document text direction

## Detect Numbering With Whitespaces

```csharp

            
            // Create a plaintext document in the form of a string with parts that may be interpreted as lists.
            // Upon loading, the first three lists will always be detected by Aspose.Words,
            // and List objects will be created for them after loading.
            const string textDoc = "Full stop delimiters:\n" +
                                   "1. First list item 1\n" +
                                   "2. First list item 2\n" +
                                   "3. First list item 3\n\n" +
                                   "Right bracket delimiters:\n" +
                                   "1) Second list item 1\n" +
                                   "2) Second list item 2\n" +
                                   "3) Second list item 3\n\n" +
                                   "Bullet delimiters:\n" +
                                   "• Third list item 1\n" +
                                   "• Third list item 2\n" +
                                   "• Third list item 3\n\n" +
                                   "Whitespace delimiters:\n" +
                                   "1 Fourth list item 1\n" +
                                   "2 Fourth list item 2\n" +
                                   "3 Fourth list item 3";

            // The fourth list, with whitespace inbetween the list number and list item contents,
            // will only be detected as a list if "DetectNumberingWithWhitespaces" in a LoadOptions object is set to true,
            // to avoid paragraphs that start with numbers being mistakenly detected as lists.
            TxtLoadOptions loadOptions = new TxtLoadOptions { DetectNumberingWithWhitespaces = true };

            // Load the document while applying LoadOptions as a parameter and verify the result.
            Document doc = new Document(new MemoryStream(Encoding.UTF8.GetBytes(textDoc)), loadOptions);

            doc.Save(ArtifactsDir + "WorkingWithTxtLoadOptions.DetectNumberingWithWhitespaces.docx");
            
        
```

## Handle Spaces Options

```csharp

            
            const string textDoc = "      Line 1 \n" +
                                   "    Line 2   \n" +
                                   " Line 3       ";

            TxtLoadOptions loadOptions = new TxtLoadOptions
            {
                LeadingSpacesOptions = TxtLeadingSpacesOptions.Trim,
                TrailingSpacesOptions = TxtTrailingSpacesOptions.Trim
            };

            Document doc = new Document(new MemoryStream(Encoding.UTF8.GetBytes(textDoc)), loadOptions);

            doc.Save(ArtifactsDir + "WorkingWithTxtLoadOptions.HandleSpacesOptions.docx");
            
        
```

## Document Text Direction

```csharp

            
            TxtLoadOptions loadOptions = new TxtLoadOptions { DocumentDirection = DocumentDirection.Auto };

            Document doc = new Document(MyDir + "Hebrew text.txt", loadOptions);

            Paragraph paragraph = doc.FirstSection.Body.FirstParagraph;
            Console.WriteLine(paragraph.ParagraphFormat.Bidi);

            doc.Save(ArtifactsDir + "WorkingWithTxtLoadOptions.DocumentTextDirection.docx");
            
        
```

