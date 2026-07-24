---
title: "System::Xml::XPath::XPathNamespaceScope 列挙型"
linktitle: "XPathNamespaceScope"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNamespaceScope 列挙型。C++ における名前空間スコープを定義します。"
type: docs
weight: 1000
url: /ja/cpp/system.xml.xpath/xpathnamespacescope/
---
## XPathNamespaceScope enum


名前空間のスコープを定義します。

```cpp
enum class XPathNamespaceScope
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| All | 0 | 現在ノードのスコープで定義されているすべての名前空間を返します。これには常に暗黙的に宣言される **xmlns:xml** 名前空間が含まれます。返される名前空間の順序は定義されていません。 |
| ExcludeXml | 1 | 現在ノードのスコープで定義されているすべての名前空間を返しますが、**xmlns:xml** 名前空間は除外します。**xmlns:xml** 名前空間は常に暗黙的に宣言されます。返される名前空間の順序は定義されていません。 |
| Local | 2 | 現在ノードでローカルに定義されているすべての名前空間を返します。 |

## 参照

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
