---
title: "System::Net::WebRequest::RegisterPrefix method"
linktitle: "RegisterPrefix"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Net::WebRequest::RegisterPrefix. Mendaftarkan turunan WebRequest untuk URI yang ditentukan dalam C++."
type: docs
weight: 600
url: /id/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


Mendaftarkan turunan [WebRequest](../) untuk URI yang ditentukan.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| awalan | String | URI atau awalan URI. |
| creator | System::SharedPtr\<IWebRequestCreate\> | Membuat instance baru dari kelas [WebRequest](../). |

### ReturnValue

Benar ketika turunan [WebRequest](../) berhasil didaftarkan untuk URI yang ditentukan, jika tidak maka salah.

## Lihat Juga

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
