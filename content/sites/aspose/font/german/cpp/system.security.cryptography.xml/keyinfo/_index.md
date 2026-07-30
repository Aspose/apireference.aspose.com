---
title: "System::Security::Cryptography::Xml::KeyInfo Klasse"
linktitle: "KeyInfo"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::Xml::KeyInfo Klasse. Stellt das KeyInfo-Element einer XML-Digitalunterschrift oder einer XML-Verschlüsselung dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.security.cryptography.xml/keyinfo/
---
## KeyInfo class


Stellt das [KeyInfo](./) Element einer XML-Digitalunterschrift oder einer XML-Verschlüsselung dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class KeyInfo : public System::Collections::Generic::IEnumerable<SharedPtr<Xml::KeyInfoClause>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddClause](./addclause/)(SharedPtr\<KeyInfoClause\>) |  |
| [get_Count](./get_count/)() |  |
| [GetEnumerator](./getenumerator/)() override | Gibt Enumerator zurück. |
| [KeyInfo](./keyinfo/)() |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)
