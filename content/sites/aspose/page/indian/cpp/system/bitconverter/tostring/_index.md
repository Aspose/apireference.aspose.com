---
title: "System::BitConverter::ToString method"
linktitle: "ToString"
second_title: "Aspose.Page C++ के लिए"
description: "System::BitConverter::ToString method. निर्दिष्ट बाइट ऐरे के सभी मानों को उनके हेक्साडेसिमल स्ट्रिंग प्रतिनिधित्व में बदलता है। हेक्साडेसिमल नोटेशन में उपयोग किए जाने वाले अक्षरों का केस और प्रत्येक पड़ोसी बाइट जोड़ी के बीच डाला गया विभाजक C++ में संबंधित तर्कों के माध्यम से निर्दिष्ट किया जाता है।"
type: docs
weight: 1200
url: /hi/cpp/system/bitconverter/tostring/
---
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, bool, const String\&) method


निर्दिष्ट बाइट सरणी के सभी मानों को उनके हेक्साडेसिमल स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है। हेक्साडेसिमल नोटेशन में उपयोग किए जाने वाले अक्षरों का केस और पड़ोसी बाइट्स की प्रत्येक जोड़ी के बीच डाला गया विभाजक संबंधित तर्कों के माध्यम से निर्दिष्ट किया जाता है।

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, bool uppercase=true, const String &separator=u"-")
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | बाइट्स को परिवर्तित करने वाला [Array](../../array/) |
| बड़े अक्षर | bool | परिणामी हेक्साडेसिमल प्रतिनिधित्व में उपयोग किए जाने वाले अक्षरों के केस को निर्दिष्ट करता है |
| विभाजक | const String\& | परिणामी स्ट्रिंग में प्रत्येक पड़ोसी बाइट जोड़ी के बीच डाला गया विभाजक के रूप में उपयोग की जाने वाली स्ट्रिंग |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified byte array

## संबंधित देखें

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int) method


निर्दिष्ट बाइट सरणी के मानों को निर्दिष्ट सूचकांक से शुरू होकर उनके हेक्साडेसिमल स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है।

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | बाइट्स को परिवर्तित करने वाला [Array](../../array/) |
| startIndex | int | रूपांतरण शुरू करने के लिए निर्दिष्ट ऐरे में सूचकांक |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## संबंधित देखें

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToString(const ArrayPtr\<uint8_t\>\&, int, int) method


निर्दिष्ट बाइट सरणी के मानों की एक सीमा को उनके हेक्साडेसिमल स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है।

```cpp
static String System::BitConverter::ToString(const ArrayPtr<uint8_t> &value, int startIndex, int length)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const ArrayPtr\<uint8_t\>\& | बाइट्स को परिवर्तित करने वाला [Array](../../array/) |
| startIndex | int | रूपांतरण के लिए बाइट ऐरे तत्वों की सीमा शुरू होने वाला निर्दिष्ट ऐरे में सूचकांक |
| length | int | रूपांतरण के लिए बाइट ऐरे तत्वों की सीमा की लंबाई |

### ReturnValue

[String](../../string/) containing hexadecimal representation of the specified range of elements of the specified array

## संबंधित देखें

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
