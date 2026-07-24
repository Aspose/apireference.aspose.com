---
title: "System::Net::Cookie::VerifySetDefaults yöntemi"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page için C++"
description: "System::Net::Cookie::VerifySetDefaults yöntemi. Varsayılan özniteliğin değerlerini C++'ta doğrular ve ayarlar."
type: docs
weight: 4200
url: /tr/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Varsayılan öznitelik değerlerini doğrular ve ayarlar.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| varyant | CookieVariant | Çerezin spesifikasyonu. |
| uri | System::SharedPtr\<Uri\> | İç alanları başlatmak için kullanılan Uri-sınıfı örneği. |
| isLocalDomain | bool | Çerezin yerel alana itilip itilmeyeceğini gösteren bir değer. |
| localDomain | String | Yerel bir alan adı. |
| setDefault | bool | Çerezin özniteliklerinin varsayılan değerleriyle başlatılması gerekip gerekmediğini gösteren bir değer. |
| shouldThrow | bool | Belirtilen değerler geçersiz olduğunda bir istisnanın atılıp atılmayacağını gösteren bir değer. |

### ReturnValue

Tüm değerler geçerli olduğunda doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
