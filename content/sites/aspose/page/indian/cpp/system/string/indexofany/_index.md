---
title: "System::String::IndexOfAny मेथड"
linktitle: "IndexOfAny"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::IndexOfAny मेथड। C++ में अक्षर का फ़ॉरवर्ड लुकअप।"
type: docs
weight: 1600
url: /hi/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


अक्षर आगे की खोज।

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| c | char_t | खोजने के लिए अक्षर। |
| startIndex | int | जिस स्थान से खोज शुरू करनी है उसका सूचकांक। |

### ReturnValue

startIndex से पहले अक्षर की स्थिति का इंडेक्स, या यदि नहीं मिला तो -1।

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


पूरे स्ट्रिंग में पास किए गए किसी भी अक्षर की खोज करता है। पहले स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर दूसरे की और आगे भी। लक्ष्य अक्षरों में से किसी से मेल खाने वाले पहले अक्षर का इंडेक्स लौटाता है।

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) उन अक्षरों का जिनकी खोज करनी है। क्रम का कोई महत्व नहीं है। |

### ReturnValue

पहले मिलते हुए अक्षर का इंडेक्स, या यदि नहीं मिला तो -1।

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


सबस्ट्रिंग में पास किए गए किसी भी अक्षर की खोज करता है। पहले स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर दूसरे की और आगे भी। लक्ष्य अक्षरों में से किसी से मेल खाने वाले पहले अक्षर का इंडेक्स लौटाता है।

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) उन अक्षरों का जिनकी खोज करनी है। क्रम का कोई महत्व नहीं है। |
| startindex | int32_t | खोज शुरू करने के लिए इंडेक्स। |

### ReturnValue

पहले मिलते हुए अक्षर का इंडेक्स, या यदि नहीं मिला तो -1।

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


सबस्ट्रिंग में पास किए गए किसी भी अक्षर की खोज करता है। पहले स्ट्रिंग अक्षर की तुलना anyOf के सभी अक्षरों से करता है, फिर दूसरे की और आगे भी। लक्ष्य अक्षरों में से किसी से मेल खाने वाले पहले अक्षर का इंडेक्स लौटाता है।

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) उन अक्षरों का जिनकी खोज करनी है। क्रम का कोई महत्व नहीं है। |
| startindex | int32_t | खोज शुरू करने के लिए इंडेक्स। |
| count | int32_t | जिन अक्षरों को देखना है उनकी संख्या। |

### ReturnValue

पहले मिलते हुए अक्षर का इंडेक्स, या यदि नहीं मिला तो -1।

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


इसलिए यह इस में str के सभी अक्षरों की खोज करता है। यदि पहला अक्षर मिला, तो उसकी स्थिति लौटाई जाती है, अन्यथा दूसरा अक्षर और आगे की खोज की जाती है।

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | [String](../) खोजने के लिए अक्षरों की स्ट्रिंग। अक्षरों का क्रम महत्वपूर्ण है। |
| startIndex | int | खोज शुरू करने की स्थिति। |

### ReturnValue

पहले पाए गए अक्षर का सूचकांक या -1 यदि कोई नहीं मिला।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
