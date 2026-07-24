---
title: "System::Drawing::Font::GetHeight メソッド"
linktitle: "GetHeight"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Font::GetHeight メソッド。現在のオブジェクトが表すフォントの行間隔を、指定された Graphics オブジェクトの現在の単位で C++ で返します。"
type: docs
weight: 1900
url: /ja/cpp/system.drawing/font/getheight/
---
## Font::GetHeight(const SharedPtr\<Graphics\>\&) method


現在のオブジェクトが表すフォントの行間隔を、指定された [Graphics](../../graphics/) オブジェクトの現在の単位で返します。

```cpp
float System::Drawing::Font::GetHeight(const SharedPtr<Graphics> &graphics)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| graphics | const SharedPtr\<Graphics\>\& | 測定単位を指定する [Graphics](../../graphics/) オブジェクト |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Graphics](../../graphics/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::GetHeight(float) method


指定された垂直解像度の表示デバイスに描画されたときの、現在のオブジェクトが表すフォントの高さを返します。

```cpp
float System::Drawing::Font::GetHeight(float dpi=DEFAULT_FONT_OPERATIONS_DPI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dpi | 単精度浮動小数点数 | ディスプレイデバイスの垂直解像度 |

### ReturnValue

フォントの高さ（ピクセル）

## 参照

* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
