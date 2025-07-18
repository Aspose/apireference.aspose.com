---
title: Aspose::Words::BorderType enum
linktitle: BorderType
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::BorderType enum. Specifies sides of a border. To learn more, visit the  documentation article in C++.'
type: docs
weight: 81000
url: /cpp/aspose.words/bordertype/
---
## BorderType enum


Specifies sides of a border. To learn more, visit the [Programming with Documents](https://docs.aspose.com/words/cpp/programming-with-documents/) documentation article.

```cpp
enum class BorderType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | -1 | Default value. |
| Bottom | 0 | Specifies the bottom border of a paragraph or a table cell. |
| Left | 1 | Specifies the left border of a paragraph or a table cell. |
| Right | 2 | Specifies the right border of a paragraph or a table cell. |
| Top | 3 | Specifies the top border of a paragraph or a table cell. |
| Horizontal | 4 | Specifies the horizontal border between cells in a table or between conforming paragraphs. |
| Vertical | 5 | Specifies the vertical border between cells in a table. |
| DiagonalDown | 6 | Specifies the diagonal border in a table cell. |
| DiagonalUp | 7 | Specifies the diagonal border in a table cell. |


## Examples



Shows how to insert a paragraph with a top border. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::Border> topBorder = builder->get_ParagraphFormat()->get_Borders()->get_Top();
topBorder->set_LineWidth(4.0);
topBorder->set_LineStyle(Aspose::Words::LineStyle::DashSmallGap);
// Set ThemeColor only when LineWidth or LineStyle setted.
topBorder->set_ThemeColor(Aspose::Words::Themes::ThemeColor::Accent1);
topBorder->set_TintAndShade(0.25);

builder->Writeln(u"Text with a top border.");

doc->Save(get_ArtifactsDir() + u"Border.ParagraphTopBorder.docx");
```

## See Also

* Namespace [Aspose::Words](../)
* Library [Aspose.Words for C++](../../)
