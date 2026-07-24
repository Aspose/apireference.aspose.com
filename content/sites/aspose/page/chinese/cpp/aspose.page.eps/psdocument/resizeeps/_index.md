---
title: "Aspose::Page::EPS::PsDocument::ResizeEps method"
linktitle: "ResizeEps"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps 方法。将给定的 PsDocument 调整为 EPS 文件。此方法仅在提取 EPS 大小后使用。它会使用更新的现有 %BoundingBox 保存初始 EPS 文件，或创建新的。页面变换矩阵也将在 C++ 中设置。"
type: docs
weight: 4000
url: /zh/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


将给定的 [PsDocument](../) 调整为 [EPS](../../) 文件。此方法仅在提取 [EPS](../../) 大小后使用。它会保存初始的 [EPS](../../) 文件，并更新已有的 %BoundingBox，或创建新的。还将设置 [Page](../../../aspose.page/) 的变换矩阵。

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 输出 [EPS](../../) 文件的流。 |
| newSizeInUnits | System::Drawing::SizeF | 指定单位下的 [EPS](../../) 图像的新尺寸。 |
| 单位 | 单位 | 新尺寸的单位。可以是点、英寸、毫米、厘米以及初始尺寸的百分比。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


将给定的 [PsDocument](../) 调整为 [EPS](../../) 文件。此方法仅在提取 [EPS](../../) 大小后使用。它保存初始的 [EPS](../../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e，并更新已有的 %BoundingBox，或创建新的。还将设置 [Page](../../../aspose.page/) 的变换矩阵。

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outEpsFilePath | System::String | 输出的 [EPS](../../) 文件路径。 |
| newSizeInUnits | System::Drawing::SizeF | 指定单位下的 [EPS](../../) 图像的新尺寸。 |
| 单位 | 单位 | 新尺寸的单位。可以是点、英寸、毫米、厘米以及初始尺寸的百分比。 |

## 另见

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
