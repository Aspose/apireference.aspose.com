---
title: "System::Xml::XmlNodeReader::GetAttribute 方法"
linktitle: "GetAttribute"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNodeReader::GetAttribute 方法。返回具有指定索引的属性的值（在 C++ 中）。"
type: docs
weight: 2400
url: /zh/cpp/system.xml/xmlnodereader/getattribute/
---
## XmlNodeReader::GetAttribute(int32_t) method


返回具有指定索引的属性的值。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(int32_t attributeIndex) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| attributeIndex | int32_t | 属性的索引。索引从零开始。（第一个属性的索引为 0。） |

### ReturnValue

指定属性的值。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::GetAttribute(String) method


返回具有指定名称的属性的值。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(String name) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性的限定名称。 |

### ReturnValue

指定属性的值。如果未找到属性，则返回 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::GetAttribute(String, String) method


返回具有指定本地名称和命名空间 URI 的属性的值。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(String name, String namespaceURI) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性的本地名称。 |
| namespaceURI | 字符串 | 属性的命名空间 URI。 |

### ReturnValue

指定属性的值。如果未找到属性，则返回 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
