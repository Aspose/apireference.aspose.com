---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength method"
linktitle: "GetNameValueLength"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength yöntemi. Belirtilen indeksden başlayan bir dizeyi C++'ta NameValueHeaderValue sınıfının bir örneğine dönüştürür."
type: docs
weight: 900
url: /tr/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


Belirtilen indeksden başlayan bir dizeyi [NameValueHeaderValue](../) sınıfının bir örneğine dönüştürür.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | Dize | Ayrıştırılacak bir dize. |
| startIndex | int32_t | Ayrıştırma için bir başlangıç konumu. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | Yeni [NameValueHeaderValue](../) sınıfı örnekleri oluşturmak için kullanılan bir işlev. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Ayrıştırılmış bir nesnenin atanacağı bir örnek. |

### ReturnValue

Ayrıştırılmış bir alt dizenin uzunluğunu döndürür, aksi takdirde 0.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


Belirtilen indeksden başlayan bir dizeyi [NameValueHeaderValue](../) sınıfının bir örneğine dönüştürür.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | Dize | Ayrıştırılacak bir dize. |
| startIndex | int32_t | Ayrıştırma için bir başlangıç konumu. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Ayrıştırılmış bir nesnenin atanacağı bir örnek. |

### ReturnValue

Ayrıştırılmış bir alt dizenin uzunluğunu döndürür, aksi takdirde 0.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
