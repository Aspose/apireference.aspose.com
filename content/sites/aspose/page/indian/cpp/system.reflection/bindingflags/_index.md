---
title: "System::Reflection::BindingFlags एन्‍युम"
linktitle: "BindingFlags"
second_title: "Aspose.Page C++ के लिए"
description: "System::Reflection::BindingFlags एन्‍युम। C++ में सदस्य और प्रकारों की लुकअप मोड्स और बाइंडिंग्स को परिभाषित करता है।"
type: docs
weight: 1100
url: /hi/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


सदस्यों और प्रकारों के लुकअप मोड्स और बाइंडिंग्स को परिभाषित करता है।

```cpp
enum class BindingFlags
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Default | 0 | कोई विशेष विकल्प नहीं। |
| IgnoreCase | 1 | आइटम खोजते समय नाम के केस को अनदेखा करें। |
| DeclaredOnly | 2 | केवल उन सदस्यों को देखें जो टाइप में घोषित हैं और बेसटाइप में नहीं। |
| Instance | 4 | इंस्टेंस सदस्यों के माध्यम से देखें। |
| Static | 8 | स्टैटिक सदस्यों के माध्यम से देखें। |
| Public | 16 | पब्लिक सदस्यों के माध्यम से देखें। |
| NonPublic | 32 | नॉन-पब्लिक सदस्यों के माध्यम से देखें। |
| FlattenHierarchy | 64 | बेसटाइप के पब्लिक और प्रोटेक्टेड स्टैटिक सदस्यों के माध्यम से देखें। |
| InvokeMethod | 256 | मेथड को कॉल करता है। |
| CreateInstance | 512 | रिफ्लेक्टेड टाइप का इंस्टेंस बनाता है। |
| GetField | 1024 | फ़ील्ड का मान प्राप्त करता है। |
| SetField | 2048 | फ़ील्ड का मान सेट करता है। |
| GetProperty | 4096 | प्रॉपर्टी का मान प्राप्त करता है। |
| SetProperty | 8192 | प्रॉपर्टी का मान सेट करता है। |
| PutDispProperty | 16384 | COM प्रॉपर्टी स्थापित करता है। |
| PutRefDispProperty | 32768 | COM रेफ़रेंस प्रॉपर्टी स्थापित करता है। |
| ExactBinding | 65536 | टाइप बाइंडिंग बिल्कुल सटीक होनी चाहिए, बिना किसी प्रकार परिवर्तन के। |
| SuppressChangeType | 131072 | समर्थित नहीं है। |
| OptionalParamBinding | 262144 | आर्ग्युमेंट्स की संख्या के आधार पर ओवरलोड चुनता है। |
| IgnoreReturn | 16777216 | COM इंटरऑप रिटर्न वैल्यू को अनदेखा करता है। |

## संबंधित देखें

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
