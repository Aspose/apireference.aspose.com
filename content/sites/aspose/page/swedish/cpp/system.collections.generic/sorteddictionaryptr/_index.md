---
title: "System::Collections::Generic::SortedDictionaryPtr class"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page för C++"
description: "System::Collections::Generic::SortedDictionaryPtr class. Sorterad ordbokspointer med åtkomstoperatorer. Denna typ är en pekare för att hantera radering av andra objekt. Den bör allokeras på stacken och skickas till funktioner antingen som värde eller som konstant referens i C++."
type: docs
weight: 4100
url: /sv/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Sorterad ordbok pekare med åtkomstoperatorer. Denna typ är en pekare för att hantera andra objekts borttagning. Den bör allokeras på stacken och skickas till funktioner antingen som värde eller som konstant referens.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Åtkomstfunktion. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Skapar nullpekare. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Skapar en pekare till den angivna sorterade ordboken. |
## Se även

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
