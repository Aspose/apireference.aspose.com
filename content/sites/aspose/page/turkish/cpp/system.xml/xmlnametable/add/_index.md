---
title: "System::Xml::XmlNameTable::Add metodu"
linktitle: "Add"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNameTable::Add metodu. Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen dizeyi atomize eder ve C++'ta XmlNameTable'a ekler."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen dizeyi atomize eder ve [XmlNameTable](../) öğesine ekler.

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| dizi | const ArrayPtr\<char16_t\>\& | Eklenecek adı içeren karakter dizisi. |
| offset | int32_t | Adın ilk karakterini belirten dizi içindeki sıfır tabanlı indeks. |
| length | int32_t | Ad içindeki karakter sayısı. |

### ReturnValue

Yeni atomize edilmiş dize ya da zaten mevcutsa mevcut dize. Uzunluk sıfır ise, [String::Empty](../../../system/string/empty/) döndürülür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen dizeyi atomize eder ve [XmlNameTable](../) öğesine ekler.

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| dizi | const String\& | Eklenecek ad. |

### ReturnValue

Yeni atomize edilmiş dize ya da zaten mevcutsa mevcut dize.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
