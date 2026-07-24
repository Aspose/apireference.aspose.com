---
title: "System::String::String कंस्ट्रक्टर"
linktitle: "String"
second_title: "Aspose.Page C++ के लिए"
description: "System::String::String कंस्ट्रक्टर। डिफ़ॉल्ट कंस्ट्रक्टर। C++ में ऐसा स्ट्रिंग ऑब्जेक्ट बनाता है जिसे null माना जाता है।"
type: docs
weight: 100
url: /hi/cpp/system/string/string/
---
## String::String() constructor


डिफ़ॉल्ट कंस्ट्रक्टर। एक स्ट्रिंग ऑब्जेक्ट बनाता है जिसे null माना जाता है।

```cpp
System::String::String()
```

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


मूव कंस्ट्रक्टर।

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString को [String](../) में लपेटने के लिए। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


पूरे कैरेक्टर एरे को स्ट्रिंग में परिवर्तित करता है।

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) को स्ट्रिंग में बदलने के लिए। |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


कैरेक्टर एरे की उप-रेंज को स्ट्रिंग में परिवर्तित करता है। यदि पैरामीटर एरे की सीमा से बाहर हैं, तो खाली स्ट्रिंग बनाई जाती है।

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | अक्षर एरे। |
| offset | int | सबएरे का प्रारंभिक सूचकांक। |
| len | int | सबएरे की लंबाई। |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char *, int) constructor


कैरेक्टर स्ट्रिंग पॉइंटर और स्पष्ट लंबाई से स्ट्रिंग बनाता है।

```cpp
System::String::String(const char *str, int length)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const char * | [String](../) पॉइंटर UTF8 डेटा की ओर, यह लिटरल या एरे हो सकता है। |
| length | int | स्पष्ट स्ट्रिंग लंबाई |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int) constructor


कैरेक्टर स्ट्रिंग पॉइंटर और स्पष्ट लंबाई से स्ट्रिंग बनाता है।

```cpp
System::String::String(const char16_t *str, int length)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const char16_t * | [String](../) पॉइंटर, हो सकता है लिटरल या एरे। |
| length | int | स्पष्ट स्ट्रिंग लंबाई |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int, int) constructor


शुरुआती स्थिति से लंबाई का उपयोग करके कैरेक्टर स्ट्रिंग पॉइंटर से स्ट्रिंग बनाता है।

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const char16_t * | [String](../) पॉइंटर, हो सकता है लिटरल या एरे। |
| प्रारंभ | int | आरंभिक स्थिति। |
| length | int | [String](../) लंबाई। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t, int) constructor


फ़िल कंस्ट्रक्टर।

```cpp
System::String::String(const char16_t ch, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ch | const char16_t | भरण अक्षर। |
| count | int | लक्षित लंबाई। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


UnicodeString को [String](../) में लपेटता है।

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString को [String](../) में लपेटने के लिए। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::string\&) constructor


UTF-8 स्वरूप में प्रस्तुत std::string स्ट्रिंग से [String](../) बनाता है।

```cpp
System::String::String(const std::string &utf8str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| utf8str | const std::string\& | std::string स्ट्रिंग को [String](../) में परिवर्तित करने के लिए। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u16string\&) constructor


utf16 स्ट्रिंग से [String](../) बनाता है।

```cpp
System::String::String(const std::u16string &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const std::u16string\& | Utf16 स्ट्रिंग को [String](../) में परिवर्तित करने के लिए। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u32string\&) constructor


std::u32string स्ट्रिंग से [String](../) बनाता है।

```cpp
System::String::String(const std::u32string &u32str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| u32str | const std::u32string\& | std::u32string स्ट्रिंग को [String](../) में परिवर्तित करने के लिए। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::wstring\&) constructor


widestring से [String](../) बनाता है।

```cpp
System::String::String(const std::wstring &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const std::wstring\& | Widestring को [String](../) में परिवर्तित करने के लिए। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const String\&) constructor


कॉपी कंस्ट्रक्टर।

```cpp
System::String::String(const String &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const String\& | [String](../) कॉपी करने के लिए। |

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


कैरेक्टर स्ट्रिंग पॉइंटर के आधार पर स्ट्रिंग बनाता है। पॉइंटेड स्ट्रिंग को UTF8 में null-terminated मानता है, null कैरेक्टर के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है।

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const T\& | कैरेक्टर स्ट्रिंग पॉइंटर। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


कैरेक्टर स्ट्रिंग पॉइंटर के आधार पर स्ट्रिंग बनाता है। पॉइंटेड स्ट्रिंग को null-terminated मानता है, null कैरेक्टर के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है।

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const T\& | कैरेक्टर स्ट्रिंग पॉइंटर। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


वाइडकैरेक्टर स्ट्रिंग पॉइंटर के आधार पर स्ट्रिंग बनाता है। पॉइंटेड स्ट्रिंग को null-terminated मानता है, null कैरेक्टर के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है। कुछ प्लेटफ़ॉर्म पर wchar_t से रूपांतरण समय-साध्य है, इसलिए कोई अप्रत्यक्ष रूपांतरण अनुमति नहीं है।

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const T\& | कैरेक्टर स्ट्रिंग पॉइंटर। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


नलपॉइंट कंस्ट्रक्टर। अन्य टेम्प्लेट कंस्ट्रक्टर्स के साथ प्राथमिकताओं को हल करने के लिए टेम्प्लेट के रूप में घोषित किया गया है।

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | nullptr_t होना चाहिए |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const T\& | nullptr |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t *, int) constructor


वाइडकैरेक्टर स्ट्रिंग पॉइंटर और स्पष्ट लंबाई से स्ट्रिंग बनाता है। कुछ प्लेटफ़ॉर्म पर wchar_t से रूपांतरण समय-साध्य है, इसलिए कोई अप्रत्यक्ष रूपांतरण अनुमति नहीं है।

```cpp
System::String::String(const wchar_t *str, int length)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const wchar_t * | [String](../) पॉइंटर, हो सकता है लिटरल या एरे। |
| length | int | स्पष्ट स्ट्रिंग लंबाई |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t, int) constructor


फ़िल कंस्ट्रक्टर। कुछ प्लेटफ़ॉर्म पर wchar_t से रूपांतरण समय-साध्य है, इसलिए कोई अप्रत्यक्ष रूपांतरण अनुमति नहीं है।

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ch | const wchar_t | भरण अक्षर। |
| count | int | लक्षित लंबाई। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(String\&&) constructor


मूव कंस्ट्रक्टर।

```cpp
System::String::String(String &&str) noexcept
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | String\&& | [String](../) से डेटा स्थानांतरित करने के लिए। |

## संबंधित देखें

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


स्ट्रिंग लिटरल के आधार पर स्ट्रिंग बनाता है। लिटरल को UTF8 में null-terminated स्ट्रिंग मानता है, लिटरल के आकार के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है।

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | T\& | [String](../) लिटरल पॉइंटर। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


स्ट्रिंग लिटरल के आधार पर स्ट्रिंग बनाता है। लिटरल को null-terminated स्ट्रिंग मानता है, लिटरल के आकार के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है।

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | T\& | [String](../) लिटरल पॉइंटर। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


वाइडस्ट्रिंग लिटरल के आधार पर स्ट्रिंग बनाता है। लिटरल को null-terminated स्ट्रिंग मानता है, लिटरल के आकार के आधार पर लक्ष्य स्ट्रिंग की लंबाई गणना करता है। कुछ प्लेटफ़ॉर्म पर wchar_t से रूपांतरण समय-साध्य है, इसलिए कोई अप्रत्यक्ष रूपांतरण अनुमति नहीं है।

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | T\& | [String](../) लिटरल पॉइंटर। |

## संबंधित देखें

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
