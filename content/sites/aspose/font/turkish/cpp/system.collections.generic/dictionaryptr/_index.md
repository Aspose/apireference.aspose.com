---
title: "System::Collections::Generic::DictionaryPtr sınıfı"
linktitle: "DictionaryPtr"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::DictionaryPtr sınıfı. Operatör aşırı yüklemeleri olan sözlük işaretçi sınıfı. Bu tip, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. C++'da yığına (stack) ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 1300
url: /tr/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<T0>
```


| Parametre | Açıklama |
| --- | --- |
| T | Anahtar türü. |
| V | Değer türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Null işaretçiyi başlatır. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | İşaretçi tipini dönüştürür. |
| [operator[]](./operator[]/)(const X\&) const | Anahtar tipi dönüşümüyle çalışmak için erişim operatörü. |
| [operator[]](./operator[]/)(const T\&) const | Erişim operatörü. |

## Ayrıca Bakınız

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
