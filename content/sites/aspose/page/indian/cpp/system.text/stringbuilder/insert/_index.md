---
title: "System::Text::StringBuilder::Insert मेथड"
linktitle: "इन्सर्ट"
second_title: "Aspose.Page C++ के लिए"
description: "System::Text::StringBuilder::Insert मेथड। C++ में बिल्डर की निश्चित स्थिति में अक्षर डालता है।"
type: docs
weight: 1200
url: /hi/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


बिल्डर की निश्चित स्थिति में अक्षरों को डालता है।

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int | अक्षर डालने के लिए स्थिति। |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) से स्लाइस डालने के लिए। |
| startIndex | int | [Array](../../../system/array/) स्लाइस की प्रारंभिक इंडेक्स। |
| charCount | int | [Array](../../../system/array/) स्लाइस की लंबाई। |

### ReturnValue

यह पॉइंटर।

## संबंधित देखें

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, char_t) method


बिल्डर की निश्चित स्थिति में अक्षर डालता है।

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startIndex | int | अक्षर डालने के लिए स्थिति। |
| ch | char_t | डालने के लिए अक्षर। |

### ReturnValue

यह पॉइंटर।

## संबंधित देखें

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


बिल्डर की निश्चित स्थिति में स्ट्रिंग डालता है।

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startIndex | int | अक्षर डालने के लिए स्थिति। |
| str | const String\& | [String](../../../system/string/) डालने के लिए। |

### ReturnValue

यह पॉइंटर।

## संबंधित देखें

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int, T) method


बिल्डर की निश्चित स्थिति में मान डालता है।

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| पैरामीटर | विवरण |
| --- | --- |
| पैरामीटर | टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| startIndex | int | अक्षर डालने के लिए स्थिति। |
| मान | T | फ़ॉर्मेट करने और डालने के लिए मान। |

### ReturnValue

यह पॉइंटर।

## संबंधित देखें

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


बिल्डर की निश्चित स्थिति में दोहराई गई स्ट्रिंग डालता है।

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सूचकांक | int32_t | अक्षर डालने के लिए स्थिति। |
| value | const String\& | [String](../../../system/string/) डालने के लिए। |
| count | int32_t | **value** स्ट्रिंग को कितनी बार दोहराना है। |

### ReturnValue

यह पॉइंटर।

## संबंधित देखें

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
