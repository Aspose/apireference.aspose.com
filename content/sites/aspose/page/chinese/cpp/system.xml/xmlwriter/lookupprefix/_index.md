---
title: "System::Xml::XmlWriter::LookupPrefix 方法"
linktitle: "LookupPrefix"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlWriter::LookupPrefix 方法。 当在派生类中被重写时，返回当前命名空间作用域中为该命名空间 URI 定义的最近前缀，以 C++ 实现。"
type: docs
weight: 800
url: /zh/cpp/system.xml/xmlwriter/lookupprefix/
---
## XmlWriter::LookupPrefix method


当在派生类中被重写时，返回在当前命名空间范围内为该命名空间 URI 定义的最近前缀。

```cpp
virtual String System::Xml::XmlWriter::LookupPrefix(String ns)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ns | 字符串 | 您想要查找前缀的命名空间 URI。 |

### ReturnValue

如果在当前作用域未找到匹配的命名空间 URI，则返回匹配的前缀或 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
