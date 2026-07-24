---
title: "System::Xml::XmlNameTable::Add methode"
linktitle: "Add"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNameTable::Add methode. Wanneer overschreven in een afgeleide klasse, atomiseert de opgegeven tekenreeks en voegt deze toe aan de XmlNameTable in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlnametable/add/
---
## XmlNameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Wanneer overschreven in een afgeleide klasse, atomiseert de opgegeven tekenreeks en voegt deze toe aan de [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const ArrayPtr<char16_t> &array, int32_t offset, int32_t length)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| array | const ArrayPtr\<char16_t\>\& | De karakterarray die de toe te voegen naam bevat. |
| offset | int32_t | Nulgebaseerde index in de array die het eerste teken van de naam aangeeft. |
| lengte | int32_t | Het aantal tekens in de naam. |

### ReturnValue

De nieuwe geatomiseerde tekenreeks of de bestaande als deze al bestaat. Als lengte nul is, wordt [String::Empty](../../../system/string/empty/) geretourneerd.

## Zie ook

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNameTable::Add(const String\&) method


Wanneer overschreven in een afgeleide klasse, atomiseert de opgegeven tekenreeks en voegt deze toe aan de [XmlNameTable](../).

```cpp
virtual const String & System::Xml::XmlNameTable::Add(const String &array)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| array | const String\& | De toe te voegen naam. |

### ReturnValue

De nieuwe geatomiseerde tekenreeks of de bestaande als deze al bestaat.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
