---
title: Class NamedNodeMap
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Xbrl.Dom.NamedNodeMap クラス. 名前でアクセスできる属性のコレクションを表します
type: docs
weight: 7450
url: /ja/net/aspose.finance.xbrl.dom/namednodemap/
---
## NamedNodeMap class

名前でアクセスできる属性のコレクションを表します。

```csharp
public class NamedNodeMap : IEnumerable<Attr>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Item](../../aspose.finance.xbrl.dom/namednodemap/item/) { get; } | 指定した名前の属性を取得します。 (2 indexers) |
| [Length](../../aspose.finance.xbrl.dom/namednodemap/length/) { get; } | マップ内の属性の数を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [GetEnumerator](../../aspose.finance.xbrl.dom/namednodemap/getenumerator/)() | マップを反復処理する列挙子を返します。 |
| [GetNamedItem](../../aspose.finance.xbrl.dom/namednodemap/getnameditem/)(string) | 名前で指定された属性を取得します。 |
| [GetNamedItemNS](../../aspose.finance.xbrl.dom/namednodemap/getnameditemns/)(string, string) | ローカル名と名前空間 URI で指定された属性を取得します。 |
| [RemoveNamedItem](../../aspose.finance.xbrl.dom/namednodemap/removenameditem/)(string) | 名前で指定された属性を削除します。 |
| [RemoveNamedItemNS](../../aspose.finance.xbrl.dom/namednodemap/removenameditemns/)(string, string) | ローカル名と名前空間 URI で指定された属性を削除します。 |
| [SetNamedItem](../../aspose.finance.xbrl.dom/namednodemap/setnameditem/)(Attr) | nodeName 属性を使用してノードを追加します。その名前のノードがこのマップに既に存在する場合は、新しいノードに置き換えられます。ノードを単独で置き換えても効果はありません。 |
| [SetNamedItemNS](../../aspose.finance.xbrl.dom/namednodemap/setnameditemns/)(Attr) | namespaceURI と localName を使用してノードを追加します。その名前空間 URI とそのローカル名を持つノードがこのマップに既に存在する場合、それは新しいものに置き換えられます。ノードを単独で置き換えても効果はありません。 |

### 関連項目

* class [Attr](../attr/)
* 名前空間 [Aspose.Finance.Xbrl.Dom](../../aspose.finance.xbrl.dom/)
* 組み立て [Aspose.Finance](../../)


