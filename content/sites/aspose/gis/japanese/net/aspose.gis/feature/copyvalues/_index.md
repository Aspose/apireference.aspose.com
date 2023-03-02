---
title: Feature.CopyValues
second_title: Aspose.GIS for .NET API リファレンス
description: Feature 方法. 別の機能から属性の値をコピーします
type: docs
weight: 20
url: /ja/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

別の機能から属性の値をコピーします。

```csharp
public void CopyValues(Feature inputFeature)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| inputFeature | Feature | 値のコピー元の機能。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 引数は`null`. |
| ArgumentException | この名前の属性は、このレイヤーには存在しません。 |
| InvalidOperationException | 属性はロックされていません。 |
| InvalidOperationException | 入力値が null です。この機能の属性を null にすることはできません。 |
| [GisException](../../gisexception/) | 属性の名前は同じですが、フィーチャ内のデータ タイプが異なります。 |

### 備考

このメソッドは、名前が一致する属性のみをコピーします。

### 関連項目

* class [Feature](../)
* 名前空間 [Aspose.Gis](../../feature/)
* 組み立て [Aspose.GIS](../../../)


