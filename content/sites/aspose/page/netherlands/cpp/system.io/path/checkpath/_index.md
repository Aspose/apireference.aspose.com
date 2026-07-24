---
title: "System::IO::Path::CheckPath methode"
linktitle: "CheckPath"
second_title: "Aspose.Page voor C++"
description: "System::IO::Path::CheckPath methode. Bepaalt of het opgegeven pad geldig is door te controleren of het ongeldige tekens bevat. Er wordt een uitzondering gegooid als het pad ongeldige tekens bevat in C++."
type: docs
weight: 200
url: /nl/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


Bepaalt of het opgegeven pad geldig is door te controleren of het ongeldige tekens bevat. Er wordt een uitzondering gegooid als het pad ongeldige tekens bevat.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Het pad om te controleren |
| msg | const String\& | Het bericht dat moet worden doorgegeven aan de constructor van het exceptie‑object |
| allow_empty | bool | Specificeert of een lege of null‑string als een geldig pad moet worden beschouwd (true) of niet (false); als deze parameter false is en **path** leeg is, wordt een ArgumentException gegooid; als deze parameter false is en **path** null is, wordt een ArgumentNullException gegooid |

## Zie ook

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
