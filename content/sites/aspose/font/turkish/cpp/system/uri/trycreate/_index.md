---
title: "System::Uri::TryCreate yöntemi"
linktitle: "TryCreate"
second_title: "Aspose.Font için C++"
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


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Temel URI |
| relativeUri | const SharedPtr\<Uri\>\& | Temel URI'ye eklenen göreli URI |
| result | SharedPtr\<Uri\>\& | İşlem başarılı olursa, yeni oluşturulan [Uri](../) nesnesine işlev dönüşünde işaret eden çıktı argümanı |

### ReturnValue

İnşa başarılı ise Doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) method


Temel URI'yi temsil eden belirtilen [Uri](../) nesnesi ve göreli URI'nin dize temsili kullanılarak bir [Uri](../) nesnesi oluşturur.

```cpp
static bool System::Uri::TryCreate(const SharedPtr<Uri> &baseUri, const String &relativeUri, SharedPtr<Uri> &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| baseUri | const SharedPtr\<Uri\>\& | Temel URI |
| relativeUri | const String\& | Temel URI'ye eklenen göreli URI |
| result | SharedPtr\<Uri\>\& | İşlem başarılı olursa, yeni oluşturulan [Uri](../) nesnesine işlev dönüşünde işaret eden çıktı argümanı |

### ReturnValue

İnşa başarılı ise Doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [String](../../string/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Uri::TryCreate(const String\&, UriKind, SharedPtr\<Uri\>\&) method


Belirtilen URI'yi temsil eden bir [Uri](../) nesnesi oluşturur; bir argüman URI türünü belirtir.

```cpp
static bool System::Uri::TryCreate(const String &uriString, UriKind uriKind, SharedPtr<Uri> &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| uriString | const String\& | Oluşturulan nesne tarafından temsil edilecek dize URI |
| uriKind | UriKind | URI türünü belirtir |
| result | SharedPtr\<Uri\>\& | İşlem başarılı olursa, yeni oluşturulan [Uri](../) nesnesine işlev dönüşünde işaret eden çıktı argümanı |

### ReturnValue

İnşa başarılı ise Doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [UriKind](../../urikind/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
