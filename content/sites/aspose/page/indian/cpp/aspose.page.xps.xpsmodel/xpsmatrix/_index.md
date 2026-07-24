---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix क्लास"
linktitle: "XpsMatrix"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix क्लास। MatrixTransform प्रॉपर्टी एलिमेंट विशेषताओं को समाहित करने वाली क्लास। यह एलिमेंट C++ में तत्वों के कोऑर्डिनेट सिस्टम को बदलने के लिए उपयोग किए जाने वाले एक मनमाने एफ़ाइन मैट्रिक्स ट्रांसफ़ॉर्मेशन को परिभाषित करता है।"
type: docs
weight: 2600
url: /hi/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


MatrixTransform प्रॉपर्टी तत्व की विशेषताओं को समाहित करने वाली क्लास। यह तत्व तत्वों के समन्वय प्रणाली को बदलने के लिए उपयोग की जाने वाली एक मनमानी अफाइन मैट्रिक्स ट्रांसफ़ॉर्मेशन को परिभाषित करता है।

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Clone](./clone/)() | इस ट्रांसफ़ॉर्मेशन मैट्रिक्स की क्लोन बनाता है। |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | निर्धारित करता है कि निर्दिष्ट [System::Object](../../system/object/) इस इंस्टेंस के बराबर है या नहीं। |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | वास्तविक कार्यान्वयन। |
| [get_IsIdentity](./get_isidentity/)() | एक मान प्राप्त करता है जो दर्शाता है कि यह इंस्टेंस आइडेंटिटी मैट्रिक्स है या नहीं। |
| [get_M11](./get_m11/)() | M11 तत्व प्राप्त करता है। |
| [get_M12](./get_m12/)() | M12 तत्व प्राप्त करता है। |
| [get_M21](./get_m21/)() | M21 तत्व प्राप्त करता है। |
| [get_M22](./get_m22/)() | M22 तत्व प्राप्त करता है। |
| [get_M31](./get_m31/)() | M31 तत्व प्राप्त करता है। |
| [get_M32](./get_m32/)() | M32 तत्व प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | इस इंस्टेंस के लिए एक हैश कोड लौटाता है। |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | इस मैट्रिक्स को *matrix* द्वारा निर्दिष्ट मैट्रिक्स से *matrixOrder* द्वारा निर्दिष्ट क्रम में गुणा करता है। |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | डिफ़ॉल्ट (Prepend) क्रम में *matrix* द्वारा निर्दिष्ट मैट्रिक्स से इस मैट्रिक्स को गुणा करता है। |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | इस मैट्रिक्स को *matrix* द्वारा निर्दिष्ट मैट्रिक्स से *matrixOrder* द्वारा निर्दिष्ट क्रम में गुणा करता है। |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | डिफ़ॉल्ट (Prepend) क्रम में *matrix* द्वारा निर्दिष्ट मैट्रिक्स से इस मैट्रिक्स को गुणा करता है। |
| [Reset](./reset/)() | इस मैट्रिक्स को पहचान मैट्रिक्स में रीसेट करता है। |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* द्वारा निर्दिष्ट क्रम में इस मैट्रिक्स पर *angle* घड़ी की दिशा में घुमाव लागू करता है। |
| [Rotate](./rotate/)(float) | डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स पर *angle* घड़ी की दिशा में घुमाव लागू करता है। |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* द्वारा निर्दिष्ट क्रम में *pivot* के चारों ओर इस मैट्रिक्स पर *angle* घड़ी की दिशा में घुमाव लागू करता है। |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | डिफ़ॉल्ट (Prepend) क्रम में *pivot* के चारों ओर इस मैट्रिक्स पर *angle* घड़ी की दिशा में घुमाव लागू करता है। |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* द्वारा निर्दिष्ट क्रम में इस मैट्रिक्स पर निर्दिष्ट स्केल वेक्टर (scaleX और scaleY) लागू करता है। |
| [Scale](./scale/)(float, float) | डिफ़ॉल्ट (Prepend) क्रम में इस मैट्रिक्स पर निर्दिष्ट स्केल वेक्टर (scaleX और scaleY) लागू करता है। |
| [Skew](./skew/)(double, double) | इस मैट्रिक्स पर निर्दिष्ट स्क्यू परिवर्तन लागू करता है। |
| [ToString](./tostring/)() const override | इस [XpsMatrix](./) इंस्टेंस का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| [Transform](./transform/)(System::Drawing::RectangleF) | इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को निर्दिष्ट आयत पर लागू करता है। |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को निर्दिष्ट बिंदु पर लागू करता है। |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को बिंदुओं की सरणी के निर्दिष्ट भाग पर लागू करता है। |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | इस मैट्रिक्स द्वारा प्रतिनिधित्व किए गए अफ़ाइन ट्रांसफ़ॉर्मेशन को बिंदुओं की निर्दिष्ट सरणी पर लागू करता है। |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | *matrixOrder* द्वारा निर्दिष्ट क्रम में इस मैट्रिक्स पर निर्दिष्ट ट्रांसलेशन वेक्टर लागू करता है। |
| [Translate](./translate/)(float, float) | इस मैट्रिक्स पर निर्दिष्ट ट्रांसलेशन वेक्टर लागू करता है। |
## संबंधित देखें

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
