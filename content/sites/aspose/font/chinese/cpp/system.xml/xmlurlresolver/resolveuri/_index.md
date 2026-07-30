---
title: "System::Xml::XmlUrlResolver::ResolveUri 方法"
linktitle: "ResolveUri"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlUrlResolver::ResolveUri 方法。解析基 URI 和相对 URI 合成的绝对 URI（在 C++ 中）。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


从基准 URI 和相对 URI 解析出绝对 URI。

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 用于解析相对 URI 的基 URI。 |
| relativeUri | String | 要解析的 URI。该 URI 可以是绝对的或相对的。如果是绝对的，则此值会有效地替代 **baseUri** 的值。如果是相对的，则它会与 **baseUri** 组合生成绝对 URI。 |

### ReturnValue

绝对 URI，或者如果相对 URI 无法解析则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
