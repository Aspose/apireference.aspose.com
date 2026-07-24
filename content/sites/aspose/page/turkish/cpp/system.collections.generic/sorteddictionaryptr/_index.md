---
title: "System::Collections::Generic::SortedDictionaryPtr class"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::SortedDictionaryPtr class. Erişim operatörlerine sahip sıralı sözlük işaretçisi. Bu tip, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. C++'da yığıt üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 4100
url: /tr/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Erişim operatörlerine sahip sıralı sözlük işaretçisi. Bu tip, diğer nesnenin silinmesini yönetmek için bir işaretçidir. Yığıt üzerinde ayrılmalı ve fonksiyonlara ya değer olarak ya da const referansla geçirilmelidir.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Erişimci işlev. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Null işaretçi oluşturur. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Belirtilen sıralı sözlüğe işaretçi oluşturur. |
## Ayrıca Bakınız

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
