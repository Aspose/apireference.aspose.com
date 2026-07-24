---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText メソッド"
linktitle: "FillAndStrokeText"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText メソッド。C++ でグリフの内部を塗りつぶし、輪郭を描画することによりテキスト文字列を追加します。"
type: docs
weight: 2500
url: /ja/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| アドバンス | System::ArrayPtr\<float\> | グリフ幅の配列です。その長さは文字列中のグリフ数と一致している必要があります。 |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) テキストの描画に使用されるフォントです。カスタムフォルダーにあるカスタムフォントと共に使用できます。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |
| fillPaint | System::SharedPtr\\<System::Drawing::Brush\\> | グリフ内部の塗りに使用されるフィルです。 |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | グリフ輪郭の描画に使用されるストロークです。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| アドバンス | System::ArrayPtr\<float\> | グリフ幅の配列です。その長さは文字列中のグリフ数と一致している必要があります。 |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) テキストの描画に使用されるフォントです。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |
| fillPaint | System::SharedPtr\\<System::Drawing::Brush\\> | グリフ内部の塗りに使用されるフィルです。 |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | グリフ輪郭の描画に使用されるストロークです。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) テキストの描画に使用されるフォントです。カスタムフォルダーにあるカスタムフォントと共に使用できます。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |
| fillPaint | System::SharedPtr\\<System::Drawing::Brush\\> | グリフ内部の塗りに使用されるフィルです。 |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | グリフ輪郭の描画に使用されるストロークです。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


グリフの内部を塗りつぶし、グリフの輪郭を描画してテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) テキストの描画に使用されるフォントです。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |
| fillPaint | System::SharedPtr\\<System::Drawing::Brush\\> | グリフ内部の塗りに使用されるフィルです。 |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | グリフ輪郭の描画に使用されるストロークです。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
