---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::SocketOptionName enum. C++'da Socket sınıfı için soket seçenek adlarını tanımlar."
type: docs
weight: 1600
url: /tr/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


Socket sınıfı için [Socket](../socket/) seçenek adlarını tanımlar.

```cpp
enum class SocketOptionName
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| HataAyıklama | 1 | Hata ayıklama bilgilerini kaydet. |
| BağlantıKabulEt | 2 | Bir soketin gelen bir bağlantıyı dinleyip dinlemediğini gösterir. |
| AdresiYenidenKullan | 4 | Bir soketin zaten kullanımda olan adrese bağlanıp bağlanamayacağını gösterir. |
| CanlıTut | 8 | Bir soket bağlantısı için 'Keep-Alive' paketlerini etkinleştirir. |
| YönlendirmeYapma | 16 | Bir paketin doğrudan arayüz adreslerine gönderilip gönderilmediğini gösterir. |
| Yayın | 32 | Bir soketin yayın mesajlarını gönderip gönderemeyeceğini gösterir. |
| UseLoopback | 64 | Mümkün olduğunda donanımı atlayın. |
| Linger | 128 | Sistem, kapatma girişiminde süreci, veriyi iletebildiği zamana kadar engelleyecektir. |
| OutOfBandInline | 256 | Normal veri akışında bant dışı verileri alır. |
| DontLinger | n/a | Bir soketin beklemeden kapatılıp kapatılmayacağını gösterir. |
| ExclusiveAddressUse | n/a | Bir soket, bağlanan adresi yalnızca kendisi kullanacaktır. |
| SendBuffer | 4097 | Gönderme tampon boyutunu belirtir. |
| ReceiveBuffer | 4098 | Alma tampon boyutunu belirtir. |
| SendLowWater | 4099 | Gönderme işlemleri için minimum veri miktarını belirtir. |
| ReceiveLowWater | 4100 | Alma işlemleri için minimum veri miktarını belirtir. |
| SendTimeout | 4101 | Eşzamanlı gönderme işlemleri için zaman aşımını belirtir. |
| ReceiveTimeout | 4102 | Senkron alım işlemleri için zaman aşımını belirtir. |
| Error | 4103 | Hata durumunu döndürür ve temizler. |
| Type | 4104 | Bir soket türü döndürür. |
| ReuseUnicastPort | 12295 | Sistemin giden bağlantılar için geçici port tahsisatını erteleyip ertelemeyeceğini gösterir. |
| MaxConnections | 2147483647 | Bu seçenek desteklenmiyor. Dinleme için maksimum kuyruk uzunluğunu belirtmek için kullanılmıştı. |
| IPOptions | 1 | Giden datagramlara eklenmesi gereken IP seçeneğini belirtir. |
| HeaderIncluded | 2 | Üstbilgi giden datagramlara dahil edilir. |
| TypeOfService | 3 | Servis alanının IP üstbilgi tipini değiştirir. |
| IpTimeToLive | 4 | IP ömrü (time to live). |
| MulticastInterface | 9 | Giden çoklu yayın paketleri için arayüzü ayarla. |
| MulticastTimeToLive | 10 | IP çoklu yayın ömrü (time to live). |
| MulticastLoopback | 11 | IP Multicast döngüsü. |
| AddMembership | 12 | Bir IP grup üyeliği ekleyin. |
| DropMembership | 13 | Bir IP grup üyeliğini kaldırın. |
| DontFragment | 14 | IP veri paketlerini bölmeyin. |
| AddSourceMembership | 15 | IP grup/kaynağına katılın. |
| DropSourceMembership | 16 | IP grup/kaynağını kaldırın. |
| BlockSource | 17 | IP grup/kaynağını engelleyin. |
| UnblockSource | 18 | IP grup/kaynağının engelini kaldırın. |
| PacketInformation | 19 | IPv4 için paket bilgilerini alın. |
| HopLimit | 21 | Paketin HOP sayısını içeren bir tam sayı döndürür. |
| IPProtectionLevel | 23 | Belirtilen kapsamda bir IPv6 soketinin kısıtlanmasını sağlar. |
| IPv6Only | 27 | Soket yalnızca IPv6 paketleri göndermek ve almak için kısıtlanmıştır. |
| NoDelay | 1 | Gönderim paketlerini birleştirmek için Nagle algoritmasını devre dışı bırakır. |
| BsdUrgent | 2 | RFC-1222'de tanımlanan acil veriyi kullanın. |
| Expedited | 2 | RFC-1222'de tanımlanan hızlı veriyi kullanın. |
| NoChecksum | 1 | Denetim toplamı sıfıra ayarlanmış UDP veri paketlerini gönderin. |
| ChecksumCoverage | 20 | UDP denetim toplamı kapsamını ayarlayın veya alın. |
| UpdateAcceptContext | 28683 | Bir istemci soketini, dinleme soketinin aynı özellikleriyle günceller. |
| UpdateConnectContext | 28688 | Bir istemci soketini, dinleme soketinin aynı özellikleriyle günceller. |

## Ayrıca Bakınız

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
