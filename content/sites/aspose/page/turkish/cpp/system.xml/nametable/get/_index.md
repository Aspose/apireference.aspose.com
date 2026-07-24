---
title: "System::Xml::NameTable::Get method"
linktitle: "Al"
second_title: "Aspose.Page için C++"
description: "System::Xml::NameTable::Get method. Verilen dizideki belirtilen karakter aralığıyla aynı karakterleri içeren atomlaştırılmış dizeyi C++'da döndürür."
type: docs
weight: 300
url: /tr/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Belirtilen dizi içinde verilen karakter aralığıyla aynı karakterleri içeren atomize edilmiş dizeyi döndürür.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| anahtar | const ArrayPtr\<char16_t\>\& | Bulunacak adı içeren karakter dizisi. |
| başlangıç | int32_t | Adın ilk karakterini belirten dizi içindeki sıfır tabanlı indeks. |
| len | int32_t | Ad içindeki karakter sayısı. |

### ReturnValue

Atomlaştırılmış dize ya da dize henüz atomlaştırılmamışsa **nullptr**. **len** sıfır ise, [String::Empty](../../../system/string/empty/) döndürülür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


Belirtilen değere sahip atomlaştırılmış dizeyi döndürür.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const String\& | Bulunacak ad. |

### ReturnValue

Atomlaştırılmış dize nesnesi ya da dize henüz atomlaştırılmamışsa **nullptr**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
