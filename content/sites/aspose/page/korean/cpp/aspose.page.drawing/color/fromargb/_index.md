---
title: "Aspose::Page::Drawing::Color::FromArgb 메서드"
linktitle: "FromArgb"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Drawing::Color::FromArgb 메서드. 지정된 T:Aspose::Page::Drawing::Color 구조체에서 새로운 지정 알파 값으로 T:Aspose::Page::Drawing::Color 구조체를 생성합니다. 이 메서드는 알파 값에 32비트 값을 전달할 수 있도록 허용하지만, C++에서는 값이 8비트로 제한됩니다."
type: docs
weight: 100
url: /ko/cpp/aspose.page.drawing/color/fromargb/
---
## Color::FromArgb(int32_t, Aspose::Page::Drawing::Color) method


지정된 [T:Aspose::Page::Drawing::Color](../) 구조체와 새로운 알파 값을 사용하여 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다. 이 메서드는 알파 값에 32비트 값을 전달할 수 있지만, 값은 8비트로 제한됩니다.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, Aspose::Page::Drawing::Color baseColor)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| alpha | int32_t | 새로운 [T:Aspose::Page::Drawing::Color](../)의 알파 값입니다. 유효한 값은 0부터 255까지입니다. |
| baseColor | Aspose::Page::Drawing::Color | 새로운 [T:Aspose::Page::Drawing::Color](../)을 생성할 원본 [T:Aspose::Page::Drawing::Color](../)입니다. |

### ReturnValue

이 메서드가 생성하는 [T:Aspose::Page::Drawing::Color](../)입니다.

## 또 보기

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t, int32_t) method


네 개의 ARGB 구성 요소(알파, 빨강, 초록, 파랑) 값으로부터 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다. 이 메서드는 각 구성 요소에 32비트 값을 전달할 수 있지만, 각 구성 요소의 값은 8비트로 제한됩니다.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, int32_t red, int32_t green, int32_t blue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| alpha | int32_t | 알파 구성 요소입니다. 유효한 값은 0부터 255까지입니다. |
| red | int32_t | 빨간색 구성 요소입니다. 유효한 값는 0부터 255까지입니다. |
| green | int32_t | 녹색 구성 요소입니다. 유효한 값은 0부터 255까지입니다. |
| 파란색 | int32_t | 파란색 구성 요소입니다. 유효한 값은 0부터 255까지입니다. |

### ReturnValue

이 메서드가 생성하는 [T:Aspose::Page::Drawing::Color](../)입니다.

## 또 보기

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t) method


32비트 ARGB 값으로부터 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t argb)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| argb | int32_t | 32비트 ARGB 값을 지정하는 값입니다. |

### ReturnValue

이 메서드가 생성하는 [T:Aspose::Page::Drawing::Color](../) 구조체입니다.

## 또 보기

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t) method


지정된 8비트 색상 값(빨강, 초록, 파랑)으로부터 [T:Aspose::Page::Drawing::Color](../) 구조체를 생성합니다. 알파 값은 암시적으로 255(완전 불투명)입니다. 이 메서드는 각 색상 구성 요소에 32비트 값을 전달할 수 있지만, 각 구성 요소의 값은 8비트로 제한됩니다.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t red, int32_t green, int32_t blue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| red | int32_t | 새로운 [T:Aspose::Page::Drawing::Color](../)의 빨간색 구성 요소 값입니다. 유효한 값은 0부터 255까지입니다. |
| green | int32_t | 새로운 [T:Aspose::Page::Drawing::Color](../)의 녹색 구성 요소 값입니다. 유효한 값은 0부터 255까지입니다. |
| blue | int32_t | 새로운 [T:Aspose::Page::Drawing::Color](../)의 파란색 구성 요소 값입니다. 유효한 값은 0부터 255까지입니다. |

### ReturnValue

이 메서드가 생성하는 [T:Aspose::Page::Drawing::Color](../)입니다.

## 또 보기

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
