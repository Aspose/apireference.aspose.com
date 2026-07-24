---
title: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope メソッド"
linktitle: "GetNamespacesInScope"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope メソッド。現在 C++ でスコープ内にある、定義されたプレフィックスと名前空間のマッピングのコレクションを返します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


現在スコープ内にある定義済みのプレフィックス‑名前空間マッピングのコレクションを返します。

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| scope | XmlNamespaceScope | 返す名前空間ノードのタイプを指定する [XmlNamespaceScope](../../xmlnamespacescope/) 値です。 |

### ReturnValue

現在スコープ内にある名前空間を含む IDictionary コレクション。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
