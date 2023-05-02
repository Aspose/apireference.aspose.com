---
title: ImageAttributes.SetWrapMode
second_title: Aspose.Drawing for .NET API リファレンス
description: ImageAttributes 方法. シェイプ全体またはシェイプの境界でテクスチャをタイリングする方法を決定するために使用されるラップ モードを設定します
type: docs
weight: 240
url: /ja/net/system.drawing.imaging/imageattributes/setwrapmode/
---
## SetWrapMode(WrapMode) {#setwrapmode}

シェイプ全体またはシェイプの境界でテクスチャをタイリングする方法を決定するために使用されるラップ モードを設定します。

```csharp
public void SetWrapMode(WrapMode mode)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| mode | WrapMode | の要素WrapMode image の繰り返しコピーを使用して領域をタイル化する方法を指定します。 |

### 関連項目

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* class [ImageAttributes](../)
* 名前空間 [System.Drawing.Imaging](../../imageattributes/)
* 組み立て [Aspose.Drawing](../../../)

---

## SetWrapMode(WrapMode, Color) {#setwrapmode_1}

シェイプ全体またはシェイプ境界でテクスチャをタイル化する方法を決定するために使用されるラップ モードと色を設定します。

```csharp
public void SetWrapMode(WrapMode mode, Color color)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| mode | WrapMode | の要素WrapMode image の繰り返しコピーを使用して領域をタイル化する方法を指定します。 |
| color | Color | アンColorレンダリングされたイメージの外側のピクセルの色を指定するオブジェクト. この色は、モード パラメータがClampソース矩形は に渡されました[`DrawImage`](../../../system.drawing/graphics/drawimage/)画像自体よりも大きいです。 |

### 関連項目

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [Color](../../../system.drawing/color/)
* class [ImageAttributes](../)
* 名前空間 [System.Drawing.Imaging](../../imageattributes/)
* 組み立て [Aspose.Drawing](../../../)

---

## SetWrapMode(WrapMode, Color, bool) {#setwrapmode_2}

シェイプ全体またはシェイプ境界でテクスチャをタイル化する方法を決定するために使用されるラップ モードと色を設定します。

```csharp
public void SetWrapMode(WrapMode mode, Color color, bool clamp)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| mode | WrapMode | の要素WrapMode image の繰り返しコピーを使用して領域をタイル化する方法を指定します。 |
| color | Color | レンダリングされたイメージの外側のピクセルの色を指定する色オブジェクト. この色は、モード パラメータがClampソースのrectangle が渡されます[`DrawImage`](../../../system.drawing/graphics/drawimage/)画像自体よりも大きいです。 |
| clamp | Boolean | このパラメータは無効です。 false に設定します。 |

### 関連項目

* enum [WrapMode](../../../system.drawing.drawing2d/wrapmode/)
* struct [Color](../../../system.drawing/color/)
* class [ImageAttributes](../)
* 名前空間 [System.Drawing.Imaging](../../imageattributes/)
* 組み立て [Aspose.Drawing](../../../)


