---
title: "System::operator== मेथड"
linktitle: "operator=="
second_title: "Aspose.Page C++ के लिए"
description: "C++ में क्लास की operator== मेथड का उपयोग कैसे करें।"
type: docs
weight: 32400
url: /hi/cpp/system/operator==/
---
## System::operator==(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator==(ArraySegment<T> a, ArraySegment<T> b)
```

## संबंधित देखें

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator==(Chars &left, const String &right)
```


| पैरामीटर | विवरण |
| --- | --- |
| Chars | [String](../string/) लिटरल प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| left | Chars\& | [String](../string/) तुलना के लिए लिटरल। |
| right | const String\& | [String](../string/) तुलना के लिए। |

### ReturnValue

यदि स्ट्रिंग्स मेल खाती हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator==(const SharedPtr<Object> &left, const String &right)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/) को स्ट्रिंग में बदलने और तुलना करने के लिए। |
| right | const String\& | [String](../string/) तुलना के लिए। |

### ReturnValue

यदि ऑब्जेक्ट की स्ट्रिंग प्रतिनिधित्व स्ट्रिंग के बराबर है तो true, अन्यथा false।

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


निर्धारित करता है कि वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए URI समान हैं या नहीं।

```cpp
bool System::operator==(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | तुलना के लिए पहला [Uri](../uri/) ऑब्जेक्ट |
| uri2 | const SharedPtr\<Uri\>\& | तुलना के लिए दूसरा [Uri](../uri/) ऑब्जेक्ट |

### ReturnValue

यदि URI समान हैं तो true, अन्यथा false

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


दो स्मार्ट पॉइंटर्स की समानता की तुलना करता है।

```cpp
template<class X,class Y> bool System::operator==(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| पैरामीटर | विवरण |
| --- | --- |
| X | पहले पॉइंटर का पॉइंटी प्रकार। |
| Y | दूसरे पॉइंटर का पॉइंटी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | तुलना के लिए पहला पॉइंटर। |
| y | const SmartPtr\<Y\>\& | तुलना के लिए दूसरा पॉइंटर। |

### ReturnValue

यदि पॉइंटर्स मेल खाते हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const SmartPtr\<X\>\&, const Y *) method


समानता तुलना स्मार्ट पॉइंटर बनाम साधारण (C) पॉइंटर।

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator==(const SmartPtr<X> &x, const Y *y)
```


| पैरामीटर | विवरण |
| --- | --- |
| X | स्मार्ट पॉइंटर का प्रकार। |
| Y | साधारण पॉइंटर का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | तुलना के लिए स्मार्ट पॉइंटर (बायाँ)। |
| y | const Y * | दाएँ (right) तुलना करने के लिए पॉइंटर। |

### ReturnValue

यदि पॉइंटर्स मेल खाते हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const T1\&, const Nullable\<T2\>\&) method


निर्धारित करता है कि निर्दिष्ट मान, निर्दिष्ट [Nullable](../nullable/) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान के बराबर है या नहीं, इन मानों पर [operator==()](./) लागू करके।

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator==(const T1 &some, const Nullable<T2> &other)
```


| पैरामीटर | विवरण |
| --- | --- |
| T1 | पहले तुलना मान का प्रकार |
| T2 | दूसरे तुलना मान का प्रतिनिधित्व करने वाले [Nullable](../nullable/) ऑब्जेक्ट का अंतर्निहित प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कुछ | const T1\& | पहले तुलना मान के रूप में उपयोग किए जाने वाले मान का एक स्थिर संदर्भ |
| other | const Nullable\<T2\>\& | दूसरे तुलना मान के रूप में उपयोग किए जाने वाले प्रतिनिधित्व मान वाले [Nullable](../nullable/) ऑब्जेक्ट का एक स्थिर संदर्भ |

### ReturnValue

यदि तुलना किए गए मान समान हैं तो true, अन्यथा false

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(const X *, const SmartPtr\<Y\>\&) method


समानता तुलना स्मार्ट पॉइंटर बनाम साधारण (C) पॉइंटर।

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator==(const X *x, const SmartPtr<Y> &y)
```


| पैरामीटर | विवरण |
| --- | --- |
| X | साधारण पॉइंटर का प्रकार। |
| Y | स्मार्ट पॉइंटर का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const X * | दाएँ (right) तुलना करने के लिए पॉइंटर। |
| y | const SmartPtr\<Y\>\& | तुलना के लिए स्मार्ट पॉइंटर (बायाँ)। |

### ReturnValue

यदि पॉइंटर्स मेल खाते हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator==(std::nullptr_t, const DateTimeOffset &)
```

## संबंधित देखें

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, const Nullable\<T\>\&) method


निर्धारित करता है कि निर्दिष्ट [Nullable](../nullable/) ऑब्जेक्ट वह मान दर्शाता है जो null के बराबर है।

```cpp
template<typename T> bool System::operator==(std::nullptr_t, const Nullable<T> &other)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| other | std::nullptr_t | परीक्षण के लिए एक [Nullable](../nullable/) ऑब्जेक्ट का स्थिर संदर्भ |

### ReturnValue

यदि निर्दिष्ट ऑब्जेक्ट null मान दर्शाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, const String\&) method


जाँचता है कि स्ट्रिंग शून्य है या नहीं।

```cpp
bool System::operator==(std::nullptr_t, const String &str)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | std::nullptr_t | [String](../string/) जाँचने के लिए। |

### ReturnValue

यदि स्ट्रिंग null है तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, DateTime) method




```cpp
bool System::operator==(std::nullptr_t, DateTime)
```

## संबंधित देखें

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, SmartPtr\<X\> const\&) method


जाँचता है कि स्मार्ट पॉइंटर null है या नहीं।

```cpp
template<class X> bool System::operator==(std::nullptr_t, SmartPtr<X> const &x)
```


| पैरामीटर | विवरण |
| --- | --- |
| X | पॉइंटर के पॉइंटी प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | std::nullptr_t | जाँचने के लिए पॉइंटर। |

### ReturnValue

यदि पॉइंटर null है तो true, अन्यथा false।

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, T const\&) method


जाँचता है कि वैल्यू टाइप ऑब्जेक्ट (अनूदित C# स्ट्रक्चर आदि) null है या नहीं।

```cpp
template<class T> std::enable_if<!std::is_scalar<T>::value &&!std::is_pointer<T>::value &&!std::is_array<T>::value &&detail::has_method_is_null<T>::value, bool>::type System::operator==(std::nullptr_t, T const &x)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वैल्यू टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | std::nullptr_t | [Object](../object/) को जाँचने के लिए। |

### ReturnValue

यदि ऑब्जेक्ट null है तो true, अन्यथा false।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator==(std::nullptr_t, TimeSpan)
```

## संबंधित देखें

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator==(T &left, const String &right)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [String](../string/) पॉइंटर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| left | T\& | [String](../string/) तुलना के लिए पॉइंटर। |
| right | const String\& | [String](../string/) तुलना के लिए। |

### ReturnValue

यदि स्ट्रिंग्स मेल खाती हैं तो true, अन्यथा false।

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator==(T const\&, std::nullptr_t) method


जाँचता है कि वैल्यू टाइप ऑब्जेक्ट (अनूदित C# स्ट्रक्चर आदि) null है या नहीं।

```cpp
template<class T> std::enable_if<!std::is_scalar<T>::value &&!std::is_pointer<T>::value &&!std::is_array<T>::value &&detail::has_method_is_null<T>::value, bool>::type System::operator==(T const &x, std::nullptr_t)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | वैल्यू टाइप। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | T const\& | [Object](../object/) को जाँचने के लिए। |

### ReturnValue

यदि ऑब्जेक्ट null है तो true, अन्यथा false।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
