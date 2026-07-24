---
title: "Aspose::Page::EPS::PsDocument::FillText method"
linktitle: "FillText"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::FillText method. C++에서 글리프 내부를 채워 텍스트 문자열을 추가합니다."
type: docs
weight: 3100
url: /ko/cpp/aspose.page.eps/psdocument/filltext/
---
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


글리프 내부를 채워 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| 전진값 | System::ArrayPtr\<float\> | 글리프 너비 배열입니다. 배열 길이는 문자열의 글리프 수와 일치해야 합니다. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../)은 텍스트를 그리는 데 사용됩니다. 사용자 지정 폴더에 있는 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


글리프 내부를 채워 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| 전진값 | System::ArrayPtr\<float\> | 글리프 너비 배열입니다. 배열 길이는 문자열의 글리프 수와 일치해야 합니다. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../)은 텍스트를 그리는 데 사용됩니다. 사용자 지정 폴더에 있는 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fill | System::SharedPtr\<System::Drawing::Brush\> | 글리프를 그리는 데 사용되는 채우기. |
## 비고



///
## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) method


글리프 내부를 채워 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| 전진값 | System::ArrayPtr\<float\> | 글리프 너비 배열입니다. 배열 길이는 문자열의 글리프 수와 일치해야 합니다. |
| font | System::SharedPtr\<System::Drawing::Font\> | 텍스트를 그리는 데 사용될 폰트. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


글리프 내부를 채워 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::ArrayPtr<float> advances, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| 전진값 | System::ArrayPtr\<float\> | 글리프 너비 배열입니다. 배열 길이는 문자열의 글리프 수와 일치해야 합니다. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/)은 텍스트를 그리는 데 사용되는 폰트입니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fill | System::SharedPtr\<System::Drawing::Brush\> | 글리프를 그리는 데 사용되는 채우기. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) method


글리프 내부를 채워 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../)은 텍스트를 그리는 데 사용됩니다. 사용자 지정 폴더에 있는 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


글리프 내부를 채워 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<Aspose::Page::Font::DrFont> drFont, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| drFont | System::SharedPtr\<Aspose::Page::Font::DrFont\> | [DrFont](../)은 텍스트를 그리는 데 사용됩니다. 사용자 지정 폴더에 있는 사용자 정의 글꼴과 함께 사용할 수 있습니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fill | System::SharedPtr\<System::Drawing::Brush\> | 글리프를 그리는 데 사용되는 채우기. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [DrFont](../../../aspose.page.font/drfont/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) method


글리프 내부를 채워 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/)은 텍스트를 그리는 데 사용되는 폰트입니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::FillText(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) method


글리프 내부를 채워 텍스트 문자열을 추가합니다.

```cpp
void Aspose::Page::EPS::PsDocument::FillText(System::String text, System::SharedPtr<System::Drawing::Font> font, float x, float y, System::SharedPtr<System::Drawing::Brush> fill)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | System::String | 추가할 텍스트. |
| font | System::SharedPtr\<System::Drawing::Font\> | [System](../../../system/)은 텍스트를 그리는 데 사용되는 폰트입니다. |
| x | float | 텍스트 시작점의 X 좌표. |
| y | float | 텍스트 시작점의 Y 좌표. |
| fill | System::SharedPtr\<System::Drawing::Brush\> | 글리프를 그리는 데 사용되는 채우기. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../../system.drawing/font/)
* Class [Brush](../../../system.drawing/brush/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
