---
title: "Aspose::Page::SaveOptions क्लास"
linktitle: "SaveOptions"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::SaveOptions क्लास। यह क्लास C++ में रूपांतरण प्रक्रिया को प्रबंधित करने के लिए आवश्यक विकल्प रखती है।"
type: docs
weight: 1500
url: /hi/cpp/aspose.page/saveoptions/
---
## SaveOptions class


यह क्लास परिवर्तन प्रक्रिया को प्रबंधित करने के लिए आवश्यक विकल्पों को शामिल करती है।

```cpp
class SaveOptions : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | कनवर्टर को इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने वाले अतिरिक्त फ़ोल्डर निर्दिष्ट करता है। डिफ़ॉल्ट फ़ोल्डर मानक फ़ॉन्ट फ़ोल्डर है जहाँ OS आंतरिक आवश्यकताओं के लिए फ़ॉन्ट खोजता है। |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | निर्दिष्ट करता है कि गैर‑TrueType फ़ॉन्ट को TTF में सहेजा जाए या नहीं। यह PS से PDF रूपांतरण में उत्पन्न दस्तावेज़ के आकार को काफी कम करता है और गैर‑TrueType फ़ॉन्ट वाले बड़े मात्रा में टेक्स्ट वाले PS फ़ाइलों के किसी भी आउटपुट फ़ॉर्मेट में रूपांतरण की गति बढ़ाता है। हालांकि, PostSctipt फ़ाइल को इमेज में बदलते समय टेक्स्ट में छोटा ऊर्ध्वाधर शिफ्ट होता है। |
| virtual [get_Debug](./get_debug/)() | डिबग जानकारी को मानक आउटपुट स्ट्रीम पर प्रिंट किया जाना चाहिए या नहीं, यह निर्दिष्ट करता है। |
| virtual [get_Exceptions](./get_exceptions/)() | यदि [SuppressErrors](../) सत्य है तो दबाए गए रूपांतरण त्रुटियों की सूची लौटाता है। |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | क्वालिटी श्रेणी इमेज के लिए संपीड़न स्तर को निर्दिष्ट करती है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए इमेज की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली इमेज देता है, जबकि 100 सबसे अधिक। |
| [get_Size](./get_size/)() const | छवि का आकार प्राप्त/सेट करता है। |
| virtual [get_SupressErrors](./get_supresserrors/)() | त्रुटियों को दबाया जाना चाहिए या नहीं, यह निर्दिष्ट करता है। यदि सत्य है तो दबाए गए त्रुटियों को [Exceptions](../) सूची में जोड़ा जाता है। यदि असत्य है तो पहली त्रुटि प्रोग्राम को समाप्त कर देगी। |
| [SaveOptions](./saveoptions/)() | डिफ़ॉल्ट मानों के साथ [SaveOptions](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है, फ़्लैग्स [SuppressErrors](../) (true) और [Debug](../) (false) के लिए। |
| [SaveOptions](./saveoptions/)(bool) | डिफ़ॉल्ट मान के साथ फ़्लैग [Debug](../) (false) के लिए नए [SaveOptions](./) क्लास का इंस्टेंस इनिशियलाइज़ करता है। |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | निर्दिष्ट पृष्ठ आकार के साथ नए [SaveOptions](./) का इंस्टेंस इनिशियलाइज़ करता है। |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | डिफ़ॉल्ट मान के साथ फ़्लैग [Debug](../) (false) और निर्दिष्ट पृष्ठ आकार के साथ नए [SaveOptions](./) क्लास का इंस्टेंस इनिशियलाइज़ करता है। |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | कनवर्टर को इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने वाले अतिरिक्त फ़ोल्डर निर्दिष्ट करता है। डिफ़ॉल्ट फ़ोल्डर मानक फ़ॉन्ट फ़ोल्डर है जहाँ OS आंतरिक आवश्यकताओं के लिए फ़ॉन्ट खोजता है। |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | निर्दिष्ट करता है कि गैर‑TrueType फ़ॉन्ट को TTF में सहेजा जाए या नहीं। यह PS से PDF रूपांतरण में उत्पन्न दस्तावेज़ के आकार को काफी कम करता है और गैर‑TrueType फ़ॉन्ट वाले बड़े मात्रा में टेक्स्ट वाले PS फ़ाइलों के किसी भी आउटपुट फ़ॉर्मेट में रूपांतरण की गति बढ़ाता है। हालांकि, PostSctipt फ़ाइल को इमेज में बदलते समय टेक्स्ट में छोटा ऊर्ध्वाधर शिफ्ट होता है। |
| virtual [set_Debug](./set_debug/)(bool) | डिबग जानकारी को मानक आउटपुट स्ट्रीम पर प्रिंट किया जाना चाहिए या नहीं, यह निर्दिष्ट करता है। |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | क्वालिटी श्रेणी इमेज के लिए संपीड़न स्तर को निर्दिष्ट करती है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए इमेज की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली इमेज देता है, जबकि 100 सबसे अधिक। |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | छवि का आकार प्राप्त/सेट करता है। |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | त्रुटियों को दबाया जाना चाहिए या नहीं, यह निर्दिष्ट करता है। यदि सत्य है तो दबाए गए त्रुटियों को [Exceptions](../) सूची में जोड़ा जाता है। यदि असत्य है तो पहली त्रुटि प्रोग्राम को समाप्त कर देगी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
