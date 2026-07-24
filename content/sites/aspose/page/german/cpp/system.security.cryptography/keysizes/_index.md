---
title: "System::Security::Cryptography::KeySizes‑Klasse"
linktitle: "KeySizes"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::KeySizes‑Klasse. Menge von Schlüssellängen, die von symmetrischen Algorithmen akzeptiert werden. Objekte dieser Klasse sollten ausschließlich über die Funktion System::MakeObject() erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2200
url: /de/cpp/system.security.cryptography/keysizes/
---
## KeySizes class


Menge von Schlüssellängen, die von symmetrischen Algorithmen akzeptiert werden. Objekte dieser Klasse sollten ausschließlich über die Funktion [System::MakeObject()](../../system/makeobject/) erstellt werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class KeySizes : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_MaxSize](./get_maxsize/)() const | Ermittelt die maximal zulässige Schlüssellänge. |
| [get_MinSize](./get_minsize/)() const | Ermittelt die minimal zulässige Schlüssellänge. |
| [get_SkipSize](./get_skipsize/)() const | Ermittelt den gültigen Schlüssellängen‑Schritt. |
| [KeySizes](./keysizes/)(int, int, int) | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
