---
title: "System::Xml::Xsl::XsltArgumentList::RemoveParam 方法"
linktitle: "RemoveParam"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XsltArgumentList::RemoveParam 方法。 在 C++ 中从 XsltArgumentList 中移除参数。"
type: docs
weight: 800
url: /zh/cpp/system.xml.xsl/xsltargumentlist/removeparam/
---
## XsltArgumentList::RemoveParam method


从 [XsltArgumentList](../) 中移除参数。

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::RemoveParam(const String &name, const String &namespaceUri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| name | const String\& | 要移除的参数名称。 [XsltArgumentList](../) 不会检查传入的名称是否为有效的本地名称；但名称不能为 **nullptr**。 |
| namespaceUri | const String\& | 要移除的参数的命名空间 URI。 |

### ReturnValue

参数对象，若未找到则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
