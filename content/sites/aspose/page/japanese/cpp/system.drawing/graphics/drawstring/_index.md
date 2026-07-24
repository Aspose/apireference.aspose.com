---
title: "System::Drawing::Graphics::DrawString メソッド"
linktitle: "DrawString"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Graphics::DrawString メソッド。指定された文字列を、指定された位置に、指定されたフォントとブラシを使用して C++ で描画します。"
type: docs
weight: 2800
url: /ja/cpp/system.drawing/graphics/drawstring/
---
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


指定されたフォントとブラシを使用して、指定された位置に指定された文字列を描画します。

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, float x, float y, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 描画する文字列 |
| フォント | const SharedPtr\<Font\>\& | 使用するフォント |
| brush | const SharedPtr\<Brush\>\& | 描画に使用する [Brush](../../brush/) オブジェクト |
| x | 単精度浮動小数点数 | 描画された文字列の左上隅の位置の X 座標 |
| y | 単精度浮動小数点数 | 描画された文字列の左上隅の位置の Y 座標 |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 文字列の書式を指定します |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


指定されたフォントとブラシを使用して、指定された位置に指定された文字列を描画します。

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, PointF topLeft, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 描画する文字列 |
| フォント | const SharedPtr\<Font\>\& | 使用するフォント |
| brush | const SharedPtr\<Brush\>\& | 描画に使用する [Brush](../../brush/) オブジェクト |
| topLeft | PointF | 描画された文字列の左上隅の位置を指定します |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 文字列の書式を指定します |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, RectangleF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


指定されたフォントとブラシを使用して、指定された矩形内に指定された文字列を描画します。

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, RectangleF layoutRectangle, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 描画する文字列 |
| フォント | const SharedPtr\<Font\>\& | 使用するフォント |
| brush | const SharedPtr\<Brush\>\& | 描画に使用する [Brush](../../brush/) オブジェクト |
| layoutRectangle | RectangleF | 文字列を描画する矩形を指定します |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 文字列の書式を指定します |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
