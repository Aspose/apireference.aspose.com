---
title: "System::Xml::NameTable::Add Methode"
linktitle: "Add"
second_title: "Aspose.Font für C++"
description: "System::Xml::NameTable::Add Methode. Atomisiert die angegebene Zeichenkette und fügt sie der NameTable in C++ hinzu."
type: docs
weight: 200
url: /de/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Atomisiert die angegebene Zeichenkette und fügt sie der [NameTable](../) hinzu.

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schlüssel | const ArrayPtr\<char16_t\>\& | Das Zeichenarray, das die hinzuzufügende Zeichenkette enthält. |
| Start | int32_t | Der nullbasierte Index im Array, der das erste Zeichen der Zeichenkette angibt. |
| len | int32_t | Die Anzahl der Zeichen in der Zeichenkette. |

### ReturnValue

Die atomisierte Zeichenkette oder die bereits vorhandene Zeichenkette, falls sie bereits in der [NameTable](../) existiert. Wenn **len** null ist, wird [String::Empty](../../../system/string/empty/) zurückgegeben.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## NameTable::Add(const String\&) method


Atomisiert die angegebene Zeichenkette und fügt sie der [NameTable](../) hinzu.

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Schlüssel | const String\& | Die hinzuzufügende Zeichenkette. |

### ReturnValue

Die atomisierte Zeichenkette oder die bereits vorhandene Zeichenkette, falls sie bereits in der [NameTable](../) existiert.

## Siehe auch

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
