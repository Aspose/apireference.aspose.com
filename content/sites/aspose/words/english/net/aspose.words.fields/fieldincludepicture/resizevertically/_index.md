---
title: FieldIncludePicture.ResizeVertically
linktitle: ResizeVertically
articleTitle: ResizeVertically
second_title: Aspose.Words for .NET
description: Discover how the ResizeVertically property of FieldIncludePicture enhances image management by allowing vertical resizing for optimal display.
type: docs
weight: 50
url: /net/aspose.words.fields/fieldincludepicture/resizevertically/
---
## FieldIncludePicture.ResizeVertically property

Gets or sets whether to resize the picture vertically from the source.

```csharp
public bool ResizeVertically { get; set; }
```

## Examples

Shows how to insert images using IMPORT and INCLUDEPICTURE fields.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Below are two similar field types that we can use to display images linked from the local file system.
// 1 -  The INCLUDEPICTURE field:
FieldIncludePicture fieldIncludePicture = (FieldIncludePicture)builder.InsertField(FieldType.FieldIncludePicture, true);
fieldIncludePicture.SourceFullName = ImageDir + "Transparent background logo.png";

Assert.That(Regex.Match(fieldIncludePicture.GetFieldCode(), " INCLUDEPICTURE  .*").Success, Is.True);

// Apply the PNG32.FLT filter.
fieldIncludePicture.GraphicFilter = "PNG32";
fieldIncludePicture.IsLinked = true;
fieldIncludePicture.ResizeHorizontally = true;
fieldIncludePicture.ResizeVertically = true;

// 2 -  The IMPORT field:
FieldImport fieldImport = (FieldImport)builder.InsertField(FieldType.FieldImport, true);
fieldImport.SourceFullName = ImageDir + "Transparent background logo.png";
fieldImport.GraphicFilter = "PNG32";
fieldImport.IsLinked = true;

Assert.That(Regex.Match(fieldImport.GetFieldCode(), " IMPORT  .* \\\\c PNG32 \\\\d").Success, Is.True);

doc.UpdateFields();
doc.Save(ArtifactsDir + "Field.IMPORT.INCLUDEPICTURE.docx");
```

### See Also

* class [FieldIncludePicture](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
