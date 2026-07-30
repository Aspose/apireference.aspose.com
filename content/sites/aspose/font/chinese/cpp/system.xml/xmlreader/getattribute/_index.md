---
title: "System::Xml::XmlReader::GetAttribute 方法"
linktitle: "GetAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::GetAttribute 方法。 当在派生类中被重写时，获取具有指定索引的属性值（C++）。"
type: docs
weight: 2800
url: /zh/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


当在派生类中被重写时，获取具有指定索引的属性的值。

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int32_t | 属性的索引。索引从零开始。（第一个属性的索引为 0。） |

### ReturnValue

指定属性的值。此方法不会移动读取器。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String) method


当在派生类中被重写时，获取具有指定 [XmlReader::get_Name](../get_name/) 值的属性值。

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的限定名称。 |

### ReturnValue

指定属性的值。如果未找到属性或其值为 [String::Empty](../../../system/string/empty/)，则返回 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String, String) method


当在派生类中被重写时，获取具有指定 [XmlReader::get_LocalName](../get_localname/) 和 [XmlReader::get_NamespaceURI](../get_namespaceuri/) 值的属性值。

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 属性的本地名称。 |
| namespaceURI | String | 属性的命名空间 URI。 |

### ReturnValue

指定属性的值。如果未找到属性或其值为 [String::Empty](../../../system/string/empty/)，则返回 **nullptr**。此方法不会移动读取器。

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
