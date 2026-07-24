---
title: "Metode System::Net::Sockets::TcpListener::BeginAcceptTcpClient"
linktitle: "BeginAcceptTcpClient"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::Sockets::TcpListener::BeginAcceptTcpClient. Memulai operasi penerimaan asinkron dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net.sockets/tcplistener/beginaccepttcpclient/
---
## TcpListener::BeginAcceptTcpClient method


Memulai operasi accept secara asynchronous.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptTcpClient(AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| state | System::SharedPtr\<Object\> | Data yang disediakan pengguna yang digunakan untuk mengidentifikasi secara unik setiap operasi koneksi asinkron. |

### ReturnValue

Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi penerimaan asinkron yang dimulai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
