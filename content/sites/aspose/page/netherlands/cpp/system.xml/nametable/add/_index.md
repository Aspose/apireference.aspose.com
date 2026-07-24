---
title: "System::Xml::NameTable::Add method"
linktitle: "Add"
second_title: "Aspose.Page voor C++"
description: "System::Xml::NameTable::Add method. Atomiseert de opgegeven tekenreeks en voegt deze toe aan de NameTable in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Atomiseert de opgegeven tekenreeks en voegt deze toe aan de [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | const ArrayPtr\<char16_t\>\& | De karakterarray die de toe te voegen tekenreeks bevat. |
| start | int32_t | De nulgebaseerde index in de array die het eerste teken van de tekenreeks aangeeft. |
| len | int32_t | Het aantal tekens in de tekenreeks. |

### ReturnValue

De geatomiseerde tekenreeks of de bestaande tekenreeks als er al één bestaat in de [NameTable](../). Als **len** nul is, wordt [String::Empty](../../../system/string/empty/) geretourneerd.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Add(const String\&) method


Atomiseert de opgegeven tekenreeks en voegt deze toe aan de [NameTable](../).

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | const String\& | De toe te voegen tekenreeks. |

### ReturnValue

De geatomiseerde tekenreeks of de bestaande tekenreeks als deze al bestaat in de [NameTable](../).

## Zie ook

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
