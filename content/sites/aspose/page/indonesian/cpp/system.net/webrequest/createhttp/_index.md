---
title: "System::Net::WebRequest::CreateHttp metode"
linktitle: "CreateHttp"
second_title: "Aspose.Page untuk C++"
description: "System::Net::WebRequest::CreateHttp metode. Membuat instance baru dari kelas WebRequest menggunakan URI yang ditentukan dalam C++."
type: docs
weight: 300
url: /id/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


Membuat instance baru dari kelas [WebRequest](../) menggunakan URI yang ditentukan.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| requestUriString | String | URI yang digunakan untuk membuat instance baru dari kelas [WebRequest](../). |

### ReturnValue

Sebuah instance kelas WebRequest yang baru dibuat.
## Catatan



NotSupportedException akan dilemparkan ketika URI yang ditentukan dimulai dengan skema apa pun kecuali [http://](http://) atau [https://](https://).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


Membuat instance baru dari kelas [WebRequest](../) menggunakan URI yang ditentukan.

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | URI yang digunakan untuk membuat instance baru dari kelas [WebRequest](../). |

### ReturnValue

Sebuah instance kelas WebRequest yang baru dibuat.
## Catatan



NotSupportedException akan dilemparkan ketika URI yang ditentukan dimulai dengan skema apa pun kecuali [http://](http://) atau [https://](https://).

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
