---
title: "System::Xml::XmlReader::ReadContentAs 方法"
linktitle: "ReadContentAs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::ReadContentAs 方法。将内容读取为 C++ 中指定类型的对象。"
type: docs
weight: 3900
url: /zh/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


将内容读取为指定类型的对象。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 要返回的值的类型。 |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 一个用于解析与类型转换相关的任何命名空间前缀的 [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) 对象。例如，在将 [XmlQualifiedName](../../xmlqualifiedname/) 对象转换为 **xs:string** 时可以使用它。该值可以为 **nullptr**。 |

### ReturnValue

连接后的文本内容或属性值，已转换为请求的类型。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
