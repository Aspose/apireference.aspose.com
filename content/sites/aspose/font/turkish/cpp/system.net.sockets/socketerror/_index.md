---
title: "System::Net::Sockets::SocketError enum"
linktitle: "SocketError"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::SocketError enum. C++'da soket hata türlerini listeler."
type: docs
weight: 1300
url: /tr/cpp/system.net.sockets/socketerror/
---
## SocketError enum


Soket hata türlerini listeler.

```cpp
enum class SocketError
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Success | 0 | Bir soket işlemi başarıyla tamamlandı. |
| SocketError | -1 | Belirtilmemiş bir soket hatası oluştu. |
| Interrupted | 10004 | Bloklayan bir soket çağrısı iptal edildi. |
| AccessDenied | 10013 | Bir sokete erişim reddedildi. |
| Fault | 10014 | Geçersiz bir işaretçi adresi tespit edildi. |
| InvalidArgument | 10022 | Geçersiz bir argüman sağlandı. |
| TooManyOpenSockets | 10024 | Temel soket sağlayıcısında çok fazla açık soket var. |
| WouldBlock | 10035 | Bir işlem, engellemeyen bir sokette hemen tamamlanamaz. |
| InProgress | 10036 | Engelleyici bir işlem devam ediyor. |
| AlreadyInProgress | 10037 | Engellemeyen bir sokette zaten çalışan bir işlem var. |
| NotSocket | 10038 | Soket olmayan bir nesnede soket işlemi çağırma girişimi. |
| DestinationAddressRequired | 10039 | Gerekli bir adres, soket işleminden çıkarılmış. |
| MessageSize | 10040 | Bir datagram çok uzun. |
| ProtocolType | 10041 | Bu soket tarafından protokol türü desteklenmiyor. |
| ProtocolOption | 10042 | Bilinmeyen, geçersiz veya desteklenmeyen bir seçenek veya seviye kullanıldı. |
| ProtocolNotSupported | 10043 | Bir protokol uygulanmamış veya yapılandırılmamış. |
| SocketNotSupported | 10044 | Bir adres ailesi belirtilen soketi desteklemiyor. |
| OperationNotSupported | 10045 | Bir protokol ailesi bir adres ailesini desteklemiyor. |
| ProtocolFamilyNotSupported | 10046 | Bir protokol ailesi uygulanmamış veya yapılandırılmamış. |
| AddressFamilyNotSupported | 10047 | Belirtilen adres ailesi desteklenmiyor. |
| AddressAlreadyInUse | 10048 | Bir adres yalnızca bir kez kullanılabilir. |
| AddressNotAvailable | 10049 | Seçilen IP adresi bu bağlamda geçerli değil. |
| NetworkDown | 10050 | Ağ mevcut değil. |
| NetworkUnreachable | 10051 | Uzak ana bilgisayara giden bir yol bulunmuyor. |
| NetworkReset | 10052 | Bir uygulama, zaten zaman aşımına uğramış bir bağlantıda 'Keep-Alive' ayarlamaya çalıştı. |
| ConnectionAborted | 10053 | Bir bağlantı iptal edildi. |
| ConnectionReset | 10054 | Bir bağlantı uzak eş tarafından sıfırlandı. |
| NoBufferSpaceAvailable | 10055 | Soket işlemi için kullanılabilir boş tampon alanı yok. |
| IsConnected | 10056 | Bir soket zaten bağlı. |
| NotConnected | 10057 | Bir uygulama veri göndermeye veya almaya çalıştı, ancak bir soket bağlı değil. |
| Shutdown | 10058 | Veri gönderme veya alma isteği, soket zaten kapatıldığı için yasaktır. |
| Zaman Aşımı | 10060 | Bir bağlantı denemesi zaman aşımına uğradı veya bağlanan ana bilgisayar yanıt vermedi. |
| ConnectionRefused | 10061 | Uzak bir ana bilgisayar aktif olarak bir bağlantıyı reddediyor. |
| HostDown | 10064 | Bir işlem, uzak bir ana bilgisayar kapalı olduğu için başarısız oldu. |
| HostUnreachable | 10065 | Belirtilen ana bilgisayara yönelik ağ rotası bulunmuyor. |
| ProcessLimit | 10067 | Temel soket sağlayıcısını çok sayıda işlem kullanıyor. |
| SystemNotReady | 10091 | Bir ağ alt sistemi kullanılamıyor. |
| VersionNotSupported | 10092 | Temel soket sağlayıcısının bir sürümü aralık dışında. |
| NotInitialized | 10093 | Altta yatan socket sağlayıcısı başlatılmadı. |
| Bağlantı kesiliyor | 10101 | Kibar bir kapatma işlemi devam ediyor. |
| TypeNotFound | 10109 | Belirtilen sınıf bulunamadı. |
| HostNotFound | 11001 | Belirtilen ana bilgisayar bilinmiyor. |
| Tekrar Dene | 11002 | Bir ana bilgisayar adı çözülemedi. |
| NoRecovery | 11003 | Bir hata geri alınamazdır veya istenen veritabanı bulunamıyor. |
| NoData | 11004 | İstenen bir ad veya IP adresi isim sunucusunda bulunamadı. |

## Ayrıca Bakınız

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
