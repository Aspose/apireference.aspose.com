---
title: "System::Drawing::Graphics::MeasureString メソッド"
linktitle: "MeasureString"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Graphics::MeasureString メソッド。指定されたフォントと書式で描画された指定文字列のサイズを C++ で返します。"
type: docs
weight: 6500
url: /ja/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


指定されたフォントと指定された書式で描画された場合の、指定された文字列のサイズを返します。

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | String const\& | サイズを計算する文字列 |
| フォント | System::SharedPtr\<Font\> const\& | 文字列の描画に使用されるフォント |
| width | int | 文字列の最大幅 |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 文字列の書式を指定します |

### ReturnValue

現在の Graphics オブジェクトの PageUnit プロパティで指定された測定単位で文字列のサイズを表す [SizeF](../../sizef/) オブジェクト。

## 参照

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


指定されたフォントと指定された書式で描画された場合の、指定された文字列のサイズを返します。

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | String const\& | サイズを計算する文字列 |
| フォント | System::SharedPtr\<Font\> const\& | 文字列の描画に使用されるフォント |
| origin | PointF const\& | 文字列の左上隅の位置を指定します |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 文字列の書式を指定します |

### ReturnValue

現在の Graphics オブジェクトの PageUnit プロパティで指定された測定単位で文字列のサイズを表す [SizeF](../../sizef/) オブジェクト。

## 参照

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [PointF](../../pointf/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&, int\&, int\&) const method


未実装です。

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## 参照

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


指定されたフォントと指定された書式で描画された場合の、指定された文字列のサイズを返します。

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | String const\& | サイズを計算する文字列 |
| フォント | System::SharedPtr\<Font\> const\& | 文字列の描画に使用されるフォント |
| layoutArea | SizeF const\& | 文字列の最大レイアウト領域 |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 文字列の書式を指定します |

### ReturnValue

現在の Graphics オブジェクトの PageUnit プロパティで指定された測定単位で文字列のサイズを表す [SizeF](../../sizef/) オブジェクト。

## 参照

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
