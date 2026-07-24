---
title: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver 构造函数"
linktitle: "XmlPreloadedResolver"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver 构造函数。初始化 XmlPreloadedResolver 类的一个新实例（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.xml.resolvers/xmlpreloadedresolver/xmlpreloadedresolver/
---
## XmlPreloadedResolver::XmlPreloadedResolver() constructor


初始化 [XmlPreloadedResolver](../) 类的新实例。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver()
```

## 另见

* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&) constructor


使用指定的回退解析器初始化 [XmlPreloadedResolver](../) 类的新实例。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | 该 [XmlResolver](../../../system.xml/xmlresolver/) 或您自己的解析器。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) constructor


使用指定的回退解析器和预加载的已知 DTD 初始化 [XmlPreloadedResolver](../) 类的新实例。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | 该 [XmlResolver](../../../system.xml/xmlresolver/) 或您自己的解析器。 |
| preloadedDtds | XmlKnownDtds | 应预先填充到缓存中的已知 DTD。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) constructor


使用指定的回退解析器、预加载的已知 DTD 以及 URI 相等比较器初始化 [XmlPreloadedResolver](../) 类的新实例。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds, const SharedPtr<Collections::Generic::IEqualityComparer<SharedPtr<Uri>>> &uriComparer)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | 该 [XmlResolver](../../../system.xml/xmlresolver/) 或您自己的解析器。 |
| preloadedDtds | XmlKnownDtds | 应预先填充到缓存中的已知 DTD。 |
| uriComparer | const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\& | 在比较 URI 时使用的 IEqualityComparer 接口的实现。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [IEqualityComparer](../../../system.collections.generic/iequalitycomparer/)
* Class [Uri](../../../system/uri/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds) constructor


使用指定的预加载已知 DTD 初始化 [XmlPreloadedResolver](../) 类的新实例。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds preloadedDtds)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| preloadedDtds | XmlKnownDtds | 应预先填充到缓存中的已知 DTD。 |

## 另见

* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
