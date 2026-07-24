---
title: "System::SmartPtr::operator* मेथड"
linktitle: "operator*"
second_title: "Aspose.Page C++ के लिए"
description: "System::SmartPtr::operator* मेथड। संकेतित ऑब्जेक्ट का रेफ़रेंस प्राप्त करता है। C++ में यह सुनिश्चित करता है कि पॉइंटर null न हो।"
type: docs
weight: 2500
url: /hi/cpp/system/smartptr/operator_/
---
## SmartPtr::operator* method


संकेतित वस्तु का रेफ़रेंस प्राप्त करता है। यह सुनिश्चित करता है कि पॉइंटर null नहीं है।

```cpp
Pointee_ & System::SmartPtr<T>::operator*() const
```


### ReturnValue

संकेतित ऑब्जेक्ट का रेफ़रेंस।

## संबंधित देखें

* Typedef [Pointee_](../pointee_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::SmartPtr::operator< मेथड
लिंक शीर्षक: operator<
second_title: Aspose.Page for C++
description: 'System::SmartPtr::operator< मेथड। C++ में SmartPtr क्लास के लिए कम-तुलना सेमांटिक्स प्रदान करता है।'
type: docs
वजन: 2700
url: /cpp/system/smartptr/operator_/
---
## SmartPtr::operator<(SmartPtr\<Y\> const\&) const method


[SmartPtr](../) क्लास के लिए कम-तुलना सेमांटिक्स प्रदान करता है।

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(SmartPtr<Y> const &x) const
```


| पैरामीटर | विवरण |
| --- | --- |
| Y | वर्तमान पॉइंटर की तुलना के लिए पॉइंटर का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| x | SmartPtr\<Y\> const\& | वर्तमान पॉइंटर की तुलना के लिए पॉइंटर। |

### ReturnValue

यदि [SmartPtr](../) द्वारा संदर्भित ऑब्जेक्ट x से 'कम' है तो true, अन्यथा false।

## संबंधित देखें

* Class [SmartPtr](../)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::operator<(Y *) const method


[SmartPtr](../) क्लास के लिए कम-तुलना सेमांटिक्स प्रदान करता है।

```cpp
template<class Y> bool System::SmartPtr<T>::operator<(Y *p) const
```


| पैरामीटर | विवरण |
| --- | --- |
| Y | वर्तमान पॉइंटर की तुलना के लिए पॉइंटर का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| p | Y * | वर्तमान पॉइंटर की तुलना के लिए पॉइंटर। |

### ReturnValue

यदि [SmartPtr](../) द्वारा संदर्भित वस्तु p से 'कम' है तो सत्य और अन्यथा असत्य।

## संबंधित देखें

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
