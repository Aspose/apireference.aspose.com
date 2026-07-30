---
title: "System::Char::ConvertToUtf32-Methode"
linktitle: "ConvertToUtf32"
second_title: "Aspose.Font für C++"
description: "System::Char::ConvertToUtf32-Methode. Konvertiert das angegebene UTF-16-Surrogatpaar in eine UTF-32-Codeeinheit in C++."
type: docs
weight: 200
url: /de/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


Konvertiert das angegebene UTF-16-Surrogatpaar in eine UTF-32-Codeeinheit.

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| highSurrogate | char_t | Der High-Surrogate des zu konvertierenden UTF-16-Surrogatpaars |
| lowSurrogate | char_t | Der Low-Surrogate des zu konvertierenden UTF-16-Surrogatpaars |

### ReturnValue

Eine UTF-32-Codeeinheit, die aus der Konvertierung resultiert

## Siehe auch

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


Konvertiert den Wert eines UTF-16-codierten Zeichens oder Surrogatpaars an einer angegebenen Position in einem String in eine UTF-32-Codeeinheit.

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | Eine Zeichenkette, die ein Zeichen oder ein Surrogatpaar enthält |
| Index | int | Die Indexposition des Zeichens oder Surrogatpaars in der angegebenen Zeichenkette |

### ReturnValue

Eine UTF-32-Codeeinheit, die aus der Konvertierung resultiert

## Siehe auch

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
