---
title: Aspose::Words::Font::get_HighlightColor method
linktitle: get_HighlightColor
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Font::get_HighlightColor method. Gets or sets the highlight (marker) color in C++.'
type: docs
weight: 17000
url: /cpp/aspose.words/font/get_highlightcolor/
---
## Font::get_HighlightColor method


Gets or sets the highlight (marker) color.

```cpp
System::Drawing::Color Aspose::Words::Font::get_HighlightColor()
```


## Examples



Shows how to format a run of text using its font property. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto run = System::MakeObject<Aspose::Words::Run>(doc, u"Hello world!");

System::SharedPtr<Aspose::Words::Font> font = run->get_Font();
font->set_Name(u"Courier New");
font->set_Size(36);
font->set_HighlightColor(System::Drawing::Color::get_Yellow());

doc->get_FirstSection()->get_Body()->get_FirstParagraph()->AppendChild<System::SharedPtr<Aspose::Words::Run>>(run);
doc->Save(get_ArtifactsDir() + u"Font.CreateFormattedRun.docx");
```

## See Also

* Class [Font](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
