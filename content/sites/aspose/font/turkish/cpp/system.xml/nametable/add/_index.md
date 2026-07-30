---
title: "System::Xml::NameTable::Add yöntemi"
linktitle: "Add"
second_title: "Aspose.Font için C++"
description: "System::Xml::NameTable::Add yöntemi. Belirtilen dizeyi atomlaştırır ve C++'ta NameTable'a ekler."
type: docs
weight: 200
url: /tr/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Belirtilen dizeyi atomlaştırır ve [NameTable](../) içine ekler.

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | const ArrayPtr\<char16_t\>\& | Eklenecek dizeyi içeren karakter dizisi. |
| başlangıç | int32_t | Dizedeki ilk karakteri belirten diziye sıfır tabanlı indeks. |
| len | int32_t | Dizedeki karakter sayısı. |

### ReturnValue

Atomlaştırılmış dize veya [NameTable](../) içinde zaten mevcutsa mevcut dize. **len** sıfır ise, [String::Empty](../../../system/string/empty/) döndürülür.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Add(const String\&) method


Belirtilen dizeyi atomlaştırır ve [NameTable](../) içine ekler.

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| anahtar | const String\& | Eklenecek dize. |

### ReturnValue

Atomlaştırılmış dize veya [NameTable](../) içinde zaten mevcutsa mevcut dize.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
