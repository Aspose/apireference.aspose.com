---
title: "System::Text::Encoding क्लास"
linktitle: "Encoding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::Encoding क्लास। C++ में एन्कोडिंग सेवाएँ।"
type: docs
weight: 1600
url: /hi/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Clone](./clone/)() | एन्कोडिंग ऑब्जेक्ट को क्लोन करता है। |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | दो एन्कोडिंग्स के बीच बाइट्स को परिवर्तित करता है। |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | दो एन्कोडिंग्स के बीच बाइट्स को परिवर्तित करता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | एन्कोडिंग्स की तुलना करता है। |
| static [get_ASCII](./get_ascii/)() | ASCII एन्कोडिंग प्राप्त करता है। |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | मानक बिग-एंडियन यूनिकोड एन्कोडिंग ऑब्जेक्ट प्राप्त करता है। |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | मानक बिग-एंडियन UTF-32 एन्कोडिंग ऑब्जेक्ट प्राप्त करता है। |
| virtual [get_BodyName](./get_bodyname/)() | मेल एजेंट बॉडी संगत एन्कोडिंग नाम प्राप्त करता है। |
| virtual [get_CodePage](./get_codepage/)() | प्राप्त करता है [Windows](../../system.windows/) कोडपेज ID। |
| [get_DecoderFallback](./get_decoderfallback/)() const | डिकोडर फॉलबैक प्राप्त करता है। |
| static [get_Default](./get_default/)() | डिफ़ॉल्ट एन्कोडिंग प्राप्त करता है। |
| [get_EncoderFallback](./get_encoderfallback/)() const | एन्कोडर फॉलबैक प्राप्त करता है। |
| virtual [get_EncodingName](./get_encodingname/)() | मानव-पठनीय एन्कोडिंग नाम प्राप्त करता है। |
| virtual [get_HeaderName](./get_headername/)() | मेल एजेंट हेडर संगत एन्कोडिंग नाम प्राप्त करता है। |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | जाँचता है कि एन्कोडिंग को ब्राउज़र में सामग्री प्रदर्शित करने के लिए उपयोग किया जा सकता है या नहीं। |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | जाँचता है कि एन्कोडिंग को ब्राउज़र में सामग्री सहेजने के लिए उपयोग किया जा सकता है या नहीं। |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | जाँचता है कि एन्कोडिंग को मेल क्लाइंट में सामग्री प्रदर्शित करने के लिए उपयोग किया जा सकता है या नहीं। |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | जाँचता है कि एन्कोडिंग को मेल क्लाइंट में सामग्री सहेजने के लिए उपयोग किया जा सकता है या नहीं। |
| [get_IsReadOnly](./get_isreadonly/)() | जाँचता है कि एन्कोडिंग केवल-पढ़ने योग्य है या नहीं। |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | जाँचता है कि एन्कोडिंग सिंगल बाइट है या नहीं। |
| static [get_Latin1](./get_latin1/)() | Latin1 एन्कोडिंग प्राप्त करता है। आंतरिक उपयोग के लिए। |
| static [get_Unicode](./get_unicode/)() | मानक Unicode एन्कोडिंग ऑब्जेक्ट प्राप्त करता है। |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | मानक UTF-7 एन्कोडिंग ऑब्जेक्ट प्राप्त करता है। |
| static [get_UTF8](./get_utf8/)() | मानक UTF-8 एन्कोडिंग ऑब्जेक्ट प्राप्त करता है। |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | केवल आंतरिक, क्लास लाइब्रेरीज़ द्वारा उपयोग के लिए: अनमार्क्ड और गैर-इनपुट-वैधता। |
| virtual [get_WebName](./get_webname/)() | IANA-संगत एन्कोडिंग नाम प्राप्त करता है। |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | प्राप्त करता है [Windows](../../system.windows/) कोडपेज ID। |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(const String\&) | एक स्ट्रिंग को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | एक कैरेक्टर बफ़र को एन्कोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const String\&) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | एक कैरेक्टर बफ़र को एन्कोड करने से प्राप्त बाइट्स प्राप्त करें। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | एक बाइट बफ़र को डिकोड करने के लिए आवश्यक अक्षरों की संख्या प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | एक बाइट बफ़र को डिकोड करने से प्राप्त अक्षर प्राप्त करें। |
| virtual [GetDecoder](./getdecoder/)() | एक डिकोडर प्राप्त करें जो अनुरोधों को इस वस्तु की ओर अग्रसर करता है। |
| virtual [GetEncoder](./getencoder/)() | एक एन्कोडर प्राप्त करें जो अनुरोधों को इस वस्तु की ओर अग्रसर करता है। |
| static [GetEncoding](./getencoding/)(const String\&) | नाम द्वारा एन्कोडिंग प्राप्त करता है। |
| static [GetEncoding](./getencoding/)(int) | कोडपेज द्वारा एन्कोडिंग प्राप्त करता है। |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | कोडपेज द्वारा एन्कोडिंग प्राप्त करता है। |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | नाम द्वारा एन्कोडिंग प्राप्त करता है। |
| static [GetEncodings](./getencodings/)() | ज्ञात एन्कोडिंग्स की सूची प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | एन्कोडिंग को हैश करता है। |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | निर्दिष्ट संख्या में अक्षरों को एन्कोड करने के लिए आवश्यक अधिकतम बाइट्स की संख्या प्राप्त करें। |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | निर्दिष्ट बाइट्स की संख्या को डिकोड करने के लिए आवश्यक अधिकतम अक्षरों की संख्या प्राप्त करें। |
| virtual [GetPreamble](./getpreamble/)() | एन्कोडिंग को दर्शाने वाला बाइट्स का अनुक्रम लौटाता है (उदा. BOM)। |
| virtual [GetString](./getstring/)(uint8_t *, int) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | बाइट्स के बफ़र को स्ट्रिंग में डिकोड करता है। |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | डिकोडर फॉलबैक सेट करता है। |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | एन्कोडर फॉलबैक सेट करता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | डिफ़ॉल्ट कोडपेज मान। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | RTTI। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
