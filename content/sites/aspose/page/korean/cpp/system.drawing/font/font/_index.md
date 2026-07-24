---
title: "System::Drawing::Font::Font 생성자"
linktitle: "폰트"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Font::Font 생성자. 지정된 기존 폰트와 지정된 폰트 스타일을 나타내는 Font 클래스의 새 인스턴스를 C++에서 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.drawing/font/font/
---
## Font::Font(const SharedPtr\<Font\>\&, FontStyle) constructor


지정된 기존 폰트와 지정된 폰트 스타일을 나타내는 [Font](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::Drawing::Font::Font(const SharedPtr<Font> &prototype, FontStyle new_style)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 프로토타입 | const SharedPtr\<Font\>\& | 새 폰트를 만들기 위한 기존 폰트 |
| new_style | FontStyle | 새 폰트에 적용할 폰트 스타일 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../)
* Enum [FontStyle](../../fontstyle/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


[Font](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 패밀리 | const SharedPtr\<FontFamily\>\& | 새 폰트의 폰트 패밀리 |
| em_size | float | 새 폰트의 em 크기, **unit** 매개변수에 지정된 단위로 |
| style | FontStyle | 새 폰트의 스타일 |
| 단위 | GraphicsUnit | 새 폰트의 측정 단위 |
| gdi_charset | uint8_t | 새 폰트에 사용할 GDI 문자 집합 |
| gdi_vertical_font | bool | 새 폰트가 GDI 수직 폰트에서 파생된 경우 True |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) constructor


[Font](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::Drawing::Font::Font(const SharedPtr<FontFamily> &family, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 패밀리 | const SharedPtr\<FontFamily\>\& | 새 폰트의 폰트 패밀리 |
| em_size | float | 새 폰트의 em 크기, **unit** 매개변수에 지정된 단위로 |
| 단위 | GraphicsUnit | 새 폰트의 측정 단위 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [FontFamily](../../fontfamily/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) constructor


[Font](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, FontStyle style, GraphicsUnit unit=GraphicsUnit::Point, uint8_t gdi_charset=1, bool gdi_vertical_font=false)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| family_name | const String\& | 새 폰트의 폰트 패밀리 이름 |
| em_size | float | 새 폰트의 em 크기, **unit** 매개변수에 지정된 단위로 |
| style | FontStyle | 새 폰트의 스타일 |
| 단위 | GraphicsUnit | 새 폰트의 측정 단위 |
| gdi_charset | uint8_t | 새 폰트에 사용할 GDI 문자 집합 |
| gdi_vertical_font | bool | 새 폰트가 GDI 수직 폰트에서 파생된 경우 True |

## 또 보기

* Class [String](../../../system/string/)
* Enum [FontStyle](../../fontstyle/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Font::Font(const String\&, float, GraphicsUnit) constructor


[Font](../) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::Drawing::Font::Font(const String &family_name, float em_size, GraphicsUnit unit=GraphicsUnit::Point)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| family_name | const String\& | 새 폰트의 폰트 패밀리 이름 |
| em_size | float | 새 폰트의 em 크기, **unit** 매개변수에 지정된 단위로 |
| 단위 | GraphicsUnit | 새 폰트의 측정 단위 |

## 또 보기

* Class [String](../../../system/string/)
* Enum [GraphicsUnit](../../graphicsunit/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
