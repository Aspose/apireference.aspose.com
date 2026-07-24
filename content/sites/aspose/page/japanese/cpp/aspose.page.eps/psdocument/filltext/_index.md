---
title: "Aspose::Page::EPS::PsDocument::FillText メソッド"
linktitle: "FillText"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::FillText メソッド。C++ でグリフの内部を塗りつぶすことによりテキスト文字列を追加します。"
type: docs
weight: 3100
url: /ja/cpp/aspose.page.eps/psdocument/filltext/
---
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


グリフの内部を塗りつぶしてテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| アドバンス | System::ArrayPtr\<float\> | グリフ幅の配列です。その長さは文字列中のグリフ数と一致している必要があります。 |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) テキストの描画に使用されるフォントです。カスタムフォルダーにあるカスタムフォントと共に使用できます。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


グリフの内部を塗りつぶしてテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| アドバンス | System::ArrayPtr\<float\> | グリフ幅の配列です。その長さは文字列中のグリフ数と一致している必要があります。 |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) テキストの描画に使用されるフォントです。カスタムフォルダーにあるカスタムフォントと共に使用できます。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |
| fill | System::SharedPtr\\<System::Drawing::Brush\\> | グリフの描画に使用される塗りつぶし。 |
## 備考



///
## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) method


グリフの内部を塗りつぶしてテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| アドバンス | System::ArrayPtr\<float\> | グリフ幅の配列です。その長さは文字列中のグリフ数と一致している必要があります。 |
| フォント | System::SharedPtr\<System::Drawing::Font\> | テキストを描画するために使用されるフォント。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


グリフの内部を塗りつぶしてテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| アドバンス | System::ArrayPtr\<float\> | グリフ幅の配列です。その長さは文字列中のグリフ数と一致している必要があります。 |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) テキストの描画に使用されるフォントです。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |
| fill | System::SharedPtr\\<System::Drawing::Brush\\> | グリフの描画に使用される塗りつぶし。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


グリフの内部を塗りつぶしてテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) テキストの描画に使用されるフォントです。カスタムフォルダーにあるカスタムフォントと共に使用できます。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


グリフの内部を塗りつぶしてテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../) テキストの描画に使用されるフォントです。カスタムフォルダーにあるカスタムフォントと共に使用できます。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |
| fill | System::SharedPtr\\<System::Drawing::Brush\\> | グリフの描画に使用される塗りつぶし。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) method


グリフの内部を塗りつぶしてテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) テキストの描画に使用されるフォントです。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


グリフの内部を塗りつぶしてテキスト文字列を追加します。

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| text | System::String | 追加するテキスト。 |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/) テキストの描画に使用されるフォントです。 |
| x | 単精度浮動小数点数 | テキスト原点の X 座標。 |
| y | 単精度浮動小数点数 | テキスト原点の Y 座標。 |
| fill | System::SharedPtr\\<System::Drawing::Brush\\> | グリフの描画に使用される塗りつぶし。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
