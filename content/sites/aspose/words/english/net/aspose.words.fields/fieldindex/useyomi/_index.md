---
title: FieldIndex.UseYomi
linktitle: UseYomi
articleTitle: UseYomi
second_title: Aspose.Words for .NET
description: Enhance your indexing with FieldIndex UseYomi property. Easily enable yomi text for improved search visibility and better user experience.
type: docs
weight: 170
url: /net/aspose.words.fields/fieldindex/useyomi/
---
## FieldIndex.UseYomi property

Gets or sets whether to enable the use of yomi text for index entries.

```csharp
public bool UseYomi { get; set; }
```

## Examples

Shows how to sort INDEX field entries phonetically.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create an INDEX field which will display an entry for each XE field found in the document.
// Each entry will display the XE field's Text property value on the left side,
// and the number of the page that contains the XE field on the right.
// The INDEX entry will collect all XE fields with matching values in the "Text" property
// into one entry as opposed to making an entry for each XE field.
FieldIndex index = (FieldIndex)builder.InsertField(FieldType.FieldIndex, true);

// The INDEX table automatically sorts its entries by the values of their Text properties in alphabetic order.
// Set the INDEX table to sort entries phonetically using Hiragana instead.
index.UseYomi = sortEntriesUsingYomi;

if (sortEntriesUsingYomi)
    Assert.That(index.GetFieldCode(), Is.EqualTo(" INDEX  \\y"));
else
    Assert.That(index.GetFieldCode(), Is.EqualTo(" INDEX "));

// Insert 4 XE fields, which would show up as entries in the INDEX field's table of contents.
// The "Text" property may contain a word's spelling in Kanji, whose pronunciation may be ambiguous,
// while the "Yomi" version of the word will spell exactly how it is pronounced using Hiragana.
// If we set our INDEX field to use Yomi, it will sort these entries
// by the value of their Yomi properties, instead of their Text values.
builder.InsertBreak(BreakType.PageBreak);
FieldXE indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "愛子";
indexEntry.Yomi = "あ";

Assert.That(indexEntry.GetFieldCode(), Is.EqualTo(" XE  愛子 \\y あ"));

builder.InsertBreak(BreakType.PageBreak);
indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "明美";
indexEntry.Yomi = "あ";

builder.InsertBreak(BreakType.PageBreak);
indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "恵美";
indexEntry.Yomi = "え";

builder.InsertBreak(BreakType.PageBreak);
indexEntry = (FieldXE)builder.InsertField(FieldType.FieldIndexEntry, true);
indexEntry.Text = "愛美";
indexEntry.Yomi = "え";

doc.UpdatePageLayout();
doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.INDEX.XE.Yomi.docx");
```

### See Also

* class [FieldIndex](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
