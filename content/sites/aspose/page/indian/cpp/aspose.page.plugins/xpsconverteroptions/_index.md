---
title: "Aspose::Page::Plugins::XpsConverterOptions क्लास"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::Plugins::XpsConverterOptions क्लास। C++ में XpsConverter प्लगइन के विकल्पों का प्रतिनिधित्व करता है।"
type: docs
weight: 2000
url: /hi/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


[XpsConverter](../xpsconverter/) प्लगइन के विकल्पों का प्रतिनिधित्व करता है।

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | [XpsConverter](../xpsconverter/) प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है। |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | [XpsConverterOptions](./) प्लगइन डेटा संग्रह में नया डेटा स्रोत जोड़ता है। |
| [get_DataCollection](./get_datacollection/)() override | [XpsConverterOptions](./) प्लगइन डेटा संग्रह लौटाता है। |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | क्वालिटी श्रेणी इमेज के लिए संपीड़न स्तर को निर्दिष्ट करती है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए इमेज की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली इमेज देता है, जबकि 100 सबसे अधिक। |
| virtual [get_OperationName](./get_operationname/)() | ऑपरेशन का नाम लौटाता है। |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | सहेजने के ऑपरेशन परिणामों के लिए जोड़े गए लक्ष्य संग्रह प्राप्त करता है। |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | क्वालिटी श्रेणी इमेज के लिए संपीड़न स्तर को निर्दिष्ट करती है। उपलब्ध मान 0 से 100 तक हैं। निर्दिष्ट संख्या जितनी कम होगी, संपीड़न उतना ही अधिक होगा और इसलिए इमेज की गुणवत्ता उतनी ही कम होगी। 0 मान सबसे कम गुणवत्ता वाली इमेज देता है, जबकि 100 सबसे अधिक। |
## संबंधित देखें

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
