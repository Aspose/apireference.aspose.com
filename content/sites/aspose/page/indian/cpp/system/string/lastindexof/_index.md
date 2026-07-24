---
title: "System::String::LastIndexOf मेथड"
linktitle: "LastIndexOf"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::LastIndexOf मेथड। C++ में अक्षर की पीछे की खोज।"
type: docs
weight: 2400
url: /hi/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


अक्षर पीछे की खोज।

```cpp
int System::String::LastIndexOf(char_t value) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | char_t | खोजने के लिए अक्षर। |

### ReturnValue

यदि नहीं मिला तो अंतिम अक्षर की स्थिति का सूचकांक या -1।

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


अक्षर पीछे की खोज।

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | char_t | खोजने के लिए अक्षर। |
| startIndex | int32_t | जिस स्थान से खोज शुरू करनी है उसका सूचकांक। |

### ReturnValue

यदि नहीं मिला तो startIndex से शुरू करके अंतिम अक्षर की स्थिति का सूचकांक या -1।

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


अक्षर पीछे की खोज।

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | char_t | खोजने के लिए अक्षर। |
| startIndex | int32_t | जिस स्थान से खोज शुरू करनी है उसका सूचकांक। |
| count | int32_t | जिन अक्षरों को देखना है उनकी संख्या |

### ReturnValue

यदि नहीं मिला तो startIndex से शुरू करके अंतिम अक्षर की स्थिति का सूचकांक या -1।

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


सबस्ट्रिंग पीछे की खोज।

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| startIndex | int | स्रोत स्ट्रिंग में वह स्थिति जहाँ से खोज शुरू करनी है। |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

यदि नहीं मिला तो अंतिम मिली उपस्ट्रिंग का सूचकांक या -1। यदि खोज स्ट्रिंग खाली है, तो हमेशा स्ट्रिंग की लंबाई लौटाता है।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


सबस्ट्रिंग पीछे की खोज।

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| startIndex | int | स्रोत स्ट्रिंग में वह स्थिति जहाँ से खोज शुरू करनी है। |

### ReturnValue

यदि नहीं मिला तो अंतिम मिली उपस्ट्रिंग का सूचकांक या -1। यदि खोज स्ट्रिंग खाली है, तो हमेशा स्ट्रिंग की लंबाई लौटाता है।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


सबस्ट्रिंग पीछे की खोज।

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

यदि नहीं मिला तो अंतिम मिली उपस्ट्रिंग का सूचकांक या -1। यदि खोज स्ट्रिंग खाली है, तो हमेशा स्ट्रिंग की लंबाई लौटाता है।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


सबस्ट्रिंग पीछे की खोज।

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| startIndex | int | स्रोत स्ट्रिंग में वह स्थिति जहाँ से खोज शुरू करनी है। |
| count | int | जिन अक्षरों को देखना है उनकी संख्या। |
| comparisonType | StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

यदि नहीं मिला तो अंतिम मिली उपस्ट्रिंग का सूचकांक या -1। यदि खोज स्ट्रिंग खाली है, तो हमेशा startIndex+count लौटाता है।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
