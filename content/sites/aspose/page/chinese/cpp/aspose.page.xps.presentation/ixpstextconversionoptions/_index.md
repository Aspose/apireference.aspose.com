---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions 类"
linktitle: "IXpsTextConversionOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions 类。 定义了在 C++ 中将 XPS 转换为其他格式的选项。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


定义了将 [XPS](../../aspose.page.xps/) 转换为其他格式的选项。

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | 在 [XPS](../../aspose.page.xps/) 中，某些文本元素可能包含指向备用字形形式的引用，这些字形在字体中没有对应的字符码。如果将此标志设置为 true，则此类 [XPS](../../aspose.page.xps/) 元素的文本会被转换为图形形状。然后文本本身会以透明方式显示在上方。这样这些元素的文本仍然可以被选中。但副作用是输出文件可能比原始文件大得多。如果将此标志设置为 false，则应显示为备用形式的字符会被替换为其他字符，这些字符会映射到备用字形形式。因此，文本虽然仍可选中，但会被修改，可能变得难以阅读。 |
| virtual [set_PreserveText](./set_preservetext/)(bool) | 在 [XPS](../../aspose.page.xps/) 中，某些文本元素可能包含指向备用字形形式的引用，这些字形在字体中没有对应的字符码。如果将此标志设置为 true，则此类 [XPS](../../aspose.page.xps/) 元素的文本会被转换为图形形状。然后文本本身会以透明方式显示在上方。这样这些元素的文本仍然可以被选中。但副作用是输出文件可能比原始文件大得多。如果将此标志设置为 false，则应显示为备用形式的字符会被替换为其他字符，这些字符会映射到备用字形形式。因此，文本虽然仍可选中，但会被修改，可能变得难以阅读。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
