---
title: "System::Xml::Schema::XmlSchema::Compile 方法"
linktitle: "Compile"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchema::Compile 方法。将 XML SchemaObject Model (SOM) 编译为用于验证的模式信息。用于检查以编程方式构建的 SOM 的语法和语义结构。语义验证检查在 C++ 编译期间执行。"
type: docs
weight: 200
url: /zh/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


将 XML [Schema](../../)[Object](../../../system/object/) Model (SOM) 编译为用于验证的模式信息。用于检查以编程方式构建的 SOM 的语法和语义结构。语义验证检查在编译期间执行。

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | 接收有关 XML [Schema](../../) 验证错误信息的验证事件处理程序。 |

## 另见

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


将 XML [Schema](../../)[Object](../../../system/object/) Model (SOM) 编译为用于验证的模式信息。用于检查以编程方式构建的 SOM 的语法和语义结构。语义验证检查在编译期间执行。

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | 接收有关 XML [Schema](../../) 验证错误信息的验证事件处理程序。 |
| resolver | const SharedPtr\<XmlResolver\>\& | 用于解析在 **include** 和 **import** 元素中引用的命名空间的 [XmlResolver](../../../system.xml/xmlresolver/)。 |

## 另见

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
