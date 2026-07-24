---
title: "System::Collections::Generic::DictionaryPtr klass"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page för C++"
description: "System::Collections::Generic::DictionaryPtr klass. Klass för pekare till ordbok med operatoröverladdningar. Denna typ är en pekare för att hantera andra objekts'' borttagning. Den bör allokeras på stacken och skickas till funktioner antingen som värde eller som konstant referens i C++."
type: docs
weight: 1300
url: /sv/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parameter | Beskrivning |
| --- | --- |
| T | Nyckeltyp. |
| V | Värdetyp. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Initierar nullpekare. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Konverterar pekartyp. |
| [operator[]](./operator[]/)(const X\&) const | Åtkomstoperator för att arbeta med konvertering av nyckeltyp. |
| [operator[]](./operator[]/)(const T\&) const | Åtkomstoperator. |

## Se även

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
