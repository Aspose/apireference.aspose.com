---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions 类"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions 类。用于 C++ 中 XPS 转 PDF 保存选项的类。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


用于 XPS-as-PDF 保存选项的类。

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | 指定从一个节点传递到另一个节点的页面块的大小。 |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | 在页面保存之前执行修改的事件处理程序集合，用于 [XPS](../../aspose.page.xps/) 页面。 |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | 获取加密细节。如果未设置，则不执行加密。 |
| [get_ImageCompression](./get_imagecompression/)() const | 指定文档中所有图像使用的压缩类型。默认是 [PdfImageCompression::Auto](../pdfimagecompression/)。 |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | 指定在查看器中打开 PDF 文件时文档大纲应展开到的层级。1 - 仅显示第一层大纲项，2 - 仅显示第一层和第二层大纲项，依此类推。默认值为 1。 |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | 指定要保存的文档大纲树的深度。0 - 大纲树将不被转换，1 - 仅转换第一层大纲项，依此类推。默认值为 10。 |
| [get_PageNumbers](./get_pagenumbers/)() override | 获取/设置要转换的页码数组。 |
| [get_PreserveText](./get_preservetext/)() override | 在 [XPS](../../aspose.page.xps/) 中，某些文本元素可能包含与字体中任何字符码不对应的备用字形形式的引用。如果此标志设置为 true，则此类 [XPS](../../aspose.page.xps/) 元素的文本将转换为图形形状。然后文本本身会在上方呈现透明状态。这样这些元素的文本仍然可以被选中。但副作用是输出文件可能会比原始文件大得多。如果此标志设置为 false，则应显示为备用形式的字符会被替换为其他字符，这些字符会映射到备用字形形式。因此，文本虽然仍可选中，但会被修改，可能变得难以阅读。默认值为 false。 |
| [get_TextCompression](./get_textcompression/)() const | 指定在文档大纲的哪个层级显示 [ApsBookmark](../) 对象。0 - 不显示。1 - 在第一层显示，依此类推。默认值为 0。 |
| [PdfSaveOptions](./pdfsaveoptions/)() | 创建选项的新实例。 |
| [set_BatchSize](./set_batchsize/)(int32_t) override | 指定从一个节点传递到另一个节点的页面块的大小。 |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | 设置加密细节。如果未设置，则不执行加密。 |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | 指定文档中所有图像使用的压缩类型。默认是 [PdfImageCompression::Auto](../pdfimagecompression/)。 |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | 指定在查看器中打开 PDF 文件时文档大纲应展开到的层级。1 - 仅显示第一层大纲项，2 - 仅显示第一层和第二层大纲项，依此类推。默认值为 1。 |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | 指定要保存的文档大纲树的深度。0 - 大纲树将不被转换，1 - 仅转换第一层大纲项，依此类推。默认值为 10。 |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | 获取/设置要转换的页码数组。 |
| [set_PreserveText](./set_preservetext/)(bool) override | 在 [XPS](../../aspose.page.xps/) 中，某些文本元素可能包含与字体中任何字符码不对应的备用字形形式的引用。如果此标志设置为 true，则此类 [XPS](../../aspose.page.xps/) 元素的文本将转换为图形形状。然后文本本身会在上方呈现透明状态。这样这些元素的文本仍然可以被选中。但副作用是输出文件可能会比原始文件大得多。如果此标志设置为 false，则应显示为备用形式的字符会被替换为其他字符，这些字符会映射到备用字形形式。因此，文本虽然仍可选中，但会被修改，可能变得难以阅读。默认值为 false。 |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | 指定在文档大纲的哪个层级显示 [ApsBookmark](../) 对象。0 - 不显示。1 - 在第一层显示，依此类推。默认值为 0。 |
## 另见

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
