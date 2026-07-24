---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method. C++ में एक नया इमेज ब्रश बनाता है।"
type: docs
weight: 1800
url: /hi/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


एक नया इमेज ब्रश बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| छवि | System::SharedPtr\<XpsModel::XpsImage\> | एक छवि संसाधन। |
| viewbox | System::Drawing::RectangleF | ब्रश के स्रोत सामग्री की स्थिति और आयाम। |
| व्यूपोर्ट | System::Drawing::RectangleF | प्राइम ब्रश टाइल के समावेशी निर्देशांक स्थान में वह क्षेत्र जो (संभवतः बार‑बार) लागू किया जाता है ताकि उस क्षेत्र को भर सके जहाँ ब्रश लागू किया जाता है। |

### ReturnValue

नया इमेज ब्रश।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


एक नया इमेज ब्रश बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| imagePath | System::String | ब्रश टाइल के रूप में उपयोग करने के लिए छवि का पाथ। |
| viewbox | System::Drawing::RectangleF | ब्रश के स्रोत सामग्री की स्थिति और आयाम। |
| व्यूपोर्ट | System::Drawing::RectangleF | प्राइम ब्रश टाइल के समावेशी निर्देशांक स्थान में वह क्षेत्र जो (संभवतः बार‑बार) लागू किया जाता है ताकि उस क्षेत्र को भर सके जहाँ ब्रश लागू किया जाता है। |

### ReturnValue

नया इमेज ब्रश।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
