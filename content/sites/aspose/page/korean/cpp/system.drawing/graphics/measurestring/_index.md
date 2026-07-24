---
title: "System::Drawing::Graphics::MeasureString 메서드"
linktitle: "MeasureString"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Graphics::MeasureString 메서드. 지정된 글꼴과 지정된 형식으로 C++에서 문자열을 그렸을 때 해당 문자열의 크기를 반환합니다."
type: docs
weight: 6500
url: /ko/cpp/system.drawing/graphics/measurestring/
---
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, int, System::SharedPtr\<StringFormat\> const\&) const method


지정된 형식과 지정된 글꼴로 그려졌을 때 지정된 문자열의 크기를 반환합니다.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, int width, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | String const\& | 크기를 계산할 문자열 |
| font | System::SharedPtr\<Font\> const\& | 문자열을 그리는 데 사용되는 글꼴 |
| width | int | 문자열의 최대 너비 |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 문자열 형식을 지정합니다 |

### ReturnValue

현재 Grapphics 객체의 PageUnit 속성으로 지정된 측정 단위로 문자열의 크기를 나타내는 [SizeF](../../sizef/) 객체.

## 또 보기

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, PointF const\&, System::SharedPtr\<StringFormat\> const\&) const method


지정된 형식과 지정된 글꼴로 그려졌을 때 지정된 문자열의 크기를 반환합니다.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, PointF const &origin=PointF(0, 0), System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | String const\& | 크기를 계산할 문자열 |
| font | System::SharedPtr\<Font\> const\& | 문자열을 그리는 데 사용되는 글꼴 |
| origin | PointF const\& | 문자열의 왼쪽 위 모서리 위치를 지정합니다 |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 문자열 형식을 지정합니다 |

### ReturnValue

현재 Grapphics 객체의 PageUnit 속성으로 지정된 측정 단위로 문자열의 크기를 나타내는 [SizeF](../../sizef/) 객체.

## 또 보기

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


구현되지 않음.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat, int &charactersFitted, int &linesFilled) const
```


## 또 보기

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::MeasureString(String const\&, System::SharedPtr\<Font\> const\&, SizeF const\&, System::SharedPtr\<StringFormat\> const\&) const method


지정된 형식과 지정된 글꼴로 그려졌을 때 지정된 문자열의 크기를 반환합니다.

```cpp
SizeF System::Drawing::Graphics::MeasureString(String const &str, System::SharedPtr<Font> const &font, SizeF const &layoutArea, System::SharedPtr<StringFormat> const &stringFormat=nullptr) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | String const\& | 크기를 계산할 문자열 |
| font | System::SharedPtr\<Font\> const\& | 문자열을 그리는 데 사용되는 글꼴 |
| layoutArea | SizeF const\& | 문자열의 최대 레이아웃 영역 |
| stringFormat | System::SharedPtr\<StringFormat\> const\& | 문자열 형식을 지정합니다 |

### ReturnValue

현재 Grapphics 객체의 PageUnit 속성으로 지정된 측정 단위로 문자열의 크기를 나타내는 [SizeF](../../sizef/) 객체.

## 또 보기

* Class [SizeF](../../sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
