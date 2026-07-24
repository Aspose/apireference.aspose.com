---
title: "System::Drawing::Region::Equals मेथड"
linktitle: "बराबर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Region::Equals मेथड। यह C++ में निर्दिष्ट ड्राइंग सतह पर निर्दिष्ट क्षेत्र को वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए क्षेत्र के समान है या नहीं निर्धारित करता है।"
type: docs
weight: 600
url: /hi/cpp/system.drawing/region/equals/
---
## Region::Equals method


निर्धारित करता है कि क्या निर्दिष्ट क्षेत्र वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए क्षेत्र के समान है, निर्दिष्ट ड्राइंग सतह पर।

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | इस क्षेत्र की तुलना करने के लिए क्षेत्र |
| g | const SharedPtr\<Graphics\>\& | एक ड्राइंग सतह |

### ReturnValue

सही यदि निर्दिष्ट क्षेत्र का आंतरिक भाग वर्तमान वस्तु द्वारा प्रतिनिधित्व किए गए क्षेत्र के आंतरिक भाग के समान हो जब **g** पैरामीटर से जुड़ा परिवर्तन लागू किया जाता है; अन्यथा - गलत

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
