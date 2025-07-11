---
title: FieldIndex.CrossReferenceSeparator
linktitle: CrossReferenceSeparator
articleTitle: CrossReferenceSeparator
second_title: Aspose.Words for .NET
description: Discover the FieldIndex CrossReferenceSeparator property to easily manage character sequences for separating cross references and entries efficiently.
type: docs
weight: 30
url: /net/aspose.words.fields/fieldindex/crossreferenceseparator/
---
## FieldIndex.CrossReferenceSeparator property

Gets or sets the character sequence that is used to separate cross references and other entries.

```csharp
public string CrossReferenceSeparator { get; set; }
```

## Examples

Shows how to define cross references in an INDEX field.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create an INDEX field which will display an entry for each XE field found in the document.
// Each entry will display the XE field's Text property value on the left side,
// and the number of the page that contains the XE field on the right.
// The INDEX entry will collect all XE fields with matching values in the "Text" property
// into one entry as opposed to making an entry for each XE field.
FieldIndex index = (FieldIndex)builder.InsertField(FieldType.FieldIndex, true);

// We can configure an XE field to get its INDEX entry to display a string instead of a page number.
// First, for entries that substitute a page number with a string,
// specify a custom separator between the XE field's Text property value and the string.
index.CrossReferenceSeparator = ", see: ";

Assert.That(index.GetFieldCode(), Is.EqualTo(" INDEX  \\k \", see: \""));

// Insert an XE field, which creates a regular INDEX entry which displays this field's page number,
// and does not invoke the CrossReferenceSeparator value.
// The entry for this XE field will display "Apple, 2".
builder.InsertBreak(BreakType.PageBreak);
FieldXE indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "Apple";

Assert.That(indexEntry.GetFieldCode(), Is.EqualTo(" XE  Apple"));

// Insert another XE field on page 3 and set a value for the PageNumberReplacement property.
// This value will show up instead of the number of the page that this field is on,
// and the INDEX field's CrossReferenceSeparator value will appear in front of it.
// The entry for this XE field will display "Banana, see: Tropical fruit".
builder.InsertBreak(BreakType.PageBreak);
indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "Banana";
indexEntry.PageNumberReplacement = "Tropical fruit";

Assert.That(indexEntry.GetFieldCode(), Is.EqualTo(" XE  Banana \\t \"Tropical fruit\""));

doc.UpdatePageLayout();
doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.INDEX.XE.CrossReferenceSeparator.docx");
```

### See Also

* class [FieldIndex](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
