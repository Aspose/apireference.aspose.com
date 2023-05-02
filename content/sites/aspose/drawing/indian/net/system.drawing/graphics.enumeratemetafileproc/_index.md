---
title: Delegate Graphics.EnumerateMetafileProc
second_title: .NET API संदर्भ के लिए Aspose.Drawing
description: के लए एक कलबैक वध प्रदन करत हैEnumerateMetafile तरक
type: docs
weight: 550
url: /hi/net/system.drawing/graphics.enumeratemetafileproc/
---
## Graphics.EnumerateMetafileProc delegate

के लिए एक कॉलबैक विधि प्रदान करता है[`EnumerateMetafile`](../graphics/enumeratemetafile/) तरीका।

```csharp
public delegate bool EnumerateMetafileProc(EmfPlusRecordType recordType, int flags, int dataSize, 
    IntPtr data, PlayRecordCallback callbackData);
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| recordType | EmfPlusRecordType | के सदस्य[`EmfPlusRecordType`](../../system.drawing.imaging/emfplusrecordtype/) गणना जो मेटाफ़ाइल रिकॉर्ड के प्रकार को निर्दिष्ट करती है। |
| flags | Int32 | झंडे का सेट जो रिकॉर्ड की विशेषताओं को निर्दिष्ट करता है। |
| dataSize | Int32 | रिकॉर्ड डेटा में बाइट्स की संख्या। |
| data | IntPtr | एक बफ़र के लिए सूचक जिसमें रिकॉर्ड डेटा होता है। |
| callbackData | PlayRecordCallback | तर्क का प्रयोग नहीं किया गया है। |

### प्रतिलाभ की मात्रा

यदि आप रिकॉर्डों की गणना जारी रखना चाहते हैं तो सही लौटें; अन्यथा झूठा।

### यह सभी देखें

* enum [EmfPlusRecordType](../../system.drawing.imaging/emfplusrecordtype/)
* delegate [PlayRecordCallback](../../system.drawing.imaging/playrecordcallback/)
* class [Graphics](../graphics/)
* नाम स्थान [System.Drawing](../../system.drawing/)
* सभा [Aspose.Drawing](../../)


