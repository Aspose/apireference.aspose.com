---
title: StructuredDocumentTag.Checked
linktitle: Checked
articleTitle: Checked
second_title: Aspose.Words for .NET
description: Manage Checkbox SDT with the StructuredDocumentTag Checked property. Easily get/set its state—default is false. Enhance document interactivity today!
type: docs
weight: 60
url: /net/aspose.words.markup/structureddocumenttag/checked/
---
## StructuredDocumentTag.Checked property

Gets/Sets current state of the Checkbox **SDT**. Default value for this property is `false`.

```csharp
public bool Checked { get; set; }
```

## Remarks

Accessing this property will only work for Checkbox SDT types.

For all other SDT types exception will occur.

## Examples

Show how to create a structured document tag in the form of a check box.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

StructuredDocumentTag sdtCheckBox =
    new StructuredDocumentTag(doc, SdtType.Checkbox, MarkupLevel.Inline) { Checked = true };

// We can set the symbols used to represent the checked/unchecked state of a checkbox content control.
sdtCheckBox.SetCheckedSymbol(0x00A9, "Times New Roman");
sdtCheckBox.SetUncheckedSymbol(0x00AE, "Times New Roman");

builder.InsertNode(sdtCheckBox);

doc.Save(ArtifactsDir + "StructuredDocumentTag.CheckBox.docx");
```

### See Also

* class [StructuredDocumentTag](../)
* namespace [Aspose.Words.Markup](../../../aspose.words.markup/)
* assembly [Aspose.Words](../../../)
