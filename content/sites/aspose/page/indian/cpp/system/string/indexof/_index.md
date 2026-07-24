---
title: "System::String::IndexOf विधि"
linktitle: "IndexOf"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::IndexOf विधि। C++ में सबस्ट्रिंग में अक्षर का आगे की खोज।"
type: docs
weight: 1500
url: /hi/cpp/system/string/indexof/
---
## String::IndexOf(char_t, int, int) const method


सबस्ट्रिंग में अक्षर आगे की खोज।

```cpp
int System::String::IndexOf(char_t c, int startIndex, int count) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| c | char_t | खोजने के लिए अक्षर। |
| startIndex | int | जिस स्थान से खोज शुरू करनी है उसका सूचकांक। |
| count | int | जिन अक्षरों को देखना है उनकी संख्या। |

### ReturnValue

startIndex से पहले अक्षर की स्थिति का इंडेक्स, या यदि नहीं मिला तो -1।

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(char_t, int) const method


अक्षर आगे की खोज।

```cpp
int System::String::IndexOf(char_t c, int startIndex=0) const
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
## String::IndexOf(const String\&, int, int) const method


सबस्ट्रिंग आगे की खोज।

```cpp
int System::String::IndexOf(const String &str, int startIndex, int count) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| startIndex | int | स्रोत स्ट्रिंग में वह स्थिति जहाँ से खोज शुरू करनी है। |
| count | int | जाँचने के लिए अक्षरों की संख्या। |

### ReturnValue

पहले पाए गए सबस्ट्रिंग का इंडेक्स या यदि न मिले तो -1। खाली लुकअप स्ट्रिंग के लिए हमेशा startIndex लौटाता है।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, System::StringComparison) const method


सबस्ट्रिंग आगे की खोज।

```cpp
int System::String::IndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| startIndex | int | स्रोत स्ट्रिंग में वह स्थिति जहाँ से खोज शुरू करनी है। |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

पहले पाए गए सबस्ट्रिंग का इंडेक्स या यदि न मिले तो -1। खाली लुकअप स्ट्रिंग के लिए हमेशा startIndex लौटाता है।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int) const method


सबस्ट्रिंग आगे की खोज।

```cpp
int System::String::IndexOf(const String &str, int startIndex=0) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| startIndex | int | स्रोत स्ट्रिंग में वह स्थिति जहाँ से खोज शुरू करनी है। |

### ReturnValue

पहले पाए गए सबस्ट्रिंग का इंडेक्स या यदि न मिले तो -1। खाली लुकअप स्ट्रिंग के लिए हमेशा startIndex लौटाता है।

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, System::StringComparison) const method


सबस्ट्रिंग आगे की खोज।

```cpp
int System::String::IndexOf(const String &str, System::StringComparison comparison_type) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

पहले पाए गए सबस्ट्रिंग का इंडेक्स या यदि न मिले तो -1। खाली लुकअप स्ट्रिंग के लिए हमेशा 0 लौटाता है।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::IndexOf(const String\&, int, int, System::StringComparison) const method


सबस्ट्रिंग आगे की खोज।

```cpp
int System::String::IndexOf(const String &value, int startIndex, int count, System::StringComparison comparisonType) const
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const String\& | जिस उपस्ट्रिंग की खोज करनी है। |
| startIndex | int | स्रोत स्ट्रिंग में वह स्थिति जहाँ से खोज शुरू करनी है। |
| count | int | जाँचने के लिए अक्षरों की संख्या। |
| comparisonType | System::StringComparison | [Comparison](../../comparison/) मोड। |

### ReturnValue

पहले पाए गए सबस्ट्रिंग का इंडेक्स या यदि न मिले तो -1। खाली लुकअप स्ट्रिंग के लिए हमेशा startIndex लौटाता है।

## संबंधित देखें

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
