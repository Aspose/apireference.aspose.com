---
title: "System::Xml::XmlReader::MoveToAttribute 方法"
linktitle: "MoveToAttribute"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlReader::MoveToAttribute 方法。当在派生类中重写时，移动到 C++ 中具有指定索引的属性。"
type: docs
weight: 3200
url: /zh/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


当在派生类中被重写时，移动到具有指定索引的属性。

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| i | int32_t | 属性的索引。 |

## 另见

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


当在派生类中重写时，移动到具有指定 [XmlReader::get_Name](../get_name/) 值的属性。

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性的限定名称。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


当在派生类中重写时，移动到具有指定 [XmlReader::get_LocalName](../get_localname/) 和 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 值的属性。

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | 字符串 | 属性的本地名称。 |
| ns | 字符串 | 属性的命名空间 URI。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
