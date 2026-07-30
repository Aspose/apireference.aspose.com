---
title: "System::Xml::XmlNode::idx_get 方法"
linktitle: "idx_get"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNode::idx_get 方法。返回在 C++ 中具有指定 XmlNode::get_LocalName 和 XmlNode::get_NamespaceURI 值的第一个子元素。"
type: docs
weight: 3000
url: /zh/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


返回具有指定 [XmlNode::get_LocalName](../get_localname/) 和 [XmlNode::get_NamespaceURI](../get_namespaceuri/) 值的第一个子元素。

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 本地名称 | String | 元素的本地名称。 |
| ns | String | 元素的命名空间 URI。 |

### ReturnValue

第一个具有匹配 **localname** 和 **ns** 的 [XmlElement](../../xmlelement/)。如果没有匹配项，则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::idx_get(String) method


返回具有指定 [XmlNode::get_Name](../get_name/) 的第一个子元素。

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 要检索的元素的限定名称。 |

### ReturnValue

第一个匹配指定名称的 [XmlElement](../../xmlelement/)。如果没有匹配项，则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
