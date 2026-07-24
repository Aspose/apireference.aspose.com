---
title: "System::Security::Permissions::SecurityPermissionFlag enum"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page için C++"
description: "System::Security::Permissions::SecurityPermissionFlag enum. C++'de güvenlik izninin bayrakları."
type: docs
weight: 300
url: /tr/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Güvenlik izninin bayrakları.

```cpp
enum class SecurityPermissionFlag
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| NoFlags | 0 | Erişim yok. |
| İddia | 1 | İzin verildiğini doğrula. |
| YönetilmeyenKod | 2 | Yönetilmeyen kodu çağır. |
| DoğrulamayıAtla | 4 | Kod doğrulamasını atla. |
| Yürütme | 8 | Kodu yürüt. |
| İşParçasıKontrolü | 16 | İş parçacıkları üzerinde işlemler gerçekleştir. |
| KanıtKontrolü | 32 | CLR kanıtını kontrol et veya değiştir. |
| PolitikaKontrolü | 64 | Politikayı görüntüle ve değiştir. |
| SerileştirmeBiçimlendiricisi | 128 | Serileştir. |
| AlanPolitikasıKontrolü | 256 | Alan politikasını ayarla. |
| TemelKontrolü | 512 | Temel nesneyi kontrol et. |
| UygulamaAlanıKontrolü | 1024 | Uygulama alanını kontrol et. |
| UzakYapılandırması | 2048 | Uzak iletişimi yapılandır. |
| Altyapı | 4096 | CLR altyapısına bağlan. |
| BindingRedirects | 8192 | Açık bağlama yönlendirmesini gerçekleştir. |
| TümBayraklar | 16383 | Sınırsız. |

## Ayrıca Bakınız

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)
