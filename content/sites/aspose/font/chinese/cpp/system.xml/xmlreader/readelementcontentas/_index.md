---
title: "System::Xml::XmlReader::ReadElementContentAs 方法"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::ReadElementContentAs 方法。读取元素内容为请求的类型（C++）。"
type: docs
weight: 5200
url: /zh/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


读取元素内容为请求的类型。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 要返回的值的类型。 |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 一个用于解析与类型转换相关的任何命名空间前缀的 [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) 对象。 |

### ReturnValue

将元素内容转换为请求的类型对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


检查指定的本地名称和命名空间 URI 是否与当前元素匹配，然后读取元素内容为请求的类型。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 要返回的值的类型。 |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 一个用于解析与类型转换相关的任何命名空间前缀的 [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) 对象。 |
| localName | String | 元素的本地名称。 |
| namespaceURI | String | 元素的命名空间 URI。 |

### ReturnValue

将元素内容转换为请求的类型对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
