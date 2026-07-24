---
title: "System::Net::WebRequest::BeginGetRequestStream metode"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page untuk C++"
description: "System::Net::WebRequest::BeginGetRequestStream metode. Memulai operasi asinkron untuk mendapatkan aliran menulis data ke sumber daya dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.net/webrequest/begingetrequeststream/
---
## WebRequest::BeginGetRequestStream method


Memulai operasi asinkron untuk mendapatkan aliran untuk menulis data ke sumber daya.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
