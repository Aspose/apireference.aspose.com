---
title: "System::Xml::XmlDeclaration::get_Encoding 方法"
linktitle: "get_Encoding"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDeclaration::get_Encoding 方法。返回 C++ 中 XML 文档的编码级别。"
type: docs
weight: 200
url: /zh/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


返回 XML 文档的编码级别。

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

有效的字符编码名称。
## 备注



XML 最常支持的字符编码名称如下： |||
|-|-|
| 类别 | 编码名称 |
| Unicode | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n（其中 "n" 是 1 到 9 的数字） |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

此值是可选的。如果未设置值，此方法返回 [String::Empty](../../../system/string/empty/)。如果未包含 encoding 属性，则在写入或保存文档时假定使用 UTF-8 编码。
## 另见

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
