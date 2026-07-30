---
title: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver Konstruktor"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Font für C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver Konstruktor. Initialisiert eine neue Instanz der XmlPreloadedResolver-Klasse in C++."
type: docs
weight: 100
url: /de/cpp/system.xml.resolvers/xmlpreloadedresolver/xmlpreloadedresolver/
---
## XmlPreloadedResolver::XmlPreloadedResolver() constructor


Initialisiert eine neue Instanz der [XmlPreloadedResolver](../)-Klasse.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver()
```

## Siehe auch

* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&) constructor


Initialisiert eine neue Instanz der [XmlPreloadedResolver](../)-Klasse mit dem angegebenen Fallback-Resolver.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) oder Ihr eigener Resolver. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) constructor


Initialisiert eine neue Instanz der [XmlPreloadedResolver](../)-Klasse mit dem angegebenen Fallback-Resolver und vorab geladenen bekannten DTDs.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) oder Ihr eigener Resolver. |
| preloadedDtds | XmlKnownDtds | Die bekannten DTDs, die in den Cache vorab geladen werden sollen. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) constructor


Initialisiert eine neue Instanz der [XmlPreloadedResolver](../)-Klasse mit dem angegebenen Fallback-Resolver, vorab geladenen bekannten DTDs und einem URI-Gleichheitsvergleich.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds, const SharedPtr<Collections::Generic::IEqualityComparer<SharedPtr<Uri>>> &uriComparer)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) oder Ihr eigener Resolver. |
| preloadedDtds | XmlKnownDtds | Die bekannten DTDs, die in den Cache vorab geladen werden sollen. |
| uriComparer | const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\& | Die Implementierung des IEqualityComparer-Interfaces, die beim Vergleich von URIs verwendet werden soll. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [IEqualityComparer](../../../system.collections.generic/iequalitycomparer/)
* Class [Uri](../../../system/uri/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds) constructor


Initialisiert eine neue Instanz der [XmlPreloadedResolver](../)-Klasse mit den angegebenen vorab geladenen bekannten DTDs.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds preloadedDtds)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| preloadedDtds | XmlKnownDtds | Die bekannten DTDs, die in den Cache vorab geladen werden sollen. |

## Siehe auch

* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
