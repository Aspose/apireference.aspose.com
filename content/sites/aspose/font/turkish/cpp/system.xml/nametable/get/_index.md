---
title: "System::Xml::NameTable::Get yöntemi"
linktitle: "Al"
second_title: "Aspose.Font için C++"
description: "System::Xml::NameTable::Get yöntemi. Verilen dizideki belirtilen karakter aralığıyla aynı karakterleri içeren atomlaştırılmış dizeyi C++'ta döndürür."
type: docs
weight: 300
url: /tr/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Verilen dizideki belirtilen karakter aralığıyla aynı karakterleri içeren atomlaştırılmış dizeyi döndürür.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | const ArrayPtr\<char16_t\>\& | Bulunacak adı içeren karakter dizisi. |
| başlangıç | int32_t | İsmin ilk karakterini belirten dizideki sıfır tabanlı indeks. |
| len | int32_t | İsimdeki karakter sayısı. |

### ReturnValue

Atomlaştırılmış dize veya dize henüz atomlaştırılmamışsa **nullptr**. **len** sıfır ise, [String::Empty](../../../system/string/empty/) döndürülür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Get(const String\&) method


Belirtilen değere sahip atomlaştırılmış dizeyi döndürür.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Bulunacak ad. |

### ReturnValue

Atomlaştırılmış dize nesnesi veya dize henüz atomlaştırılmamışsa **nullptr**.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
