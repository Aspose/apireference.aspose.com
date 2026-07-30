---
title: "System::IO::Path::CheckPath Methode"
linktitle: "CheckPath"
second_title: "Aspose.Font für C++"
description: "System::IO::Path::CheckPath Methode. Bestimmt, ob der angegebene Pfad gültig ist, indem geprüft wird, ob er ungültige Zeichen enthält. Eine Ausnahme wird ausgelöst, wenn der Pfad in C++ ungültige Zeichen enthält."
type: docs
weight: 200
url: /de/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Bestimmt, ob der angegebene Pfad gültig ist, indem geprüft wird, ob er ungültige Zeichen enthält. Es wird eine Ausnahme ausgelöst, wenn der Pfad ungültige Zeichen enthält.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Der zu prüfende Pfad |
| msg | const String\& | Die Nachricht, die an den Konstruktor des Ausnahmeobjekts übergeben wird |
| allow_empty | bool | Gibt an, ob ein leerer oder null‑String als korrekter Pfad betrachtet werden soll (true) oder nicht (false); ist dieser Parameter false und ist **path** leer, wird eine ArgumentException ausgelöst; ist dieser Parameter false und ist **path** null, wird eine ArgumentNullException ausgelöst |

## Siehe auch

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
