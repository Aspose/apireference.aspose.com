---
title: "Aspose::Page::EPS::PsDocument::CropEps yöntemi"
linktitle: "CropEps"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::PsDocument::CropEps yöntemi. Verilen PsDocument'i EPS dosyası olarak kırpar. Başlangıç EPS dosyasını güncellenmiş mevcut %BoundingBox ile kaydeder; yoksa yeni bir %BoundingBox oluşturulur C++'da."
type: docs
weight: 900
url: /tr/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


Verilen [PsDocument](../) dosyasını [EPS](../../) dosyası olarak kırpar. Başlangıç [EPS](../../) dosyasını güncellenmiş mevcut %BoundingBox ile kaydeder; yoksa yeni bir %BoundingBox oluşturulur.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Çıktı [EPS](../../) dosyasının akışı. |
| cropBox | System::ArrayPtr\<float\> | Kırpma kutusu (x0, y0, x, y). |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


Verilen [PsDocument](../) dosyasını [EPS](../../) dosyası olarak kırpar. Başlangıç [EPS](../../) dosyasını güncellenmiş mevcut %BoundingBox ile kaydeder; yoksa yeni bir %BoundingBox oluşturulur.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outEpsFilePath | System::String | Çıktı [EPS](../../) dosya yolu. |
| cropBox | System::ArrayPtr\<float\> | Kırpma kutusu (x0, y0, x, y). |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
