---
title: "System::Xml::XmlReader::ReadToFollowing 方法"
linktitle: "ReadToFollowing"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlReader::ReadToFollowing 方法。读取直到在 C++ 中找到具有指定本地名称和命名空间 URI 的元素。"
type: docs
weight: 7200
url: /zh/cpp/system.xml/xmlreader/readtofollowing/
---
## XmlReader::ReadToFollowing(String, String) method


读取，直到找到具有指定本地名称和命名空间 URI 的元素。

```cpp
virtual bool System::Xml::XmlReader::ReadToFollowing(String localName, String namespaceURI)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| localName | 字符串 | 元素的本地名称。 |
| namespaceURI | 字符串 | 元素的命名空间 URI。 |

### ReturnValue

**true** if a matching element is found; otherwise **false** and the [XmlReader](../) is in an end of file state.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToFollowing(String) method


读取直到找到具有指定限定名称的元素。

```cpp
virtual bool System::Xml::XmlReader::ReadToFollowing(String name)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 元素的限定名称。 |

### ReturnValue

**true** if a matching element is found; otherwise **false** and the [XmlReader](../) is in an end of file state.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
