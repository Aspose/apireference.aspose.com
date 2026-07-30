---
title: "System::Xml::XmlNameTable::Get metodu"
linktitle: "Al"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNameTable::Get metodu. Türetilmiş bir sınıfta geçersiz kılındığında, C++'da verilen dizideki belirtilen karakter aralığıyla aynı karakterleri içeren atomize edilmiş dizeyi alır."
type: docs
weight: 200
url: /tr/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Türetilmiş bir sınıfta geçersiz kılındığında, verilen dizideki belirtilen karakter aralığıyla aynı karakterleri içeren atomize edilmiş dizeyi alır.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dizi | const ArrayPtr\<char16_t\>\& | Aranacak ismi içeren karakter dizisi. |
| offset | int32_t | İsmin ilk karakterini belirten dizideki sıfır tabanlı indeks. |
| uzunluk | int32_t | İsimdeki karakter sayısı. |

### ReturnValue

Atomize edilmiş dize ya da **nullptr**, eğer dize henüz atomize edilmemişse. **length** sıfır ise, [String::Empty](../../../system/string/empty/) döndürülür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNameTable::Get(const String\&) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen dizeyle aynı değeri içeren atomize edilmiş dizeyi alır.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dizi | const String\& | Aranacak isim. |

### ReturnValue

Atomize edilmiş dize ya da **nullptr**, eğer dize henüz atomize edilmemişse.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
