---
title: "System::Net::Sockets::IOControlCode enum"
linktitle: "IOControlCode"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::IOControlCode enum. C++'da IO kontrol kodlarını listeler."
type: docs
weight: 900
url: /tr/cpp/system.net.sockets/iocontrolcode/
---
## IOControlCode enum


[IO](../../system.io/) kontrol kodlarını listeler.

```cpp
enum class IOControlCode : int64_t
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| AsyncIO | -2147195267 | Soketin eşzamanlı olmayan I/O modunu etkinleştirir veya devre dışı bırakır. |
| NonBlockingIO | -2147195266 | Soketi engellemesiz (nonblocking) olarak işaretle. |
| DataToRead | 1074030207 | Okunabilir bayt sayısını döndürür. |
| OobDataRead | 1074033415 | Alınmayı bekleyen bant dışı veriler hakkında bilgi döndürür. |
| AssociateHandle | -2013265919 | Bu soketi, bir yardımcı arabirimin belirtilen tutamağı ile ilişkilendir. |
| EnableCircularQueuing | 671088642 | Gelen mesaj kuyruğu dolduğunda, en eski kuyruğa alınmış datagramı gelen bir tanesiyle değiştir. |
| Flush | 671088644 | Bu soketle ilişkili gönderim kuyruğunun mevcut içeriğini atar. |
| GetBroadcastAddress | 1207959557 | Mevcut soketin adres ailesi için yayın adresini içeren bir SOCKADDR yapısını döndürür. |
| GetExtensionFunctionPointer | -939524090 | İlgili hizmet sağlayıcı tarafından desteklenen belirtilen uzantı işlevine bir işaretçi al. |
| GetQos | -939524089 | Soket ile ilişkili QOS yapısını al. |
| GetGroupQos | -939524088 | Soket grubu için QOS özniteliklerini döndür. |
| MultipointLoopback | -2013265911 | Yerel bilgisayarda bir uygulama tarafından (aynı soket tarafından olmak zorunda olmadan) çoklu yayın oturumunda gönderilen verilerin, döngü (loopback) arayüzünde çoklu yayın hedef grubuna katılan bir soket tarafından alınıp alınmayacağını kontrol edin. |
| MulticastScope | -2013265910 | Bir yönlendirici tarafından çoklu yayın paketinin kaç kez iletilebileceğini, TTL (zaman aşımı) veya atlama sayısı olarak da bilinen, kontrol edin. |
| SetQos | -2013265909 | Soket için QOS özniteliklerini ayarlayın. |
| SetGroupQos | -2013265908 | Soket grubu için QOS özniteliklerini ayarlayın. |
| TranslateHandle | -939524083 | Eşlik eden bir arayüz bağlamında geçerli olan soket için bir tutamaç (handle) döndürün. |
| RoutingInterfaceQuery | -939524076 | Belirtilen uzak adrese bağlanmak için kullanılabilecek arayüz adreslerini döndürün. |
| RoutingInterfaceChange | -2013265899 | Uzak uç noktaya erişmek için kullanılan yerel arayüz değiştiğinde bir bildirim almayı etkinleştirin. |
| AddressListQuery | 1207959574 | Soketin bağlanabileceği yerel arayüzlerin listesini döndürün. |
| AddressListChange | 671088663 | Soketin protokol ailesi için yerel arayüzlerin listesi değiştiğinde bir bildirim almayı etkinleştirin. |
| QueryTargetPnpHandle | 1207959576 | Alttaki sağlayıcının SOCKET tutamacını alın. |
| NamespaceChange | -2013265895 | Bir ad alanı sorgusu geçersiz olduğunda soketin bildirim alıp almayacağını kontrol edin. |
| AddressListSort | -939524071 | Bağlantı kurmak için en uygun kullanılabilir adresi belirlemek amacıyla IPv6 ve IPv4 hedef adreslerinin bir listesini sıralayın. |
| ReceiveAll | -1744830463 | Ağda tüm IPv4 paketlerinin alınmasını etkinleştirin. |
| ReceiveAllMulticast | -1744830462 | Ağda tüm çoklu yayın IPv4 paketlerinin alınmasını etkinleştirin. |
| ReceiveAllIgmpMulticast | -1744830461 | Ağda tüm IGMP paketlerinin alınmasını etkinleştirin. |
| KeepAliveValues | -1744830460 | TCP keep-alive paketlerinin gönderilmesini ve gönderim aralığını kontrol edin. |
| AbsorbRouterAlert | -1744830459 | Bu değer, Winsock 2 'SIO_ABSORB_RTRALERT' sabitine eşittir. |
| UnicastInterface | -1744830458 | Giden tekil paketler için kullanılan arayüzü ayarlayın. |
| LimitBroadcasts | -1744830457 | Bu değer, Winsock 2 'SIO_LIMIT_BROADCASTS' sabitine eşittir. |
| BindToInterface | -1744830456 | Soketi belirtilen arayüz indeksine bağlayın. |
| MulticastInterface | -1744830455 | Giden multicast paketler için kullanılan arayüzü ayarlayın. |
| AddMulticastGroupOnInterface | -1744830454 | Bir arayüzün indeksine göre tanımlanan bir multicast grubuna katılın. |
| DeleteMulticastGroupFromInterface | -1744830453 | Soketi bir multicast grubundan kaldırın. |

## Ayrıca Bakınız

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
