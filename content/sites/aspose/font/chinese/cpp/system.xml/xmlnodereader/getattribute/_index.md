---
title: "System::Xml::XmlNodeReader::GetAttribute method"
linktitle: "GetAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeReader::GetAttribute 方法。返回 C++ 中指定索引的属性值。"
type: docs
weight: 2400
url: /zh/cpp/system.xml/xmlnodereader/getattribute/
---
## XmlNodeReader::GetAttribute(int32_t) method


返回具有指定索引的属性的值。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(int32_t attributeIndex) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| attributeIndex | int32_t | 属性的索引。索引从零开始。（第一个属性的索引为 0。） |

### ReturnValue

指定属性的值。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNodeReader::GetAttribute(String) method


返回具有指定名称的属性的值。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(String name) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的限定名称。 |

### ReturnValue

指定属性的值。如果未找到属性，则返回 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNodeReader::GetAttribute(String, String) method


返回具有指定本地名称和命名空间 URI 的属性的值。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(String name, String namespaceURI) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

指定属性的值。如果未找到属性，则返回 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
