---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page für C++"
description: "System::SmartPtrInfo class. Serviceklasse zum Testen und Ändern des Inhalts von SmartPtr''s, ohne den endgültigen Typ zu kennen. Wird für Garbage Collection und die Erkennung von Schleifenreferenzen usw. verwendet. Denken Sie daran, dass es sich um einen ''Zeiger auf Zeiger'' handelt. Wir können den Basistyp von SmartPtr''s nicht verwenden, da er keinen hat; stattdessen verwenden wir diese ''info'' class in C++."
type: docs
weight: 5600
url: /de/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Serviceklasse zum Testen und Ändern des Inhalts von [SmartPtr](../smartptr/)'s, ohne den endgültigen Typ zu kennen. Wird für Garbage Collection und die Erkennung von Schleifenreferenzen usw. verwendet. Denken Sie daran, dass es sich um einen 'pointer to pointer' handelt. Wir können den Basistyp von [SmartPtr](../smartptr/)'s nicht verwenden, da er keinen hat; stattdessen verwenden wir diese 'info' class.

```cpp
class SmartPtrInfo
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Gibt das rohe Objekt zurück, auf das der referenzierte Zeiger zeigt. |
| [getObject](./getobject/)() const | Gibt das Objekt zurück, auf das der referenzierte Zeiger zeigt. |
| [getOwned](./getowned/)() const | Erhält den vom Objekt besessenen Zeiger. |
| [operator bool](./operatorbool/)() const | Prüft, ob das Info-Objekt auf einen Nicht-Null-Zeiger zeigt. |
| [operator!](./operator!/)() const | Prüft, ob das Info-Objekt nicht auf einen Nicht-Null-Zeiger zeigt. |
| [operator->](./operator-_/)() const | Ermöglicht das Aufrufen von Methoden des [Object](../object/), auf das der referenzierte Zeiger zeigt. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Less vergleicht Werte von Zeigern, auf die von zwei Info-Objekten verwiesen wird. |
| [SmartPtrInfo](./smartptrinfo/)() | Erstellt ein leeres [SmartPtrInfo](./)-Objekt. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Erstellt ein [SmartPtrInfo](./)-Objekt mit Informationen zu einem bestimmten Smart-Pointer. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
