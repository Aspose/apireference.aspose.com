---
title: "System::Xml::Xsl::XsltArgumentList::GetParam 方法"
linktitle: "GetParam"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Xsl::XsltArgumentList::GetParam 方法。在 C++ 中返回与命名空间限定名称关联的参数。"
type: docs
weight: 600
url: /zh/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


返回与命名空间限定名称关联的参数。

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| name | const String\& | 参数的名称。 [XsltArgumentList](../) 不会检查传入的名称是否为有效的本地名称；但是，名称不能为 **nullptr**。 |
| namespaceUri | const String\& | 与参数关联的命名空间 URI。 |

### ReturnValue

参数对象，若未找到则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
