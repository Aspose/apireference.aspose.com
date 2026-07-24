---
title: "Aspose::Page::XPS::XpsDocument::CreateColor method"
linktitle: "CreateColor"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreateColor 方法。 在 C++ 中创建 scRGB 颜色空间中的新颜色。"
type: docs
weight: 1200
url: /zh/cpp/aspose.page.xps/xpsdocument/createcolor/
---
## XpsDocument::CreateColor(float, float, float, float) method


在 scRGB 颜色空间中创建一种新颜色。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float a, float r, float g, float b)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | 单精度浮点数 | Alpha 颜色分量。 |
| r | 单精度浮点数 | 红色分量。 |
| g | 单精度浮点数 | 绿色分量。 |
| b | 单精度浮点数 | 蓝色分量。 |

### ReturnValue

新颜色。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(float, float, float) method


在 scRGB 颜色空间中创建一种新颜色。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float r, float g, float b)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| r | 单精度浮点数 | 红色分量。 |
| g | 单精度浮点数 | 绿色分量。 |
| b | 单精度浮点数 | 蓝色分量。 |

### ReturnValue

新颜色。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t, int32_t) method


在 sRGB 颜色空间中创建一种新颜色。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t a, int32_t r, int32_t g, int32_t b)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 一个 | int32_t | Alpha 颜色分量。 |
| r | int32_t | 红色分量。 |
| g | int32_t | 绿色分量。 |
| b | int32_t | 蓝色分量。 |

### ReturnValue

新颜色。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t) method


在 sRGB 颜色空间中创建一种新颜色。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t r, int32_t g, int32_t b)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| r | int32_t | 红色分量。 |
| g | int32_t | 绿色分量。 |
| b | int32_t | 蓝色分量。 |

### ReturnValue

新颜色。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::Drawing::Color) method


创建一种新颜色。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::Drawing::Color color)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| color | System::Drawing::Color | RGB 颜色的本机颜色实例。 |

### ReturnValue

新颜色。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [Color](../../../system.drawing/color/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) method


在基于 ICC 的颜色空间中创建一种新颜色。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::SharedPtr<XpsModel::XpsIccProfile> iccProfile, const System::ArrayPtr<float> &components)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| iccProfile | System::SharedPtr\<XpsModel::XpsIccProfile\> | ICC 配置文件资源。 |
| 组件 | const System::ArrayPtr\<float\>\& | 颜色分量。 |

### ReturnValue

新颜色。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::String, const System::ArrayPtr\<float\>\&) method


在基于 ICC 的颜色空间中创建一种新颜色。

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::String path, const System::ArrayPtr<float> &components)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 路径 | System::String | ICC 配置文件的路径。 |
| 组件 | const System::ArrayPtr\<float\>\& | 颜色分量。 |

### ReturnValue

新颜色。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
