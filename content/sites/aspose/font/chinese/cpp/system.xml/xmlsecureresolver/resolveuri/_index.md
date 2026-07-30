---
title: "System::Xml::XmlSecureResolver::ResolveUri 方法"
linktitle: "ResolveUri"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlSecureResolver::ResolveUri 方法。通过在 C++ 中对底层 XmlResolver 调用 ResolveUri，解析基 URI 和相对 URI 的绝对 URI。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


通过在底层 [XmlResolver](../../xmlresolver/) 上调用 **ResolveUri**，解析基 URI 和相对 URI 的绝对 URI。

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 用于解析相对 URI 的基 URI。 |
| relativeUri | String | 要解析的 URI。该 URI 可以是绝对的或相对的。如果是绝对的，则此值会有效地替代 **baseUri** 的值。如果是相对的，则它会与 **baseUri** 组合生成绝对 URI。 |

### ReturnValue

如果相对 URI 无法解析，则返回绝对 URI 或 **nullptr**（通过在底层 [XmlResolver](../../xmlresolver/) 上调用 **ResolveUri** 返回）。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
