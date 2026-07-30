---
title: "System::Xml::XmlDocument::CreateAttribute 方法"
linktitle: "CreateAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocument::CreateAttribute 方法。 在 C++ 中创建具有指定名称的 XmlAttribute。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


使用指定的名称创建一个 [XmlAttribute](../../xmlattribute/)。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| name | const String\& | 属性的限定名称。如果名称包含冒号，[XmlNode::get_Prefix](../../xmlnode/get_prefix/) 的值表示冒号前的部分，而 [XmlDocument::get_LocalName](../get_localname/) 的值表示冒号后的部分。[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 保持为空，除非前缀是已识别的内置前缀，如 **xmlns**。在这种情况下，get_NamespaceURI 的值为 [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/)。 |

### ReturnValue

新的 [XmlAttribute](../../xmlattribute/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


使用指定的 [XmlNode::get_Prefix](../../xmlnode/get_prefix/)、[XmlDocument::get_LocalName](../get_localname/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 创建一个 [XmlAttribute](../../xmlattribute/)。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| prefix | const String\& | 属性的前缀（如果有）。[String::Empty](../../../system/string/empty/) 与 **nullptr** 等价。 |
| localName | const String\& | 属性的本地名称。 |
| namespaceURI | const String\& | 属性的命名空间 URI（如果有）。[String::Empty](../../../system/string/empty/) 与 **nullptr** 等价。如果 **prefix** 为 **xmlns**，则此参数必须是 [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;)，否则将抛出异常。 |

### ReturnValue

新的 [XmlAttribute](../../xmlattribute/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


使用指定的限定名称和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 创建一个 [XmlAttribute](../../xmlattribute/)。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| qualifiedName | const String\& | 属性的限定名称。如果名称包含冒号，则 [XmlNode::get_Prefix](../../xmlnode/get_prefix/) 的值将显示冒号前的部分，而 [XmlDocument::get_LocalName](../get_localname/) 的值将显示冒号后的部分。 |
| namespaceURI | const String\& | 属性的 namespaceURI。如果限定名称包含前缀 **xmlns**，则此参数必须是 [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/)。 |

### ReturnValue

新的 [XmlAttribute](../../xmlattribute/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
