---
title: "System::Net::Sockets::SocketError enum"
linktitle: "SocketError"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::SocketError enum. C++'de soket hata türlerini listeler."
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
| Fault | 10014 | Geçersiz bir gösterici adresi tespit edildi. |
| InvalidArgument | 10022 | Geçersiz bir argüman sağlandı. |
| TooManyOpenSockets | 10024 | Altta yatan soket sağlayıcısında çok fazla açık soket var. |
| WouldBlock | 10035 | Bir işlem, engellemeyen bir sokette hemen tamamlanamaz. |
| InProgress | 10036 | Bir engelleme işlemi devam ediyor. |
| AlreadyInProgress | 10037 | Engellemesiz bir soket zaten çalışan bir işleme sahiptir. |
| NotSocket | 10038 | Soket olmayan bir nesnede soket işlemi çağırma girişimi. |
| DestinationAddressRequired | 10039 | Gerekli bir adres, soket işleminden çıkarılmıştır. |
| MessageSize | 10040 | Bir datagram çok uzun. |
| ProtocolType | 10041 | Bu soket, bir protokol türünü desteklemiyor. |
| ProtocolOption | 10042 | Bilinmeyen, geçersiz veya desteklenmeyen bir seçenek ya da seviye kullanıldı. |
| ProtocolNotSupported | 10043 | Bir protokol uygulanmamış veya yapılandırılmamış. |
| SocketNotSupported | 10044 | Bir adres ailesi belirtilen soketi desteklemiyor. |
| OperationNotSupported | 10045 | Bir protokol ailesi bir adres ailesini desteklemiyor. |
| ProtocolFamilyNotSupported | 10046 | Bir protokol ailesi uygulanmamış veya yapılandırılmamış. |
| AddressFamilyNotSupported | 10047 | Belirtilen adres ailesi desteklenmiyor. |
| AddressAlreadyInUse | 10048 | Bir adres yalnızca bir kez kullanılabilir. |
| AddressNotAvailable | 10049 | Seçilen IP adresi bu bağlamda geçerli değil. |
| NetworkDown | 10050 | Ağ mevcut değil. |
| NetworkUnreachable | 10051 | Uzak ana bilgisayara giden bir yol bulunmuyor. |
| NetworkReset | 10052 | Bir uygulama, zaten zaman aşımına uğramış bir bağlantıya 'Keep-Alive' ayarlamaya çalıştı. |
| ConnectionAborted | 10053 | Bir bağlantı iptal edildi. |
| ConnectionReset | 10054 | Bir bağlantı uzak eş tarafından sıfırlandı. |
| NoBufferSpaceAvailable | 10055 | Soket işlemi için kullanılabilir boş tampon alanı yok. |
| IsConnected | 10056 | Bir soket zaten bağlı. |
| NotConnected | 10057 | Bir uygulama veri göndermeye veya almaya çalıştı, ancak bir soket bağlı değil. |
| Shutdown | 10058 | Veri gönderme veya alma isteği, soket zaten kapatıldığı için yasaktır. |
| TimedOut | 10060 | Bir bağlantı denemesi zaman aşımına uğradı veya bağlı bir ana bilgisayar yanıt vermedi. |
| ConnectionRefused | 10061 | Uzak bir ana bilgisayar aktif olarak bir bağlantıyı reddediyor. |
| HostDown | 10064 | Bir işlem, uzak ana bilgisayar kapalı olduğu için başarısız oldu. |
| HostUnreachable | 10065 | Belirtilen ana bilgisayara ağ yolu bulunmamaktadır. |
| ProcessLimit | 10067 | Temel soket sağlayıcısını çok fazla işlem kullanıyor. |
| SystemNotReady | 10091 | Bir ağ alt sistemi kullanılabilir değil. |
| VersionNotSupported | 10092 | Temel soket sağlayıcısının bir sürümü aralık dışında. |
| NotInitialized | 10093 | Temel soket sağlayıcı başlatılmadı. |
| Disconnecting | 10101 | Nazik bir kapatma işlemi sürüyor. |
| TypeNotFound | 10109 | Belirtilen sınıf bulunamadı. |
| HostNotFound | 11001 | Belirtilen ana bilgisayar bilinmiyor. |
| TekrarDene | 11002 | Bir ana bilgisayar adı çözülemedi. |
| KurtarmaYok | 11003 | Bir hata kurtarılamaz veya istenen veritabanı bulunamıyor. |
| VeriYok | 11004 | İstenen bir ad veya IP adresi ad sunucusunda bulunamadı. |

## Ayrıca Bakınız

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
