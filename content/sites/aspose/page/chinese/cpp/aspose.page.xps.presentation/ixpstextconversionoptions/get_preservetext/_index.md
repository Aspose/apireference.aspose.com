---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::get_PreserveText 方法"
linktitle: "get_PreserveText"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::get_PreserveText 方法。 在 XPS 中，某些文本元素可能包含指向替代字形形式的引用，这些字形在字体中没有对应的字符码。 如果此标志设置为 true，则这些 XPS 元素中的文本将被转换为图形形状。 然后文本本身会以透明方式显示在上方。 这使得这些元素的文本仍然可选中。 但副作用是输出文件可能比原始文件大得多。 如果此标志设置为 false，则应显示为替代形式的字符会被替换为其他字符，这些字符会映射到替代字形形式。 因此，文本虽然仍可选中，但会被修改，并且在 C++ 中可能变得难以阅读。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/get_preservetext/
---
## IXpsTextConversionOptions::get_PreserveText method


In [XPS](../../../aspose.page.xps/)，某些文本元素可能包含指向替代字形形式的引用，这些字形在字体中没有对应的字符码。 如果此标志设置为 true，则来自这些 [XPS](../../../aspose.page.xps/) 元素的文本将被转换为图形形状。 然后文本本身会以透明方式显示在上方。 这使得这些元素的文本仍然可选中。 但副作用是输出文件可能比原始文件大得多。 如果此标志设置为 false，则应显示为替代形式的字符会被替换为其他字符，这些字符会映射到替代字形形式。 因此，文本虽然仍可选中，但会被修改，并且可能变得难以阅读。

```cpp
virtual bool Aspose::Page::XPS::Presentation::IXpsTextConversionOptions::get_PreserveText()=0
```

## 另见

* Class [IXpsTextConversionOptions](../)
* Namespace [Aspose::Page::XPS::Presentation](../../)
* Library [Aspose.Page for C++](../../../)
