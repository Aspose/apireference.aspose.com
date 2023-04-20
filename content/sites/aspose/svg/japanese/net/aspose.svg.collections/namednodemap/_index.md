---
title: Class NamedNodeMap
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Collections.NamedNodeMap クラス. 名前でアクセスできる属性のコレクションを表します
type: docs
weight: 30
url: /ja/net/aspose.svg.collections/namednodemap/
---
## NamedNodeMap class

名前でアクセスできる属性のコレクションを表します。

```csharp
public class NamedNodeMap : DOMObject, IDisposable, IEnumerable<Attr>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Item](../../aspose.svg.collections/namednodemap/item/) { get; } | マップのインデックス番目のアイテムを返します。 index がこのマップ内のノード数以上の場合、null が返されます。 (2 indexers) |
| [Length](../../aspose.svg.collections/namednodemap/length/) { get; } | このマップ内のノードの数. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [GetEnumerator](../../aspose.svg.collections/namednodemap/getenumerator/)() | コレクションを反復処理する列挙子を返します。 |
| [GetNamedItem](../../aspose.svg.collections/namednodemap/getnameditem/)(string) | 名前で指定されたノードを取得します。 |
| [GetNamedItemNS](../../aspose.svg.collections/namednodemap/getnameditemns/)(string, string) | ローカル名と名前空間 URI で指定されたノードを取得します。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| [RemoveNamedItem](../../aspose.svg.collections/namednodemap/removenameditem/)(string) | 名前で指定されたノードを削除します。 |
| [RemoveNamedItemNS](../../aspose.svg.collections/namednodemap/removenameditemns/)(string, string) | ローカル名と名前空間 URI で指定されたノードを削除します。 |
| [SetNamedItem](../../aspose.svg.collections/namednodemap/setnameditem/)(Attr) | nodeName 属性を使用してノードを追加します。その名前のノードがこのマップに既に存在する場合は、新しいノードに置き換えられます。ノードを単独で交換しても効果はありません. |
| [SetNamedItemNS](../../aspose.svg.collections/namednodemap/setnameditemns/)(Attr) | namespaceURI と localName を使用してノードを追加します。その名前空間 URI とそのローカル名を持つノードがこのマップに既に存在する場合、それは新しいものに置き換えられます。ノードを単独で交換しても効果はありません. |

### 関連項目

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Attr](../../aspose.svg.dom/attr/)
* 名前空間 [Aspose.Svg.Collections](../../aspose.svg.collections/)
* 組み立て [Aspose.SVG](../../)


