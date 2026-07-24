---
title: "Aspose::Page::XPS::XpsDocument::CreateColor method"
linktitle: "CreateColor"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateColor method. scRGB 색 공간에서 새로운 색상을 C++로 생성합니다."
type: docs
weight: 1200
url: /ko/cpp/aspose.page.xps/xpsdocument/createcolor/
---
## XpsDocument::CreateColor(float, float, float, float) method


scRGB 색상 공간에서 새 색상을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float a, float r, float g, float b)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | float | 알파 색 구성 요소. |
| r | float | 빨간색 구성 요소. |
| g | float | 녹색 구성 요소. |
| b | float | 파란색 구성 요소. |

### ReturnValue

새 색상.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(float, float, float) method


scRGB 색상 공간에서 새 색상을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float r, float g, float b)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| r | float | 빨간색 구성 요소. |
| g | float | 녹색 구성 요소. |
| b | float | 파란색 구성 요소. |

### ReturnValue

새 색상.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t, int32_t) method


sRGB 색상 공간에서 새 색상을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t a, int32_t r, int32_t g, int32_t b)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| a | int32_t | 알파 색 구성 요소. |
| r | int32_t | 빨간색 구성 요소. |
| g | int32_t | 녹색 구성 요소. |
| b | int32_t | 파란색 구성 요소. |

### ReturnValue

새 색상.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t) method


sRGB 색상 공간에서 새 색상을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t r, int32_t g, int32_t b)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| r | int32_t | 빨간색 구성 요소. |
| g | int32_t | 녹색 구성 요소. |
| b | int32_t | 파란색 구성 요소. |

### ReturnValue

새 색상.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::Drawing::Color) method


새 색상을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::Drawing::Color color)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| color | System::Drawing::Color | RGB 색상에 대한 기본 색상 인스턴스. |

### ReturnValue

새 색상.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [Color](../../../system.drawing/color/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) method


ICC 기반 색상 공간에서 새 색상을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::SharedPtr<XpsModel::XpsIccProfile> iccProfile, const System::ArrayPtr<float> &components)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| iccProfile | System::SharedPtr\<XpsModel::XpsIccProfile\> | ICC 프로필 리소스. |
| 구성 요소 | const System::ArrayPtr\<float\>\& | 색상 구성 요소. |

### ReturnValue

새 색상.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::String, const System::ArrayPtr\<float\>\&) method


ICC 기반 색상 공간에서 새 색상을 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::String path, const System::ArrayPtr<float> &components)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | System::String | ICC 프로필 경로. |
| 구성 요소 | const System::ArrayPtr\<float\>\& | 색상 구성 요소. |

### ReturnValue

새 색상.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
