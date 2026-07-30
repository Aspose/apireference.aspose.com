---
title: "System::Xml::XmlElement::HasAttribute 方法"
linktitle: "HasAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement::HasAttribute 方法。确定当前节点是否具有具有指定本地名称和命名空间 URI 的属性（C++）。"
type: docs
weight: 1600
url: /zh/cpp/system.xml/xmlelement/hasattribute/
---
## XmlElement::HasAttribute(String, String) method


确定当前节点是否具有具有指定本地名称和命名空间 URI 的属性。

```cpp
virtual bool System::Xml::XmlElement::HasAttribute(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 要查找的属性的本地名称。 |
| namespaceURI | String | 要查找的属性的命名空间 URI。 |

### ReturnValue

**true** if the current node has the specified attribute; otherwise, **false**.

## 另见

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::HasAttribute(String) method


确定当前节点是否具有具有指定名称的属性。

```cpp
virtual bool System::Xml::XmlElement::HasAttribute(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 要查找的属性的名称。这是一个限定名称。它会与匹配节点的 **get_Name** 值进行匹配。 |

### ReturnValue

**true** if the current node has the specified attribute; otherwise, **false**.

## 另见

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
