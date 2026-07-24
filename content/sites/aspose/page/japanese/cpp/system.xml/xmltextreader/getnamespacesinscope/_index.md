---
title: "System::Xml::XmlTextReader::GetNamespacesInScope メソッド"
linktitle: "GetNamespacesInScope"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextReader::GetNamespacesInScope メソッド。C++ で現在スコープ内にあるすべての名前空間を含むコレクションを返します。"
type: docs
weight: 3400
url: /ja/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


現在スコープ内にあるすべての名前空間を含むコレクションを返します。

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| scope | XmlNamespaceScope | 返す名前空間ノードのタイプを指定する [XmlNamespaceScope](../../xmlnamespacescope/) 値です。 |

### ReturnValue

現在スコープ内のすべての名前空間を含む IDictionary オブジェクトです。リーダーが要素に位置していない場合、空のディクショナリ（名前空間なし）が返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
