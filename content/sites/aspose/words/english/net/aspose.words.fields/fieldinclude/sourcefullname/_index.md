---
title: FieldInclude.SourceFullName
linktitle: SourceFullName
articleTitle: SourceFullName
second_title: Aspose.Words for .NET
description: Discover how to utilize the FieldInclude SourceFullName property to efficiently manage document locations. Enhance your workflow today!
type: docs
weight: 40
url: /net/aspose.words.fields/fieldinclude/sourcefullname/
---
## FieldInclude.SourceFullName property

Gets or sets the location of the document.

```csharp
public string SourceFullName { get; set; }
```

## Examples

Shows how to create an INCLUDE field, and set its properties.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// We can use an INCLUDE field to import a portion of another document in the local file system.
// The bookmark from the other document that we reference with this field contains this imported portion.
FieldInclude field = (FieldInclude)builder.InsertField(FieldType.FieldInclude, true);
field.SourceFullName = MyDir + "Bookmarks.docx";
field.BookmarkName = "MyBookmark1";
field.LockFields = false;
field.TextConverter = "Microsoft Word";

Assert.That(Regex.Match(field.GetFieldCode(), " INCLUDE .* MyBookmark1 \\\\c \"Microsoft Word\"").Success, Is.True);

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.INCLUDE.docx");
```

### See Also

* class [FieldInclude](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
