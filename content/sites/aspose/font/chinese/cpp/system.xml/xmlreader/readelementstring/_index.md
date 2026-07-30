---
title: "System::Xml::XmlReader::ReadElementString 方法"
linktitle: "ReadElementString"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::ReadElementString 方法。读取仅包含文本的元素。但是，建议改用 XmlReader::ReadElementContentAsString 方法，因为它提供了更直接的方式来处理此操作（C++）。"
type: docs
weight: 6400
url: /zh/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


读取仅文本元素。不过，建议改用 [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) 方法，因为它提供了更直接的方式来处理此操作。

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

读取的元素中包含的文本。如果元素为空，则返回空字符串。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String, String) method


在读取仅文本元素之前，检查找到的元素的 [XmlReader::get_LocalName](../get_localname/) 和 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 值是否匹配给定的字符串。不过，建议改用 [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) 方法，因为它提供了更直接的方式来处理此操作。

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 本地名称 | String | 要检查的本地名称。 |
| ns | String | 要检查的命名空间 URI。 |

### ReturnValue

读取的元素中包含的文本。如果元素为空，则返回空字符串。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementString(String) method


在读取仅文本元素之前，检查找到的元素的 [XmlReader::get_Name](../get_name/) 值是否匹配给定的字符串。不过，建议改用 [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) 方法，因为它提供了更直接的方式来处理此操作。

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 要检查的名称。 |

### ReturnValue

读取的元素中包含的文本。如果元素为空，则返回空字符串。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
