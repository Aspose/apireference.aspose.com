---
title: "System::Xml::Schema::XmlSchemaSet::Schemas 方法"
linktitle: "架构"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaSet::Schemas 方法。 在 C++ 中返回 XmlSchemaSet 中所有 XML Schema 定义语言 (XSD) 架构的集合。"
type: docs
weight: 1600
url: /zh/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


返回 [XmlSchemaSet](../) 中所有 XML [Schema](../../) 定义语言 (XSD) 架构的集合。

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

一个 IList 对象，包含已添加到 [XmlSchemaSet](../) 的所有架构。如果未向 [XmlSchemaSet](../) 添加任何架构，则返回空集合。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Schemas(String) method


返回属于给定命名空间的 [XmlSchemaSet](../) 中所有 XML [Schema](../../) 定义语言 (XSD) 架构的集合。

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| targetNamespace | String | 架构的 **targetNamespace** 属性。 |

### ReturnValue

一个 IList 对象，包含已添加到 [XmlSchemaSet](../) 且属于给定命名空间的所有架构。如果未向 [XmlSchemaSet](../) 添加任何架构，则返回空集合。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
