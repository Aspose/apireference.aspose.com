---
title: "System::Xml::XmlWriter::LookupPrefix 方法"
linktitle: "LookupPrefix"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriter::LookupPrefix 方法。当在派生类中重写时，在 C++ 中返回当前命名空间作用域中为该命名空间 URI 定义的最近前缀。"
type: docs
weight: 800
url: /zh/cpp/system.xml/xmlwriter/lookupprefix/
---
## XmlWriter::LookupPrefix method


在派生类中重写时，返回在当前命名空间作用域中为该命名空间 URI 定义的最近前缀。

```cpp
virtual String System::Xml::XmlWriter::LookupPrefix(String ns)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| ns | String | 您想要查找前缀的命名空间 URI。 |

### ReturnValue

匹配的前缀，若在当前作用域未找到匹配的命名空间 URI，则为 **nullptr**。

## 另见

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
