---
title: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver konstruktor"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page för C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver konstruktor. Initierar en ny instans av XmlPreloadedResolver‑klassen i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml.resolvers/xmlpreloadedresolver/xmlpreloadedresolver/
---
## XmlPreloadedResolver::XmlPreloadedResolver() constructor


Initierar en ny instans av klassen [XmlPreloadedResolver](../).

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver()
```

## Se även

* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&) constructor


Initierar en ny instans av klassen [XmlPreloadedResolver](../) med den angivna fallback‑resolvern.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) eller din egen resolver. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) constructor


Initierar en ny instans av klassen [XmlPreloadedResolver](../) med den angivna fallback‑resolvern och förinlästa välkända DTD‑filer.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) eller din egen resolver. |
| preloadedDtds | XmlKnownDtds | De välkända DTD‑filerna som ska förhandsbefyllas i cachen. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) constructor


Initierar en ny instans av klassen [XmlPreloadedResolver](../) med den angivna fallback‑resolvern, förinlästa välkända DTD‑filer och en URI‑jämförare för likhet.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds, const SharedPtr<Collections::Generic::IEqualityComparer<SharedPtr<Uri>>> &uriComparer)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Den [XmlResolver](../../../system.xml/xmlresolver/) eller din egen resolver. |
| preloadedDtds | XmlKnownDtds | De välkända DTD‑filerna som ska förhandsbefyllas i cachen. |
| uriComparer | const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\& | Implementeringen av IEqualityComparer‑gränssnittet som ska användas när du jämför URI:er. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [IEqualityComparer](../../../system.collections.generic/iequalitycomparer/)
* Class [Uri](../../../system/uri/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds) constructor


Initierar en ny instans av klassen [XmlPreloadedResolver](../) med de angivna förinlästa välkända DTD‑filerna.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds preloadedDtds)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| preloadedDtds | XmlKnownDtds | De välkända DTD‑filerna som ska förhandsbefyllas i cachen. |

## Se även

* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
