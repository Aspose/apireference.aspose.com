---
title: "Aspose::Page::IMultiPageDevice::OpenPage method"
linktitle: "OpenPage"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage method. C++'ta her sayfa işlenmeden önce cihazın gerekli hazırlığını yapar."
type: docs
weight: 400
url: /tr/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Her sayfa işlenmesinden önce cihazın gerekli hazırlığını yapar.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| genişlik | float | Sayfanın genişliği. |
| yükseklik | float | Sayfanın yüksekliği. |

### ReturnValue

Açılan sayfanın numarası seçilen sayfa numaraları aralığına düşüyorsa true, aksi takdirde false döndürür.

## Ayrıca Bakınız

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Sayfa işlenmesinden önce cihazın gerekli hazırlığını yapar.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| başlık | System::String | Sayfa başlığı. |

### ReturnValue

Sayfa istenen aralıktaysa true, aksi takdirde false. Belirtilen sayfa numaraları dizisini işleyebilen cihazlarda kullanılır.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
