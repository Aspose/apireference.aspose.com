---
title: Feature.GetValue
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. 属性の値を取得します
type: docs
weight: 30
url: /ja/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

属性の値を取得します。

```csharp
public T GetValue<T>(string attributeName)
```

| パラメータ | 説明 |
| --- | --- |
| T | 値に必要なタイプ。 |
| attributeName | 属性の名前。 |

### 戻り値

属性の値。

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

このメソッドは、値をジェネリック型パラメーターで要求された型に自動的に変換します。  レイヤーに定義されたすべての属性の値をフィーチャが持つ必要がない場合、 このメソッドは失敗する可能性があります。InvalidOperationException欠落している値が要求されたとき. そのようなレイヤーで作業するときは、使用を検討してください[`GetValueOrDefault`](../getvalueordefault/) .

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

属性の値を取得します。

```csharp
public object GetValue(string attributeName)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| attributeName | String | 属性の名前。 |

### 戻り値

属性の値。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 属性名は`null`. |
| ArgumentException | この名前の属性は、このレイヤーには存在しません。 |
| InvalidOperationException | 属性はロックされていません。 |
| InvalidOperationException | この属性の値は、この機能には設定されていません。 |

### 備考

レイヤーに定義されたすべての属性の値をフィーチャが持つ必要がない場合、 このメソッドは失敗する可能性があります。InvalidOperationException欠落している値が要求されたとき. そのようなレイヤーで作業するときは、使用を検討してください[`GetValueOrDefault`](../getvalueordefault/) .

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


