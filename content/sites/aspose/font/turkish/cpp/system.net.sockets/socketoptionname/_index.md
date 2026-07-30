---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::SocketOptionName enum. C++'daki Socket sınıfı için socket seçenek adlarını tanımlar."
type: docs
weight: 1600
url: /tr/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


[Socket](../socket/) sınıfı için socket seçenek adlarını tanımlar.

```cpp
enum class SocketOptionName
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Hata Ayıklama | 1 | Hata ayıklama bilgilerini kaydet. |
| AcceptConnection | 2 | Bir soketin gelen bir bağlantıyı dinleyip dinlemediğini gösterir. |
| ReuseAddress | 4 | Bir soketin zaten kullanımda olan adrese bağlanıp bağlanamayacağını gösterir. |
| KeepAlive | 8 | 'Keep-Alive' paketlerini bir soket bağlantısı için etkinleştirir. |
| DontRoute | 16 | Bir paketin doğrudan arayüz adreslerine gönderilip gönderilmediğini gösterir. |
| Broadcast | 32 | Bir soketin yayın mesajlarını gönderip gönderemeyeceğini gösterir. |
| UseLoopback | 64 | Mümkün olduğunda donanımı atlar. |
| Linger | 128 | Sistem, kapatma girişiminde süreçyi veri iletileene kadar engelleyecektir. |
| OutOfBandInline | 256 | Normal veri akışında bant dışı verileri alır. |
| DontLinger | n/a | Bir soketin beklemeden kapatılıp kapatılmayacağını gösterir. |
| ExclusiveAddressUse | n/a | Bir soket bağlanan adresi yalnızca kendisi kullanacaktır. |
| SendBuffer | 4097 | Gönderme tampon boyutunu belirtir. |
| ReceiveBuffer | 4098 | Alım tamponu boyutunu belirtir. |
| SendLowWater | 4099 | Gönderme işlemleri için minimum veri miktarını belirtir. |
| ReceiveLowWater | 4100 | Alım işlemleri için minimum veri miktarını belirtir. |
| SendTimeout | 4101 | Eşzamanlı gönderme işlemleri için zaman aşımını belirtir. |
| ReceiveTimeout | 4102 | Eşzamanlı alım işlemleri için zaman aşımını belirtir. |
| Hata | 4103 | Hata durumunu döndürür ve temizler. |
| Tür | 4104 | Bir soket türünü döndürür. |
| ReuseUnicastPort | 12295 | Sistemin giden bağlantılar için geçici port tahsis edilmesini erteleyip ertemeyeceğini gösterir. |
| MaxConnections | 2147483647 | Bu seçenek desteklenmiyor. Dinleme için maksimum kuyruk uzunluğunu belirtmek amacıyla kullanılmıştı. |
| IPOptions | 1 | Giden veri paketlerine eklenmesi gereken IP seçeneğini belirtir. |
| HeaderIncluded | 2 | Üst bilgi, giden veri paketlerine eklenir. |
| TypeOfService | 3 | IP üst bilgisinin hizmet alanı tipini değiştir. |
| IpTimeToLive | 4 | IP ömrü süresi. |
| MulticastInterface | 9 | Giden çoklu yayın paketleri için arabirimi ayarla. |
| MulticastTimeToLive | 10 | IP çoklu yayın ömrü süresi. |
| MulticastLoopback | 11 | IP çoklu yayın döngüsü. |
| AddMembership | 12 | Bir IP grup üyeliği ekle. |
| DropMembership | 13 | Bir IP grup üyeliğini bırak. |
| DontFragment | 14 | IP veri paketlerini parçalama. |
| AddSourceMembership | 15 | IP grup/kaynağına katıl. |
| DropSourceMembership | 16 | IP grup/kaynağını bırak. |
| BlockSource | 17 | IP grup/kaynağını engelle. |
| UnblockSource | 18 | IP grup/kaynak engellemesini kaldır. |
| PacketInformation | 19 | IPv4 için paket bilgilerini al. |
| HopLimit | 21 | Paketin HOP sayısını içeren bir tam sayı döndürür. |
| IPProtectionLevel | 23 | IPv6 soketinin belirtilen kapsamla sınırlanmasını sağlar. |
| IPv6Only | 27 | Soket yalnızca IPv6 paketleri göndermek ve almak için sınırlıdır. |
| NoDelay | 1 | Gönderilen paketlerin birleştirilmesi için Nagle algoritmasını devre dışı bırakır. |
| BsdUrgent | 2 | RFC-1222'de tanımlanan acil veriyi kullan. |
| Expedited | 2 | RFC-1222'de tanımlanan hızlı veriyi kullan. |
| NoChecksum | 1 | UDP veri paketlerini denetim toplamı sıfır olarak ayarlanmış şekilde gönder. |
| ChecksumCoverage | 20 | UDP denetim toplamı kapsamını ayarla veya al. |
| UpdateAcceptContext | 28683 | Bir istemci soketini dinleme soketinin aynı özellikleriyle günceller. |
| UpdateConnectContext | 28688 | Bir istemci soketini dinleme soketinin aynı özellikleriyle günceller. |

## Ayrıca Bakınız

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
