---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructor"
linktitle: "PsDocument"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::PsDocument::PsDocument yapıcı. Boş bir PsDocument başlatır. Bu yapıcı yalnızca PostScript dosyalarıyla ilgili olmayan ek işlemler için kullanılır; örneğin, C++'da yazı tiplerini dönüştürmek için."
type: docs
weight: 100
url: /tr/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


Boş bir [PsDocument](../) başlatır. Bu yapıcı yalnızca PostScript dosyalarıyla ilgili olmayan ek işlemler için kullanılır; örneğin, yazı tiplerini dönüştürmek için.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## Ayrıca Bakınız

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


Bir PS/EPS dosyası akışıyla [PsDocument](../) başlatır.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS dosyasının giriş akışı. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Başlatılmış sayfa ile boş bir [PsDocument](../) oluşturur.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS dosyasının kaydedileceği akış. |
| seçenekler | System::SharedPtr\<Device::PsSaveOptions\> | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Boş [PsDocument](../) başlatır.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS dosyasının kaydedileceği akış. |
| seçenekler | System::SharedPtr\<Device::PsSaveOptions\> | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |
| multipaged | bool | false ise sayfa başlatılmaz. Bu durumda sayfa başlatma, açıkça \"openPage(width, height)\" çağrısı ile yapılmalıdır. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Belge sayfalarının sayısı önceden bilindiğinde boş [PsDocument](../) başlatır.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS dosyasının kaydedileceği akış. |
| seçenekler | System::SharedPtr\<Device::PsSaveOptions\> | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |
| numberOfPages | int32_t | PostScript belgesindeki sayfa sayısı. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


Başlatılmış sayfa ile boş bir [PsDocument](../) oluşturur.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outPsFilePath | System::String | Çıktı PS/EPS dosya yolu. |
| seçenekler | System::SharedPtr\<Device::PsSaveOptions\> | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


Boş [PsDocument](../) başlatır.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outPsFilePath | System::String | Çıktı PS/EPS dosya yolu. |
| seçenekler | System::SharedPtr\<Device::PsSaveOptions\> | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |
| multipaged | bool | false ise sayfa başlatılmaz. Bu durumda sayfa başlatma, açıkça \"openPage(width, height)\" çağrısı ile yapılmalıdır. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


Belge sayfalarının sayısı önceden bilindiğinde boş [PsDocument](../) başlatır.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| outPsFilePath | System::String | Çıktı PS/EPS dosya yolu. |
| seçenekler | System::SharedPtr\<Device::PsSaveOptions\> | PostScript dosyasının kaydedilmesini kontrol eden bir parametre kümesi. |
| numberOfPages | int32_t | PostScript belgesindeki sayfa sayısı. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


Giriş PS/EPS dosyasıyla [PsDocument](../) başlatır.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| psFilePath | System::String | PS/EPS dosya yolu. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
