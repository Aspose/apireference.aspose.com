---
title: FieldCitation.Prefix
linktitle: Prefix
articleTitle: Prefix
second_title: Aspose.Words for .NET
description: Discover the FieldCitation Prefix property, easily customize citations with a unique prefix for enhanced clarity and organization in your documents.
type: docs
weight: 50
url: /net/aspose.words.fields/fieldcitation/prefix/
---
## FieldCitation.Prefix property

Gets or sets a prefix that is prepended to the citation.

```csharp
public string Prefix { get; set; }
```

## Examples

Shows how to work with CITATION and BIBLIOGRAPHY fields.

```csharp
// Open a document containing bibliographical sources that we can find in
// Microsoft Word via References -> Citations & Bibliography -> Manage Sources.
Document doc = new Document(MyDir + "Bibliography.docx");
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Write("Text to be cited with one source.");

// Create a citation with just the page number and the author of the referenced book.
FieldCitation fieldCitation = (FieldCitation)builder.InsertField(FieldType.FieldCitation, true);

// We refer to sources using their tag names.
fieldCitation.SourceTag = "Book1";
fieldCitation.PageNumber = "85";
fieldCitation.SuppressAuthor = false;
fieldCitation.SuppressTitle = true;
fieldCitation.SuppressYear = true;

Assert.That(fieldCitation.GetFieldCode(), Is.EqualTo(" CITATION  Book1 \\p 85 \\t \\y"));

// Create a more detailed citation which cites two sources.
builder.InsertParagraph();
builder.Write("Text to be cited with two sources.");
fieldCitation = (FieldCitation)builder.InsertField(FieldType.FieldCitation, true);
fieldCitation.SourceTag = "Book1";
fieldCitation.AnotherSourceTag = "Book2";
fieldCitation.FormatLanguageId = "en-US";
fieldCitation.PageNumber = "19";
fieldCitation.Prefix = "Prefix ";
fieldCitation.Suffix = " Suffix";
fieldCitation.SuppressAuthor = false;
fieldCitation.SuppressTitle = false;
fieldCitation.SuppressYear = false;
fieldCitation.VolumeNumber = "VII";

Assert.That(fieldCitation.GetFieldCode(), Is.EqualTo(" CITATION  Book1 \\m Book2 \\l en-US \\p 19 \\f \"Prefix \" \\s \" Suffix\" \\v VII"));

// We can use a BIBLIOGRAPHY field to display all the sources within the document.
builder.InsertBreak(BreakType.PageBreak);
FieldBibliography fieldBibliography = (FieldBibliography)builder.InsertField(FieldType.FieldBibliography, true);
fieldBibliography.FormatLanguageId = "5129";
fieldBibliography.FilterLanguageId = "5129";
fieldBibliography.SourceTag = "Book2";

Assert.That(fieldBibliography.GetFieldCode(), Is.EqualTo(" BIBLIOGRAPHY  \\l 5129 \\f 5129 \\m Book2"));

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.CITATION.docx");
```

### See Also

* class [FieldCitation](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
