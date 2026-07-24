---
title: "Aspose::Page::Metered::SetMeteredKey Methode"
linktitle: "SetMeteredKey"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::Metered::SetMeteredKey Methode. Setzt den gemessenen öffentlichen und privaten Schlüssel. Wenn Sie eine gemessene Lizenz erwerben, sollte diese API beim Start der Anwendung aufgerufen werden; normalerweise reicht das aus. Wenn jedoch ständig das Hochladen von Verbrauchsdaten fehlschlägt und 24 Stunden überschritten werden, wird die Lizenz auf den Evaluierungsstatus gesetzt. Um einen solchen Fall zu vermeiden, sollten Sie den Lizenzstatus regelmäßig überprüfen; ist er im Evaluierungsstatus, rufen Sie diese API erneut in C++ auf."
type: docs
weight: 200
url: /de/cpp/aspose.page/metered/setmeteredkey/
---
## Metered::SetMeteredKey method


Setzt den öffentlichen und privaten Messschlüssel. Wenn Sie eine Messlizenz erwerben, sollte diese API beim Start der Anwendung aufgerufen werden; normalerweise reicht das aus. Wenn jedoch das Hochladen der Verbrauchsdaten ständig fehlschlägt und 24 Stunden überschreitet, wird die Lizenz auf den Evaluierungsstatus gesetzt. Um einen solchen Fall zu vermeiden, sollten Sie den Lizenzstatus regelmäßig prüfen und bei Evaluierungsstatus diese API erneut aufrufen.

```cpp
void Aspose::Page::Metered::SetMeteredKey(System::String publicKey, System::String privateKey)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| publicKey | System::String | öffentlicher Schlüssel |
| privateKey | System::String | privater Schlüssel |

## Siehe auch

* Class [String](../../../system/string/)
* Class [Metered](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
