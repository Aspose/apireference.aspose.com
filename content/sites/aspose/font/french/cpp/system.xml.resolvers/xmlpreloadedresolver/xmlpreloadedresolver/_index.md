---
title: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver constructeur"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver constructeur. Initialise une nouvelle instance de la classe XmlPreloadedResolver en C++."
type: docs
weight: 100
url: /fr/cpp/system.xml.resolvers/xmlpreloadedresolver/xmlpreloadedresolver/
---
## XmlPreloadedResolver::XmlPreloadedResolver() constructor


Initialise une nouvelle instance de la classe [XmlPreloadedResolver](../).

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver()
```

## Voir aussi

* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&) constructor


Initialise une nouvelle instance de la classe [XmlPreloadedResolver](../) avec le résolveur de secours spécifié.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) ou votre propre résolveur. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) constructor


Initialise une nouvelle instance de la classe [XmlPreloadedResolver](../) avec le résolveur de secours spécifié et les DTD bien connus préchargés.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) ou votre propre résolveur. |
| preloadedDtds | XmlKnownDtds | Les DTD bien connus qui doivent être préremplis dans le cache. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) constructor


Initialise une nouvelle instance de la classe [XmlPreloadedResolver](../) avec le résolveur de secours spécifié, les DTD bien connus préchargés, et le comparateur d’égalité d’URI.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds, const SharedPtr<Collections::Generic::IEqualityComparer<SharedPtr<Uri>>> &uriComparer)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) ou votre propre résolveur. |
| preloadedDtds | XmlKnownDtds | Les DTD bien connus qui doivent être préremplis dans le cache. |
| uriComparer | const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\& | L’implémentation de l’interface IEqualityComparer à utiliser lors de la comparaison des URI. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [IEqualityComparer](../../../system.collections.generic/iequalitycomparer/)
* Class [Uri](../../../system/uri/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds) constructor


Initialise une nouvelle instance de la classe [XmlPreloadedResolver](../) avec les DTD bien connus préchargés spécifiés.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds preloadedDtds)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| preloadedDtds | XmlKnownDtds | Les DTD bien connus qui doivent être préremplis dans le cache. |

## Voir aussi

* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
