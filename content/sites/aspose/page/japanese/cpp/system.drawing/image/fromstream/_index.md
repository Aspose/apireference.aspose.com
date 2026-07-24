---
title: "System::Drawing::Image::FromStream メソッド"
linktitle: "FromStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Image::FromStream メソッド。指定されたストリームから Image オブジェクトを作成します（C++）。"
type: docs
weight: 2900
url: /ja/cpp/system.drawing/image/fromstream/
---
## Image::FromStream method


指定されたストリームから [Image](../) オブジェクトを作成します。

```cpp
static SharedPtr<Image> System::Drawing::Image::FromStream(const SharedPtr<System::IO::Stream> &stream, bool use_embedded_color_management=false, bool validate_image_data=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<System::IO::Stream\>\& | 画像データを含むストリーム |
| use_embedded_color_management | bool | IGNORED |
| validate_image_data | bool | IGNORED |

### ReturnValue

作成された [Image](../) オブジェクトへの共有ポインタ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../)
* Class [Stream](../../../system.io/stream/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
