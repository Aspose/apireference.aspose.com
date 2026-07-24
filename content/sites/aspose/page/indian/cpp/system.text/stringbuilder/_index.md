---
title: "System::Text::StringBuilder क्लास"
linktitle: "StringBuilder"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::StringBuilder क्लास। स्ट्रिंग को भाग‑भाग में संचित करने के लिए बफ़र। इस प्रकार को या तो स्टैक में वैल्यू टाइप के रूप में या हीप में System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जा सकता है। एक बार ऑब्जेक्ट आवंटित हो जाने के बाद, इन दो उपयोग मामलों को कभी मिलाएँ नहीं: स्टैक‑आवंटित ऑब्जेक्ट्स पर SmartPtr पॉइंटर्स रखना C++ में सख्ती से प्रतिबंधित है।"
type: docs
weight: 2400
url: /hi/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Append](./append/)(char_t) | बिल्डर में अक्षर जोड़ता है। |
| [Append](./append/)(char_t, int) | बिल्डर में अक्षरों को जोड़ता है। |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | बिल्डर में अक्षरों की ऐरे जोड़ता है। |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | बिल्डर में अक्षरों की ऐरे स्लाइस जोड़ता है। |
| [Append](./append/)(const String\&) | बिल्डर में स्ट्रिंग जोड़ता है। |
| [Append](./append/)(const String\&, int, int) | बिल्डर में स्ट्रिंग स्लाइस जोड़ता है। |
| [Append](./append/)(const SharedPtr\<T\>\&) | ऑब्जेक्ट की स्ट्रिंग प्रतिनिधित्व को बिल्डर में जोड़ता है। |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | बिल्डर की सामग्री को बिल्डर में जोड़ता है। |
| [Append](./append/)(float) | बिल्डर में फ्लोटिंग पॉइंट मान जोड़ता है। |
| [Append](./append/)(double) | बिल्डर में फ्लोटिंग पॉइंट मान जोड़ता है। |
| [Append](./append/)(int) | बिल्डर में पूर्णांक मान जोड़ता है। |
| [Append](./append/)(T) | बिल्डर में अंकगणितीय मान जोड़ता है। |
| [Append](./append/)(E) | बिल्डर में enum मान स्ट्रिंग प्रतिनिधित्व जोड़ता है। |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | बिल्डर में स्वरूपित स्ट्रिंग जोड़ता है। |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | बिल्डर में स्वरूपित स्ट्रिंग जोड़ता है। |
| [AppendLine](./appendline/)() | बिल्डर में नई पंक्ति अक्षर जोड़ता है। |
| [AppendLine](./appendline/)(const String\&) | बिल्डर में स्ट्रिंग के बाद नई पंक्ति अक्षर जोड़ता है। |
| [Clear](./clear/)() | बिल्डर से सभी अक्षर हटाता है। |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | बिल्डर के डेटा को मौजूदा एरे स्थितियों में कॉपी करता है। |
| [get_Capacity](./get_capacity/)() const | स्ट्रिंग बिल्डर की वर्तमान क्षमता प्राप्त करता है। |
| [get_Length](./get_length/)() const | बिल्डर में वर्तमान में मौजूद स्ट्रिंग की लंबाई प्राप्त करता है। |
| [idx_get](./idx_get/)(int) const | निर्दिष्ट स्थिति पर कैरेक्टर प्राप्त करता है। |
| [idx_set](./idx_set/)(int, char_t) | निर्दिष्ट स्थिति पर कैरेक्टर सेट करता है। |
| [Insert](./insert/)(int, const String\&) | बिल्डर की निश्चित स्थिति में स्ट्रिंग डालता है। |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | बिल्डर की निश्चित स्थिति में दोहराई गई स्ट्रिंग डालता है। |
| [Insert](./insert/)(int, char_t) | बिल्डर की निश्चित स्थिति में अक्षर डालता है। |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | बिल्डर की निश्चित स्थिति में अक्षरों को डालता है। |
| [Insert](./insert/)(int, T) | बिल्डर की निश्चित स्थिति में मान डालता है। |
| [operator[]](./operator[]/)(int) const | निर्दिष्ट स्थिति पर कैरेक्टर प्राप्त करता है। |
| [Remove](./remove/)(int, int) | बिल्डर से भाग हटाता है। |
| [Replace](./replace/)(const String\&, const String\&) | बिल्डर के माध्यम से उपस्ट्रिंग बदलता है। |
| [Replace](./replace/)(const String\&, const String\&, int, int) | बिल्डर की सीमा के माध्यम से उपस्ट्रिंग बदलता है। |
| [Replace](./replace/)(char_t, char_t) | बिल्डर के माध्यम से अक्षर बदलता है। |
| [Replace](./replace/)(char_t, char_t, int, int) | बिल्डर की सीमा के माध्यम से अक्षर बदलता है। |
| [set_Capacity](./set_capacity/)(int) | स्ट्रिंग बिल्डर की वर्तमान क्षमता सेट करता है। |
| [set_Length](./set_length/)(int) | स्ट्रिंग बिल्डर को निर्दिष्ट लंबाई तक छोटा या बड़ा करता है। |
| [StringBuilder](./stringbuilder/)() | निर्माता। |
| [StringBuilder](./stringbuilder/)(int) | निर्माता। |
| [StringBuilder](./stringbuilder/)(const String\&) | निर्माता। |
| [StringBuilder](./stringbuilder/)(const String\&, int) | निर्माता। |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | निर्माता। |
| [ToString](./tostring/)() const override | बिल्डर में वर्तमान में मौजूद स्ट्रिंग प्राप्त करता है। |
| [ToString](./tostring/)(int, int) const | बिल्डर में वर्तमान में मौजूद उपस्ट्रिंग प्राप्त करता है। |
| [~StringBuilder](./~stringbuilder/)() | डिस्ट्रक्टर। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
