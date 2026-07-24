---
title: "System::Xml::XmlResolver::ResolveUri 方法"
linktitle: "ResolveUri"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlResolver::ResolveUri 方法。若在派生类中重写，则在 C++ 中根据基 URI 和相对 URI 解析出绝对 URI。"
type: docs
weight: 200
url: /zh/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


当在派生类中重写时，从基 URI 和相对 URI 解析出绝对 URI。

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 用于解析相对 URI 的基 URI。 |
| relativeUri | 字符串 | 要解析的 URI。该 URI 可以是绝对的或相对的。如果是绝对的，则此值会有效地替换 **baseUri** 的值。如果是相对的，则它会与 **baseUri** 组合生成绝对 URI。 |

### ReturnValue

绝对 URI，若相对 URI 无法解析则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
