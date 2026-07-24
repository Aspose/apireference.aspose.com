---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method"
linktitle: "CreateVisualBrush"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method. C++ में एक नया विज़ुअल ब्रश बनाता है।"
type: docs
weight: 2200
url: /hi/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


एक नया विज़ुअल ब्रश बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | यह [XPS](../../../aspose.page.xps/) तत्व (Canvas, Path या Glyphs) विज़ुअल प्रॉपर्टी od विज़ुअल ब्रश के लिए। |
| viewbox | System::Drawing::RectangleF | ब्रश के स्रोत सामग्री की स्थिति और आयाम। |
| व्यूपोर्ट | System::Drawing::RectangleF | प्राइम ब्रश टाइल के समावेशी निर्देशांक स्थान में वह क्षेत्र जो (संभवतः बार‑बार) लागू किया जाता है ताकि उस क्षेत्र को भर सके जहाँ ब्रश लागू किया जाता है। |

### ReturnValue

नया विज़ुअल ब्रश।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
