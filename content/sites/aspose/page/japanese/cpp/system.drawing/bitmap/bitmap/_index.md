---
title: "System::Drawing::Bitmap::Bitmap コンストラクタ"
linktitle: "Bitmap"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Bitmap::Bitmap コンストラクタ。指定された既存の画像から新しい Bitmap オブジェクトを C++ で作成します。"
type: docs
weight: 100
url: /ja/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


指定された既存の画像から新しい [Bitmap](../) オブジェクトを作成します。

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| オリジナル | const SharedPtr\\<Image\\>\\& | ビットマップ画像を作成する元となる既存の画像 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


指定された既存の画像から新しい [Bitmap](../) オブジェクトを作成し、指定されたサイズにスケーリングします。

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| オリジナル | const SharedPtr\\<Image\\>\\& | ビットマップ画像を作成する元となる既存の画像 |
| size | const Size\& | 新しい画像のサイズ |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


指定された既存の画像から新しい [Bitmap](../) オブジェクトを作成し、幅と高さを指定された値にスケーリングします。

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| オリジナル | const SharedPtr\\<Image\\>\\& | ビットマップ画像を作成する元となる既存の画像 |
| width | int | 新しい画像の幅 |
| height | int | 新しい画像の高さ |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


指定されたストリームから新しい [Bitmap](../) オブジェクトを作成します。

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<System::IO::Stream\>\& | 画像データを含むストリーム |
| useIcm | bool | IGNORED |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


指定されたファイルから新しい [Bitmap](../) オブジェクトを作成します。

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | const String\& | 画像データを含むファイルの名前 |

## 参照

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


指定されたファイルから新しい [Bitmap](../) オブジェクトを作成します。

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | const String\& | 画像データを含むファイルの名前 |
| useIcm | bool | IGNORED |

## 参照

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


指定された幅、高さ、ピクセル形式、ピクセルデータを持つビットマップ画像を表す新しい [Bitmap](../) オブジェクトを作成します。

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| width | int | 画像の幅 |
| height | int | 画像の高さ |
| フォーマット | Imaging::PixelFormat | 画像のピクセル形式 |

## 参照

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
