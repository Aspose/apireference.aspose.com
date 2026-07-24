---
title: "System::IO::File::AppendAllLines metod"
linktitle: "AppendAllLines"
second_title: "Aspose.Page för C++"
description: "System::IO::File::AppendAllLines metod. Lägger till strängar från den angivna samlingen av strängar till den angivna filen med den angivna kodningen genom att skriva varje sträng på en ny rad. Om den angivna filen inte finns skapas den. Filen stängs efter att alla strängar har skrivits i C++."
type: docs
weight: 100
url: /sv/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


Lägger till strängar från den angivna samlingen av strängar till den angivna filen med den angivna kodningen genom att skriva varje sträng på en ny rad. Om den angivna filen inte finns skapas den. Filen stängs efter att alla strängar har skrivits.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| sökväg | const String\& | Sökvägen till filen som strängarna ska läggas till i |
| innehåll | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Strängarna att skriva till filen |
| kodning | const EncodingPtr\& | Teckenkodningen som ska användas |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
