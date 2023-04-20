---
title: Class DOMTokenList
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Collections.DOMTokenList クラス. DOMTokenList クラスはスペースで区切られたトークンのセットを表します JavaScript Array オブジェクトと同様に0 から始まるインデックスが付けられます DOMTokenList は常に大文字と小文字を区別します.
type: docs
weight: 10
url: /ja/net/aspose.svg.collections/domtokenlist/
---
## DOMTokenList class

DOMTokenList クラスは、スペースで区切られたトークンのセットを表します。 JavaScript Array オブジェクトと同様に、0 から始まるインデックスが付けられます。 DOMTokenList は常に大文字と小文字を区別します.

```csharp
public class DOMTokenList : DOMObject, IEnumerable<string>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Item](../../aspose.svg.collections/domtokenlist/item/) { get; } | インデックスによってリスト内の項目を返します。インデックスがリストの長さ以上の場合は null を返します。 |
| [Length](../../aspose.svg.collections/domtokenlist/length/) { get; } | このリストに格納されているトークンの数を表す ulong を返します。 |
| [Value](../../aspose.svg.collections/domtokenlist/value/) { get; set; } | 対応する属性の値を取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.svg.collections/domtokenlist/add/)(params string[]) | 指定したトークンをリストに追加します。 |
| [Contains](../../aspose.svg.collections/domtokenlist/contains/)(string) | リストに特定のトークンが含まれている場合は true、そうでない場合は false を返します。 |
| [GetEnumerator](../../aspose.svg.collections/domtokenlist/getenumerator/)() | コレクションを反復処理する列挙子を返します。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| [Remove](../../aspose.svg.collections/domtokenlist/remove/)(params string[]) | 指定したトークンをリストから削除します。 |
| [Replace](../../aspose.svg.collections/domtokenlist/replace/)(string, string) | 既存のトークンを新しいトークンに置き換えます。最初のトークンが存在しない場合は何もしません. |
| [Supports](../../aspose.svg.collections/domtokenlist/supports/)(string) | 指定されたトークンが関連付けられた属性のサポートされているトークンにある場合は true を返します。 |
| [Toggle](../../aspose.svg.collections/domtokenlist/toggle/#toggle)(string) | トークンが存在する場合はリストから削除し、存在しない場合はトークンをリストに追加します。 |
| [Toggle](../../aspose.svg.collections/domtokenlist/toggle/#toggle_1)(string, bool?) | トークンが存在する場合はリストから削除し、存在しない場合はトークンをリストに追加します。 |

### 関連項目

* class [DOMObject](../../aspose.svg.dom/domobject/)
* 名前空間 [Aspose.Svg.Collections](../../aspose.svg.collections/)
* 組み立て [Aspose.SVG](../../)


