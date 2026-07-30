---
title: "System::Xml::XmlDocument::CreateXmlDeclaration 方法"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocument::CreateXmlDeclaration 方法。创建具有指定值的 XmlDeclaration 节点（在 C++ 中）。"
type: docs
weight: 1600
url: /zh/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


创建具有指定值的 [XmlDeclaration](../../xmldeclaration/) 节点。

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 版本 | const String\& | 版本必须为 "1.0"。 |
| encoding | const String\& | encoding 属性的值。此编码在将 [XmlDocument](../) 保存到文件或流时使用；因此，它必须设置为由 [Text::Encoding](../../../system.text/encoding/) 类支持的字符串，否则 \"XmlDocument::Save(String)\" 将失败。如果此值为 **nullptr** 或 [String::Empty](../../../system/string/empty/)，则 [XmlDocument::Save](../save/) 方法不会在 XML 声明上写入 encoding 属性，因而使用默认编码 UTF-8。 |
| standalone | const String\& | 该值必须是 \"yes\" 或 \"no\" 之一。如果此值为 **nullptr** 或 [String::Empty](../../../system/string/empty/)，则 [XmlDocument::Save](../save/) 方法不会在 XML 声明上写入 standalone 属性。 |

### ReturnValue

新的 [XmlDeclaration](../../xmldeclaration/) 节点。
## 备注



注意：如果将 [XmlDocument](../) 保存到 TextWriter 或 [XmlTextWriter](../../xmltextwriter/) 中，则此 encoding 值会被丢弃。相反，将使用 TextWriter 或 [XmlTextWriter](../../xmltextwriter/) 的编码。这确保写出的 XML 可以使用正确的编码读取回来。
## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
