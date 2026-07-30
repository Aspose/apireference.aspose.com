---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Font für C++"
description: "System::SmartPtrInfo class. Service‑Klasse zum Testen und Ändern des Inhalts von SmartPtr''s, ohne den endgültigen Typ zu kennen. Wird für Garbage Collection und die Erkennung von Schleifenreferenzen usw. verwendet. Betrachten Sie es als ''Zeiger zu Zeiger''. Wir können SmartPtr''s Basistyp nicht verwenden, da er keinen hat; stattdessen verwenden wir diese ''info''‑Klasse in C++."
type: docs
weight: 5600
url: /de/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Service‑Klasse zum Testen und Ändern des Inhalts von [SmartPtr](../smartptr/)'s, ohne den endgültigen Typ zu kennen. Wird für Garbage Collection und die Erkennung von Schleifenreferenzen usw. verwendet. Betrachten Sie es als 'Zeiger zu Zeiger'. Wir können den Basistyp von [SmartPtr](../smartptr/)'s nicht verwenden, da er keinen hat; stattdessen verwenden wir diese 'info'-Klasse.

```cpp
class SmartPtrInfo
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Ermittelt das rohe Objekt, auf das der referenzierte Zeiger zeigt. |
| [getObject](./getobject/)() const | Ermittelt das Objekt, auf das der referenzierte Zeiger zeigt. |
| [getOwned](./getowned/)() const | Ermittelt den Zeiger, der dem Objekt gehört. |
| [operator bool](./operatorbool/)() const | Prüft, ob das Info‑Objekt auf einen Nicht‑Null‑Zeiger zeigt. |
| [operator!](./operator!/)() const | Prüft, ob das Info‑Objekt nicht auf einen Nicht‑Null‑Zeiger zeigt. |
| [operator->](./operator-_/)() const | Ermöglicht das Aufrufen von Methoden des [Object](../object/), auf das der referenzierte Zeiger zeigt. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Vergleicht die Werte von Zeigern, die von zwei Info‑Objekten referenziert werden, mittels '<'. |
| [SmartPtrInfo](./smartptrinfo/)() | Erstellt ein leeres [SmartPtrInfo](./)-Objekt. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Erstellt ein [SmartPtrInfo](./)-Objekt mit Informationen zu einem bestimmten Smart‑Pointer. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
