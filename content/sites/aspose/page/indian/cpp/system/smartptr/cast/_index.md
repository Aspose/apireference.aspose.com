---
title: "System::SmartPtr::Cast मेथड"
linktitle: "Cast"
second_title: "Aspose.Page C++ के लिए"
description: "System::SmartPtr::Cast मेथड। C++ में पॉइंटर को उसके स्वयं के प्रकार में कास्ट करता है।"
type: docs
weight: 400
url: /hi/cpp/system/smartptr/cast/
---
## SmartPtr::Cast() const method


पॉइंटर को उसके स्वयं के प्रकार में कास्ट करता है।

```cpp
template<class Y,typename Check> std::enable_if_t<std::is_same<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| पैरामीटर | विवरण |
| --- | --- |
| Y | संकेतित ऑब्जेक्ट का लक्ष्य प्रकार। |
| जाँच | यदि कोई कास्ट उपलब्ध नहीं है तो अपवाद फेंकने के लिए फ़्लैग्स। |

### ReturnValue

बदले हुए प्रकार का पॉइंटर जो हमेशा साझा मोड में रहता है।

## संबंधित देखें

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


static_cast का उपयोग करके पॉइंटर को बेस प्रकार में कास्ट करता है।

```cpp
template<class Y,typename Check> std::enable_if_t<!std::is_same<Y, T>::value &&std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| पैरामीटर | विवरण |
| --- | --- |
| Y | संकेतित ऑब्जेक्ट का लक्ष्य प्रकार। |
| जाँच | यदि कोई कास्ट उपलब्ध नहीं है तो अपवाद फेंकने के लिए फ़्लैग्स। |

### ReturnValue

बदले हुए प्रकार का पॉइंटर जो हमेशा साझा मोड में रहता है।

## संबंधित देखें

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


dynamic_cast का उपयोग करके पॉइंटर को डेराइव्ड प्रकार में कास्ट करता है।

```cpp
template<class Y,typename Check> std::enable_if_t<Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| पैरामीटर | विवरण |
| --- | --- |
| Y | संकेतित ऑब्जेक्ट का लक्ष्य प्रकार। |
| जाँच | यदि कोई कास्ट उपलब्ध नहीं है तो अपवाद फेंकने के लिए फ़्लैग्स। |

### ReturnValue

परिवर्तित प्रकार का पॉइंटर जो हमेशा साझा मोड में रहता है। यदि कोई रूपांतरण उपलब्ध नहीं है तो InvalidCastException फेंकता है।

## संबंधित देखें

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::Cast() const method


dynamic_cast का उपयोग करके पॉइंटर को डेराइव्ड प्रकार में कास्ट करता है।

```cpp
template<class Y,typename Check> std::enable_if_t<!Check::value &&!std::is_same<Y, T>::value &&!std::is_base_of<Y, T>::value, SmartPtr<Y>> System::SmartPtr<T>::Cast() const
```


| पैरामीटर | विवरण |
| --- | --- |
| Y | संकेतित ऑब्जेक्ट का लक्ष्य प्रकार। |
| जाँच | यदि कोई कास्ट उपलब्ध नहीं है तो अपवाद फेंकने के लिए फ़्लैग्स। |

### ReturnValue

परिवर्तित प्रकार का पॉइंटर जो हमेशा साझा मोड में रहता है। यदि कोई रूपांतरण उपलब्ध नहीं है तो nullptr लौटाता है।

## संबंधित देखें

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
