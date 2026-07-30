---
title: "System::Net::WebExceptionStatus enum"
linktitle: "WebExceptionStatus"
second_title: "Aspose.Font için C++"
description: "System::Net::WebExceptionStatus enum. WebException sınıfının C++'daki durum kodlarını listeler."
type: docs
weight: 4900
url: /tr/cpp/system.net/webexceptionstatus/
---
## WebExceptionStatus enum


[WebException](../webexception/) sınıfının durum kodlarını listeler.

```cpp
enum class WebExceptionStatus
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Success | 0 | Hata oluşmadı. |
| NameResolutionFailure | 1 | İsim çözümleyici hizmeti ana bilgisayar adını çözemedi. |
| ConnectFailure | 2 | Uzak hizmet noktası taşıma seviyesinde iletişim kurulamıyor. |
| ReceiveFailure | 3 | Uzak sunucudan tam bir yanıt alınmadı. |
| SendFailure | 4 | Tam bir istek uzak sunucuya gönderilemedi. |
| PipelineFailure | 5 | İstek bir boru hattı isteği idi ve yanıt alınmadan bağlantı kapatıldı. |
| RequestCanceled | 6 | İstek iptal edildi veya sınıflandırılamayan bir hata oluştu. |
| ProtocolError | 7 | Sunucudan alınan yanıt tamdı ancak protokol seviyesinde bir hata gösterdi. |
| ConnectionClosed | 8 | Bağlantı erken kapatıldı. |
| TrustFailure | 9 | Sunucu sertifikası doğrulanamadı. |
| SecureChannelFailure | 10 | SSL kullanarak bir bağlantı kurarken bir hata oluştu. |
| ServerProtocolViolation | 11 | Sunucu yanıtı geçerli bir HTTP yanıtı değildi. |
| KeepAliveFailure | 12 | ‘Keep-Alive’ başlığını belirten bir isteğin bağlantısı beklenmedik şekilde kapatıldı. |
| Bekliyor | 13 | İç bir asenkron istek beklemede. |
| Timeout | 14 | Bir istek için zaman aşımı süresi boyunca yanıt alınmadı. |
| ProxyNameResolutionFailure | 15 | İsim çözümleyici hizmeti proxy ana bilgisayar adını çözemedi. |
| UnknownError | 16 | Bilinmeyen tipte bir istisna oluştu. |
| MessageLengthLimitExceeded | 17 | Belirtilen sınırı aşan bir mesaj alındı. |
| CacheEntryNotFound | 18 | Belirtilen önbellek girdisi bulunamadı. |
| RequestProhibitedByCachePolicy | 19 | İstek önbellek politikası tarafından izin verilmedi. |
| RequestProhibitedByProxy | 20 | Bu istek proxy tarafından izin verilmedi. |

## Ayrıca Bakınız

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
