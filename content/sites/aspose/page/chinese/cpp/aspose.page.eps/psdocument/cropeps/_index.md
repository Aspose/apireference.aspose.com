---
title: "Aspose::Page::EPS::PsDocument::CropEps 方法"
linktitle: "CropEps"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::CropEps 方法。 将给定的 PsDocument 裁剪为 EPS 文件。 它会在 C++ 中保存初始 EPS 文件，并更新已有的 %BoundingBox，若不存在则创建新的。"
type: docs
weight: 900
url: /zh/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


将给定的 [PsDocument](../) 裁剪为 [EPS](../../) 文件。 它会保存初始的 [EPS](../../) 文件，并更新已有的 %BoundingBox，若不存在则创建新的。

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 输出 [EPS](../../) 文件的流。 |
| cropBox | System::ArrayPtr\<float\> | 裁剪框 (x0, y0, x, y)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


将给定的 [PsDocument](../) 裁剪为 [EPS](../../) 文件。 它会保存初始的 [EPS](../../) 文件，并更新已有的 %BoundingBox，若不存在则创建新的。

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| outEpsFilePath | System::String | 输出的 [EPS](../../) 文件路径。 |
| cropBox | System::ArrayPtr\<float\> | 裁剪框 (x0, y0, x, y)。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
