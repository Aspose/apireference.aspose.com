---
title: System::ObjectExt::ExplicitCastToObject method
linktitle: ExplicitCastToObject
second_title: Aspose.Font for C++
description: 'How to use ExplicitCastToObject method of System::ObjectExt class in C++.'
type: docs
weight: 900
url: /cpp/system/objectext/explicitcasttoobject/
---
## ObjectExt::ExplicitCastToObject(const T\&) method




```cpp
template<typename T> static std::enable_if<System::IsBoxable<T>::value, System::SharedPtr<System::Object>>::type System::ObjectExt::ExplicitCastToObject(const T &value)
```

## See Also

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ExplicitCastToObject(const T\&) method




```cpp
template<typename T> static std::enable_if<System::IsSmartPtr<T>::value, System::SharedPtr<System::Object>>::type System::ObjectExt::ExplicitCastToObject(const T &value)
```

## See Also

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
