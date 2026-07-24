---
title: "System::StaticCastArray मेथड"
linktitle: "StaticCastArray"
second_title: "Aspose.Page C++ के लिए"
description: "System::StaticCastArray मेथड। निर्दिष्ट एरे के तत्वों को विभिन्न प्रकार में कास्ट करता है। उन मामलों के लिए ओवरराइड जहाँ From C++ में SmartPtr ऑब्जेक्ट है।"
type: docs
weight: 39800
url: /hi/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


निर्दिष्ट एरे के तत्वों को विभिन्न प्रकार में कास्ट करता है। उन मामलों के लिए ओवरराइड जहाँ From [SmartPtr](../smartptr/) ऑब्जेक्ट है।

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| पैरामीटर | विवरण |
| --- | --- |
| को | निर्दिष्ट एरे के तत्वों को कास्ट करने के लिए प्रकार |
| From | जिस एरे के तत्वों को कास्ट किया जाना है, उनके तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | कास्ट करने वाले तत्वों वाले एरे के लिए साझा पॉइंटर |

### ReturnValue

एक पॉइंटर जो एक नए एरे की ओर इशारा करता है जिसमें **To** प्रकार के तत्व होते हैं, जो **from** के तत्वों के बराबर होते हैं

## Deprecated
पिछली संगतता के लिए जोड़ा गया। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


निर्दिष्ट एरे के तत्वों को विभिन्न प्रकार में कास्ट करता है। उन मामलों के लिए ओवरराइड जहाँ From Boxable है और To [Object](../object/)[] है।

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| पैरामीटर | विवरण |
| --- | --- |
| को | निर्दिष्ट एरे के तत्वों को कास्ट करने के लिए प्रकार |
| From | जिस एरे के तत्वों को कास्ट किया जाना है, उनके तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | कास्ट करने वाले तत्वों वाले एरे के लिए साझा पॉइंटर |

### ReturnValue

एक पॉइंटर जो एक नए एरे की ओर इशारा करता है जिसमें **To** प्रकार के तत्व होते हैं, जो **from** के तत्वों के बराबर होते हैं

## Deprecated
पिछली संगतता के लिए जोड़ा गया। इसके बजाय ExplicitCast का उपयोग करें।

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
