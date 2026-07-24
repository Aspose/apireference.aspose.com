---
title: "System::Xml::XmlUrlResolver::ResolveUri 方法"
linktitle: "ResolveUri"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlUrlResolver::ResolveUri 方法。解析基 URI 和相对 URI 在 C++ 中的绝对 URI。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


从基准 URI 和相对 URI 解析出绝对 URI。

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
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
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
