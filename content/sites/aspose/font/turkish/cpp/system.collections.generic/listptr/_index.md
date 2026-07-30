---
title: "System::Collections::Generic::ListPtr sınıfı"
linktitle: "ListPtr"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::ListPtr sınıfı. Erişim operatörlerine sahip liste işaretçisi. Bu tür, diğer nesnenin silinmesini yönetmek için bir işaretçidir. Yığına (stack) ayrılmalı ve C++'ta fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 3500
url: /tr/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<T0>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Null işaretçiyi başlatır. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Belirtilen listeye işaretçiyi başlatır. |
| [operator==](./operator==/)(std::nullptr_t) const | Kontrol eder [List](../list/) işaretçisinin null olup olmadığını. |
| [operator[]](./operator[]/)(int) | Erişimci. |
| [operator[]](./operator[]/)(int) const | Erişimci. |
## Ayrıca Bakınız

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
