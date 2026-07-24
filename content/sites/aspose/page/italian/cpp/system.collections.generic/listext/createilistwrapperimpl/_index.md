---
title: "System::Collections::Generic::ListExt::CreateIListWrapperImpl metodo"
linktitle: "CreateIListWrapperImpl"
second_title: "Aspose.Page per C++"
description: "System::Collections::Generic::ListExt::CreateIListWrapperImpl metodo. Helper di implementazione IListWrapper per tipi di riferimento in C++."
type: docs
weight: 200
url: /it/cpp/system.collections.generic/listext/createilistwrapperimpl/
---
## ListExt::CreateIListWrapperImpl() method


[IListWrapper](../../../system.collections/ilistwrapper/) implementation helper for reference types.

```cpp
template<typename T1> std::enable_if<System::IsSmartPtr<T1>::value, System::SharedPtr<System::Collections::IList>>::type System::Collections::Generic::ListExt<T>::CreateIListWrapperImpl()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections/ilist/)
* Class [ListExt](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## ListExt::CreateIListWrapperImpl() method


[IListWrapper](../../../system.collections/ilistwrapper/) implementation helper for value types.

```cpp
template<typename T1> std::enable_if<!System::IsSmartPtr<T1>::value &&System::IsBoxable<T1>::value, System::SharedPtr<System::Collections::IList>>::type System::Collections::Generic::ListExt<T>::CreateIListWrapperImpl()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections/ilist/)
* Class [ListExt](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## ListExt::CreateIListWrapperImpl() method


[IListWrapper](../../../system.collections/ilistwrapper/) implementation helper for other types.

```cpp
template<typename T1> std::enable_if<!System::IsSmartPtr<T1>::value &&!System::IsBoxable<T>::value, System::SharedPtr<System::Collections::IList>>::type System::Collections::Generic::ListExt<T>::CreateIListWrapperImpl()
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections/ilist/)
* Class [ListExt](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
