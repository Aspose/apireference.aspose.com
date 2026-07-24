---
title: "enum System::Net::Sockets::SocketError"
linktitle: "SocketError"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::SocketError enum. Mengenumerasi tipe kesalahan soket dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.net.sockets/socketerror/
---
## SocketError enum


Menumerasikan tipe kesalahan socket.

```cpp
enum class SocketError
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Success | 0 | Operasi soket selesai dengan sukses. |
| SocketError | -1 | Terjadi kesalahan soket yang tidak ditentukan. |
| Interrupted | 10004 | Panggilan soket yang memblokir dibatalkan. |
| AccessDenied | 10013 | Akses ke soket ditolak. |
| Fault | 10014 | Terdeteksi alamat pointer yang tidak valid. |
| InvalidArgument | 10022 | Argumen yang diberikan tidak valid. |
| TooManyOpenSockets | 10024 | Terlalu banyak soket terbuka di penyedia soket yang mendasari. |
| WouldBlock | 10035 | Operasi tidak dapat diselesaikan secara langsung pada soket non-blokir. |
| InProgress | 10036 | Operasi pemblokiran sedang berlangsung. |
| AlreadyInProgress | 10037 | Soket non-pemblokiran sudah memiliki operasi yang sedang berjalan. |
| NotSocket | 10038 | Upaya untuk memanggil operasi soket pada non-soket. |
| DestinationAddressRequired | 10039 | Alamat yang diperlukan dihilangkan dari operasi soket. |
| MessageSize | 10040 | Datagram terlalu panjang. |
| ProtocolType | 10041 | Jenis protokol tidak didukung oleh soket ini. |
| ProtocolOption | 10042 | Opsi atau level yang tidak dikenal, tidak valid, atau tidak didukung digunakan. |
| ProtocolNotSupported | 10043 | Protokol tidak diimplementasikan atau tidak dikonfigurasi. |
| SocketNotSupported | 10044 | Keluarga alamat tidak mendukung soket yang ditentukan. |
| OperationNotSupported | 10045 | Sebuah keluarga protokol tidak mendukung keluarga alamat. |
| ProtocolFamilyNotSupported | 10046 | Keluarga protokol tidak diimplementasikan atau tidak dikonfigurasi. |
| AddressFamilyNotSupported | 10047 | Keluarga alamat yang ditentukan tidak didukung. |
| AddressAlreadyInUse | 10048 | Sebuah alamat hanya dapat digunakan satu kali. |
| AddressNotAvailable | 10049 | Alamat IP yang dipilih tidak valid dalam konteks ini. |
| NetworkDown | 10050 | Jaringan tidak tersedia. |
| NetworkUnreachable | 10051 | Tidak ada rute ke host remote. |
| NetworkReset | 10052 | Sebuah aplikasi mencoba mengatur 'Keep-Alive' pada koneksi yang sudah kedaluwarsa. |
| ConnectionAborted | 10053 | Sebuah koneksi dibatalkan. |
| ConnectionReset | 10054 | Sebuah koneksi direset oleh rekan jauh. |
| NoBufferSpaceAvailable | 10055 | Tidak ada ruang buffer bebas yang tersedia untuk operasi soket. |
| IsConnected | 10056 | Soket sudah terhubung. |
| NotConnected | 10057 | Sebuah aplikasi mencoba mengirim atau menerima data, dan soket tidak terhubung. |
| Shutdown | 10058 | Permintaan untuk mengirim atau menerima data dilarang karena soket sudah ditutup. |
| TimedOut | 10060 | Upaya koneksi habis waktu, atau host yang terhubung gagal merespons. |
| ConnectionRefused | 10061 | Host jauh secara aktif menolak koneksi. |
| HostDown | 10064 | Sebuah operasi gagal karena host remote sedang tidak aktif. |
| HostUnreachable | 10065 | Tidak ada rute jaringan ke host yang ditentukan. |
| ProcessLimit | 10067 | Terlalu banyak proses yang menggunakan penyedia soket dasar. |
| SystemNotReady | 10091 | Sub-sistem jaringan tidak tersedia. |
| VersionNotSupported | 10092 | Versi penyedia soket dasar berada di luar jangkauan. |
| NotInitialized | 10093 | Penyedia soket dasar tidak diinisialisasi. |
| Disconnecting | 10101 | Penutupan yang halus sedang berlangsung. |
| TypeNotFound | 10109 | Kelas yang ditentukan tidak ditemukan. |
| HostNotFound | 11001 | Host yang ditentukan tidak dikenal. |
| CobaLagi | 11002 | Nama host tidak dapat diselesaikan. |
| TidakAdaPemulihan | 11003 | Kesalahan tidak dapat dipulihkan atau basis data yang diminta tidak dapat ditemukan. |
| TidakAdaData | 11004 | Nama atau alamat IP yang diminta tidak ditemukan pada server nama. |

## Lihat Juga

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
