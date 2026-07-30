---
title: "System::Reflection::BindingFlags‑Enum"
linktitle: "BindingFlags"
second_title: "Aspose.Font für C++"
description: "System::Reflection::BindingFlags‑Enum. Definiert Mitglieder- und Typensuchmodi sowie Bindungen in C++."
type: docs
weight: 1100
url: /de/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


Definiert Mitglieder- und Typensuchmodi sowie Bindungen.

```cpp
enum class BindingFlags
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Standard | 0 | Keine besonderen Optionen. |
| IgnoreCase | 1 | Ignoriere Groß-/Kleinschreibung des Namens bei der Suche nach dem Element. |
| DeclaredOnly | 2 | Nur nach Mitgliedern suchen, die im Typ deklariert sind und nicht in Basistypen. |
| Instance | 4 | Durchsuche Instanzmitglieder. |
| Static | 8 | Durchsuche statische Mitglieder. |
| Public | 16 | Durchsuche öffentliche Mitglieder. |
| NonPublic | 32 | Durchsuche nicht-öffentliche Mitglieder. |
| FlattenHierarchy | 64 | Durchsuche öffentliche und geschützte statische Mitglieder des Basistyps. |
| InvokeMethod | 256 | Ruft die Methode auf. |
| CreateInstance | 512 | Erstellt eine Instanz des reflektierten Typs. |
| GetField | 1024 | Liest den Feldwert. |
| SetField | 2048 | Setzt den Feldwert. |
| GetProperty | 4096 | Liest den Eigenschaftswert. |
| SetProperty | 8192 | Setzt den Eigenschaftswert. |
| PutDispProperty | 16384 | Setzt COM-Eigenschaft. |
| PutRefDispProperty | 32768 | Setzt COM-Referenzeigenschaft. |
| ExactBinding | 65536 | Der Typbindung muss exakt sein, ohne jegliche Typänderungen. |
| SuppressChangeType | 131072 | Nicht unterstützt. |
| OptionalParamBinding | 262144 | Wählt die Überladung basierend auf der Anzahl der Argumente aus. |
| IgnoreReturn | 16777216 | Ignoriert den Rückgabewert der COM-Interop. |

## Siehe auch

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
