---
title: "منشئ System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver. يهيئ نسخة جديدة من فئة XmlPreloadedResolver في C++."
type: docs
weight: 100
url: /ar/cpp/system.xml.resolvers/xmlpreloadedresolver/xmlpreloadedresolver/
---
## XmlPreloadedResolver::XmlPreloadedResolver() constructor


يهيئ نسخة جديدة من الفئة [XmlPreloadedResolver](../).

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver()
```

## انظر أيضًا

* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&) constructor


يهيئ نسخة جديدة من الفئة [XmlPreloadedResolver](../) مع محلل التراجع المحدد.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) أو محللك الخاص. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) constructor


يهيئ نسخة جديدة من الفئة [XmlPreloadedResolver](../) مع محلل التراجع المحدد و DTDs المعروفة المحملة مسبقًا.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) أو محللك الخاص. |
| preloadedDtds | XmlKnownDtds | DTD المعروفة التي يجب تعبئتها مسبقًا في الذاكرة المؤقتة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) constructor


يهيئ نسخة جديدة من الفئة [XmlPreloadedResolver](../) مع محلل التراجع المحدد، و DTDs المعروفة المحملة مسبقًا، ومقارن مساواة الـ URI.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds, const SharedPtr<Collections::Generic::IEqualityComparer<SharedPtr<Uri>>> &uriComparer)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | الـ [XmlResolver](../../../system.xml/xmlresolver/) أو محللك الخاص. |
| preloadedDtds | XmlKnownDtds | DTD المعروفة التي يجب تعبئتها مسبقًا في الذاكرة المؤقتة. |
| uriComparer | const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\& | تنفيذ واجهة IEqualityComparer لاستخدامها عند مقارنة عناوين الـ URI. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [IEqualityComparer](../../../system.collections.generic/iequalitycomparer/)
* Class [Uri](../../../system/uri/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds) constructor


يهيئ نسخة جديدة من الفئة [XmlPreloadedResolver](../) مع DTDs المعروفة المحملة مسبقًا المحددة.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds preloadedDtds)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| preloadedDtds | XmlKnownDtds | DTD المعروفة التي يجب تعبئتها مسبقًا في الذاكرة المؤقتة. |

## انظر أيضًا

* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
