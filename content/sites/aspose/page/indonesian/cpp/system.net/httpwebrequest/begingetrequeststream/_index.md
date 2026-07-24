---
title: "System::Net::HttpWebRequest::BeginGetRequestStream metode"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page untuk C++"
description: "System::Net::HttpWebRequest::BeginGetRequestStream metode. Memulai operasi asinkron untuk mendapatkan stream untuk menulis data ke sumber daya dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


Memulai operasi asinkron untuk mendapatkan aliran untuk menulis data ke sumber daya.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
