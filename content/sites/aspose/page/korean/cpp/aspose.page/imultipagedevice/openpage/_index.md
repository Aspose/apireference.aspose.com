---
title: "Aspose::Page::IMultiPageDevice::OpenPage 메서드"
linktitle: "OpenPage"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::IMultiPageDevice::OpenPage 메서드. C++에서 각 페이지를 렌더링하기 전에 장치를 필요한대로 준비합니다."
type: docs
weight: 400
url: /ko/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


각 페이지 렌더링 전에 디바이스에 필요한 준비를 수행합니다.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| width | float | 페이지의 너비. |
| height | float | 페이지의 높이. |

### ReturnValue

선택된 페이지 번호 범위에 해당하는 번호를 가진 열린 페이지인 경우 true를 반환하고, 그렇지 않으면 false를 반환합니다.

## 또 보기

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


페이지 렌더링 전에 디바이스에 필요한 준비를 수행합니다.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| title | System::String | 페이지 제목. |

### ReturnValue

페이지가 요청된 범위에 속하면 true, 그렇지 않으면 false를 반환합니다. 지정된 페이지 번호 배열을 렌더링할 수 있는 장치에서 사용됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
