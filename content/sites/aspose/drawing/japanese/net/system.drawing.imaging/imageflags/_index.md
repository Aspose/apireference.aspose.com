---
title: Enum ImageFlags
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Imaging.ImageFlags 列挙. に含まれるピクセル データの属性を指定しますImage物体 Flags プロパティはこの列挙のメンバーを返します この列挙にはメンバー値のビットごとの組み合わせを可能にする FlagsAttribute 属性があります
type: docs
weight: 760
url: /ja/net/system.drawing.imaging/imageflags/
---
## ImageFlags enumeration

に含まれるピクセル データの属性を指定します。[`Image`](../../system.drawing/image/)物体。 Flags プロパティは、この列挙のメンバーを返します。 この列挙には、メンバー値のビットごとの組み合わせを可能にする FlagsAttribute 属性があります。

```csharp
[Flags]
public enum ImageFlags
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| None | `0` | フォーマット情報がありません |
| Scalable | `1` | ピクセル データはスケーラブルです。 |
| HasAlpha | `2` | ピクセル データにはアルファ情報が含まれています。 |
| HasTranslucent | `4` | ピクセル データのアルファ値が 0 (透明) および 255 (不透明) 以外であることを指定します |
| PartiallyScalable | `8` | ピクセル データは部分的にスケーラブルですが、いくつかの制限があります。 |
| ColorSpaceRgb | `10` | ピクセル データは RGB 色空間を使用します。 |
| ColorSpaceCmyk | `20` | ピクセル データは CMYK 色空間を使用します。 |
| ColorSpaceGray | `40` | ピクセル データはグレースケールです。 |
| ColorSpaceYcbcr | `80` | 画像が YCBCR 色空間を使用して保存されることを指定します。 |
| ColorSpaceYcck | `100` | 画像が YCCK 色空間を使用して保存されることを指定します。 |
| HasRealDpi | `1000` | 1 インチあたりのドット数情報をイメージに格納することを指定します。 |
| HasRealPixelSize | `2000` | ピクセル サイズがイメージに格納されることを指定します。 |
| ReadOnly | `10000` | ピクセル データは読み取り専用です。 |
| Caching | `20000` | アクセスを高速化するために、ピクセル データをキャッシュできます。 |

### 関連項目

* 名前空間 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 組み立て [Aspose.Drawing](../../)


