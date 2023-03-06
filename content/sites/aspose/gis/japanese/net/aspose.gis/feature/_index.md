---
title: Class Feature
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.Feature クラス. ジオメトリとユーザー定義の属性で構成される地理的特徴.
type: docs
weight: 130
url: /ja/net/aspose.gis/feature/
---
## Feature class

ジオメトリとユーザー定義の属性で構成される地理的特徴.

```csharp
public class Feature
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Geometry](../../aspose.gis/feature/geometry/) { get; set; } | フィーチャのジオメトリを取得または設定します。 はできません`null`、 使用[`Null`](../../aspose.gis.geometries/geometry/null/)欠落しているジオメトリを示します. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [CopyValues](../../aspose.gis/feature/copyvalues/)(Feature) | 別の機能から属性の値をコピーします。 |
| [GetValue](../../aspose.gis/feature/getvalue/#getvalue)(string) | 属性の値を取得します。 |
| [GetValue&lt;T&gt;](../../aspose.gis/feature/getvalue/#getvalue_1)(string) | 属性の値を取得します。 |
| [GetValueOrDefault](../../aspose.gis/feature/getvalueordefault/#getvalueordefault)(string, object) | 属性の値を取得する、または[`DefaultValue`](../featureattribute/defaultvalue/)値が設定されていない場合、または`ヌル` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_1)(string) | 属性の値を取得する、または[`DefaultValue`](../featureattribute/defaultvalue/)値が設定されていない場合、または`ヌル` . |
| [GetValueOrDefault&lt;T&gt;](../../aspose.gis/feature/getvalueordefault/#getvalueordefault_2)(string, object) | 属性の値を取得する、または[`DefaultValue`](../featureattribute/defaultvalue/)値が設定されていない場合、または`ヌル` . |
| [GetValues](../../aspose.gis/feature/getvalues/)(object[], object) | 配列内のすべての属性の値を返します。 |
| [GetValuesDump](../../aspose.gis/feature/getvaluesdump/)(object) | 配列内のすべての属性の値を返します。 使用を検討してください[`GetValues`](./getvalues/)追加のメモリ割り当てを回避する方法. |
| [GetValuesList&lt;T&gt;](../../aspose.gis/feature/getvalueslist/)(string, string) | 属性シーケンスの値をリストとして取得します。 |
| [IsValueNull](../../aspose.gis/feature/isvaluenull/)(string) | 指定された属性が明示的に設定されているかどうかを判断します`ヌル`値. |
| [IsValueSet](../../aspose.gis/feature/isvalueset/)(string) | この機能に属性値が設定されているかどうかを確認します。 |
| [SetValue&lt;T&gt;](../../aspose.gis/feature/setvalue/)(string, T) | 属性の新しい値を設定します。 |
| [SetValueNull](../../aspose.gis/feature/setvaluenull/)(string) | 属性の値を`ヌル` . |
| [SetValues](../../aspose.gis/feature/setvalues/)(object[]) | すべての属性に新しい値を設定します。 の使用も検討してください。[`CopyValues`](./copyvalues/) 1回の呼び出しで設定値を効率化するメソッド. |
| [UnsetValue](../../aspose.gis/feature/unsetvalue/)(string) | この地物から属性値を削除します。 |

### 関連項目

* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


