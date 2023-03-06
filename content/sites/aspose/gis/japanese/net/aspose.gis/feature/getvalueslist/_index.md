---
title: Feature.GetValuesList
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. 属性シーケンスの値をリストとして取得します
type: docs
weight: 70
url: /ja/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

属性シーケンスの値をリストとして取得します。

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| パラメータ | 説明 |
| --- | --- |
| T | 値に必要なタイプ。 |
| attributeName | 属性の名前。 |
| separator | シーケンスの属性名とインデックス値を区切るために使用される文字列。 |

### 戻り値

シーケンス インデックス値によって名前が異なる属性の値のリスト。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 属性名は`null`. |
| ArgumentException | この名前の属性は、このレイヤーには存在しません。 |
| InvalidOperationException | 属性はロックされていません。 |
| InvalidOperationException | この属性の値は、この機能には設定されていません。 |
| InvalidCastException | 要求された型は実装されていませんIConvertible. |
| InvalidCastException | 属性の値は`null`ですが、要求された型は値型です。 |
| FormatException | 値の形式が正しくないため、変換に失敗しました。 |
| OverflowException | オーバーフローのため変換に失敗しました。 |

### 備考

これは[`GetValue`](../getvalue/)単一の値を取得します。したがって、このメソッドは、値をジェネリック型パラメーターで要求された型に自動的に変換します。  インデックス 0 の属性が見つからない場合は生成されますArgumentException .

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


