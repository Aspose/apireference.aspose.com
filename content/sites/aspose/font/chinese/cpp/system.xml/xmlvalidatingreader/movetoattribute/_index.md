---
title: "System::Xml::XmlValidatingReader::MoveToAttribute 方法"
linktitle: "MoveToAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlValidatingReader::MoveToAttribute 方法。移动到 C++ 中具有指定索引的属性。"
type: docs
weight: 3500
url: /zh/cpp/system.xml/xmlvalidatingreader/movetoattribute/
---
## XmlValidatingReader::MoveToAttribute(int32_t) method


移动到具有指定索引的属性。

```cpp
void System::Xml::XmlValidatingReader::MoveToAttribute(int32_t i) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int32_t | 属性的索引。 |

## 另见

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::MoveToAttribute(String, String) method


移动到具有指定本地名称和命名空间统一资源标识符 (URI) 的属性。

```cpp
bool System::Xml::XmlValidatingReader::MoveToAttribute(String localName, String namespaceURI) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the position of the reader does not change.

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::MoveToAttribute(String) method


移动到具有指定名称的属性。

```cpp
bool System::Xml::XmlValidatingReader::MoveToAttribute(String name) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的限定名称。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the position of the reader does not change.

## 另见

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
