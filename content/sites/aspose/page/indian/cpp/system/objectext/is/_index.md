---
title: "System::ObjectExt::Is मेथड"
linktitle: "है"
second_title: "Aspose.Page C++ के लिए"
description: "System::ObjectExt::Is मेथड. ''is'' ऑपरेटर अनुवाद को लागू करता है। C++ में स्ट्रिंग लिटरल के लिए विशेषीकरण।"
type: docs
weight: 1000
url: /hi/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। स्ट्रिंग लिटरल के लिए विशेषीकरण।

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) लिटरल। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। अपवाद रैपर प्रकारों के लिए विशेषीकरण।

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


'is' ऑपरेटर अनुवाद को लागू करता है। [Nullable](../../nullable/) प्रकार के लिए विशेषीकरण।

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) प्रकार। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


'is' ऑपरेटर अनुवाद को लागू करता है। मान प्रकारों के लिए विशेषीकरण।

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। अपरिवर्तनीय प्रकारों के लिए विशेषीकरण।

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

हमेशा false लौटाता है क्योंकि प्रकार परिवर्तनीय नहीं हैं।

## संबंधित देखें

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। nullable प्रकारों के लिए विशेषीकरण।

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। == ऑपरेटर परिभाषित वाले बॉक्सेबल प्रकारों के लिए विशेषीकरण।

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। बिना परिभाषित == वाले बॉक्सेबल प्रकारों के लिए विशेषीकरण।

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


'is' ऑपरेटर अनुवाद को लागू करता है। पॉइंटर प्रकारों के लिए विशेषीकरण।

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। enum प्रकारों के लिए विशेषीकरण।

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |
| U | संकेतित ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। इंटरफ़ेस में बॉक्स किए गए वैल्यू प्रकारों के लिए विशेषीकरण।

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |
| V | संकेतित ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


'is' ऑपरेटर अनुवाद को लागू करता है। बॉक्स करने योग्य (मान) प्रकारों के लिए विशेषीकरण, जो वास्तव में वही हैं।

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। अनदेखा। |

### ReturnValue

हमेशा true

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' ऑपरेटर अनुवाद को लागू करता है। 'final' क्लासों के लिए अनुकूलित पॉइंटर प्रकारों के लिए विशेषीकरण।

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |
| U | परीक्षित प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' ऑपरेटर अनुवाद को लागू करता है। पॉइंटर प्रकारों के लिए विशेषीकरण।

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |
| U | परीक्षित प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। enum प्रकारों बनाम कमजोर पॉइंटर्स के लिए विशेषीकरण।

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |
| U | संकेतित ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) 'is' ऑपरेटर की जाँच के लिए। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


‘is’ ऑपरेटर अनुवाद को लागू करता है। पूर्णांक लिटरल के लिए विशेषीकरण।

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | लक्ष्य प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | int32_t | पूर्णांक लिटरल। |

### ReturnValue

यदि 'is' true लौटाता है तो true, अन्यथा false।

## संबंधित देखें

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
