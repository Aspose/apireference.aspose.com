---
title: "System::Globalization::DateTimeStyles एन्‍युम"
linktitle: "DateTimeStyles"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::DateTimeStyles एन्‍युम। तिथि और समय स्वरूपण विकल्पों को परिभाषित करता है। C++ में बिट फ़्लैग्स।"
type: docs
weight: 3500
url: /hi/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


तारीख और समय स्वरूपण विकल्पों को परिभाषित करता है। बिट फ़्लैग।

```cpp
enum class DateTimeStyles : int32_t
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| None | 0 | डिफ़ॉल्ट। |
| AllowLeadingWhite | 1 | प्रारंभिक खाली स्थानों को अनदेखा करें। |
| AllowTrailingWhite | 2 | अंतिम खाली स्थानों को अनदेखा करें। |
| AllowInnerWhite | 4 | आंतरिक खाली स्थानों को अनदेखा करें। |
| AllowWhiteSpaces | n/a | सभी खाली स्थानों को अनदेखा करें। |
| NoCurrentDateDefault | 8 | जब एक तिथि/समय स्ट्रिंग को पार्स किया जाता है, यदि सभी वर्ष/माह/दिन अनुपलब्ध हों, तो डिफ़ॉल्ट तिथि को 0001/1/1 सेट करें, वर्तमान वर्ष/माह/दिन के बजाय। |
| AdjustToUniversal | 16 | जब एक तिथि/समय स्ट्रिंग को पार्स किया जाता है, यदि टाइमज़ोन संकेतक ("GMT","Z","+xxxx","-xxxx" मौजूद हो), तो हम पार्स किए गए समय को GMT के आधार पर समायोजित करेंगे। |
| AssumeLocal | 32 | यदि कोई टाइमज़ोन नहीं दिया गया है, तो स्थानीय टाइमज़ोन का उपयोग करें। |
| AssumeUniversal | 64 | यदि कोई टाइमज़ोन नहीं दिया गया है, तो UTC का उपयोग करें। |
| RoundtripKind | 128 | इनपुट अनिर्दिष्ट, स्थानीय या UTC है या नहीं, इसे संरक्षित करने का प्रयास करें। |

## संबंधित देखें

* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
