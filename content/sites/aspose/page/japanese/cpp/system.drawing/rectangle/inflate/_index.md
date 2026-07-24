---
title: "System::Drawing::Rectangle::Inflate メソッド"
linktitle: "拡大"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Rectangle::Inflate メソッド。現在のオブジェクトが表す矩形の幅と高さを増加させ、矩形の幾何学的中心の位置を維持します。幅と高さは、指定されたサイズオブジェクトの幅と高さの値でそれぞれ指定された量だけ両方向に増加します。C++ において。"
type: docs
weight: 1600
url: /ja/cpp/system.drawing/rectangle/inflate/
---
## Rectangle::Inflate(const Size\&) method


現在のオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは、指定されたサイズオブジェクトの幅と高さの値でそれぞれ指定された量だけ両方向に増加します。

```cpp
void System::Drawing::Rectangle::Inflate(const Size &size)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| size | const Size\& | 矩形の幅と高さを増加させる量を指定する [Size](../../size/) オブジェクト |

## 参照

* Class [Size](../../size/)
* Class [Rectangle](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Rectangle::Inflate(int, int) method


現在のオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは指定された量だけ両方向に増加します。

```cpp
void System::Drawing::Rectangle::Inflate(int width, int height)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| width | int | 矩形の幅を両方向に増加させる量 |
| height | int | 矩形の高さを両方向に増加させる量 |

## 参照

* Class [Rectangle](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Rectangle::Inflate(const Rectangle\&, int, int) method


指定されたオブジェクトで表される矩形の幅と高さを、矩形の幾何中心の位置を維持しながら増加させます。幅と高さは指定された量だけ両方向に増加します。

```cpp
static Rectangle System::Drawing::Rectangle::Inflate(const Rectangle &rect, int x, int y)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| rect | const Rectangle\& | 拡大する矩形 |
| x | int | 矩形の幅を両方向に増加させる量 |
| y | int | 矩形の高さを両方向に増加させる量 |

### ReturnValue

拡大された矩形を表す [Rectangle](../) オブジェクト

## 参照

* Class [Rectangle](../)
* Class [Rectangle](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
