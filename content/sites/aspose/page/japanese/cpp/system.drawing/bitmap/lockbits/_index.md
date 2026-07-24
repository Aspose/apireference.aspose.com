---
title: "System::Drawing::Bitmap::LockBits メソッド"
linktitle: "LockBits"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Bitmap::LockBits メソッド。Bitmap をシステムメモリにロックします（C++）。"
type: docs
weight: 1500
url: /ja/cpp/system.drawing/bitmap/lockbits/
---
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) method


[Bitmap](../) をシステムメモリにロックします。

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rect | const Rectangle\& | ロックする画像領域を指定する矩形 |
| フラグ | Imaging::ImageLockMode | ビットマップへのアクセスレベルを指定します |
| フォーマット | Imaging::PixelFormat | このビットマップのデータ形式 |

### ReturnValue

実行されたロック操作に関する情報を含む BitmapData オブジェクトへの共有ポインタ

## 参照

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::LockBits(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) method


[Bitmap](../) をシステムメモリにロックします。

```cpp
Imaging::BitmapDataPtr System::Drawing::Bitmap::LockBits(const Rectangle &rect, Imaging::ImageLockMode flags, Imaging::PixelFormat format, const Imaging::BitmapDataPtr &bitmap_data)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rect | const Rectangle\& | ロックする画像領域を指定する矩形 |
| フラグ | Imaging::ImageLockMode | ビットマップへのアクセスレベルを指定します |
| フォーマット | Imaging::PixelFormat | このビットマップのデータ形式 |
| bitmap_data | const Imaging::BitmapDataPtr\& | ロック操作に関する情報を含みます |

### ReturnValue

実行されたロック操作に関する情報を含む BitmapData オブジェクトへの共有ポインタ

## 参照

* Typedef [BitmapDataPtr](../../../system.drawing.imaging/bitmapdataptr/)
* Class [Rectangle](../../rectangle/)
* Enum [ImageLockMode](../../../system.drawing.imaging/imagelockmode/)
* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
