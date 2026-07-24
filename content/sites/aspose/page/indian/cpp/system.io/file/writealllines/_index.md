---
title: "System::IO::File::WriteAllLines मेथड"
linktitle: "WriteAllLines"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::File::WriteAllLines मेथड। एक नई टेक्स्ट फ़ाइल बनाता है या मौजूदा फ़ाइल को ओवरराइट करता है और निर्दिष्ट स्ट्रिंग्स की एरे से सभी स्ट्रिंग्स को, प्रत्येक स्ट्रिंग नई पंक्ति पर, निर्दिष्ट एन्कोडिंग का उपयोग करके C++ में लिखता है।"
type: docs
weight: 3600
url: /hi/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


निर्दिष्ट एन्कोडिंग का उपयोग करके, एक नया पाठ फ़ाइल बनाता है या मौजूदा को ओवरराइट करता है और निर्दिष्ट स्ट्रिंग्स की ऐरे से सभी स्ट्रिंग्स को नई पंक्तियों में लिखता है।

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | बनाने या ओवरराइट करने वाली फ़ाइल |
| सामग्री | const ArrayPtr\<String\>\& | एक स्ट्रिंग एरे |
| encoding | const EncodingPtr\& | उपयोग करने के लिए कैरेक्टर एन्कोडिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


निर्दिष्ट एन्कोडिंग का उपयोग करके, एक नया पाठ फ़ाइल बनाता है या मौजूदा को ओवरराइट करता है और निर्दिष्ट enumerable स्ट्रिंग्स संग्रह से सभी स्ट्रिंग्स को नई पंक्तियों में लिखता है।

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const String\& | बनाने या ओवरराइट करने वाली फ़ाइल |
| सामग्री | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | स्ट्रिंग्स का एक एन्यूमेरेबल संग्रह |
| encoding | const EncodingPtr\& | उपयोग करने के लिए कैरेक्टर एन्कोडिंग |

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
