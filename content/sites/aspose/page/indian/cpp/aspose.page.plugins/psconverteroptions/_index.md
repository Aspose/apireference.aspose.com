---
title: "Aspose::Page::Plugins::PsConverterOptions class"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::Plugins::PsConverterOptions class. C++ में PsConverter प्लगइन के विकल्पों का प्रतिनिधित्व करता है।"
type: docs
weight: 1200
url: /hi/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


[PsConverter](../psconverter/) प्लगइन के विकल्पों का प्रतिनिधित्व करता है।

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | [PsConverter](../psconverter/) प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है। |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | [PsConverterOptions](./) प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है। |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | कनवर्टर को इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने वाले अतिरिक्त फ़ोल्डर निर्दिष्ट करता है। डिफ़ॉल्ट फ़ोल्डर मानक फ़ॉन्ट फ़ोल्डर है जहाँ OS आंतरिक आवश्यकताओं के लिए फ़ॉन्ट खोजता है। |
| [get_DataCollection](./get_datacollection/)() override | [PsConverterOptions](./) प्लगइन डेटा संग्रह लौटाता है। |
| virtual [get_Debug](./get_debug/)() | डिबग जानकारी को मानक आउटपुट स्ट्रीम पर प्रिंट किया जाना चाहिए या नहीं, यह निर्दिष्ट करता है। |
| virtual [get_Exceptions](./get_exceptions/)() | यदि [SuppressErrors](../) सत्य है तो दबाए गए रूपांतरण त्रुटियों की सूची लौटाता है। |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | क्वालिटी श्रेणी इमेज के लिए संपीड़न स्तर को निर्दिष्ट करती है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए इमेज की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली इमेज देता है, जबकि 100 सबसे अधिक। |
| virtual [get_OperationName](./get_operationname/)() | ऑपरेशन का नाम लौटाता है। |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | सहेजने के ऑपरेशन परिणामों के लिए जोड़े गए लक्ष्य संग्रह प्राप्त करता है। |
| [get_SupressErrors](./get_supresserrors/)() const | त्रुटियों को दबाया जाना चाहिए या नहीं, यह निर्दिष्ट करता है। यदि सत्य है तो दबाए गए त्रुटियों को [Exceptions](../) सूची में जोड़ा जाता है। यदि असत्य है तो पहली त्रुटि प्रोग्राम को समाप्त कर देगी। |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | कनवर्टर को इनपुट दस्तावेज़ के लिए फ़ॉन्ट खोजने वाले अतिरिक्त फ़ोल्डर निर्दिष्ट करता है। डिफ़ॉल्ट फ़ोल्डर मानक फ़ॉन्ट फ़ोल्डर है जहाँ OS आंतरिक आवश्यकताओं के लिए फ़ॉन्ट खोजता है। |
| virtual [set_Debug](./set_debug/)(bool) | डिबग जानकारी को मानक आउटपुट स्ट्रीम पर प्रिंट किया जाना चाहिए या नहीं, यह निर्दिष्ट करता है। |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | यदि [SuppressErrors](../) सत्य है तो दबाए गए रूपांतरण त्रुटियों की सूची लौटाता है। |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | क्वालिटी श्रेणी इमेज के लिए संपीड़न स्तर को निर्दिष्ट करती है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए इमेज की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली इमेज देता है, जबकि 100 सबसे अधिक। |
| [set_SupressErrors](./set_supresserrors/)(bool) | त्रुटियों को दबाया जाना चाहिए या नहीं, यह निर्दिष्ट करता है। यदि सत्य है तो दबाए गए त्रुटियों को [Exceptions](../) सूची में जोड़ा जाता है। यदि असत्य है तो पहली त्रुटि प्रोग्राम को समाप्त कर देगी। |
## संबंधित देखें

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
