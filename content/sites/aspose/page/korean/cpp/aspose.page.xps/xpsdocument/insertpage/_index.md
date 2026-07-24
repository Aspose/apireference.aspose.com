---
title: "Aspose::Page::XPS::XpsDocument::InsertPage 메서드"
linktitle: "InsertPage"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::InsertPage 메서드. C++에서 인덱스 위치에 기본 페이지 크기의 빈 페이지를 문서에 삽입합니다."
type: docs
weight: 4500
url: /ko/cpp/aspose.page.xps/xpsdocument/insertpage/
---
## XpsDocument::InsertPage(int32_t, bool) method


*index* 위치에 기본 페이지 크기의 빈 페이지를 문서에 삽입합니다.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, bool activate=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int32_t | 페이지를 삽입할 위치. |
| 활성화 | bool | 삽입된 페이지를 활성 페이지로 선택할지 여부를 나타내는 플래그. |

### ReturnValue

삽입된 페이지.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, float, float, bool) method


*index* 위치에 지정된 *width* 와 *height* 로 빈 페이지를 문서에 삽입합니다.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, float width, float height, bool activate=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int32_t | 페이지를 삽입할 위치. |
| width | float | 새 페이지의 너비. |
| height | float | 새 페이지의 높이. |
| 활성화 | bool | 삽입된 페이지를 활성 페이지로 선택할지 여부를 나타내는 플래그. |

### ReturnValue

삽입된 페이지.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) method


*index* 위치에 페이지를 문서에 삽입합니다.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int32_t | 페이지를 추가할 위치. |
| page | System::SharedPtr\<XpsModel::XpsPage\> | 삽입될 [Page](../../../aspose.page/). |
| 활성화 | bool | 삽입된 페이지를 활성 페이지로 선택할지 여부를 나타내는 플래그. |

### ReturnValue

삽입된 페이지.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
