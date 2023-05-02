---
title: Delegate Graphics.DrawImageAbort
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: कब तय करने के लए कलबैक वध प्रदन करत हैDrawImage वध क समय से पहले नष्पदन रद्द कर देन चहए और एक छव बनन बंद कर देन चहए
type: docs
weight: 540
url: /hi/net/system.drawing/graphics.drawimageabort/
---
## Graphics.DrawImageAbort delegate

कब तय करने के लिए कॉलबैक विधि प्रदान करता है[`DrawImage`](../graphics/drawimage/) विधि को समय से पहले निष्पादन रद्द कर देना चाहिए और एक छवि बनाना बंद कर देना चाहिए।

```csharp
public delegate bool DrawImageAbort(IntPtr callbackdata);
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| callbackdata | IntPtr | आंतरिक सूचक जो कॉलबैक विधि के लिए डेटा निर्दिष्ट करता है। यह पैरामीटर सभी के द्वारा पारित नहीं किया गया है[`DrawImage`](../graphics/drawimage/) अधिभार। आप मूल्य की जांच करके इसकी अनुपस्थिति का परीक्षण कर सकते हैंZero . |

### प्रतिलाभ की मात्रा

यह विधि सत्य लौटाती है यदि यह निर्णय लेती है कि[`DrawImage`](../graphics/drawimage/) विधि को समय से पहले निष्पादन बंद कर देना चाहिए। अन्यथा यह इंगित करने के लिए गलत रिटर्न देता है कि[`DrawImage`](../graphics/drawimage/) विधि निष्पादन जारी रखना चाहिए।

### यह सभी देखें

* class [Graphics](../graphics/)
* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


