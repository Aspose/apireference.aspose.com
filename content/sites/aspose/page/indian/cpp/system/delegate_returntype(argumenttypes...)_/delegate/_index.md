---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate मेथड"
linktitle: "Delegate"
second_title: "Aspose.Page C++ के लिए"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate मेथड। डिफॉल्ट कंस्ट्रक्टर। C++ में ऐसा delegate ऑब्जेक्ट बनाता है जो किसी भी चीज़ की ओर संकेत नहीं करता।"
type: docs
weight: 100
url: /hi/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


डिफ़ॉल्ट कंस्ट्रक्टर। वह डेलीगेट ऑब्जेक्ट बनाता है जो किसी भी चीज़ की ओर संकेत नहीं करता।

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


मूविंग कॉपी कंस्ट्रक्टर। निर्दिष्ट डेलीगेट द्वारा संकेतित इकाई का स्वामित्व लेता है।

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| o | Delegate\&& | पॉइंट किए गए एंटिटी को स्थानांतरित करने के लिए Delegate ऑब्जेक्ट |

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


कंस्ट्रक्टर। निर्दिष्ट फ़ंक्शन ऑब्जेक्ट से डेलीगेट बनाता है।

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए गए फ़ंक्शन ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| functor_tag | int | एक डमी पूर्णांक मान; इस तर्क का उपयोग अस्पष्टता को हल करने के लिए किया जाता है। |
| functor | T\& | एक फ़ंक्शन ऑब्जेक्ट जिसे नया निर्मित delegate संकेत करेगा |

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


मूविंग कंस्ट्रक्टर। निर्दिष्ट फ़ंक्शन ऑब्जेक्ट से डेलीगेट बनाता है।

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए गए फ़ंक्शन ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| functor_tag | long | एक डमी पूर्णांक मान; इस तर्क का उपयोग अस्पष्टता को हल करने के लिए किया जाता है। |
| functor | T\&& | एक फ़ंक्शन ऑब्जेक्ट जिसे नया निर्मित delegate संकेत करेगा |

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


कंस्ट्रक्टर। निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट नॉन-स्टैटिक मेथड की ओर संकेत करने वाला डेलीगेट बनाता है।

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| MemberType | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए जाने वाले गैर-स्थैतिक मेथड का प्रकार |
| ClassType | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए जाने वाले ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सदस्य | MemberType ClassType::* | नए बनाए गए डेलीगेट द्वारा संकेतित गैर-स्थैतिक मेथड का एक पॉइंटर |
| obj | ClassType * | नए बनाए गए डेलीगेट द्वारा संकेतित ऑब्जेक्ट सदस्य मेथड का एक पॉइंटर |

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


कंस्ट्रक्टर। निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट नॉन-स्टैटिक मेथड की ओर संकेत करने वाला डेलीगेट बनाता है।

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| MemberType | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए जाने वाले गैर-स्थैतिक मेथड का प्रकार |
| ClassType | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए जाने वाले ऑब्जेक्ट का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सदस्य | MemberType MemberClass::* | नए बनाए गए डेलीगेट द्वारा संकेतित गैर-स्थैतिक मेथड का एक पॉइंटर |
| obj | const SharedPtr\<ClassType\>\& | नए बनाए गए डेलीगेट द्वारा संकेतित ऑब्जेक्ट सदस्य मेथड का एक shard पॉइंटर |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


एक std::function फ़ंक्शन ऑब्जेक्ट की ओर संकेत करने वाला डेलीगेट ऑब्जेक्ट बनाता है।

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| पैरामीटर | विवरण |
| --- | --- |
| R | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए जाने वाले फ़ंक्शन ऑब्जेक्ट का रिटर्न टाइप |
| आर्ग्युमेंट्स | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए जाने वाले फ़ंक्शन ऑब्जेक्ट की आर्ग्युमेंट सूची |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| f | std::function\<R(Args...)> | नए बनाए गए डेलीगेट ऑब्जेक्ट द्वारा संकेतित एक फ़ंक्शन ऑब्जेक्ट |

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


कंस्ट्रक्टर। std::bind() द्वारा उत्पन्न फ़ंक्शन ऑब्जेक्ट के निर्दिष्ट पॉइंटर से डेलीगेट बनाता है।

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| पैरामीटर | विवरण |
| --- | --- |
| यह | std::bind() द्वारा उत्पन्न फ़ंक्शन ऑब्जेक्ट का प्रकार, जिसे कंस्ट्रक्टर तर्क के रूप में स्वीकार करता है |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| फ़ंक्शन | T | नए बनाए गए Delegate इंस्टेंस द्वारा संकेतित "bind expression" - std::bind() द्वारा उत्पन्न एक फ़ंक्शन पॉइंटर |

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


कंस्ट्रक्टर। निर्दिष्ट फ्री फ़ंक्शन या स्टैटिक मेथड के पॉइंटर से डेलीगेट ऑब्जेक्ट बनाता है।

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| पैरामीटर | विवरण |
| --- | --- |
| यह | कंस्ट्रक्टर द्वारा तर्क के रूप में स्वीकार किए जाने वाले फ़ंक्शन या स्थैतिक मेथड पॉइंटर का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| फ़ंक्शन | T | नए बनाए गए Delegate इंस्टेंस द्वारा संकेतित फ़ंक्शन या स्थैतिक मेथड का पॉइंटर |

## संबंधित देखें

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
