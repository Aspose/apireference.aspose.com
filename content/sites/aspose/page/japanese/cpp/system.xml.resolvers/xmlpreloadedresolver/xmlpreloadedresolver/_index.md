---
title: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver コンストラクタ"
linktitle: "XmlPreloadedResolver"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver コンストラクタ。C++ で XmlPreloadedResolver クラスの新しいインスタンスを初期化します。"
type: docs
weight: 100
url: /ja/cpp/system.xml.resolvers/xmlpreloadedresolver/xmlpreloadedresolver/
---
## XmlPreloadedResolver::XmlPreloadedResolver() constructor


[XmlPreloadedResolver](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver()
```

## 参照

* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&) constructor


指定されたフォールバックリゾルバを使用して、[XmlPreloadedResolver](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) または独自のリゾルバ。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds) constructor


指定されたフォールバックリゾルバと事前にロードされた既知の DTD を使用して、[XmlPreloadedResolver](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) または独自のリゾルバ。 |
| preloadedDtds | XmlKnownDtds | キャッシュに事前に格納すべき既知の DTD。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr\<XmlResolver\>\&, XmlKnownDtds, const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\&) constructor


指定されたフォールバックリゾルバ、事前にロードされた既知の DTD、そして URI 等価比較子を使用して、[XmlPreloadedResolver](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(const SharedPtr<XmlResolver> &fallbackResolver, XmlKnownDtds preloadedDtds, const SharedPtr<Collections::Generic::IEqualityComparer<SharedPtr<Uri>>> &uriComparer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fallbackResolver | const SharedPtr\<XmlResolver\>\& | [XmlResolver](../../../system.xml/xmlresolver/) または独自のリゾルバ。 |
| preloadedDtds | XmlKnownDtds | キャッシュに事前に格納すべき既知の DTD。 |
| uriComparer | const SharedPtr\<Collections::Generic::IEqualityComparer\<SharedPtr\<Uri\>\>\>\& | URI を比較するときに使用する IEqualityComparer インターフェイスの実装。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [IEqualityComparer](../../../system.collections.generic/iequalitycomparer/)
* Class [Uri](../../../system/uri/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds) constructor


指定された事前にロードされた既知の DTD を使用して、[XmlPreloadedResolver](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::Resolvers::XmlPreloadedResolver::XmlPreloadedResolver(XmlKnownDtds preloadedDtds)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| preloadedDtds | XmlKnownDtds | キャッシュに事前に格納すべき既知の DTD。 |

## 参照

* Enum [XmlKnownDtds](../../xmlknowndtds/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
