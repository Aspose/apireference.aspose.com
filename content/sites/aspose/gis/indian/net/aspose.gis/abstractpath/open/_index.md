---
title: AbstractPath.Open
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: AbstractPath तरक. इसे खलत हैसरपथफ़इल के रूप में.
type: docs
weight: 120
url: /hi/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

इसे खोलता है`सारपथ`फ़ाइल के रूप में.

```csharp
public abstract Stream Open(FileAccess access)
```

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| access | FileAccess | ऑपरेशन के एक सबसेट को निर्दिष्ट करता है जिसे a पर निष्पादित किया जा सकता हैStream. |

### प्रतिलाभ की मात्रा

एStream निर्दिष्ट के साथ खोला गयाFileAccess .

### टिप्पणियों

अगर*access* झंडा हैWrite सेट है, और फ़ाइल मौजूद नहीं है, उत्तराधिकारी को इसे बनाना होगा। एक`सारपथ` द्वारा कई बार खोला जा सकता है`Aspose.GIS` . एक file को कई धाराओं के साथ स्वतंत्र रूप से पढ़ने के लिए यह आवश्यक है। आपको परिणाम कैश नहीं करना चाहिए बल्कि नया वापस करना चाहिएStream हर बार इस विधि को कहा जाता है.

### यह सभी देखें

* class [AbstractPath](../)
* नाम स्थान [Aspose.Gis](../../abstractpath/)
* सभा [Aspose.GIS](../../../)


