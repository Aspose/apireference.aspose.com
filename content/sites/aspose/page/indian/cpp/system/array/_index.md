---
title: "System::Array वर्ग"
linktitle: "ऐरे"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array वर्ग। वह वर्ग जो एक ऐरे डेटा संरचना का प्रतिनिधित्व करता है। इस वर्ग की वस्तुओं को केवल System::MakeArray() और System::MakeObject() फ़ंक्शनों का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system/array/
---
## Array class


ऐरे डेटा संरचना का प्रतिनिधित्व करने वाला वर्ग। इस वर्ग की वस्तुओं को केवल [System::MakeArray()](../makearray/) और [System::MakeObject()](../makeobject/) फ़ंक्शनों का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | एक ऐरे के तत्वों का प्रकार |
## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const T\&) override | समर्थित नहीं है क्योंकि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया ऐरे केवल-पढ़ने योग्य है। |
| [Array](./array/)() | एक खाली ऐरे बनाता है। |
| [Array](./array/)(int, const T\&) | भरण कंस्ट्रक्टर। |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | भरण कंस्ट्रक्टर। |
| [Array](./array/)(int, const T) | भरण कंस्ट्रक्टर। |
| [Array](./array/)(vector_t\&&) | मूव कंस्ट्रक्टर। |
| [Array](./array/)(const vector_t\&) | कॉपी कंस्ट्रक्टर। |
| [Array](./array/)(const std::vector\<Q\>\&) | [Array](./) ऑब्जेक्ट बनाता है और उसे उन मानों से भरता है जो std::vector ऑब्जेक्ट से कॉपी किए गए हैं, जिसका मान प्रकार **T** के समान है लेकिन **[UnderlyingType](./underlyingtype/)** से अलग है। |
| [Array](./array/)(std::vector\<Q\>\&&) | [Array](./) ऑब्जेक्ट बनाता है और उसे उन मानों से भरता है जो std::vector ऑब्जेक्ट से मूव किए गए हैं, जिसका मान प्रकार **T** के समान है लेकिन **[UnderlyingType](./underlyingtype/)** से अलग है। |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | [Array](./) ऑब्जेक्ट बनाता है और उसे निर्दिष्ट इनिशियलाइज़र सूची से भरता है जिसमें **[UnderlyingType](./underlyingtype/)** प्रकार के तत्व होते हैं। |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | निर्मित करता है एक [Array](./) ऑब्जेक्ट और इसे निर्दिष्ट एरे से मानों से भरता है जिसमें **[UnderlyingType](./underlyingtype/)** प्रकार के तत्व होते हैं। |
| [Array](./array/)(std::initializer_list\<bool\>, int) | निर्मित करता है एक [Array](./) ऑब्जेक्ट और इसे निर्दिष्ट इनिशियलाइज़र सूची से मानों से भरता है जिसमें bool प्रकार के तत्व होते हैं। |
| [begin](./begin/)() | कंटेनर के पहले तत्व के लिए एक इटरेटर लौटाता है। यदि कंटेनर खाली है, तो लौटाया गया इटरेटर [end()](./end/) के बराबर होगा। |
| [begin](./begin/)() const | const-योग्य कंटेनर के पहले तत्व के लिए एक इटरेटर लौटाता है। यदि कंटेनर खाली है, तो लौटाया गया इटरेटर [end()](./end/) के बराबर होगा। |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | सॉर्टेड एरे में बाइनरी सर्च करता है। |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | लागू नहीं किया गया। |
| [cbegin](./cbegin/)() const | कंटेनर के पहले const-योग्य तत्व के लिए एक इटरेटर लौटाता है। यदि कंटेनर खाली है, तो लौटाया गया इटरेटर [cend()](./cend/) के बराबर होगा। |
| [cend](./cend/)() const | कंटेनर के अंतिम तत्व के बाद के तत्व के लिए एक इटरेटर लौटाता है। यह तत्व एक प्लेसहोल्डर के रूप में कार्य करता है; इसे एक्सेस करने का प्रयास करने पर अपरिभाषित व्यवहार होता है। |
| [Clear](./clear/)() override | समर्थित नहीं है क्योंकि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया ऐरे केवल-पढ़ने योग्य है। |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | **count** मानों को **startIndex** इंडेक्स से शुरू करके निर्दिष्ट एरे में डिफ़ॉल्ट मानों से बदलता है। |
| [Clone](./clone/)() | एरे को क्लोन करता है। |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | [System.Array](./) से तत्वों की एक रेंज कॉपी करता है, जो निर्दिष्ट स्रोत से शुरू होती है। |
| [Contains](./contains/)(const T\&) const override | निर्धारित करता है कि निर्दिष्ट आइटम एरे में है या नहीं। |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | एक नया [Array](./) ऑब्जेक्ट बनाता है और इसे निर्दिष्ट एरे के तत्वों से भरता है जो निर्दिष्ट कन्वर्टर डेलीगेट का उपयोग करके **OutputType** प्रकार में परिवर्तित होते हैं। |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | एक नया [Array](./) ऑब्जेक्ट बनाता है और इसे निर्दिष्ट एरे के तत्वों से भरता है जो निर्दिष्ट कन्वर्टर फ़ंक्शन ऑब्जेक्ट का उपयोग करके **OutputType** प्रकार में परिवर्तित होते हैं। |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | निर्दिष्ट संख्या में तत्वों को स्रोत एरे से गंतव्य एरे में कॉपी करता है। |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | निर्दिष्ट संख्या में तत्वों को स्रोत एरे व्यू से गंतव्य एरे में कॉपी करता है। |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | निर्दिष्ट संख्या में तत्वों को स्रोत एरे से गंतव्य एरे व्यू में कॉपी करता है। |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | निर्दिष्ट संख्या में तत्वों को स्रोत एरे व्यू से गंतव्य एरे व्यू में कॉपी करता है। |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | स्टैक पर स्रोत एरे से गंतव्य एरे में निर्दिष्ट संख्या में तत्वों को कॉपी करता है। |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | स्रोत एरे से स्टैक पर गंतव्य एरे में निर्दिष्ट संख्या में तत्वों को कॉपी करता है। |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | स्टैक पर स्रोत एरे से स्टैक पर गंतव्य एरे में निर्दिष्ट संख्या में तत्वों को कॉपी करता है। |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है। |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | स्रोत एरे व्यू से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है। |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे व्यू में निर्दिष्ट स्थिति तक कॉपी करता है। |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | स्रोत एरे व्यू से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे व्यू में निर्दिष्ट स्थिति तक कॉपी करता है। |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | स्टैक पर स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है। |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को स्टैक पर गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है। |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | स्टैक पर स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को स्टैक पर गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है। |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | स्रोत एरे व्यू से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को स्टैक पर गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है। |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | वर्तमान एरे के सभी तत्वों को निर्दिष्ट गंतव्य एरे में कॉपी करता है। तत्वों को गंतव्य एरे में arrayIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है। |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | वर्तमान एरे के सभी तत्वों को निर्दिष्ट गंतव्य एरे में कॉपी करता है। तत्वों को गंतव्य एरे में dstIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है। |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | वर्तमान एरे के सभी तत्वों को निर्दिष्ट गंतव्य एरे व्यू में कॉपी करता है। तत्वों को गंतव्य एरे व्यू में dstIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है। |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | निर्दिष्ट स्थिति से शुरू करके वर्तमान एरे से निर्दिष्ट संख्या में तत्वों को निर्दिष्ट गंतव्य एरे में कॉपी करता है। तत्वों को गंतव्य एरे में dstIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है। |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | निर्दिष्ट स्थिति से शुरू करके वर्तमान एरे से निर्दिष्ट संख्या में तत्वों को निर्दिष्ट गंतव्य एरे व्यू में कॉपी करता है। तत्वों को गंतव्य एरे व्यू में dstIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है। |
| [Count](./count/)() const | ऐरे के सभी आयामों में सभी तत्वों की कुल संख्या को दर्शाने वाला एक संख्या लौटाता है। |
| [crbegin](./crbegin/)() const | रिवर्स्ड कंटेनर के पहले तत्व के लिए एक रिवर्स इटरेटर लौटाता है। यह गैर-रिवर्स्ड कंटेनर के अंतिम तत्व के अनुरूप है। यदि कंटेनर खाली है, तो लौटाया गया इटरेटर [crend()](./crend/) के बराबर होगा। |
| [crend](./crend/)() const | रिवर्स्ड कंटेनर के अंतिम तत्व के बाद के तत्व के लिए एक रिवर्स इटरेटर लौटाता है। यह गैर-रिवर्स्ड कंटेनर के पहले तत्व से पहले वाले तत्व के अनुरूप है। यह तत्व एक प्लेसहोल्डर के रूप में कार्य करता है; इसे एक्सेस करने का प्रयास करने पर अपरिभाषित व्यवहार होता है। |
| [data](./data/)() | ऐरे तत्वों को संग्रहीत करने के लिए उपयोग की जाने वाली आंतरिक डेटा संरचना का एक संदर्भ लौटाता है। |
| [data](./data/)() const | ऐरे तत्वों को संग्रहीत करने के लिए उपयोग की जाने वाली आंतरिक डेटा संरचना का एक स्थिर संदर्भ लौटाता है। |
| [data_ptr](./data_ptr/)() | ऐरे तत्वों के संग्रहीत होने वाले मेमोरी बफ़र की शुरुआत की ओर एक कच्चा पॉइंटर लौटाता है। |
| [data_ptr](./data_ptr/)() const | ऐरे तत्वों के संग्रहीत होने वाले मेमोरी बफ़र की शुरुआत की ओर एक स्थिर कच्चा पॉइंटर लौटाता है। |
| [end](./end/)() | कंटेनर के अंतिम तत्व के बाद के तत्व के लिए एक इटरेटर लौटाता है। यह तत्व एक प्लेसहोल्डर के रूप में कार्य करता है; इसे एक्सेस करने का प्रयास करने पर अपरिभाषित व्यवहार होता है। |
| [end](./end/)() const | const-योग्य कंटेनर के अंतिम तत्व के बाद के तत्व के लिए एक इटरेटर लौटाता है। यह तत्व एक प्लेसहोल्डर के रूप में कार्य करता है; इसे एक्सेस करने का प्रयास करने पर अपरिभाषित व्यवहार होता है। |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | निर्दिष्ट [Array](./) ऑब्जेक्ट में कोई ऐसा तत्व है जो निर्दिष्ट प्रेडिकेट की आवश्यकताओं को पूरा करता है, यह निर्धारित करता है। |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | निर्दिष्ट एरे में पहला वह तत्व खोजता है जो निर्दिष्ट प्रेडिकेट की शर्तों को पूरा करता है। |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | निर्दिष्ट प्रेडिकेट द्वारा परिभाषित शर्तों से मेल खाने वाले सभी तत्वों को प्राप्त करता है। |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | निर्दिष्ट एरे में पहला वह तत्व खोजता है जो निर्दिष्ट प्रेडिकेट की शर्तों को पूरा करता है। |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | निर्दिष्ट एरे के प्रत्येक तत्व पर निर्दिष्ट क्रिया को निष्पादित करता है। |
| [get_Count](./get_count/)() const override | एरे का आकार लौटाता है। |
| [get_IsReadOnly](./get_isreadonly/)() const override | बताता है कि एरे केवल-पढ़ने योग्य है या नहीं। |
| [get_Length](./get_length/)() const | ऐरे के सभी आयामों में सभी तत्वों की कुल संख्या को दर्शाने वाला 32-बिट पूर्णांक लौटाता है। |
| [get_LongLength](./get_longlength/)() const | ऐरे के सभी आयामों में सभी तत्वों की कुल संख्या को दर्शाने वाला 64-बिट पूर्णांक लौटाता है। |
| [get_Rank](./get_rank/)() const | लागू नहीं किया गया। |
| [GetEnumerator](./getenumerator/)() override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए एरे के तत्वों को IEnumerator इंटरफ़ेस प्रदान करने वाले [Enumerator](./enumerator/) ऑब्जेक्ट का एक पॉइंटर लौटाता है। |
| [GetLength](./getlength/)(int) | निर्दिष्ट आयाम में तत्वों की संख्या लौटाता है। |
| [GetLongLength](./getlonglength/)(int) | निर्दिष्ट आयाम में तत्वों की संख्या को 64-बिट पूर्णांक के रूप में लौटाता है। |
| [GetLowerBound](./getlowerbound/)(int) const | निर्दिष्ट आयाम की निचली सीमा लौटाता है। |
| [GetSizeTLength](./getsizetlength/)() const | ऐरे के सभी आयामों में सभी तत्वों की कुल संख्या को दर्शाने वाला std::size_t चर लौटाता है। |
| [GetUpperBound](./getupperbound/)(int) | निर्दिष्ट आयाम की ऊपरी सीमा लौटाता है। |
| [idx_get](./idx_get/)(int) const override | निर्दिष्ट इंडेक्स पर स्थित आइटम लौटाता है। |
| [idx_set](./idx_set/)(int, T) override | निर्दिष्ट मान को निर्दिष्ट इंडेक्स पर एरे के आइटम के रूप में सेट करता है। |
| [IndexOf](./indexof/)(const T\&) const override | ऐरे में निर्दिष्ट आइटम की पहली उपस्थिति का सूचकांक निर्धारित करता है। |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | ऐरे में निर्दिष्ट आइटम की पहली उपस्थिति का सूचकांक निर्धारित करता है। |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | निर्दिष्ट सूचकांक से शुरू करके ऐरे में निर्दिष्ट आइटम की पहली उपस्थिति का सूचकांक निर्धारित करता है। |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | शुरूआती सूचकांक और रेंज में तत्वों की संख्या द्वारा निर्दिष्ट रेंज में ऐरे के आइटमों में निर्दिष्ट आइटम की पहली उपस्थिति का सूचकांक निर्धारित करता है। |
| [Init](./init/)(const T) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ऐरे को निर्दिष्ट ऐरे के मानों से भरता है। |
| [Initialize](./initialize/)() | **T** प्रकार के डिफ़ॉल्ट निर्मित ऑब्जेक्ट्स से ऐरे को भरता है। |
| [Insert](./insert/)(int, const T\&) override | समर्थित नहीं है क्योंकि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया ऐरे केवल-पढ़ने योग्य है। |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | शुरूआती सूचकांक और रेंज में तत्वों की संख्या द्वारा निर्दिष्ट रेंज में ऐरे के आइटमों में निर्दिष्ट आइटम की अंतिम उपस्थिति का सूचकांक निर्धारित करता है। |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | निर्दिष्ट सूचकांक से शुरू करके ऐरे में निर्दिष्ट आइटम की अंतिम उपस्थिति का सूचकांक निर्धारित करता है। |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | ऐरे में निर्दिष्ट आइटम की अंतिम उपस्थिति का सूचकांक निर्धारित करता है। |
| [Max](./max/)() const | ऐरे में सबसे बड़ा तत्व खोजता है, तत्वों की तुलना के लिए [operator<()](../operator_/) का उपयोग करता है। |
| [Min](./min/)() const | ऐरे में सबसे छोटा तत्व खोजता है, तत्वों की तुलना के लिए [operator<()](../operator_/) का उपयोग करता है। |
| [operator[]](./operator[]/)(int) | निर्दिष्ट सूचकांक पर एक आइटम लौटाता है। |
| [operator[]](./operator[]/)(int) const | निर्दिष्ट सूचकांक पर एक आइटम लौटाता है। |
| [rbegin](./rbegin/)() | रिवर्स्ड कंटेनर के पहले तत्व के लिए एक रिवर्स इटररेटर लौटाता है। यह नॉन-रिवर्स्ड कंटेनर के अंतिम तत्व के बराबर है। यदि कंटेनर खाली है, तो लौटाया गया इटररेटर [rend()](./rend/) के बराबर होगा। |
| [rbegin](./rbegin/)() const | रिवर्स्ड कंटेनर के पहले तत्व के लिए एक रिवर्स इटररेटर लौटाता है। यह नॉन-रिवर्स्ड कंटेनर के अंतिम तत्व के बराबर है। यदि कंटेनर खाली है, तो लौटाया गया इटररेटर [rend()](./rend/) के बराबर होगा। |
| [Remove](./remove/)(const T\&) override | समर्थित नहीं है क्योंकि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया ऐरे केवल-पढ़ने योग्य है। |
| [RemoveAt](./removeat/)(int) override | समर्थित नहीं है क्योंकि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया ऐरे केवल-पढ़ने योग्य है। |
| [rend](./rend/)() | रिवर्स्ड कंटेनर के अंतिम तत्व के बाद के तत्व के लिए एक रिवर्स इटरेटर लौटाता है। यह गैर-रिवर्स्ड कंटेनर के पहले तत्व से पहले वाले तत्व के अनुरूप है। यह तत्व एक प्लेसहोल्डर के रूप में कार्य करता है; इसे एक्सेस करने का प्रयास करने पर अपरिभाषित व्यवहार होता है। |
| [rend](./rend/)() const | रिवर्स्ड कंटेनर के अंतिम तत्व के बाद के तत्व के लिए एक रिवर्स इटरेटर लौटाता है। यह गैर-रिवर्स्ड कंटेनर के पहले तत्व से पहले वाले तत्व के अनुरूप है। यह तत्व एक प्लेसहोल्डर के रूप में कार्य करता है; इसे एक्सेस करने का प्रयास करने पर अपरिभाषित व्यवहार होता है। |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | निर्दिष्ट ऐरे का आकार निर्दिष्ट मान में बदलता है या निर्दिष्ट आकार के साथ नया ऐरे बनाता है। |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | निर्दिष्ट ऐरे में तत्वों को उल्टा करता है। |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | निर्दिष्ट ऐरे में तत्वों की एक रेंज को उल्टा करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | ऐरे को संग्रहीत पॉइंटर्स को कमजोर के रूप में मानने के लिए बनाता है (यदि लागू हो)। |
| [SetValue](./setvalue/)(const T\&, int) | निर्दिष्ट सूचकांक पर तत्व का मान सेट करता है। |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | डिफ़ॉल्ट तुलना करने वाले का उपयोग करके निर्दिष्ट ऐरे में तत्वों को क्रमबद्ध करता है। |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | डिफ़ॉल्ट तुलना करने वाले का उपयोग करके निर्दिष्ट ऐरे में तत्वों की एक रेंज को क्रमबद्ध करता है। |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | निर्दिष्ट तुलना करने वाले का उपयोग करके निर्दिष्ट ऐरे में तत्वों को क्रमबद्ध करता है। |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | लागू नहीं किया गया। |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | दो ऐरे को क्रमबद्ध करता है—एक जिसमें कुंजियाँ हैं और दूसरा‑ संबंधित आइटम—कुंजियों वाले ऐरे के मानों के आधार पर, जिनके तत्वों की तुलना operator< से की जाती है। |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | दो ऐरे को क्रमबद्ध करता है—एक जिसमें कुंजियाँ हैं और दूसरा‑ संबंधित आइटम—कुंजियों वाले ऐरे के मानों के आधार पर, जिनके तत्वों की तुलना डिफ़ॉल्ट तुलना करने वाले से की जाती है। |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | निर्दिष्ट ऐरे में सभी तत्व निर्दिष्ट प्रेडिकेट द्वारा परिभाषित शर्तों को पूरा करते हैं या नहीं, यह निर्धारित करता है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [const_reverse_iterator](./const_reverse_iterator/) | कॉन्स्ट रिवर्स इटररेटर प्रकार। |
| [EnumerablePtr](./enumerableptr/) | **T** प्रकार के तत्वों वाले IEnumerable ऑब्जेक्ट की ओर इशारा करने वाले साझा पॉइंटर प्रकार का एक उपनाम। |
| [EnumeratorPtr](./enumeratorptr/) | एक उपनाम जो साझा पॉइंटर प्रकार को दर्शाता है जो **T** प्रकार के तत्वों वाले IEnumerator ऑब्जेक्ट की ओर संकेत करता है। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [reverse_iterator](./reverse_iterator/) | रिवर्स इटररेटर प्रकार। |
| [UnderlyingType](./underlyingtype/) | ऐरे के प्रत्येक तत्व को दर्शाने के लिए उपयोग किए जाने वाले प्रकार का उपनाम। |
| [ValueType](./valuetype/) | ऐरे के तत्वों के प्रकार का उपनाम। |
## टिप्पणियाँ



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // एरे बनाएं और उसे भरें।
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // एरे के आइटम प्रिंट करें।
  Print(arrayPtr);

  // ऐरे के आइटम को आरोही क्रम में क्रमबद्ध करें।
  Array<int32_t>::Sort(arrayPtr);

  // एरे के आइटम प्रिंट करें।
  Print(arrayPtr);

  // ऐरे के आइटम की गिनती प्रिंट करें।
  std::cout << arrayPtr->get_Length() << std::endl;

  // उस आइटम का इंडेक्स प्रिंट करें जिसका मान 4 के बराबर है।
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // ऐरे का आकार बदलें।
  Array<int32_t>::Resize(arrayPtr, 3);

  // एरे के आइटम प्रिंट करें।
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## संबंधित देखें

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
