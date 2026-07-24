---
title: "System::Xml::NameTable::Get method"
linktitle: "Abrufen"
second_title: "Aspose.Page für C++"
description: "System::Xml::NameTable::Get method. Gibt die atomisierte Zeichenkette zurück, die dieselben Zeichen wie der angegebene Zeichenbereich im übergebenen Array in C++ enthält."
type: docs
weight: 300
url: /de/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Gibt die atomisierte Zeichenkette zurück, die dieselben Zeichen wie der angegebene Zeichenbereich im gegebenen Array enthält.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schlüssel | const ArrayPtr\<char16_t\>\& | Das Zeichenarray, das den zu suchenden Namen enthält. |
| start | int32_t | Der nullbasierte Index im Array, der das erste Zeichen des Namens angibt. |
| len | int32_t | Die Anzahl der Zeichen im Namen. |

### ReturnValue

Die atomisierte Zeichenkette oder **nullptr**, falls die Zeichenkette noch nicht atomisiert wurde. Wenn **len** null ist, wird [String::Empty](../../../system/string/empty/) zurückgegeben.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


Gibt die atomisierte Zeichenfolge mit dem angegebenen Wert zurück.

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
* Library [Aspose.Page for C++](../../../)
