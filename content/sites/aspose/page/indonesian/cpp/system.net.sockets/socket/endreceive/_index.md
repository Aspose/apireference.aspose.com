---
title: "Metode System::Net::Sockets::Socket::EndReceive"
linktitle: "EndReceive"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::Sockets::Socket::EndReceive. Menunggu sampai operasi penerimaan asinkron yang ditentukan selesai dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


Menunggu hingga operasi penerimaan asinkron yang ditentukan selesai.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi penerimaan asinkron. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Menunggu hingga operasi penerimaan asinkron yang ditentukan selesai.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi penerimaan asinkron. |
| errorCode | SocketError\& | Parameter output tempat kode kesalahan akan ditempatkan ketika operasi penerimaan gagal. |

### ReturnValue

Jumlah byte yang diterima.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
