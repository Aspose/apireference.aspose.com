---
title: "System::Collections::Generic::List::ConvertAll Methode"
linktitle: "ConvertAll"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::List::ConvertAll Methode. Erstellt eine Liste von Elementen, die in einen anderen Typ in C++ konvertiert wurden."
type: docs
weight: 1300
url: /de/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


Erstellt eine Liste von Elementen, die in einen anderen Typ konvertiert wurden.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Parameter | Beschreibung |
| --- | --- |
| OutputType | Ausgabetyp des Listenelements. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) zur Verwendung für die Elementkonvertierung. |

### ReturnValue

Eine neu erstellte Liste konvertierter Elemente.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
