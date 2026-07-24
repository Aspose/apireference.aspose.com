---
title: "Aspose::Page::EPS::PsDocument::ExtractText 方法"
linktitle: "ExtractText"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::ExtractText 方法。从 PS 文件中提取文本。仅当文本使用 Type 42（TrueType）字体或在其向量映射中包含 Type 42 字体的 Type 0 字体编写时，才能提取文本，适用于 C++。"
type: docs
weight: 2300
url: /zh/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


从 PS 文件中提取文本。仅当文本使用 Type 42 (**TrueType**) 字体或在其向量映射中包含 Type 42 字体的 Type 0 字体时才能提取。

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 选项 | System::SharedPtr\<SaveOptions\> | 保存选项。 |
| startPage | int32_t | 开始提取文本的页码。此参数对多页文档很有用。 |
| endPage | int32_t | 结束提取文本的页码。此参数对多页文档很有用。 |

### ReturnValue

提取的文本。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
