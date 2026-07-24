---
title: "Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF method"
linktitle: "ConvertType3FontToTTF"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF 方法。将 Type 3 字体转换为 C++ 中的 TrueType 流。"
type: docs
weight: 800
url: /zh/cpp/aspose.page.eps/psdocument/converttype3fonttottf/
---
## PsDocument::ConvertType3FontToTTF(System::String, System::SharedPtr\<System::IO::Stream\>) method


将 Type 3 字体转换为 **TrueType** 流。

```cpp
void Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF(System::String type3FontFilePath, System::SharedPtr<System::IO::Stream> outputStream)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| type3FontFilePath | System::String | Type 3 字体文件路径。 |
| outputStream | System::SharedPtr\<System::IO::Stream\> | 用于保存生成的 **TrueType** 字体的输出流。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ConvertType3FontToTTF(System::String, System::String) method


将 Type 3 字体转换为 **TrueType**。转换后的 TTF 字体名称将与输入的 Type 3 字体文件相同，仅添加 \".ttf\" 扩展名。TTF 文件将保存到指定的输出目录。

```cpp
void Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF(System::String type3FontFilePath, System::String outputDir)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| type3FontFilePath | System::String | Type 3 字体文件路径。 |
| outputDir | System::String | 用于保存生成的 **TrueType** 字体的输出目录。 |

## 另见

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
