---
title: "Aspose::Page::EPS::PsDocument::Save yöntemi"
linktitle: "Save"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::PsDocument::Save yöntemi. Verilen PsDocument'i PS veya EPS dosyası olarak kaydeder. Bu yöntem yalnızca PsDocument C++'ta sıfırdan oluşturulduğunda kullanılır."
type: docs
weight: 4200
url: /tr/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


Verilen [PsDocument](../) dosyasını PS veya [EPS](../../) dosyası olarak kaydeder. Bu yöntem yalnızca [PsDocument](../) sıfırdan oluşturulduğunda kullanılır.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## Ayrıca Bakınız

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


Verilen [PsDocument](../) akışa kaydeder. Bu yöntem yalnızca [XMP](../../../aspose.page.eps.xmp/) üst verileri güncellendikten sonra kullanılır. İlk [EPS](../../) dosyasını güncellenmiş mevcut üst verilerle veya GetMetadata yöntemi çağrılırken oluşturulan yeni üst veriyle kaydeder. Son durumda gerekli tüm PostScript kodu ve [EPS](../../) yorumları eklenir.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | Çıktı [EPS](../../) dosyasının akışı. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


Verilen [PsDocument](../) dosyasını [EPS](../../) dosyası olarak kaydeder. Bu yöntem yalnızca [XMP](../../../aspose.page.eps.xmp/) üst verileri güncelledikten sonra kullanılır. İlk [EPS](../../) dosyasını güncellenmiş mevcut üst verilerle veya GetMetadata yöntemi çağrılırken oluşturulan yeni üst veriyle kaydeder. Son durumda gerekli tüm PostScript kodu ve [EPS](../../) yorumları eklenir.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outEpsFilePath | System::String | Çıktı [EPS](../../) dosya yolu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
