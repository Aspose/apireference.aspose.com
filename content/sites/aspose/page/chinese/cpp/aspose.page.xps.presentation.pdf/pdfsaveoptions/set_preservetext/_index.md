---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText 方法"
linktitle: "set_PreserveText"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText 方法。 在 XPS 中，某些文本元素可能包含指向替代字形形式的引用，这些字形在字体中没有对应的字符代码。如果将此标志设置为 true，则此类 XPS 元素的文本将转换为图形形状。然后文本本身会以透明方式显示在上方。这使得这些元素的文本仍可被选中。但副作用是输出文件可能比原始文件大得多。如果将此标志设置为 false，则应显示为替代形式的字符会被替换为其他字符，这些字符会映射到替代字形形式。因此，文本虽然仍可选中，但会被修改并可能变得不可读。默认值在 C++ 中为 false。"
type: docs
weight: 1700
url: /zh/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/set_preservetext/
---
## PdfSaveOptions::set_PreserveText method


在 [XPS](../../../aspose.page.xps/) 中，某些文本元素可能包含指向替代字形形式的引用，这些字形在字体中没有对应的字符代码。如果将此标志设置为 true，则此类 [XPS](../../../aspose.page.xps/) 元素的文本将转换为图形形状。然后文本本身会以透明方式显示在上方。这使得这些元素的文本仍可被选中。但副作用是输出文件可能比原始文件大得多。如果将此标志设置为 false，则应显示为替代形式的字符会被替换为其他字符，这些字符会映射到替代字形形式。因此，文本虽然仍可选中，但会被修改并可能变得不可读。默认值为 false。

```cpp
void Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText(bool value) override
```

## 另见

* Class [PdfSaveOptions](../)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../../)
* Library [Aspose.Page for C++](../../../)
