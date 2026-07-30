---
title: "System::Xml::XmlTextReader::MoveToAttribute 方法"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextReader::MoveToAttribute 方法。在 C++ 中移动到具有指定索引的属性。"
type: docs
weight: 3800
url: /zh/cpp/system.xml/xmltextreader/movetoattribute/
---
## XmlTextReader::MoveToAttribute(int32_t) method


移动到具有指定索引的属性。

```cpp
void System::Xml::XmlTextReader::MoveToAttribute(int32_t i) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int32_t | 属性的索引。 |

## 另见

* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::MoveToAttribute(String, String) method


移动到具有指定本地名称和命名空间 URI 的属性。

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String localName, String namespaceURI) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextReader::MoveToAttribute(String) method


移动到具有指定名称的属性。

```cpp
bool System::Xml::XmlTextReader::MoveToAttribute(String name) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的限定名称。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
