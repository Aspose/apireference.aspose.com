---
title: "System::Globalization::CompareInfo class"
linktitle: "CompareInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::CompareInfo class. संस्कृति-संवेदनशील स्ट्रिंग तुलना करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 400
url: /hi/cpp/system.globalization/compareinfo/
---
## CompareInfo class


संस्कृति-संवेदनशील स्ट्रिंग तुलना करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class CompareInfo : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | स्ट्रिंग्स की तुलना करता है। लागू नहीं किया गया। |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | स्ट्रिंग्स की तुलना करता है। केवल Ordinal और OrdinalIgnoreCase मोड समर्थित हैं। |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | एक स्ट्रिंग के एक भाग की तुलना दूसरे स्ट्रिंग के भाग से करता है। लागू नहीं किया गया। |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | स्ट्रिंग तुलना विधियों का उपयोग करके एक स्ट्रिंग के अंत भाग की तुलना दूसरे स्ट्रिंग के अंत भाग से करता है। लागू नहीं किया गया। |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | एक स्ट्रिंग के अंत भाग की तुलना दूसरे स्ट्रिंग के अंत भाग से करता है। लागू नहीं किया गया। |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | स्ट्रिंग तुलना विधियों का उपयोग करके एक स्ट्रिंग के भाग की तुलना दूसरे स्ट्रिंग के भाग से करता है। लागू नहीं किया गया। |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | RTTI जानकारी। |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | कम्पेयरर से जुड़े संस्कृति का LCID प्राप्त करता है। |
| virtual [get_Name](./get_name/)() const | कम्पेयरर से जुड़े संस्कृति का नाम प्राप्त करता है। |
| [get_Version](./get_version/)() const | सॉर्ट संस्करण के बारे में जानकारी प्राप्त करता है। |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | निर्दिष्ट संस्कृति से संबंधित [CompareInfo](./) प्राप्त करता है और निर्दिष्ट असेंबली में स्ट्रिंग तुलना विधियों का उपयोग करता है। |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | निर्दिष्ट संस्कृति से संबंधित [CompareInfo](./) प्राप्त करता है और निर्दिष्ट असेंबली में स्ट्रिंग तुलना विधियों का उपयोग करता है। |
| static [GetCompareInfo](./getcompareinfo/)(int) | निर्दिष्ट संस्कृति से संबंधित [CompareInfo](./) प्राप्त करता है। |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | निर्दिष्ट संस्कृति से संबंधित [CompareInfo](./) प्राप्त करता है। |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | निर्दिष्ट तुलना विकल्पों के आधार पर स्ट्रिंग हैश कोड प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके निर्दिष्ट स्ट्रिंग के लिए [SortKey](../sortkey/) ऑब्जेक्ट प्राप्त करता है। |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | निर्दिष्ट स्ट्रिंग के लिए [SortKey](../sortkey/) ऑब्जेक्ट प्राप्त करता है। |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | उपस्ट्रिंग की तलाश करता है। |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | उपस्ट्रिंग की तलाश करता है। केवल Ordinal मोड समर्थित है। |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | उपस्ट्रिंग की तलाश करता है। केवल Ordinal मोड समर्थित है। |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | निर्दिष्ट अक्षर की तलाश करता है। केवल Ordinal मोड समर्थित है। |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | उपस्ट्रिंग की तलाश करता है। |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | निर्दिष्ट अक्षर की तलाश करता है। |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | उपस्ट्रिंग की तलाश करता है। |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | निर्दिष्ट अक्षर की तलाश करता है। केवल Ordinal मोड समर्थित है। |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | निर्दिष्ट अक्षर की तलाश करता है। |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | निर्दिष्ट अक्षर की तलाश करता है। |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | उपस्ट्रिंग की तलाश करता है। केवल Ordinal मोड समर्थित है। |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | निर्दिष्ट अक्षर की तलाश करता है। केवल Ordinal मोड समर्थित है। |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके जांचता है कि क्या निर्दिष्ट स्ट्रिंग निर्दिष्ट उपसर्ग से शुरू होती है। |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | जांचता है कि क्या निर्दिष्ट स्ट्रिंग निर्दिष्ट उपसर्ग से शुरू होती है। |
| static [IsSortable](./issortable/)(char16_t) | जांचता है कि क्या निर्दिष्ट अक्षर क्रमबद्ध किया जा सकता है। |
| static [IsSortable](./issortable/)(const String\&) | जांचता है कि क्या निर्दिष्ट स्ट्रिंग क्रमबद्ध की जा सकती है। |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके जांचता है कि क्या निर्दिष्ट स्ट्रिंग निर्दिष्ट प्रत्यय पर समाप्त होती है। |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | जांचता है कि क्या निर्दिष्ट स्ट्रिंग निर्दिष्ट प्रत्यय पर समाप्त होती है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | निर्दिष्ट उपस्ट्रिंग की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके निर्दिष्ट उपस्ट्रिंग की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके निर्दिष्ट अक्षर की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | निर्दिष्ट स्ट्रिंग की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके निर्दिष्ट स्ट्रिंग की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके निर्दिष्ट अक्षर की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | निर्दिष्ट स्ट्रिंग की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | निर्दिष्ट अक्षर की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके निर्दिष्ट स्ट्रिंग की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | निर्दिष्ट तुलना विकल्पों का उपयोग करके निर्दिष्ट अक्षर की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | निर्दिष्ट अक्षर की अंतिम घटना की खोज करता है। |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | निर्दिष्ट अक्षर की अंतिम घटना की खोज करता है। |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
