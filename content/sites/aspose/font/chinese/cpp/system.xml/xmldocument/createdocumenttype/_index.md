---
title: "System::Xml::XmlDocument::CreateDocumentType 方法"
linktitle: "CreateDocumentType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocument::CreateDocumentType 方法。返回一个新的 XmlDocumentType 对象（C++）。"
type: docs
weight: 700
url: /zh/cpp/system.xml/xmldocument/createdocumenttype/
---
## XmlDocument::CreateDocumentType method


返回一个新的 [XmlDocumentType](../../xmldocumenttype/) 对象。

```cpp
virtual SharedPtr<XmlDocumentType> System::Xml::XmlDocument::CreateDocumentType(const String &name, const String &publicId, const String &systemId, const String &internalSubset)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | const String\& | 文档类型的名称。 |
| publicId | const String\& | 文档类型的公共标识符或 **nullptr**。您可以指定公共 URI 并且还可以指定系统标识符以标识外部 DTD 子集的位置。 |
| systemId | const String\& | 文档类型的系统标识符或 **nullptr**。指定外部 DTD 子集文件位置的 URL。 |
| internalSubset | const String\& | 文档类型的 DTD 内部子集或 **nullptr**。 |

### ReturnValue

新的 [XmlDocumentType](../../xmldocumenttype/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDocumentType](../../xmldocumenttype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
