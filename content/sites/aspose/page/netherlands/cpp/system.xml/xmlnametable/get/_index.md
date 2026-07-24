---
title: "System::Xml::XmlNameTable::Get methode"
linktitle: "Haal op"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNameTable::Get methode. Wanneer overschreven in een afgeleide klasse, haalt de geatomiseerde tekenreeks op die dezelfde tekens bevat als het opgegeven bereik van tekens in de gegeven array in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml/xmlnametable/get/
---
## XmlNameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Wanneer overschreven in een afgeleide klasse, haalt de geatomiseerde string op die dezelfde tekens bevat als het opgegeven bereik van tekens in de gegeven array.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | De karakterarray die de op te zoeken naam bevat. |
| offset | int32_t | De nulgebaseerde index in de array die het eerste teken van de naam aangeeft. |
| lengte | int32_t | Het aantal tekens in de naam. |

### ReturnValue

De geatomiseerde tekenreeks of **nullptr** als de tekenreeks nog niet geatomiseerd is. Als **length** nul is, wordt [String::Empty](../../../system/string/empty/) geretourneerd.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Get(const String\&) method


Wanneer overschreven in een afgeleide klasse, haalt de geatomiseerde string op die dezelfde waarde heeft als de opgegeven string.

```cpp
virtual const String & System::Xml::XmlNameTable::Get(const String &array)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| array | const String\& | De naam om op te zoeken. |

### ReturnValue

De geatomiseerde string of **nullptr** als de string nog niet geatomiseerd is.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
