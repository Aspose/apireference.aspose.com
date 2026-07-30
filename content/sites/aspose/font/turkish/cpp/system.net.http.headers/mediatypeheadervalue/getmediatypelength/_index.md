---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength metodu"
linktitle: "GetMediaTypeLength"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength metodu. Belirtilen indeksten itibaren verilen bir dizeyi C++'da MediaTypeHeaderValue sınıfının bir örneğine dönüştürür."
type: docs
weight: 1000
url: /tr/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


Belirtilen indeksten itibaren verilen bir dizeyi [MediaTypeHeaderValue](../) sınıfının bir örneğine dönüştürür.

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| girdi | Dize | Ayrıştırılacak bir dize. |
| startIndex | int32_t | Ayrıştırma için bir başlangıç konumu. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | [MediaTypeHeaderValue](../) sınıfının örneklerini oluşturmak için kullanılan temsilci. |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | Ayrıştırılmış bir nesnenin atanacağı bir örnek. |

### ReturnValue

Ayrıştırılmış bir alt dizenin uzunluğunu döndürür, aksi takdirde 0.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
