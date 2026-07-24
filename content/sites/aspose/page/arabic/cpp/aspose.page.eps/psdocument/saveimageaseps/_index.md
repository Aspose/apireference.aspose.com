---
title: "Aspose::Page::EPS::PsDocument::SaveImageAsEps طريقة"
linktitle: "SaveImageAsEps"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::EPS::PsDocument::SaveImageAsEps طريقة. يحفظ كائن Bitmap إلى تدفق إخراج EPS في C++."
type: docs
weight: 5800
url: /ar/cpp/aspose.page.eps/psdocument/saveimageaseps/
---
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


يحفظ كائن Bitmap إلى تدفق إخراج [EPS](../../).

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| صورة | System::SharedPtr\<System::Drawing::Bitmap\> | الصورة. |
| epsStream | System::SharedPtr\<System::IO::Stream\> | دفق إخراج [EPS](../../). |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | يحتوي على معلمات تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


يحفظ كائن Bitmap إلى ملف [EPS](../../).

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| صورة | System::SharedPtr\<System::Drawing::Bitmap\> | الصورة. |
| epsFilePath | System::String | مسار ملف [EPS](../../). |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | يحتوي على معلمات تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [String](../../../system/string/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


يحفظ صورة PNG/JPEG/TIFF/BMP/GIF/EMF من دفق الإدخال إلى دفق إخراج [EPS](../../).

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::IO::Stream> imageStream, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| imageStream | System::SharedPtr\<System::IO::Stream\> | دفق إدخال الصورة. |
| epsStream | System::SharedPtr\<System::IO::Stream\> | دفق إخراج [EPS](../../). |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | يحتوي على معلمات تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


يحفظ صورة PNG/JPEG/TIFF/BMP/GIF/EMF من ملف إلى ملف [EPS](../../).

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::String imageFilePath, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| imageFilePath | System::String | مسار ملف الصورة. |
| epsFilePath | System::String | مسار ملف [EPS](../../). |
| خيارات | System::SharedPtr\<Device::PsSaveOptions\> | يحتوي على معلمات تحدد إخراج الأخطاء التي تُرمى أثناء التحويل. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
