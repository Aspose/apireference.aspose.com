---
title: BuiltInDocumentProperties.LastSavedTime
linktitle: LastSavedTime
articleTitle: LastSavedTime
second_title: Aspose.Words for .NET
description: Discover the BuiltInDocumentProperties LastSavedTime property to easily track your document's last save time in UTC. Enhance your document management today!
type: docs
weight: 180
url: /net/aspose.words.properties/builtindocumentproperties/lastsavedtime/
---
## BuiltInDocumentProperties.LastSavedTime property

Gets or sets the time of the last save in UTC.

```csharp
public DateTime LastSavedTime { get; set; }
```

## Remarks

For documents originated from RTF format this property returns the local time of last save operation.

Aspose.Words does not update this property.

## Examples

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

Shows how to use the SAVEDATE field to display the date/time of the document's most recent save operation performed using Microsoft Word.

```csharp
Document doc = new Document(MyDir + "Document.docx");
DocumentBuilder builder = new DocumentBuilder(doc);
builder.MoveToDocumentEnd();
builder.Writeln(" Date this document was last saved:");

// We can use the SAVEDATE field to display the last save operation's date and time on the document.
// The save operation that these fields refer to is the manual save in an application like Microsoft Word,
// not the document's Save method.
// Below are three different calendar types according to which the SAVEDATE field can display the date/time.
// 1 -  Islamic Lunar Calendar:
builder.Write("According to the Lunar Calendar - ");
FieldSaveDate field = (FieldSaveDate)builder.InsertField(FieldType.FieldSaveDate, true);
field.UseLunarCalendar = true;

Assert.That(field.GetFieldCode(), Is.EqualTo(" SAVEDATE  \\h"));

// 2 -  Umm al-Qura calendar:
builder.Write("\nAccording to the Umm al-Qura calendar - ");
field = (FieldSaveDate)builder.InsertField(FieldType.FieldSaveDate, true);
field.UseUmAlQuraCalendar = true;

Assert.That(field.GetFieldCode(), Is.EqualTo(" SAVEDATE  \\u"));

// 3 -  Indian National calendar:
builder.Write("\nAccording to the Indian National calendar - ");
field = (FieldSaveDate)builder.InsertField(FieldType.FieldSaveDate, true);
field.UseSakaEraCalendar = true;

Assert.That(field.GetFieldCode(), Is.EqualTo(" SAVEDATE  \\s"));

// The SAVEDATE fields draw their date/time values from the LastSavedTime built-in property.
// The document's Save method will not update this value, but we can still update it manually.
doc.BuiltInDocumentProperties.LastSavedTime = DateTime.Now;

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.SAVEDATE.docx");
```

### See Also

* class [BuiltInDocumentProperties](../)
* namespace [Aspose.Words.Properties](../../../aspose.words.properties/)
* assembly [Aspose.Words](../../../)
