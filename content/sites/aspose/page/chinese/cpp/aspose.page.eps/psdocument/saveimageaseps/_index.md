---
title: "Aspose::Page::EPS::PsDocument::SaveImageAsEps method"
linktitle: "SaveImageAsEps"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::SaveImageAsEps 方法。在 C++ 中将 Bitmap 对象保存到 EPS 输出流。"
type: docs
weight: 5800
url: /zh/cpp/aspose.page.eps/psdocument/saveimageaseps/
---
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


将 Bitmap 对象保存到 [EPS](../../) 输出流。

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| image | System::SharedPtr\<System::Drawing::Bitmap\> | 图像。 |
| epsStream | System::SharedPtr\<System::IO::Stream\> | [EPS](../../) 输出流。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 包含指定转换期间抛出的错误输出的参数。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


将 Bitmap 对象保存到 [EPS](../../) 文件。

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| image | System::SharedPtr\<System::Drawing::Bitmap\> | 图像。 |
| epsFilePath | System::String | [EPS](../../) 文件路径。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 包含指定转换期间抛出的错误输出的参数。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [String](../../../system/string/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


将 PNG/JPEG/TIFF/BMP/GIF/EMF 图像从输入流保存到 [EPS](../../) 输出流。

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::IO::Stream> imageStream, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| imageStream | System::SharedPtr\<System::IO::Stream\> | 图像输入流。 |
| epsStream | System::SharedPtr\<System::IO::Stream\> | [EPS](../../) 输出流。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 包含指定转换期间抛出的错误输出的参数。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


将 PNG/JPEG/TIFF/BMP/GIF/EMF 图像从文件保存到 [EPS](../../) 文件。

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::String imageFilePath, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| imageFilePath | System::String | 图像文件路径。 |
| epsFilePath | System::String | [EPS](../../) 文件路径。 |
| 选项 | System::SharedPtr\<Device::PsSaveOptions\> | 包含指定转换期间抛出的错误输出的参数。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
