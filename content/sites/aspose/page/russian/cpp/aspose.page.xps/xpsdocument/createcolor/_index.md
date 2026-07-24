---
title: "Aspose::Page::XPS::XpsDocument::CreateColor method"
linktitle: "CreateColor"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsDocument::CreateColor method. Создаёт новый цвет в цветовом пространстве scRGB в C++."
type: docs
weight: 1200
url: /ru/cpp/aspose.page.xps/xpsdocument/createcolor/
---
## XpsDocument::CreateColor(float, float, float, float) method


Создаёт новый цвет в цветовом пространстве scRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float a, float r, float g, float b)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| a | float | Альфа‑компонент цвета. |
| r | float | Красный компонент цвета. |
| g | float | Зелёный компонент цвета. |
| b | float | Синий компонент цвета. |

### ReturnValue

Новый цвет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(float, float, float) method


Создаёт новый цвет в цветовом пространстве scRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float r, float g, float b)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| r | float | Красный компонент цвета. |
| g | float | Зелёный компонент цвета. |
| b | float | Синий компонент цвета. |

### ReturnValue

Новый цвет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t, int32_t) method


Создаёт новый цвет в цветовом пространстве sRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t a, int32_t r, int32_t g, int32_t b)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| a | int32_t | Альфа‑компонент цвета. |
| r | int32_t | Красный компонент цвета. |
| g | int32_t | Зелёный компонент цвета. |
| b | int32_t | Синий компонент цвета. |

### ReturnValue

Новый цвет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t) method


Создаёт новый цвет в цветовом пространстве sRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t r, int32_t g, int32_t b)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| r | int32_t | Красный компонент цвета. |
| g | int32_t | Зелёный компонент цвета. |
| b | int32_t | Синий компонент цвета. |

### ReturnValue

Новый цвет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::Drawing::Color) method


Создаёт новый цвет.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::Drawing::Color color)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| цвет | System::Drawing::Color | Нативный экземпляр цвета для RGB. |

### ReturnValue

Новый цвет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [Color](../../../system.drawing/color/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) method


Создаёт новый цвет в цветовом пространстве на основе ICC.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::SharedPtr<XpsModel::XpsIccProfile> iccProfile, const System::ArrayPtr<float> &components)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| iccProfile | System::SharedPtr\<XpsModel::XpsIccProfile\> | Ресурс ICC‑профиля. |
| компоненты | const System::ArrayPtr\<float\>\& | Компоненты цвета. |

### ReturnValue

Новый цвет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::String, const System::ArrayPtr\<float\>\&) method


Создаёт новый цвет в цветовом пространстве на основе ICC.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::String path, const System::ArrayPtr<float> &components)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| путь | System::String | Путь к ICC‑профилю. |
| компоненты | const System::ArrayPtr\<float\>\& | Компоненты цвета. |

### ReturnValue

Новый цвет.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
