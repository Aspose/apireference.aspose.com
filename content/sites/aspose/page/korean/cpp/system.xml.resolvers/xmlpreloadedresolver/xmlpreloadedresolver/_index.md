---
title: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver 생성자"
linktitle: "XmlPreloadedResolver"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver 생성자. C++에서 XmlPreloadedResolver 클래스의 새 인스턴스를 초기화합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml.resolvers/xmlpreloadedresolver/xmlpreloadedresolver/
---
## XmlPreloadedResolver::XmlPreloadedResolver() constructor


[XmlPreloadedResolver](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver()
```

## 또 보기

* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&) constructor


지정된 대체 해결자를 사용하여 [XmlPreloadedResolver](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) 또는 사용자 정의 해결자. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) constructor


지정된 대체 해결자와 미리 로드된 알려진 DTD를 사용하여 [XmlPreloadedResolver](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) 또는 사용자 정의 해결자. |
| preloadedDtds | XmlKnownDtds | 캐시에 미리 채워야 할 알려진 DTD들. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) constructor


지정된 대체 해결자, 미리 로드된 알려진 DTD, 그리고 URI 동등성 비교기를 사용하여 [XmlPreloadedResolver](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds, const SharedPtr<Collections::Generic::IEqualityComparer<SharedPtr<Uri>>> &uriComparer)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) 또는 사용자 정의 해결자. |
| preloadedDtds | XmlKnownDtds | 캐시에 미리 채워야 할 알려진 DTD들. |
| uriComparer | const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\& | URI를 비교할 때 사용할 IEqualityComparer 인터페이스의 구현입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [IEqualityComparer](../../../system.collections.generic/iequalitycomparer/)
* Class [Uri](../../../system/uri/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds) constructor


지정된 미리 로드된 알려진 DTD를 사용하여 [XmlPreloadedResolver](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds preloadedDtds)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| preloadedDtds | XmlKnownDtds | 캐시에 미리 채워야 할 알려진 DTD들. |

## 또 보기

* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
