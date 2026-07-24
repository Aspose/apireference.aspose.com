---
title: "System::Collections::Generic::ListPtr sınıfı"
linktitle: "ListPtr"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::ListPtr sınıfı. Erişim operatörlerine sahip liste işaretçisi. Bu tür, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. Yığın üzerinde ayrılmalı ve C++'ta fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 3500
url: /tr/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Null işaretçiyi başlatır. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Belirtilen listeye işaretçiyi başlatır. |
| [operator==](./operator==/)(std::nullptr_t) const | [List](../list/) işaretçisinin null olup olmadığını kontrol eder. |
| [operator[]](./operator[]/)(int) | Erişimci. |
| [operator[]](./operator[]/)(int) const | Erişimci. |
## Ayrıca Bakınız

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
