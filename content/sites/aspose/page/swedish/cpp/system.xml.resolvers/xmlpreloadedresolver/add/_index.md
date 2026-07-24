---
title: "System::Xml::Resolvers::XmlPreloadedResolver::Add metod"
linktitle: "Add"
second_title: "Aspose.Page för C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::Add metod. Lägger till en bytearray i XmlPreloadedResolver-lagret och mappar den till en URI. Om lagret redan innehåller en mappning för samma URI, ersätts den befintliga mappningen i C++."
type: docs
weight: 200
url: /sv/cpp/system.xml.resolvers/xmlpreloadedresolver/add/
---
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) method


Lägger till en bytearray i lagret [XmlPreloadedResolver](../) och mappar den till en URI. Om lagret redan innehåller en mappning för samma URI, ersätts den befintliga mappningen.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | URI:n för de data som läggs till i lagret [XmlPreloadedResolver](../). |
| value | const ArrayPtr\<uint8_t\>\& | En bytearray med de data som motsvarar den angivna URI:n. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Lägger till en bytearray i lagret [XmlPreloadedResolver](../) och mappar den till en URI. Om lagret redan innehåller en mappning för samma URI, ersätts den befintliga mappningen.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value, int32_t offset, int32_t count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | URI:n för de data som läggs till i lagret [XmlPreloadedResolver](../). |
| value | const ArrayPtr\<uint8_t\>\& | En bytearray med de data som motsvarar den angivna URI:n. |
| offset | int32_t | Offseten i den angivna bytearrayen där data börjar. |
| count | int32_t | Antalet byte att läsa från bytearrayen, med start vid den angivna offseten. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) method


Lägger till ett Stream i lagret [XmlPreloadedResolver](../) och mappar det till en URI. Om lagret redan innehåller en mappning för samma URI, ersätts den befintliga mappningen.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const SharedPtr<IO::Stream> &value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | URI:n för de data som läggs till i lagret [XmlPreloadedResolver](../). |
| value | const SharedPtr\<IO::Stream\>\& | Ett Stream med de data som motsvarar den angivna URI:n. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const String\&) method


Lägger till en sträng med förinlästa data i lagret [XmlPreloadedResolver](../) och mappar den till en URI. Om lagret redan innehåller en mappning för samma URI, ersätts den befintliga mappningen.

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const String &value)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | URI:n för de data som läggs till i lagret [XmlPreloadedResolver](../). |
| value | const String\& | En [String](../../../system/string/) med de data som motsvarar den angivna URI:n. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
