---
title: Class LayeredSymbolizer
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer クラス. 他のいくつかのシンボライザーをレンダリングするシンボライザー.
type: docs
weight: 1830
url: /ja/net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

他のいくつかのシンボライザーをレンダリングするシンボライザー.

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | 新しいインスタンスを作成します。 |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | 新しいインスタンスを作成します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | シンボライザーの数を取得します。 |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | 指定された index にあるシンボライザーを取得します。 |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | レンダリング順序を決定します。 ByFeatures - 機能のすべてのシンボライザーをレンダリングしてから、次の機能に進みます。ByLayers - シンボライザーですべての機能をレンダリングしてから、次のシンボライザーに進みます。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | 指定されたシンボライザーを追加します。 |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | コレクションを反復処理する列挙子を返します。 |

### 関連項目

* class [VectorSymbolizer](../vectorsymbolizer/)
* 名前空間 [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* 組み立て [Aspose.GIS](../../)


