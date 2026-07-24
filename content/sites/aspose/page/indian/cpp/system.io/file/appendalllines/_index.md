---
title: "System::IO::File::AppendAllLines मेथड"
linktitle: "AppendAllLines"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File::AppendAllLines मेथड। निर्दिष्ट स्ट्रिंग संग्रह से स्ट्रिंग्स को निर्दिष्ट एन्कोडिंग का उपयोग करके प्रत्येक स्ट्रिंग को नई पंक्ति में लिखते हुए निर्दिष्ट फ़ाइल में जोड़ता है। यदि निर्दिष्ट फ़ाइल मौजूद नहीं है, तो इसे बनाया जाता है। सभी स्ट्रिंग्स लिखने के बाद फ़ाइल C++ में बंद कर दी जाती है।"
type: docs
weight: 100
url: /hi/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


निर्दिष्ट एन्कोडिंग का उपयोग करके निर्दिष्ट स्ट्रिंग संग्रह से स्ट्रिंग्स को नई पंक्ति में लिखते हुए निर्दिष्ट फ़ाइल में जोड़ता है। यदि निर्दिष्ट फ़ाइल मौजूद नहीं है, तो इसे बनाया जाता है। सभी स्ट्रिंग्स लिखने के बाद फ़ाइल बंद कर दी जाती है।

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | स्ट्रिंग्स जोड़ने के लिए फ़ाइल का पथ |
| सामग्री | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | फ़ाइल में लिखने के लिए स्ट्रिंग्स |
| encoding | const EncodingPtr\& | उपयोग करने के लिए कैरेक्टर एन्कोडिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
