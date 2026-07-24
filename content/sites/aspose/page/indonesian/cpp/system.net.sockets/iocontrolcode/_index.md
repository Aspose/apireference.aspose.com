---
title: "System::Net::Sockets::IOControlCode enum"
linktitle: "IOControlCode"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::IOControlCode enum. Mendaftar kode kontrol IO di C++."
type: docs
weight: 900
url: /id/cpp/system.net.sockets/iocontrolcode/
---
## IOControlCode enum


Mendaftar kode kontrol [IO](../../system.io/).

```cpp
enum class IOControlCode : int64_t
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| AsyncIO | -2147195267 | Mengaktifkan atau menonaktifkan mode I/O asinkron pada socket. |
| NonBlockingIO | -2147195266 | Tandai soket sebagai nonblocking. |
| DataToRead | 1074030207 | Kembalikan jumlah byte yang tersedia untuk dibaca. |
| OobDataRead | 1074033415 | Kembalikan informasi tentang data out-of-band yang menunggu untuk diterima. |
| AssociateHandle | -2013265919 | Hubungkan soket ini dengan handle yang ditentukan dari antarmuka pendamping. |
| EnableCircularQueuing | 671088642 | Ganti datagram antrian tertua dengan yang masuk ketika antrian pesan yang masuk penuh. |
| Flush | 671088644 | Buang isi saat ini dari antrian pengiriman yang terkait dengan soket ini. |
| GetBroadcastAddress | 1207959557 | Kembalikan struktur SOCKADDR yang berisi alamat broadcast untuk keluarga alamat dari soket saat ini. |
| GetExtensionFunctionPointer | -939524090 | Ambil pointer ke fungsi ekstensi yang ditentukan yang didukung oleh penyedia layanan yang terkait. |
| GetQos | -939524089 | Ambil struktur QOS yang terkait dengan socket. |
| GetGroupQos | -939524088 | Kembalikan atribut QOS untuk grup socket. |
| MultipointLoopback | -2013265911 | Kontrol apakah data yang dikirim oleh aplikasi pada komputer lokal (tidak harus oleh socket yang sama) dalam sesi multicast akan diterima oleh socket yang bergabung dengan grup tujuan multicast pada antarmuka loopback. |
| MulticastScope | -2013265910 | Kontrol jumlah kali paket multicast dapat diteruskan oleh router, yang juga dikenal sebagai TTL, atau hitungan lompatan. |
| SetQos | -2013265909 | Atur atribut QOS untuk socket. |
| SetGroupQos | -2013265908 | Atur atribut QOS untuk grup socket. |
| TranslateHandle | -939524083 | Kembalikan handle untuk socket yang valid dalam konteks antarmuka pendamping. |
| RoutingInterfaceQuery | -939524076 | Kembalikan alamat antarmuka yang dapat digunakan untuk terhubung ke alamat remote yang ditentukan. |
| RoutingInterfaceChange | -2013265899 | Aktifkan penerimaan notifikasi ketika antarmuka lokal yang digunakan untuk mengakses endpoint remote berubah. |
| AddressListQuery | 1207959574 | Kembalikan daftar antarmuka lokal yang dapat diikat oleh soket. |
| AddressListChange | 671088663 | Aktifkan penerimaan notifikasi ketika daftar antarmuka lokal untuk keluarga protokol soket berubah. |
| QueryTargetPnpHandle | 1207959576 | Ambil handle SOCKET dari penyedia yang mendasarinya. |
| NamespaceChange | -2013265895 | Kontrol apakah soket menerima notifikasi ketika kueri namespace menjadi tidak valid. |
| AddressListSort | -939524071 | Urutkan daftar alamat tujuan IPv6 dan IPv4 untuk menentukan alamat terbaik yang tersedia untuk membuat koneksi. |
| ReceiveAll | -1744830463 | Aktifkan penerimaan semua paket IPv4 di jaringan. |
| ReceiveAllMulticast | -1744830462 | Aktifkan penerimaan semua paket IPv4 multicast di jaringan. |
| ReceiveAllIgmpMulticast | -1744830461 | Aktifkan penerimaan semua paket IGMP di jaringan. |
| KeepAliveValues | -1744830460 | Kontrol pengiriman paket TCP keep-alive dan interval pengirimannya. |
| AbsorbRouterAlert | -1744830459 | Nilai ini sama dengan konstanta Winsock 2 'SIO_ABSORB_RTRALERT'. |
| UnicastInterface | -1744830458 | Atur antarmuka yang digunakan untuk paket unicast keluar. |
| LimitBroadcasts | -1744830457 | Nilai ini sama dengan konstanta Winsock 2 'SIO_LIMIT_BROADCASTS'. |
| BindToInterface | -1744830456 | Ikat soket ke indeks antarmuka yang ditentukan. |
| MulticastInterface | -1744830455 | Atur antarmuka yang digunakan untuk paket multicast keluar. |
| AddMulticastGroupOnInterface | -1744830454 | Gabung ke grup multicast menggunakan antarmuka yang diidentifikasi oleh indeksnya. |
| DeleteMulticastGroupFromInterface | -1744830453 | Hapus soket dari grup multicast. |

## Lihat Juga

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
