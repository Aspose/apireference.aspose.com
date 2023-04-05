---
title: Class ImageSaveOptions
second_title: .NET API संदर्भ के लिए Aspose.Page
description: Aspose.Page.EPS.Device.ImageSaveOptions कक्ष. इस वर्ग में छव बचत प्रक्रय के प्रबंधन के लए आवश्यक वकल्प हैं
type: docs
weight: 50
url: /hi/net/aspose.page.eps.device/imagesaveoptions/
---
## ImageSaveOptions class

इस वर्ग में छवि बचत प्रक्रिया के प्रबंधन के लिए आवश्यक विकल्प हैं।

```csharp
public class ImageSaveOptions : SaveOptions
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [ImageSaveOptions](imagesaveoptions/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`ImageSaveOptions` ध्वज के लिए डिफ़ॉल्ट मान वाला वर्ग!:SuppressErrors (सत्य) और!:Debug (झूठा). |
| [ImageSaveOptions](imagesaveoptions/#constructor_1)(bool) | का एक नया उदाहरण प्रारंभ करता है`ImageSaveOptions` with ध्वज के लिए डिफ़ॉल्ट मान!:Debug (झूठा). |

## गुण

| नाम | विवरण |
| --- | --- |
| [AdditionalFontsFolders](../../aspose.page/saveoptions/additionalfontsfolders/) { get; set; } | अतिरिक्त फ़ोल्डर निर्दिष्ट करता है जहां कनवर्टर को इनपुट दस्तावेज़ के लिए फ़ॉन्ट मिलना चाहिए। डिफ़ॉल्ट फ़ोल्डर मानक फ़ॉन्ट फ़ोल्डर है जहां ओएस आंतरिक जरूरतों के लिए फ़ॉन्ट ढूंढता है। |
| virtual [Debug](../../aspose.page/saveoptions/debug/) { get; set; } | निर्दिष्ट करता है कि डिबग जानकारी को मानक आउटपुट स्ट्रीम में मुद्रित किया जाना चाहिए या नहीं। |
| virtual [Exceptions](../../aspose.page/saveoptions/exceptions/) { get; } | छिपी हुई रूपांतरण त्रुटियों की सूची देता है यदि!:SuppressErrors सच है. |
| [JpegQualityLevel](../../aspose.page/saveoptions/jpegqualitylevel/) { get; set; } | गुणवत्ता श्रेणी एक छवि के लिए संपीड़न के स्तर को निर्दिष्ट करती है। उपलब्ध मान 0 से 100 हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए छवि की गुणवत्ता कम होगी। 0 मान सबसे कम गुणवत्ता वाली छवि देता है, जबकि 100 मान उच्चतम गुणवत्ता देता है. |
| [Resolution](../../aspose.page.eps.device/imagesaveoptions/resolution/) { get; set; } | छवि रिज़ॉल्यूशन प्राप्त / सेट करता है। |
| [SmoothingMode](../../aspose.page.eps.device/imagesaveoptions/smoothingmode/) { get; set; } | इमेज रेंडर करने के लिए स्मूथिंग मोड प्राप्त/सेट करता है। |
| virtual [SupressErrors](../../aspose.page/saveoptions/supresserrors/) { get; set; } | निर्दिष्ट करता है कि त्रुटियों को दबाया जाना चाहिए या नहीं। यदि सही दबाई गई त्रुटियों को इसमें जोड़ा जाता है[`Exceptions`](../../aspose.page/saveoptions/exceptions/) list. यदि गलत है तो पहली त्रुटि प्रोग्राम को समाप्त कर देगी। |

### यह सभी देखें

* class [SaveOptions](../../aspose.page/saveoptions/)
* नाम स्थान [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* सभा [Aspose.Page](../../)


