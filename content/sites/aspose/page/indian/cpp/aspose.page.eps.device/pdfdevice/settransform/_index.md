---
title: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method"
linktitle: "SetTransform"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::EPS::Device::PdfDevice::SetTransform method. वर्तमान ट्रांसफ़ॉर्म को निर्दिष्ट करता है। चूँकि अधिकांश आउटपुट फ़ॉर्मेट इस कार्यक्षमता को लागू नहीं करते हैं, वर्तमान ट्रांसफ़ॉर्म का इनवर्स ट्रांसफ़ॉर्म गणना किया जाता है और सेट किए जाने वाले ट्रांसफ़ॉर्म से गुणा किया जाता है। परिणाम फिर C++ में writeTransform(Transform) कॉल द्वारा अग्रेषित किया जाता है।"
type: docs
weight: 5800
url: /hi/cpp/aspose.page.eps.device/pdfdevice/settransform/
---
## PdfDevice::SetTransform method


वर्तमान ट्रांसफ़ॉर्म को निर्दिष्ट करता है। चूँकि अधिकांश आउटपुट फ़ॉर्मेट इस कार्यक्षमता को लागू नहीं करते हैं, वर्तमान ट्रांसफ़ॉर्म का इनवर्स ट्रांसफ़ॉर्म गणना किया जाता है और सेट किए जाने वाले ट्रांसफ़ॉर्म से गुणा किया जाता है। परिणाम फिर writeTransform(Transform) कॉल द्वारा अग्रेषित किया जाता है।

```cpp
void Aspose::Page::EPS::Device::PdfDevice::SetTransform(System::SharedPtr<System::Drawing::Drawing2D::Matrix> transform) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ट्रांसफ़ॉर्म | System::SharedPtr\<System::Drawing::Drawing2D::Matrix\> | लागू करने के लिए ट्रांसफ़ॉर्म। |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Matrix](../../../system.drawing.drawing2d/matrix/)
* Class [PdfDevice](../)
* Namespace [Aspose::Page::EPS::Device](../../)
* Library [Aspose.Page for C++](../../../)
