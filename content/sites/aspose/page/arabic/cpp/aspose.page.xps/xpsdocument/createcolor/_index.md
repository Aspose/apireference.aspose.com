---
title: "Aspose::Page::XPS::XpsDocument::CreateColor method"
linktitle: "CreateColor"
second_title: "Aspose.Page لـ C++"
description: "Aspose::Page::XPS::XpsDocument::CreateColor method. ينشئ لونًا جديدًا في مساحة اللون scRGB في C++."
type: docs
weight: 1200
url: /ar/cpp/aspose.page.xps/xpsdocument/createcolor/
---
## XpsDocument::CreateColor(float, float, float, float) method


ينشئ لونًا جديدًا في مساحة اللون scRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float a, float r, float g, float b)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| a | عدد عائم | مكوّن اللون ألفا. |
| r | عدد عائم | مكوّن اللون الأحمر. |
| g | عدد عائم | مكوّن اللون الأخضر. |
| b | عدد عائم | مكوّن اللون الأزرق. |

### ReturnValue

لون جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(float, float, float) method


ينشئ لونًا جديدًا في مساحة اللون scRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float r, float g, float b)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| r | عدد عائم | مكوّن اللون الأحمر. |
| g | عدد عائم | مكوّن اللون الأخضر. |
| b | عدد عائم | مكوّن اللون الأزرق. |

### ReturnValue

لون جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t, int32_t) method


ينشئ لونًا جديدًا في مساحة اللون sRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t a, int32_t r, int32_t g, int32_t b)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| a | int32_t | مكوّن اللون ألفا. |
| r | int32_t | مكوّن اللون الأحمر. |
| g | int32_t | مكوّن اللون الأخضر. |
| b | int32_t | مكوّن اللون الأزرق. |

### ReturnValue

لون جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t) method


ينشئ لونًا جديدًا في مساحة اللون sRGB.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t r, int32_t g, int32_t b)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| r | int32_t | مكوّن اللون الأحمر. |
| g | int32_t | مكوّن اللون الأخضر. |
| b | int32_t | مكوّن اللون الأزرق. |

### ReturnValue

لون جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::Drawing::Color) method


ينشئ لونًا جديدًا.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::Drawing::Color color)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| اللون | System::Drawing::Color | مثيل لون أصلي لألوان RGB. |

### ReturnValue

لون جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [Color](../../../system.drawing/color/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) method


ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::SharedPtr<XpsModel::XpsIccProfile> iccProfile, const System::ArrayPtr<float> &components)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| iccProfile | System::SharedPtr\<XpsModel::XpsIccProfile\> | مورد ملف تعريف ICC. |
| المكوّنات | const System::ArrayPtr\<float\>\& | مكوّنات اللون. |

### ReturnValue

لون جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::String, const System::ArrayPtr\<float\>\&) method


ينشئ لونًا جديدًا في مساحة اللون المعتمدة على ICC.

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::String path, const System::ArrayPtr<float> &components)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | System::String | المسار إلى ملف تعريف ICC. |
| المكوّنات | const System::ArrayPtr\<float\>\& | مكوّنات اللون. |

### ReturnValue

لون جديد.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
