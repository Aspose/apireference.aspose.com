---
title: "System::Xml::Resolvers::XmlPreloadedResolver::Add method"
linktitle: "Add"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::Add 方法。向 XmlPreloadedResolver 存储添加字节数组并将其映射到 URI。如果存储中已经存在相同 URI 的映射，则在 C++ 中覆盖现有映射。"
type: docs
weight: 200
url: /zh/cpp/system.xml.resolvers/xmlpreloadedresolver/add/
---
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&) method


向 [XmlPreloadedResolver](../) 存储添加字节数组并将其映射到 URI。如果存储中已经存在相同 URI 的映射，则覆盖现有映射。

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 正在添加到 [XmlPreloadedResolver](../) 存储的数据的 URI。 |
| 值 | const ArrayPtr\<uint8_t\>\& | 与提供的 URI 对应的数据的字节数组。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


向 [XmlPreloadedResolver](../) 存储添加字节数组并将其映射到 URI。如果存储中已经存在相同 URI 的映射，则覆盖现有映射。

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const ArrayPtr<uint8_t> &value, int32_t offset, int32_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 正在添加到 [XmlPreloadedResolver](../) 存储的数据的 URI。 |
| 值 | const ArrayPtr\<uint8_t\>\& | 与提供的 URI 对应的数据的字节数组。 |
| offset | int32_t | 提供的字节数组中数据开始的偏移量。 |
| count | int32_t | 从字节数组中读取的字节数，从提供的偏移量开始。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const SharedPtr\<IO::Stream\>\&) method


向 [XmlPreloadedResolver](../) 存储添加 Stream 并将其映射到 URI。如果存储中已经存在相同 URI 的映射，则覆盖现有映射。

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const SharedPtr<IO::Stream> &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 正在添加到 [XmlPreloadedResolver](../) 存储的数据的 URI。 |
| 值 | const SharedPtr\<IO::Stream\>\& | 与提供的 URI 对应的数据的 Stream。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
## XmlPreloadedResolver::Add(const SharedPtr\<Uri\>\&, const String\&) method


向 [XmlPreloadedResolver](../) 存储添加带有预加载数据的字符串并将其映射到 URI。如果存储中已经存在相同 URI 的映射，则覆盖现有映射。

```cpp
void System::Xml::Resolvers::XmlPreloadedResolver::Add(const SharedPtr<Uri> &uri, const String &value)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 正在添加到 [XmlPreloadedResolver](../) 存储的数据的 URI。 |
| value | const String\& | 一个与提供的 URI 对应数据的 [String](../../../system/string/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Font for C++](../../../)
