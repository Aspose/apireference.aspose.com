---
title: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator 构造函数"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator 构造函数。初始化 XmlSchemaValidator 类在 C++ 中的新实例。"
type: docs
weight: 100
url: /zh/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


初始化 [XmlSchemaValidator](../) 类的新实例。

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | 一个包含元素和属性名称的原子化字符串的 [XmlNameTable](../../../system.xml/xmlnametable/) 对象。 |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | 一个包含用于验证的 XML [Schema](../../) 定义语言 (XSD) 架构的 [XmlSchemaSet](../../xmlschemaset/) 对象。 |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | 一个用于解析验证期间遇到的命名空间的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |
| validationFlags | XmlSchemaValidationFlags | 一个指定模式验证选项的 [XmlSchemaValidationFlags](../../xmlschemavalidationflags/) 值。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
