---
title: "System::Xml::XmlValidatingReader::GetAttribute 方法"
linktitle: "GetAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader::GetAttribute 方法。返回具有指定索引的属性的值（在 C++ 中）。"
type: docs
weight: 3200
url: /zh/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


返回具有指定索引的属性的值。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int32_t | 属性的索引。索引从零开始。（第一个属性的索引为 0。） |

### ReturnValue

指定属性的值。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


返回具有指定本地名称和命名空间统一资源标识符 (URI) 的属性值。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

指定属性的值。如果未找到该属性，则返回 **nullptr**。此方法不会移动读取器。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


返回具有指定名称的属性的值。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的限定名称。 |

### ReturnValue

指定属性的值。如果未找到属性，则返回 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
