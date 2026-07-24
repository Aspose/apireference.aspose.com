---
title: "System::Xml::Xsl::XsltArgumentList::GetParam メソッド"
linktitle: "GetParam"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltArgumentList::GetParam メソッド。C++ で名前空間で修飾された名前に関連付けられたパラメータを返します。"
type: docs
weight: 600
url: /ja/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


名前空間修飾名に関連付けられたパラメータを返します。

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | パラメータの名前です。 [XsltArgumentList](../) は、渡された名前が有効なローカル名であるかをチェックしませんが、名前は **nullptr** にできません。 |
| namespaceUri | const String\& | パラメータに関連付けられた名前空間 URI。 |

### ReturnValue

パラメータオブジェクト、または見つからなかった場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
