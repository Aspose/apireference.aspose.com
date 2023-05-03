---
title: GraphicsPath.Widen
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPath 方法. パスにアウトラインを追加します
type: docs
weight: 360
url: /ja/net/system.drawing.drawing2d/graphicspath/widen/
---
## Widen(Pen) {#widen}

パスにアウトラインを追加します。

```csharp
public void Widen(Pen pen)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | あPenパスの元のアウトラインとこのメソッドが作成する新しいアウトラインの間の幅を指定します。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| NotImplementedException | メソッドが実装されていません。 |

### 関連項目

* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix) {#widen_1}

に追加のアウトラインを追加しますGraphicsPath.

```csharp
public void Widen(Pen pen, Matrix matrix)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | あPenパスの元のアウトラインとこのメソッドが作成する新しいアウトラインの間の幅を指定します。 |
| matrix | Matrix | あMatrix拡大する前にパスに適用する変換を指定します。 |

### 関連項目

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix, float) {#widen_2}

これを置き換えますGraphicsPathこのパスが指定されたペンで描かれたときに塗りつぶされる領域を囲む曲線で.

```csharp
public void Widen(Pen pen, Matrix matrix, float flatness)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| pen | Pen | あPenパスの元のアウトラインとこのメソッドが作成する新しいアウトラインの間の幅を指定します。 |
| matrix | Matrix | あMatrix拡大する前にパスに適用する変換を指定します。 |
| flatness | Single | 曲線の平坦度を指定する値。 |

### 備考

MS System.Drawing の実装は、Widen() 内で Flatten() を呼び出すか、同じアルゴリズムを使用します。 Aspose.Drawing の実装は、曲線を線分に置き換えずに Skia アルゴリズムを使用します。を無視します。`平坦度`パラメータ.

### 関連項目

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)


