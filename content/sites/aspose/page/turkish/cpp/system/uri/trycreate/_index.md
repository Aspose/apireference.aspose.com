---
title: "System::Uri::TryCreate yöntemi"
linktitle: "TryCreate"
second_title: "Aspose.Page için C++"
description: "System::Uri::TryCreate yöntemi. Belirtilen temel ve göreli URI'lerden bir Uri nesnesi oluşturur C++'ta."
type: docs
weight: 4400
url: /tr/cpp/system/uri/trycreate/
---
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) method


Belirtilen temel ve göreli URI'lerden bir [Uri](../) nesnesi oluşturur.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const SharedPtr<Uri> &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Temel URI |
| relativeUri | const SharedPtr\<Uri\>\& | Temel URI'ye eklenen göreli URI |
| result | SharedPtr\<Uri\>\& | İşlem dönüşünde, oluşturma başarılı olursa yeni oluşturulan [Uri](../) nesnesine işaret eden çıktı argümanı |

### ReturnValue

Oluşturma başarılıysa doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Temel URI'yi temsil eden belirtilen [Uri](../) nesnesi ve göreli URI'nin dize temsili ile bir [Uri](../) nesnesi oluşturur.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Temel URI |
| relativeUri | const String\& | Temel URI'ye eklenen göreli URI |
| result | SharedPtr\<Uri\>\& | İşlem dönüşünde, oluşturma başarılı olursa yeni oluşturulan [Uri](../) nesnesine işaret eden çıktı argümanı |

### ReturnValue

Oluşturma başarılıysa doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Belirtilen URI'yi temsil eden bir [Uri](../) nesnesi oluşturur; bir argüman URI türünü belirtir.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| uriString | const String\& | Oluşturulan nesne tarafından temsil edilecek dize URI |
| uriKind | UriKind | URI türünü belirtir |
| result | SharedPtr\<Uri\>\& | İşlem dönüşünde, oluşturma başarılı olursa yeni oluşturulan [Uri](../) nesnesine işaret eden çıktı argümanı |

### ReturnValue

Oluşturma başarılıysa doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
