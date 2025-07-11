---
title: BuiltInDocumentProperties.RevisionNumber
linktitle: RevisionNumber
articleTitle: RevisionNumber
second_title: Aspose.Words for .NET
description: Manage your document's RevisionNumber with BuiltInDocumentProperties. Easily track changes and enhance version control for better collaboration.
type: docs
weight: 250
url: /net/aspose.words.properties/builtindocumentproperties/revisionnumber/
---
## BuiltInDocumentProperties.RevisionNumber property

Gets or sets the document revision number.

```csharp
public int RevisionNumber { get; set; }
```

## Remarks

Aspose.Words does not update this property.

## Examples

Shows how to work with REVNUM fields.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("Current revision #");

// Insert a REVNUM field, which displays the document's current revision number property.
FieldRevNum field = (FieldRevNum)builder.InsertField(FieldType.FieldRevisionNum, true);

Assert.That(field.GetFieldCode(), Is.EqualTo(" REVNUM "));
Assert.That(field.Result, Is.EqualTo("1"));
Assert.That(doc.BuiltInDocumentProperties.RevisionNumber, Is.EqualTo(1));

// This property counts how many times a document has been saved in Microsoft Word,
// and is unrelated to tracked revisions. We can find it by right clicking the document in Windows Explorer
// via Properties -> Details. We can update this property manually.
doc.BuiltInDocumentProperties.RevisionNumber++;
field.Update();

Assert.That(field.Result, Is.EqualTo("2"));
```

Shows how to work with document properties in the "Origin" category.

```csharp
// Open a document that we have created and edited using Microsoft Word.
Document doc = new Document(MyDir + "Properties.docx");
BuiltInDocumentProperties properties = doc.BuiltInDocumentProperties;

// The following built-in properties contain information regarding the creation and editing of this document.
// We can right-click this document in Windows Explorer and find
// these properties via "Properties" -> "Details" -> "Origin" category.
// Fields such as PRINTDATE and EDITTIME can display these values in the document body.
Console.WriteLine($"Created using {properties.NameOfApplication}, on {properties.CreatedTime}");
Console.WriteLine($"Minutes spent editing: {properties.TotalEditingTime}");
Console.WriteLine($"Date/time last printed: {properties.LastPrinted}");
Console.WriteLine($"Template document: {properties.Template}");

// We can also change the values of built-in properties.
properties.Company = "Doe Ltd.";
properties.Manager = "Jane Doe";
properties.Version = 5;
properties.RevisionNumber++;

// Microsoft Word updates the following properties automatically when we save the document.
// To use these properties with Aspose.Words, we will need to set values for them manually.
properties.LastSavedBy = "John Doe";
properties.LastSavedTime = DateTime.Now;

// We can right-click this document in Windows Explorer and find these properties in "Properties" -> "Details" -> "Origin".
doc.Save(ArtifactsDir + "DocumentProperties.Origin.docx");
```

### See Also

* class [BuiltInDocumentProperties](../)
* namespace [Aspose.Words.Properties](../../../aspose.words.properties/)
* assembly [Aspose.Words](../../../)
