---
title: "System::Xml::XmlSecureResolver::ResolveUri 方法"
linktitle: "ResolveUri"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlSecureResolver::ResolveUri 方法。通过在 C++ 中调用底层 XmlResolver 的 ResolveUri 来解析基 URI 和相对 URI 的绝对 URI。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


通过在底层 [XmlResolver](../../xmlresolver/) 上调用 **ResolveUri** 来解析基 URI 和相对 URI 的绝对 URI。

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 用于解析相对 URI 的基 URI。 |
| relativeUri | 字符串 | 要解析的 URI。该 URI 可以是绝对的或相对的。如果是绝对的，则此值会有效地替换 **baseUri** 的值。如果是相对的，则它会与 **baseUri** 组合生成绝对 URI。 |

### ReturnValue

如果相对 URI 无法解析，则返回绝对 URI 或 **nullptr**（通过在底层 [XmlResolver](../../xmlresolver/) 上调用 **ResolveUri** 返回）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
