---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue 方法"
linktitle: "ParseValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue 方法。当在派生类中重写时，验证指定的 string 是否符合 C++ 中的内置或用户定义的简单类型。"
type: docs
weight: 700
url: /zh/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


在派生类中重写时，验证指定的 **string** 是否符合内置或用户定义的简单类型。

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| s | String | 用于验证简单类型的 **string**。 |
| nameTable | SharedPtr\<XmlNameTable\> | 在解析 **string** 时用于原子化的 [XmlNameTable](../../../system.xml/xmlnametable/)，前提是此 [XmlSchemaDatatype](../) 对象表示 **xs:NCName** 类型。 |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | 在解析 **string** 时使用的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象，前提是此 [XmlSchemaDatatype](../) 对象表示 **xs:QName** 类型。 |

### ReturnValue

一个可以安全转换为 [XmlSchemaDatatype::get_ValueType](../get_valuetype/) 调用返回的类型的 [Object](../../../system/object/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
