---
title: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver yapıcı"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page için C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver yapıcı. C++'ta XmlPreloadedResolver sınıfının yeni bir örneğini başlatır."
type: docs
weight: 100
url: /tr/cpp/system.xml.resolvers/xmlpreloadedresolver/xmlpreloadedresolver/
---
## XmlPreloadedResolver::XmlPreloadedResolver() constructor


[XmlPreloadedResolver](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver()
```

## Ayrıca Bakınız

* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&) constructor


Belirtilen yedek çözücü ile [XmlPreloadedResolver](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) veya kendi çözücünüz. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) constructor


Belirtilen yedek çözücü ve önceden yüklenmiş bilinen DTD'lerle [XmlPreloadedResolver](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) veya kendi çözücünüz. |
| preloadedDtds | XmlKnownDtds | Önbelleğe önceden doldurulması gereken bilinen DTD'ler. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) constructor


Belirtilen yedek çözücü, önceden yüklenmiş bilinen DTD'ler ve URI eşitlik karşılaştırıcısı ile [XmlPreloadedResolver](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds, const SharedPtr<Collections::Generic::IEqualityComparer<SharedPtr<Uri>>> &uriComparer)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) veya kendi çözücünüz. |
| preloadedDtds | XmlKnownDtds | Önbelleğe önceden doldurulması gereken bilinen DTD'ler. |
| uriComparer | const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\& | URI'leri karşılaştırırken kullanılacak IEqualityComparer arabiriminin uygulaması. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [IEqualityComparer](../../../system.collections.generic/iequalitycomparer/)
* Class [Uri](../../../system/uri/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds) constructor


Belirtilen önceden yüklenmiş bilinen DTD'lerle [XmlPreloadedResolver](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds preloadedDtds)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| preloadedDtds | XmlKnownDtds | Önbelleğe önceden doldurulması gereken bilinen DTD'ler. |

## Ayrıca Bakınız

* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
