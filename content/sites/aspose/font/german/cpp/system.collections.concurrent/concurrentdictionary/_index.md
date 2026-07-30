---
title: "System::Collections::Concurrent::ConcurrentDictionary Klasse"
linktitle: "ConcurrentDictionary"
second_title: "Aspose.Font für C++"
description: "System::Collections::Concurrent::ConcurrentDictionary Klasse. Thread-sichere Wörterbuch-Implementierung. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


Thread-sichere Wörterbuch-Implementierung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| Parameter | Beschreibung |
| --- | --- |
| TKey | Schlüsseltyp. |
| TValue | Werttyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | Fügt einen Wert zum Wörterbuch hinzu. |
| [Clear](./clear/)() override | Löscht alle Elemente im Container. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | Kopiert Container‑Elemente in vorhandene Array‑Elemente. |
| [get_KeysInternal](./get_keysinternal/)() const override | Erhält die Wrapper-Sammlung, um auf die Wörterbuchschlüssel zuzugreifen. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | RTTI-Informationen. |
| [Remove](./remove/)(const TKey\&) override | Entfernt ein Element aus dem Container. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | Versucht, ein Schlüssel/Wert-Paar zum Wörterbuch hinzuzufügen. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Implementierungstyp. |
| [ThisType](./thistype/) | Dieser Typ. |
## Hinweise



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // Erstelle die Instanz der ConcurrentDictionary-Klasse.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // Fülle das ConcurrentDictionary.
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## Siehe auch

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Font for C++](../../)
