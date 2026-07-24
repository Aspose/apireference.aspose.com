---
title: "System::IO::Path::CheckPath metod"
linktitle: "CheckPath"
second_title: "Aspose.Page för C++"
description: "System::IO::Path::CheckPath metod. Avgör om den angivna sökvägen är giltig genom att kontrollera om den innehåller ogiltiga tecken. Ett undantag kastas om sökvägen innehåller ogiltiga tecken i C++."
type: docs
weight: 200
url: /sv/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Avgör om den angivna sökvägen är giltig genom att kontrollera om den innehåller ogiltiga tecken. Ett undantag kastas om sökvägen innehåller ogiltiga tecken.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| sökväg | const String\& | Sökvägen att kontrollera |
| msg | const String\& | Meddelandet att skicka till undantagsobjektets konstruktor |
| allow_empty | bool | Anger om en tom eller null-sträng ska betraktas som en korrekt sökväg (true) eller inte (false); om denna parameter är false och **path** är tom kastas ett ArgumentException; om denna parameter är false och **path** är null kastas ett ArgumentNullException. |

## Se även

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
