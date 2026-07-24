---
title: "Aspose::Page::EPS::GradientBrush class"
linktitle: "GradientBrush"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::GradientBrush class. यह क्लास LinearGradientBrush और PathGradientBrush को संलग्न करने के लिए उपयोग की जाती है, जिसमें रैप मोड को क्लैंप सेट करने की संभावना होती है। नेटिव ग्रेडिएंट ब्रशेस हमेशा एक अपवाद फेंकते हैं जब कोई C++ में WrapMode प्रॉपर्टी को WrapMode.Clamp पर सेट करने की कोशिश करता है।"
type: docs
weight: 300
url: /hi/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


यह क्लास LinearGradientBrush और PathGradientBrush को एन्कैप्सुलेट करने के लिए उपयोग की जाती है, जिसमें रैप मोड को क्लैंप सेट करने की संभावना होती है। नेटिव ग्रेडिएंट ब्रशेस हमेशा एक अपवाद फेंकते हैं जब कोई WrapMode प्रॉपर्टी को WrapMode.Clamp पर सेट करने की कोशिश करता है।

```cpp
class GradientBrush : public System::Drawing::Brush
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() override | इस ब्रश की क्लोन बनाता है। |
| [Dispose](./dispose/)() override | इस [T:Aspose::Page::EPS::GradientBrush](../) ऑब्जेक्ट द्वारा उपयोग किए गए सभी संसाधनों को रिलीज़ करता है। |
| [get_Bounds](./get_bounds/)() const | इस ग्रेडिएंट ब्रश के लिए बाउंड्स लौटाता या निर्दिष्ट करता है। |
| [get_NativeBrush](./get_nativebrush/)() const | नेटिव ग्रेडिएंट ब्रश लौटाता है। |
| [get_WrapMode](./get_wrapmode/)() const | इस ग्रेडिएंट ब्रश के लिए रैप मोड लौटाता या निर्दिष्ट करता है। यह WrapMode.Clamp हो सकता है, जो नेटिव ग्रेडिएंट ब्रशेस में अपवाद फेंकने का परिणाम देता है। |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | नए [GradientBrush](./) का उदाहरण बनाता है। |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | इस ग्रेडिएंट ब्रश के लिए बाउंड्स लौटाता या निर्दिष्ट करता है। |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | इस ग्रेडिएंट ब्रश के लिए रैप मोड लौटाता या निर्दिष्ट करता है। यह WrapMode.Clamp हो सकता है, जो नेटिव ग्रेडिएंट ब्रशेस में अपवाद फेंकने का परिणाम देता है। |
## संबंधित देखें

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
