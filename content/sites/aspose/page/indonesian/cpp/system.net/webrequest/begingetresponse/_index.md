---
title: "System::Net::WebRequest::BeginGetResponse method"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::WebRequest::BeginGetResponse. Memulai permintaan asynchronous untuk sumber daya dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Memulai permintaan asinkron untuk sumber daya.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | AsyncCallback | Callback yang akan dipanggil ketika operasi selesai. |
| state | System::SharedPtr\<Object\> | Data yang disediakan pengguna untuk mengidentifikasi secara unik setiap operasi asynchronous. |

### ReturnValue

Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili operasi asynchronous yang dimulai.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
