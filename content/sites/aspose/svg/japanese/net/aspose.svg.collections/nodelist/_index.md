---
title: Class NodeList
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Collections.NodeList クラス. NodeList はこのコレクションの実装方法を定義または制約することなく順序付けられたノードのコレクションの抽象化を提供します
type: docs
weight: 40
url: /ja/net/aspose.svg.collections/nodelist/
---
## NodeList class

NodeList は、このコレクションの実装方法を定義または制約することなく、順序付けられたノードのコレクションの抽象化を提供します。

```csharp
public abstract class NodeList : DOMObject, IEnumerable<Node>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [Item](../../aspose.svg.collections/nodelist/item/) { get; } | メソッドは、コレクション内の index 番目のアイテムを返します。 index がリスト内のノード数以上の場合、null が返されます。 |
| abstract [Length](../../aspose.svg.collections/nodelist/length/) { get; } | リスト内のノード数。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| abstract [GetEnumerator](../../aspose.svg.collections/nodelist/getenumerator/)() | コレクションを反復処理する列挙子を返します。 |
| override [GetPlatformType](../../aspose.svg.collections/nodelist/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |

### 関連項目

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Node](../../aspose.svg.dom/node/)
* 名前空間 [Aspose.Svg.Collections](../../aspose.svg.collections/)
* 組み立て [Aspose.SVG](../../)


