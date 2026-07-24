---
title: "System::Net::HttpWebRequest::EndGetResponse metode"
linktitle: "EndGetResponse"
second_title: "Aspose.Page untuk C++"
description: "System::Net::HttpWebRequest::EndGetResponse metode. Menunggu sampai permintaan asinkron yang ditentukan untuk sumber daya selesai dalam C++."
type: docs
weight: 700
url: /id/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


Menunggu hingga permintaan asinkron yang ditentukan untuk sumber daya selesai.

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Sebuah objek [IAsyncResult](../../../system/iasyncresult/) yang mewakili permintaan asinkron untuk sumber daya. |

### ReturnValue

Respons web.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
