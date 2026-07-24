---
title: "System::Net::Sockets::Socket::EndSend metode"
linktitle: "EndSend"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::Socket::EndSend metode. Menunggu hingga operasi pengiriman asynchronous yang ditentukan selesai di C++."
type: docs
weight: 1600
url: /id/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


Menunggu hingga operasi pengiriman asinkron yang ditentukan selesai.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi pengiriman asynchronous. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Menunggu hingga operasi pengiriman asinkron yang ditentukan selesai.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi pengiriman asynchronous. |
| errorCode | SocketError\& | Parameter output tempat kode error akan diberikan ketika operasi pengiriman gagal. |

### ReturnValue

Jumlah byte yang dikirim.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
