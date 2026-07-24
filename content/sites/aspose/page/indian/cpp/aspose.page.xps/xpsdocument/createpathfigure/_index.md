---
title: "Aspose::Page::XPS::XpsDocument::CreatePathFigure method"
linktitle: "CreatePathFigure"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument::CreatePathFigure method. C++ में एक नया पाथ फ़िगर बनाता है।"
type: docs
weight: 2200
url: /hi/cpp/aspose.page.xps/xpsdocument/createpathfigure/
---
## XpsDocument::CreatePathFigure(System::Drawing::PointF, bool) method


एक नया पाथ फ़िगर बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::XpsDocument::CreatePathFigure(System::Drawing::PointF startPoint, bool isClosed=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | पाथ फ़िगर के पहले सेगमेंट के लिए प्रारंभ बिंदु। |
| isClosed | bool | निर्दिष्ट करता है कि पाथ बंद है या नहीं। यदि true सेट किया जाता है, तो स्ट्रोक "closed" रूप में खींचा जाता है, अर्थात पाथ फ़िगर के अंतिम सेगमेंट में अंतिम बिंदु StartPoint एट्रिब्यूट में निर्दिष्ट बिंदु से जुड़ जाता है, अन्यथा स्ट्रोक "open" रूप में खींचा जाता है, और अंतिम बिंदु प्रारंभ बिंदु से जुड़ा नहीं रहता। यह केवल तब लागू होता है जब पाथ फ़िगर को ऐसे Path एलिमेंट में उपयोग किया जाता है जो स्ट्रोक निर्दिष्ट करता है। |

### ReturnValue

नया पाथ फ़िगर।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreatePathFigure(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) method


एक नया पाथ फ़िगर बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsPathFigure> Aspose::Page::XPS::XpsDocument::CreatePathFigure(System::Drawing::PointF startPoint, System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsPathSegment>>> segments, bool isClosed=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startPoint | System::Drawing::PointF | पाथ फ़िगर के पहले सेगमेंट के लिए प्रारंभ बिंदु। |
| सेगमेंट्स | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\> | पाथ सेगमेंट्स की सूची। |
| isClosed | bool | निर्दिष्ट करता है कि पाथ बंद है या नहीं। यदि true सेट किया जाता है, तो स्ट्रोक "closed" रूप में खींचा जाता है, अर्थात पाथ फ़िगर के अंतिम सेगमेंट में अंतिम बिंदु StartPoint एट्रिब्यूट में निर्दिष्ट बिंदु से जुड़ जाता है, अन्यथा स्ट्रोक "open" रूप में खींचा जाता है, और अंतिम बिंदु प्रारंभ बिंदु से जुड़ा नहीं रहता। यह केवल तब लागू होता है जब पाथ फ़िगर को ऐसे Path एलिमेंट में उपयोग किया जाता है जो स्ट्रोक निर्दिष्ट करता है। |

### ReturnValue

नया पाथ फ़िगर।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
