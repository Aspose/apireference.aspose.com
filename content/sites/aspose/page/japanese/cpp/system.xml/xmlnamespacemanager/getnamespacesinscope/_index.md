---
title: "System::Xml::XmlNamespaceManager::GetNamespacesInScope メソッド"
linktitle: "GetNamespacesInScope"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamespaceManager::GetNamespacesInScope メソッド。プレフィックスでキー付けされた名前空間名のコレクションを返し、C++ で現在スコープにある名前空間を列挙するために使用できます。"
type: docs
weight: 600
url: /ja/cpp/system.xml/xmlnamespacemanager/getnamespacesinscope/
---
## XmlNamespaceManager::GetNamespacesInScope method


プレフィックスでキー付けされた名前空間名のコレクションを返します。これを使用して現在のスコープ内の名前空間を列挙できます。

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlNamespaceManager::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| スコープ | XmlNamespaceScope | 返す名前空間ノードのタイプを指定する列挙値です。 |

### ReturnValue

現在スコープにある名前空間とプレフィックスのペアのコレクションです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
