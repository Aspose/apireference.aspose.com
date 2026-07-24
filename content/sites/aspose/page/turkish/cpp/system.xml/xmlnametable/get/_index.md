---
title: "System::Xml::XmlNameTable::Get metodu"
linktitle: "Al"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNameTable::Get metodu. Türetilmiş bir sınıfta geçersiz kılındığında, verilen dizideki belirtilen karakter aralığıyla aynı karakterleri içeren atomize edilmiş dizeyi C++'ta alır."
type: docs
weight: 200
url: /tr/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Türetilmiş bir sınıfta geçersiz kılındığında, verilen dizideki belirtilen karakter aralığıyla aynı karakterleri içeren atomize edilmiş dizeyi alır.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| dizi | const ArrayPtr\<char16_t\>\& | Aranacak adı içeren karakter dizisi. |
| offset | int32_t | Adın ilk karakterini belirten dizi içindeki sıfır tabanlı indeks. |
| length | int32_t | Ad içindeki karakter sayısı. |

### ReturnValue

Atomize edilmiş dize ya da dize henüz atomize edilmemişse **nullptr**. **length** sıfır ise, [String::Empty](../../../system/string/empty/) döndürülür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen dizeyle aynı değeri içeren atomize edilmiş dizeyi alır.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| dizi | const String\& | Aranacak ad. |

### ReturnValue

Atomize edilmiş dize veya dize daha önce atomize edilmemişse **nullptr**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
