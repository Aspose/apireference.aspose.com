---
title: "System::Reflection::FieldAttributes enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Page C++ के लिए"
description: "System::Reflection::FieldAttributes enum. C++ में प्रतिबिंबित फ़ील्ड एट्रिब्यूट्स।"
type: docs
weight: 1200
url: /hi/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


रिफ्लेक्टेड फ़ील्ड एट्रिब्यूट्स।

```cpp
enum class FieldAttributes
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| FieldAccessMask | 7 | सदस्य पहुँच मास्क। इस मास्क का उपयोग पहुँच जानकारी प्राप्त करने के लिए करें। |
| PrivateScope | 0 | गैर‑संदर्भनीय सदस्य। |
| Private | 1 | निजी सदस्य। |
| FamANDAssem | 2 | निजी और असेंबली-स्कोप्ड सदस्य। |
| Assembly | 3 | असेंबली-स्कोप्ड सदस्य। |
| Family | 4 | प्रकार और उपप्रकारों द्वारा पहुँच योग्य सदस्य। |
| FamORAssem | 5 | प्रकार, उप‑प्रकार और असेंबली द्वारा पहुँच योग्य सदस्य। |
| Public | 6 | किसी भी व्यक्ति द्वारा पहुँच योग्य सदस्य। |
| Static | 16 | इंस्टेंस सदस्यों के विपरीत स्थैतिक सदस्य। |
| InitOnly | 32 | स्थिर सदस्य जो केवल प्रारंभ किए जा सकते हैं लेकिन बदले नहीं जा सकते। |
| शाब्दिक | 64 | संकलन समय स्थिर सदस्य। |
| NotSerialized | 128 | असिरियलाइज़्ड सदस्य। |
| SpecialName | 512 | नीचे दिए गए नामों में से एक का विशेष फ़ील्ड। |
| PinvokeImpl | 8192 | इंटरऑप अग्रेषित कार्यान्वयन। |
| ReservedMask | 38144 | केवल रनटाइम उपयोग के लिए आरक्षित फ़्लैग्स। |
| RTSpecialName | 1024 | रनटाइम को नाम एन्कोडिंग की जाँच करनी चाहिए। |
| HasFieldMarshal | 4096 | मार्शलिंग जानकारी मौजूद है। |
| HasDefault | 32768 | डिफ़ॉल्ट मान मौजूद है। |
| HasFieldRVA | 256 | RVA मौजूद है। |

## संबंधित देखें

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
