---
title: "System::Xml::XmlTextWriter::LookupPrefix 方法"
linktitle: "LookupPrefix"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlTextWriter::LookupPrefix 方法。返回在 C++ 中针对给定命名空间 URI 在当前命名空间作用域内定义的最近的前缀。"
type: docs
weight: 1300
url: /zh/cpp/system.xml/xmltextwriter/lookupprefix/
---
## XmlTextWriter::LookupPrefix method


返回在当前命名空间范围内为该命名空间 URI 定义的最近前缀。

```cpp
String System::Xml::XmlTextWriter::LookupPrefix(String ns) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ns | String | 要查找其前缀的命名空间 URI。 |

### ReturnValue

匹配的前缀。如果在当前作用域未找到匹配的命名空间 URI，则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
