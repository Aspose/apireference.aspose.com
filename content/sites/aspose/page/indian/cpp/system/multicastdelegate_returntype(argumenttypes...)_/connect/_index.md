---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect मेथड"
linktitle: "जोड़ें"
second_title: "Aspose.Page C++ के लिए"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect मेथड। निर्दिष्ट डेलीगेट को C++ में संग्रह में जोड़ता है।"
type: docs
weight: 400
url: /hi/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


निर्दिष्ट डेलीगेट को संग्रह में जोड़ता है।

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कॉलबैक | Callback | संग्रह में जोड़ने के लिए प्रतिनिधि |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट गैर-स्थैतिक मेथड को डेलीगेट संग्रह में जोड़ता है।

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| MemberType | डेलीगेट संग्रह में जोड़ने के लिए गैर-स्थैतिक मेथड का प्रकार |
| ClassType | डेलीगेट में जोड़ने के लिए ऑब्जेक्ट मेथड का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सदस्य | MemberType ClassType::* | निर्दिष्ट वस्तु की गैर-स्थैतिक विधि के लिए एक पॉइंटर |
| obj | ClassType * | डेलीगेट संग्रह में जोड़ने के लिए ऑब्जेक्ट सदस्य मेथड का एक पॉइंटर |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


निर्दिष्ट ऑब्जेक्ट की निर्दिष्ट गैर-स्थैतिक मेथड को डेलीगेट संग्रह में जोड़ता है।

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| पैरामीटर | विवरण |
| --- | --- |
| MemberType | डेलीगेट संग्रह में जोड़ने के लिए गैर-स्थैतिक मेथड का प्रकार |
| ClassType | डेलीगेट संग्रह में जोड़ने के लिए ऑब्जेक्ट मेथड का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सदस्य | MemberType ClassType::* | निर्दिष्ट वस्तु की गैर-स्थैतिक विधि के लिए एक पॉइंटर |
| obj | const SharedPtr\<ClassType\>\& | डेलीगेट संग्रह में जोड़ने के लिए ऑब्जेक्ट सदस्य मेथड का एक साझा पॉइंटर |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


निर्दिष्ट MulticastDelegate ऑब्जेक्ट को डेलीगेट संग्रह में जोड़ता है।

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | MulticastDelegate\& | डेलीगेट संग्रह में जोड़ने के लिए MulticastDelegate क्लास का एक इंस्टेंस |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


निर्दिष्ट फ़ंक्शन ऑब्जेक्ट को डेलीगेट संग्रह में जोड़ता है। फ़ंक्शन ऑब्जेक्ट को संग्रह में जोड़ने से पहले [Callback](../callback/) डेलीगेट प्रकार में परिवर्तित किया जाता है।

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| पैरामीटर | विवरण |
| --- | --- |
| R | संग्रह में जोड़ने के लिए फ़ंक्शन ऑब्जेक्ट का रिटर्न टाइप |
| आर्ग्युमेंट्स | संग्रह में जोड़ने के लिए फ़ंक्शन ऑब्जेक्ट की आर्ग्युमेंट सूची |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| f | std::function\<R(Args...)> | संग्रह में जोड़ने के लिए फ़ंक्शन ऑब्जेक्ट |

### ReturnValue

स्वयं का संदर्भ

## संबंधित देखें

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
