---
title: "System::Xml::XmlValidatingReader::GetAttribute 方法"
linktitle: "GetAttribute"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlValidatingReader::GetAttribute 方法。返回具有指定索引的属性的值（C++）。"
type: docs
weight: 3200
url: /zh/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


返回具有指定索引的属性的值。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| i | int32_t | 属性的索引。索引从零开始。（第一个属性的索引为 0。） |

### ReturnValue

指定属性的值。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


返回具有指定本地名称和命名空间统一资源标识符（URI）的属性的值。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 属性的本地名称。 |
| namespaceURI | 字符串 | 属性的命名空间 URI。 |

### ReturnValue

指定属性的值。如果未找到该属性，则返回 **nullptr**。此方法不会移动读取器。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


返回具有指定名称的属性的值。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性的限定名称。 |

### ReturnValue

指定属性的值。如果未找到属性，则返回 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
