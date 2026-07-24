---
title: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator constructor"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator 构造函数。初始化 C++ 中的 XmlSchemaValidator 类的新实例。"
type: docs
weight: 100
url: /zh/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


初始化 [XmlSchemaValidator](../) 类的新实例。

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | 一个 [XmlNameTable](../../../system.xml/xmlnametable/) 对象，包含作为原子字符串的元素和属性名称。 |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | 一个 [XmlSchemaSet](../../xmlschemaset/) 对象，包含用于验证的 XML [Schema](../../) 定义语言 (XSD) 架构。 |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | 一个 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象，用于解析验证期间遇到的命名空间。 |
| validationFlags | XmlSchemaValidationFlags | 一个 [XmlSchemaValidationFlags](../../xmlschemavalidationflags/) 值，指定模式验证选项。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
