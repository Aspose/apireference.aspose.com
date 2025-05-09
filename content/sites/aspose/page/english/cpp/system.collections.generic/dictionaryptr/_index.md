---
title: System::Collections::Generic::DictionaryPtr class
linktitle: DictionaryPtr
second_title: Aspose.Page for C++
description: 'System::Collections::Generic::DictionaryPtr class. Dictionary pointer class with operator overloads. This type is a pointer to manage other object''s deletion. It should be allocated on stack and passed to functions either by value or by const reference in C++.'
type: docs
weight: 1300
url: /cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parameter | Description |
| --- | --- |
| T | Key type. |
| V | Value type. |
## Methods

| Method | Description |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Initializes null pointer. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Converts pointer type. |
| [operator[]](./operator[]/)(const X\&) const | Access operator to work with key type conversion. |
| [operator[]](./operator[]/)(const T\&) const | Access operator. |

## See Also

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
