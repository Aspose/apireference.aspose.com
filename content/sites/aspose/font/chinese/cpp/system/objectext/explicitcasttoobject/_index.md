---
title: "System::ObjectExt::ExplicitCastToObject 方法"
linktitle: "ExplicitCastToObject"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::ObjectExt 类的 ExplicitCastToObject 方法。"
type: docs
weight: 900
url: /zh/cpp/system/objectext/explicitcasttoobject/
---
## ObjectExt::ExplicitCastToObject(const T\&) method




```cpp
template<typename T> static std::enable_if<System::IsBoxable<T>::value, System::SharedPtr<System::Object>>::type System::ObjectExt::ExplicitCastToObject(const T &value)
```

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ExplicitCastToObject(const T\&) method




```cpp
template<typename T> static std::enable_if<System::IsSmartPtr<T>::value, System::SharedPtr<System::Object>>::type System::ObjectExt::ExplicitCastToObject(const T &value)
```

## 另见

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
