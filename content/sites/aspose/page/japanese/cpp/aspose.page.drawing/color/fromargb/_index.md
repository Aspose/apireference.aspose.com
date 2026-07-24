---
title: "Aspose::Page::Drawing::Color::FromArgb メソッド"
linktitle: "FromArgb"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Drawing::Color::FromArgb メソッド。指定された T:Aspose::Page::Drawing::Color 構造体から T:Aspose::Page::Drawing::Color 構造体を作成しますが、新しいアルファ値を指定します。このメソッドはアルファ値に 32 ビットの値を渡すことを許可しますが、C++ では 8 ビットに制限されています。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.drawing/color/fromargb/
---
## Color::FromArgb(int32_t, Aspose::Page::Drawing::Color) method


指定された [T:Aspose::Page::Drawing::Color](../) 構造体から、新しい指定アルファ値を使用して [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。このメソッドはアルファ値に 32 ビット値を渡すことを許可しますが、値は 8 ビットに制限されます。

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, Aspose::Page::Drawing::Color baseColor)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| alpha | int32_t | 新しい [T:Aspose::Page::Drawing::Color](../) のアルファ値。 有効な値は 0 から 255 です。 |
| baseColor | Aspose::Page::Drawing::Color | 新しい [T:Aspose::Page::Drawing::Color](../) を作成する元となる [T:Aspose::Page::Drawing::Color](../)。 |

### ReturnValue

このメソッドが作成する [T:Aspose::Page::Drawing::Color](../) です。

## 参照

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t, int32_t) method


4 つの ARGB コンポーネント（アルファ、赤、緑、青）の値から [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。このメソッドは各コンポーネントに 32 ビット値を渡すことを許可しますが、各コンポーネントの値は 8 ビットに制限されます。

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, int32_t red, int32_t green, int32_t blue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| alpha | int32_t | アルファ コンポーネント。 有効な値は 0 から 255 です。 |
| red | int32_t | 赤 コンポーネント。 有効な値は 0 から 255 です。 |
| green | int32_t | 緑 コンポーネント。 有効な値は 0 から 255 です。 |
| 青 | int32_t | 青 コンポーネント。 有効な値は 0から 255 です。 |

### ReturnValue

このメソッドが作成する [T:Aspose::Page::Drawing::Color](../) です。

## 参照

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t) method


32 ビット ARGB 値から [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t argb)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| argb | int32_t | 32 ビット ARGB 値を指定する値。 |

### ReturnValue

このメソッドが作成する [T:Aspose::Page::Drawing::Color](../) 構造体。

## 参照

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t) method


指定された 8 ビットカラー値（赤、緑、青）から [T:Aspose::Page::Drawing::Color](../) 構造体を作成します。アルファ値は暗黙的に 255（完全に不透明）です。このメソッドは各カラーコンポーネントに 32 ビット値を渡すことを許可しますが、各コンポーネントの値は 8 ビットに制限されます。

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t red, int32_t green, int32_t blue)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| red | int32_t | 新しい [T:Aspose::Page::Drawing::Color](../) の赤コンポーネント値。 有効な値は 0 から 255 です。 |
| green | int32_t | 新しい [T:Aspose::Page::Drawing::Color](../) の緑コンポーネント値。 有効な値は 0 から 255 です。 |
| blue | int32_t | 新しい [T:Aspose::Page::Drawing::Color](../) の青コンポーネント値。 有効な値は 0 から 255 です。 |

### ReturnValue

このメソッドが作成する [T:Aspose::Page::Drawing::Color](../) です。

## 参照

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
