---
title: "System::Xml::XmlWriter क्लास"
linktitle: "XmlWriter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlWriter क्लास। एक राइटर का प्रतिनिधित्व करता है जो तेज़, गैर-कैश्ड, केवल-फ़ॉरवर्ड तरीका प्रदान करता है C++ में XML डेटा वाले स्ट्रीम या फ़ाइलें उत्पन्न करने के लिए।"
type: docs
weight: 4400
url: /hi/cpp/system.xml/xmlwriter/
---
## XmlWriter class


XML डेटा वाली स्ट्रीम या फ़ाइलें उत्पन्न करने का तेज, गैर‑कैश्ड, केवल‑आगे का तरीका प्रदान करने वाला राइटर दर्शाता है।

```cpp
class XmlWriter : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Close](./close/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो यह स्ट्रीम और अंतर्निहित स्ट्रीम को बंद करता है। |
| static [Create](./create/)(const String\&) | निर्दिष्ट फ़ाइलनाम का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | फ़ाइलनाम और [XmlWriterSettings](../xmlwritersettings/) ऑब्जेक्ट का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | निर्दिष्ट स्ट्रीम का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | स्ट्रीम और [XmlWriterSettings](../xmlwritersettings/) ऑब्जेक्ट का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | निर्दिष्ट TextWriter का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | TextWriter और [XmlWriterSettings](../xmlwritersettings/) ऑब्जेक्ट्स का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | निर्दिष्ट [Text::StringBuilder](../../system.text/stringbuilder/) का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | [Text::StringBuilder](../../system.text/stringbuilder/) और [XmlWriterSettings](../xmlwritersettings/) ऑब्जेक्ट्स का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | निर्दिष्ट [XmlWriter](./) ऑब्जेक्ट का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | निर्दिष्ट [XmlWriter](./) और [XmlWriterSettings](../xmlwritersettings/) ऑब्जेक्ट्स का उपयोग करके एक नया [XmlWriter](./) इंस्टेंस बनाता है। |
| [Dispose](./dispose/)() override | वर्तमान [XmlWriter](./) क्लास के इंस्टेंस द्वारा उपयोग किए गए सभी संसाधनों को रिलीज़ करता है। |
| virtual [Flush](./flush/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो बफ़र में मौजूद सभी डेटा को अंतर्निहित स्ट्रीम्स में फ़्लश करता है और अंतर्निहित स्ट्रीम को भी फ़्लश करता है। |
| virtual [get_Settings](./get_settings/)() | इस [XmlWriter](./) इंस्टेंस को बनाने के लिए उपयोग किए गए [XmlWriterSettings](../xmlwritersettings/) ऑब्जेक्ट को लौटाता है। |
| virtual [get_WriteState](./get_writestate/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो राइटर की स्थिति प्राप्त करता है। |
| virtual [get_XmlLang](./get_xmllang/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान **xml:lang** स्कोप प्राप्त करता है। |
| virtual [get_XmlSpace](./get_xmlspace/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो वर्तमान **xml:space** स्कोप का प्रतिनिधित्व करने वाला एक [XmlSpace](../xmlspace/) प्राप्त करता है। |
| virtual [LookupPrefix](./lookupprefix/)(String) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो नेमस्पेस URI के लिए वर्तमान नेमस्पेस स्कोप में परिभाषित सबसे निकटतम प्रीफ़िक्स को लौटाता है। |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो [XmlReader](../xmlreader/) में वर्तमान स्थिति पर पाए गए सभी एट्रिब्यूट्स को लिखता है। |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट स्थानीय नाम, नेमस्पेस URI और मान के साथ एक एट्रिब्यूट लिखता है। |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट स्थानीय नाम और मान के साथ एट्रिब्यूट को लिखता है। |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट प्रीफ़िक्स, स्थानीय नाम, नेमस्पेस URI और मान के साथ एट्रिब्यूट को लिखता है। |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट बाइनरी बाइट्स को Base64 के रूप में एन्कोड करता है और परिणामी टेक्स्ट को लिखता है। |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो निर्दिष्ट बाइनरी बाइट्स को **BinHex** के रूप में एन्कोड करता है और परिणामी टेक्स्ट को लिखता है। |
| virtual [WriteCData](./writecdata/)(String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट पाठ युक्त **...** ब्लॉक को लिखता है। |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट यूनिकोड अक्षर मान के लिए एक कैरेक्टर एंटिटी उत्पन्न करने को बाध्य करता है। |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक बार में एक बफ़र के अनुसार पाठ लिखता है। |
| virtual [WriteComment](./writecomment/)(String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट पाठ युक्त टिप्पणी **** को लिखता है। |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट नाम और वैकल्पिक गुणों के साथ DOCTYPE घोषणा लिखता है। |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | निर्दिष्ट स्थानीय नाम और मान के साथ एक तत्व लिखता है। |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | निर्दिष्ट स्थानीय नाम, नेमस्पेस URI, और मान के साथ एक तत्व लिखता है। |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | निर्दिष्ट उपसर्ग, स्थानीय नाम, नेमस्पेस URI, और मान के साथ एक तत्व लिखता है। |
| virtual [WriteEndAttribute](./writeendattribute/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो पिछले XmlWriter::WriteStartAttribute(String,String) कॉल को बंद करता है। |
| virtual [WriteEndDocument](./writeenddocument/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो किसी भी खुले तत्व या गुणों को बंद करता है और राइटर को फिर से स्टार्ट स्थिति में ले जाता है। |
| virtual [WriteEndElement](./writeendelement/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक तत्व को बंद करता है और संबंधित नेमस्पेस स्कोप को पॉप करता है। |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक एंटिटी रेफ़रेंस को **&name**; के रूप में लिखता है। |
| virtual [WriteFullEndElement](./writefullendelement/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक तत्व को बंद करता है और संबंधित नेमस्पेस स्कोप को पॉप करता है। |
| virtual [WriteName](./writename/)(const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट नाम को लिखता है, यह सुनिश्चित करते हुए कि यह W3C XML 1.0 सिफ़ारिश के अनुसार एक वैध नाम है ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट नाम को लिखता है, यह सुनिश्चित करते हुए कि यह W3C XML 1.0 सिफ़ारिश के अनुसार एक वैध NmToken है ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो रीडर से राइटर तक सब कुछ कॉपी करता है और रीडर को अगले सिब्लिंग की शुरुआत में ले जाता है। |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | XPathNavigator ऑब्जेक्ट से राइटर तक सब कुछ कॉपी करता है। XPathNavigator की स्थिति अपरिवर्तित रहती है। |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो नाम और पाठ के बीच एक स्पेस के साथ प्रोसेसिंग इंस्ट्रक्शन को इस प्रकार लिखता है: **<?name text?>**। |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो नेमस्पेस-योग्य नाम को लिखता है। यह मेथड दिए गए नेमस्पेस के लिए स्कोप में मौजूद उपसर्ग को खोजता है। |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक कैरेक्टर बफ़र से मैन्युअल रूप से कच्चा मार्कअप लिखता है। |
| virtual [WriteRaw](./writeraw/)(const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक स्ट्रिंग से मैन्युअल रूप से कच्चा मार्कअप लिखता है। |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI के साथ एक एट्रिब्यूट की शुरुआत लिखता है। |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट उपसर्ग, स्थानीय नाम, और नेमस्पेस URI के साथ एट्रिब्यूट की शुरुआत लिखता है। |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | निर्दिष्ट स्थानीय नाम के साथ एट्रिब्यूट की शुरुआत लिखता है। |
| virtual [WriteStartDocument](./writestartdocument/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो संस्करण "1.0" के साथ XML घोषणा लिखता है। |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो संस्करण "1.0" और स्टैंडअलोन एट्रिब्यूट के साथ XML घोषणा लिखता है। |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट प्रारंभ टैग लिखता है और इसे दिए गए नेमस्पेस से जोड़ता है। |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट प्रारंभ टैग लिखता है और इसे दिए गए नेमस्पेस और प्रीफ़िक्स से जोड़ता है। |
| [WriteStartElement](./writestartelement/)(const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट स्थानीय नाम के साथ एक प्रारंभ टैग लिखता है। |
| virtual [WriteString](./writestring/)(const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो दिया गया पाठ सामग्री लिखता है। |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो सरोगेट कैरेक्टर जोड़ी के लिए सरोगेट कैरेक्टर एंटिटी उत्पन्न करता है और लिखता है। |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | ऑब्जेक्ट मान लिखता है। |
| virtual [WriteValue](./writevalue/)(const String\&) | एक [String](../../system/string/) मान लिखता है। |
| virtual [WriteValue](./writevalue/)(bool) | एक [Boolean](../../system/boolean/) मान लिखता है। |
| virtual [WriteValue](./writevalue/)(DateTime) | एक [DateTime](../../system/datetime/) मान लिखता है। |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | एक [DateTimeOffset](../../system/datetimeoffset/) मान लिखता है। |
| virtual [WriteValue](./writevalue/)(double) | एक [Double](../../system/double/) मान लिखता है। |
| virtual [WriteValue](./writevalue/)(float) | एक सिंगल-प्रिसीजन फ्लोटिंग-पॉइंट संख्या लिखता है। |
| virtual [WriteValue](./writevalue/)(Decimal) | एक [Decimal](../../system/decimal/) मान लिखता है। |
| virtual [WriteValue](./writevalue/)(int32_t) | एक [Int32](../../system/int32/) मान लिखता है। |
| virtual [WriteValue](./writevalue/)(int64_t) | एक [Int64](../../system/int64/) मान लिखता है। |
| virtual [WriteWhitespace](./writewhitespace/)(String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो दिया गया व्हाइट स्पेस लिखता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
