---
title: "Aspose::Page::EPS::PsDocument::FillAndStrokeText 메서드"
linktitle: "FillAndStrokeText"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::FillAndStrokeText 메서드. C++에서 글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다."
type: docs
weight: 2500
url: /ko/cpp/aspose.page.eps/psdocument/fillandstroketext/
---
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| 전진값 | System::ArrayPtr\<float\> | 글리프 너비 배열입니다. 배열 길이는 문자열의 글리프 수와 일치해야 합니다. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../)은 텍스트를 그리는 데 사용됩니다. 사용자 지정 폴더에 있는 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | 글리프 내부를 채우는 데 사용되는 fill. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | 글리프 윤곽을 그리는 데 사용되는 stroke. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| 전진값 | System::ArrayPtr\<float\> | 글리프 너비 배열입니다. 배열 길이는 문자열의 글리프 수와 일치해야 합니다. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/)은 텍스트를 그리는 데 사용되는 폰트입니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | 글리프 내부를 채우는 데 사용되는 fill. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | 글리프 윤곽을 그리는 데 사용되는 stroke. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../)은 텍스트를 그리는 데 사용됩니다. 사용자 지정 폴더에 있는 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | 글리프 내부를 채우는 데 사용되는 fill. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | 글리프 윤곽을 그리는 데 사용되는 stroke. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillAndStrokeText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) method


글리프 내부를 채우고 글리프 윤곽을 그려 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillAndStrokeText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fillPaint, System::SharedPtr<System::Drawing::Pen> stroke)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/)은 텍스트를 그리는 데 사용되는 폰트입니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fillPaint | System::SharedPtr\<System::Drawing::Brush\> | 글리프 내부를 채우는 데 사용되는 fill. |
| stroke | System::SharedPtr\<System::Drawing::Pen\> | 글리프 윤곽을 그리는 데 사용되는 stroke. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [Pen](../../../system.drawing/pen/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
