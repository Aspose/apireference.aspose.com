---
title: "System::Drawing::Imaging::ImageFlags enum"
linktitle: "ImageFlags"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::ImageFlags enum. C++ の Image オブジェクトが表すピクセルデータの属性を表します。"
type: docs
weight: 2200
url: /ja/cpp/system.drawing.imaging/imageflags/
---
## ImageFlags enum


[Image](../../system.drawing/image/) オブジェクトが表すピクセルデータの属性を表します。

```cpp
enum class ImageFlags
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 |  |
| スケーラブル | 1 | スケーラブルです。 |
| HasAlpha | 2 | アルファ情報が含まれています。 |
| HasTranslucent | 4 | 0 より大きく 255 未満のアルファ値があります。 |
| PartiallyScalable | 8 |  |
| ColorSpaceRgb | 16 | ピクセルデータは RGB カラースペースで表現されます。 |
| ColorSpaceCmyk | 32 | ピクセルデータは CMYK カラースペースで表現されます。 |
| ColorSpaceGray | 64 | ピクセルデータはグレースケールです。 |
| ColorSpaceYcbcr | 128 | ピクセルデータは YCBCR カラースペースで表現されます。 |
| ColorSpaceYcck | 256 | ピクセルデータは YCCK カラースペースで表現されます。 |
| HasRealDpi | 4096 | 画像に DPI 情報が保存されています。 |
| HasRealPixelSize | 8192 | 画像にピクセルのサイズが保存されています。 |
| 読み取り専用 | 65536 | ピクセルデータは読み取り専用です。 |
| Caching | 131072 | 高速アクセスのためにキャッシュできます。 |

## 参照

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
