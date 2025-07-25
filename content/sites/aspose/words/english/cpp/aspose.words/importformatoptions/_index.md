---
title: Aspose::Words::ImportFormatOptions class
linktitle: ImportFormatOptions
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::ImportFormatOptions class. Allows to specify various import options to format output. To learn more, visit the  documentation article in C++.'
type: docs
weight: 35000
url: /cpp/aspose.words/importformatoptions/
---
## ImportFormatOptions class


Allows to specify various import options to format output. To learn more, visit the [Specify Load Options](https://docs.aspose.com/words/cpp/specify-load-options/) documentation article.

```cpp
class ImportFormatOptions : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [get_AdjustSentenceAndWordSpacing](./get_adjustsentenceandwordspacing/)() const | Gets or sets a boolean value that specifies whether to adjust sentence and word spacing automatically. The default value is **false**. |
| [get_ForceCopyStyles](./get_forcecopystyles/)() const | Gets or sets a boolean value indicating either to copy conflicting styles in [KeepSourceFormatting](../importformatmode/) mode. The default value is **false**. |
| [get_IgnoreHeaderFooter](./get_ignoreheaderfooter/)() const | Gets or sets a boolean value that specifies that source formatting of headers/footers content ignored if [KeepSourceFormatting](../importformatmode/) mode is used. The default value is **true**. |
| [get_IgnoreTextBoxes](./get_ignoretextboxes/)() const | Gets or sets a boolean value that specifies that source formatting of textboxes content ignored if [KeepSourceFormatting](../importformatmode/) mode is used. The default value is **true**. |
| [get_KeepSourceNumbering](./get_keepsourcenumbering/)() const | Gets or sets a boolean value that specifies how the numbering will be imported when it clashes in source and destination documents. The default value is **false**. |
| [get_MergePastedLists](./get_mergepastedlists/)() const | Gets or sets a boolean value that specifies whether pasted lists will be merged with surrounding lists. The default value is **false**. |
| [get_SmartStyleBehavior](./get_smartstylebehavior/)() const | Gets or sets a boolean value that specifies how styles will be imported when they have equal names in source and destination documents. The default value is **false**. |
| [GetType](./gettype/)() const override |  |
| [ImportFormatOptions](./importformatoptions/)() |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [set_AdjustSentenceAndWordSpacing](./set_adjustsentenceandwordspacing/)(bool) | Setter for [Aspose::Words::ImportFormatOptions::get_AdjustSentenceAndWordSpacing](./get_adjustsentenceandwordspacing/). |
| [set_ForceCopyStyles](./set_forcecopystyles/)(bool) | Setter for [Aspose::Words::ImportFormatOptions::get_ForceCopyStyles](./get_forcecopystyles/). |
| [set_IgnoreHeaderFooter](./set_ignoreheaderfooter/)(bool) | Setter for [Aspose::Words::ImportFormatOptions::get_IgnoreHeaderFooter](./get_ignoreheaderfooter/). |
| [set_IgnoreTextBoxes](./set_ignoretextboxes/)(bool) | Setter for [Aspose::Words::ImportFormatOptions::get_IgnoreTextBoxes](./get_ignoretextboxes/). |
| [set_KeepSourceNumbering](./set_keepsourcenumbering/)(bool) | Setter for [Aspose::Words::ImportFormatOptions::get_KeepSourceNumbering](./get_keepsourcenumbering/). |
| [set_MergePastedLists](./set_mergepastedlists/)(bool) | Setter for [Aspose::Words::ImportFormatOptions::get_MergePastedLists](./get_mergepastedlists/). |
| [set_SmartStyleBehavior](./set_smartstylebehavior/)(bool) | Setter for [Aspose::Words::ImportFormatOptions::get_SmartStyleBehavior](./get_smartstylebehavior/). |
| static [Type](./type/)() |  |

## Examples



Shows how to resolve duplicate styles while inserting documents. 
```cpp
auto dstDoc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(dstDoc);

System::SharedPtr<Aspose::Words::Style> myStyle = builder->get_Document()->get_Styles()->Add(Aspose::Words::StyleType::Paragraph, u"MyStyle");
myStyle->get_Font()->set_Size(14);
myStyle->get_Font()->set_Name(u"Courier New");
myStyle->get_Font()->set_Color(System::Drawing::Color::get_Blue());

builder->get_ParagraphFormat()->set_StyleName(myStyle->get_Name());
builder->Writeln(u"Hello world!");

// Clone the document and edit the clone's "MyStyle" style, so it is a different color than that of the original.
// If we insert the clone into the original document, the two styles with the same name will cause a clash.
System::SharedPtr<Aspose::Words::Document> srcDoc = dstDoc->Clone();
srcDoc->get_Styles()->idx_get(u"MyStyle")->get_Font()->set_Color(System::Drawing::Color::get_Red());

// When we enable SmartStyleBehavior and use the KeepSourceFormatting import format mode,
// Aspose.Words will resolve style clashes by converting source document styles.
// with the same names as destination styles into direct paragraph attributes.
auto options = System::MakeObject<Aspose::Words::ImportFormatOptions>();
options->set_SmartStyleBehavior(true);

builder->InsertDocument(srcDoc, Aspose::Words::ImportFormatMode::KeepSourceFormatting, options);

dstDoc->Save(get_ArtifactsDir() + u"DocumentBuilder.SmartStyleBehavior.docx");
```

## See Also

* Namespace [Aspose::Words](../)
* Library [Aspose.Words for C++](../../)
