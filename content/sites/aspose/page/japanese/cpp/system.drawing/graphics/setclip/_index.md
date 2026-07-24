---
title: "System::Drawing::Graphics::SetClip メソッド"
linktitle: "SetClip"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Graphics::SetClip メソッド。現在の Graphics オブジェクトで表される描画サーフェスのクリッピング領域を、現在のクリップ領域とグラフィックパスで指定された領域を組み合わせる指定された操作の結果に設定します（C++）。"
type: docs
weight: 8600
url: /ja/cpp/system.drawing/graphics/setclip/
---
## Graphics::SetClip(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) method


現在の [Graphics](../) オブジェクトで表される描画サーフェスのクリッピング領域を、現在のクリップ領域とグラフィックパスで指定された領域を組み合わせる指定された操作の結果に設定します。

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Drawing2D::GraphicsPath> &path, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| パス | const SharedPtr\<Drawing2D::GraphicsPath\>\& | 結合する領域を指定します |
| combineMode | Drawing2D::CombineMode | 結合操作を指定します |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) method


未実装です。

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Graphics> &graphics, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Graphics](../)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) method


現在の [Graphics](../) オブジェクトで表される描画サーフェスのクリッピング領域を、現在のクリップ領域と指定された領域を組み合わせる指定された操作の結果に設定します。

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Region> &region, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 領域 | const SharedPtr\<Region\>\& | 結合する領域を指定します |
| combineMode | Drawing2D::CombineMode | 結合操作を指定します |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(Rectangle, Drawing2D::CombineMode) method


現在の [Graphics](../) オブジェクトで表される描画サーフェスのクリッピング領域を、現在のクリップ領域と指定された領域を組み合わせる指定された操作の結果に設定します。

```cpp
void System::Drawing::Graphics::SetClip(Rectangle rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rect | Rectangle | 結合する領域を指定します |
| combineMode | Drawing2D::CombineMode | 結合操作を指定します |

## 参照

* Class [Rectangle](../../rectangle/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(RectangleF, Drawing2D::CombineMode) method


現在の [Graphics](../) オブジェクトで表される描画サーフェスのクリッピング領域を、現在のクリップ領域と指定された領域を組み合わせる指定された操作の結果に設定します。

```cpp
void System::Drawing::Graphics::SetClip(RectangleF rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rect | RectangleF | 結合する領域を指定します |
| combineMode | Drawing2D::CombineMode | 結合操作を指定します |

## 参照

* Class [RectangleF](../../rectanglef/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
