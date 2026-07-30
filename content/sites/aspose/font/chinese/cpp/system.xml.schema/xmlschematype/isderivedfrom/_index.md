---
title: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom 方法"
linktitle: "IsDerivedFrom"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaType::IsDerivedFrom 方法。返回一个值，指示在 C++ 中指定的派生模式类型是否从指定的基模式类型派生。"
type: docs
weight: 1700
url: /zh/cpp/system.xml.schema/xmlschematype/isderivedfrom/
---
## XmlSchemaType::IsDerivedFrom method


返回一个值，指示指定的派生模式类型是否从指定的基模式类型派生。

```cpp
static bool System::Xml::Schema::XmlSchemaType::IsDerivedFrom(SharedPtr<XmlSchemaType> derivedType, const SharedPtr<XmlSchemaType> &baseType, XmlSchemaDerivationMethod except)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| derivedType | SharedPtr\<XmlSchemaType\> | 要测试的派生 [XmlSchemaType](../)。 |
| baseType | const SharedPtr\<XmlSchemaType\>\& | 用于与派生 [XmlSchemaType](../) 进行比较的基 [XmlSchemaType](../)。 |
| except | XmlSchemaDerivationMethod | [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/) 值之一，表示要从测试中排除的类型派生方法。 |

### ReturnValue

**true** if the derived type is derived from the base type; otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaType](../)
* Enum [XmlSchemaDerivationMethod](../../xmlschemaderivationmethod/)
* Class [XmlSchemaType](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
