---
title: "System::Drawing::Bitmap::Bitmap 构造函数"
linktitle: "Bitmap"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Bitmap::Bitmap 构造函数。在 C++ 中从指定的现有图像构造一个新的 Bitmap 对象。"
type: docs
weight: 100
url: /zh/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


从指定的现有图像构造一个新的 [Bitmap](../) 对象。

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 原始 | const SharedPtr\<Image\>\& | 用于创建位图图像的现有图像 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


从指定的现有图像构造一个新的 [Bitmap](../) 对象，并按指定尺寸进行缩放。

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 原始 | const SharedPtr\<Image\>\& | 用于创建位图图像的现有图像 |
| size | const Size\& | 新图像的尺寸 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


从指定的现有图像构造一个新的 [Bitmap](../) 对象，宽度和高度按指定值进行缩放。

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 原始 | const SharedPtr\<Image\>\& | 用于创建位图图像的现有图像 |
| width | int | 新图像的宽度 |
| height | int | 新图像的高度 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


从指定的流构造一个新的 [Bitmap](../) 对象。

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<System::IO::Stream\>\& | 包含图像数据的流 |
| useIcm | bool | IGNORED |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


从指定的文件构造一个新的 [Bitmap](../) 对象。

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filename | const String\& | 包含图像数据的文件名 |

## 另见

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


从指定的文件构造一个新的 [Bitmap](../) 对象。

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filename | const String\& | 包含图像数据的文件名 |
| useIcm | bool | IGNORED |

## 另见

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


构造一个新的 [Bitmap](../) 对象，表示具有指定宽度、高度、像素格式和像素数据的位图图像。

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| width | int | 图像的宽度 |
| height | int | 图像的高度 |
| 格式 | Imaging::PixelFormat | 图像的像素格式 |

## 另见

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
