---
title: "kelas System::Net::ServicePoint"
linktitle: "ServicePoint"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Net::ServicePoint. Menyediakan manajemen koneksi HTTP. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3100
url: /id/cpp/system.net/servicepoint/
---
## ServicePoint class


Menawarkan manajemen koneksi HTTP. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ServicePoint : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | Menutup dan menghapus koneksi yang termasuk dalam grup koneksi yang ditentukan. |
| [get_Address](./get_address/)() | Mengembalikan URI server yang dihubungkan oleh instance saat ini. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | Informasi RTTI. |
| [get_Certificate](./get_certificate/)() | Mengembalikan sertifikat yang digunakan oleh instance saat ini. |
| [get_ClientCertificate](./get_clientcertificate/)() | Mengembalikan sertifikat klien terakhir. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | Mendapatkan batas waktu dalam milidetik setelah mana [ServicePoint](./) yang aktif akan ditutup. |
| [get_ConnectionLimit](./get_connectionlimit/)() | Mendapatkan jumlah maksimum koneksi yang diizinkan oleh instance saat ini. |
| [get_ConnectionName](./get_connectionname/)() | Mengembalikan nama koneksi. |
| [get_CurrentConnections](./get_currentconnections/)() | Mengembalikan jumlah koneksi yang terbuka. |
| [get_Expect100Continue](./get_expect100continue/)() | Mendapatkan nilai yang menunjukkan apakah perilaku 100-Continue digunakan. |
| [get_IdleSince](./get_idlesince/)() | Mengembalikan tanggal dan waktu koneksi terbaru ke host. |
| [get_MaxIdleTime](./get_maxidletime/)() | Mendapatkan jumlah waktu dalam milidetik setelah mana koneksi idle akan ditutup. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | Mengembalikan versi HTTP. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Mendapatkan ukuran buffer penerimaan. |
| [get_SupportsPipelining](./get_supportspipelining/)() | Mengembalikan nilai yang menunjukkan apakah instance saat ini mendukung koneksi pipeline. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Mendapatkan nilai yang menunjukkan apakah algoritma Nagle digunakan oleh koneksi yang dikelola oleh instance saat ini. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | Mengatur delegasi yang digunakan untuk mengaitkan [IPEndPoint](../ipendpoint/) lokal dengan instance saat ini. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | Mengatur batas waktu dalam milidetik setelah mana [ServicePoint](./) yang aktif akan ditutup. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | Mengatur jumlah maksimum koneksi yang diizinkan oleh instance saat ini. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | Mengatur nilai yang menunjukkan apakah perilaku 100-Continue digunakan. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | Mengatur jumlah waktu dalam milidetik setelah mana koneksi idle akan ditutup. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Mengatur ukuran buffer penerimaan. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Mengatur nilai yang menunjukkan apakah algoritma Nagle digunakan oleh koneksi yang dikelola oleh instance saat ini. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Mengatur nilai yang menunjukkan apakah opsi 'Keep-Alive' diaktifkan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
