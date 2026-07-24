---
title: "System::Xml::Xsl::XsltArgumentList::RemoveParam メソッド"
linktitle: "RemoveParam"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltArgumentList::RemoveParam メソッド。C++ で XsltArgumentList からパラメータを削除します。"
type: docs
weight: 800
url: /ja/cpp/system.xml.xsl/xsltargumentlist/removeparam/
---
## XsltArgumentList::RemoveParam method


[XsltArgumentList](../) からパラメータを削除します。

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::RemoveParam(const String &name, const String &namespaceUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | 削除するパラメータの名前。[XsltArgumentList](../) は、渡された名前が有効なローカル名であるかをチェックしませんが、名前は **nullptr** にできません。 |
| namespaceUri | const String\& | 削除するパラメータの名前空間 URI。 |

### ReturnValue

パラメータオブジェクト、または見つからなかった場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
