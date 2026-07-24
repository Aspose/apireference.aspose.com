---
title: "System::Xml::IXmlNamespaceResolver クラス"
linktitle: "IXmlNamespaceResolver"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::IXmlNamespaceResolver クラス。C++ でプレフィックスと名前空間のマッピングのセットへの読み取り専用アクセスを提供します。"
type: docs
weight: 400
url: /ja/cpp/system.xml/ixmlnamespaceresolver/
---
## IXmlNamespaceResolver class


プレフィックスと名前空間のマッピング集合への読み取り専用アクセスを提供します。

```cpp
class IXmlNamespaceResolver : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) | 現在スコープ内にある定義済みのプレフィックス‑名前空間マッピングのコレクションを返します。 |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | 指定されたプレフィックスにマッピングされた名前空間 URI を返します。 |
| virtual [LookupPrefix](./lookupprefix/)(const String\&) | 指定された名前空間 URI にマッピングされたプレフィックスを返します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
