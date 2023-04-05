---
title: Class XpsMatrix
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsMatrix कक्ष. क्लस इनकैप्सुलेटंग मैट्रक्सट्रंसफर्म प्रपर्ट एलमेंट फचर्स यह एलमेंट तत्वं के नर्देशंक सस्टम में हेरफेर करने के लए उपयग कए जने वले मनमने ढंग से एफ़न मैट्रक्स ट्रंसफ़र्मेशन क परभषत करत है
type: docs
weight: 3210
url: /hi/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

क्लास इनकैप्सुलेटिंग मैट्रिक्सट्रांसफॉर्म प्रॉपर्टी एलिमेंट फीचर्स। यह एलिमेंट तत्वों के निर्देशांक सिस्टम में हेरफेर करने के लिए उपयोग किए जाने वाले मनमाने ढंग से एफ़िन मैट्रिक्स ट्रांसफ़ॉर्मेशन को परिभाषित करता है।

```csharp
public sealed class XpsMatrix : XpsObject
```

## गुण

| नाम | विवरण |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | एक मान प्राप्त करता है जो दर्शाता है कि यह उदाहरण पहचान मैट्रिक्स है। |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | M11 तत्व प्राप्त करता है। |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | M12 तत्व प्राप्त करता है। |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | M21 तत्व प्राप्त करता है। |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | M22 तत्व प्राप्त करता है। |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | M31 तत्व प्राप्त करता है। |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | M32 तत्व प्राप्त करता है। |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | इस रूपांतरण मैट्रिक्स को क्लोन करता है। |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | निर्धारित करता है कि निर्दिष्ट किया गया है या नहींObject इस उदाहरण के बराबर है. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | इस उदाहरण के लिए एक हैश कोड लौटाता है। |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | इस मैट्रिक्स को इसके द्वारा निर्दिष्ट मैट्रिक्स से गुणा करता है*matrix* डिफ़ॉल्ट रूप से (प्रीपेन्ड) आदेश. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | इस मैट्रिक्स को इसके द्वारा निर्दिष्ट मैट्रिक्स से गुणा करता है*matrix* डिफ़ॉल्ट रूप से (प्रीपेन्ड) आदेश. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | इस मैट्रिक्स को इसके द्वारा निर्दिष्ट मैट्रिक्स से गुणा करता है*matrix* द्वारा निर्दिष्ट क्रम में*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | इस मैट्रिक्स को इसके द्वारा निर्दिष्ट मैट्रिक्स से गुणा करता है*matrix* द्वारा निर्दिष्ट क्रम में*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | इस मैट्रिक्स को पहचान मैट्रिक्स पर रीसेट करता है। |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | दक्षिणावर्त घुमाव को लागू करता है*angle* इस मैट्रिक्स को डिफ़ॉल्ट (प्रीपेंड) क्रम में। |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | दक्षिणावर्त घुमाव को लागू करता है*angle* द्वारा निर्दिष्ट क्रम में इस मैट्रिक्स के लिए*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | दक्षिणावर्त घुमाव को लागू करता है*angle* चारों ओर*pivot* इस मैट्रिक्स में डिफ़ॉल्ट (प्रीपेन्ड) क्रम में। |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | दक्षिणावर्त घुमाव को लागू करता है*angle* चारों ओर*pivot* द्वारा निर्दिष्ट क्रम में इस मैट्रिक्स के लिए*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | निर्दिष्ट स्केल वेक्टर (स्केलएक्स और स्केलवाई) को इस मैट्रिक्स में डिफ़ॉल्ट (प्रीपेंड) क्रम में लागू करता है। |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | निर्दिष्ट स्केल वेक्टर (स्केलएक्स और स्केलवाई) को इस मैट्रिक्स पर क्रम द्वारा निर्दिष्ट क्रम में लागू करता है*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | इस मैट्रिक्स में निर्दिष्ट तिरछा परिवर्तन लागू करता है। |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | इसका स्ट्रिंग प्रतिनिधित्व लौटाता है`XpsMatrix` उदाहरण. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | इस मैट्रिक्स द्वारा दर्शाए गए affine परिवर्तन को एक निर्दिष्ट आयत पर लागू करता है। |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | इस मैट्रिक्स द्वारा दर्शाए गए affine परिवर्तन को एक निर्दिष्ट बिंदु पर लागू करता है। |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | इस मैट्रिक्स द्वारा दर्शाए गए एफाइन ट्रांसफ़ॉर्मेशन को बिंदुओं के निर्दिष्ट सरणी पर लागू करता है। |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | इस मैट्रिक्स द्वारा दर्शाए गए एफाइन ट्रांसफ़ॉर्मेशन को पॉइंट्स की सरणी के निर्दिष्ट भाग पर लागू करता है। |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | निर्दिष्ट अनुवाद वेक्टर को इस मैट्रिक्स पर लागू करता है। |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | द्वारा निर्दिष्ट क्रम में निर्दिष्ट अनुवाद वेक्टर को इस मैट्रिक्स पर लागू करता है*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | वास्तविक कार्यान्वयन। |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | ऑपरेटर लागू करता है ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | ऑपरेटर को लागू करता है!=. |

### यह सभी देखें

* class [XpsObject](../xpsobject/)
* नाम स्थान [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* सभा [Aspose.Page](../../)


