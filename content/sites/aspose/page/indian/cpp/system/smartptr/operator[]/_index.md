---
title: "System::SmartPtr::operator[] मेथड"
linktitle: "operator[]"
second_title: "Aspose.Page C++ के लिए"
description: "System::SmartPtr::operator[] मेथड। ऐरे तत्वों के लिए अभिगमकर्ता। केवल तब संकलित होता है जब SmartPtr_ C++ में System::Array का विशेषीकरण हो।"
type: docs
weight: 3000
url: /hi/cpp/system/smartptr/operator[]/
---
## SmartPtr::operator[] method


ऐरे तत्वों के लिए अभिगमकर्ता। केवल तब संकलित होता है जब [SmartPtr_](../smartptr_/) [System::Array](../../array/) का विशेषीकरण हो।

```cpp
template<typename IdxType> decltype(System::Details::GetByIndex(std::declval<const SmartPtr_ *>(), std::declval<IdxType>())) System::SmartPtr<T>::operator[](IdxType idx) const
```


| पैरामीटर | विवरण |
| --- | --- |
| IdxType | सूचकांक का प्रकार (मान लिया गया पूर्णांक)। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| idx | IdxType | ऐरे में सूचकांक। |

### ReturnValue

[Array](../../array/) value at idx position.

## संबंधित देखें

* Typedef [SmartPtr_](../smartptr_/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
