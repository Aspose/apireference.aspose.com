---
title: "System::Xml::XmlNodeReader::MoveToAttribute 方法"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeReader::MoveToAttribute 方法。将指针移动到 C++ 中具有指定索引的属性。"
type: docs
weight: 2600
url: /zh/cpp/system.xml/xmlnodereader/movetoattribute/
---
## XmlNodeReader::MoveToAttribute(int32_t) method


移动到具有指定索引的属性。

```cpp
void System::Xml::XmlNodeReader::MoveToAttribute(int32_t attributeIndex) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| attributeIndex | int32_t | 属性的索引。 |

## 另见

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNodeReader::MoveToAttribute(String) method


移动到具有指定名称的属性。

```cpp
bool System::Xml::XmlNodeReader::MoveToAttribute(String name) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的限定名称。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNodeReader::MoveToAttribute(String, String) method


移动到具有指定本地名称和命名空间 URI 的属性。

```cpp
bool System::Xml::XmlNodeReader::MoveToAttribute(String name, String namespaceURI) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
