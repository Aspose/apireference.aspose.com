---
title: "System::Object::Equals method"
linktitle: "बराबर"
second_title: "Aspose.Page C++ के लिए"
description: "System::Object::Equals method. C++ में C# Object.Equals सेमांटिक्स का उपयोग करके ऑब्जेक्ट्स की तुलना करता है।"
type: docs
weight: 300
url: /hi/cpp/system/object/equals/
---
## Object::Equals(ptr) method


C# [Object.Equals](./) सेमांटिक्स का उपयोग करके ऑब्जेक्ट्स की तुलना करता है।

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | ptr | [Object](../) जिसे वर्तमान वाले से तुलना की जानी है। |

### ReturnValue

यदि ऑब्जेक्ट्स को समान माना जाता है तो true, अन्यथा false।

## संबंधित देखें

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(double const\&, double const\&) method


C#-स्टाइल फ्लोटिंग पॉइंट तुलना को एम्यूलेट करता है जहाँ दो NaN को बराबर माना जाता है, भले ही IEC 60559:1989 के अनुसार NaN किसी भी वैल्यू के बराबर नहीं होता, जिसमें NaN भी शामिल है।

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| objA | double const\& | बाएँ हाथ का फ्लोटिंग पॉइंट मान। |
| objB | double const\& | दाएँ हाथ का फ्लोटिंग पॉइंट मान। |

### ReturnValue

यदि **objA** और **objB** दोनों NaN हैं या समान हैं तो सत्य, अन्यथा असत्य।

## संबंधित देखें

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(float const\&, float const\&) method


C#-स्टाइल फ्लोटिंग पॉइंट तुलना को एम्यूलेट करता है जहाँ दो NaN को बराबर माना जाता है, भले ही IEC 60559:1989 के अनुसार NaN किसी भी वैल्यू के बराबर नहीं होता, जिसमें NaN भी शामिल है।

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| objA | float const\& | बाएँ हाथ का फ्लोटिंग पॉइंट मान। |
| objB | float const\& | दाएँ हाथ का फ्लोटिंग पॉइंट मान। |

### ReturnValue

यदि **objA** और **objB** दोनों NaN हैं या समान हैं तो सत्य, अन्यथा असत्य।

## संबंधित देखें

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


रेफ़रेंस टाइप ऑब्जेक्ट्स की तुलना C# शैली में करता है।

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | तुलना करने वाले पहले ऑब्जेक्ट का प्रकार। |
| T2 | तुलना करने के लिए दूसरे ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| objA | T1 const\& | तुलना करने के लिए पहला ऑब्जेक्ट। |
| objB | T2 const\& | तुलना करने के लिए दूसरा ऑब्जेक्ट। |

### ReturnValue

सही यदि ऑब्जेक्ट्स रेफ़रेंस या सेमेंटिक रूप से ([Object.Equals](./)-जैसे तुलना) मेल खाते हैं, अन्यथा गलत।

## संबंधित देखें

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


वैल्यू टाइप ऑब्जेक्ट्स की तुलना C# शैली में करता है।

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | तुलना करने वाले पहले ऑब्जेक्ट का प्रकार। |
| T2 | तुलना करने के लिए दूसरे ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| objA | T1 const\& | तुलना करने के लिए पहला ऑब्जेक्ट। |
| objB | T2 const\& | तुलना करने के लिए दूसरा ऑब्जेक्ट। |

### ReturnValue

सही यदि उपलब्ध समानता ऑपरेटर द्वारा ऑब्जेक्ट्स को समान माना जाता है, अन्यथा गलत।

## संबंधित देखें

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
