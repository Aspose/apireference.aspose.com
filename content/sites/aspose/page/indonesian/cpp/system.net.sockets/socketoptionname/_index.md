---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::SocketOptionName enum. Mendefinisikan nama opsi soket untuk kelas Socket dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


Mendefinisikan nama opsi soket untuk kelas [Socket](../socket/).

```cpp
enum class SocketOptionName
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Debug | 1 | Merekam informasi debugging. |
| TerimaKoneksi | 2 | Menunjukkan apakah soket sedang mendengarkan koneksi masuk. |
| GunakanUlangAlamat | 4 | Menunjukkan apakah soket dapat diikat ke alamat yang sudah digunakan. |
| TetapHidup | 8 | Mengaktifkan paket 'Keep-Alive' untuk koneksi soket. |
| JanganRute | 16 | Menunjukkan apakah paket dikirim langsung ke alamat antarmuka. |
| Siaran | 32 | Menunjukkan apakah soket dapat mengirim pesan siaran. |
| UseLoopback | 64 | Lewati perangkat keras bila memungkinkan. |
| Linger | 128 | Sistem akan memblokir proses pada upaya penutupan sampai dapat mengirim data. |
| OutOfBandInline | 256 | Menerima data out-of-band dalam aliran data normal. |
| DontLinger | n/a | Menunjukkan apakah soket akan ditutup tanpa menunggu. |
| ExclusiveAddressUse | n/a | Sebuah soket akan menggunakan alamat yang terikat secara eksklusif. |
| SendBuffer | 4097 | Menentukan ukuran buffer pengiriman. |
| ReceiveBuffer | 4098 | Menentukan ukuran buffer penerimaan. |
| SendLowWater | 4099 | Menentukan jumlah minimum data untuk operasi pengiriman. |
| ReceiveLowWater | 4100 | Menentukan jumlah minimum data untuk operasi penerimaan. |
| SendTimeout | 4101 | Menentukan batas waktu untuk operasi pengiriman sinkron. |
| ReceiveTimeout | 4102 | Menentukan batas waktu untuk operasi penerimaan sinkron. |
| Kesalahan | 4103 | Mengembalikan status kesalahan dan membersihkan. |
| Tipe | 4104 | Mengembalikan tipe soket. |
| ReuseUnicastPort | 12295 | Menunjukkan apakah sistem harus menunda alokasi port ephemere untuk koneksi keluar. |
| MaxConnections | 2147483647 | Opsi ini tidak didukung. Ini digunakan untuk menentukan panjang antrean maksimum untuk mendengarkan. |
| IPOptions | 1 | Menentukan opsi IP yang harus disisipkan ke datagram keluar. |
| HeaderIncluded | 2 | Header disertakan ke datagram keluar. |
| TypeOfService | 3 | Ubah tipe header IP pada bidang layanan. |
| IpTimeToLive | 4 | Waktu hidup IP. |
| MulticastInterface | 9 | Atur antarmuka untuk paket multicast keluar. |
| MulticastTimeToLive | 10 | Waktu hidup multicast IP. |
| MulticastLoopback | 11 | Loopback IP Multicast. |
| AddMembership | 12 | Tambahkan keanggotaan grup IP. |
| DropMembership | 13 | Hapus keanggotaan grup IP. |
| DontFragment | 14 | Jangan fragmentasikan datagram IP. |
| AddSourceMembership | 15 | Gabung ke grup/sumber IP. |
| DropSourceMembership | 16 | Hapus grup/sumber IP. |
| BlockSource | 17 | Blokir grup/sumber IP. |
| UnblockSource | 18 | Buka blokir grup/sumber IP. |
| PacketInformation | 19 | Terima informasi paket untuk IPv4. |
| HopLimit | 21 | Mengirimkan integer yang berisi jumlah HOP paket. |
| IPProtectionLevel | 23 | Mengaktifkan pembatasan soket IPv6 ke ruang lingkup yang ditentukan. |
| IPv6Only | 27 | Soket dibatasi untuk hanya mengirim dan menerima paket IPv6. |
| NoDelay | 1 | Menonaktifkan algoritma Nagle untuk menggabungkan paket yang dikirim. |
| BsdUrgent | 2 | Gunakan data mendesak sebagaimana didefinisikan dalam RFC-1222. |
| Expedited | 2 | Gunakan data dipercepat sebagaimana didefinisikan dalam RFC-1222. |
| NoChecksum | 1 | Kirim datagram UDP dengan checksum diatur ke nol. |
| ChecksumCoverage | 20 | Atur atau dapatkan cakupan checksum UDP. |
| UpdateAcceptContext | 28683 | Memperbarui soket klien dengan properti yang sama seperti soket yang mendengarkan. |
| UpdateConnectContext | 28688 | Memperbarui soket klien dengan properti yang sama seperti soket yang mendengarkan. |

## Lihat Juga

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
