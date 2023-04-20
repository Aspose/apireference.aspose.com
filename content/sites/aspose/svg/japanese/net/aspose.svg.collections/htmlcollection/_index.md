---
title: Class HTMLCollection
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Collections.HTMLCollection クラス. HTMLCollectionの一般的なコレクションを表しますElement .
type: docs
weight: 20
url: /ja/net/aspose.svg.collections/htmlcollection/
---
## HTMLCollection class

`HTMLCollection`の一般的なコレクションを表します[`Element`](../../aspose.svg.dom/element/) .

```csharp
public abstract class HTMLCollection : DOMObject, IEnumerable<Element>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [Item](../../aspose.svg.collections/htmlcollection/item/) { get; } | コレクション内の index 番目のアイテムを返します。 index がリスト内のノード数以上の場合、null が返されます。 |
| abstract [Length](../../aspose.svg.collections/htmlcollection/length/) { get; } | リスト内のノード数。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| abstract [GetEnumerator](../../aspose.svg.collections/htmlcollection/getenumerator/)() | 列挙子を取得します。 |
| override [GetPlatformType](../../aspose.svg.collections/htmlcollection/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| [NamedItem](../../aspose.svg.collections/htmlcollection/nameditem/)(string) | 指定された名前と一致するコレクション内のアイテムを返します. |

### 関連項目

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Element](../../aspose.svg.dom/element/)
* 名前空間 [Aspose.Svg.Collections](../../aspose.svg.collections/)
* 組み立て [Aspose.SVG](../../)


