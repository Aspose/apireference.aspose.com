---
title: "System::Xml::NameTable::Get Methode"
linktitle: "Holen"
second_title: "Aspose.Font für C++"
description: "System::Xml::NameTable::Get Methode. Gibt die atomisierte Zeichenkette zurück, die dieselben Zeichen enthält wie der angegebene Zeichenbereich im übergebenen Array in C++."
type: docs
weight: 300
url: /de/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Gibt die atomisierte Zeichenkette zurück, die dieselben Zeichen wie der angegebene Zeichenbereich im übergebenen Array enthält.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schlüssel | const ArrayPtr\<char16_t\>\& | Das Zeichenarray, das den zu findenden Namen enthält. |
| Start | int32_t | Der nullbasierte Index im Array, der das erste Zeichen des Namens angibt. |
| len | int32_t | Die Anzahl der Zeichen im Namen. |

### ReturnValue

Die atomisierte Zeichenkette oder **nullptr**, falls die Zeichenkette noch nicht atomisiert wurde. Wenn **len** null ist, wird [String::Empty](../../../system/string/empty/) zurückgegeben.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Get(const String\&) method


Gibt die atomisierte Zeichenkette mit dem angegebenen Wert zurück.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Der zu findende Name. |

### ReturnValue

Das atomisierte Zeichenkettenobjekt oder **nullptr**, falls die Zeichenkette noch nicht atomisiert wurde.

## Siehe auch

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
