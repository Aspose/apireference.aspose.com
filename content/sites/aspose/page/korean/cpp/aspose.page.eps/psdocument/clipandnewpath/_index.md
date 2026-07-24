---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath 메서드. 현재 그래픽 상태에 클립을 추가하고 이어서 \"newpath\" 연산자를 기록합니다. 이는 이 클리핑 경로와 이후에 \"charpath\" 연산자로 윤곽이 그려지는 글리프와 같은 일부 경로가 겹치는 것을 방지하기 위해 필요합니다. C++에서."
type: docs
weight: 300
url: /ko/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


현재 그래픽 상태에 클립을 추가하고 "newpath" 연산자를 기록합니다. 이는 이 클리핑 경로와 이후의 경로(예: "charpath" 연산자로 윤곽이 그려진 글리프)와의 결합을 피하기 위해 필요합니다.

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | 클리핑 경로. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
