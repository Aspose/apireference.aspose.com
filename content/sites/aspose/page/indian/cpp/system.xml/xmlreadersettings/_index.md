---
title: "System::Xml::XmlReaderSettings क्लास"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReaderSettings क्लास। C++ में XmlReader::Create मेथड द्वारा बनाए गए XmlReader ऑब्जेक्ट पर समर्थन के लिए फीचर्स का एक सेट निर्दिष्ट करता है।"
type: docs
weight: 3400
url: /hi/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


निर्दिष्ट करता है कि [XmlReader](../xmlreader/) ऑब्जेक्ट पर कौन-से फीचर समर्थित हों जो [XmlReader::Create](../xmlreader/create/) मेथड द्वारा बनाया गया है।

```cpp
class XmlReaderSettings : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | [XmlReaderSettings](./) इंस्टेंस की एक कॉपी बनाता है। |
| [get_CheckCharacters](./get_checkcharacters/)() | कैरेक्टर चेकिंग करने के लिए संकेत करने वाला मान लौटाता है। |
| [get_CloseInput](./get_closeinput/)() | जब रीडर बंद हो, तो अंतर्निहित स्ट्रीम या TextReader को बंद करना चाहिए या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [get_ConformanceLevel](./get_conformancelevel/)() | [XmlReader](../xmlreader/) द्वारा पालन किए जाने वाले अनुरूपता स्तर को लौटाता है। |
| [get_DtdProcessing](./get_dtdprocessing/)() | DTD प्रोसेसिंग निर्धारित करने वाला मान लौटाता है। |
| [get_IgnoreComments](./get_ignorecomments/)() | टिप्पणियों को अनदेखा करने के संकेत वाला मान लौटाता है। |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | प्रोसेसिंग इंस्ट्रक्शन को अनदेखा करने के संकेत वाला मान लौटाता है। |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | अप्रासंगिक व्हाइट स्पेस को अनदेखा करने के संकेत वाला मान लौटाता है। |
| [get_LineNumberOffset](./get_linenumberoffset/)() | [XmlReader](../xmlreader/) ऑब्जेक्ट का लाइन नंबर ऑफ़सेट लौटाता है। |
| [get_LinePositionOffset](./get_linepositionoffset/)() | [XmlReader](../xmlreader/) ऑब्जेक्ट का लाइन पोजीशन ऑफ़सेट लौटाता है। |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | डॉक्यूमेंट में इकाइयों के विस्तार से उत्पन्न अधिकतम अनुमत अक्षरों की संख्या को दर्शाने वाला मान लौटाता है। |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | एक मान लौटाता है जो XML दस्तावेज़ में अनुमत अधिकतम अक्षरों की संख्या दर्शाता है। शून्य (0) मान का अर्थ है XML दस्तावेज़ के आकार पर कोई सीमा नहीं। गैर-शून्य मान अधिकतम आकार, अक्षरों में, निर्दिष्ट करता है। |
| [get_NameTable](./get_nametable/)() | एटॉमाइज़्ड स्ट्रिंग तुलना के लिए उपयोग की जाने वाली [XmlNameTable](../xmlnametable/) लौटाता है। |
| [get_ProhibitDtd](./get_prohibitdtd/)() | एक मान लौटाता है जो यह दर्शाता है कि दस्तावेज़ प्रकार परिभाषा (DTD) प्रसंस्करण को प्रतिबंधित किया जाए या नहीं। |
| [get_Schemas](./get_schemas/)() | स्कीमा सत्यापन करते समय उपयोग करने के लिए XmlSchemaSet लौटाता है। |
| [get_ValidationFlags](./get_validationflags/)() | स्कीमा सत्यापन सेटिंग्स दर्शाने वाला एक मान लौटाता है। यह सेटिंग उन [XmlReader](../xmlreader/) वस्तुओं पर लागू होती है जो स्कीमा सत्यापित करती हैं ([XmlReaderSettings::get_ValidationType](./get_validationtype/) मान है [ValidationType::Schema](../validationtype/)). |
| [get_ValidationType](./get_validationtype/)() | एक मान लौटाता है जो यह दर्शाता है कि पढ़ते समय [XmlReader](../xmlreader/) सत्यापन या प्रकार असाइनमेंट करेगा या नहीं। |
| [Reset](./reset/)() | सेटिंग्स क्लास के सदस्यों को उनके डिफ़ॉल्ट मानों पर रीसेट करता है। |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि अक्षर जाँच की जाए या नहीं। |
| [set_CloseInput](./set_closeinput/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि रीडर बंद होने पर अंतर्निहित स्ट्रीम या TextReader बंद किया जाना चाहिए या नहीं। |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | वह अनुपालन स्तर सेट करता है जिसके अनुसार [XmlReader](../xmlreader/) कार्य करेगा। |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | एक मान सेट करता है जो DTDs के प्रसंस्करण को निर्धारित करता है। |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि टिप्पणियों को अनदेखा किया जाए या नहीं। |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि प्रोसेसिंग निर्देशों को अनदेखा किया जाए या नहीं। |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि असंगत श्वेत स्थान को अनदेखा किया जाए या नहीं। |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) |  [XmlReader](../xmlreader/) वस्तु का लाइन नंबर ऑफ़सेट सेट करता है। |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) |  [XmlReader](../xmlreader/) वस्तु का लाइन पोजीशन ऑफ़सेट सेट करता है। |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | एक मान सेट करता है जो इकाइयों को विस्तारित करने से उत्पन्न दस्तावेज़ में अनुमत अधिकतम अक्षरों की संख्या दर्शाता है। |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | एक मान सेट करता है जो XML दस्तावेज़ में अनुमत अधिकतम अक्षरों की संख्या दर्शाता है। शून्य (0) मान का अर्थ है XML दस्तावेज़ के आकार पर कोई सीमा नहीं। गैर-शून्य मान अधिकतम आकार, अक्षरों में, निर्दिष्ट करता है। |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | एटॉमाइज़्ड स्ट्रिंग तुलना के लिए उपयोग की जाने वाली [XmlNameTable](../xmlnametable/) सेट करता है। |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | एक मान सेट करता है जो यह दर्शाता है कि दस्तावेज़ प्रकार परिभाषा (DTD) प्रसंस्करण को प्रतिबंधित किया जाए या नहीं। |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | स्कीमा सत्यापन करते समय उपयोग करने के लिए XmlSchemaSet सेट करता है। |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | स्कीमा सत्यापन सेटिंग्स दर्शाने वाला एक मान सेट करता है। यह सेटिंग उन [XmlReader](../xmlreader/) वस्तुओं पर लागू होती है जो स्कीमा सत्यापित करती हैं ([XmlReaderSettings::get_ValidationType](./get_validationtype/) मान है [ValidationType::Schema](../validationtype/)). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | एक मान सेट करता है जो यह दर्शाता है कि पढ़ते समय [XmlReader](../xmlreader/) सत्यापन या प्रकार असाइनमेंट करेगा या नहीं। |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | बाहरी दस्तावेज़ों तक पहुँचने के लिए उपयोग किए जाने वाले [XmlResolver](../xmlresolver/) को सेट करता है। |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | एक इवेंट हैंडलर जोड़ता है जो तब होता है जब रीडर सत्यापन त्रुटियों का सामना करता है। |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | एक इवेंट हैंडलर हटाता है जो तब होता है जब रीडर सत्यापन त्रुटियों का सामना करता है। |
| [XmlReaderSettings](./xmlreadersettings/)() | एक नया उदाहरण प्रारंभ करता है [XmlReaderSettings](./) क्लास का। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
