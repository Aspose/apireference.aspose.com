---
title: "System::Reflection नेमस्पेस"
linktitle: "System::Reflection"
second_title: "Aspose.Page C++ के लिए"
description: "C++ में System::Reflection नेमस्पेस का उपयोग कैसे करें।"
type: docs
weight: 4900
url: /hi/cpp/system.reflection/
---



## क्लासेस

| क्लास | विवरण |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) क्लास जो असेंबली का वर्णन करता है। समर्थन सीमित है क्योंकि नियम C# और C++ के बीच काफी अलग हैं। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करने के लिए करें। |
| [AssemblyName](./assemblyname/) | असेंबली नाम को परिभाषित करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करने के लिए करें। |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | चल रही असेंबली में प्रकार को पंजीकृत करने के लिए सिंगलटन। |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | चल रही असेंबली में प्रकार को पंजीकृत करने वाले सिंगलटन के लिए बेस टाइप। |
| [ConstructorInfo](./constructorinfo/) | कंस्ट्रक्टर मेटाडाटा तक पहुँच प्रदान करता है। |
| [FieldInfo](./fieldinfo/) | फ़ील्ड के एट्रिब्यूट्स की खोज करता है और फ़ील्ड मेटाडाटा तक पहुँच प्रदान करता है। |
| [MemberInfo](./memberinfo/) | सदस्यों पर रिफ्लेक्शन जानकारी प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करने के लिए करें। |
| [MethodBase](./methodbase/) | मेथड पर बेस जानकारी। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करने के लिए करें। |
| [MethodInfo](./methodinfo/) | क्लास मेथड की जानकारी का प्रतिनिधित्व करता है। |
| [PropertyInfo](./propertyinfo/) | प्रॉपर्टी जानकारी का प्रतिनिधित्व करता है। |
## Enums

| एनम | विवरण |
| --- | --- |
| [BindingFlags](./bindingflags/) | सदस्यों और प्रकारों के लुकअप मोड्स और बाइंडिंग्स को परिभाषित करता है। |
| [FieldAttributes](./fieldattributes/) | रिफ्लेक्टेड फ़ील्ड एट्रिब्यूट्स। |
| [MemberTypes](./membertypes/) | प्रत्येक प्रकार के सदस्य को चिह्नित करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) को Module.GetTypes मेथड द्वारा तब फेंका जाता है जब किसी मॉड्यूल में कोई क्लास लोड नहीं हो पाती। [ReflectionTypeLoadException](./reflectiontypeloadexception/) क्लास के इंस्टेंस को कभी भी [System::SmartPtr](../system/smartptr/) में लपेटें नहीं। |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) को रिफ्लेक्शन के माध्यम से बुलाए गए मेथड्स द्वारा फेंका जाता है। [TargetInvocationException](./targetinvocationexception/) क्लास के इंस्टेंस को कभी भी [System::SmartPtr](../system/smartptr/) में लपेटें नहीं। |
