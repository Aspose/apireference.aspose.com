---
title: "System::Drawing::Graphics::DrawString 메서드"
linktitle: "DrawString"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Graphics::DrawString 메서드. 지정된 문자열을 지정된 위치에 지정된 글꼴과 브러시를 사용하여 C++에서 그립니다."
type: docs
weight: 2800
url: /ko/cpp/system.drawing/graphics/drawstring/
---
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, float, float, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


지정된 폰트와 브러시를 사용하여 지정된 위치에 지정된 문자열을 그립니다.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, float x, float y, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 그릴 문자열 |
| font | const SharedPtr\<Font\>\& | 사용할 글꼴 |
| brush | const SharedPtr\<Brush\>\& | 그리기에 사용할 [Brush](../../brush/) 객체 |
| x | float | 그려진 문자열의 왼쪽 위 모서리 위치의 X 좌표 |
| y | float | 그려진 문자열의 왼쪽 위 모서리 위치의 Y 좌표 |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 문자열의 형식을 지정함 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawString(const String\&, const SharedPtr\<Font\>\&, const SharedPtr\<Brush\>\&, PointF, const System::SharedPtr\<System::Drawing::StringFormat\>\&) method


지정된 폰트와 브러시를 사용하여 지정된 위치에 지정된 문자열을 그립니다.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, PointF topLeft, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 그릴 문자열 |
| font | const SharedPtr\<Font\>\& | 사용할 글꼴 |
| brush | const SharedPtr\<Brush\>\& | 그리기에 사용할 [Brush](../../brush/) 객체 |
| topLeft | PointF | 그려진 문자열의 왼쪽 위 모서리 위치를 지정합니다 |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 문자열의 형식을 지정함 |

## 또 보기

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


지정된 글꼴과 브러시를 사용하여 지정된 사각형 안에 지정된 문자열을 그립니다.

```cpp
void System::Drawing::Graphics::DrawString(const String &str, const SharedPtr<Font> &font, const SharedPtr<Brush> &brush, RectangleF layoutRectangle, const System::SharedPtr<System::Drawing::StringFormat> &stringFormat=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 그릴 문자열 |
| font | const SharedPtr\<Font\>\& | 사용할 글꼴 |
| brush | const SharedPtr\<Brush\>\& | 그리기에 사용할 [Brush](../../brush/) 객체 |
| layoutRectangle | RectangleF | 문자열을 그릴 사각형을 지정합니다 |
| stringFormat | const System::SharedPtr\<System::Drawing::StringFormat\>\& | 문자열의 형식을 지정함 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [Brush](../../brush/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
