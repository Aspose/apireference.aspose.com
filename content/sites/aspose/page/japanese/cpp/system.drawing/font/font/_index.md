---
title: "System::Drawing::Font::Font コンストラクタ"
linktitle: "フォント"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Font::Font コンストラクタ。C++ で指定された既存のフォントと指定されたフォントスタイルを表す Font クラスの新しいインスタンスを作成します。"
type: docs
weight: 100
url: /ja/cpp/system.drawing/font/font/
---
## Font::Font(const SharedPtr\<Font\>\&, FontStyle) constructor


指定された既存のフォントと指定されたフォントスタイルを表す [Font](../) クラスの新しいインスタンスを作成します。

```cpp
System::Drawing::Font::Font(const SharedPtr<Font> &prototype, FontStyle new_style)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prototype | const SharedPtr\<Font\>\& | 新しいフォントを作成する元となる既存のフォント |
| new_style | FontStyle | 新しいフォントに適用するフォントスタイル |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontStyle](../../fontstyle/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


[Font](../) クラスの新しいインスタンスを作成します。

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ファミリ | const SharedPtr\<FontFamily\>\& | 新しいフォントのフォントファミリー |
| em_size | 単精度浮動小数点数 | **unit** パラメータで指定された単位での新しいフォントの em サイズ |
| スタイル | FontStyle | 新しいフォントのスタイル |
| 単位 | GraphicsUnit | 新しいフォントの測定単位 |
| gdi_charset | uint8_t | 新しいフォントで使用する GDI 文字セット |
| gdi_vertical_font | bool | 新しいフォントが GDI 縦書きフォントから派生している場合は true |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) constructor


[Font](../) クラスの新しいインスタンスを作成します。

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ファミリ | const SharedPtr\<FontFamily\>\& | 新しいフォントのフォントファミリー |
| em_size | 単精度浮動小数点数 | **unit** パラメータで指定された単位での新しいフォントの em サイズ |
| 単位 | GraphicsUnit | 新しいフォントの測定単位 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


[Font](../) クラスの新しいインスタンスを作成します。

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| family_name | const String\& | 新しいフォントのフォントファミリ名 |
| em_size | 単精度浮動小数点数 | **unit** パラメータで指定された単位での新しいフォントの em サイズ |
| スタイル | FontStyle | 新しいフォントのスタイル |
| 単位 | GraphicsUnit | 新しいフォントの測定単位 |
| gdi_charset | uint8_t | 新しいフォントで使用する GDI 文字セット |
| gdi_vertical_font | bool | 新しいフォントが GDI 縦書きフォントから派生している場合は true |

## 参照

* Class [String](../../../system/string/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, GraphicsUnit) constructor


[Font](../) クラスの新しいインスタンスを作成します。

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| family_name | const String\& | 新しいフォントのフォントファミリ名 |
| em_size | 単精度浮動小数点数 | **unit** パラメータで指定された単位での新しいフォントの em サイズ |
| 単位 | GraphicsUnit | 新しいフォントの測定単位 |

## 参照

* Class [String](../../../system/string/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
