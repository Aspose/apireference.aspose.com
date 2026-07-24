---
title: "Aspose::Page::XPS::XpsDocument::CreateColor method"
linktitle: "CreateColor"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument::CreateColor method. C++ में scRGB कलर स्पेस में एक नया रंग बनाता है।"
type: docs
weight: 1200
url: /hi/cpp/aspose.page.xps/xpsdocument/createcolor/
---
## XpsDocument::CreateColor(float, float, float, float) method


scRGB रंग स्थान में एक नया रंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float a, float r, float g, float b)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एक | फ़्लोट | अल्फा रंग घटक। |
| r | फ़्लोट | लाल रंग घटक। |
| g | फ़्लोट | हरा रंग घटक। |
| b | फ़्लोट | नीला रंग घटक। |

### ReturnValue

नया रंग।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(float, float, float) method


scRGB रंग स्थान में एक नया रंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(float r, float g, float b)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| r | फ़्लोट | लाल रंग घटक। |
| g | फ़्लोट | हरा रंग घटक। |
| b | फ़्लोट | नीला रंग घटक। |

### ReturnValue

नया रंग।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t, int32_t) method


sRGB रंग स्थान में एक नया रंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t a, int32_t r, int32_t g, int32_t b)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| एक | int32_t | अल्फा रंग घटक। |
| r | int32_t | लाल रंग घटक। |
| g | int32_t | हरा रंग घटक। |
| b | int32_t | नीला रंग घटक। |

### ReturnValue

नया रंग।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(int32_t, int32_t, int32_t) method


sRGB रंग स्थान में एक नया रंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(int32_t r, int32_t g, int32_t b)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| r | int32_t | लाल रंग घटक। |
| g | int32_t | हरा रंग घटक। |
| b | int32_t | नीला रंग घटक। |

### ReturnValue

नया रंग।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::Drawing::Color) method


एक नया रंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::Drawing::Color color)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| color | System::Drawing::Color | RGB रंग के लिए एक मूल रंग उदाहरण। |

### ReturnValue

नया रंग।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [Color](../../../system.drawing/color/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) method


ICC-आधारित रंग स्थान में एक नया रंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::SharedPtr<XpsModel::XpsIccProfile> iccProfile, const System::ArrayPtr<float> &components)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| iccProfile | System::SharedPtr\<XpsModel::XpsIccProfile\> | ICC प्रोफ़ाइल संसाधन। |
| घटक | const System::ArrayPtr\<float\>\& | रंग घटक। |

### ReturnValue

नया रंग।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateColor(System::String, const System::ArrayPtr\<float\>\&) method


ICC-आधारित रंग स्थान में एक नया रंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsColor> Aspose::Page::XPS::XpsDocument::CreateColor(System::String path, const System::ArrayPtr<float> &components)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | System::String | ICC प्रोफ़ाइल का पथ। |
| घटक | const System::ArrayPtr\<float\>\& | रंग घटक। |

### ReturnValue

नया रंग।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsColor](../../../aspose.page.xps.xpsmodel/xpscolor/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
