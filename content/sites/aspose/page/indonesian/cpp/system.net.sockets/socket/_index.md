---
title: "System::Net::Sockets::Socket kelas"
linktitle: "Socket"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::Socket kelas. Kelas Socket mengimplementasikan antarmuka soket Berkeley dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net.sockets/socket/
---
## Socket class


Kelas [Socket](./) mengimplementasikan antarmuka soket Berkeley.

```cpp
class Socket : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Accept](./accept/)() | Membuat soket baru untuk koneksi yang baru dibuat. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi koneksi asinkron. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi koneksi asinkron. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi koneksi asinkron. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi koneksi asinkron. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi tulis asynchronous. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Memulai operasi pengiriman asinkron. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | Mengikat soket ke endpoint lokal yang ditentukan. |
| [Close](./close/)() | Menutup koneksi soket. |
| [Close](./close/)(int) | Menutup koneksi soket dengan batas waktu yang ditentukan untuk memungkinkan data yang antre dikirim. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | Membuat koneksi ke endpoint remote yang ditentukan. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Membuat koneksi ke endpoint remote yang ditentukan. |
| [Connect](./connect/)(String, int32_t) | Membuat koneksi ke endpoint remote yang ditentukan. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Membuat koneksi ke endpoint remote yang ditentukan. |
| [Dispose](./dispose/)() override | Tidak melakukan apa-apa. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi koneksi asinkron yang ditentukan selesai. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi penerimaan asinkron yang ditentukan selesai. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Menunggu hingga operasi penerimaan asinkron yang ditentukan selesai. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | Menunggu hingga operasi pengiriman asinkron yang ditentukan selesai. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Menunggu hingga operasi pengiriman asinkron yang ditentukan selesai. |
| [get_AddressFamily](./get_addressfamily/)() | Mengembalikan keluarga alamat. |
| [get_Available](./get_available/)() | Mendapatkan jumlah byte yang diterima dari jaringan dan tersedia untuk dibaca. |
| [get_Blocking](./get_blocking/)() | Mendapatkan nilai yang menunjukkan apakah soket berada dalam mode blokir. |
| [get_Connected](./get_connected/)() | Mengembalikan nilai yang menunjukkan apakah soket terhubung ke host remote. |
| [get_DontFragment](./get_dontfragment/)() | Mendapatkan nilai yang menunjukkan apakah soket mengizinkan datagram IP dipecah menjadi fragmen. |
| [get_DualMode](./get_dualmode/)() | Mendapatkan nilai yang menunjukkan apakah soket berada dalam mode ganda. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | Mendapatkan nilai yang menunjukkan apakah soket mengizinkan paket broadcast. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Mendapatkan nilai yang menunjukkan apakah hanya satu proses yang dapat mengikat soket ke port. |
| [get_IsBound](./get_isbound/)() | Mengembalikan nilai yang menunjukkan apakah soket terikat ke port lokal tertentu. |
| [get_LingerState](./get_lingerstate/)() | Mendapatkan nilai yang menunjukkan apakah soket akan menunda penutupan dalam upaya mengirim semua data yang tertunda. |
| [get_LocalEndPoint](./get_localendpoint/)() | Mengembalikan endpoint lokal. |
| [get_MulticastLoopback](./get_multicastloopback/)() | Mendapatkan nilai yang menunjukkan apakah soket menerima paket multicast keluar. |
| [get_NoDelay](./get_nodelay/)() | Mendapatkan nilai yang menunjukkan apakah soket menggunakan algoritma Nagle. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | Mengembalikan nilai yang menunjukkan apakah sistem operasi dan adaptor jaringan mendukung IPv4. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | Mengembalikan nilai yang menunjukkan apakah sistem operasi dan adaptor jaringan mendukung IPv6. |
| [get_ProtocolType](./get_protocoltype/)() | Mengembalikan tipe protokol. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Mendapatkan ukuran buffer penerimaan. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Mendapatkan periode setelah itu panggilan 'Receive' akan timeout. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | Mengembalikan endpoint remote. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Mendapatkan ukuran buffer pengiriman. |
| [get_SendTimeout](./get_sendtimeout/)() | Mendapatkan periode setelah itu panggilan 'Send' akan timeout. |
| [get_SocketType](./get_sockettype/)() | Mengembalikan tipe soket. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | Informasi RTTI. |
| [get_Ttl](./get_ttl/)() | Mendapatkan nilai TTL. |
| [GetImpl](./getimpl/)() const | Mengembalikan pointer ke implementasi. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | Mengembalikan nilai yang sesuai dengan nama opsi yang ditentukan. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Mendapatkan nilai yang sesuai dengan nama opsi yang ditentukan. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Mengembalikan nilai yang sesuai dengan nama opsi yang ditentukan. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Mengatur mode operasi tingkat rendah untuk socket. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Mengatur mode operasi tingkat rendah untuk socket. |
| [Listen](./listen/)(int32_t) | Mengubah status socket menjadi 'listen'. |
| [Poll](./poll/)(int32_t, SelectMode) | Mengembalikan status socket berdasarkan mode polling yang ditentukan. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Menerima data dari socket dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Menerima data dari endpoint yang ditentukan dan menuliskannya ke array byte yang ditentukan. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Mengirim data yang ditentukan ke socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Mengirim data yang ditentukan ke socket. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | Mengirim data yang ditentukan ke endpoint yang ditentukan. |
| [set_Blocking](./set_blocking/)(bool) | Mengatur nilai yang menunjukkan apakah socket berada dalam mode blokir. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | Mengatur batas waktu koneksi. |
| [set_DontFragment](./set_dontfragment/)(bool) | Mengatur nilai yang menunjukkan apakah socket mengizinkan datagram IP untuk dipecah. |
| [set_DualMode](./set_dualmode/)(bool) | Mengatur nilai yang menunjukkan apakah socket berada dalam mode ganda. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | Mengatur nilai yang menunjukkan apakah socket mengizinkan paket broadcast. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Mengatur nilai yang menunjukkan apakah hanya satu proses yang dapat mengikat socket ke port. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Mengatur nilai yang menunjukkan apakah socket akan menunda penutupan untuk mencoba mengirim semua data yang tertunda. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | Mengatur nilai yang menunjukkan apakah socket menerima paket multicast keluar. |
| [set_NoDelay](./set_nodelay/)(bool) | Mengatur nilai yang menunjukkan apakah socket menggunakan algoritma Nagle. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Mengatur ukuran buffer penerimaan. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Mengatur periode setelah itu panggilan 'Receive' akan kedaluwarsa. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Mengatur ukuran buffer pengiriman. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Mengatur periode setelah itu panggilan 'Send' akan kedaluwarsa. |
| [set_Ttl](./set_ttl/)(int16_t) | Mengatur nilai TTL. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Mengatur opsi soket yang ditentukan ke nilai yang ditentukan. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Mengatur opsi soket yang ditentukan ke nilai yang ditentukan. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | Mengatur opsi soket yang ditentukan ke nilai yang ditentukan. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | Mengatur opsi soket yang ditentukan ke nilai yang ditentukan. |
| [Shutdown](./shutdown/)(SocketShutdown) | Menonaktifkan operasi kirim dan terima pada soket. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Membuat instance baru. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Membuat instance baru. |
| virtual [~Socket](./~socket/)() | Menghancurkan instance saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ImplPtr](./implptr/) | Implementasi soket. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
