---
title: "System::String::LastIndexOfAny मेथड"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::LastIndexOfAny मेथड। पूरे स्ट्रिंग को पीछे की ओर देखते हुए पास किए गए किसी भी अक्षर की खोज करता है। अंतिम स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर पिछले से और इसी तरह। C++ में पहला मिलान मिलने पर उसका इंडेक्स लौटाता है।"
type: docs
weight: 2500
url: /hi/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


पूरे स्ट्रिंग में पास किए गए किसी भी अक्षर की पीछे की ओर खोज करता है। अंतिम स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर पिछले अक्षर और आगे भी। मिलने वाले पहले मेल का इंडेक्स लौटाता है।

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) उन अक्षरों का जिनकी खोज करनी है। क्रम का कोई महत्व नहीं है। |

### ReturnValue

अंतिम मिलते हुए अक्षर का इंडेक्स या -1 यदि न मिला हो।

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


सबस्ट्रिंग में पास किए गए किसी भी अक्षर की पीछे की ओर खोज करता है। अंतिम स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर पिछले अक्षर और आगे भी। मिलने वाले पहले मेल का इंडेक्स लौटाता है।

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) उन अक्षरों का जिनकी खोज करनी है। क्रम का कोई महत्व नहीं है। |
| startindex | int32_t | खोज शुरू करने के लिए इंडेक्स। |

### ReturnValue

अंतिम मिलते हुए अक्षर का इंडेक्स या -1 यदि न मिला हो।

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


सबस्ट्रिंग में पास किए गए किसी भी अक्षर की पीछे की ओर खोज करता है। अंतिम स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर पिछले अक्षर और आगे भी। मिलने वाले पहले मेल का इंडेक्स लौटाता है।

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) उन अक्षरों का जिनकी खोज करनी है। क्रम का कोई महत्व नहीं है। |
| startindex | int32_t | खोज शुरू करने के लिए इंडेक्स। |
| count | int32_t | जिन अक्षरों को देखना है उनकी संख्या। |

### ReturnValue

अंतिम मिलते हुए अक्षर का इंडेक्स या -1 यदि न मिला हो।

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
