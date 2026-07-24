---
title: "Aspose::Page::EPS::PsDocument::Save 方法"
linktitle: "Save"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::Save 方法。 将给定的 PsDocument 保存为 PS 或 EPS 文件。 仅在 PsDocument 在 C++ 中从头创建时使用此方法。"
type: docs
weight: 4200
url: /zh/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


将给定的 [PsDocument](../) 保存为 PS 或 [EPS](../../) 文件。 仅在 [PsDocument](../) 从头创建时使用此方法。

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## 另见

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


将给定的 [PsDocument](../) 保存到流中。 仅在更新了 [XMP](../../../aspose.page.eps.xmp/) 元数据后使用此方法。 它保存初始的 [EPS](../../) 文件，并使用已更新的现有元数据或在调用 GetMetadata 方法时创建的新元数据。 在最后一种情况下，会添加所有必要的 PostScript 代码和 [EPS](../../) 注释。

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 输出 [EPS](../../) 文件的流。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


将给定的 [PsDocument](../) 保存为 [EPS](../../) 文件。 仅在更新了 [XMP](../../../aspose.page.eps.xmp/) 元数据后使用此方法。 它保存初始的 [EPS](../../) 文件，并使用已更新的现有元数据或在调用 GetMetadata 方法时创建的新元数据。 在最后一种情况下，会添加所有必要的 PostScript 代码和 [EPS](../../) 注释。

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outEpsFilePath | System::String | 输出 [EPS](../../) 文件的路径。 |

## 另见

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
