---
title: "System::Reflection::Assembly क्लास"
linktitle: "Assembly"
second_title: "Aspose.Page C++ के लिए"
description: "System::Reflection::Assembly क्लास। असेंबली का वर्णन करने वाली रिफ्लेक्शन क्लास। समर्थन सीमित है क्योंकि नियम C# और C++ के बीच काफी अलग हैं। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और C++ में फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए इस पॉइंटर का उपयोग करें।"
type: docs
weight: 100
url: /hi/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Assembly](./assembly/)() | निर्माता। |
| virtual [get_CodeBase](./get_codebase/)() const | वर्तमान असेंबली की डायरेक्टरी प्राप्त करता है। समर्थन सीमित है। |
| virtual [get_FullName](./get_fullname/)() const | असेंबली का पूर्ण नाम प्राप्त करता है। |
| virtual [get_Location](./get_location/)() const | असेंबली का स्थान प्राप्त करता है। लागू नहीं किया गया है। |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | विशिष्ट प्रकार को परिभाषित करने वाली असेंबली प्राप्त करता है। |
| static [GetCallingAssembly](./getcallingassembly/)() | कॉल करने वाली असेंबली प्राप्त करता है। |
| static [GetEntryAssembly](./getentryassembly/)() | एंट्री असेंबली प्राप्त करता है। |
| static [GetExecutingAssembly](./getexecutingassembly/)() | निष्पादित असेंबली प्राप्त करता है। |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | मैनिफेस्ट संसाधनों के नाम प्राप्त करता है। |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | मैनिफेस्ट संसाधन से जुड़ी स्ट्रीम प्राप्त करता है। |
| virtual [GetName](./getname/)() const | असेंबली का नाम प्राप्त करता है। |
| virtual [GetTypes](./gettypes/)() const | असेंबली द्वारा घोषित प्रकार प्राप्त करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
