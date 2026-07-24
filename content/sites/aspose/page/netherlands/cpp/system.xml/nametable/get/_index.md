---
title: "System::Xml::NameTable::Get method"
linktitle: "Haal op"
second_title: "Aspose.Page voor C++"
description: "System::Xml::NameTable::Get method. Retourneert de geatomiseerde tekenreeks die dezelfde tekens bevat als het opgegeven bereik van tekens in de gegeven array in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Retourneert de geatomiseerde string die dezelfde tekens bevat als het opgegeven bereik van tekens in de gegeven array.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sleutel | const ArrayPtr\<char16_t\>\& | De karakterarray die de te vinden naam bevat. |
| start | int32_t | De nulgebaseerde index in de array die het eerste teken van de naam aangeeft. |
| len | int32_t | Het aantal tekens in de naam. |

### ReturnValue

De geatomiseerde tekenreeks of **nullptr** als de tekenreeks nog niet geatomiseerd is. Als **len** nul is, wordt [String::Empty](../../../system/string/empty/) geretourneerd.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


Retourneert de geatomiseerde string met de opgegeven waarde.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const String\& | De te vinden naam. |

### ReturnValue

Het geatomiseerde tekenreeksobject of **nullptr** als de tekenreeks nog niet geatomiseerd is.

## Zie ook

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
