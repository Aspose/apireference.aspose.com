---
title: "System::Xml::Resolvers::XmlPreloadedResolver::Add 方法"
linktitle: "Add"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::Add 方法。将字节数组添加到 XmlPreloadedResolver 存储并映射到 URI。如果存储中已存在相同 URI 的映射，则在 C++ 中覆盖现有映射。"
type: docs
weight: 200
url: /zh/cpp/system.xml.resolvers/xmlpreloadedresolver/add/
---
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) method


将字节数组添加到 [XmlPreloadedResolver](../) 存储并映射到 URI。如果存储中已存在相同 URI 的映射，则覆盖现有映射。

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 要添加到 [XmlPreloadedResolver](../) 存储的数据的 URI。 |
| value | const ArrayPtr\<uint8_t\>\& | 与提供的 URI 对应的数据的字节数组。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


将字节数组添加到 [XmlPreloadedResolver](../) 存储并映射到 URI。如果存储中已存在相同 URI 的映射，则覆盖现有映射。

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value, int32_t offset, int32_t count)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 要添加到 [XmlPreloadedResolver](../) 存储的数据的 URI。 |
| value | const ArrayPtr\<uint8_t\>\& | 与提供的 URI 对应的数据的字节数组。 |
| offset | int32_t | 提供的字节数组中数据开始的偏移量。 |
| count | int32_t | 从提供的偏移量开始，从字节数组读取的字节数。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) method


将 Stream 添加到 [XmlPreloadedResolver](../) 存储并映射到 URI。如果存储中已存在相同 URI 的映射，则覆盖现有映射。

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const SharedPtr<IO::Stream> &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 要添加到 [XmlPreloadedResolver](../) 存储的数据的 URI。 |
| value | const SharedPtr\<IO::Stream\>\& | 与提供的 URI 对应的数据的 Stream。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const String\&) method


将带有预加载数据的字符串添加到 [XmlPreloadedResolver](../) 存储并映射到 URI。如果存储中已存在相同 URI 的映射，则覆盖现有映射。

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const String &value)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 要添加到 [XmlPreloadedResolver](../) 存储的数据的 URI。 |
| value | const String\& | 一个与提供的 URI 对应数据的 [String](../../../system/string/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
