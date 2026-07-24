---
title: "System::ObjectExt::Equals मेथड"
linktitle: "बराबर"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::Equals मेथड. C# Object.Equals कॉलों के लिए प्रतिस्थापन जो C++ में किसी भी प्रकार के लिए काम करता है। स्ट्रिंग लिटरल के साथ स्ट्रिंग तुलना के लिए C++ में ओवरलोड।"
type: docs
weight: 700
url: /hi/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


C# [Object.Equals](../../object/equals/) कॉलों के लिए प्रतिस्थापन जो C++ में किसी भी प्रकार के लिए काम करता है। स्ट्रिंग लिटरल के साथ स्ट्रिंग तुलना के लिए ओवरलोड।

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| पैरामीटर | विवरण |
| --- | --- |
| N | [String](../../string/) लिटरल आकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) लिटरल। |
| another | String | [String](../../string/). |

### ReturnValue

यदि स्ट्रिंग्स मेल खाती हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


C#-स्टाइल फ्लोटिंग पॉइंट तुलना को एम्यूलेट करता है जहाँ दो NaN को बराबर माना जाता है, भले ही IEC 60559:1989 के अनुसार NaN किसी भी वैल्यू के बराबर नहीं होता, जिसमें NaN भी शामिल है।

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const double\\& | बाएँ हाथ का फ्लोटिंग पॉइंट मान। |
| दूसरा | const double\\& | दाएँ हाथ का फ्लोटिंग पॉइंट मान। |

### ReturnValue

यदि **obj** और **another** दोनों NaN हैं या बराबर हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


C#-स्टाइल फ्लोटिंग पॉइंट तुलना को एम्यूलेट करता है जहाँ दो NaN को बराबर माना जाता है, भले ही IEC 60559:1989 के अनुसार NaN किसी भी वैल्यू के बराबर नहीं होता, जिसमें NaN भी शामिल है।

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const float\& | बाएँ हाथ का फ्लोटिंग पॉइंट मान। |
| दूसरा | const float\& | दाएँ हाथ का फ्लोटिंग पॉइंट मान। |

### ReturnValue

यदि **obj** और **another** दोनों NaN हैं या बराबर हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# के [Object.Equals](../../object/equals/) कॉल्स का प्रतिस्थापन, जो C++ में किसी भी प्रकार के लिए काम करता है। स्मार्ट पॉइंटर प्रकारों के लिए ओवरलोड।

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | पहला ऑब्जेक्ट प्रकार। |
| T2 | दूसरा ऑब्जेक्ट प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | पहला ऑब्जेक्ट। |
| दूसरा | const T2\& | दूसरा ऑब्जेक्ट। |

### ReturnValue

यदि ऑब्जेक्ट्स को बराबर माना जाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# के [Object.Equals](../../object/equals/) कॉल्स का प्रतिस्थापन, जो C++ में किसी भी प्रकार के लिए काम करता है। स्केलर प्रकारों के लिए ओवरलोड।

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | पहला ऑब्जेक्ट प्रकार। |
| T2 | दूसरा ऑब्जेक्ट प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | पहला ऑब्जेक्ट। |
| दूसरा | const T2\& | दूसरा ऑब्जेक्ट। |

### ReturnValue

यदि ऑब्जेक्ट्स को बराबर माना जाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


C# के [Object.Equals](../../object/equals/) कॉल्स का प्रतिस्थापन, जो C++ में किसी भी प्रकार के लिए काम करता है। स्ट्रक्चर प्रकारों के लिए ओवरलोड।

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | पहला ऑब्जेक्ट प्रकार। |
| T2 | दूसरा ऑब्जेक्ट प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | T | पहला ऑब्जेक्ट। |
| दूसरा | const T2\& | दूसरा ऑब्जेक्ट। |

### ReturnValue

यदि ऑब्जेक्ट्स को बराबर माना जाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
