---
title: Aspose::Words::ImportFormatMode enum
linktitle: ImportFormatMode
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::ImportFormatMode enum. Specifies how formatting is merged when importing content from another document in C++.'
type: docs
weight: 93000
url: /cpp/aspose.words/importformatmode/
---
## ImportFormatMode enum


Specifies how formatting is merged when importing content from another document.

```cpp
enum class ImportFormatMode
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| UseDestinationStyles | 0 | Use the destination document styles and copy new styles. This is the default option. |
| KeepSourceFormatting | 1 | Copy all required styles to the destination document, generate unique style names if needed. |
| KeepDifferentStyles | 2 | Only copy styles that are different from those in the source document. |

## Remarks


When you copy nodes from one document to another, this option specifies how formatting is resolved when both documents have a style with the same name, but different formatting.

The formatting is resolved as follows:

1. Built-in styles are matched using their locale independent style identifier. User defined styles are matched using case-sensitive style name.
1. If a matching style is not found in the destination document, the style (and all styles referenced by it) are copied into the destination document and the imported nodes are updated to reference the new style.
1. If a matching style already exists in the destination document, what happens depends on the **importFormatMode** parameter passed to [ImportNode()](../) as described below.



When using the [UseDestinationStyles](./) option, if a matching style already exists in the destination document, the style is not copied and the imported nodes are updated to reference the existing style.

The drawback of using [UseDestinationStyles](./) is that the imported text might look different in the destination document comparing to the source document. For example, the "Heading 1" style in the source document uses Arial 16pt font and the "Heading 1" style in the destination document uses Times New Roman 14pt font. When importing text of "Heading 1" style with no other direct formatting, it will appear as Times New Roman 14pt font in the destination document.

[KeepSourceFormatting](./) option allows to make sure the imported content looks the same in the destination document like it looks in the source document. If a matching style already exists in the destination document, the source style formatting is expanded into direct [Node](../node/) attributes and the style is changed to Normal. If the style does not exist in the destination document, then the source style is imported into the destination document and applied to the imported node. Note, that it is not always possible to preserve the source style even if it does not exist in the destination document. In this case formatting of such style will be expanded into direct [Node](../node/) attributes in favor of preserving original [Node](../node/) formatting.

The drawback of using [KeepSourceFormatting](./) is that if you perform several imports, you could end up with many styles in the destination document and that could make using consistent style formatting in Microsoft Word difficult for this document.

Using [KeepDifferentStyles](./) option allows to reuse destination styles if the formatting they provide is identical to the styles in the source document. If the style in destination document is different from the source then it is imported.

## Examples



Shows how to insert a document into another document. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Document.docx");

auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);
builder->MoveToDocumentEnd();
builder->InsertBreak(Aspose::Words::BreakType::PageBreak);

auto docToInsert = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Formatted elements.docx");

builder->InsertDocument(docToInsert, Aspose::Words::ImportFormatMode::KeepSourceFormatting);
builder->get_Document()->Save(get_ArtifactsDir() + u"DocumentBuilder.InsertDocument.docx");
```

## See Also

* Namespace [Aspose::Words](../)
* Library [Aspose.Words for C++](../../)
