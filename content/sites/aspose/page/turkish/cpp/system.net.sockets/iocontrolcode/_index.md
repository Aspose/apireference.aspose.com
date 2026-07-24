---
title: "System::Net::Sockets::IOControlCode enum"
linktitle: "IOControlCode"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::IOControlCode enum. C++'ta IO kontrol kodlarını listeler."
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
| NonBlockingIO | -2147195266 | Soketi bloklamayan olarak işaretle. |
| DataToRead | 1074030207 | Okunabilir bayt sayısını döndür. |
| OobDataRead | 1074033415 | Alınmayı bekleyen bant dışı veri hakkında bilgi döndür. |
| AssociateHandle | -2013265919 | Bu soketi, bir yardımcı arayüzün belirtilen tutamacıyla ilişkilendir. |
| EnableCircularQueuing | 671088642 | Gelen mesaj kuyrukları dolduğunda, en eski kuyruğa alınan datagramı gelen bir datagramla değiştir. |
| Flush | 671088644 | Bu soket ile ilişkili gönderme kuyruğunun mevcut içeriğini atar. |
| GetBroadcastAddress | 1207959557 | Mevcut soketin adres ailesi için yayın adresini içeren bir SOCKADDR yapısını döndür. |
| GetExtensionFunctionPointer | -939524090 | İlişkili hizmet sağlayıcı tarafından desteklenen belirtilen uzantı işlevine bir işaretçi al. |
| GetQos | -939524089 | Soket ile ilişkili QOS yapısını alın. |
| GetGroupQos | -939524088 | Soket grubu için QOS özniteliklerini döndür. |
| MultipointLoopback | -2013265911 | Yerel bilgisayarda bir uygulama tarafından (aynı soket olmak zorunda olmadan) çoklu yayın oturumunda gönderilen verilerin, döngü geri arabiriminde çoklu yayın hedef grubuna katılan bir soket tarafından alınmasını kontrol edin. |
| MulticastScope | -2013265910 | Bir yönlendirici tarafından bir çoklu yayın paketinin kaç kez iletilebileceğini, TTL veya atlama sayısı olarak da bilinen, kontrol edin. |
| SetQos | -2013265909 | Soket için QOS özniteliklerini ayarlayın. |
| SetGroupQos | -2013265908 | Soket grubu için QOS özniteliklerini ayarlayın. |
| TranslateHandle | -939524083 | Bir yardımcı arabirim bağlamında geçerli olan soket için bir tutamaç döndür. |
| RoutingInterfaceQuery | -939524076 | Belirtilen uzak adrese bağlanmak için kullanılabilecek arabirim adreslerini döndür. |
| RoutingInterfaceChange | -2013265899 | Uzak uç noktaya erişmek için kullanılan yerel arabirim değiştiğinde bir bildirim almayı etkinleştirin. |
| AddressListQuery | 1207959574 | Soketin bağlanabileceği yerel arabirimlerin listesini döndür. |
| AddressListChange | 671088663 | Soketin protokol ailesi için yerel arabirimler listesinin değiştiğinde bir bildirim almayı etkinleştir. |
| QueryTargetPnpHandle | 1207959576 | Alt sağlayıcının SOCKET tutamacını al. |
| NamespaceChange | -2013265895 | Bir ad alanı sorgusu geçersiz olduğunda soketin bildirim alıp almayacağını kontrol et. |
| AddressListSort | -939524071 | Bağlantı kurmak için en uygun adresi belirlemek amacıyla IPv6 ve IPv4 hedef adreslerinin listesini sırala. |
| ReceiveAll | -1744830463 | Ağda tüm IPv4 paketlerini almayı etkinleştir. |
| ReceiveAllMulticast | -1744830462 | Ağda tüm çoklu yayın IPv4 paketlerini almayı etkinleştir. |
| ReceiveAllIgmpMulticast | -1744830461 | Ağda tüm IGMP paketlerini almayı etkinleştir. |
| KeepAliveValues | -1744830460 | TCP keep-alive paketlerinin gönderilmesini ve gönderildikleri aralığı kontrol edin. |
| AbsorbRouterAlert | -1744830459 | Bu değer, Winsock 2 'SIO_ABSORB_RTRALERT' sabitine eşittir. |
| UnicastInterface | -1744830458 | Giden tekil (unicast) paketler için kullanılan arayüzü ayarlayın. |
| LimitBroadcasts | -1744830457 | Bu değer, Winsock 2 'SIO_LIMIT_BROADCASTS' sabitine eşittir. |
| BindToInterface | -1744830456 | Soketi belirtilen bir arayüz indeksine bağlayın. |
| MulticastInterface | -1744830455 | Giden çoklu yayın (multicast) paketler için kullanılan arayüzü ayarlayın. |
| AddMulticastGroupOnInterface | -1744830454 | Bir arayüzün indeksine göre tanımlanan bir çoklu yayın grubuna katılın. |
| DeleteMulticastGroupFromInterface | -1744830453 | Soketi bir çoklu yayın grubundan kaldırın. |

## Ayrıca Bakınız

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
