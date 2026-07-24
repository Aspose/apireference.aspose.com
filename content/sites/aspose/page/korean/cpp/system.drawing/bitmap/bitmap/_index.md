---
title: "System::Drawing::Bitmap::Bitmap constructor"
linktitle: "Bitmap"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Bitmap::Bitmap constructor. 지정된 기존 이미지에서 새로운 Bitmap 객체를 C++에서 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.drawing/bitmap/bitmap/
---
## Bitmap::Bitmap(const SharedPtr\<Image\>\&) constructor


지정된 기존 이미지에서 새로운 [Bitmap](../) 객체를 생성합니다.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 원본 | const SharedPtr\<Image\>\& | 비트맵 이미지를 만들기 위한 기존 이미지 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, const Size\&) constructor


지정된 기존 이미지에서 새로운 [Bitmap](../) 객체를 지정된 크기로 스케일링하여 생성합니다.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, const Size &size)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 원본 | const SharedPtr\<Image\>\& | 비트맵 이미지를 만들기 위한 기존 이미지 |
| size | const Size\& | 새 이미지의 크기 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Size](../../size/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<Image\>\&, int, int) constructor


지정된 기존 이미지에서 새로운 [Bitmap](../) 객체를 너비와 높이를 지정된 값으로 스케일링하여 생성합니다.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<Image> &original, int width, int height)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 원본 | const SharedPtr\<Image\>\& | 비트맵 이미지를 만들기 위한 기존 이미지 |
| width | int | 새 이미지의 너비 |
| height | int | 새 이미지의 높이 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../../image/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const SharedPtr\<System::IO::Stream\>\&, bool) constructor


지정된 스트림에서 새로운 [Bitmap](../) 객체를 생성합니다.

```cpp
System::Drawing::Bitmap::Bitmap(const SharedPtr<System::IO::Stream> &stream, bool useIcm=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<System::IO::Stream\>\& | 이미지 데이터를 포함하는 스트림 |
| useIcm | bool | IGNORED |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&) constructor


지정된 파일에서 새로운 [Bitmap](../) 객체를 생성합니다.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| filename | const String\& | 이미지 데이터를 포함하는 파일의 이름 |

## 또 보기

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(const String\&, bool) constructor


지정된 파일에서 새로운 [Bitmap](../) 객체를 생성합니다.

```cpp
System::Drawing::Bitmap::Bitmap(const String &filename, bool useIcm)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| filename | const String\& | 이미지 데이터를 포함하는 파일의 이름 |
| useIcm | bool | IGNORED |

## 또 보기

* Class [String](../../../system/string/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Bitmap::Bitmap(int, int, Imaging::PixelFormat) constructor


지정된 너비, 높이, 픽셀 형식 및 픽셀 데이터를 가진 비트맵 이미지를 나타내는 새로운 [Bitmap](../) 객체를 생성합니다.

```cpp
System::Drawing::Bitmap::Bitmap(int width, int height, Imaging::PixelFormat format=Imaging::PixelFormat::Format32bppArgb)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| width | int | 이미지의 너비 |
| height | int | 이미지의 높이 |
| 형식 | Imaging::PixelFormat | 이미지의 픽셀 형식 |

## 또 보기

* Enum [PixelFormat](../../../system.drawing.imaging/pixelformat/)
* Class [Bitmap](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
