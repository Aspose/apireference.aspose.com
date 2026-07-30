---
title: "System::Xml::XmlElement::GetAttribute 方法"
linktitle: "GetAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement::GetAttribute 方法。返回具有指定本地名称和命名空间 URI 的属性值（C++）。"
type: docs
weight: 1300
url: /zh/cpp/system.xml/xmlelement/getattribute/
---
## XmlElement::GetAttribute(String, String) method


返回具有指定本地名称和命名空间 URI 的属性的值。

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 要检索的属性的本地名称。 |
| namespaceURI | String | 要检索的属性的命名空间 URI。 |

### ReturnValue

指定属性的值。如果未找到匹配的属性，或属性没有指定的或默认的值，则返回空字符串。

## 另见

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetAttribute(String) method


返回具有指定名称的属性的值。

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 要检索的属性的名称。这是一个限定名称。它会与匹配节点的 **get_Name** 值进行匹配。 |

### ReturnValue

指定属性的值。如果未找到匹配的属性，或属性没有指定的或默认的值，则返回空字符串。

## 另见

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
