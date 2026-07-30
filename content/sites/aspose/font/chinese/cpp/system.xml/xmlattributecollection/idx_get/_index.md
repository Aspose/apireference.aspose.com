---
title: "System::Xml::XmlAttributeCollection::idx_get 方法"
linktitle: "idx_get"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlAttributeCollection::idx_get 方法。在 C++ 中，返回具有指定本地名称和命名空间统一资源标识符（URI）的属性。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlattributecollection/idx_get/
---
## XmlAttributeCollection::idx_get(const String\&, const String\&) method


返回具有指定本地名称和命名空间统一资源标识符（URI）的属性。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(const String &localName, const String &namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | const String\& | 属性的本地名称。 |
| namespaceURI | const String\& | 属性的命名空间 URI。 |

### ReturnValue

具有指定本地名称和命名空间 URI 的属性。如果属性不存在，此方法返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlAttributeCollection::idx_get(const String\&) method


返回具有指定名称的属性。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(const String &name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | const String\& | 属性的限定名称。 |

### ReturnValue

具有指定名称的属性。如果属性不存在，此方法返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlAttributeCollection::idx_get(int32_t) method


返回具有指定索引的属性。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(int32_t i)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int32_t | 属性的索引。 |

### ReturnValue

指定索引处的属性。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
