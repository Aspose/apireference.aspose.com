---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption क्लास"
linktitle: "PageMediaTypeOption"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption क्लास। C++ में PageMediaType फ़ीचर विकल्पों का वर्णन करता है।"
type: docs
weight: 700
url: /hi/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


[PageMediaType](../) फ़ीचर विकल्पों का वर्णन करता है।

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | विकल्प में [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) के उदाहरणों की एक एरे जोड़ता है। |
| [Clone](./clone/)() | इस विकल्प इंस्टेंस को क्लोन करता है। क्लोनिंग कंस्ट्रक्टर का शॉर्टकट। |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | एक नया इंस्टेंस बनाता है। |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | इस विकल्प इंस्टेंस को क्लोन करता है। |
| [SetWeight](./setweight/)(int32_t) | **Weight** स्कोर किए गए प्रॉपर्टी मान को सेट करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [Archival](./archival/) | आर्काइवल क्वालिटी मीडिया को निर्दिष्ट करता है। |
| static [AutoSelect](./autoselect/) | निर्दिष्ट करता है कि मीडिया स्वचालित रूप से चयनित होगा। |
| static [BackPrintFilm](./backprintfilm/) | विशेष बैक प्रिंटिंग फिल्म मीडिया को निर्दिष्ट करता है। |
| static [Bond](./bond/) | मानक बांड मीडिया को निर्दिष्ट करता है। |
| static [CardStock](./cardstock/) | मानक कार्ड स्टॉक मीडिया को निर्दिष्ट करता है। |
| static [Continous](./continous/) | सतत फ़ीड मीडिया को निर्दिष्ट करता है। |
| static [EnvelopePlain](./envelopeplain/) | मानक लिफ़ाफ़ा मीडिया को निर्दिष्ट करता है। |
| static [EnvelopeWindow](./envelopewindow/) | विंडो वाले लिफ़ाफ़ा मीडिया को निर्दिष्ट करता है। |
| static [Fabric](./fabric/) | कपड़ा मीडिया को निर्दिष्ट करता है। |
| static [HighResolution](./highresolution/) | विशेष उच्च रिज़ॉल्यूशन मीडिया को निर्दिष्ट करता है। |
| static [Label](./label/) | लेबल मीडिया को निर्दिष्ट करता है। |
| static [MultiLayerForm](./multilayerform/) | संलग्न मल्टी-पार्ट फ़ॉर्म्स मीडिया को निर्दिष्ट करता है। |
| static [MultiPartForm](./multipartform/) | अलग मल्टी-पार्ट फ़ॉर्म्स मीडिया को निर्दिष्ट करता है। |
| static [None](./none/) | अज्ञात या सूचीबद्ध नहीं मीडिया को निर्दिष्ट करता है। |
| static [Photographic](./photographic/) | मानक फ़ोटोग्राफ़िक मीडिया को निर्दिष्ट करता है। |
| static [PhotographicFilm](./photographicfilm/) | फ़िल्म फ़ोटोग्राफ़िक मीडिया को निर्दिष्ट करता है। |
| static [PhotographicGlossy](./photographicglossy/) | ग्लॉसी फ़ोटोग्राफ़िक मीडिया को निर्दिष्ट करता है। |
| static [PhotographicHighGloss](./photographichighgloss/) | उच्च ग्लॉस फ़ोटोग्राफ़िक मीडिया को निर्दिष्ट करता है। |
| static [PhotographicMatte](./photographicmatte/) | मैट फ़ोटोग्राफ़िक मीडिया को निर्दिष्ट करता है। |
| static [PhotographicSatin](./photographicsatin/) | सैटिन फ़ोटोग्राफ़िक मीडिया को निर्दिष्ट करता है। |
| static [PhotographicSemiGloss](./photographicsemigloss/) | सेमी-ग्लॉस फ़ोटोग्राफ़िक मीडिया को निर्दिष्ट करता है। |
| static [Plain](./plain/) | मानक कागज़ मीडिया को निर्दिष्ट करता है। |
| static [Screen](./screen/) | सतत रूप में आउटपुट डिस्प्ले पर आउटपुट को निर्दिष्ट करता है। |
| static [ScreenPaged](./screenpaged/) | पृष्ठीकृत रूप में आउटपुट डिस्प्ले पर आउटपुट को निर्दिष्ट करता है। |
| static [Stationary](./stationary/) | विशेष स्टेशनरी मीडिया को निर्दिष्ट करता है। |
| static [TabStockFull](./tabstockfull/) | टैब स्टॉक मीडिया को निर्दिष्ट करता है जो पूर्व-कटा नहीं है (एकल टैब)। |
| static [TabStockPreCut](./tabstockprecut/) | टैब स्टॉक मीडिया को निर्दिष्ट करता है जो पूर्व-कटा है (एकाधिक टैब)। |
| static [Transparency](./transparency/) | पारदर्शी मीडिया को निर्दिष्ट करता है। |
| static [TShirtTransfer](./tshirttransfer/) | विशेष टी-शर्ट ट्रांसफ़र मीडिया को निर्दिष्ट करता है। |
## संबंधित देखें

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
