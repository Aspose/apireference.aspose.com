---
title: "System::Collections::Generic::ListPtr klass"
linktitle: "ListPtr"
second_title: "Aspose.Page för C++"
description: "System::Collections::Generic::ListPtr klass. Listpekare med åtkomstoperatorer. Denna typ är en pekare för att hantera raderingen av andra objekt. Den bör allokeras på stacken och skickas till funktioner antingen som värde eller som konstant referens i C++."
type: docs
weight: 3500
url: /sv/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Initierar null-pekare. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Initierar pekare till angiven lista. |
| [operator==](./operator==/)(std::nullptr_t) const | Kontrollerar om [List](../list/) pekaren är null. |
| [operator[]](./operator[]/)(int) | Åtkomstmetod. |
| [operator[]](./operator[]/)(int) const | Åtkomstmetod. |
## Se även

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
