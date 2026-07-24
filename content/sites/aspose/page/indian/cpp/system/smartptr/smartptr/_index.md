---
title: "System::SmartPtr::SmartPtr कंस्ट्रक्टर"
linktitle: "SmartPtr"
second_title: "Aspose.Page C++ के लिए"
description: "System::SmartPtr::SmartPtr कंस्ट्रक्टर। संदर्भित एरे के प्रकार को अलग प्रकार के नए एरे बनाकर बदलता है। उपयोगी जब C# में एरे टाइप कास्ट हो जो C++ में असमर्थित हो।"
type: docs
weight: 100
url: /hi/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


संदर्भित एरे के प्रकार को अलग प्रकार के नए एरे बनाकर बदलता है। यह उपयोगी है जब C# में ऐसा एरे टाइप कास्ट हो जो C++ में समर्थित नहीं है।

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| पैरामीटर | विवरण |
| --- | --- |
| Y | स्रोत एरे का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | एरे के पॉइंटर को कॉपी बनाने के लिए, लेकिन तत्वों के अलग प्रकार के साथ। |
| mode | SmartPtrMode | पॉइंटर मोड। |

## संबंधित देखें

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


एक [SmartPtr](../) बनाता है जो ptr के प्रारंभिक मान के साथ स्वामित्व जानकारी साझा करता है, लेकिन एक असंबंधित और अनप्रबंधित पॉइंटर p को रखता है।

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | एक और स्मार्ट पॉइंटर जो स्वामित्व को स्रोत से साझा करता है। |
| p | Pointee_ * | प्रबंधित करने के लिए वस्तु का पॉइंटर। |
| mode | SmartPtrMode | पॉइंटर मोड। |

## संबंधित देखें

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


[SmartPtr](../) ऑब्जेक्ट को कॉपी द्वारा बनाता है। दोनों पॉइंटर बाद में एक ही ऑब्जेक्ट की ओर संकेत करते हैं। यदि अनुमति हो तो प्रकार रूपांतरण करता है।

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| पैरामीटर | विवरण |
| --- | --- |
| Q | x द्वारा पॉइंट किए गए ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | const SmartPtr\\<Q\\>\\& | कॉपी करने के लिए पॉइंटर। |
| mode | SmartPtrMode | पॉइंटर मोड। |

## संबंधित देखें

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


[SmartPtr](../) ऑब्जेक्ट को कॉपी द्वारा बनाता है। दोनों पॉइंटर बाद में एक ही ऑब्जेक्ट की ओर संकेत करते हैं।

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ptr | const SmartPtr_\\& | कॉपी करने के लिए पॉइंटर। |
| mode | SmartPtrMode | पॉइंटर मोड। |

## संबंधित देखें

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


खाली एरे को इनिशियलाइज़ करता है। कुछ C# कोड संरचनाओं को अनुवादित करने के लिए उपयोग किया जाता है।

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| पैरामीटर | विवरण |
| --- | --- |
| Y | EmptyArrayInitializer प्रकार का प्लेसहोल्डर। |

## संबंधित देखें

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


निर्दिष्ट ऑब्जेक्ट की ओर संकेत करने वाला [SmartPtr](../) बनाता है, या कच्चे पॉइंटर को [SmartPtr](../) में बदलता है।

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऑब्जेक्ट | Pointee_ * | पॉइंटी। |
| mode | SmartPtrMode | पॉइंटर मोड। |

## संबंधित देखें

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


[SmartPtr](../) ऑब्जेक्ट को मूव द्वारा बनाता है। प्रभावी रूप से, यदि दोनों समान मोड के हों तो दो पॉइंटरों को अदल-बदल करता है। कॉल के बाद x उपयोग योग्य नहीं रह सकता।

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | SmartPtr_\\&& | मूव करने के लिए पॉइंटर। |
| mode | SmartPtrMode | पॉइंटर मोड। |

## संबंधित देखें

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


आवश्यक मोड का [SmartPtr](../) ऑब्जेक्ट बनाता है।

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mode | SmartPtrMode | पॉइंटर मोड। |

## संबंधित देखें

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


आवश्यक मोड का नल-पॉइंटर [SmartPtr](../) ऑब्जेक्ट बनाता है।

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| mode | std::nullptr_t | पॉइंटर मोड। |

## संबंधित देखें

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
