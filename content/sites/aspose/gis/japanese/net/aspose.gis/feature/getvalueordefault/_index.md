---
title: Feature.GetValueOrDefault
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. 属性の値を取得するまたはDefaultValue値が設定されていない場合またはヌル .
type: docs
weight: 40
url: /ja/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

属性の値を取得する、または[`DefaultValue`](../../featureattribute/defaultvalue/)値が設定されていない場合、または`ヌル` .

```csharp
public T GetValueOrDefault<T>(string attributeName)
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

このメソッドは、値をジェネリック型パラメーターで要求された型に自動的に変換します。

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

属性の値を取得する、または[`DefaultValue`](../../featureattribute/defaultvalue/)値が設定されていない場合、または`ヌル` .

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| attributeName | String | 属性の名前。 |
| defaultValue | Object | 属性値が欠落している場合に返す値。デフォルト値は`null`. |

### 戻り値

属性の値。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 属性名は`null`. |
| ArgumentException | この名前の属性は、このレイヤーには存在しません。 |
| InvalidOperationException | 属性はロックされていません。 |
| InvalidOperationException | この属性の値は、この機能には設定されていません。 |

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

属性の値を取得する、または[`DefaultValue`](../../featureattribute/defaultvalue/)値が設定されていない場合、または`ヌル` .

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| パラメータ | 説明 |
| --- | --- |
| T | 値に必要なタイプ。 |
| attributeName | 属性の名前。 |
| defaultValue | 属性値が欠落している場合に返す値。 |

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

このメソッドは、値をジェネリック型パラメーターで要求された型に自動的に変換します。

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


