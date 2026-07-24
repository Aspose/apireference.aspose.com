---
title: "System::Collections::Generic::StackPtr sınıfı"
linktitle: "StackPtr"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::StackPtr sınıfı. Yığın işaretçisi. Bu tür, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. Yığın üzerinde ayrılmalı ve C++'ta fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 4700
url: /tr/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [StackPtr](./stackptr/)() | Null işaretçi oluşturur. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | Belirli bir yığını referans alan işaretçiyi oluşturur. |

## Ayrıca Bakınız

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
