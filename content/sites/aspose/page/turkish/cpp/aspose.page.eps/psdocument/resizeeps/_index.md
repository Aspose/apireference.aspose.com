---
title: "Aspose::Page::EPS::PsDocument::ResizeEps method"
linktitle: "ResizeEps"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::PsDocument::ResizeEps method. Verilen PsDocument'i EPS dosyası olarak yeniden boyutlandırır. Bu yöntem yalnızca EPS boyutu çıkarıldıktan sonra kullanılır. Mevcut %BoundingBox güncellenmiş şekilde veya yeni bir %BoundingBox oluşturularak ilk EPS dosyasını kaydeder. Sayfa dönüşüm matrisi de C++'ta ayarlanır."
type: docs
weight: 4000
url: /tr/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


Verilen [PsDocument](../) dosyasını [EPS](../../) dosyası olarak yeniden boyutlandırır. Bu yöntem yalnızca [EPS](../../) boyutu çıkarıldıktan sonra kullanılır. Başlangıçtaki [EPS](../../) dosyasını güncellenmiş mevcut %BoundingBox ile kaydeder veya yeni bir tane oluşturulur. [Page](../../../aspose.page/) dönüşüm matrisi de ayarlanır.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Çıktı [EPS](../../) dosyasının akışı. |
| newSizeInUnits | System::Drawing::SizeF | Atanan birimlerdeki [EPS](../../) görüntünün yeni boyutu. |
| birimler | Birimler | Yeni boyutun birimleri. Nokta, inç, milimetre, santimetre ve başlangıç boyutunun yüzde değerleri olabilir. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


Verilen [PsDocument](../) dosyasını [EPS](../../) dosyası olarak yeniden boyutlandırır. Bu yöntem yalnızca [EPS](../../) boyutu çıkarıldıktan sonra kullanılır. Başlangıçtaki [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hThe output directory where image file will be saved.e mevcut %BoundingBox güncellenmiş olarak kaydeder veya yeni bir tane oluşturulur. [Page](../../../aspose.page/) dönüşüm matrisi de ayarlanır.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outEpsFilePath | System::String | Çıktı [EPS](../../) dosya yolu. |
| newSizeInUnits | System::Drawing::SizeF | Atanan birimlerdeki [EPS](../../) görüntünün yeni boyutu. |
| birimler | Birimler | Yeni boyutun birimleri. Nokta, inç, milimetre, santimetre ve başlangıç boyutunun yüzde değerleri olabilir. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
