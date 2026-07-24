---
title: "System::Xml::XmlDocument::CreateElement 方法"
linktitle: "CreateElement"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlDocument::CreateElement 方法。在 C++ 中使用指定的名称创建元素。"
type: docs
weight: 800
url: /zh/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


创建具有指定名称的元素。

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | const String\& | 元素的限定名称。如果名称包含冒号，则 [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 的值表示冒号前的部分，而 [XmlDocument::get_LocalName](../get_localname/) 的值表示冒号后的部分。限定名称不能包含 **xmlns** 前缀。 |

### ReturnValue

新的 [XmlElement](../../xmlelement/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


使用指定的 [XmlNode::get_Prefix](../../xmlnode/get_prefix/)、[XmlDocument::get_LocalName](../get_localname/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 创建元素。

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| prefix | const String\& | 新元素的前缀（如果有）。[String::Empty](../../../system/string/empty/) 与 **nullptr** 等价。 |
| localName | const String\& | 新元素的本地名称。 |
| namespaceURI | const String\& | 新元素的命名空间 URI（如果有）。[String::Empty](../../../system/string/empty/) 和 **nullptr** 等价。 |

### ReturnValue

新的 [XmlElement](../../xmlelement/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


创建一个带有限定名称并使用 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 的 [XmlElement](../../xmlelement/)。

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| qualifiedName | const String\& | 元素的限定名称。如果名称包含冒号，则 [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 的值将反映冒号前的部分，而 [XmlDocument::get_LocalName](../get_localname/) 的值将反映冒号后的部分。限定名称不能包含 **xmlns** 前缀。 |
| namespaceURI | const String\& | 元素的命名空间 URI。 |

### ReturnValue

新的 [XmlElement](../../xmlelement/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
