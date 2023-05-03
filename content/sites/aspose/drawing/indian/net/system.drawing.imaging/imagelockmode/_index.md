---
title: Enum ImageLockMode
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: System.Drawing.Imaging.ImageLockMode एनुम. उन फ़्लैग्स क नर्दष्ट करत है ज फ़्लैग्स पैरमटर क पस कए जते हैंLockBits वध. दLockBits वध एक छव के एक हस्से क लक कर देत है तक आप पक्सेल डेट क पढ़ य लख सकें
type: docs
weight: 780
url: /hi/net/system.drawing.imaging/imagelockmode/
---
## ImageLockMode enumeration

उन फ़्लैग्स को निर्दिष्ट करता है जो फ़्लैग्स पैरामीटर को पास किए जाते हैं[`LockBits`](../../system.drawing/bitmap/lockbits/) विधि. द[`LockBits`](../../system.drawing/bitmap/lockbits/) विधि एक छवि के एक हिस्से को लॉक कर देती है ताकि आप पिक्सेल डेटा को पढ़ या लिख सकें।

```csharp
public enum ImageLockMode
```

### मान

| नाम | कीमत | विवरण |
| --- | --- | --- |
| ReadOnly | `1` | निर्दिष्ट करता है कि छवि का एक भाग पढ़ने के लिए बंद है। |
| WriteOnly | `2` | निर्दिष्ट करता है कि छवि का एक भाग लिखने के लिए बंद है। |
| ReadWrite | `3` | निर्दिष्ट करता है कि छवि का एक भाग पढ़ने या लिखने के लिए बंद है। |
| UserInputBuffer | `4` | निर्दिष्ट करता है कि पिक्सेल डेटा पढ़ने या लिखने के लिए उपयोग किया जाने वाला बफर उपयोगकर्ता द्वारा आवंटित किया जाता है। यदि यह ध्वज सेट है, तो*flags* का पैरामीटर[`LockBits`](../../system.drawing/bitmap/lockbits/) विधि एक इनपुट पैरामीटर (और संभवतः आउटपुट पैरामीटर के रूप में) के रूप में कार्य करती है। यदि यह ध्वज साफ़ हो जाता है, तो*flags* पैरामीटर केवल आउटपुट पैरामीटर के रूप में कार्य करता है। |

### यह सभी देखें

* नाम स्थान [System.Drawing.Imaging](../../system.drawing.imaging/)
* सभा [Aspose.Drawing](../../)


