---
title: "Aspose::Page::XPS::XpsDocument::CreateIccProfile 메서드"
linktitle: "CreateIccProfile"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateIccProfile method. C++에서 스트림으로부터 새로운 ICC 프로파일 리소스를 생성합니다."
type: docs
weight: 1600
url: /ko/cpp/aspose.page.xps/xpsdocument/createiccprofile/
---
## XpsDocument::CreateIccProfile(System::SharedPtr\<System::IO::Stream\>) method


*stream* 에서 새 ICC 프로파일 리소스를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::SharedPtr<System::IO::Stream> stream)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | System::SharedPtr\<System::IO::Stream\> | 리소스로 사용할 ICC 프로파일을 포함하는 스트림입니다. |

### ReturnValue

새 ICC 프로파일 리소스.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateIccProfile(System::String) method


*iccProfilePath* 에 위치한 ICC 프로파일 파일에서 새 ICC 프로파일 리소스를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::String iccProfilePath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| iccProfilePath | System::String | 리소스로 사용할 ICC 프로파일의 경로입니다. |

### ReturnValue

새 ICC 프로파일 리소스.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
